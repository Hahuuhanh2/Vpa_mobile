package com.google.gson.internal.sql;

import bc.h;
import bc.u;
import bc.v;
import com.google.gson.JsonSyntaxException;
import f0.b0;
import gc.a;
import hc.b;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class SqlDateTypeAdapter extends u<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final v f7846b = new v() {
        public final <T> u<T> a(h hVar, a<T> aVar) {
            if (aVar.f10437a == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final SimpleDateFormat f7847a = new SimpleDateFormat("MMM d, yyyy");

    public final Object a(hc.a aVar) {
        java.util.Date parse;
        if (aVar.k0() == 9) {
            aVar.d0();
            return null;
        }
        String g02 = aVar.g0();
        try {
            synchronized (this) {
                parse = this.f7847a.parse(g02);
            }
            return new Date(parse.getTime());
        } catch (ParseException e10) {
            StringBuilder w9 = b0.w("Failed parsing '", g02, "' as SQL Date; at path ");
            w9.append(aVar.E());
            throw new JsonSyntaxException(w9.toString(), e10);
        }
    }

    public final void b(b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.B();
            return;
        }
        synchronized (this) {
            format = this.f7847a.format(date);
        }
        bVar.U(format);
    }
}
