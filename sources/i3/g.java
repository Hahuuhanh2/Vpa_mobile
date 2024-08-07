package i3;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.transition.R$id;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

@SuppressLint({"ViewConstructor"})
/* compiled from: GhostViewPort */
public final class g extends ViewGroup implements e {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f11038n = 0;

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f11039a;

    /* renamed from: b  reason: collision with root package name */
    public View f11040b;

    /* renamed from: c  reason: collision with root package name */
    public final View f11041c;

    /* renamed from: d  reason: collision with root package name */
    public int f11042d;

    /* renamed from: e  reason: collision with root package name */
    public Matrix f11043e;

    /* renamed from: f  reason: collision with root package name */
    public final a f11044f = new a();

    /* compiled from: GhostViewPort */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        public final boolean onPreDraw() {
            View view;
            g gVar = g.this;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.d.k(gVar);
            g gVar2 = g.this;
            ViewGroup viewGroup = gVar2.f11039a;
            if (viewGroup == null || (view = gVar2.f11040b) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            d0.d.k(g.this.f11039a);
            g gVar3 = g.this;
            gVar3.f11039a = null;
            gVar3.f11040b = null;
            return true;
        }
    }

    public g(View view) {
        super(view.getContext());
        this.f11041c = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, (Paint) null);
    }

    public static void a(View view, ViewGroup viewGroup) {
        r.a(viewGroup, viewGroup.getLeft(), viewGroup.getTop(), view.getWidth() + viewGroup.getLeft(), view.getHeight() + viewGroup.getTop());
    }

    public final void b(ViewGroup viewGroup, View view) {
        this.f11039a = viewGroup;
        this.f11040b = view;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11041c.setTag(R$id.ghost_view, this);
        this.f11041c.getViewTreeObserver().addOnPreDrawListener(this.f11044f);
        r.c(4, this.f11041c);
        if (this.f11041c.getParent() != null) {
            ((View) this.f11041c.getParent()).invalidate();
        }
    }

    public final void onDetachedFromWindow() {
        this.f11041c.getViewTreeObserver().removeOnPreDrawListener(this.f11044f);
        r.c(0, this.f11041c);
        this.f11041c.setTag(R$id.ghost_view, (Object) null);
        if (this.f11041c.getParent() != null) {
            ((View) this.f11041c.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    public final void onDraw(Canvas canvas) {
        a.a(canvas, true);
        canvas.setMatrix(this.f11043e);
        r.c(0, this.f11041c);
        this.f11041c.invalidate();
        r.c(4, this.f11041c);
        drawChild(canvas, this.f11041c, getDrawingTime());
        a.a(canvas, false);
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setVisibility(int i10) {
        int i11;
        super.setVisibility(i10);
        if (((g) this.f11041c.getTag(R$id.ghost_view)) == this) {
            if (i10 == 0) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            r.c(i11, this.f11041c);
        }
    }
}
