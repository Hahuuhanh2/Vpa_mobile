package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

final class U extends CountedCompleter {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f18713h = 0;

    /* renamed from: a  reason: collision with root package name */
    private final C0501v0 f18714a;

    /* renamed from: b  reason: collision with root package name */
    private Spliterator f18715b;

    /* renamed from: c  reason: collision with root package name */
    private final long f18716c;

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentHashMap f18717d;

    /* renamed from: e  reason: collision with root package name */
    private final C0440f2 f18718e;

    /* renamed from: f  reason: collision with root package name */
    private final U f18719f;

    /* renamed from: g  reason: collision with root package name */
    private E0 f18720g;

    U(U u10, Spliterator spliterator, U u11) {
        super(u10);
        this.f18714a = u10.f18714a;
        this.f18715b = spliterator;
        this.f18716c = u10.f18716c;
        this.f18717d = u10.f18717d;
        this.f18718e = u10.f18718e;
        this.f18719f = u11;
    }

    protected U(C0501v0 v0Var, Spliterator spliterator, C0440f2 f2Var) {
        super((CountedCompleter) null);
        this.f18714a = v0Var;
        this.f18715b = spliterator;
        this.f18716c = C0437f.f(spliterator.estimateSize());
        this.f18717d = new ConcurrentHashMap(Math.max(16, C0437f.f18783g << 1));
        this.f18718e = f2Var;
        this.f18719f = null;
    }

    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f18715b;
        long j10 = this.f18716c;
        boolean z10 = false;
        U u10 = this;
        while (spliterator.estimateSize() > j10 && (trySplit = spliterator.trySplit()) != null) {
            U u11 = new U(u10, trySplit, u10.f18719f);
            U u12 = new U(u10, spliterator, u11);
            u10.addToPendingCount(1);
            u12.addToPendingCount(1);
            u10.f18717d.put(u11, u12);
            if (u10.f18719f != null) {
                u11.addToPendingCount(1);
                if (u10.f18717d.replace(u10.f18719f, u10, u11)) {
                    u10.addToPendingCount(-1);
                } else {
                    u11.addToPendingCount(-1);
                }
            }
            if (z10) {
                spliterator = trySplit;
                u10 = u11;
                u11 = u12;
            } else {
                u10 = u12;
            }
            z10 = !z10;
            u11.fork();
        }
        if (u10.getPendingCount() > 0) {
            C0418b bVar = new C0418b(16);
            C0501v0 v0Var = u10.f18714a;
            C0517z0 p12 = v0Var.p1(v0Var.Y0(spliterator), bVar);
            u10.f18714a.u1(spliterator, p12);
            u10.f18720g = p12.build();
            u10.f18715b = null;
        }
        u10.tryComplete();
    }

    public final void onCompletion(CountedCompleter countedCompleter) {
        E0 e02 = this.f18720g;
        if (e02 != null) {
            e02.forEach(this.f18718e);
            this.f18720g = null;
        } else {
            Spliterator spliterator = this.f18715b;
            if (spliterator != null) {
                this.f18714a.u1(spliterator, this.f18718e);
                this.f18715b = null;
            }
        }
        U u10 = (U) this.f18717d.remove(this);
        if (u10 != null) {
            u10.tryComplete();
        }
    }
}
