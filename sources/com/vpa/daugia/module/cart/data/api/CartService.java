package com.vpa.daugia.module.cart.data.api;

import com.vpa.daugia.module.cart.data.model.Cart;
import com.vpa.daugia.module.cart.data.model.Order;
import ef.k;
import ef.n;
import ik.d;
import java.util.ArrayList;
import java.util.Map;
import xl.a;
import xl.f;
import xl.j;
import xl.o;
import xl.t;

/* compiled from: CartService.kt */
public interface CartService {

    /* compiled from: CartService.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getCartList$default(CartService cartService, Map map, String str, Integer num, Integer num2, Integer num3, Long l10, d dVar, int i10, Object obj) {
            String str2;
            Integer num4;
            Integer num5;
            Integer num6;
            Long l11;
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if ((i10 & 4) != 0) {
                    num4 = null;
                } else {
                    num4 = num;
                }
                if ((i10 & 8) != 0) {
                    num5 = null;
                } else {
                    num5 = num2;
                }
                if ((i10 & 16) != 0) {
                    num6 = 100;
                } else {
                    num6 = num3;
                }
                if ((i10 & 32) != 0) {
                    l11 = Long.valueOf(System.currentTimeMillis());
                } else {
                    l11 = l10;
                }
                return cartService.getCartList(map, str2, num4, num5, num6, l11, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCartList");
        }

        public static /* synthetic */ Object getCount$default(CartService cartService, Map map, String str, Long l10, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str = null;
                }
                if ((i10 & 4) != 0) {
                    l10 = Long.valueOf(System.currentTimeMillis());
                }
                return cartService.getCount(map, str, l10, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCount");
        }

        public static /* synthetic */ Object getDetailByOrderId$default(CartService cartService, Map map, String str, Long l10, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str = null;
                }
                if ((i10 & 4) != 0) {
                    l10 = Long.valueOf(System.currentTimeMillis());
                }
                return cartService.getDetailByOrderId(map, str, l10, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDetailByOrderId");
        }

        public static /* synthetic */ Object removeCart$default(CartService cartService, Map map, Object obj, d dVar, int i10, Object obj2) {
            if (obj2 == null) {
                if ((i10 & 2) != 0) {
                    obj = null;
                }
                return cartService.removeCart(map, obj, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeCart");
        }
    }

    @f("web-api/user-bidding/api/order/get-orders-payment-status")
    Object getCartList(@j Map<String, String> map, @t("paymentStatusFilter") String str, @t("status") Integer num, @t("page") Integer num2, @t("size") Integer num3, @t("timestamp") Long l10, d<? super k<n<Cart>>> dVar);

    @f("web-api/user-bidding/api/order/get-count-orders-payment-status")
    Object getCount(@j Map<String, String> map, @t("paymentStatusFilter") String str, @t("timestamp") Long l10, d<? super k<Integer>> dVar);

    @f("web-api/user-bidding/api/order/get-order-detail-by-orderId")
    Object getDetailByOrderId(@j Map<String, String> map, @t("id") String str, @t("timestamp") Long l10, d<? super k<ArrayList<Order>>> dVar);

    @o("web-api/user-bidding/api/order/remove-multi-orders")
    Object removeCart(@j Map<String, String> map, @a Object obj, d<? super k<Object>> dVar);
}
