package com.google.mlkit.vision.barcode.internal;

import ca.b;
import ca.m;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcd;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import lc.h;
import qc.c;
import qc.d;
import qc.e;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public class BarcodeRegistrar implements ComponentRegistrar {
    public final List getComponents() {
        Class<e> cls = e.class;
        b.a<e> b10 = b.b(cls);
        b10.a(m.b(h.class));
        b10.f4619f = c.f14410a;
        b<e> b11 = b10.b();
        b.a<d> b12 = b.b(d.class);
        b12.a(m.b(cls));
        b12.a(m.b(lc.d.class));
        b12.f4619f = dc.e.f8895a;
        return zzcd.zzh(b11, b12.b());
    }
}
