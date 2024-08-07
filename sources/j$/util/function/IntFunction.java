package j$.util.function;

public interface IntFunction<R> {

    public final /* synthetic */ class VivifiedWrapper implements IntFunction {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ java.util.function.IntFunction f18497a;

        private /* synthetic */ VivifiedWrapper(java.util.function.IntFunction intFunction) {
            this.f18497a = intFunction;
        }

        public static /* synthetic */ IntFunction convert(java.util.function.IntFunction intFunction) {
            if (intFunction == null) {
                return null;
            }
            return intFunction instanceof M ? ((M) intFunction).f18502a : new VivifiedWrapper(intFunction);
        }

        public final /* synthetic */ Object apply(int i10) {
            return this.f18497a.apply(i10);
        }
    }

    Object apply(int i10);
}
