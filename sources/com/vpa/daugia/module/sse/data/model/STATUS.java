package com.vpa.daugia.module.sse.data.model;

import lk.a;
import p3.l0;

/* compiled from: SSEEventData.kt */
public enum STATUS {
    SUCCESS,
    ERROR,
    NONE,
    CLOSED,
    OPEN;

    /* access modifiers changed from: public */
    static {
        STATUS[] $values;
        $ENTRIES = l0.K($values);
    }

    public static a<STATUS> getEntries() {
        return $ENTRIES;
    }
}
