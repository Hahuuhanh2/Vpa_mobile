package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* renamed from: j$.util.stream.h  reason: case insensitive filesystem */
public final /* synthetic */ class C0445h implements BaseStream {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0449i f18798a;

    private /* synthetic */ C0445h(C0449i iVar) {
        this.f18798a = iVar;
    }

    public static /* synthetic */ BaseStream w(C0449i iVar) {
        if (iVar == null) {
            return null;
        }
        return iVar instanceof C0441g ? ((C0441g) iVar).f18792a : new C0445h(iVar);
    }

    public final /* synthetic */ void close() {
        this.f18798a.close();
    }

    public final /* synthetic */ boolean isParallel() {
        return this.f18798a.isParallel();
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f18798a.iterator();
    }

    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return w(this.f18798a.onClose(runnable));
    }

    public final /* synthetic */ BaseStream parallel() {
        return w(this.f18798a.parallel());
    }

    public final /* synthetic */ BaseStream sequential() {
        return w(this.f18798a.sequential());
    }

    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.f18798a.spliterator());
    }

    public final /* synthetic */ BaseStream unordered() {
        return w(this.f18798a.unordered());
    }
}
