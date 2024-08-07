package com.google.gson.internal.bind;

import bc.h;
import bc.u;
import bc.v;
import com.google.gson.JsonSyntaxException;
import dc.n;
import f0.b0;
import gc.a;
import hc.b;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

public final class DateTypeAdapter extends u<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final v f7745b = new v() {
        public final <T> u<T> a(h hVar, a<T> aVar) {
            if (aVar.f10437a == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f7746a;

    public DateTypeAdapter() {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        this.f7746a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (n.f8910a >= 9) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    public final Object a(hc.a aVar) {
        if (aVar.k0() == 9) {
            aVar.d0();
            return null;
        }
        String g02 = aVar.g0();
        synchronized (this.f7746a) {
            Iterator it = this.f7746a.iterator();
            while (it.hasNext()) {
                try {
                    Date parse = ((DateFormat) it.next()).parse(g02);
                    return parse;
                } catch (ParseException unused) {
                }
            }
            try {
                return ec.a.b(g02, new ParsePosition(0));
            } catch (ParseException e10) {
                StringBuilder w9 = b0.w("Failed parsing '", g02, "' as Date; at path ");
                w9.append(aVar.E());
                throw new JsonSyntaxException(w9.toString(), e10);
            }
        }
    }

    public final void b(b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.B();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f7746a.get(0);
        synchronized (this.f7746a) {
            format = dateFormat.format(date);
        }
        bVar.U(format);
    }
}
