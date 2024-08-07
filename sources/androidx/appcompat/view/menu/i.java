package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import java.util.WeakHashMap;
import m.d;
import w1.d0;
import w1.q0;

/* compiled from: MenuPopupHelper */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f669a;

    /* renamed from: b  reason: collision with root package name */
    public final f f670b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f671c;

    /* renamed from: d  reason: collision with root package name */
    public final int f672d;

    /* renamed from: e  reason: collision with root package name */
    public final int f673e;

    /* renamed from: f  reason: collision with root package name */
    public View f674f;

    /* renamed from: g  reason: collision with root package name */
    public int f675g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f676h;

    /* renamed from: i  reason: collision with root package name */
    public j.a f677i;

    /* renamed from: j  reason: collision with root package name */
    public d f678j;

    /* renamed from: k  reason: collision with root package name */
    public PopupWindow.OnDismissListener f679k;

    /* renamed from: l  reason: collision with root package name */
    public final a f680l;

    /* compiled from: MenuPopupHelper */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        public final void onDismiss() {
            i.this.c();
        }
    }

    /* compiled from: MenuPopupHelper */
    public static class b {
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public i(Context context, f fVar, View view, boolean z10, int i10) {
        this(i10, 0, context, view, fVar, z10);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [m.d, androidx.appcompat.view.menu.j] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.l] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final m.d a() {
        /*
            r14 = this;
            m.d r0 = r14.f678j
            if (r0 != 0) goto L_0x0078
            android.content.Context r0 = r14.f669a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            androidx.appcompat.view.menu.i.b.a(r0, r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f669a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = androidx.appcompat.R$dimen.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0032
            r0 = 1
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            if (r0 == 0) goto L_0x0046
            androidx.appcompat.view.menu.b r0 = new androidx.appcompat.view.menu.b
            android.content.Context r2 = r14.f669a
            android.view.View r3 = r14.f674f
            int r4 = r14.f672d
            int r5 = r14.f673e
            boolean r6 = r14.f671c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0058
        L_0x0046:
            androidx.appcompat.view.menu.l r0 = new androidx.appcompat.view.menu.l
            android.content.Context r10 = r14.f669a
            androidx.appcompat.view.menu.f r12 = r14.f670b
            android.view.View r11 = r14.f674f
            int r8 = r14.f672d
            int r9 = r14.f673e
            boolean r13 = r14.f671c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0058:
            androidx.appcompat.view.menu.f r1 = r14.f670b
            r0.n(r1)
            androidx.appcompat.view.menu.i$a r1 = r14.f680l
            r0.t(r1)
            android.view.View r1 = r14.f674f
            r0.p(r1)
            androidx.appcompat.view.menu.j$a r1 = r14.f677i
            r0.f(r1)
            boolean r1 = r14.f676h
            r0.q(r1)
            int r1 = r14.f675g
            r0.r(r1)
            r14.f678j = r0
        L_0x0078:
            m.d r0 = r14.f678j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.i.a():m.d");
    }

    public final boolean b() {
        d dVar = this.f678j;
        if (dVar == null || !dVar.a()) {
            return false;
        }
        return true;
    }

    public void c() {
        this.f678j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f679k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        d a10 = a();
        a10.u(z11);
        if (z10) {
            int i12 = this.f675g;
            View view = this.f674f;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            if ((Gravity.getAbsoluteGravity(i12, d0.e.d(view)) & 7) == 5) {
                i10 -= this.f674f.getWidth();
            }
            a10.s(i10);
            a10.v(i11);
            int i13 = (int) ((this.f669a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f13033a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a10.b();
    }

    public i(int i10, int i11, Context context, View view, f fVar, boolean z10) {
        this.f675g = 8388611;
        this.f680l = new a();
        this.f669a = context;
        this.f670b = fVar;
        this.f674f = view;
        this.f671c = z10;
        this.f672d = i10;
        this.f673e = i11;
    }
}
