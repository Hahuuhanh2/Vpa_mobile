package j$.lang;

import j$.util.DesugarCollections;
import j$.util.function.Consumer;

/* renamed from: j$.lang.Iterable$-CC  reason: invalid class name */
public final /* synthetic */ class Iterable$CC<T> {
    public static void $default$forEach(Iterable iterable, Consumer consumer) {
        if (DesugarCollections.f18330a.isInstance(iterable)) {
            DesugarCollections.c(iterable, consumer);
            return;
        }
        consumer.getClass();
        for (Object accept : iterable) {
            consumer.accept(accept);
        }
    }
}
