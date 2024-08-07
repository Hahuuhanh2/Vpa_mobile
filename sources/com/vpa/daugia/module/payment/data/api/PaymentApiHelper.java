package com.vpa.daugia.module.payment.data.api;

import com.vpa.daugia.module.payment.data.model.BankQr;
import com.vpa.daugia.module.payment.data.model.Fee;
import ef.k;
import ik.d;
import java.util.ArrayList;
import lg.b;
import sk.j;
import ze.a;

/* compiled from: PaymentApiHelper.kt */
public final class PaymentApiHelper {
    private final PaymentService api;
    private final b sharedPrefs;

    public PaymentApiHelper(PaymentService paymentService, b bVar) {
        j.f(paymentService, "api");
        j.f(bVar, "sharedPrefs");
        this.api = paymentService;
        this.sharedPrefs = bVar;
    }

    public final Object getBankQr(String str, d<? super k<ArrayList<BankQr>>> dVar) {
        return this.api.getBankQr(a.b(this.sharedPrefs, true), str, dVar);
    }

    public final Object getFee(String str, d<? super k<Fee>> dVar) {
        return this.api.getFee(a.b(this.sharedPrefs, true), str, dVar);
    }
}
