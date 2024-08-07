package com.vpa.daugia.module.auction.data.model;

import lk.a;
import p3.l0;

/* compiled from: TypeSSE.kt */
public enum TypeSSE {
    SET_PRICE,
    HEARTBEAT,
    START,
    WAITTING_TIME,
    EXTEND_TIME,
    RESULT_ROOM,
    END_ROOM,
    CANCEL_ROOM;

    /* access modifiers changed from: public */
    static {
        TypeSSE[] $values;
        $ENTRIES = l0.K($values);
    }

    public static a<TypeSSE> getEntries() {
        return $ENTRIES;
    }
}
