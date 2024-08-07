package f6;

import android.support.v4.media.a;
import c6.b;
import c6.c;
import c6.e;

/* compiled from: AutoValue_SendRequest */
public final class i extends r {

    /* renamed from: a  reason: collision with root package name */
    public final s f9997a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9998b;

    /* renamed from: c  reason: collision with root package name */
    public final c<?> f9999c;

    /* renamed from: d  reason: collision with root package name */
    public final e<?, byte[]> f10000d;

    /* renamed from: e  reason: collision with root package name */
    public final b f10001e;

    public i(s sVar, String str, c cVar, e eVar, b bVar) {
        this.f9997a = sVar;
        this.f9998b = str;
        this.f9999c = cVar;
        this.f10000d = eVar;
        this.f10001e = bVar;
    }

    public final b a() {
        return this.f10001e;
    }

    public final c<?> b() {
        return this.f9999c;
    }

    public final e<?, byte[]> c() {
        return this.f10000d;
    }

    public final s d() {
        return this.f9997a;
    }

    public final String e() {
        return this.f9998b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!this.f9997a.equals(rVar.d()) || !this.f9998b.equals(rVar.e()) || !this.f9999c.equals(rVar.b()) || !this.f10000d.equals(rVar.c()) || !this.f10001e.equals(rVar.a())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((this.f9997a.hashCode() ^ 1000003) * 1000003) ^ this.f9998b.hashCode()) * 1000003) ^ this.f9999c.hashCode()) * 1000003) ^ this.f10000d.hashCode()) * 1000003) ^ this.f10001e.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = a.q("SendRequest{transportContext=");
        q10.append(this.f9997a);
        q10.append(", transportName=");
        q10.append(this.f9998b);
        q10.append(", event=");
        q10.append(this.f9999c);
        q10.append(", transformer=");
        q10.append(this.f10000d);
        q10.append(", encoding=");
        q10.append(this.f10001e);
        q10.append("}");
        return q10.toString();
    }
}
