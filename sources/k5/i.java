package k5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import l5.f;
import l5.g;
import m5.e;
import o5.b;
import o5.e;
import p5.d;
import s4.a;
import u4.l;
import u4.m;
import u4.u;
import y4.k;

/* compiled from: SingleRequest */
public final class i<R> implements d, f, h {
    public static final boolean B = Log.isLoggable("GlideRequest", 2);
    public RuntimeException A;

    /* renamed from: a  reason: collision with root package name */
    public final d.a f12000a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f12001b;

    /* renamed from: c  reason: collision with root package name */
    public final f<R> f12002c;

    /* renamed from: d  reason: collision with root package name */
    public final e f12003d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f12004e;

    /* renamed from: f  reason: collision with root package name */
    public final h f12005f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f12006g;

    /* renamed from: h  reason: collision with root package name */
    public final Class<R> f12007h;

    /* renamed from: i  reason: collision with root package name */
    public final a<?> f12008i;

    /* renamed from: j  reason: collision with root package name */
    public final int f12009j;

    /* renamed from: k  reason: collision with root package name */
    public final int f12010k;

    /* renamed from: l  reason: collision with root package name */
    public final j f12011l;

    /* renamed from: m  reason: collision with root package name */
    public final g<R> f12012m;

    /* renamed from: n  reason: collision with root package name */
    public final List<f<R>> f12013n;

    /* renamed from: o  reason: collision with root package name */
    public final e<? super R> f12014o;

    /* renamed from: p  reason: collision with root package name */
    public final Executor f12015p;

    /* renamed from: q  reason: collision with root package name */
    public u<R> f12016q;

    /* renamed from: r  reason: collision with root package name */
    public m.d f12017r;

    /* renamed from: s  reason: collision with root package name */
    public volatile m f12018s;

    /* renamed from: t  reason: collision with root package name */
    public int f12019t;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f12020u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f12021v;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f12022w;

    /* renamed from: x  reason: collision with root package name */
    public int f12023x;

    /* renamed from: y  reason: collision with root package name */
    public int f12024y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f12025z;

    public i(Context context, h hVar, Object obj, Object obj2, Class cls, a aVar, int i10, int i11, j jVar, g gVar, ArrayList arrayList, e eVar, m mVar, e eVar2) {
        h hVar2 = hVar;
        e.a aVar2 = o5.e.f13740a;
        if (B) {
            String.valueOf(hashCode());
        }
        this.f12000a = new d.a();
        this.f12001b = obj;
        this.f12004e = context;
        this.f12005f = hVar2;
        this.f12006g = obj2;
        this.f12007h = cls;
        this.f12008i = aVar;
        this.f12009j = i10;
        this.f12010k = i11;
        this.f12011l = jVar;
        this.f12012m = gVar;
        this.f12002c = null;
        this.f12013n = arrayList;
        this.f12003d = eVar;
        this.f12018s = mVar;
        this.f12014o = eVar2;
        this.f12015p = aVar2;
        this.f12019t = 1;
        if (this.A == null) {
            if (hVar2.f4932h.f4935a.containsKey(com.bumptech.glide.f.class)) {
                this.A = new RuntimeException("Glide request origin trace");
            }
        }
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f12001b) {
            if (this.f12019t == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void b(int i10, int i11) {
        Object obj;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        s4.h hVar;
        int i13 = i10;
        int i14 = i11;
        this.f12000a.a();
        Object obj2 = this.f12001b;
        synchronized (obj2) {
            try {
                boolean z13 = B;
                if (z13) {
                    int i15 = o5.h.f13744a;
                    SystemClock.elapsedRealtimeNanos();
                }
                if (this.f12019t == 3) {
                    this.f12019t = 2;
                    float f10 = this.f12008i.f11976b;
                    if (i13 != Integer.MIN_VALUE) {
                        i13 = Math.round(((float) i13) * f10);
                    }
                    this.f12023x = i13;
                    if (i14 == Integer.MIN_VALUE) {
                        i12 = i14;
                    } else {
                        i12 = Math.round(f10 * ((float) i14));
                    }
                    this.f12024y = i12;
                    if (z13) {
                        int i16 = o5.h.f13744a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    m mVar = this.f12018s;
                    h hVar2 = this.f12005f;
                    Object obj3 = this.f12006g;
                    a<?> aVar = this.f12008i;
                    s4.e eVar = aVar.f11986s;
                    int i17 = this.f12023x;
                    int i18 = this.f12024y;
                    Class<?> cls = aVar.f11993z;
                    Class<R> cls2 = this.f12007h;
                    j jVar = this.f12011l;
                    l lVar = aVar.f11977c;
                    b bVar = aVar.f11992y;
                    boolean z14 = aVar.f11987t;
                    boolean z15 = aVar.F;
                    s4.h hVar3 = aVar.f11991x;
                    Object obj4 = obj2;
                    try {
                        z10 = aVar.f11983p;
                        z11 = aVar.D;
                        z12 = aVar.G;
                        hVar = hVar3;
                        obj = obj4;
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj4;
                        while (true) {
                            try {
                                break;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        throw th;
                    }
                    try {
                        m.d b10 = mVar.b(hVar2, obj3, eVar, i17, i18, cls, cls2, jVar, lVar, bVar, z14, z15, hVar, z10, z11, z12, aVar.E, this, this.f12015p);
                        try {
                            this.f12017r = b10;
                            if (this.f12019t != 2) {
                                this.f12017r = null;
                            }
                            if (z13) {
                                int i19 = o5.h.f13744a;
                                SystemClock.elapsedRealtimeNanos();
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            while (true) {
                                break;
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        while (true) {
                            break;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                obj = obj2;
                while (true) {
                    break;
                }
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f12001b) {
            if (isRunning()) {
                clear();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        r5.f12018s.getClass();
        u4.m.d(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f12001b
            monitor-enter(r0)
            boolean r1 = r5.f12025z     // Catch:{ all -> 0x004e }
            if (r1 != 0) goto L_0x0046
            p5.d$a r1 = r5.f12000a     // Catch:{ all -> 0x004e }
            r1.a()     // Catch:{ all -> 0x004e }
            int r1 = r5.f12019t     // Catch:{ all -> 0x004e }
            r2 = 6
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return
        L_0x0013:
            r5.d()     // Catch:{ all -> 0x004e }
            u4.u<R> r1 = r5.f12016q     // Catch:{ all -> 0x004e }
            r3 = 0
            if (r1 == 0) goto L_0x001e
            r5.f12016q = r3     // Catch:{ all -> 0x004e }
            goto L_0x001f
        L_0x001e:
            r1 = r3
        L_0x001f:
            k5.e r3 = r5.f12003d     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x002c
            boolean r3 = r3.g(r5)     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r3 = 0
            goto L_0x002d
        L_0x002c:
            r3 = 1
        L_0x002d:
            if (r3 == 0) goto L_0x0038
            l5.g<R> r3 = r5.f12012m     // Catch:{ all -> 0x004e }
            android.graphics.drawable.Drawable r4 = r5.e()     // Catch:{ all -> 0x004e }
            r3.j(r4)     // Catch:{ all -> 0x004e }
        L_0x0038:
            r5.f12019t = r2     // Catch:{ all -> 0x004e }
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0045
            u4.m r0 = r5.f12018s
            r0.getClass()
            u4.m.d(r1)
        L_0x0045:
            return
        L_0x0046:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch:{ all -> 0x004e }
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.i.clear():void");
    }

    public final void d() {
        if (!this.f12025z) {
            this.f12000a.a();
            this.f12012m.c(this);
            m.d dVar = this.f12017r;
            if (dVar != null) {
                synchronized (m.this) {
                    dVar.f15198a.g(dVar.f15199b);
                }
                this.f12017r = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    public final Drawable e() {
        int i10;
        if (this.f12021v == null) {
            a<?> aVar = this.f12008i;
            Drawable drawable = aVar.f11981n;
            this.f12021v = drawable;
            if (drawable == null && (i10 = aVar.f11982o) > 0) {
                this.f12021v = h(i10);
            }
        }
        return this.f12021v;
    }

    public final boolean f() {
        boolean z10;
        synchronized (this.f12001b) {
            if (this.f12019t == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean g() {
        e eVar = this.f12003d;
        if (eVar == null || !eVar.getRoot().a()) {
            return true;
        }
        return false;
    }

    public final Drawable h(int i10) {
        Resources.Theme theme = this.f12008i.B;
        if (theme == null) {
            theme = this.f12004e.getTheme();
        }
        h hVar = this.f12005f;
        return d5.b.a(hVar, hVar, i10, theme);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00bd, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f12001b
            monitor-enter(r0)
            boolean r1 = r7.f12025z     // Catch:{ all -> 0x00ce }
            if (r1 != 0) goto L_0x00c6
            p5.d$a r1 = r7.f12000a     // Catch:{ all -> 0x00ce }
            r1.a()     // Catch:{ all -> 0x00ce }
            int r1 = o5.h.f13744a     // Catch:{ all -> 0x00ce }
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00ce }
            java.lang.Object r1 = r7.f12006g     // Catch:{ all -> 0x00ce }
            r2 = 3
            if (r1 != 0) goto L_0x004f
            int r1 = r7.f12009j     // Catch:{ all -> 0x00ce }
            int r3 = r7.f12010k     // Catch:{ all -> 0x00ce }
            boolean r1 = o5.l.i(r1, r3)     // Catch:{ all -> 0x00ce }
            if (r1 == 0) goto L_0x0028
            int r1 = r7.f12009j     // Catch:{ all -> 0x00ce }
            r7.f12023x = r1     // Catch:{ all -> 0x00ce }
            int r1 = r7.f12010k     // Catch:{ all -> 0x00ce }
            r7.f12024y = r1     // Catch:{ all -> 0x00ce }
        L_0x0028:
            android.graphics.drawable.Drawable r1 = r7.f12022w     // Catch:{ all -> 0x00ce }
            if (r1 != 0) goto L_0x003e
            k5.a<?> r1 = r7.f12008i     // Catch:{ all -> 0x00ce }
            android.graphics.drawable.Drawable r3 = r1.f11989v     // Catch:{ all -> 0x00ce }
            r7.f12022w = r3     // Catch:{ all -> 0x00ce }
            if (r3 != 0) goto L_0x003e
            int r1 = r1.f11990w     // Catch:{ all -> 0x00ce }
            if (r1 <= 0) goto L_0x003e
            android.graphics.drawable.Drawable r1 = r7.h(r1)     // Catch:{ all -> 0x00ce }
            r7.f12022w = r1     // Catch:{ all -> 0x00ce }
        L_0x003e:
            android.graphics.drawable.Drawable r1 = r7.f12022w     // Catch:{ all -> 0x00ce }
            if (r1 != 0) goto L_0x0043
            r2 = 5
        L_0x0043:
            com.bumptech.glide.load.engine.GlideException r1 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = "Received null model"
            r1.<init>(r3)     // Catch:{ all -> 0x00ce }
            r7.l(r1, r2)     // Catch:{ all -> 0x00ce }
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            return
        L_0x004f:
            int r1 = r7.f12019t     // Catch:{ all -> 0x00ce }
            r3 = 2
            if (r1 == r3) goto L_0x00be
            r4 = 4
            r5 = 0
            if (r1 != r4) goto L_0x0061
            u4.u<R> r1 = r7.f12016q     // Catch:{ all -> 0x00ce }
            s4.a r2 = s4.a.MEMORY_CACHE     // Catch:{ all -> 0x00ce }
            r7.n(r1, r2, r5)     // Catch:{ all -> 0x00ce }
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            return
        L_0x0061:
            java.util.List<k5.f<R>> r1 = r7.f12013n     // Catch:{ all -> 0x00ce }
            if (r1 != 0) goto L_0x0066
            goto L_0x0080
        L_0x0066:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00ce }
        L_0x006a:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x00ce }
            if (r4 == 0) goto L_0x0080
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x00ce }
            k5.f r4 = (k5.f) r4     // Catch:{ all -> 0x00ce }
            boolean r6 = r4 instanceof k5.c     // Catch:{ all -> 0x00ce }
            if (r6 == 0) goto L_0x006a
            k5.c r4 = (k5.c) r4     // Catch:{ all -> 0x00ce }
            r4.getClass()     // Catch:{ all -> 0x00ce }
            goto L_0x006a
        L_0x0080:
            r7.f12019t = r2     // Catch:{ all -> 0x00ce }
            int r1 = r7.f12009j     // Catch:{ all -> 0x00ce }
            int r4 = r7.f12010k     // Catch:{ all -> 0x00ce }
            boolean r1 = o5.l.i(r1, r4)     // Catch:{ all -> 0x00ce }
            if (r1 == 0) goto L_0x0094
            int r1 = r7.f12009j     // Catch:{ all -> 0x00ce }
            int r4 = r7.f12010k     // Catch:{ all -> 0x00ce }
            r7.b(r1, r4)     // Catch:{ all -> 0x00ce }
            goto L_0x0099
        L_0x0094:
            l5.g<R> r1 = r7.f12012m     // Catch:{ all -> 0x00ce }
            r1.k(r7)     // Catch:{ all -> 0x00ce }
        L_0x0099:
            int r1 = r7.f12019t     // Catch:{ all -> 0x00ce }
            if (r1 == r3) goto L_0x009f
            if (r1 != r2) goto L_0x00b5
        L_0x009f:
            k5.e r1 = r7.f12003d     // Catch:{ all -> 0x00ce }
            if (r1 == 0) goto L_0x00a9
            boolean r1 = r1.e(r7)     // Catch:{ all -> 0x00ce }
            if (r1 == 0) goto L_0x00aa
        L_0x00a9:
            r5 = 1
        L_0x00aa:
            if (r5 == 0) goto L_0x00b5
            l5.g<R> r1 = r7.f12012m     // Catch:{ all -> 0x00ce }
            android.graphics.drawable.Drawable r2 = r7.e()     // Catch:{ all -> 0x00ce }
            r1.h(r2)     // Catch:{ all -> 0x00ce }
        L_0x00b5:
            boolean r1 = B     // Catch:{ all -> 0x00ce }
            if (r1 == 0) goto L_0x00bc
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00ce }
        L_0x00bc:
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            return
        L_0x00be:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00ce }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00ce }
            throw r1     // Catch:{ all -> 0x00ce }
        L_0x00c6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00ce }
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch:{ all -> 0x00ce }
            throw r1     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.i.i():void");
    }

    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f12001b) {
            int i10 = this.f12019t;
            if (i10 != 2) {
                if (i10 != 3) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f12001b) {
            if (this.f12019t == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean k(d dVar) {
        int i10;
        int i11;
        Object obj;
        Class<R> cls;
        a<?> aVar;
        j jVar;
        int i12;
        int i13;
        int i14;
        Object obj2;
        Class<R> cls2;
        a<?> aVar2;
        j jVar2;
        int i15;
        boolean z10;
        d dVar2 = dVar;
        if (!(dVar2 instanceof i)) {
            return false;
        }
        synchronized (this.f12001b) {
            i10 = this.f12009j;
            i11 = this.f12010k;
            obj = this.f12006g;
            cls = this.f12007h;
            aVar = this.f12008i;
            jVar = this.f12011l;
            List<f<R>> list = this.f12013n;
            if (list != null) {
                i12 = list.size();
            } else {
                i12 = 0;
            }
        }
        i iVar = (i) dVar2;
        synchronized (iVar.f12001b) {
            i13 = iVar.f12009j;
            i14 = iVar.f12010k;
            obj2 = iVar.f12006g;
            cls2 = iVar.f12007h;
            aVar2 = iVar.f12008i;
            jVar2 = iVar.f12011l;
            List<f<R>> list2 = iVar.f12013n;
            if (list2 != null) {
                i15 = list2.size();
            } else {
                i15 = 0;
            }
        }
        if (i10 == i13 && i11 == i14) {
            char[] cArr = o5.l.f13754a;
            if (obj == null) {
                if (obj2 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (obj instanceof k) {
                z10 = ((k) obj).a();
            } else {
                z10 = obj.equals(obj2);
            }
            if (z10 && cls.equals(cls2) && aVar.equals(aVar2) && jVar == jVar2 && i12 == i15) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e A[Catch:{ all -> 0x007b }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c7 A[Catch:{ all -> 0x007b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(com.bumptech.glide.load.engine.GlideException r6, int r7) {
        /*
            r5 = this;
            p5.d$a r0 = r5.f12000a
            r0.a()
            java.lang.Object r0 = r5.f12001b
            monitor-enter(r0)
            r6.getClass()     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.h r1 = r5.f12005f     // Catch:{ all -> 0x00cf }
            int r1 = r1.f4933i     // Catch:{ all -> 0x00cf }
            r2 = 0
            if (r1 > r7) goto L_0x0033
            java.lang.Object r7 = r5.f12006g     // Catch:{ all -> 0x00cf }
            java.util.Objects.toString(r7)     // Catch:{ all -> 0x00cf }
            r7 = 4
            if (r1 > r7) goto L_0x0033
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x00cf }
            r7.<init>()     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.load.engine.GlideException.a(r6, r7)     // Catch:{ all -> 0x00cf }
            int r6 = r7.size()     // Catch:{ all -> 0x00cf }
            r1 = r2
        L_0x0027:
            if (r1 >= r6) goto L_0x0033
            int r3 = r1 + 1
            java.lang.Object r1 = r7.get(r1)     // Catch:{ all -> 0x00cf }
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ all -> 0x00cf }
            r1 = r3
            goto L_0x0027
        L_0x0033:
            r6 = 0
            r5.f12017r = r6     // Catch:{ all -> 0x00cf }
            r7 = 5
            r5.f12019t = r7     // Catch:{ all -> 0x00cf }
            r7 = 1
            r5.f12025z = r7     // Catch:{ all -> 0x00cf }
            java.util.List<k5.f<R>> r1 = r5.f12013n     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x005a
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x007b }
            r3 = r2
        L_0x0045:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x007b }
            if (r4 == 0) goto L_0x005b
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x007b }
            k5.f r4 = (k5.f) r4     // Catch:{ all -> 0x007b }
            r5.g()     // Catch:{ all -> 0x007b }
            boolean r4 = r4.b()     // Catch:{ all -> 0x007b }
            r3 = r3 | r4
            goto L_0x0045
        L_0x005a:
            r3 = r2
        L_0x005b:
            k5.f<R> r1 = r5.f12002c     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x006a
            r5.g()     // Catch:{ all -> 0x007b }
            boolean r1 = r1.b()     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x006a
            r1 = r7
            goto L_0x006b
        L_0x006a:
            r1 = r2
        L_0x006b:
            r1 = r1 | r3
            if (r1 != 0) goto L_0x00c1
            k5.e r1 = r5.f12003d     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x007d
            boolean r1 = r1.e(r5)     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x0079
            goto L_0x007d
        L_0x0079:
            r7 = r2
            goto L_0x007d
        L_0x007b:
            r6 = move-exception
            goto L_0x00cc
        L_0x007d:
            if (r7 != 0) goto L_0x0080
            goto L_0x00c1
        L_0x0080:
            java.lang.Object r7 = r5.f12006g     // Catch:{ all -> 0x007b }
            if (r7 != 0) goto L_0x009c
            android.graphics.drawable.Drawable r6 = r5.f12022w     // Catch:{ all -> 0x007b }
            if (r6 != 0) goto L_0x009a
            k5.a<?> r6 = r5.f12008i     // Catch:{ all -> 0x007b }
            android.graphics.drawable.Drawable r7 = r6.f11989v     // Catch:{ all -> 0x007b }
            r5.f12022w = r7     // Catch:{ all -> 0x007b }
            if (r7 != 0) goto L_0x009a
            int r6 = r6.f11990w     // Catch:{ all -> 0x007b }
            if (r6 <= 0) goto L_0x009a
            android.graphics.drawable.Drawable r6 = r5.h(r6)     // Catch:{ all -> 0x007b }
            r5.f12022w = r6     // Catch:{ all -> 0x007b }
        L_0x009a:
            android.graphics.drawable.Drawable r6 = r5.f12022w     // Catch:{ all -> 0x007b }
        L_0x009c:
            if (r6 != 0) goto L_0x00b6
            android.graphics.drawable.Drawable r6 = r5.f12020u     // Catch:{ all -> 0x007b }
            if (r6 != 0) goto L_0x00b4
            k5.a<?> r6 = r5.f12008i     // Catch:{ all -> 0x007b }
            android.graphics.drawable.Drawable r7 = r6.f11979e     // Catch:{ all -> 0x007b }
            r5.f12020u = r7     // Catch:{ all -> 0x007b }
            if (r7 != 0) goto L_0x00b4
            int r6 = r6.f11980f     // Catch:{ all -> 0x007b }
            if (r6 <= 0) goto L_0x00b4
            android.graphics.drawable.Drawable r6 = r5.h(r6)     // Catch:{ all -> 0x007b }
            r5.f12020u = r6     // Catch:{ all -> 0x007b }
        L_0x00b4:
            android.graphics.drawable.Drawable r6 = r5.f12020u     // Catch:{ all -> 0x007b }
        L_0x00b6:
            if (r6 != 0) goto L_0x00bc
            android.graphics.drawable.Drawable r6 = r5.e()     // Catch:{ all -> 0x007b }
        L_0x00bc:
            l5.g<R> r7 = r5.f12012m     // Catch:{ all -> 0x007b }
            r7.e(r6)     // Catch:{ all -> 0x007b }
        L_0x00c1:
            r5.f12025z = r2     // Catch:{ all -> 0x00cf }
            k5.e r6 = r5.f12003d     // Catch:{ all -> 0x00cf }
            if (r6 == 0) goto L_0x00ca
            r6.h(r5)     // Catch:{ all -> 0x00cf }
        L_0x00ca:
            monitor-exit(r0)     // Catch:{ all -> 0x00cf }
            return
        L_0x00cc:
            r5.f12025z = r2     // Catch:{ all -> 0x00cf }
            throw r6     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00cf }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.i.l(com.bumptech.glide.load.engine.GlideException, int):void");
    }

    /* JADX INFO: finally extract failed */
    public final void m(u uVar, Object obj, a aVar) {
        boolean z10;
        g();
        this.f12019t = 4;
        this.f12016q = uVar;
        if (this.f12005f.f4933i <= 3) {
            Objects.toString(aVar);
            Objects.toString(this.f12006g);
            int i10 = o5.h.f13744a;
            SystemClock.elapsedRealtimeNanos();
        }
        boolean z11 = true;
        this.f12025z = true;
        try {
            List<f<R>> list = this.f12013n;
            if (list != null) {
                z10 = false;
                for (f<R> a10 : list) {
                    z10 |= a10.a();
                }
            } else {
                z10 = false;
            }
            f<R> fVar = this.f12002c;
            if (fVar == null || !fVar.a()) {
                z11 = false;
            }
            if (!z11 && !z10) {
                this.f12012m.g(obj, this.f12014o.a(aVar));
            }
            this.f12025z = false;
            e eVar = this.f12003d;
            if (eVar != null) {
                eVar.b(this);
            }
        } catch (Throwable th2) {
            this.f12025z = false;
            throw th2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        r6.f12018s.getClass();
        u4.m.d(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(u4.u<?> r7, s4.a r8, boolean r9) {
        /*
            r6 = this;
            p5.d$a r9 = r6.f12000a
            r9.a()
            r9 = 0
            java.lang.Object r0 = r6.f12001b     // Catch:{ all -> 0x00c8 }
            monitor-enter(r0)     // Catch:{ all -> 0x00c8 }
            r6.f12017r = r9     // Catch:{ all -> 0x00ba }
            r1 = 5
            if (r7 != 0) goto L_0x0030
            com.bumptech.glide.load.engine.GlideException r7 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r8.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r2 = "Expected to receive a Resource<R> with an object of "
            r8.append(r2)     // Catch:{ all -> 0x00ba }
            java.lang.Class<R> r2 = r6.f12007h     // Catch:{ all -> 0x00ba }
            r8.append(r2)     // Catch:{ all -> 0x00ba }
            java.lang.String r2 = " inside, but instead got null."
            r8.append(r2)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00ba }
            r7.<init>(r8)     // Catch:{ all -> 0x00ba }
            r6.l(r7, r1)     // Catch:{ all -> 0x00ba }
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            return
        L_0x0030:
            java.lang.Object r2 = r7.get()     // Catch:{ all -> 0x00ba }
            if (r2 == 0) goto L_0x0067
            java.lang.Class<R> r3 = r6.f12007h     // Catch:{ all -> 0x00ba }
            java.lang.Class r4 = r2.getClass()     // Catch:{ all -> 0x00ba }
            boolean r3 = r3.isAssignableFrom(r4)     // Catch:{ all -> 0x00ba }
            if (r3 != 0) goto L_0x0043
            goto L_0x0067
        L_0x0043:
            k5.e r1 = r6.f12003d     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0050
            boolean r1 = r1.d(r6)     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r1 = 0
            goto L_0x0051
        L_0x0050:
            r1 = 1
        L_0x0051:
            if (r1 != 0) goto L_0x0062
            r6.f12016q = r9     // Catch:{ all -> 0x00b6 }
            r8 = 4
            r6.f12019t = r8     // Catch:{ all -> 0x00b6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
        L_0x0059:
            u4.m r8 = r6.f12018s
            r8.getClass()
            u4.m.d(r7)
            return
        L_0x0062:
            r6.m(r7, r2, r8)     // Catch:{ all -> 0x00ba }
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            return
        L_0x0067:
            r6.f12016q = r9     // Catch:{ all -> 0x00b6 }
            com.bumptech.glide.load.engine.GlideException r8 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00b6 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b6 }
            r9.<init>()     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = "Expected to receive an object of "
            r9.append(r3)     // Catch:{ all -> 0x00b6 }
            java.lang.Class<R> r3 = r6.f12007h     // Catch:{ all -> 0x00b6 }
            r9.append(r3)     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = " but instead got "
            r9.append(r3)     // Catch:{ all -> 0x00b6 }
            if (r2 == 0) goto L_0x0086
            java.lang.Class r3 = r2.getClass()     // Catch:{ all -> 0x00b6 }
            goto L_0x0088
        L_0x0086:
            java.lang.String r3 = ""
        L_0x0088:
            r9.append(r3)     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = "{"
            r9.append(r3)     // Catch:{ all -> 0x00b6 }
            r9.append(r2)     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = "} inside Resource{"
            r9.append(r3)     // Catch:{ all -> 0x00b6 }
            r9.append(r7)     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = "}."
            r9.append(r3)     // Catch:{ all -> 0x00b6 }
            if (r2 == 0) goto L_0x00a5
            java.lang.String r2 = ""
            goto L_0x00a7
        L_0x00a5:
            java.lang.String r2 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        L_0x00a7:
            r9.append(r2)     // Catch:{ all -> 0x00b6 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00b6 }
            r8.<init>(r9)     // Catch:{ all -> 0x00b6 }
            r6.l(r8, r1)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            goto L_0x0059
        L_0x00b6:
            r8 = move-exception
            r9 = r7
            r7 = r6
            goto L_0x00bf
        L_0x00ba:
            r7 = move-exception
            r8 = r6
        L_0x00bc:
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x00bf:
            monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
            throw r8     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r8 = move-exception
            goto L_0x00ca
        L_0x00c3:
            r8 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x00bc
        L_0x00c8:
            r8 = move-exception
            r7 = r6
        L_0x00ca:
            if (r9 == 0) goto L_0x00d4
            u4.m r7 = r7.f12018s
            r7.getClass()
            u4.m.d(r9)
        L_0x00d4:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.i.n(u4.u, s4.a, boolean):void");
    }

    public final String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f12001b) {
            obj = this.f12006g;
            cls = this.f12007h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
