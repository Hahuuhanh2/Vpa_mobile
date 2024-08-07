package com.google.gson.internal.sql;

import bc.h;
import bc.u;
import bc.v;
import gc.a;
import hc.b;
import java.sql.Timestamp;
import java.util.Date;

public final class SqlTimestampTypeAdapter extends u<Timestamp> {

    /* renamed from: b  reason: collision with root package name */
    public static final v f7850b = new v() {
        public final <T> u<T> a(h hVar, a<T> aVar) {
            if (aVar.f10437a != Timestamp.class) {
                return null;
            }
            hVar.getClass();
            return new SqlTimestampTypeAdapter(hVar.f(new a(Date.class)));
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final u<Date> f7851a;

    public SqlTimestampTypeAdapter(u uVar) {
        this.f7851a = uVar;
    }

    public final Object a(hc.a aVar) {
        Date a10 = this.f7851a.a(aVar);
        if (a10 != null) {
            return new Timestamp(a10.getTime());
        }
        return null;
    }

    public final void b(b bVar, Object obj) {
        this.f7851a.b(bVar, (Timestamp) obj);
    }
}
