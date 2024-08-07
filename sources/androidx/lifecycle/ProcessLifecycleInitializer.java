package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import f3.a;
import f3.b;
import fk.r;
import java.util.List;
import r2.l;
import sk.j;

/* compiled from: ProcessLifecycleInitializer.kt */
public final class ProcessLifecycleInitializer implements b<l> {
    public final List<Class<? extends b<?>>> a() {
        return r.f20213a;
    }

    public final Object b(Context context) {
        j.f(context, "context");
        a c10 = a.c(context);
        j.e(c10, "getInstance(context)");
        if (c10.f9904b.contains(ProcessLifecycleInitializer.class)) {
            if (!m.f2782a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                j.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new m.a());
            }
            s sVar = s.f2817p;
            sVar.getClass();
            sVar.f2822e = new Handler();
            sVar.f2823f.f(i.a.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            j.d(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new t(sVar));
            return sVar;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}
