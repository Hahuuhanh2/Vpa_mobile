package j$.util.function;

public interface BiConsumer<T, U> {

    public final /* synthetic */ class VivifiedWrapper implements BiConsumer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ java.util.function.BiConsumer f18478a;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiConsumer biConsumer) {
            this.f18478a = biConsumer;
        }

        public static /* synthetic */ BiConsumer convert(java.util.function.BiConsumer biConsumer) {
            if (biConsumer == null) {
                return null;
            }
            return biConsumer instanceof C0362a ? ((C0362a) biConsumer).f18518a : new VivifiedWrapper(biConsumer);
        }

        public final /* synthetic */ void accept(Object obj, Object obj2) {
            this.f18478a.accept(obj, obj2);
        }

        public final /* synthetic */ BiConsumer c(BiConsumer biConsumer) {
            return convert(this.f18478a.andThen(C0362a.a(biConsumer)));
        }
    }

    void accept(Object obj, Object obj2);

    BiConsumer c(BiConsumer biConsumer);
}
