package com.vpa.daugia.module.common.data.model;

import lk.a;
import p3.l0;

/* compiled from: VehicleType.kt */
public enum VehicleType {
    AUTOMOBILE("Xe con", 1),
    BUS("Xe khách", 2),
    TRUCK("Xe tải", 3),
    VAN("Xe tải van", 4);
    
    private final String text;
    private final int value;

    /* access modifiers changed from: public */
    static {
        VehicleType[] $values;
        $ENTRIES = l0.K($values);
    }

    private VehicleType(String str, int i10) {
        this.text = str;
        this.value = i10;
    }

    public static a<VehicleType> getEntries() {
        return $ENTRIES;
    }

    public final String getText() {
        return this.text;
    }

    public final int getValue() {
        return this.value;
    }
}
