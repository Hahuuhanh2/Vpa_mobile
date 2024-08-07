package j$.util.function;

public interface ToLongFunction<T> {

    public final /* synthetic */ class VivifiedWrapper implements ToLongFunction {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ java.util.function.ToLongFunction f18512a;

        private /* synthetic */ VivifiedWrapper(java.util.function.ToLongFunction toLongFunction) {
            this.f18512a = toLongFunction;
        }

        public static /* synthetic */ ToLongFunction convert(java.util.function.ToLongFunction toLongFunction) {
            if (toLongFunction == null) {
                return null;
            }
            return toLongFunction instanceof N0 ? ((N0) toLongFunction).f18505a : new VivifiedWrapper(toLongFunction);
        }

        public final /* synthetic */ long applyAsLong(Object obj) {
            return this.f18512a.applyAsLong(obj);
        }
    }

    long applyAsLong(Object obj);
}
