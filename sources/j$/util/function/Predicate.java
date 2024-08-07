package j$.util.function;

public interface Predicate<T> {

    /* renamed from: j$.util.function.Predicate$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<T> {
        public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
            predicate2.getClass();
            return new G0(predicate, predicate2, 0);
        }

        public static Predicate $default$negate(Predicate predicate) {
            return new C0366c(2, predicate);
        }

        public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
            predicate2.getClass();
            return new G0(predicate, predicate2, 1);
        }
    }

    public final /* synthetic */ class VivifiedWrapper implements Predicate {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ java.util.function.Predicate f18507a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Predicate predicate) {
            this.f18507a = predicate;
        }

        public static /* synthetic */ Predicate convert(java.util.function.Predicate predicate) {
            if (predicate == null) {
                return null;
            }
            return predicate instanceof H0 ? ((H0) predicate).f18493a : new VivifiedWrapper(predicate);
        }

        public final /* synthetic */ Predicate and(Predicate predicate) {
            return convert(this.f18507a.and(H0.a(predicate)));
        }

        public final /* synthetic */ Predicate negate() {
            return convert(this.f18507a.negate());
        }

        public final /* synthetic */ Predicate or(Predicate predicate) {
            return convert(this.f18507a.or(H0.a(predicate)));
        }

        public final /* synthetic */ boolean test(Object obj) {
            return this.f18507a.test(obj);
        }
    }

    Predicate<T> and(Predicate<? super T> predicate);

    Predicate<T> negate();

    Predicate<T> or(Predicate<? super T> predicate);

    boolean test(T t10);
}
