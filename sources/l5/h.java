package l5;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.R$id;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import k5.d;

@Deprecated
/* compiled from: ViewTarget */
public abstract class h<T extends View, Z> extends a<Z> {

    /* renamed from: c  reason: collision with root package name */
    public static int f12705c = R$id.glide_custom_view_target_tag;

    /* renamed from: a  reason: collision with root package name */
    public final T f12706a;

    /* renamed from: b  reason: collision with root package name */
    public final a f12707b;

    /* compiled from: ViewTarget */
    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        public static Integer f12708d;

        /* renamed from: a  reason: collision with root package name */
        public final View f12709a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f12710b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public C0155a f12711c;

        /* renamed from: l5.h$a$a  reason: collision with other inner class name */
        /* compiled from: ViewTarget */
        public static final class C0155a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a  reason: collision with root package name */
            public final WeakReference<a> f12712a;

            public C0155a(a aVar) {
                this.f12712a = new WeakReference<>(aVar);
            }

            public final boolean onPreDraw() {
                boolean z10;
                boolean z11;
                Log.isLoggable("ViewTarget", 2);
                a aVar = this.f12712a.get();
                if (aVar != null && !aVar.f12710b.isEmpty()) {
                    int c10 = aVar.c();
                    int b10 = aVar.b();
                    boolean z12 = false;
                    if (c10 > 0 || c10 == Integer.MIN_VALUE) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        if (b10 > 0 || b10 == Integer.MIN_VALUE) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            z12 = true;
                        }
                    }
                    if (z12) {
                        Iterator it = new ArrayList(aVar.f12710b).iterator();
                        while (it.hasNext()) {
                            ((f) it.next()).b(c10, b10);
                        }
                        ViewTreeObserver viewTreeObserver = aVar.f12709a.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnPreDrawListener(aVar.f12711c);
                        }
                        aVar.f12711c = null;
                        aVar.f12710b.clear();
                    }
                }
                return true;
            }
        }

        public a(View view) {
            this.f12709a = view;
        }

        public final int a(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f12709a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            Log.isLoggable("ViewTarget", 4);
            Context context = this.f12709a.getContext();
            if (f12708d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                j7.a.r(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f12708d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f12708d.intValue();
        }

        public final int b() {
            int i10;
            int paddingBottom = this.f12709a.getPaddingBottom() + this.f12709a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.f12709a.getLayoutParams();
            if (layoutParams != null) {
                i10 = layoutParams.height;
            } else {
                i10 = 0;
            }
            return a(this.f12709a.getHeight(), i10, paddingBottom);
        }

        public final int c() {
            int i10;
            int paddingRight = this.f12709a.getPaddingRight() + this.f12709a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.f12709a.getLayoutParams();
            if (layoutParams != null) {
                i10 = layoutParams.width;
            } else {
                i10 = 0;
            }
            return a(this.f12709a.getWidth(), i10, paddingRight);
        }
    }

    public h(T t10) {
        j7.a.r(t10);
        this.f12706a = t10;
        this.f12707b = new a(t10);
    }

    public final void c(f fVar) {
        this.f12707b.f12710b.remove(fVar);
    }

    public final void d(d dVar) {
        this.f12706a.setTag(f12705c, dVar);
    }

    public final d i() {
        Object tag = this.f12706a.getTag(f12705c);
        if (tag == null) {
            return null;
        }
        if (tag instanceof d) {
            return (d) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public void j(Drawable drawable) {
        a aVar = this.f12707b;
        ViewTreeObserver viewTreeObserver = aVar.f12709a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(aVar.f12711c);
        }
        aVar.f12711c = null;
        aVar.f12710b.clear();
    }

    public final void k(f fVar) {
        boolean z10;
        boolean z11;
        a aVar = this.f12707b;
        int c10 = aVar.c();
        int b10 = aVar.b();
        boolean z12 = false;
        if (c10 > 0 || c10 == Integer.MIN_VALUE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (b10 > 0 || b10 == Integer.MIN_VALUE) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                z12 = true;
            }
        }
        if (z12) {
            fVar.b(c10, b10);
            return;
        }
        if (!aVar.f12710b.contains(fVar)) {
            aVar.f12710b.add(fVar);
        }
        if (aVar.f12711c == null) {
            ViewTreeObserver viewTreeObserver = aVar.f12709a.getViewTreeObserver();
            a.C0155a aVar2 = new a.C0155a(aVar);
            aVar.f12711c = aVar2;
            viewTreeObserver.addOnPreDrawListener(aVar2);
        }
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("Target for: ");
        q10.append(this.f12706a);
        return q10.toString();
    }
}
