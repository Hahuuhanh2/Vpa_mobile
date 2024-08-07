package com.google.gson.internal.sql;

import bc.h;
import bc.u;
import bc.v;
import com.google.gson.JsonSyntaxException;
import f0.b0;
import gc.a;
import hc.b;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class SqlTimeTypeAdapter extends u<Time> {

    /* renamed from: b  reason: collision with root package name */
    public static final v f7848b = new v() {
        public final <T> u<T> a(h hVar, a<T> aVar) {
            if (aVar.f10437a == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final SimpleDateFormat f7849a = new SimpleDateFormat("hh:mm:ss a");

    public final Object a(hc.a aVar) {
        Time time;
        if (aVar.k0() == 9) {
            aVar.d0();
            return null;
        }
        String g02 = aVar.g0();
        try {
            synchronized (this) {
                time = new Time(this.f7849a.parse(g02).getTime());
            }
            return time;
        } catch (ParseException e10) {
            StringBuilder w9 = b0.w("Failed parsing '", g02, "' as SQL Time; at path ");
            w9.append(aVar.E());
            throw new JsonSyntaxException(w9.toString(), e10);
        }
    }

    public final void b(b bVar, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            bVar.B();
            return;
        }
        synchronized (this) {
            format = this.f7849a.format(time);
        }
        bVar.U(format);
    }
}
