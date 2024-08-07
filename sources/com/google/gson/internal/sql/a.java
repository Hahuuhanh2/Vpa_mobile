package com.google.gson.internal.sql;

import bc.v;
import java.sql.Date;
import java.sql.Timestamp;

/* compiled from: SqlTypesSupport */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f7852a;

    /* renamed from: b  reason: collision with root package name */
    public static final v f7853b;

    /* renamed from: c  reason: collision with root package name */
    public static final v f7854c;

    /* renamed from: d  reason: collision with root package name */
    public static final v f7855d;

    /* renamed from: com.google.gson.internal.sql.a$a  reason: collision with other inner class name */
    /* compiled from: SqlTypesSupport */
    public class C0072a extends com.google.gson.internal.bind.a<Date> {
    }

    /* compiled from: SqlTypesSupport */
    public class b extends com.google.gson.internal.bind.a<Timestamp> {
    }

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f7852a = z10;
        if (z10) {
            Class<Date> cls = Date.class;
            Class<Timestamp> cls2 = Timestamp.class;
            f7853b = SqlDateTypeAdapter.f7846b;
            f7854c = SqlTimeTypeAdapter.f7848b;
            f7855d = SqlTimestampTypeAdapter.f7850b;
            return;
        }
        f7853b = null;
        f7854c = null;
        f7855d = null;
    }
}
