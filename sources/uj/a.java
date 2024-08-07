package uj;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import sj.b;

/* compiled from: DisposableHelper */
public enum a implements b {
    ;

    /* access modifiers changed from: public */
    a() {
    }

    public static void c(AtomicReference atomicReference) {
        b bVar;
        b bVar2 = (b) atomicReference.get();
        a aVar = f23082a;
        if (bVar2 != aVar && (bVar = (b) atomicReference.getAndSet(aVar)) != aVar && bVar != null) {
            bVar.b();
        }
    }

    public static boolean i(AtomicReference<b> atomicReference, b bVar) {
        boolean z10;
        Objects.requireNonNull(bVar, "d is null");
        while (true) {
            if (!atomicReference.compareAndSet((Object) null, bVar)) {
                if (atomicReference.get() != null) {
                    z10 = false;
                    break;
                }
            } else {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return true;
        }
        bVar.b();
        if (atomicReference.get() != f23082a) {
            bk.a.a(new ProtocolViolationException());
        }
        return false;
    }

    public final void b() {
    }
}
