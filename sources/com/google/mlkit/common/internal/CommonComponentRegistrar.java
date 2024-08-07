package com.google.mlkit.common.internal;

import al.g0;
import ca.b;
import com.google.android.gms.internal.mlkit_common.zzar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import jc.a;
import kc.c;
import lc.d;
import lc.h;
import lc.i;
import lc.m;
import p3.l0;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public class CommonComponentRegistrar implements ComponentRegistrar {
    public final List getComponents() {
        Class<a> cls = a.class;
        Class<lc.a> cls2 = lc.a.class;
        Class<c.a> cls3 = c.a.class;
        Class<h> cls4 = h.class;
        b<?> bVar = m.f12927b;
        b.a<mc.b> b10 = b.b(mc.b.class);
        b10.a(ca.m.b(cls4));
        b10.f4619f = g0.f19024n;
        b<mc.b> b11 = b10.b();
        b.a<i> b12 = b.b(i.class);
        b12.f4619f = j7.a.f11710r;
        b<i> b13 = b12.b();
        b.a<c> b14 = b.b(c.class);
        b14.a(new ca.m(2, 0, (Class) cls3));
        b14.f4619f = m9.b.B;
        b<c> b15 = b14.b();
        b.a<d> b16 = b.b(d.class);
        b16.a(ca.m.c(i.class));
        b16.f4619f = l0.f13952c;
        b<d> b17 = b16.b();
        b.a<lc.a> b18 = b.b(cls2);
        b18.f4619f = a.a.f1a;
        b<lc.a> b19 = b18.b();
        b.a<lc.b> b20 = b.b(lc.b.class);
        b20.a(ca.m.b(cls2));
        b20.f4619f = dc.d.f8893a;
        b<lc.b> b21 = b20.b();
        b.a<a> b22 = b.b(cls);
        b22.a(ca.m.b(cls4));
        b22.f4619f = dc.b.f8891a;
        b<a> b23 = b22.b();
        b.a<c.a> b24 = b.b(cls3);
        b24.f4618e = 1;
        b24.a(ca.m.c(cls));
        b24.f4619f = dc.c.f8892a;
        return zzar.zzi(bVar, b11, b13, b15, b17, b19, b21, b23, b24.b());
    }
}
