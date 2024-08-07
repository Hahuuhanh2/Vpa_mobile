package com.google.protobuf;

import com.google.protobuf.q;
import java.util.Map;

/* compiled from: MapFieldSchemaLite */
public final class t implements s {
    public final r a(Object obj, Object obj2) {
        r rVar = (r) obj;
        r rVar2 = (r) obj2;
        if (!rVar2.isEmpty()) {
            if (!rVar.f7937a) {
                rVar = rVar.e();
            }
            rVar.c();
            if (!rVar2.isEmpty()) {
                rVar.putAll(rVar2);
            }
        }
        return rVar;
    }

    public final Object b(Object obj) {
        ((r) obj).f7937a = false;
        return obj;
    }

    public final q.a<?, ?> c(Object obj) {
        return ((q) obj).f7929a;
    }

    public final int d(int i10, Object obj, Object obj2) {
        r rVar = (r) obj;
        q qVar = (q) obj2;
        int i11 = 0;
        if (!rVar.isEmpty()) {
            for (Map.Entry entry : rVar.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                qVar.getClass();
                int b02 = CodedOutputStream.b0(i10);
                int a10 = q.a(qVar.f7929a, key, value);
                i11 += CodedOutputStream.d0(a10) + a10 + b02;
            }
        }
        return i11;
    }

    public final r e(Object obj) {
        return (r) obj;
    }
}
