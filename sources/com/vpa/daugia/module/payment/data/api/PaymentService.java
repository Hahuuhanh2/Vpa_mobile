package com.vpa.daugia.module.payment.data.api;

import com.vpa.daugia.module.payment.data.model.BankQr;
import com.vpa.daugia.module.payment.data.model.Fee;
import ef.k;
import ik.d;
import java.util.ArrayList;
import java.util.Map;
import xl.f;
import xl.j;
import xl.t;

/* compiled from: PaymentService.kt */
public interface PaymentService {

    /* compiled from: PaymentService.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getBankQr$default(PaymentService paymentService, Map map, String str, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str = null;
                }
                return paymentService.getBankQr(map, str, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBankQr");
        }

        public static /* synthetic */ Object getFee$default(PaymentService paymentService, Map map, String str, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str = null;
                }
                return paymentService.getFee(map, str, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFee");
        }
    }

    @f("web-api/user-bidding/api/order/get-bank-qr")
    Object getBankQr(@j Map<String, String> map, @t("id") String str, d<? super k<ArrayList<BankQr>>> dVar);

    @f("web-api/user-bidding/api/order/get-order-fee")
    Object getFee(@j Map<String, String> map, @t("id") String str, d<? super k<Fee>> dVar);
}
