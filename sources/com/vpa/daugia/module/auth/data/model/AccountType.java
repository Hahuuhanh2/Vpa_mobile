package com.vpa.daugia.module.auth.data.model;

import lk.a;
import p3.l0;

/* compiled from: AccountType.kt */
public enum AccountType {
    PERSON("Cá nhân", 1),
    ORGANIZATION("Tổ chức", 2);
    
    private final String text;
    private final int value;

    /* access modifiers changed from: public */
    static {
        AccountType[] $values;
        $ENTRIES = l0.K($values);
    }

    private AccountType(String str, int i10) {
        this.text = str;
        this.value = i10;
    }

    public static a<AccountType> getEntries() {
        return $ENTRIES;
    }

    public final String getText() {
        return this.text;
    }

    public final int getValue() {
        return this.value;
    }
}
