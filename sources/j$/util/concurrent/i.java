package j$.util.concurrent;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class i extends b implements Iterator, Enumeration, j$.util.Iterator {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f18423k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(m[] mVarArr, int i10, int i11, ConcurrentHashMap concurrentHashMap, int i12) {
        super(mVarArr, i10, i11, concurrentHashMap);
        this.f18423k = i12;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        switch (this.f18423k) {
            case 0:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
            default:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
        }
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        switch (this.f18423k) {
            case 0:
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
                return;
            default:
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
                return;
        }
    }

    public final Object next() {
        switch (this.f18423k) {
            case 0:
                m mVar = this.f18438b;
                if (mVar != null) {
                    Object obj = mVar.f18430b;
                    this.f18418j = mVar;
                    f();
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                m mVar2 = this.f18438b;
                if (mVar2 != null) {
                    Object obj2 = mVar2.f18431c;
                    this.f18418j = mVar2;
                    f();
                    return obj2;
                }
                throw new NoSuchElementException();
        }
    }

    public final Object nextElement() {
        switch (this.f18423k) {
            case 0:
                return next();
            default:
                return next();
        }
    }
}
