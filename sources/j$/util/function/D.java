package j$.util.function;

public final /* synthetic */ class D implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18481a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Function f18482b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Function f18483c;

    public /* synthetic */ D(Function function, Function function2, int i10) {
        this.f18481a = i10;
        this.f18482b = function;
        this.f18483c = function2;
    }

    public final Function a(Function function) {
        switch (this.f18481a) {
            case 0:
                function.getClass();
                return new D(this, function, 0);
            default:
                function.getClass();
                return new D(this, function, 0);
        }
    }

    public final Object apply(Object obj) {
        switch (this.f18481a) {
            case 0:
                return this.f18483c.apply(this.f18482b.apply(obj));
            default:
                return this.f18482b.apply(this.f18483c.apply(obj));
        }
    }

    public final Function d(Function function) {
        switch (this.f18481a) {
            case 0:
                function.getClass();
                return new D(this, function, 1);
            default:
                function.getClass();
                return new D(this, function, 1);
        }
    }
}
