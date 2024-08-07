package j$.util.function;

import j$.util.function.Function;

public interface UnaryOperator<T> extends Function<T, T> {

    public final /* synthetic */ class VivifiedWrapper implements UnaryOperator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ java.util.function.UnaryOperator f18514a;

        private /* synthetic */ VivifiedWrapper(java.util.function.UnaryOperator unaryOperator) {
            this.f18514a = unaryOperator;
        }

        public static /* synthetic */ UnaryOperator convert(java.util.function.UnaryOperator unaryOperator) {
            if (unaryOperator == null) {
                return null;
            }
            return new VivifiedWrapper(unaryOperator);
        }

        public final /* synthetic */ Function a(Function function) {
            return Function.VivifiedWrapper.convert(this.f18514a.andThen(E.a(function)));
        }

        public final /* synthetic */ Object apply(Object obj) {
            return this.f18514a.apply(obj);
        }

        public final /* synthetic */ Function d(Function function) {
            return Function.VivifiedWrapper.convert(this.f18514a.compose(E.a(function)));
        }
    }
}
