package com.vpa.daugia.module.payment.data.api;

import dk.a;
import lg.b;

public final class PaymentApiHelper_Factory implements a {
    private final a<PaymentService> apiProvider;
    private final a<b> sharedPrefsProvider;

    public PaymentApiHelper_Factory(a<PaymentService> aVar, a<b> aVar2) {
        this.apiProvider = aVar;
        this.sharedPrefsProvider = aVar2;
    }

    public static PaymentApiHelper_Factory create(a<PaymentService> aVar, a<b> aVar2) {
        return new PaymentApiHelper_Factory(aVar, aVar2);
    }

    public static PaymentApiHelper newInstance(PaymentService paymentService, b bVar) {
        return new PaymentApiHelper(paymentService, bVar);
    }

    public PaymentApiHelper get() {
        return newInstance(this.apiProvider.get(), this.sharedPrefsProvider.get());
    }
}
