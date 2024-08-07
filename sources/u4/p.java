package u4;

import j7.a;
import java.security.MessageDigest;
import java.util.Map;
import o5.b;
import s4.e;
import s4.h;
import s4.l;

/* compiled from: EngineKey */
public final class p implements e {

    /* renamed from: b  reason: collision with root package name */
    public final Object f15227b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15228c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15229d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<?> f15230e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f15231f;

    /* renamed from: g  reason: collision with root package name */
    public final e f15232g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<Class<?>, l<?>> f15233h;

    /* renamed from: i  reason: collision with root package name */
    public final h f15234i;

    /* renamed from: j  reason: collision with root package name */
    public int f15235j;

    public p(Object obj, e eVar, int i10, int i11, b bVar, Class cls, Class cls2, h hVar) {
        a.r(obj);
        this.f15227b = obj;
        if (eVar != null) {
            this.f15232g = eVar;
            this.f15228c = i10;
            this.f15229d = i11;
            a.r(bVar);
            this.f15233h = bVar;
            if (cls != null) {
                this.f15230e = cls;
                if (cls2 != null) {
                    this.f15231f = cls2;
                    a.r(hVar);
                    this.f15234i = hVar;
                    return;
                }
                throw new NullPointerException("Transcode class must not be null");
            }
            throw new NullPointerException("Resource class must not be null");
        }
        throw new NullPointerException("Signature must not be null");
    }

    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (!this.f15227b.equals(pVar.f15227b) || !this.f15232g.equals(pVar.f15232g) || this.f15229d != pVar.f15229d || this.f15228c != pVar.f15228c || !this.f15233h.equals(pVar.f15233h) || !this.f15230e.equals(pVar.f15230e) || !this.f15231f.equals(pVar.f15231f) || !this.f15234i.equals(pVar.f15234i)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f15235j == 0) {
            int hashCode = this.f15227b.hashCode();
            this.f15235j = hashCode;
            int hashCode2 = ((((this.f15232g.hashCode() + (hashCode * 31)) * 31) + this.f15228c) * 31) + this.f15229d;
            this.f15235j = hashCode2;
            int hashCode3 = this.f15233h.hashCode() + (hashCode2 * 31);
            this.f15235j = hashCode3;
            int hashCode4 = this.f15230e.hashCode() + (hashCode3 * 31);
            this.f15235j = hashCode4;
            int hashCode5 = this.f15231f.hashCode() + (hashCode4 * 31);
            this.f15235j = hashCode5;
            this.f15235j = this.f15234i.hashCode() + (hashCode5 * 31);
        }
        return this.f15235j;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("EngineKey{model=");
        q10.append(this.f15227b);
        q10.append(", width=");
        q10.append(this.f15228c);
        q10.append(", height=");
        q10.append(this.f15229d);
        q10.append(", resourceClass=");
        q10.append(this.f15230e);
        q10.append(", transcodeClass=");
        q10.append(this.f15231f);
        q10.append(", signature=");
        q10.append(this.f15232g);
        q10.append(", hashCode=");
        q10.append(this.f15235j);
        q10.append(", transformations=");
        q10.append(this.f15233h);
        q10.append(", options=");
        q10.append(this.f15234i);
        q10.append('}');
        return q10.toString();
    }
}
