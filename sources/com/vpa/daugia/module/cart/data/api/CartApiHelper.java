package com.vpa.daugia.module.cart.data.api;

import com.vpa.daugia.module.cart.data.api.CartService;
import com.vpa.daugia.module.cart.data.model.Cart;
import com.vpa.daugia.module.cart.data.model.CartStatus;
import com.vpa.daugia.module.cart.data.model.Order;
import ef.k;
import ef.n;
import ik.d;
import java.util.ArrayList;
import lg.b;
import sk.j;
import ze.a;

/* compiled from: CartApiHelper.kt */
public final class CartApiHelper {
    private final CartService api;
    private final b sharedPrefs;

    public CartApiHelper(CartService cartService, b bVar) {
        j.f(cartService, "api");
        j.f(bVar, "sharedPrefs");
        this.api = cartService;
        this.sharedPrefs = bVar;
    }

    public final Object getCartList(CartStatus cartStatus, int i10, d<? super k<n<Cart>>> dVar) {
        return CartService.DefaultImpls.getCartList$default(this.api, a.b(this.sharedPrefs, true), cartStatus.getCode(), new Integer(cartStatus.getValue()), new Integer(i10), (Integer) null, (Long) null, dVar, 48, (Object) null);
    }

    public final Object getCount(CartStatus cartStatus, d<? super k<Integer>> dVar) {
        return CartService.DefaultImpls.getCount$default(this.api, a.b(this.sharedPrefs, true), cartStatus.getCode(), (Long) null, dVar, 4, (Object) null);
    }

    public final Object getDetailByOrderId(String str, d<? super k<ArrayList<Order>>> dVar) {
        return CartService.DefaultImpls.getDetailByOrderId$default(this.api, a.b(this.sharedPrefs, true), str, (Long) null, dVar, 4, (Object) null);
    }

    public final Object removeCart(Object obj, d<? super k<Object>> dVar) {
        return this.api.removeCart(a.b(this.sharedPrefs, true), obj, dVar);
    }
}
