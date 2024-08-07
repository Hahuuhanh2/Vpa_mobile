package j$.util.stream;

import j$.util.M;
import j$.util.Spliterator;
import java.util.Iterator;
import java.util.stream.BaseStream;

/* renamed from: j$.util.stream.g  reason: case insensitive filesystem */
public final /* synthetic */ class C0441g implements C0449i {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BaseStream f18792a;

    private /* synthetic */ C0441g(BaseStream baseStream) {
        this.f18792a = baseStream;
    }

    public static /* synthetic */ C0449i w(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C0445h ? ((C0445h) baseStream).f18798a : new C0441g(baseStream);
    }

    public final /* synthetic */ void close() {
        this.f18792a.close();
    }

    public final /* synthetic */ boolean isParallel() {
        return this.f18792a.isParallel();
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f18792a.iterator();
    }

    public final /* synthetic */ C0449i onClose(Runnable runnable) {
        return w(this.f18792a.onClose(runnable));
    }

    public final /* synthetic */ C0449i parallel() {
        return w(this.f18792a.parallel());
    }

    public final /* synthetic */ C0449i sequential() {
        return w(this.f18792a.sequential());
    }

    public final /* synthetic */ Spliterator spliterator() {
        return M.f(this.f18792a.spliterator());
    }

    public final /* synthetic */ C0449i unordered() {
        return w(this.f18792a.unordered());
    }
}
