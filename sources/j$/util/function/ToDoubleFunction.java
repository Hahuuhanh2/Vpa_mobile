package j$.util.function;

public interface ToDoubleFunction<T> {

    public final /* synthetic */ class VivifiedWrapper implements ToDoubleFunction {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ java.util.function.ToDoubleFunction f18510a;

        private /* synthetic */ VivifiedWrapper(java.util.function.ToDoubleFunction toDoubleFunction) {
            this.f18510a = toDoubleFunction;
        }

        public static /* synthetic */ ToDoubleFunction convert(java.util.function.ToDoubleFunction toDoubleFunction) {
            if (toDoubleFunction == null) {
                return null;
            }
            return toDoubleFunction instanceof L0 ? ((L0) toDoubleFunction).f18501a : new VivifiedWrapper(toDoubleFunction);
        }

        public final /* synthetic */ double applyAsDouble(Object obj) {
            return this.f18510a.applyAsDouble(obj);
        }
    }

    double applyAsDouble(Object obj);
}
