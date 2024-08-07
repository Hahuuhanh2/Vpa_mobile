package j$.util.function;

import j$.util.concurrent.u;

public interface Consumer<T> {

    /* renamed from: j$.util.function.Consumer$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<T> {
        public static Consumer $default$andThen(Consumer consumer, Consumer consumer2) {
            consumer2.getClass();
            return new u(3, consumer, consumer2);
        }
    }

    public final /* synthetic */ class VivifiedWrapper implements Consumer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ java.util.function.Consumer f18480a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Consumer consumer) {
            this.f18480a = consumer;
        }

        public static /* synthetic */ Consumer convert(java.util.function.Consumer consumer) {
            if (consumer == null) {
                return null;
            }
            return consumer instanceof C0374g ? ((C0374g) consumer).f18530a : new VivifiedWrapper(consumer);
        }

        public final /* synthetic */ void accept(Object obj) {
            this.f18480a.accept(obj);
        }

        public final /* synthetic */ Consumer andThen(Consumer consumer) {
            return convert(this.f18480a.andThen(C0374g.a(consumer)));
        }
    }

    void accept(T t10);

    Consumer<T> andThen(Consumer<? super T> consumer);
}
