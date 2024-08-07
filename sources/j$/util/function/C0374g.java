package j$.util.function;

import j$.util.function.Consumer;
import java.util.function.Consumer;

/* renamed from: j$.util.function.g  reason: case insensitive filesystem */
public final /* synthetic */ class C0374g implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Consumer f18530a;

    private /* synthetic */ C0374g(Consumer consumer) {
        this.f18530a = consumer;
    }

    public static /* synthetic */ Consumer a(Consumer consumer) {
        if (consumer == null) {
            return null;
        }
        return consumer instanceof Consumer.VivifiedWrapper ? ((Consumer.VivifiedWrapper) consumer).f18480a : new C0374g(consumer);
    }

    public final /* synthetic */ void accept(Object obj) {
        this.f18530a.accept(obj);
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return a(this.f18530a.andThen(Consumer.VivifiedWrapper.convert(consumer)));
    }
}
