package com.google.android.material.search;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6697a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f6698b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f6697a = i10;
        this.f6698b = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r12) {
        /*
            r11 = this;
            int r12 = r11.f6697a
            r0 = 2
            java.lang.String r1 = "onActionDone"
            r2 = 0
            java.lang.String r3 = "dd/MM/yyyy"
            java.lang.String r4 = ""
            r5 = 0
            r6 = 1
            java.lang.String r7 = "this$0"
            switch(r12) {
                case 0: goto L_0x0497;
                case 1: goto L_0x0484;
                case 2: goto L_0x0470;
                case 3: goto L_0x0456;
                case 4: goto L_0x03be;
                case 5: goto L_0x03ab;
                case 6: goto L_0x039e;
                case 7: goto L_0x0388;
                case 8: goto L_0x037d;
                case 9: goto L_0x0372;
                case 10: goto L_0x0364;
                case 11: goto L_0x0357;
                case 12: goto L_0x034a;
                case 13: goto L_0x030d;
                case 14: goto L_0x02ce;
                case 15: goto L_0x02b2;
                case 16: goto L_0x02a5;
                case 17: goto L_0x0298;
                case 18: goto L_0x0125;
                case 19: goto L_0x010e;
                case 20: goto L_0x00ae;
                case 21: goto L_0x009c;
                case 22: goto L_0x0066;
                case 23: goto L_0x0059;
                case 24: goto L_0x004e;
                case 25: goto L_0x0041;
                case 26: goto L_0x0034;
                case 27: goto L_0x001e;
                case 28: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x04a4
        L_0x0013:
            java.lang.Object r12 = r11.f6698b
            th.e r12 = (th.e) r12
            sk.j.f(r12, r7)
            r12.a()
            return
        L_0x001e:
            java.lang.Object r12 = r11.f6698b
            th.a r12 = (th.a) r12
            sk.j.f(r12, r7)
            th.b r0 = r12.f23013j
            if (r0 == 0) goto L_0x0030
            r0.a(r6)
            r12.a()
            return
        L_0x0030:
            sk.j.l(r1)
            throw r2
        L_0x0034:
            java.lang.Object r12 = r11.f6698b
            ph.c r12 = (ph.c) r12
            int r0 = ph.c.f22647o
            sk.j.f(r12, r7)
            r12.dismiss()
            return
        L_0x0041:
            java.lang.Object r12 = r11.f6698b
            ph.b r12 = (ph.b) r12
            int r0 = ph.b.f22643p
            sk.j.f(r12, r7)
            r12.dismiss()
            return
        L_0x004e:
            java.lang.Object r12 = r11.f6698b
            ph.a r12 = (ph.a) r12
            sk.j.f(r12, r7)
            r12.a()
            return
        L_0x0059:
            java.lang.Object r12 = r11.f6698b
            com.vpa.daugia.module.home.ui.AuctionNotifyActivity r12 = (com.vpa.daugia.module.home.ui.AuctionNotifyActivity) r12
            int r0 = com.vpa.daugia.module.home.ui.AuctionNotifyActivity.T
            sk.j.f(r12, r7)
            r12.finish()
            return
        L_0x0066:
            java.lang.Object r12 = r11.f6698b
            com.vpa.daugia.module.home.ui.AnnouncementListActivity r12 = (com.vpa.daugia.module.home.ui.AnnouncementListActivity) r12
            int r0 = com.vpa.daugia.module.home.ui.AnnouncementListActivity.Z
            sk.j.f(r12, r7)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.vpa.daugia.module.searching.ui.activity.FilterActivity> r1 = com.vpa.daugia.module.searching.ui.activity.FilterActivity.class
            r0.<init>(r12, r1)
            bc.h r1 = new bc.h
            r1.<init>()
            gf.b r2 = r12.W
            java.lang.String r1 = r1.i(r2)
            java.lang.String r2 = "selected_vehicles"
            r0.putExtra(r2, r1)
            bc.h r1 = new bc.h
            r1.<init>()
            gf.b r2 = r12.X
            java.lang.String r1 = r1.i(r2)
            java.lang.String r2 = "selected_provinces"
            r0.putExtra(r2, r1)
            f.d r12 = r12.Y
            r12.a(r0)
            return
        L_0x009c:
            java.lang.Object r12 = r11.f6698b
            fh.a r12 = (fh.a) r12
            sk.j.f(r12, r7)
            r12.a()
            rk.a<ek.i> r12 = r12.f20168i
            if (r12 == 0) goto L_0x00ad
            r12.invoke()
        L_0x00ad:
            return
        L_0x00ae:
            java.lang.Object r12 = r11.f6698b
            ah.d r12 = (ah.d) r12
            sk.j.f(r12, r7)
            java.util.LinkedHashSet r0 = r12.f18962k
            java.lang.String r4 = "<this>"
            sk.j.f(r0, r4)
            boolean r4 = r0 instanceof java.util.List
            if (r4 == 0) goto L_0x00ce
            java.util.List r0 = (java.util.List) r0
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x00c9
            goto L_0x00d8
        L_0x00c9:
            java.lang.Object r0 = r0.get(r5)
            goto L_0x00de
        L_0x00ce:
            java.util.Iterator r0 = r0.iterator()
            boolean r4 = r0.hasNext()
            if (r4 != 0) goto L_0x00da
        L_0x00d8:
            r0 = r2
            goto L_0x00de
        L_0x00da:
            java.lang.Object r0 = r0.next()
        L_0x00de:
            j$.time.LocalDate r0 = (j$.time.LocalDate) r0
            if (r0 != 0) goto L_0x00e6
            j$.time.LocalDate r0 = j$.time.LocalDate.now()
        L_0x00e6:
            ah.h r4 = r12.f18961j
            if (r4 == 0) goto L_0x010a
            sk.j.c(r0)
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r2 = "vi"
            java.lang.String r5 = "VN"
            r1.<init>(r2, r5)
            j$.time.format.DateTimeFormatter r1 = j$.time.format.DateTimeFormatter.ofPattern(r3, r1)
            java.lang.String r1 = r0.format(r1)
            java.lang.String r2 = "format(...)"
            sk.j.e(r1, r2)
            r4.a(r0, r1)
            r12.a()
            return
        L_0x010a:
            sk.j.l(r1)
            throw r2
        L_0x010e:
            java.lang.Object r12 = r11.f6698b
            com.vpa.daugia.module.auth.ui.activity.SuccessActivity r12 = (com.vpa.daugia.module.auth.ui.activity.SuccessActivity) r12
            int r0 = com.vpa.daugia.module.auth.ui.activity.SuccessActivity.R
            sk.j.f(r12, r7)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.vpa.daugia.module.auth.ui.activity.AuthActivity> r1 = com.vpa.daugia.module.auth.ui.activity.AuthActivity.class
            r0.<init>(r12, r1)
            r12.startActivity(r0)
            r12.finish()
            return
        L_0x0125:
            java.lang.Object r12 = r11.f6698b
            com.vpa.daugia.module.auth.ui.activity.StepTwoActivity r12 = (com.vpa.daugia.module.auth.ui.activity.StepTwoActivity) r12
            int r1 = com.vpa.daugia.module.auth.ui.activity.StepTwoActivity.V
            sk.j.f(r12, r7)
            d2.l r1 = r12.M()
            mg.c4 r1 = (mg.c4) r1
            mg.o6 r1 = r1.f21011z
            com.ots.core.utils.customview.edit.TextInputLayout r1 = r1.K
            boolean r1 = r1.b()
            java.lang.String r3 = "getRoot(...)"
            if (r1 == 0) goto L_0x0172
            of.a r1 = new of.a
            d2.l r4 = r12.M()
            mg.c4 r4 = (mg.c4) r4
            android.view.View r4 = r4.f8554e
            sk.j.e(r4, r3)
            r1.<init>(r4)
            d2.l r3 = r12.M()
            mg.c4 r3 = (mg.c4) r3
            mg.o6 r3 = r3.f21011z
            com.ots.core.utils.customview.edit.TextInputLayout r3 = r3.K
            java.lang.String r3 = r3.getValidatorTypeText()
            of.b r4 = of.b.ERROR
            r1.a(r3, r4)
            d2.l r1 = r12.M()
            mg.c4 r1 = (mg.c4) r1
            mg.o6 r1 = r1.f21011z
            androidx.appcompat.widget.AppCompatEditText r1 = r1.B
            r1.requestFocus()
            goto L_0x027d
        L_0x0172:
            d2.l r1 = r12.M()
            mg.c4 r1 = (mg.c4) r1
            mg.o6 r1 = r1.f21011z
            com.ots.core.utils.customview.edit.TextInputLayout r1 = r1.J
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x01b4
            of.a r1 = new of.a
            d2.l r4 = r12.M()
            mg.c4 r4 = (mg.c4) r4
            android.view.View r4 = r4.f8554e
            sk.j.e(r4, r3)
            r1.<init>(r4)
            d2.l r3 = r12.M()
            mg.c4 r3 = (mg.c4) r3
            mg.o6 r3 = r3.f21011z
            com.ots.core.utils.customview.edit.TextInputLayout r3 = r3.J
            java.lang.String r3 = r3.getValidatorTypeText()
            of.b r4 = of.b.ERROR
            r1.a(r3, r4)
            d2.l r1 = r12.M()
            mg.c4 r1 = (mg.c4) r1
            mg.o6 r1 = r1.f21011z
            com.ots.core.utils.customview.edit.TextInputLayout r1 = r1.J
            r1.requestFocus()
            goto L_0x027d
        L_0x01b4:
            d2.l r1 = r12.M()
            mg.c4 r1 = (mg.c4) r1
            mg.o6 r1 = r1.f21011z
            com.ots.core.utils.customview.edit.TextInputLayout r1 = r1.G
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x01f6
            of.a r1 = new of.a
            d2.l r4 = r12.M()
            mg.c4 r4 = (mg.c4) r4
            android.view.View r4 = r4.f8554e
            sk.j.e(r4, r3)
            r1.<init>(r4)
            d2.l r3 = r12.M()
            mg.c4 r3 = (mg.c4) r3
            mg.o6 r3 = r3.f21011z
            com.ots.core.utils.customview.edit.TextInputLayout r3 = r3.G
            java.lang.String r3 = r3.getValidatorTypeText()
            of.b r4 = of.b.ERROR
            r1.a(r3, r4)
            d2.l r1 = r12.M()
            mg.c4 r1 = (mg.c4) r1
            mg.o6 r1 = r1.f21011z
            com.ots.core.utils.customview.edit.TextInputLayout r1 = r1.G
            r1.requestFocus()
            goto L_0x027d
        L_0x01f6:
            d2.l r1 = r12.M()
            mg.c4 r1 = (mg.c4) r1
            mg.o6 r1 = r1.f21011z
            com.ots.core.utils.customview.edit.TextInputLayout r1 = r1.H
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x0237
            of.a r1 = new of.a
            d2.l r4 = r12.M()
            mg.c4 r4 = (mg.c4) r4
            android.view.View r4 = r4.f8554e
            sk.j.e(r4, r3)
            r1.<init>(r4)
            d2.l r3 = r12.M()
            mg.c4 r3 = (mg.c4) r3
            mg.o6 r3 = r3.f21011z
            com.ots.core.utils.customview.edit.TextInputLayout r3 = r3.H
            java.lang.String r3 = r3.getValidatorTypeText()
            of.b r4 = of.b.ERROR
            r1.a(r3, r4)
            d2.l r1 = r12.M()
            mg.c4 r1 = (mg.c4) r1
            mg.o6 r1 = r1.f21011z
            com.ots.core.utils.customview.edit.TextInputLayout r1 = r1.H
            r1.requestFocus()
            goto L_0x027d
        L_0x0237:
            d2.l r1 = r12.M()
            mg.c4 r1 = (mg.c4) r1
            mg.o6 r1 = r1.f21011z
            androidx.appcompat.widget.AppCompatEditText r1 = r1.D
            android.text.Editable r1 = r1.getText()
            if (r1 != 0) goto L_0x0248
            goto L_0x024c
        L_0x0248:
            java.lang.String r4 = android.support.v4.media.a.j(r1)
        L_0x024c:
            int r1 = r4.length()
            if (r1 != 0) goto L_0x0254
            r1 = r6
            goto L_0x0255
        L_0x0254:
            r1 = r5
        L_0x0255:
            if (r1 == 0) goto L_0x027c
            of.a r1 = new of.a
            d2.l r4 = r12.M()
            mg.c4 r4 = (mg.c4) r4
            android.view.View r4 = r4.f8554e
            sk.j.e(r4, r3)
            r1.<init>(r4)
            of.b r3 = of.b.ERROR
            java.lang.String r4 = "Vui lòng nhập mã OTP"
            r1.a(r4, r3)
            d2.l r1 = r12.M()
            mg.c4 r1 = (mg.c4) r1
            mg.o6 r1 = r1.f21011z
            androidx.appcompat.widget.AppCompatEditText r1 = r1.D
            r1.requestFocus()
            goto L_0x027d
        L_0x027c:
            r5 = r6
        L_0x027d:
            if (r5 == 0) goto L_0x0297
            boolean r1 = r12.U()
            if (r1 == 0) goto L_0x0297
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r12 = r12.X()
            al.d0 r1 = p3.l0.d0(r12)
            gl.b r3 = al.r0.f19085b
            bh.m r4 = new bh.m
            r4.<init>(r12, r2)
            p3.l0.j0(r1, r3, r4, r0)
        L_0x0297:
            return
        L_0x0298:
            java.lang.Object r12 = r11.f6698b
            com.vpa.daugia.module.auth.ui.activity.StepThreeOrganizationActivity r12 = (com.vpa.daugia.module.auth.ui.activity.StepThreeOrganizationActivity) r12
            int r0 = com.vpa.daugia.module.auth.ui.activity.StepThreeOrganizationActivity.Z
            sk.j.f(r12, r7)
            r12.finish()
            return
        L_0x02a5:
            java.lang.Object r12 = r11.f6698b
            com.vpa.daugia.module.auth.ui.activity.StepOneActivity r12 = (com.vpa.daugia.module.auth.ui.activity.StepOneActivity) r12
            int r0 = com.vpa.daugia.module.auth.ui.activity.StepOneActivity.T
            sk.j.f(r12, r7)
            r12.finish()
            return
        L_0x02b2:
            java.lang.Object r12 = r11.f6698b
            com.vpa.daugia.module.auth.ui.activity.StepFourActivity r12 = (com.vpa.daugia.module.auth.ui.activity.StepFourActivity) r12
            int r0 = com.vpa.daugia.module.auth.ui.activity.StepFourActivity.R
            sk.j.f(r12, r7)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.vpa.daugia.ui.MainActivity> r1 = com.vpa.daugia.ui.MainActivity.class
            r0.<init>(r12, r1)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0.setFlags(r1)
            r12.startActivity(r0)
            r12.finish()
            return
        L_0x02ce:
            java.lang.Object r12 = r11.f6698b
            com.vpa.daugia.module.auth.ui.activity.RegisterAccountActivity r12 = (com.vpa.daugia.module.auth.ui.activity.RegisterAccountActivity) r12
            java.lang.String r0 = com.vpa.daugia.module.auth.ui.activity.RegisterAccountActivity.T
            sk.j.f(r12, r7)
            d2.l r0 = r12.M()
            mg.b1 r0 = (mg.b1) r0
            android.widget.RadioButton r0 = r0.f20971z
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x02f0
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.vpa.daugia.module.auth.ui.activity.StepOneActivity> r1 = com.vpa.daugia.module.auth.ui.activity.StepOneActivity.class
            r0.<init>(r12, r1)
            r12.startActivity(r0)
            goto L_0x0309
        L_0x02f0:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.vpa.daugia.module.auth.ui.activity.StepTwoActivity> r1 = com.vpa.daugia.module.auth.ui.activity.StepTwoActivity.class
            r0.<init>(r12, r1)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = com.vpa.daugia.module.auth.ui.activity.RegisterAccountActivity.T
            java.lang.String r3 = com.vpa.daugia.module.auth.ui.activity.RegisterAccountActivity.V
            r1.putString(r2, r3)
            r0.putExtras(r1)
            r12.startActivity(r0)
        L_0x0309:
            r12.finish()
            return
        L_0x030d:
            java.lang.Object r12 = r11.f6698b
            com.vpa.daugia.module.auth.ui.activity.OtpActivity r12 = (com.vpa.daugia.module.auth.ui.activity.OtpActivity) r12
            int r1 = com.vpa.daugia.module.auth.ui.activity.OtpActivity.V
            sk.j.f(r12, r7)
            boolean r1 = r12.U
            if (r1 == 0) goto L_0x0349
            java.lang.String r1 = r12.T
            java.lang.String r3 = "ACTION_EMAIL"
            boolean r1 = sk.j.a(r1, r3)
            if (r1 == 0) goto L_0x0337
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r12 = r12.T()
            al.d0 r1 = p3.l0.d0(r12)
            gl.b r3 = al.r0.f19085b
            bh.f r4 = new bh.f
            r4.<init>(r12, r2)
            p3.l0.j0(r1, r3, r4, r0)
            goto L_0x0349
        L_0x0337:
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r12 = r12.T()
            al.d0 r1 = p3.l0.d0(r12)
            gl.b r3 = al.r0.f19085b
            bh.g r4 = new bh.g
            r4.<init>(r12, r2)
            p3.l0.j0(r1, r3, r4, r0)
        L_0x0349:
            return
        L_0x034a:
            java.lang.Object r12 = r11.f6698b
            com.vpa.daugia.module.auth.ui.activity.ForgotActivity r12 = (com.vpa.daugia.module.auth.ui.activity.ForgotActivity) r12
            int r0 = com.vpa.daugia.module.auth.ui.activity.ForgotActivity.S
            sk.j.f(r12, r7)
            r12.finish()
            return
        L_0x0357:
            java.lang.Object r12 = r11.f6698b
            com.vpa.daugia.module.auth.ui.activity.ChangePasswordActivity r12 = (com.vpa.daugia.module.auth.ui.activity.ChangePasswordActivity) r12
            int r0 = com.vpa.daugia.module.auth.ui.activity.ChangePasswordActivity.Y
            sk.j.f(r12, r7)
            r12.finish()
            return
        L_0x0364:
            java.lang.Object r12 = r11.f6698b
            com.google.android.material.snackbar.Snackbar r12 = (com.google.android.material.snackbar.Snackbar) r12
            java.lang.String r0 = "$snackbar"
            sk.j.f(r12, r0)
            r0 = 3
            r12.b(r0)
            return
        L_0x0372:
            java.lang.Object r12 = r11.f6698b
            vg.h r12 = (vg.h) r12
            sk.j.f(r12, r7)
            r12.a()
            return
        L_0x037d:
            java.lang.Object r12 = r11.f6698b
            vg.b r12 = (vg.b) r12
            sk.j.f(r12, r7)
            r12.a()
            return
        L_0x0388:
            java.lang.Object r12 = r11.f6698b
            com.ots.core.utils.customview.MenuItemLayout r12 = (com.ots.core.utils.customview.MenuItemLayout) r12
            int r0 = com.ots.core.utils.customview.MenuItemLayout.f8373d
            sk.j.f(r12, r7)
            ck.a<java.lang.Boolean> r0 = r12.f8374a
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.d(r1)
            rk.a<ek.i> r12 = r12.f8376c
            r12.invoke()
            return
        L_0x039e:
            java.lang.Object r12 = r11.f6698b
            com.ots.core.utils.customview.a r12 = (com.ots.core.utils.customview.a) r12
            int r0 = com.ots.core.utils.customview.a.F0
            sk.j.f(r12, r7)
            r12.o0()
            return
        L_0x03ab:
            java.lang.Object r12 = r11.f6698b
            com.google.android.material.bottomsheet.b r12 = (com.google.android.material.bottomsheet.b) r12
            java.lang.String r0 = "$dialog"
            sk.j.f(r12, r0)
            boolean r0 = r12.isShowing()
            if (r0 == 0) goto L_0x03bd
            r12.dismiss()
        L_0x03bd:
            return
        L_0x03be:
            java.lang.Object r12 = r11.f6698b
            jf.d r12 = (jf.d) r12
            int r0 = jf.d.J0
            sk.j.f(r12, r7)
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.getDefault()
            r0.<init>(r3, r1)
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r3 = "HH"
            r1.<init>(r3, r2)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r4 = "mm"
            r2.<init>(r4, r3)
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            jf.d$b r4 = r12.s0()
            com.ots.core.utils.commom.PickerLayoutManager r5 = r12.t0()
            int r5 = r5.w1()
            java.io.Serializable r4 = r4.w(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Date r0 = r0.parse(r4)
            if (r0 == 0) goto L_0x0405
            r3.setTime(r0)
        L_0x0405:
            jf.d$b r0 = r12.u0()
            com.ots.core.utils.commom.PickerLayoutManager r4 = r12.v0()
            int r4 = r4.w1()
            java.io.Serializable r0 = r0.w(r4)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Date r0 = r1.parse(r0)
            if (r0 == 0) goto L_0x0426
            r1 = 11
            int r0 = r0.getHours()
            r3.set(r1, r0)
        L_0x0426:
            jf.d$b r0 = r12.w0()
            com.ots.core.utils.commom.PickerLayoutManager r1 = r12.x0()
            int r1 = r1.w1()
            java.io.Serializable r0 = r0.w(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Date r0 = r2.parse(r0)
            if (r0 == 0) goto L_0x0447
            r1 = 12
            int r0 = r0.getMinutes()
            r3.set(r1, r0)
        L_0x0447:
            jf.d$a r0 = r12.I0
            sk.j.c(r0)
            sk.j.c(r3)
            r0.a(r12, r3)
            r12.o0()
            return
        L_0x0456:
            java.lang.Object r12 = r11.f6698b
            jf.a r12 = (jf.a) r12
            int r0 = jf.a.f11885w0
            sk.j.f(r12, r7)
            jf.a$a r0 = r12.f11887v0
            if (r0 == 0) goto L_0x046c
            java.lang.String r1 = "ACTION_LIBRARY"
            r0.a(r1)
            r12.o0()
            return
        L_0x046c:
            sk.j.l(r1)
            throw r2
        L_0x0470:
            java.lang.Object r12 = r11.f6698b
            hf.r r12 = (hf.r) r12
            java.lang.String r0 = "$binding"
            sk.j.f(r12, r0)
            android.widget.RadioButton r12 = r12.f10809w
            boolean r0 = r12.isChecked()
            r0 = r0 ^ r6
            r12.setChecked(r0)
            return
        L_0x0484:
            java.lang.Object r12 = r11.f6698b
            com.ots.core.base.BaseActivity r12 = (com.ots.core.base.BaseActivity) r12
            int r0 = com.ots.core.base.BaseActivity.N
            sk.j.f(r12, r7)
            boolean r0 = r12.isTaskRoot()
            if (r0 != 0) goto L_0x0496
            r12.finish()
        L_0x0496:
            return
        L_0x0497:
            java.lang.Object r12 = r11.f6698b
            com.google.android.material.search.SearchView r12 = (com.google.android.material.search.SearchView) r12
            android.widget.EditText r0 = r12.f6670q
            r0.setText(r4)
            r12.i()
            return
        L_0x04a4:
            java.lang.Object r12 = r11.f6698b
            com.vpa.daugia.module.notification.ui.activity.NotificationManagerActivity r12 = (com.vpa.daugia.module.notification.ui.activity.NotificationManagerActivity) r12
            int r0 = com.vpa.daugia.module.notification.ui.activity.NotificationManagerActivity.T
            sk.j.f(r12, r7)
            java.lang.String r0 = "layout_inflater"
            java.lang.Object r0 = r12.getSystemService(r0)
            java.lang.String r1 = "null cannot be cast to non-null type android.view.LayoutInflater"
            sk.j.d(r0, r1)
            android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
            r1 = 2131558686(0x7f0d011e, float:1.8742695E38)
            android.view.View r0 = r0.inflate(r1, r2)
            android.widget.PopupWindow r1 = new android.widget.PopupWindow
            r2 = -2
            r1.<init>(r0, r2, r2, r6)
            r2 = 2131231087(0x7f08016f, float:1.8078245E38)
            android.graphics.drawable.Drawable r2 = r12.getDrawable(r2)
            r1.setBackgroundDrawable(r2)
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            d2.l r3 = r12.M()
            mg.k0 r3 = (mg.k0) r3
            android.widget.ImageView r3 = r3.f21142w
            int r3 = r3.getRight()
            int r2 = r2 - r3
            android.content.res.Resources r3 = r12.getResources()
            r4 = 2131165466(0x7f07011a, float:1.794515E38)
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r2 - r3
            android.content.res.Resources r3 = r12.getResources()
            r4 = 2131165467(0x7f07011b, float:1.7945152E38)
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r2 - r3
            d2.l r3 = r12.M()
            mg.k0 r3 = (mg.k0) r3
            android.widget.ImageView r3 = r3.f21142w
            r3.getHeight()
            d2.l r3 = r12.M()
            mg.k0 r3 = (mg.k0) r3
            android.widget.ImageView r3 = r3.f21142w
            android.content.res.Resources r4 = r12.getResources()
            r7 = 2131165706(0x7f07020a, float:1.7945637E38)
            int r4 = r4.getDimensionPixelSize(r7)
            r1.showAsDropDown(r3, r2, r4)
            r2 = 2132083037(0x7f15015d, float:1.9806205E38)
            r1.setAnimationStyle(r2)
            r2 = 2131362742(0x7f0a03b6, float:1.8345273E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 2131362799(0x7f0a03ef, float:1.8345389E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 2131362812(0x7f0a03fc, float:1.8345415E38)
            android.view.View r0 = r0.findViewById(r4)
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.vpa.daugia.module.notification.ui.NotificationViewModel r4 = r12.U()
            r2.p r4 = r4.f19779m
            java.lang.Object r4 = r4.d()
            java.lang.Integer r4 = (java.lang.Integer) r4
            r7 = 2131231430(0x7f0802c6, float:1.807894E38)
            r8 = 2131231089(0x7f080171, float:1.807825E38)
            r9 = 2131099763(0x7f060073, float:1.7811888E38)
            if (r4 != 0) goto L_0x055a
            goto L_0x056e
        L_0x055a:
            int r10 = r4.intValue()
            if (r10 != 0) goto L_0x056e
            android.content.res.ColorStateList r4 = r12.getColorStateList(r9)
            r0.setBackgroundTintList(r4)
            r0.setBackgroundResource(r8)
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r5, r5, r7, r5)
            goto L_0x0592
        L_0x056e:
            if (r4 != 0) goto L_0x0571
            goto L_0x0585
        L_0x0571:
            int r4 = r4.intValue()
            if (r4 != r6) goto L_0x0585
            android.content.res.ColorStateList r4 = r12.getColorStateList(r9)
            r3.setBackgroundTintList(r4)
            r3.setBackgroundResource(r8)
            r3.setCompoundDrawablesRelativeWithIntrinsicBounds(r5, r5, r7, r5)
            goto L_0x0592
        L_0x0585:
            android.content.res.ColorStateList r4 = r12.getColorStateList(r9)
            r2.setBackgroundTintList(r4)
            r2.setBackgroundResource(r8)
            r2.setCompoundDrawablesRelativeWithIntrinsicBounds(r5, r5, r7, r5)
        L_0x0592:
            sk.j.c(r2)
            wh.h r4 = new wh.h
            r4.<init>(r1, r12)
            kf.b r5 = new kf.b
            r6 = 500(0x1f4, double:2.47E-321)
            r5.<init>(r6, r2, r4)
            r2.setOnClickListener(r5)
            sk.j.c(r3)
            wh.i r2 = new wh.i
            r2.<init>(r1, r12)
            kf.b r4 = new kf.b
            r4.<init>(r6, r3, r2)
            r3.setOnClickListener(r4)
            sk.j.c(r0)
            wh.j r2 = new wh.j
            r2.<init>(r1, r12)
            kf.b r12 = new kf.b
            r12.<init>(r6, r0, r2)
            r0.setOnClickListener(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.search.h.onClick(android.view.View):void");
    }
}
