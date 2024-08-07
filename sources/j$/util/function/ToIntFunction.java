package j$.util.function;

public interface ToIntFunction<T> {

    public final /* synthetic */ class VivifiedWrapper implements ToIntFunction {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ java.util.function.ToIntFunction f18511a;

        private /* synthetic */ VivifiedWrapper(java.util.function.ToIntFunction toIntFunction) {
            this.f18511a = toIntFunction;
        }

        public static /* synthetic */ ToIntFunction convert(java.util.function.ToIntFunction toIntFunction) {
            if (toIntFunction == null) {
                return null;
            }
            return toIntFunction instanceof M0 ? ((M0) toIntFunction).f18503a : new VivifiedWrapper(toIntFunction);
        }

        public final /* synthetic */ int applyAsInt(Object obj) {
            return this.f18511a.applyAsInt(obj);
        }
    }

    int applyAsInt(Object obj);
}
