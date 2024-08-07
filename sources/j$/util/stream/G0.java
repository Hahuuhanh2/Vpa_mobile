package j$.util.stream;

abstract class G0 implements E0 {

    /* renamed from: a  reason: collision with root package name */
    protected final E0 f18612a;

    /* renamed from: b  reason: collision with root package name */
    protected final E0 f18613b;

    /* renamed from: c  reason: collision with root package name */
    private final long f18614c;

    G0(E0 e02, E0 e03) {
        this.f18612a = e02;
        this.f18613b = e03;
        this.f18614c = e02.count() + e03.count();
    }

    public final E0 a(int i10) {
        if (i10 == 0) {
            return this.f18612a;
        }
        if (i10 == 1) {
            return this.f18613b;
        }
        throw new IndexOutOfBoundsException();
    }

    public final long count() {
        return this.f18614c;
    }

    public final int j() {
        return 2;
    }
}
