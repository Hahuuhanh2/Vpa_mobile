package j$.util.function;

public interface BiFunction<T, U, R> {

    public final /* synthetic */ class VivifiedWrapper implements BiFunction {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ java.util.function.BiFunction f18479a;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiFunction biFunction) {
            this.f18479a = biFunction;
        }

        public static /* synthetic */ BiFunction convert(java.util.function.BiFunction biFunction) {
            if (biFunction == null) {
                return null;
            }
            return biFunction instanceof C0364b ? ((C0364b) biFunction).f18520a : new VivifiedWrapper(biFunction);
        }

        public final /* synthetic */ BiFunction a(Function function) {
            return convert(this.f18479a.andThen(E.a(function)));
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            return this.f18479a.apply(obj, obj2);
        }
    }

    BiFunction a(Function function);

    Object apply(Object obj, Object obj2);
}
