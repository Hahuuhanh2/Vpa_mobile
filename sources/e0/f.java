package e0;

import android.support.v4.media.a;
import e0.v;
import n0.k;

/* compiled from: AutoValue_ProcessingNode_In */
public final class f extends v.a {

    /* renamed from: a  reason: collision with root package name */
    public final k<v.b> f8998a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8999b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9000c;

    public f(k<v.b> kVar, int i10, int i11) {
        this.f8998a = kVar;
        this.f8999b = i10;
        this.f9000c = i11;
    }

    public final k<v.b> a() {
        return this.f8998a;
    }

    public final int b() {
        return this.f8999b;
    }

    public final int c() {
        return this.f9000c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.a)) {
            return false;
        }
        v.a aVar = (v.a) obj;
        if (this.f8998a.equals(aVar.a()) && this.f8999b == aVar.b() && this.f9000c == aVar.c()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8998a.hashCode() ^ 1000003) * 1000003) ^ this.f8999b) * 1000003) ^ this.f9000c;
    }

    public final String toString() {
        StringBuilder q10 = a.q("In{edge=");
        q10.append(this.f8998a);
        q10.append(", inputFormat=");
        q10.append(this.f8999b);
        q10.append(", outputFormat=");
        return v.v.e(q10, this.f9000c, "}");
    }
}
