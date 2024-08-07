package androidx.appcompat.app;

import w1.r0;
import w1.s0;

/* compiled from: AppCompatDelegateImpl */
public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppCompatDelegateImpl f439a;

    /* compiled from: AppCompatDelegateImpl */
    public class a extends s0 {
        public a() {
        }

        public final void a() {
            i.this.f439a.C.setAlpha(1.0f);
            i.this.f439a.F.d((r0) null);
            i.this.f439a.F = null;
        }

        public final void c() {
            i.this.f439a.C.setVisibility(0);
        }
    }

    public i(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f439a = appCompatDelegateImpl;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f439a
            android.widget.PopupWindow r1 = r0.D
            androidx.appcompat.widget.ActionBarContextView r0 = r0.C
            r2 = 55
            r3 = 0
            r1.showAtLocation(r0, r2, r3, r3)
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f439a
            w1.q0 r0 = r0.F
            if (r0 == 0) goto L_0x0015
            r0.b()
        L_0x0015:
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f439a
            boolean r1 = r0.H
            if (r1 == 0) goto L_0x0029
            android.view.ViewGroup r0 = r0.I
            if (r0 == 0) goto L_0x0029
            java.util.WeakHashMap<android.view.View, w1.q0> r1 = w1.d0.f16298a
            boolean r0 = w1.d0.g.c(r0)
            if (r0 == 0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = r3
        L_0x002a:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0050
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f439a
            androidx.appcompat.widget.ActionBarContextView r0 = r0.C
            r2 = 0
            r0.setAlpha(r2)
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f439a
            androidx.appcompat.widget.ActionBarContextView r2 = r0.C
            w1.q0 r2 = w1.d0.a(r2)
            r2.a(r1)
            r0.F = r2
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f439a
            w1.q0 r0 = r0.F
            androidx.appcompat.app.i$a r1 = new androidx.appcompat.app.i$a
            r1.<init>()
            r0.d(r1)
            goto L_0x005e
        L_0x0050:
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f439a
            androidx.appcompat.widget.ActionBarContextView r0 = r0.C
            r0.setAlpha(r1)
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f439a
            androidx.appcompat.widget.ActionBarContextView r0 = r0.C
            r0.setVisibility(r3)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.i.run():void");
    }
}
