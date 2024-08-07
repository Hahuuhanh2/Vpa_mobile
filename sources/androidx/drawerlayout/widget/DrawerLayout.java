package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.R$attr;
import androidx.drawerlayout.R$dimen;
import androidx.drawerlayout.R$styleable;
import c2.c;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;
import w1.w0;
import x1.f;
import x1.j;

public class DrawerLayout extends ViewGroup {
    public static final int[] S = {16843828};
    public static final int[] T = {16842931};
    public static final boolean U = true;
    public static final boolean V = true;
    public static boolean W;
    public ArrayList A;
    public float B;
    public float C;
    public Drawable D;
    public Drawable E;
    public Drawable F;
    public CharSequence G;
    public CharSequence H;
    public Object I;
    public boolean J;
    public Drawable K;
    public Drawable L;
    public Drawable M;
    public Drawable N;
    public final ArrayList<View> O;
    public Rect P;
    public Matrix Q;
    public final a R;

    /* renamed from: a  reason: collision with root package name */
    public final d f2339a;

    /* renamed from: b  reason: collision with root package name */
    public float f2340b;

    /* renamed from: c  reason: collision with root package name */
    public int f2341c;

    /* renamed from: d  reason: collision with root package name */
    public int f2342d;

    /* renamed from: e  reason: collision with root package name */
    public float f2343e;

    /* renamed from: f  reason: collision with root package name */
    public Paint f2344f;

    /* renamed from: n  reason: collision with root package name */
    public final c2.c f2345n;

    /* renamed from: o  reason: collision with root package name */
    public final c2.c f2346o;

    /* renamed from: p  reason: collision with root package name */
    public final g f2347p;

    /* renamed from: q  reason: collision with root package name */
    public final g f2348q;

    /* renamed from: r  reason: collision with root package name */
    public int f2349r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2350s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2351t;

    /* renamed from: u  reason: collision with root package name */
    public int f2352u;

    /* renamed from: v  reason: collision with root package name */
    public int f2353v;

    /* renamed from: w  reason: collision with root package name */
    public int f2354w;

    /* renamed from: x  reason: collision with root package name */
    public int f2355x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f2356y;

    /* renamed from: z  reason: collision with root package name */
    public e f2357z;

    public class a implements j {
        public a() {
        }

        public final boolean a(View view) {
            DrawerLayout.this.getClass();
            if (!DrawerLayout.k(view) || DrawerLayout.this.g(view) == 2) {
                return false;
            }
            DrawerLayout.this.b(view, true);
            return true;
        }
    }

    public class b implements View.OnApplyWindowInsetsListener {
        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            boolean z10;
            DrawerLayout drawerLayout = (DrawerLayout) view;
            if (windowInsets.getSystemWindowInsetTop() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            drawerLayout.setChildInsets(windowInsets, z10);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    public class c extends w1.a {

        /* renamed from: d  reason: collision with root package name */
        public final Rect f2368d = new Rect();

        public c() {
        }

        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence charSequence;
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View f10 = DrawerLayout.this.f();
            if (f10 == null) {
                return true;
            }
            int h10 = DrawerLayout.this.h(f10);
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            int absoluteGravity = Gravity.getAbsoluteGravity(h10, d0.e.d(drawerLayout));
            if (absoluteGravity == 3) {
                charSequence = drawerLayout.G;
            } else if (absoluteGravity == 5) {
                charSequence = drawerLayout.H;
            } else {
                charSequence = null;
            }
            if (charSequence == null) {
                return true;
            }
            text.add(charSequence);
            return true;
        }

        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        public final void d(View view, x1.f fVar) {
            if (DrawerLayout.U) {
                this.f16280a.onInitializeAccessibilityNodeInfo(view, fVar.f16862a);
            } else {
                AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(fVar.f16862a);
                this.f16280a.onInitializeAccessibilityNodeInfo(view, obtain);
                fVar.f16864c = -1;
                fVar.f16862a.setSource(view);
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                ViewParent f10 = d0.d.f(view);
                if (f10 instanceof View) {
                    fVar.f16863b = -1;
                    fVar.f16862a.setParent((View) f10);
                }
                Rect rect = this.f2368d;
                obtain.getBoundsInScreen(rect);
                fVar.f16862a.setBoundsInScreen(rect);
                fVar.f16862a.setVisibleToUser(obtain.isVisibleToUser());
                fVar.f16862a.setPackageName(obtain.getPackageName());
                fVar.i(obtain.getClassName());
                fVar.k(obtain.getContentDescription());
                fVar.f16862a.setEnabled(obtain.isEnabled());
                fVar.f16862a.setFocused(obtain.isFocused());
                fVar.f16862a.setAccessibilityFocused(obtain.isAccessibilityFocused());
                fVar.f16862a.setSelected(obtain.isSelected());
                fVar.a(obtain.getActions());
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (DrawerLayout.i(childAt)) {
                        fVar.f16862a.addChild(childAt);
                    }
                }
            }
            fVar.i("androidx.drawerlayout.widget.DrawerLayout");
            fVar.f16862a.setFocusable(false);
            fVar.f16862a.setFocused(false);
            fVar.f16862a.removeAction((AccessibilityNodeInfo.AccessibilityAction) f.a.f16865e.f16876a);
            fVar.f16862a.removeAction((AccessibilityNodeInfo.AccessibilityAction) f.a.f16866f.f16876a);
        }

        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.U || DrawerLayout.i(view)) {
                return super.f(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    public static final class d extends w1.a {
        public final void d(View view, x1.f fVar) {
            this.f16280a.onInitializeAccessibilityNodeInfo(view, fVar.f16862a);
            if (!DrawerLayout.i(view)) {
                fVar.f16863b = -1;
                fVar.f16862a.setParent((View) null);
            }
        }
    }

    public interface e {
        void a();

        void b();

        void c(View view);

        void d(View view);
    }

    public static abstract class f implements e {
        public final void a() {
        }

        public final void b() {
        }
    }

    public class g extends c.C0048c {

        /* renamed from: a  reason: collision with root package name */
        public final int f2370a;

        /* renamed from: b  reason: collision with root package name */
        public c2.c f2371b;

        /* renamed from: c  reason: collision with root package name */
        public final a f2372c = new a();

        public class a implements Runnable {
            public a() {
            }

            public final void run() {
                boolean z10;
                int i10;
                View view;
                int i11;
                g gVar = g.this;
                int i12 = gVar.f2371b.f4544o;
                int i13 = 3;
                if (gVar.f2370a == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    view = DrawerLayout.this.d(3);
                    if (view != null) {
                        i11 = -view.getWidth();
                    } else {
                        i11 = 0;
                    }
                    i10 = i11 + i12;
                } else {
                    view = DrawerLayout.this.d(5);
                    i10 = DrawerLayout.this.getWidth() - i12;
                }
                if (view == null) {
                    return;
                }
                if (((z10 && view.getLeft() < i10) || (!z10 && view.getLeft() > i10)) && DrawerLayout.this.g(view) == 0) {
                    gVar.f2371b.u(view, i10, view.getTop());
                    ((LayoutParams) view.getLayoutParams()).f2360c = true;
                    DrawerLayout.this.invalidate();
                    if (gVar.f2370a == 3) {
                        i13 = 5;
                    }
                    View d10 = DrawerLayout.this.d(i13);
                    if (d10 != null) {
                        DrawerLayout.this.b(d10, true);
                    }
                    DrawerLayout drawerLayout = DrawerLayout.this;
                    if (!drawerLayout.f2356y) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        int childCount = drawerLayout.getChildCount();
                        for (int i14 = 0; i14 < childCount; i14++) {
                            drawerLayout.getChildAt(i14).dispatchTouchEvent(obtain);
                        }
                        obtain.recycle();
                        drawerLayout.f2356y = true;
                    }
                }
            }
        }

        public g(int i10) {
            this.f2370a = i10;
        }

        public final int a(View view, int i10) {
            if (DrawerLayout.this.a(3, view)) {
                return Math.max(-view.getWidth(), Math.min(i10, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i10, width));
        }

        public final int b(View view, int i10) {
            return view.getTop();
        }

        public final int c(View view) {
            DrawerLayout.this.getClass();
            if (DrawerLayout.l(view)) {
                return view.getWidth();
            }
            return 0;
        }

        public final void e(int i10, int i11) {
            View view;
            if ((i10 & 1) == 1) {
                view = DrawerLayout.this.d(3);
            } else {
                view = DrawerLayout.this.d(5);
            }
            if (view != null && DrawerLayout.this.g(view) == 0) {
                this.f2371b.c(i11, view);
            }
        }

        public final void f(int i10) {
            DrawerLayout.this.postDelayed(this.f2372c, 160);
        }

        public final void g(int i10, View view) {
            ((LayoutParams) view.getLayoutParams()).f2360c = false;
            int i11 = 3;
            if (this.f2370a == 3) {
                i11 = 5;
            }
            View d10 = DrawerLayout.this.d(i11);
            if (d10 != null) {
                DrawerLayout.this.b(d10, true);
            }
        }

        public final void h(int i10) {
            DrawerLayout.this.r(i10, this.f2371b.f4549t);
        }

        public final void i(View view, int i10, int i11) {
            float f10;
            int i12;
            int width = view.getWidth();
            if (DrawerLayout.this.a(3, view)) {
                f10 = (float) (i10 + width);
            } else {
                f10 = (float) (DrawerLayout.this.getWidth() - i10);
            }
            float f11 = f10 / ((float) width);
            DrawerLayout.this.o(view, f11);
            if (f11 == 0.0f) {
                i12 = 4;
            } else {
                i12 = 0;
            }
            view.setVisibility(i12);
            DrawerLayout.this.invalidate();
        }

        public final void j(View view, float f10, float f11) {
            int i10;
            DrawerLayout.this.getClass();
            float f12 = ((LayoutParams) view.getLayoutParams()).f2359b;
            int width = view.getWidth();
            if (DrawerLayout.this.a(3, view)) {
                int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                if (i11 > 0 || (i11 == 0 && f12 > 0.5f)) {
                    i10 = 0;
                } else {
                    i10 = -width;
                }
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f10 < 0.0f || (f10 == 0.0f && f12 > 0.5f)) {
                    width2 -= width;
                }
                i10 = width2;
            }
            this.f2371b.s(i10, view.getTop());
            DrawerLayout.this.invalidate();
        }

        public final boolean k(int i10, View view) {
            DrawerLayout.this.getClass();
            if (!DrawerLayout.l(view) || !DrawerLayout.this.a(this.f2370a, view) || DrawerLayout.this.g(view) != 0) {
                return false;
            }
            return true;
        }
    }

    static {
        boolean z10 = true;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29) {
            z10 = false;
        }
        W = z10;
    }

    public DrawerLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public static boolean i(View view) {
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (d0.d.c(view) == 4 || d0.d.c(view) == 2) {
            return false;
        }
        return true;
    }

    public static boolean j(View view) {
        if (((LayoutParams) view.getLayoutParams()).f2358a == 0) {
            return true;
        }
        return false;
    }

    public static boolean k(View view) {
        if (!l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        } else if ((((LayoutParams) view.getLayoutParams()).f2361d & 1) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean l(View view) {
        int i10 = ((LayoutParams) view.getLayoutParams()).f2358a;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, d0.e.d(view));
        if ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) {
            return false;
        }
        return true;
    }

    public final boolean a(int i10, View view) {
        if ((h(view) & i10) == i10) {
            return true;
        }
        return false;
    }

    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z10 = false;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (!l(childAt)) {
                    this.O.add(childAt);
                } else if (k(childAt)) {
                    childAt.addFocusables(arrayList, i10, i11);
                    z10 = true;
                }
            }
            if (!z10) {
                int size = this.O.size();
                for (int i13 = 0; i13 < size; i13++) {
                    View view = this.O.get(i13);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i10, i11);
                    }
                }
            }
            this.O.clear();
        }
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (e() != null || l(view)) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.d.s(view, 4);
        } else {
            WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
            d0.d.s(view, 1);
        }
        if (!U) {
            d0.o(view, this.f2339a);
        }
    }

    public final void b(View view, boolean z10) {
        if (l(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f2351t) {
                layoutParams.f2359b = 0.0f;
                layoutParams.f2361d = 0;
            } else if (z10) {
                layoutParams.f2361d |= 4;
                if (a(3, view)) {
                    this.f2345n.u(view, -view.getWidth(), view.getTop());
                } else {
                    this.f2346o.u(view, getWidth(), view.getTop());
                }
            } else {
                float f10 = ((LayoutParams) view.getLayoutParams()).f2359b;
                float width = (float) view.getWidth();
                int i10 = ((int) (width * 0.0f)) - ((int) (f10 * width));
                if (!a(3, view)) {
                    i10 = -i10;
                }
                view.offsetLeftAndRight(i10);
                o(view, 0.0f);
                r(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public final void c(boolean z10) {
        boolean z11;
        int childCount = getChildCount();
        boolean z12 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (l(childAt) && (!z10 || layoutParams.f2360c)) {
                int width = childAt.getWidth();
                if (a(3, childAt)) {
                    z11 = this.f2345n.u(childAt, -width, childAt.getTop());
                } else {
                    z11 = this.f2346o.u(childAt, getWidth(), childAt.getTop());
                }
                z12 |= z11;
                layoutParams.f2360c = false;
            }
        }
        g gVar = this.f2347p;
        DrawerLayout.this.removeCallbacks(gVar.f2372c);
        g gVar2 = this.f2348q;
        DrawerLayout.this.removeCallbacks(gVar2.f2372c);
        if (z12) {
            invalidate();
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public final void computeScroll() {
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            f10 = Math.max(f10, ((LayoutParams) getChildAt(i10).getLayoutParams()).f2359b);
        }
        this.f2343e = f10;
        boolean h10 = this.f2345n.h();
        boolean h11 = this.f2346o.h();
        if (h10 || h11) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.d.k(this);
        }
    }

    public final View d(int i10) {
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, d0.e.d(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((h(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean z10;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f2343e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt = getChildAt(i10);
            if (this.P == null) {
                this.P = new Rect();
            }
            childAt.getHitRect(this.P);
            if (this.P.contains((int) x10, (int) y10) && !j(childAt)) {
                if (!childAt.getMatrix().isIdentity()) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation((float) (getScrollX() - childAt.getLeft()), (float) (getScrollY() - childAt.getTop()));
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.Q == null) {
                            this.Q = new Matrix();
                        }
                        matrix.invert(this.Q);
                        obtain.transform(this.Q);
                    }
                    z10 = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                } else {
                    float scrollX = (float) (getScrollX() - childAt.getLeft());
                    float scrollY = (float) (getScrollY() - childAt.getTop());
                    motionEvent.offsetLocation(scrollX, scrollY);
                    z10 = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean j11 = j(view);
        int width = getWidth();
        int save = canvas.save();
        int i10 = 0;
        if (j11) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view2 && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if (background == null || background.getOpacity() != -1) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10 && l(childAt) && childAt.getHeight() >= height) {
                        if (a(3, childAt)) {
                            int right = childAt.getRight();
                            if (right > i11) {
                                i11 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas2.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas2.restoreToCount(save);
        float f10 = this.f2343e;
        if (f10 > 0.0f && j11) {
            int i13 = this.f2342d;
            this.f2344f.setColor((i13 & 16777215) | (((int) (((float) ((-16777216 & i13) >>> 24)) * f10)) << 24));
            canvas.drawRect((float) i10, 0.0f, (float) width, (float) getHeight(), this.f2344f);
        } else if (this.E != null && a(3, view2)) {
            int intrinsicWidth = this.E.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.f2345n.f4544o), 1.0f));
            this.E.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.E.setAlpha((int) (max * 255.0f));
            this.E.draw(canvas2);
        } else if (this.F != null && a(5, view2)) {
            int intrinsicWidth2 = this.F.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.f2346o.f4544o), 1.0f));
            this.F.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.F.setAlpha((int) (max2 * 255.0f));
            this.F.draw(canvas2);
        }
        return drawChild;
    }

    public final View e() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((LayoutParams) childAt.getLayoutParams()).f2361d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public final View f() {
        boolean z10;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (l(childAt)) {
                if (l(childAt)) {
                    if (((LayoutParams) childAt.getLayoutParams()).f2359b > 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        return childAt;
                    }
                } else {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
            }
        }
        return null;
    }

    public final int g(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (l(view)) {
            int i14 = ((LayoutParams) view.getLayoutParams()).f2358a;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            int d10 = d0.e.d(this);
            if (i14 == 3) {
                int i15 = this.f2352u;
                if (i15 != 3) {
                    return i15;
                }
                if (d10 == 0) {
                    i10 = this.f2354w;
                } else {
                    i10 = this.f2355x;
                }
                if (i10 != 3) {
                    return i10;
                }
            } else if (i14 == 5) {
                int i16 = this.f2353v;
                if (i16 != 3) {
                    return i16;
                }
                if (d10 == 0) {
                    i11 = this.f2355x;
                } else {
                    i11 = this.f2354w;
                }
                if (i11 != 3) {
                    return i11;
                }
            } else if (i14 == 8388611) {
                int i17 = this.f2354w;
                if (i17 != 3) {
                    return i17;
                }
                if (d10 == 0) {
                    i12 = this.f2352u;
                } else {
                    i12 = this.f2353v;
                }
                if (i12 != 3) {
                    return i12;
                }
            } else if (i14 == 8388613) {
                int i18 = this.f2355x;
                if (i18 != 3) {
                    return i18;
                }
                if (d10 == 0) {
                    i13 = this.f2353v;
                } else {
                    i13 = this.f2352u;
                }
                if (i13 != 3) {
                    return i13;
                }
            }
            return 0;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public float getDrawerElevation() {
        if (V) {
            return this.f2340b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.D;
    }

    public final int h(View view) {
        int i10 = ((LayoutParams) view.getLayoutParams()).f2358a;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        return Gravity.getAbsoluteGravity(i10, d0.e.d(this));
    }

    public final void m(View view) {
        if (l(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f2351t) {
                layoutParams.f2359b = 1.0f;
                layoutParams.f2361d = 1;
                q(view, true);
                p(view);
            } else {
                layoutParams.f2361d |= 2;
                if (a(3, view)) {
                    this.f2345n.u(view, 0, view.getTop());
                } else {
                    this.f2346o.u(view, getWidth() - view.getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n() {
        /*
            r3 = this;
            boolean r0 = V
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            java.util.WeakHashMap<android.view.View, w1.q0> r0 = w1.d0.f16298a
            int r0 = w1.d0.e.d(r3)
            if (r0 != 0) goto L_0x001d
            android.graphics.drawable.Drawable r1 = r3.K
            if (r1 == 0) goto L_0x002d
            boolean r2 = o1.a.C0166a.d(r1)
            if (r2 == 0) goto L_0x001a
            o1.a.c.b(r1, r0)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r3.K
            goto L_0x002f
        L_0x001d:
            android.graphics.drawable.Drawable r1 = r3.L
            if (r1 == 0) goto L_0x002d
            boolean r2 = o1.a.C0166a.d(r1)
            if (r2 == 0) goto L_0x002a
            o1.a.c.b(r1, r0)
        L_0x002a:
            android.graphics.drawable.Drawable r0 = r3.L
            goto L_0x002f
        L_0x002d:
            android.graphics.drawable.Drawable r0 = r3.M
        L_0x002f:
            r3.E = r0
            int r0 = w1.d0.e.d(r3)
            if (r0 != 0) goto L_0x0047
            android.graphics.drawable.Drawable r1 = r3.L
            if (r1 == 0) goto L_0x0057
            boolean r2 = o1.a.C0166a.d(r1)
            if (r2 == 0) goto L_0x0044
            o1.a.c.b(r1, r0)
        L_0x0044:
            android.graphics.drawable.Drawable r0 = r3.L
            goto L_0x0059
        L_0x0047:
            android.graphics.drawable.Drawable r1 = r3.K
            if (r1 == 0) goto L_0x0057
            boolean r2 = o1.a.C0166a.d(r1)
            if (r2 == 0) goto L_0x0054
            o1.a.c.b(r1, r0)
        L_0x0054:
            android.graphics.drawable.Drawable r0 = r3.K
            goto L_0x0059
        L_0x0057:
            android.graphics.drawable.Drawable r0 = r3.N
        L_0x0059:
            r3.F = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.n():void");
    }

    public final void o(View view, float f10) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f10 != layoutParams.f2359b) {
            layoutParams.f2359b = f10;
            ArrayList arrayList = this.A;
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((e) this.A.get(size)).b();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2351t = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2351t = true;
    }

    public final void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        if (this.J && this.D != null) {
            Object obj = this.I;
            if (obj != null) {
                i10 = ((WindowInsets) obj).getSystemWindowInsetTop();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                this.D.setBounds(0, 0, getWidth(), i10);
                this.D.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r0 != 3) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057 A[LOOP:0: B:8:0x0024->B:20:0x0057, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0055 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            c2.c r1 = r8.f2345n
            boolean r1 = r1.t(r9)
            c2.c r2 = r8.f2346o
            boolean r2 = r2.t(r9)
            r1 = r1 | r2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0077
            if (r0 == r3) goto L_0x0070
            r9 = 2
            if (r0 == r9) goto L_0x001e
            r9 = 3
            if (r0 == r9) goto L_0x0070
            goto L_0x0075
        L_0x001e:
            c2.c r9 = r8.f2345n
            float[] r0 = r9.f4533d
            int r0 = r0.length
            r4 = r2
        L_0x0024:
            if (r4 >= r0) goto L_0x005a
            int r5 = r9.f4540k
            int r6 = r3 << r4
            r5 = r5 & r6
            if (r5 == 0) goto L_0x002f
            r5 = r3
            goto L_0x0030
        L_0x002f:
            r5 = r2
        L_0x0030:
            if (r5 != 0) goto L_0x0033
            goto L_0x0052
        L_0x0033:
            float[] r5 = r9.f4535f
            r5 = r5[r4]
            float[] r6 = r9.f4533d
            r6 = r6[r4]
            float r5 = r5 - r6
            float[] r6 = r9.f4536g
            r6 = r6[r4]
            float[] r7 = r9.f4534e
            r7 = r7[r4]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r5 = r9.f4531b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0052
            r5 = r3
            goto L_0x0053
        L_0x0052:
            r5 = r2
        L_0x0053:
            if (r5 == 0) goto L_0x0057
            r9 = r3
            goto L_0x005b
        L_0x0057:
            int r4 = r4 + 1
            goto L_0x0024
        L_0x005a:
            r9 = r2
        L_0x005b:
            if (r9 == 0) goto L_0x0075
            androidx.drawerlayout.widget.DrawerLayout$g r9 = r8.f2347p
            androidx.drawerlayout.widget.DrawerLayout r0 = androidx.drawerlayout.widget.DrawerLayout.this
            androidx.drawerlayout.widget.DrawerLayout$g$a r9 = r9.f2372c
            r0.removeCallbacks(r9)
            androidx.drawerlayout.widget.DrawerLayout$g r9 = r8.f2348q
            androidx.drawerlayout.widget.DrawerLayout r0 = androidx.drawerlayout.widget.DrawerLayout.this
            androidx.drawerlayout.widget.DrawerLayout$g$a r9 = r9.f2372c
            r0.removeCallbacks(r9)
            goto L_0x0075
        L_0x0070:
            r8.c(r3)
            r8.f2356y = r2
        L_0x0075:
            r9 = r2
            goto L_0x009f
        L_0x0077:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.B = r0
            r8.C = r9
            float r4 = r8.f2343e
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x009c
            c2.c r4 = r8.f2345n
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r4.j(r0, r9)
            if (r9 == 0) goto L_0x009c
            boolean r9 = j(r9)
            if (r9 == 0) goto L_0x009c
            r9 = r3
            goto L_0x009d
        L_0x009c:
            r9 = r2
        L_0x009d:
            r8.f2356y = r2
        L_0x009f:
            if (r1 != 0) goto L_0x00c4
            if (r9 != 0) goto L_0x00c4
            int r9 = r8.getChildCount()
            r0 = r2
        L_0x00a8:
            if (r0 >= r9) goto L_0x00bd
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r1 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r1
            boolean r1 = r1.f2360c
            if (r1 == 0) goto L_0x00ba
            r9 = r3
            goto L_0x00be
        L_0x00ba:
            int r0 = r0 + 1
            goto L_0x00a8
        L_0x00bd:
            r9 = r2
        L_0x00be:
            if (r9 != 0) goto L_0x00c4
            boolean r9 = r8.f2356y
            if (r9 == 0) goto L_0x00c5
        L_0x00c4:
            r2 = r3
        L_0x00c5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        if (i10 == 4) {
            if (f() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyUp(i10, keyEvent);
        }
        View f10 = f();
        if (f10 != null && g(f10) == 0) {
            c(false);
        }
        if (f10 != null) {
            return true;
        }
        return false;
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WindowInsets rootWindowInsets;
        float f10;
        int i14;
        boolean z11;
        int i15;
        boolean z12 = true;
        this.f2350s = true;
        int i16 = i12 - i10;
        int childCount = getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (j(childAt)) {
                    int i18 = layoutParams.leftMargin;
                    childAt.layout(i18, layoutParams.topMargin, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + layoutParams.topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(3, childAt)) {
                        float f11 = (float) measuredWidth;
                        i14 = (-measuredWidth) + ((int) (layoutParams.f2359b * f11));
                        f10 = ((float) (measuredWidth + i14)) / f11;
                    } else {
                        float f12 = (float) measuredWidth;
                        int i19 = i16 - ((int) (layoutParams.f2359b * f12));
                        f10 = ((float) (i16 - i19)) / f12;
                        i14 = i19;
                    }
                    if (f10 != layoutParams.f2359b) {
                        z11 = z12;
                    } else {
                        z11 = false;
                    }
                    int i20 = layoutParams.f2358a & 112;
                    if (i20 == 16) {
                        int i21 = i13 - i11;
                        int i22 = (i21 - measuredHeight) / 2;
                        int i23 = layoutParams.topMargin;
                        if (i22 < i23) {
                            i22 = i23;
                        } else {
                            int i24 = i22 + measuredHeight;
                            int i25 = i21 - layoutParams.bottomMargin;
                            if (i24 > i25) {
                                i22 = i25 - measuredHeight;
                            }
                        }
                        childAt.layout(i14, i22, measuredWidth + i14, measuredHeight + i22);
                    } else if (i20 != 80) {
                        int i26 = layoutParams.topMargin;
                        childAt.layout(i14, i26, measuredWidth + i14, measuredHeight + i26);
                    } else {
                        int i27 = i13 - i11;
                        childAt.layout(i14, (i27 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i14, i27 - layoutParams.bottomMargin);
                    }
                    if (z11) {
                        o(childAt, f10);
                    }
                    if (layoutParams.f2359b > 0.0f) {
                        i15 = 0;
                    } else {
                        i15 = 4;
                    }
                    if (childAt.getVisibility() != i15) {
                        childAt.setVisibility(i15);
                    }
                }
            }
            i17++;
            z12 = true;
        }
        if (W && (rootWindowInsets = getRootWindowInsets()) != null) {
            n1.e i28 = w0.i((View) null, rootWindowInsets).f16391a.i();
            c2.c cVar = this.f2345n;
            cVar.f4544o = Math.max(cVar.f4545p, i28.f13427a);
            c2.c cVar2 = this.f2346o;
            cVar2.f4544o = Math.max(cVar2.f4545p, i28.f13429c);
        }
        this.f2350s = false;
        this.f2351t = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            int r1 = android.view.View.MeasureSpec.getMode(r17)
            int r2 = android.view.View.MeasureSpec.getMode(r18)
            int r3 = android.view.View.MeasureSpec.getSize(r17)
            int r4 = android.view.View.MeasureSpec.getSize(r18)
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 300(0x12c, float:4.2E-43)
            if (r1 != r5) goto L_0x001a
            if (r2 == r5) goto L_0x0026
        L_0x001a:
            boolean r5 = r16.isInEditMode()
            if (r5 == 0) goto L_0x01b1
            if (r1 != 0) goto L_0x0023
            r3 = r6
        L_0x0023:
            if (r2 != 0) goto L_0x0026
            r4 = r6
        L_0x0026:
            r0.setMeasuredDimension(r3, r4)
            java.lang.Object r1 = r0.I
            r2 = 0
            if (r1 == 0) goto L_0x0038
            java.util.WeakHashMap<android.view.View, w1.q0> r1 = w1.d0.f16298a
            boolean r1 = w1.d0.d.b(r16)
            if (r1 == 0) goto L_0x0038
            r1 = 1
            goto L_0x0039
        L_0x0038:
            r1 = r2
        L_0x0039:
            java.util.WeakHashMap<android.view.View, w1.q0> r5 = w1.d0.f16298a
            int r5 = w1.d0.e.d(r16)
            int r6 = r16.getChildCount()
            r7 = r2
            r8 = r7
            r9 = r8
        L_0x0046:
            if (r2 >= r6) goto L_0x01b0
            android.view.View r10 = r0.getChildAt(r2)
            int r11 = r10.getVisibility()
            r12 = 8
            if (r11 != r12) goto L_0x0056
            goto L_0x00fd
        L_0x0056:
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r11 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r11
            r12 = 3
            if (r1 == 0) goto L_0x00dc
            int r13 = r11.f2358a
            int r13 = android.view.Gravity.getAbsoluteGravity(r13, r5)
            boolean r14 = w1.d0.d.b(r10)
            if (r14 == 0) goto L_0x0099
            java.lang.Object r14 = r0.I
            android.view.WindowInsets r14 = (android.view.WindowInsets) r14
            if (r13 != r12) goto L_0x0082
            int r12 = r14.getSystemWindowInsetLeft()
            int r13 = r14.getSystemWindowInsetTop()
            int r15 = r14.getSystemWindowInsetBottom()
            android.view.WindowInsets r14 = r14.replaceSystemWindowInsets(r12, r13, r7, r15)
            goto L_0x0095
        L_0x0082:
            r12 = 5
            if (r13 != r12) goto L_0x0095
            int r12 = r14.getSystemWindowInsetTop()
            int r13 = r14.getSystemWindowInsetRight()
            int r15 = r14.getSystemWindowInsetBottom()
            android.view.WindowInsets r14 = r14.replaceSystemWindowInsets(r7, r12, r13, r15)
        L_0x0095:
            r10.dispatchApplyWindowInsets(r14)
            goto L_0x00dc
        L_0x0099:
            java.lang.Object r12 = r0.I
            android.view.WindowInsets r12 = (android.view.WindowInsets) r12
            r14 = 3
            if (r13 != r14) goto L_0x00b1
            int r13 = r12.getSystemWindowInsetLeft()
            int r14 = r12.getSystemWindowInsetTop()
            int r15 = r12.getSystemWindowInsetBottom()
            android.view.WindowInsets r12 = r12.replaceSystemWindowInsets(r13, r14, r7, r15)
            goto L_0x00c4
        L_0x00b1:
            r14 = 5
            if (r13 != r14) goto L_0x00c4
            int r13 = r12.getSystemWindowInsetTop()
            int r14 = r12.getSystemWindowInsetRight()
            int r15 = r12.getSystemWindowInsetBottom()
            android.view.WindowInsets r12 = r12.replaceSystemWindowInsets(r7, r13, r14, r15)
        L_0x00c4:
            int r13 = r12.getSystemWindowInsetLeft()
            r11.leftMargin = r13
            int r13 = r12.getSystemWindowInsetTop()
            r11.topMargin = r13
            int r13 = r12.getSystemWindowInsetRight()
            r11.rightMargin = r13
            int r12 = r12.getSystemWindowInsetBottom()
            r11.bottomMargin = r12
        L_0x00dc:
            boolean r12 = j(r10)
            if (r12 == 0) goto L_0x0103
            int r7 = r11.leftMargin
            int r7 = r3 - r7
            int r12 = r11.rightMargin
            int r7 = r7 - r12
            r12 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r12)
            int r13 = r11.topMargin
            int r13 = r4 - r13
            int r11 = r11.bottomMargin
            int r13 = r13 - r11
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r12)
            r10.measure(r7, r11)
        L_0x00fd:
            r13 = r17
            r14 = r18
            goto L_0x0187
        L_0x0103:
            boolean r12 = l(r10)
            if (r12 == 0) goto L_0x018c
            boolean r12 = V
            if (r12 == 0) goto L_0x011a
            float r12 = w1.d0.i.i(r10)
            float r13 = r0.f2340b
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 == 0) goto L_0x011a
            w1.d0.i.s(r10, r13)
        L_0x011a:
            int r12 = r0.h(r10)
            r12 = r12 & 7
            r13 = 3
            if (r12 != r13) goto L_0x0124
            r7 = 1
        L_0x0124:
            if (r7 == 0) goto L_0x0128
            if (r8 != 0) goto L_0x012c
        L_0x0128:
            if (r7 != 0) goto L_0x0162
            if (r9 == 0) goto L_0x0162
        L_0x012c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Child drawer has absolute gravity "
            java.lang.StringBuilder r2 = android.support.v4.media.a.q(r2)
            r3 = r12 & 3
            r4 = 3
            if (r3 == r4) goto L_0x0146
            r3 = r12 & 5
            r4 = 5
            if (r3 != r4) goto L_0x0141
            java.lang.String r3 = "RIGHT"
            goto L_0x0148
        L_0x0141:
            java.lang.String r3 = java.lang.Integer.toHexString(r12)
            goto L_0x0148
        L_0x0146:
            java.lang.String r3 = "LEFT"
        L_0x0148:
            r2.append(r3)
            java.lang.String r3 = " but this "
            r2.append(r3)
            java.lang.String r3 = "DrawerLayout"
            r2.append(r3)
            java.lang.String r3 = " already has a drawer view along that edge"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0162:
            if (r7 == 0) goto L_0x0166
            r8 = 1
            goto L_0x0167
        L_0x0166:
            r9 = 1
        L_0x0167:
            int r7 = r0.f2341c
            int r12 = r11.leftMargin
            int r7 = r7 + r12
            int r12 = r11.rightMargin
            int r7 = r7 + r12
            int r12 = r11.width
            r13 = r17
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r13, r7, r12)
            int r12 = r11.topMargin
            int r14 = r11.bottomMargin
            int r12 = r12 + r14
            int r11 = r11.height
            r14 = r18
            int r11 = android.view.ViewGroup.getChildMeasureSpec(r14, r12, r11)
            r10.measure(r7, r11)
        L_0x0187:
            int r2 = r2 + 1
            r7 = 0
            goto L_0x0046
        L_0x018c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Child "
            r3.append(r4)
            r3.append(r10)
            java.lang.String r4 = " at index "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x01b0:
            return
        L_0x01b1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "DrawerLayout must be measured with MeasureSpec.EXACTLY."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        View d10;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f2188a);
        int i10 = savedState.f2362c;
        if (!(i10 == 0 || (d10 = d(i10)) == null)) {
            m(d10);
        }
        int i11 = savedState.f2363d;
        if (i11 != 3) {
            setDrawerLockMode(i11, 3);
        }
        int i12 = savedState.f2364e;
        if (i12 != 3) {
            setDrawerLockMode(i12, 5);
        }
        int i13 = savedState.f2365f;
        if (i13 != 3) {
            setDrawerLockMode(i13, 8388611);
        }
        int i14 = savedState.f2366n;
        if (i14 != 3) {
            setDrawerLockMode(i14, 8388613);
        }
    }

    public final void onRtlPropertiesChanged(int i10) {
        n();
    }

    public final Parcelable onSaveInstanceState() {
        boolean z10;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) getChildAt(i10).getLayoutParams();
            int i11 = layoutParams.f2361d;
            boolean z11 = true;
            if (i11 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 2) {
                z11 = false;
            }
            if (z10 || z11) {
                savedState.f2362c = layoutParams.f2358a;
            } else {
                i10++;
            }
        }
        savedState.f2363d = this.f2352u;
        savedState.f2364e = this.f2353v;
        savedState.f2365f = this.f2354w;
        savedState.f2366n = this.f2355x;
        return savedState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        if (g(r7) != 2) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            c2.c r0 = r6.f2345n
            r0.m(r7)
            c2.c r0 = r6.f2346o
            r0.m(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x005d
            if (r0 == r2) goto L_0x0020
            r7 = 3
            if (r0 == r7) goto L_0x001a
            goto L_0x006b
        L_0x001a:
            r6.c(r2)
            r6.f2356y = r1
            goto L_0x006b
        L_0x0020:
            float r0 = r7.getX()
            float r7 = r7.getY()
            c2.c r3 = r6.f2345n
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.j(r4, r5)
            if (r3 == 0) goto L_0x0058
            boolean r3 = j(r3)
            if (r3 == 0) goto L_0x0058
            float r3 = r6.B
            float r0 = r0 - r3
            float r3 = r6.C
            float r7 = r7 - r3
            c2.c r3 = r6.f2345n
            int r3 = r3.f4531b
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r7 = r7 + r0
            int r3 = r3 * r3
            float r0 = (float) r3
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x0058
            android.view.View r7 = r6.e()
            if (r7 == 0) goto L_0x0058
            int r7 = r6.g(r7)
            r0 = 2
            if (r7 != r0) goto L_0x0059
        L_0x0058:
            r1 = r2
        L_0x0059:
            r6.c(r1)
            goto L_0x006b
        L_0x005d:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.B = r0
            r6.C = r7
            r6.f2356y = r1
        L_0x006b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(View view) {
        f.a aVar = f.a.f16872l;
        d0.l(aVar.a(), view);
        d0.i(0, view);
        if (k(view) && g(view) != 2) {
            d0.m(view, aVar, (String) null, this.R);
        }
    }

    public final void q(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((z10 || l(childAt)) && (!z10 || childAt != view)) {
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                d0.d.s(childAt, 4);
            } else {
                WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
                d0.d.s(childAt, 1);
            }
        }
    }

    public final void r(int i10, View view) {
        View rootView;
        int i11 = this.f2345n.f4530a;
        int i12 = this.f2346o.f4530a;
        int i13 = 2;
        if (i11 == 1 || i12 == 1) {
            i13 = 1;
        } else if (!(i11 == 2 || i12 == 2)) {
            i13 = 0;
        }
        if (view != null && i10 == 0) {
            float f10 = ((LayoutParams) view.getLayoutParams()).f2359b;
            if (f10 == 0.0f) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                if ((layoutParams.f2361d & 1) == 1) {
                    layoutParams.f2361d = 0;
                    ArrayList arrayList = this.A;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((e) this.A.get(size)).d(view);
                        }
                    }
                    q(view, false);
                    p(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f10 == 1.0f) {
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                if ((layoutParams2.f2361d & 1) == 0) {
                    layoutParams2.f2361d = 1;
                    ArrayList arrayList2 = this.A;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((e) this.A.get(size2)).c(view);
                        }
                    }
                    q(view, true);
                    p(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i13 != this.f2349r) {
            this.f2349r = i13;
            ArrayList arrayList3 = this.A;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((e) this.A.get(size3)).a();
                }
            }
        }
    }

    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            c(true);
        }
    }

    public final void requestLayout() {
        if (!this.f2350s) {
            super.requestLayout();
        }
    }

    public void setChildInsets(Object obj, boolean z10) {
        boolean z11;
        this.I = obj;
        this.J = z10;
        if (z10 || getBackground() != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        setWillNotDraw(z11);
        requestLayout();
    }

    public void setDrawerElevation(float f10) {
        this.f2340b = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (l(childAt)) {
                float f11 = this.f2340b;
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                d0.i.s(childAt, f11);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        ArrayList arrayList;
        e eVar2 = this.f2357z;
        if (!(eVar2 == null || (arrayList = this.A) == null)) {
            arrayList.remove(eVar2);
        }
        if (eVar != null) {
            if (this.A == null) {
                this.A = new ArrayList();
            }
            this.A.add(eVar);
        }
        this.f2357z = eVar;
    }

    public void setDrawerLockMode(int i10) {
        setDrawerLockMode(i10, 3);
        setDrawerLockMode(i10, 5);
    }

    public void setDrawerShadow(Drawable drawable, int i10) {
        if (!V) {
            if ((i10 & 8388611) == 8388611) {
                this.K = drawable;
            } else if ((i10 & 8388613) == 8388613) {
                this.L = drawable;
            } else if ((i10 & 3) == 3) {
                this.M = drawable;
            } else if ((i10 & 5) == 5) {
                this.N = drawable;
            } else {
                return;
            }
            n();
            invalidate();
        }
    }

    public void setDrawerTitle(int i10, CharSequence charSequence) {
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, d0.e.d(this));
        if (absoluteGravity == 3) {
            this.G = charSequence;
        } else if (absoluteGravity == 5) {
            this.H = charSequence;
        }
    }

    public void setScrimColor(int i10) {
        this.f2342d = i10;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.D = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i10) {
        this.D = new ColorDrawable(i10);
        invalidate();
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.drawerLayoutStyle);
    }

    /* JADX INFO: finally extract failed */
    public DrawerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2339a = new d();
        this.f2342d = -1728053248;
        this.f2344f = new Paint();
        this.f2351t = true;
        this.f2352u = 3;
        this.f2353v = 3;
        this.f2354w = 3;
        this.f2355x = 3;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.R = new a();
        setDescendantFocusability(262144);
        float f10 = getResources().getDisplayMetrics().density;
        this.f2341c = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        g gVar = new g(3);
        this.f2347p = gVar;
        g gVar2 = new g(5);
        this.f2348q = gVar2;
        c2.c i11 = c2.c.i(this, 1.0f, gVar);
        this.f2345n = i11;
        i11.f4546q = 1;
        i11.f4543n = f11;
        gVar.f2371b = i11;
        c2.c i12 = c2.c.i(this, 1.0f, gVar2);
        this.f2346o = i12;
        i12.f4546q = 2;
        i12.f4543n = f11;
        gVar2.f2371b = i12;
        setFocusableInTouchMode(true);
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.d.s(this, 1);
        d0.o(this, new c());
        setMotionEventSplittingEnabled(false);
        if (d0.d.b(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(S);
            try {
                this.D = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.DrawerLayout, i10, 0);
        try {
            int i13 = R$styleable.DrawerLayout_elevation;
            if (obtainStyledAttributes2.hasValue(i13)) {
                this.f2340b = obtainStyledAttributes2.getDimension(i13, 0.0f);
            } else {
                this.f2340b = getResources().getDimension(R$dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.O = new ArrayList<>();
        } catch (Throwable th2) {
            obtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public void setDrawerLockMode(int i10, int i11) {
        View d10;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i11, d0.e.d(this));
        if (i11 == 3) {
            this.f2352u = i10;
        } else if (i11 == 5) {
            this.f2353v = i10;
        } else if (i11 == 8388611) {
            this.f2354w = i10;
        } else if (i11 == 8388613) {
            this.f2355x = i10;
        }
        if (i10 != 0) {
            (absoluteGravity == 3 ? this.f2345n : this.f2346o).b();
        }
        if (i10 == 1) {
            View d11 = d(absoluteGravity);
            if (d11 != null) {
                b(d11, true);
            }
        } else if (i10 == 2 && (d10 = d(absoluteGravity)) != null) {
            m(d10);
        }
    }

    public void setStatusBarBackground(int i10) {
        this.D = i10 != 0 ? k1.a.getDrawable(getContext(), i10) : null;
        invalidate();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f2358a = 0;

        /* renamed from: b  reason: collision with root package name */
        public float f2359b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2360c;

        /* renamed from: d  reason: collision with root package name */
        public int f2361d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.T);
            this.f2358a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f2358a = layoutParams.f2358a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f2362c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f2363d;

        /* renamed from: e  reason: collision with root package name */
        public int f2364e;

        /* renamed from: f  reason: collision with root package name */
        public int f2365f;

        /* renamed from: n  reason: collision with root package name */
        public int f2366n;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2362c = parcel.readInt();
            this.f2363d = parcel.readInt();
            this.f2364e = parcel.readInt();
            this.f2365f = parcel.readInt();
            this.f2366n = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f2188a, i10);
            parcel.writeInt(this.f2362c);
            parcel.writeInt(this.f2363d);
            parcel.writeInt(this.f2364e);
            parcel.writeInt(this.f2365f);
            parcel.writeInt(this.f2366n);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setDrawerShadow(int i10, int i11) {
        setDrawerShadow(k1.a.getDrawable(getContext(), i10), i11);
    }

    public void setDrawerLockMode(int i10, View view) {
        if (l(view)) {
            setDrawerLockMode(i10, ((LayoutParams) view.getLayoutParams()).f2358a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }
}
