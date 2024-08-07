package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$styleable;
import androidx.core.widget.i;
import androidx.core.widget.j;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

public class ListPopupWindow implements m.f {
    public static Method H;
    public static Method I;
    public static Method J;
    public final e A;
    public final c B;
    public final Handler C;
    public final Rect D;
    public Rect E;
    public boolean F;
    public PopupWindow G;

    /* renamed from: a  reason: collision with root package name */
    public Context f892a;

    /* renamed from: b  reason: collision with root package name */
    public ListAdapter f893b;

    /* renamed from: c  reason: collision with root package name */
    public y f894c;

    /* renamed from: d  reason: collision with root package name */
    public int f895d;

    /* renamed from: e  reason: collision with root package name */
    public int f896e;

    /* renamed from: f  reason: collision with root package name */
    public int f897f;

    /* renamed from: n  reason: collision with root package name */
    public int f898n;

    /* renamed from: o  reason: collision with root package name */
    public int f899o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f900p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f901q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f902r;

    /* renamed from: s  reason: collision with root package name */
    public int f903s;

    /* renamed from: t  reason: collision with root package name */
    public int f904t;

    /* renamed from: u  reason: collision with root package name */
    public d f905u;

    /* renamed from: v  reason: collision with root package name */
    public View f906v;

    /* renamed from: w  reason: collision with root package name */
    public AdapterView.OnItemClickListener f907w;

    /* renamed from: x  reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f908x;

    /* renamed from: y  reason: collision with root package name */
    public final g f909y;

    /* renamed from: z  reason: collision with root package name */
    public final f f910z;

    public static class a {
        public static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    public static class b {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            y yVar = ListPopupWindow.this.f894c;
            if (yVar != null) {
                yVar.setListSelectionHidden(true);
                yVar.requestLayout();
            }
        }
    }

    public class d extends DataSetObserver {
        public d() {
        }

        public final void onChanged() {
            if (ListPopupWindow.this.a()) {
                ListPopupWindow.this.b();
            }
        }

        public final void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        public final void onScrollStateChanged(AbsListView absListView, int i10) {
            boolean z10 = true;
            if (i10 == 1) {
                if (ListPopupWindow.this.G.getInputMethodMode() != 2) {
                    z10 = false;
                }
                if (!z10 && ListPopupWindow.this.G.getContentView() != null) {
                    ListPopupWindow listPopupWindow = ListPopupWindow.this;
                    listPopupWindow.C.removeCallbacks(listPopupWindow.f909y);
                    ListPopupWindow.this.f909y.run();
                }
            }
        }
    }

    public class f implements View.OnTouchListener {
        public f() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.G) != null && popupWindow.isShowing() && x10 >= 0 && x10 < ListPopupWindow.this.G.getWidth() && y10 >= 0 && y10 < ListPopupWindow.this.G.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.C.postDelayed(listPopupWindow.f909y, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
                listPopupWindow2.C.removeCallbacks(listPopupWindow2.f909y);
                return false;
            }
        }
    }

    public class g implements Runnable {
        public g() {
        }

        public final void run() {
            y yVar = ListPopupWindow.this.f894c;
            if (yVar != null) {
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                if (d0.g.b(yVar) && ListPopupWindow.this.f894c.getCount() > ListPopupWindow.this.f894c.getChildCount()) {
                    int childCount = ListPopupWindow.this.f894c.getChildCount();
                    ListPopupWindow listPopupWindow = ListPopupWindow.this;
                    if (childCount <= listPopupWindow.f904t) {
                        listPopupWindow.G.setInputMethodMode(2);
                        ListPopupWindow.this.b();
                    }
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                H = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
            }
            try {
                J = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                I = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, (AttributeSet) null, R$attr.listPopupWindowStyle);
    }

    public final boolean a() {
        return this.G.isShowing();
    }

    public final void b() {
        int i10;
        boolean z10;
        int i11;
        int i12;
        boolean z11;
        y yVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (this.f894c == null) {
            y q10 = q(this.f892a, !this.F);
            this.f894c = q10;
            q10.setAdapter(this.f893b);
            this.f894c.setOnItemClickListener(this.f907w);
            this.f894c.setFocusable(true);
            this.f894c.setFocusableInTouchMode(true);
            this.f894c.setOnItemSelectedListener(new b0(this));
            this.f894c.setOnScrollListener(this.A);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f908x;
            if (onItemSelectedListener != null) {
                this.f894c.setOnItemSelectedListener(onItemSelectedListener);
            }
            this.G.setContentView(this.f894c);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.G.getContentView();
        }
        Drawable background = this.G.getBackground();
        int i18 = 0;
        if (background != null) {
            background.getPadding(this.D);
            Rect rect = this.D;
            int i19 = rect.top;
            i10 = rect.bottom + i19;
            if (!this.f900p) {
                this.f898n = -i19;
            }
        } else {
            this.D.setEmpty();
            i10 = 0;
        }
        if (this.G.getInputMethodMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        View view = this.f906v;
        int i20 = this.f898n;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = I;
            if (method != null) {
                try {
                    i11 = ((Integer) method.invoke(this.G, new Object[]{view, Integer.valueOf(i20), Boolean.valueOf(z10)})).intValue();
                } catch (Exception unused) {
                }
            }
            i11 = this.G.getMaxAvailableHeight(view, i20);
        } else {
            i11 = a.a(this.G, view, i20, z10);
        }
        if (this.f895d == -1) {
            i12 = i11 + i10;
        } else {
            int i21 = this.f896e;
            if (i21 == -2) {
                int i22 = this.f892a.getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = this.D;
                i16 = View.MeasureSpec.makeMeasureSpec(i22 - (rect2.left + rect2.right), Integer.MIN_VALUE);
            } else if (i21 != -1) {
                i16 = View.MeasureSpec.makeMeasureSpec(i21, 1073741824);
            } else {
                int i23 = this.f892a.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.D;
                i16 = View.MeasureSpec.makeMeasureSpec(i23 - (rect3.left + rect3.right), 1073741824);
            }
            int a10 = this.f894c.a(i16, i11 + 0);
            if (a10 > 0) {
                i17 = this.f894c.getPaddingBottom() + this.f894c.getPaddingTop() + i10 + 0;
            } else {
                i17 = 0;
            }
            i12 = a10 + i17;
        }
        if (this.G.getInputMethodMode() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        j.d(this.G, this.f899o);
        if (this.G.isShowing()) {
            View view2 = this.f906v;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            if (d0.g.b(view2)) {
                int i24 = this.f896e;
                if (i24 == -1) {
                    i24 = -1;
                } else if (i24 == -2) {
                    i24 = this.f906v.getWidth();
                }
                int i25 = this.f895d;
                if (i25 == -1) {
                    if (!z11) {
                        i12 = -1;
                    }
                    if (z11) {
                        PopupWindow popupWindow = this.G;
                        if (this.f896e == -1) {
                            i15 = -1;
                        } else {
                            i15 = 0;
                        }
                        popupWindow.setWidth(i15);
                        this.G.setHeight(0);
                    } else {
                        PopupWindow popupWindow2 = this.G;
                        if (this.f896e == -1) {
                            i18 = -1;
                        }
                        popupWindow2.setWidth(i18);
                        this.G.setHeight(-1);
                    }
                } else if (i25 != -2) {
                    i12 = i25;
                }
                this.G.setOutsideTouchable(true);
                PopupWindow popupWindow3 = this.G;
                View view3 = this.f906v;
                int i26 = this.f897f;
                int i27 = this.f898n;
                if (i24 < 0) {
                    i13 = -1;
                } else {
                    i13 = i24;
                }
                if (i12 < 0) {
                    i14 = -1;
                } else {
                    i14 = i12;
                }
                popupWindow3.update(view3, i26, i27, i13, i14);
                return;
            }
            return;
        }
        int i28 = this.f896e;
        if (i28 == -1) {
            i28 = -1;
        } else if (i28 == -2) {
            i28 = this.f906v.getWidth();
        }
        int i29 = this.f895d;
        if (i29 == -1) {
            i12 = -1;
        } else if (i29 != -2) {
            i12 = i29;
        }
        this.G.setWidth(i28);
        this.G.setHeight(i12);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = H;
            if (method2 != null) {
                try {
                    method2.invoke(this.G, new Object[]{Boolean.TRUE});
                } catch (Exception unused2) {
                }
            }
        } else {
            b.b(this.G, true);
        }
        this.G.setOutsideTouchable(true);
        this.G.setTouchInterceptor(this.f910z);
        if (this.f902r) {
            j.c(this.G, this.f901q);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = J;
            if (method3 != null) {
                try {
                    method3.invoke(this.G, new Object[]{this.E});
                } catch (Exception unused3) {
                }
            }
        } else {
            b.a(this.G, this.E);
        }
        i.a(this.G, this.f906v, this.f897f, this.f898n, this.f903s);
        this.f894c.setSelection(-1);
        if ((!this.F || this.f894c.isInTouchMode()) && (yVar = this.f894c) != null) {
            yVar.setListSelectionHidden(true);
            yVar.requestLayout();
        }
        if (!this.F) {
            this.C.post(this.B);
        }
    }

    public final int c() {
        return this.f897f;
    }

    public final void dismiss() {
        this.G.dismiss();
        this.G.setContentView((View) null);
        this.f894c = null;
        this.C.removeCallbacks(this.f909y);
    }

    public final void e(int i10) {
        this.f897f = i10;
    }

    public final Drawable h() {
        return this.G.getBackground();
    }

    public final y j() {
        return this.f894c;
    }

    public final void k(Drawable drawable) {
        this.G.setBackgroundDrawable(drawable);
    }

    public final void l(int i10) {
        this.f898n = i10;
        this.f900p = true;
    }

    public final int o() {
        if (!this.f900p) {
            return 0;
        }
        return this.f898n;
    }

    public void p(ListAdapter listAdapter) {
        d dVar = this.f905u;
        if (dVar == null) {
            this.f905u = new d();
        } else {
            ListAdapter listAdapter2 = this.f893b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.f893b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f905u);
        }
        y yVar = this.f894c;
        if (yVar != null) {
            yVar.setAdapter(this.f893b);
        }
    }

    public y q(Context context, boolean z10) {
        return new y(context, z10);
    }

    public final void r(int i10) {
        Drawable background = this.G.getBackground();
        if (background != null) {
            background.getPadding(this.D);
            Rect rect = this.D;
            this.f896e = rect.left + rect.right + i10;
            return;
        }
        this.f896e = i10;
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f895d = -2;
        this.f896e = -2;
        this.f899o = 1002;
        this.f903s = 0;
        this.f904t = Integer.MAX_VALUE;
        this.f909y = new g();
        this.f910z = new f();
        this.A = new e();
        this.B = new c();
        this.D = new Rect();
        this.f892a = context;
        this.C = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ListPopupWindow, i10, i11);
        this.f897f = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f898n = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f900p = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i10, i11);
        this.G = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
