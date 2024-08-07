package j$.util.concurrent;

abstract class b extends q {

    /* renamed from: i  reason: collision with root package name */
    final ConcurrentHashMap f18417i;

    /* renamed from: j  reason: collision with root package name */
    m f18418j;

    b(m[] mVarArr, int i10, int i11, ConcurrentHashMap concurrentHashMap) {
        super(mVarArr, i10, 0, i11);
        this.f18417i = concurrentHashMap;
        f();
    }

    public final boolean hasMoreElements() {
        return this.f18438b != null;
    }

    public final boolean hasNext() {
        return this.f18438b != null;
    }

    public final void remove() {
        m mVar = this.f18418j;
        if (mVar != null) {
            this.f18418j = null;
            this.f18417i.i(mVar.f18430b, (Object) null, (Object) null);
            return;
        }
        throw new IllegalStateException();
    }
}
