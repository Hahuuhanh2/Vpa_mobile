package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.d;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.o;
import c0.s0;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r2.l;
import s1.n;

public class EmojiCompatInitializer implements f3.b<Boolean> {

    public static class a extends d.c {
        public a(Context context) {
            super(new b(context));
            this.f2393b = 1;
        }
    }

    public static class b implements d.g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f2375a;

        public b(Context context) {
            this.f2375a = context.getApplicationContext();
        }

        public final void a(d.h hVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new l2.a("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new s0(2, this, hVar, threadPoolExecutor));
        }
    }

    public static class c implements Runnable {
        public final void run() {
            boolean z10;
            try {
                int i10 = n.f14600a;
                n.a.a("EmojiCompat.EmojiCompatInitializer.run");
                if (d.f2380j != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    d.a().c();
                }
                n.a.b();
            } catch (Throwable th2) {
                int i11 = n.f14600a;
                n.a.b();
                throw th2;
            }
        }
    }

    public final List<Class<? extends f3.b<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* renamed from: c */
    public final Boolean b(Context context) {
        Object obj;
        a aVar = new a(context);
        if (d.f2380j == null) {
            synchronized (d.f2379i) {
                if (d.f2380j == null) {
                    d.f2380j = new d(aVar);
                }
            }
        }
        f3.a c10 = f3.a.c(context);
        Class<ProcessLifecycleInitializer> cls = ProcessLifecycleInitializer.class;
        c10.getClass();
        synchronized (f3.a.f9902e) {
            try {
                obj = c10.f9903a.get(cls);
                if (obj == null) {
                    obj = c10.b(cls, new HashSet());
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        o B = ((l) obj).B();
        B.a(new l2.c(this, B));
        return Boolean.TRUE;
    }
}
