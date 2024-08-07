package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* renamed from: j$.util.stream.f  reason: case insensitive filesystem */
abstract class C0437f extends CountedCompleter {

    /* renamed from: g  reason: collision with root package name */
    static final int f18783g = (ForkJoinPool.getCommonPoolParallelism() << 2);

    /* renamed from: a  reason: collision with root package name */
    protected final C0501v0 f18784a;

    /* renamed from: b  reason: collision with root package name */
    protected Spliterator f18785b;

    /* renamed from: c  reason: collision with root package name */
    protected long f18786c;

    /* renamed from: d  reason: collision with root package name */
    protected C0437f f18787d;

    /* renamed from: e  reason: collision with root package name */
    protected C0437f f18788e;

    /* renamed from: f  reason: collision with root package name */
    private Object f18789f;

    protected C0437f(C0437f fVar, Spliterator spliterator) {
        super(fVar);
        this.f18785b = spliterator;
        this.f18784a = fVar.f18784a;
        this.f18786c = fVar.f18786c;
    }

    protected C0437f(C0501v0 v0Var, Spliterator spliterator) {
        super((CountedCompleter) null);
        this.f18784a = v0Var;
        this.f18785b = spliterator;
        this.f18786c = 0;
    }

    public static long f(long j10) {
        long j11 = j10 / ((long) f18783g);
        if (j11 > 0) {
            return j11;
        }
        return 1;
    }

    /* access modifiers changed from: protected */
    public abstract Object a();

    /* access modifiers changed from: protected */
    public Object b() {
        return this.f18789f;
    }

    /* access modifiers changed from: protected */
    public final C0437f c() {
        return (C0437f) getCompleter();
    }

    public void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f18785b;
        long estimateSize = spliterator.estimateSize();
        long j10 = this.f18786c;
        if (j10 == 0) {
            j10 = f(estimateSize);
            this.f18786c = j10;
        }
        boolean z10 = false;
        C0437f fVar = this;
        while (estimateSize > j10 && (trySplit = spliterator.trySplit()) != null) {
            C0437f d10 = fVar.d(trySplit);
            fVar.f18787d = d10;
            C0437f d11 = fVar.d(spliterator);
            fVar.f18788e = d11;
            fVar.setPendingCount(1);
            if (z10) {
                spliterator = trySplit;
                fVar = d10;
                d10 = d11;
            } else {
                fVar = d11;
            }
            z10 = !z10;
            d10.fork();
            estimateSize = spliterator.estimateSize();
        }
        fVar.e(fVar.a());
        fVar.tryComplete();
    }

    /* access modifiers changed from: protected */
    public abstract C0437f d(Spliterator spliterator);

    /* access modifiers changed from: protected */
    public void e(Object obj) {
        this.f18789f = obj;
    }

    public Object getRawResult() {
        return this.f18789f;
    }

    public void onCompletion(CountedCompleter countedCompleter) {
        this.f18785b = null;
        this.f18788e = null;
        this.f18787d = null;
    }

    /* access modifiers changed from: protected */
    public final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }
}
