package v1;

import android.support.v4.media.a;

/* compiled from: Pair */
public final class c<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f16012a;

    /* renamed from: b  reason: collision with root package name */
    public final S f16013b;

    public c(F f10, S s10) {
        this.f16012a = f10;
        this.f16013b = s10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!b.a(cVar.f16012a, this.f16012a) || !b.a(cVar.f16013b, this.f16013b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        F f10 = this.f16012a;
        int i11 = 0;
        if (f10 == null) {
            i10 = 0;
        } else {
            i10 = f10.hashCode();
        }
        S s10 = this.f16013b;
        if (s10 != null) {
            i11 = s10.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        StringBuilder q10 = a.q("Pair{");
        q10.append(this.f16012a);
        q10.append(" ");
        q10.append(this.f16013b);
        q10.append("}");
        return q10.toString();
    }
}
