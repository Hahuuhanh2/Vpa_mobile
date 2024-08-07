package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;

final class R1 extends C0421b2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f18682b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C0423c f18683c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ R1(C0423c cVar, C0440f2 f2Var, int i10) {
        super(f2Var);
        this.f18682b = i10;
        this.f18683c = cVar;
    }

    public final void accept(Object obj) {
        switch (this.f18682b) {
            case 0:
                ((Consumer) ((C0500v) this.f18683c).f18909u).accept(obj);
                this.f18754a.accept(obj);
                return;
            case 1:
                if (((Predicate) ((C0500v) this.f18683c).f18909u).test(obj)) {
                    this.f18754a.accept(obj);
                    return;
                }
                return;
            case 2:
                this.f18754a.accept(((T1) this.f18683c).f18690u.apply(obj));
                return;
            case 3:
                this.f18754a.accept(((ToIntFunction) ((C0504w) this.f18683c).f18924u).applyAsInt(obj));
                return;
            case 4:
                this.f18754a.accept(((ToLongFunction) ((C0508x) this.f18683c).f18934u).applyAsLong(obj));
                return;
            case 5:
                this.f18754a.accept(((ToDoubleFunction) ((C0496u) this.f18683c).f18903u).applyAsDouble(obj));
                return;
            default:
                Stream stream = (Stream) ((T1) this.f18683c).f18690u.apply(obj);
                if (stream != null) {
                    try {
                        ((Stream) stream.sequential()).forEach(this.f18754a);
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        break;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
        }
        throw th;
    }

    public final void f(long j10) {
        switch (this.f18682b) {
            case 1:
                this.f18754a.f(-1);
                return;
            case 6:
                this.f18754a.f(-1);
                return;
            default:
                this.f18754a.f(j10);
                return;
        }
    }
}
