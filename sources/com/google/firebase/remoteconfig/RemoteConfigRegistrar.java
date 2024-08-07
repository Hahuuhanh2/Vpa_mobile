package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import ca.b;
import ca.c;
import ca.m;
import ca.r;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import m9.d;
import n9.b;
import o9.a;
import ub.f;
import vb.h;

@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* access modifiers changed from: private */
    public static h lambda$getComponents$0(r rVar, c cVar) {
        b bVar;
        Context context = (Context) cVar.a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) cVar.d(rVar);
        d dVar = (d) cVar.a(d.class);
        ab.c cVar2 = (ab.c) cVar.a(ab.c.class);
        a aVar = (a) cVar.a(a.class);
        synchronized (aVar) {
            if (!aVar.f13762a.containsKey("frc")) {
                aVar.f13762a.put("frc", new b(aVar.f13763b));
            }
            bVar = (b) aVar.f13762a.get("frc");
        }
        return new h(context, scheduledExecutorService, dVar, cVar2, bVar, cVar.c(p9.a.class));
    }

    public List<ca.b<?>> getComponents() {
        r rVar = new r(r9.b.class, ScheduledExecutorService.class);
        b.a<h> b10 = ca.b.b(h.class);
        b10.f4614a = LIBRARY_NAME;
        b10.a(m.b(Context.class));
        b10.a(new m((r<?>) rVar, 1, 0));
        b10.a(m.b(d.class));
        b10.a(m.b(ab.c.class));
        b10.a(m.b(a.class));
        b10.a(m.a(p9.a.class));
        b10.f4619f = new ca.a(rVar, 1);
        b10.c(2);
        return Arrays.asList(new ca.b[]{b10.b(), f.a(LIBRARY_NAME, "21.4.1")});
    }
}
