package com.vpa.daugia.module.payment.ui;

import al.r0;
import com.vpa.daugia.module.payment.data.api.PaymentApiHelper;
import com.vpa.daugia.module.payment.data.model.BankQr;
import com.vpa.daugia.module.payment.data.model.Fee;
import com.vpa.daugia.module.setting.data.api.SettingApiHelper;
import d2.i;
import gf.b;
import ik.d;
import java.util.ArrayList;
import p3.l0;
import r2.p;
import r2.v;
import sk.j;
import yh.a;
import ze.f;

/* compiled from: PaymentViewModel.kt */
public final class PaymentViewModel extends v {

    /* renamed from: d  reason: collision with root package name */
    public final PaymentApiHelper f19789d;

    /* renamed from: e  reason: collision with root package name */
    public final SettingApiHelper f19790e;

    /* renamed from: f  reason: collision with root package name */
    public final p<ArrayList<BankQr>> f19791f = new p<>();

    /* renamed from: g  reason: collision with root package name */
    public p<BankQr> f19792g = new p<>();

    /* renamed from: h  reason: collision with root package name */
    public final i<ArrayList<b>> f19793h = new i<>();

    /* renamed from: i  reason: collision with root package name */
    public final p<f<Fee>> f19794i = new p<>();

    public PaymentViewModel(PaymentApiHelper paymentApiHelper, lg.b bVar, SettingApiHelper settingApiHelper) {
        j.f(paymentApiHelper, "apiHelper");
        j.f(bVar, "sharedPrefsHelper");
        j.f(settingApiHelper, "settingApiHelper");
        this.f19789d = paymentApiHelper;
        this.f19790e = settingApiHelper;
        l0.j0(l0.d0(this), r0.f19085b, new a(this, (d<? super a>) null), 2);
    }
}
