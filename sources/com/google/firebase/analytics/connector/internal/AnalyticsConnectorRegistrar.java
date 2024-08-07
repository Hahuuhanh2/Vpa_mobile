package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import ca.b;
import ca.c;
import ca.m;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import m9.d;
import p9.a;
import p9.e;
import ub.f;
import y6.j;

@Keep
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static a lambda$getComponents$0(c cVar) {
        d dVar = (d) cVar.a(d.class);
        Context context = (Context) cVar.a(Context.class);
        wa.d dVar2 = (wa.d) cVar.a(wa.d.class);
        j.f(dVar);
        j.f(context);
        j.f(dVar2);
        j.f(context.getApplicationContext());
        if (p9.c.f14104c == null) {
            synchronized (p9.c.class) {
                if (p9.c.f14104c == null) {
                    Bundle bundle = new Bundle(1);
                    dVar.a();
                    if ("[DEFAULT]".equals(dVar.f13219b)) {
                        dVar2.a(p9.d.f14107a, e.f14108a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", dVar.j());
                    }
                    p9.c.f14104c = new p9.c(zzdf.zza(context, (String) null, (String) null, (String) null, bundle).zzb());
                }
            }
        }
        return p9.c.f14104c;
    }

    @SuppressLint({"MissingPermission"})
    @Keep
    public List<b<?>> getComponents() {
        b.a<a> b10 = b.b(a.class);
        b10.a(m.b(d.class));
        b10.a(m.b(Context.class));
        b10.a(m.b(wa.d.class));
        b10.f4619f = q9.b.f14380a;
        b10.c(2);
        return Arrays.asList(new b[]{b10.b(), f.a("fire-analytics", "21.5.1")});
    }
}
