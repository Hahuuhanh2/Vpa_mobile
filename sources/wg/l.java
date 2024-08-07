package wg;

import android.view.View;
import ek.i;
import sk.k;

/* compiled from: AuctionFragment.kt */
public final class l extends k implements rk.l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f23403a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(b bVar) {
        super(1);
        this.f23403a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            android.view.View r7 = (android.view.View) r7
            java.lang.String r0 = "it"
            sk.j.f(r7, r0)
            wg.b r7 = r6.f23403a
            int r0 = wg.b.f23380q0
            d2.l r0 = r7.i0()
            mg.c3 r0 = (mg.c3) r0
            mg.t7 r0 = r0.A
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r0.f21367y
            boolean r0 = r0.b()
            java.lang.String r1 = "getRoot(...)"
            if (r0 == 0) goto L_0x004f
            of.a r0 = new of.a
            d2.l r2 = r7.i0()
            mg.c3 r2 = (mg.c3) r2
            android.view.View r2 = r2.f8554e
            sk.j.e(r2, r1)
            r0.<init>(r2)
            d2.l r2 = r7.i0()
            mg.c3 r2 = (mg.c3) r2
            mg.t7 r2 = r2.A
            com.ots.core.utils.customview.edit.TextInputLayout r2 = r2.f21367y
            java.lang.String r2 = r2.getValidatorTypeText()
            of.b r3 = of.b.ERROR
            r0.a(r2, r3)
            d2.l r7 = r7.i0()
            mg.c3 r7 = (mg.c3) r7
            mg.t7 r7 = r7.A
            com.ots.core.utils.customview.edit.TextInputLayout r7 = r7.f21367y
            r7.requestFocus()
            goto L_0x00d0
        L_0x004f:
            d2.l r0 = r7.i0()
            mg.c3 r0 = (mg.c3) r0
            mg.t7 r0 = r0.A
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r0.B
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0090
            of.a r0 = new of.a
            d2.l r2 = r7.i0()
            mg.c3 r2 = (mg.c3) r2
            android.view.View r2 = r2.f8554e
            sk.j.e(r2, r1)
            r0.<init>(r2)
            d2.l r2 = r7.i0()
            mg.c3 r2 = (mg.c3) r2
            mg.t7 r2 = r2.A
            com.ots.core.utils.customview.edit.TextInputLayout r2 = r2.B
            java.lang.String r2 = r2.getValidatorTypeText()
            of.b r3 = of.b.ERROR
            r0.a(r2, r3)
            d2.l r7 = r7.i0()
            mg.c3 r7 = (mg.c3) r7
            mg.t7 r7 = r7.A
            com.ots.core.utils.customview.edit.TextInputLayout r7 = r7.B
            r7.requestFocus()
            goto L_0x00d0
        L_0x0090:
            d2.l r0 = r7.i0()
            mg.c3 r0 = (mg.c3) r0
            mg.t7 r0 = r0.A
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r0.f21368z
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x00d2
            of.a r0 = new of.a
            d2.l r2 = r7.i0()
            mg.c3 r2 = (mg.c3) r2
            android.view.View r2 = r2.f8554e
            sk.j.e(r2, r1)
            r0.<init>(r2)
            d2.l r2 = r7.i0()
            mg.c3 r2 = (mg.c3) r2
            mg.t7 r2 = r2.A
            com.ots.core.utils.customview.edit.TextInputLayout r2 = r2.f21368z
            java.lang.String r2 = r2.getValidatorTypeText()
            of.b r3 = of.b.ERROR
            r0.a(r2, r3)
            d2.l r7 = r7.i0()
            mg.c3 r7 = (mg.c3) r7
            mg.t7 r7 = r7.A
            com.ots.core.utils.customview.edit.TextInputLayout r7 = r7.f21368z
            r7.requestFocus()
        L_0x00d0:
            r7 = 0
            goto L_0x00d3
        L_0x00d2:
            r7 = 1
        L_0x00d3:
            if (r7 == 0) goto L_0x0121
            wg.b r7 = r6.f23403a
            r7.getClass()
            java.lang.String r0 = "Lỗi kết nối recaptcha vui lòng thử lại sau!"
            androidx.fragment.app.FragmentActivity r2 = r7.m()     // Catch:{ Exception -> 0x010e }
            java.lang.String r3 = "null cannot be cast to non-null type com.vpa.daugia.ui.MainActivity"
            sk.j.d(r2, r3)     // Catch:{ Exception -> 0x010e }
            com.vpa.daugia.ui.MainActivity r2 = (com.vpa.daugia.ui.MainActivity) r2     // Catch:{ Exception -> 0x010e }
            com.google.android.recaptcha.RecaptchaClient r2 = r2.U     // Catch:{ Exception -> 0x010e }
            if (r2 == 0) goto L_0x00fa
            androidx.lifecycle.l r2 = al.g0.W(r7)     // Catch:{ Exception -> 0x010e }
            wg.c r3 = new wg.c     // Catch:{ Exception -> 0x010e }
            r4 = 0
            r3.<init>(r7, r4)     // Catch:{ Exception -> 0x010e }
            r5 = 3
            p3.l0.j0(r2, r4, r3, r5)     // Catch:{ Exception -> 0x010e }
            goto L_0x0121
        L_0x00fa:
            of.a r2 = new of.a     // Catch:{ Exception -> 0x010e }
            d2.l r3 = r7.i0()     // Catch:{ Exception -> 0x010e }
            mg.c3 r3 = (mg.c3) r3     // Catch:{ Exception -> 0x010e }
            android.view.View r3 = r3.f8554e     // Catch:{ Exception -> 0x010e }
            sk.j.e(r3, r1)     // Catch:{ Exception -> 0x010e }
            r2.<init>(r3)     // Catch:{ Exception -> 0x010e }
            r2.a(r0, of.b.ERROR)     // Catch:{ Exception -> 0x010e }
            goto L_0x0121
        L_0x010e:
            of.a r2 = new of.a
            d2.l r7 = r7.i0()
            mg.c3 r7 = (mg.c3) r7
            android.view.View r7 = r7.f8554e
            sk.j.e(r7, r1)
            r2.<init>(r7)
            r2.a(r0, of.b.ERROR)
        L_0x0121:
            ek.i r7 = ek.i.f20112a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.l.invoke(java.lang.Object):java.lang.Object");
    }
}
