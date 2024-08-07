package j$.util.stream;

/* renamed from: j$.util.stream.e  reason: case insensitive filesystem */
abstract class C0433e {

    /* renamed from: a  reason: collision with root package name */
    protected final int f18775a;

    /* renamed from: b  reason: collision with root package name */
    protected int f18776b;

    /* renamed from: c  reason: collision with root package name */
    protected int f18777c;

    /* renamed from: d  reason: collision with root package name */
    protected long[] f18778d;

    protected C0433e() {
        this.f18775a = 4;
    }

    protected C0433e(int i10) {
        if (i10 >= 0) {
            this.f18775a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i10 - 1));
            return;
        }
        throw new IllegalArgumentException("Illegal Capacity: " + i10);
    }

    public abstract void clear();

    public final long count() {
        int i10 = this.f18777c;
        return i10 == 0 ? (long) this.f18776b : this.f18778d[i10] + ((long) this.f18776b);
    }
}
