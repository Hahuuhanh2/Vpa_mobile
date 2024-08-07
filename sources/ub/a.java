package ub;

/* compiled from: AutoValue_LibraryVersion */
public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public final String f15422a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15423b;

    public a(String str, String str2) {
        if (str != null) {
            this.f15422a = str;
            if (str2 != null) {
                this.f15423b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    public final String a() {
        return this.f15422a;
    }

    public final String b() {
        return this.f15423b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f15422a.equals(dVar.a()) || !this.f15423b.equals(dVar.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f15422a.hashCode() ^ 1000003) * 1000003) ^ this.f15423b.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("LibraryVersion{libraryName=");
        q10.append(this.f15422a);
        q10.append(", version=");
        return android.support.v4.media.a.o(q10, this.f15423b, "}");
    }
}
