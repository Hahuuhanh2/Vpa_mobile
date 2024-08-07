package com.vpa.daugia.module.cart.data.api;

import dk.a;
import lg.b;

public final class CartApiHelper_Factory implements a {
    private final a<CartService> apiProvider;
    private final a<b> sharedPrefsProvider;

    public CartApiHelper_Factory(a<CartService> aVar, a<b> aVar2) {
        this.apiProvider = aVar;
        this.sharedPrefsProvider = aVar2;
    }

    public static CartApiHelper_Factory create(a<CartService> aVar, a<b> aVar2) {
        return new CartApiHelper_Factory(aVar, aVar2);
    }

    public static CartApiHelper newInstance(CartService cartService, b bVar) {
        return new CartApiHelper(cartService, bVar);
    }

    public CartApiHelper get() {
        return newInstance(this.apiProvider.get(), this.sharedPrefsProvider.get());
    }
}
