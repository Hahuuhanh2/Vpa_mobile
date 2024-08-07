package j$.util.concurrent;

import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
import java.util.Iterator;

final class t extends c implements Collection {
    private static final long serialVersionUID = 2249069246763182397L;

    t(ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        return this.f18419a.containsValue(obj);
    }

    public final void forEach(Consumer consumer) {
        consumer.getClass();
        m[] mVarArr = this.f18419a.f18404a;
        if (mVarArr != null) {
            q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                m f10 = qVar.f();
                if (f10 != null) {
                    consumer.accept(f10.f18431c);
                } else {
                    return;
                }
            }
        }
    }

    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f18419a;
        m[] mVarArr = concurrentHashMap.f18404a;
        int length = mVarArr == null ? 0 : mVarArr.length;
        return new i(mVarArr, length, length, concurrentHashMap, 1);
    }

    public final boolean remove(Object obj) {
        b bVar;
        if (obj == null) {
            return false;
        }
        Iterator it = iterator();
        do {
            bVar = (b) it;
            if (!bVar.hasNext()) {
                return false;
            }
        } while (!obj.equals(((i) it).next()));
        bVar.remove();
        return true;
    }

    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return Collection.CC.$default$removeIf(this, Predicate.VivifiedWrapper.convert(predicate));
    }

    public final Spliterator spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f18419a;
        long l10 = concurrentHashMap.l();
        m[] mVarArr = concurrentHashMap.f18404a;
        int length = mVarArr == null ? 0 : mVarArr.length;
        long j10 = 0;
        if (l10 >= 0) {
            j10 = l10;
        }
        return new k(mVarArr, length, 0, length, j10, 1);
    }

    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection.CC.$default$toArray(this, intFunction);
    }

    public final /* synthetic */ Object[] toArray(java.util.function.IntFunction intFunction) {
        return Collection.CC.$default$toArray(this, IntFunction.VivifiedWrapper.convert(intFunction));
    }
}
