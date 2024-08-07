package ld;

/* compiled from: DataCharacter */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f12959a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12960b;

    public b(int i10, int i11) {
        this.f12959a = i10;
        this.f12960b = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f12959a == bVar.f12959a && this.f12960b == bVar.f12960b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12959a ^ this.f12960b;
    }

    public final String toString() {
        return this.f12959a + "(" + this.f12960b + ')';
    }
}
