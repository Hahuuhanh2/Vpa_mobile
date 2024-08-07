package com.vpa.daugia.module.cart.data.model;

import lk.a;
import p3.l0;

/* compiled from: CartStatus.kt */
public enum CartStatus {
    REFUND("Đã hoàn tiền", 4, "REFUND"),
    PAID("Đã thanh toán", 0, "PAID"),
    NOT_PAID("Chưa thanh toán", 0, "NOT_PAID");
    
    private final String code;
    private final String text;
    private final int value;

    /* access modifiers changed from: public */
    static {
        CartStatus[] $values;
        $ENTRIES = l0.K($values);
    }

    private CartStatus(String str, int i10, String str2) {
        this.text = str;
        this.value = i10;
        this.code = str2;
    }

    public static a<CartStatus> getEntries() {
        return $ENTRIES;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getText() {
        return this.text;
    }

    public final int getValue() {
        return this.value;
    }
}
