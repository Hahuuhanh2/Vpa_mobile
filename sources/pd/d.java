package pd;

/* compiled from: Codeword */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f14155a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14156b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14157c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14158d;

    /* renamed from: e  reason: collision with root package name */
    public int f14159e = -1;

    public d(int i10, int i11, int i12, int i13) {
        this.f14155a = i10;
        this.f14156b = i11;
        this.f14157c = i12;
        this.f14158d = i13;
    }

    public final boolean a() {
        int i10 = this.f14159e;
        if (i10 == -1 || this.f14157c != (i10 % 3) * 3) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.f14159e + "|" + this.f14158d;
    }
}
