package pl;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import rl.g;

/* compiled from: DateTimeTextProvider */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference<f> f22710a = new AtomicReference<>();

    /* compiled from: DateTimeTextProvider */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final f f22711a = f.f22710a.get();

        /* JADX WARNING: Removed duplicated region for block: B:1:0x0008 A[LOOP:0: B:1:0x0008->B:4:0x0013, LOOP_START] */
        static {
            /*
                java.util.concurrent.atomic.AtomicReference<pl.f> r0 = pl.f.f22710a
                r1 = 0
                pl.i r2 = new pl.i
                r2.<init>()
            L_0x0008:
                boolean r3 = r0.compareAndSet(r1, r2)
                if (r3 == 0) goto L_0x000f
                goto L_0x0015
            L_0x000f:
                java.lang.Object r3 = r0.get()
                if (r3 == 0) goto L_0x0008
            L_0x0015:
                java.util.concurrent.atomic.AtomicReference<pl.f> r0 = pl.f.f22710a
                java.lang.Object r0 = r0.get()
                pl.f r0 = (pl.f) r0
                f22711a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pl.f.a.<clinit>():void");
        }
    }

    public abstract String a(g gVar, long j10, j jVar, Locale locale);
}
