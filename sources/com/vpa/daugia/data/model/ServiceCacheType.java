package com.vpa.daugia.data.model;

import lk.a;
import p3.l0;

/* compiled from: BaseServiceCacheModel.kt */
public enum ServiceCacheType {
    GET,
    POST,
    UPDATE;

    /* access modifiers changed from: public */
    static {
        ServiceCacheType[] $values;
        $ENTRIES = l0.K($values);
    }

    public static a<ServiceCacheType> getEntries() {
        return $ENTRIES;
    }
}
