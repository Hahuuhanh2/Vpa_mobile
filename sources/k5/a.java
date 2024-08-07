package k5;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import b5.k;
import com.bumptech.glide.j;
import k5.a;
import n5.c;
import o5.b;
import s4.e;
import s4.g;
import s4.h;
import u4.l;

/* compiled from: BaseRequestOptions */
public abstract class a<T extends a<T>> implements Cloneable {
    public boolean A;
    public Resources.Theme B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F = true;
    public boolean G;

    /* renamed from: a  reason: collision with root package name */
    public int f11975a;

    /* renamed from: b  reason: collision with root package name */
    public float f11976b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    public l f11977c = l.f15175d;

    /* renamed from: d  reason: collision with root package name */
    public j f11978d = j.NORMAL;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f11979e;

    /* renamed from: f  reason: collision with root package name */
    public int f11980f;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f11981n;

    /* renamed from: o  reason: collision with root package name */
    public int f11982o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f11983p = true;

    /* renamed from: q  reason: collision with root package name */
    public int f11984q = -1;

    /* renamed from: r  reason: collision with root package name */
    public int f11985r = -1;

    /* renamed from: s  reason: collision with root package name */
    public e f11986s = c.f13521b;

    /* renamed from: t  reason: collision with root package name */
    public boolean f11987t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f11988u = true;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f11989v;

    /* renamed from: w  reason: collision with root package name */
    public int f11990w;

    /* renamed from: x  reason: collision with root package name */
    public h f11991x = new h();

    /* renamed from: y  reason: collision with root package name */
    public b f11992y = new b();

    /* renamed from: z  reason: collision with root package name */
    public Class<?> f11993z = Object.class;

    public static boolean g(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public T a(a<?> aVar) {
        if (this.C) {
            return clone().a(aVar);
        }
        if (g(aVar.f11975a, 2)) {
            this.f11976b = aVar.f11976b;
        }
        if (g(aVar.f11975a, 262144)) {
            this.D = aVar.D;
        }
        if (g(aVar.f11975a, 1048576)) {
            this.G = aVar.G;
        }
        if (g(aVar.f11975a, 4)) {
            this.f11977c = aVar.f11977c;
        }
        if (g(aVar.f11975a, 8)) {
            this.f11978d = aVar.f11978d;
        }
        if (g(aVar.f11975a, 16)) {
            this.f11979e = aVar.f11979e;
            this.f11980f = 0;
            this.f11975a &= -33;
        }
        if (g(aVar.f11975a, 32)) {
            this.f11980f = aVar.f11980f;
            this.f11979e = null;
            this.f11975a &= -17;
        }
        if (g(aVar.f11975a, 64)) {
            this.f11981n = aVar.f11981n;
            this.f11982o = 0;
            this.f11975a &= -129;
        }
        if (g(aVar.f11975a, 128)) {
            this.f11982o = aVar.f11982o;
            this.f11981n = null;
            this.f11975a &= -65;
        }
        if (g(aVar.f11975a, 256)) {
            this.f11983p = aVar.f11983p;
        }
        if (g(aVar.f11975a, 512)) {
            this.f11985r = aVar.f11985r;
            this.f11984q = aVar.f11984q;
        }
        if (g(aVar.f11975a, 1024)) {
            this.f11986s = aVar.f11986s;
        }
        if (g(aVar.f11975a, 4096)) {
            this.f11993z = aVar.f11993z;
        }
        if (g(aVar.f11975a, 8192)) {
            this.f11989v = aVar.f11989v;
            this.f11990w = 0;
            this.f11975a &= -16385;
        }
        if (g(aVar.f11975a, 16384)) {
            this.f11990w = aVar.f11990w;
            this.f11989v = null;
            this.f11975a &= -8193;
        }
        if (g(aVar.f11975a, 32768)) {
            this.B = aVar.B;
        }
        if (g(aVar.f11975a, 65536)) {
            this.f11988u = aVar.f11988u;
        }
        if (g(aVar.f11975a, 131072)) {
            this.f11987t = aVar.f11987t;
        }
        if (g(aVar.f11975a, 2048)) {
            this.f11992y.putAll(aVar.f11992y);
            this.F = aVar.F;
        }
        if (g(aVar.f11975a, 524288)) {
            this.E = aVar.E;
        }
        if (!this.f11988u) {
            this.f11992y.clear();
            this.f11987t = false;
            this.f11975a = this.f11975a & -2049 & -131073;
            this.F = true;
        }
        this.f11975a |= aVar.f11975a;
        this.f11991x.f14631b.j(aVar.f11991x.f14631b);
        o();
        return this;
    }

    /* renamed from: b */
    public T clone() {
        try {
            T t10 = (a) super.clone();
            h hVar = new h();
            t10.f11991x = hVar;
            hVar.f14631b.j(this.f11991x.f14631b);
            b bVar = new b();
            t10.f11992y = bVar;
            bVar.putAll(this.f11992y);
            t10.A = false;
            t10.C = false;
            return t10;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final T c(Class<?> cls) {
        if (this.C) {
            return clone().c(cls);
        }
        this.f11993z = cls;
        this.f11975a |= 4096;
        o();
        return this;
    }

    public final T e(l lVar) {
        if (this.C) {
            return clone().e(lVar);
        }
        j7.a.r(lVar);
        this.f11977c = lVar;
        this.f11975a |= 4;
        o();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (Float.compare(aVar.f11976b, this.f11976b) == 0 && this.f11980f == aVar.f11980f && o5.l.b(this.f11979e, aVar.f11979e) && this.f11982o == aVar.f11982o && o5.l.b(this.f11981n, aVar.f11981n) && this.f11990w == aVar.f11990w && o5.l.b(this.f11989v, aVar.f11989v) && this.f11983p == aVar.f11983p && this.f11984q == aVar.f11984q && this.f11985r == aVar.f11985r && this.f11987t == aVar.f11987t && this.f11988u == aVar.f11988u && this.D == aVar.D && this.E == aVar.E && this.f11977c.equals(aVar.f11977c) && this.f11978d == aVar.f11978d && this.f11991x.equals(aVar.f11991x) && this.f11992y.equals(aVar.f11992y) && this.f11993z.equals(aVar.f11993z) && o5.l.b(this.f11986s, aVar.f11986s) && o5.l.b(this.B, aVar.B)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final T f(int i10) {
        if (this.C) {
            return clone().f(i10);
        }
        this.f11980f = i10;
        this.f11979e = null;
        this.f11975a = (this.f11975a | 32) & -17;
        o();
        return this;
    }

    public final int hashCode() {
        float f10 = this.f11976b;
        char[] cArr = o5.l.f13754a;
        return o5.l.g(o5.l.g(o5.l.g(o5.l.g(o5.l.g(o5.l.g(o5.l.g((((((((((((((o5.l.g((o5.l.g((o5.l.g(((Float.floatToIntBits(f10) + 527) * 31) + this.f11980f, this.f11979e) * 31) + this.f11982o, this.f11981n) * 31) + this.f11990w, this.f11989v) * 31) + (this.f11983p ? 1 : 0)) * 31) + this.f11984q) * 31) + this.f11985r) * 31) + (this.f11987t ? 1 : 0)) * 31) + (this.f11988u ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0), this.f11977c), this.f11978d), this.f11991x), this.f11992y), this.f11993z), this.f11986s), this.B);
    }

    public final a j(k kVar, b5.e eVar) {
        if (this.C) {
            return clone().j(kVar, eVar);
        }
        g<k> gVar = k.f4030f;
        j7.a.r(kVar);
        p(gVar, kVar);
        return u(eVar, false);
    }

    public final T k(int i10, int i11) {
        if (this.C) {
            return clone().k(i10, i11);
        }
        this.f11985r = i10;
        this.f11984q = i11;
        this.f11975a |= 512;
        o();
        return this;
    }

    public final T l(int i10) {
        if (this.C) {
            return clone().l(i10);
        }
        this.f11982o = i10;
        this.f11981n = null;
        this.f11975a = (this.f11975a | 128) & -65;
        o();
        return this;
    }

    public final a m() {
        j jVar = j.LOW;
        if (this.C) {
            return clone().m();
        }
        this.f11978d = jVar;
        this.f11975a |= 8;
        o();
        return this;
    }

    public final a n(k kVar, b5.e eVar, boolean z10) {
        a aVar;
        if (z10) {
            aVar = s(kVar, eVar);
        } else {
            aVar = j(kVar, eVar);
        }
        aVar.F = true;
        return aVar;
    }

    public final void o() {
        if (this.A) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [s4.g<Y>, java.lang.Object, s4.g] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <Y> T p(s4.g<Y> r2, Y r3) {
        /*
            r1 = this;
            boolean r0 = r1.C
            if (r0 == 0) goto L_0x000d
            k5.a r0 = r1.clone()
            k5.a r2 = r0.p(r2, r3)
            return r2
        L_0x000d:
            j7.a.r(r2)
            j7.a.r(r3)
            s4.h r0 = r1.f11991x
            o5.b r0 = r0.f14631b
            r0.put(r2, r3)
            r1.o()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.a.p(s4.g, java.lang.Object):k5.a");
    }

    public final T q(e eVar) {
        if (this.C) {
            return clone().q(eVar);
        }
        this.f11986s = eVar;
        this.f11975a |= 1024;
        o();
        return this;
    }

    public final a r() {
        if (this.C) {
            return clone().r();
        }
        this.f11983p = false;
        this.f11975a |= 256;
        o();
        return this;
    }

    public final a s(k kVar, b5.e eVar) {
        if (this.C) {
            return clone().s(kVar, eVar);
        }
        g<k> gVar = k.f4030f;
        j7.a.r(kVar);
        p(gVar, kVar);
        return u(eVar, true);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [s4.l<Y>, java.lang.Object, s4.l] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <Y> T t(java.lang.Class<Y> r2, s4.l<Y> r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.C
            if (r0 == 0) goto L_0x000d
            k5.a r0 = r1.clone()
            k5.a r2 = r0.t(r2, r3, r4)
            return r2
        L_0x000d:
            j7.a.r(r3)
            o5.b r0 = r1.f11992y
            r0.put(r2, r3)
            int r2 = r1.f11975a
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r3 = 1
            r1.f11988u = r3
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r0
            r1.f11975a = r2
            r0 = 0
            r1.F = r0
            if (r4 == 0) goto L_0x002d
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            r1.f11975a = r2
            r1.f11987t = r3
        L_0x002d:
            r1.o()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.a.t(java.lang.Class, s4.l, boolean):k5.a");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [s4.l<android.graphics.Bitmap>, s4.l] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T u(s4.l<android.graphics.Bitmap> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.C
            if (r0 == 0) goto L_0x000d
            k5.a r0 = r2.clone()
            k5.a r3 = r0.u(r3, r4)
            return r3
        L_0x000d:
            b5.n r0 = new b5.n
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.t(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.t(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            r2.t(r1, r0, r4)
            java.lang.Class<f5.c> r0 = f5.c.class
            f5.e r1 = new f5.e
            r1.<init>(r3)
            r2.t(r0, r1, r4)
            r2.o()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.a.u(s4.l, boolean):k5.a");
    }

    public final a w() {
        if (this.C) {
            return clone().w();
        }
        this.G = true;
        this.f11975a |= 1048576;
        o();
        return this;
    }
}
