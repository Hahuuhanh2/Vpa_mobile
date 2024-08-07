package j$.util.function;

public interface Function<T, R> {

    public final /* synthetic */ class VivifiedWrapper implements Function {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ java.util.function.Function f18488a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Function function) {
            this.f18488a = function;
        }

        public static /* synthetic */ Function convert(java.util.function.Function function) {
            if (function == null) {
                return null;
            }
            return function instanceof E ? ((E) function).f18485a : new VivifiedWrapper(function);
        }

        public final /* synthetic */ Function a(Function function) {
            return convert(this.f18488a.andThen(E.a(function)));
        }

        public final /* synthetic */ Object apply(Object obj) {
            return this.f18488a.apply(obj);
        }

        public final /* synthetic */ Function d(Function function) {
            return convert(this.f18488a.compose(E.a(function)));
        }
    }

    Function a(Function function);

    Object apply(Object obj);

    Function d(Function function);
}
