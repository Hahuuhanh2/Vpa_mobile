package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import b5.h;
import b5.i;
import b5.p;
import h5.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import k5.e;
import k5.f;
import k5.g;
import k5.j;
import l5.b;
import l5.d;
import u4.l;

/* compiled from: RequestBuilder */
public final class k<TranscodeType> extends k5.a<k<TranscodeType>> {
    public final Context H;
    public final l I;
    public final Class<TranscodeType> J;
    public final h K;
    public m<?, ? super TranscodeType> L;
    public Object M;
    public ArrayList N;
    public k<TranscodeType> O;
    public k<TranscodeType> P;
    public boolean Q = true;
    public boolean R;
    public boolean S;

    /* compiled from: RequestBuilder */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4945a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f4946b;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|(2:1|2)|3|5|6|7|8|9|(2:11|12)|13|15|16|17|18|19|20|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|8|9|(2:11|12)|13|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|5|6|7|8|9|11|12|13|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0037 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0041 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0061 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
        static {
            /*
                com.bumptech.glide.j[] r0 = com.bumptech.glide.j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4946b = r0
                r1 = 1
                r2 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                int[] r3 = f4946b     // Catch:{ NoSuchFieldError -> 0x0012 }
                r3[r0] = r0     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r3 = f4946b     // Catch:{ NoSuchFieldError -> 0x0016 }
                r3[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                r3 = 4
                int[] r4 = f4946b     // Catch:{ NoSuchFieldError -> 0x001c }
                r5 = 0
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f4945a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x002d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r1 = f4945a     // Catch:{ NoSuchFieldError -> 0x0037 }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0037 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0037 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0037 }
            L_0x0037:
                int[] r0 = f4945a     // Catch:{ NoSuchFieldError -> 0x0041 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0041 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0041 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0041 }
            L_0x0041:
                int[] r0 = f4945a     // Catch:{ NoSuchFieldError -> 0x004b }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f4945a     // Catch:{ NoSuchFieldError -> 0x0056 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f4945a     // Catch:{ NoSuchFieldError -> 0x0061 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0061 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0061 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0061 }
            L_0x0061:
                int[] r0 = f4945a     // Catch:{ NoSuchFieldError -> 0x006c }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f4945a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.k.a.<clinit>():void");
        }
    }

    static {
        g gVar = (g) ((g) ((g) new g().e(l.f15174c)).m()).r();
    }

    @SuppressLint({"CheckResult"})
    public k(b bVar, l lVar, Class<TranscodeType> cls, Context context) {
        g gVar;
        this.I = lVar;
        this.J = cls;
        this.H = context;
        h hVar = lVar.f4948a.f4918c;
        m<?, ? super TranscodeType> mVar = hVar.f4930f.get(cls);
        if (mVar == null) {
            for (Map.Entry next : hVar.f4930f.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    mVar = (m) next.getValue();
                }
            }
        }
        this.L = mVar == null ? h.f4924k : mVar;
        this.K = bVar.f4918c;
        Iterator<f<Object>> it = lVar.f4956p.iterator();
        while (it.hasNext()) {
            x(it.next());
        }
        synchronized (lVar) {
            gVar = lVar.f4957q;
        }
        y(gVar);
    }

    /* renamed from: A */
    public final k<TranscodeType> clone() {
        k<TranscodeType> kVar = (k) super.clone();
        kVar.L = kVar.L.clone();
        if (kVar.N != null) {
            kVar.N = new ArrayList(kVar.N);
        }
        k<TranscodeType> kVar2 = kVar.O;
        if (kVar2 != null) {
            kVar.O = kVar2.clone();
        }
        k<TranscodeType> kVar3 = kVar.P;
        if (kVar3 != null) {
            kVar.P = kVar3.clone();
        }
        return kVar;
    }

    public final void B(ImageView imageView) {
        k5.a aVar;
        l5.g gVar;
        o5.l.a();
        j7.a.r(imageView);
        if (!k5.a.g(this.f11975a, 2048) && this.f11988u && imageView.getScaleType() != null) {
            switch (a.f4945a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().j(b5.k.f4027c, new h());
                    break;
                case 2:
                    aVar = clone().n(b5.k.f4026b, new i(), false);
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().n(b5.k.f4025a, new p(), false);
                    break;
                case 6:
                    aVar = clone().n(b5.k.f4026b, new i(), false);
                    break;
            }
        }
        aVar = this;
        h hVar = this.K;
        Class<TranscodeType> cls = this.J;
        hVar.f4927c.getClass();
        if (Bitmap.class.equals(cls)) {
            gVar = new b(imageView);
        } else if (Drawable.class.isAssignableFrom(cls)) {
            gVar = new d(imageView);
        } else {
            throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
        }
        C(gVar, aVar);
    }

    public final void C(l5.g gVar, k5.a aVar) {
        boolean z10;
        j7.a.r(gVar);
        if (this.R) {
            Object obj = new Object();
            m<?, ? super TranscodeType> mVar = this.L;
            k5.d z11 = z(aVar.f11985r, aVar.f11984q, aVar.f11978d, mVar, aVar, (e) null, gVar, obj);
            k5.d i10 = gVar.i();
            if (z11.k(i10)) {
                if (aVar.f11983p || !i10.j()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    j7.a.r(i10);
                    if (!i10.isRunning()) {
                        i10.i();
                        return;
                    }
                    return;
                }
            }
            this.I.l(gVar);
            gVar.d(z11);
            l lVar = this.I;
            synchronized (lVar) {
                lVar.f4953f.f10605a.add(gVar);
                m mVar2 = lVar.f4951d;
                mVar2.f10576a.add(z11);
                if (!mVar2.f10578c) {
                    z11.i();
                } else {
                    z11.clear();
                    Log.isLoggable("RequestTracker", 2);
                    mVar2.f10577b.add(z11);
                }
            }
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: s4.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bumptech.glide.k<TranscodeType> D(java.lang.Integer r6) {
        /*
            r5 = this;
            com.bumptech.glide.k r6 = r5.E(r6)
            android.content.Context r0 = r5.H
            j$.util.concurrent.ConcurrentHashMap r1 = n5.b.f13520a
            java.lang.String r1 = r0.getPackageName()
            j$.util.concurrent.ConcurrentHashMap r2 = n5.b.f13520a
            java.lang.Object r2 = r2.get(r1)
            s4.e r2 = (s4.e) r2
            if (r2 != 0) goto L_0x004a
            android.content.pm.PackageManager r2 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0024 }
            java.lang.String r3 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x0024 }
            r4 = 0
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r4)     // Catch:{ NameNotFoundException -> 0x0024 }
            goto L_0x0028
        L_0x0024:
            r0.getPackageName()
            r2 = 0
        L_0x0028:
            if (r2 == 0) goto L_0x0031
            int r2 = r2.versionCode
            java.lang.String r2 = java.lang.String.valueOf(r2)
            goto L_0x0039
        L_0x0031:
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
        L_0x0039:
            n5.d r3 = new n5.d
            r3.<init>(r2)
            j$.util.concurrent.ConcurrentHashMap r2 = n5.b.f13520a
            java.lang.Object r1 = r2.putIfAbsent(r1, r3)
            r2 = r1
            s4.e r2 = (s4.e) r2
            if (r2 != 0) goto L_0x004a
            r2 = r3
        L_0x004a:
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            n5.a r1 = new n5.a
            r1.<init>(r0, r2)
            k5.g r0 = new k5.g
            r0.<init>()
            k5.a r0 = r0.q(r1)
            k5.g r0 = (k5.g) r0
            com.bumptech.glide.k r6 = r6.y(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.k.D(java.lang.Integer):com.bumptech.glide.k");
    }

    public final k<TranscodeType> E(Object obj) {
        if (this.C) {
            return clone().E(obj);
        }
        this.M = obj;
        this.R = true;
        o();
        return this;
    }

    public final k5.i F(int i10, int i11, j jVar, m mVar, k5.a aVar, e eVar, l5.g gVar, Object obj) {
        Context context = this.H;
        h hVar = this.K;
        return new k5.i(context, hVar, obj, this.M, this.J, aVar, i10, i11, jVar, gVar, this.N, eVar, hVar.f4931g, mVar.f5004a);
    }

    public final k G(a aVar) {
        if (this.C) {
            return clone().G(aVar);
        }
        this.L = aVar;
        this.Q = false;
        o();
        return this;
    }

    public final k5.a a(k5.a aVar) {
        j7.a.r(aVar);
        return (k) super.a(aVar);
    }

    public final k<TranscodeType> x(f<TranscodeType> fVar) {
        if (this.C) {
            return clone().x(fVar);
        }
        if (fVar != null) {
            if (this.N == null) {
                this.N = new ArrayList();
            }
            this.N.add(fVar);
        }
        o();
        return this;
    }

    public final k<TranscodeType> y(k5.a<?> aVar) {
        j7.a.r(aVar);
        return (k) super.a(aVar);
    }

    public final k5.d z(int i10, int i11, j jVar, m mVar, k5.a aVar, e eVar, l5.g gVar, Object obj) {
        k5.b bVar;
        k5.b bVar2;
        j jVar2;
        int i12;
        m<?, ? super TranscodeType> mVar2;
        j jVar3;
        int i13;
        int i14;
        k5.a aVar2 = aVar;
        Object obj2 = obj;
        if (this.P != null) {
            bVar2 = new k5.b(obj2, eVar);
            bVar = bVar2;
        } else {
            bVar = null;
            bVar2 = eVar;
        }
        k<TranscodeType> kVar = this.O;
        if (kVar == null) {
            jVar2 = F(i10, i11, jVar, mVar, aVar, bVar2, gVar, obj);
        } else if (!this.S) {
            m<?, ? super TranscodeType> mVar3 = kVar.L;
            if (kVar.Q) {
                mVar2 = mVar;
            } else {
                mVar2 = mVar3;
            }
            if (k5.a.g(kVar.f11975a, 8)) {
                jVar3 = this.O.f11978d;
            } else {
                int ordinal = jVar.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    jVar3 = j.IMMEDIATE;
                } else if (ordinal == 2) {
                    jVar3 = j.HIGH;
                } else if (ordinal == 3) {
                    jVar3 = j.NORMAL;
                } else {
                    StringBuilder q10 = android.support.v4.media.a.q("unknown priority: ");
                    q10.append(this.f11978d);
                    throw new IllegalArgumentException(q10.toString());
                }
            }
            j jVar4 = jVar3;
            k<TranscodeType> kVar2 = this.O;
            int i15 = kVar2.f11985r;
            int i16 = kVar2.f11984q;
            if (o5.l.i(i10, i11)) {
                k<TranscodeType> kVar3 = this.O;
                if (!o5.l.i(kVar3.f11985r, kVar3.f11984q)) {
                    i14 = aVar2.f11985r;
                    i13 = aVar2.f11984q;
                    j jVar5 = new j(obj2, bVar2);
                    l5.g gVar2 = gVar;
                    j jVar6 = jVar5;
                    k5.i F = F(i10, i11, jVar, mVar, aVar, jVar5, gVar2, obj);
                    this.S = true;
                    k<TranscodeType> kVar4 = this.O;
                    k5.d z10 = kVar4.z(i14, i13, jVar4, mVar2, kVar4, jVar6, gVar2, obj);
                    this.S = false;
                    j jVar7 = jVar6;
                    jVar7.f12028c = F;
                    jVar7.f12029d = z10;
                    jVar2 = jVar7;
                }
            }
            i13 = i16;
            i14 = i15;
            j jVar52 = new j(obj2, bVar2);
            l5.g gVar22 = gVar;
            j jVar62 = jVar52;
            k5.i F2 = F(i10, i11, jVar, mVar, aVar, jVar52, gVar22, obj);
            this.S = true;
            k<TranscodeType> kVar42 = this.O;
            k5.d z102 = kVar42.z(i14, i13, jVar4, mVar2, kVar42, jVar62, gVar22, obj);
            this.S = false;
            j jVar72 = jVar62;
            jVar72.f12028c = F2;
            jVar72.f12029d = z102;
            jVar2 = jVar72;
        } else {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        if (bVar == null) {
            return jVar2;
        }
        k<TranscodeType> kVar5 = this.P;
        int i17 = kVar5.f11985r;
        int i18 = kVar5.f11984q;
        if (o5.l.i(i10, i11)) {
            k<TranscodeType> kVar6 = this.P;
            if (!o5.l.i(kVar6.f11985r, kVar6.f11984q)) {
                int i19 = aVar2.f11985r;
                i12 = aVar2.f11984q;
                i17 = i19;
                k<TranscodeType> kVar7 = this.P;
                k5.d z11 = kVar7.z(i17, i12, kVar7.f11978d, kVar7.L, kVar7, bVar, gVar, obj);
                bVar.f11996c = jVar2;
                bVar.f11997d = z11;
                return bVar;
            }
        }
        i12 = i18;
        k<TranscodeType> kVar72 = this.P;
        k5.d z112 = kVar72.z(i17, i12, kVar72.f11978d, kVar72.L, kVar72, bVar, gVar, obj);
        bVar.f11996c = jVar2;
        bVar.f11997d = z112;
        return bVar;
    }
}
