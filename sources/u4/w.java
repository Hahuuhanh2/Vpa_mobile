package u4;

import android.support.v4.media.a;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import o5.i;
import s4.e;
import s4.h;
import s4.l;
import v4.b;

/* compiled from: ResourceCacheKey */
public final class w implements e {

    /* renamed from: j  reason: collision with root package name */
    public static final i<Class<?>, byte[]> f15261j = new i<>(50);

    /* renamed from: b  reason: collision with root package name */
    public final b f15262b;

    /* renamed from: c  reason: collision with root package name */
    public final e f15263c;

    /* renamed from: d  reason: collision with root package name */
    public final e f15264d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15265e;

    /* renamed from: f  reason: collision with root package name */
    public final int f15266f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f15267g;

    /* renamed from: h  reason: collision with root package name */
    public final h f15268h;

    /* renamed from: i  reason: collision with root package name */
    public final l<?> f15269i;

    public w(b bVar, e eVar, e eVar2, int i10, int i11, l<?> lVar, Class<?> cls, h hVar) {
        this.f15262b = bVar;
        this.f15263c = eVar;
        this.f15264d = eVar2;
        this.f15265e = i10;
        this.f15266f = i11;
        this.f15269i = lVar;
        this.f15267g = cls;
        this.f15268h = hVar;
    }

    public final void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f15262b.d();
        ByteBuffer.wrap(bArr).putInt(this.f15265e).putInt(this.f15266f).array();
        this.f15264d.a(messageDigest);
        this.f15263c.a(messageDigest);
        messageDigest.update(bArr);
        l<?> lVar = this.f15269i;
        if (lVar != null) {
            lVar.a(messageDigest);
        }
        this.f15268h.a(messageDigest);
        i<Class<?>, byte[]> iVar = f15261j;
        byte[] a10 = iVar.a(this.f15267g);
        if (a10 == null) {
            a10 = this.f15267g.getName().getBytes(e.f14624a);
            iVar.d(this.f15267g, a10);
        }
        messageDigest.update(a10);
        this.f15262b.put(bArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f15266f != wVar.f15266f || this.f15265e != wVar.f15265e || !o5.l.b(this.f15269i, wVar.f15269i) || !this.f15267g.equals(wVar.f15267g) || !this.f15263c.equals(wVar.f15263c) || !this.f15264d.equals(wVar.f15264d) || !this.f15268h.equals(wVar.f15268h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.f15264d.hashCode() + (this.f15263c.hashCode() * 31)) * 31) + this.f15265e) * 31) + this.f15266f;
        l<?> lVar = this.f15269i;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        int hashCode2 = this.f15267g.hashCode();
        return this.f15268h.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder q10 = a.q("ResourceCacheKey{sourceKey=");
        q10.append(this.f15263c);
        q10.append(", signature=");
        q10.append(this.f15264d);
        q10.append(", width=");
        q10.append(this.f15265e);
        q10.append(", height=");
        q10.append(this.f15266f);
        q10.append(", decodedResourceClass=");
        q10.append(this.f15267g);
        q10.append(", transformation='");
        q10.append(this.f15269i);
        q10.append('\'');
        q10.append(", options=");
        q10.append(this.f15268h);
        q10.append('}');
        return q10.toString();
    }
}
