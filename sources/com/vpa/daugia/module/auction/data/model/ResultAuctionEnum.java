package com.vpa.daugia.module.auction.data.model;

import lk.a;
import p3.l0;

/* compiled from: ResultAuctionEnum.kt */
public enum ResultAuctionEnum {
    CANCEL(3, "Dừng đấu giá"),
    SLIP(2, "Không trúng đấu giá"),
    WIN(1, "Trúng đấu giá");
    
    private final String text;
    private final int value;

    /* access modifiers changed from: public */
    static {
        ResultAuctionEnum[] $values;
        $ENTRIES = l0.K($values);
    }

    private ResultAuctionEnum(int i10, String str) {
        this.value = i10;
        this.text = str;
    }

    public static a<ResultAuctionEnum> getEntries() {
        return $ENTRIES;
    }

    public final String getText() {
        return this.text;
    }

    public final int getValue() {
        return this.value;
    }
}
