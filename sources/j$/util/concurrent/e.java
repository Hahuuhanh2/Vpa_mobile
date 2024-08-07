package j$.util.concurrent;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class e extends b implements Iterator, j$.util.Iterator {
    e(m[] mVarArr, int i10, int i11, ConcurrentHashMap concurrentHashMap) {
        super(mVarArr, i10, i11, concurrentHashMap);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final Object next() {
        m mVar = this.f18438b;
        if (mVar != null) {
            Object obj = mVar.f18430b;
            Object obj2 = mVar.f18431c;
            this.f18418j = mVar;
            f();
            return new l(obj, obj2, this.f18417i);
        }
        throw new NoSuchElementException();
    }
}
