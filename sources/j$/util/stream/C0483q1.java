package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.q1  reason: case insensitive filesystem */
abstract class C0483q1 extends CountedCompleter implements C0440f2 {

    /* renamed from: a  reason: collision with root package name */
    protected final Spliterator f18867a;

    /* renamed from: b  reason: collision with root package name */
    protected final C0501v0 f18868b;

    /* renamed from: c  reason: collision with root package name */
    protected final long f18869c;

    /* renamed from: d  reason: collision with root package name */
    protected long f18870d;

    /* renamed from: e  reason: collision with root package name */
    protected long f18871e;

    /* renamed from: f  reason: collision with root package name */
    protected int f18872f;

    /* renamed from: g  reason: collision with root package name */
    protected int f18873g;

    C0483q1(int i10, Spliterator spliterator, C0501v0 v0Var) {
        this.f18867a = spliterator;
        this.f18868b = v0Var;
        this.f18869c = C0437f.f(spliterator.estimateSize());
        this.f18870d = 0;
        this.f18871e = (long) i10;
    }

    C0483q1(C0483q1 q1Var, Spliterator spliterator, long j10, long j11, int i10) {
        super(q1Var);
        this.f18867a = spliterator;
        this.f18868b = q1Var.f18868b;
        this.f18869c = q1Var.f18869c;
        this.f18870d = j10;
        this.f18871e = j11;
        if (j10 < 0 || j11 < 0 || (j10 + j11) - 1 >= ((long) i10)) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", new Object[]{Long.valueOf(j10), Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10)}));
        }
    }

    /* access modifiers changed from: package-private */
    public abstract C0483q1 a(Spliterator spliterator, long j10, long j11);

    public /* synthetic */ void accept(double d10) {
        C0501v0.n0();
        throw null;
    }

    public /* synthetic */ void accept(int i10) {
        C0501v0.u0();
        throw null;
    }

    public /* synthetic */ void accept(long j10) {
        C0501v0.v0();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f18867a;
        C0483q1 q1Var = this;
        while (spliterator.estimateSize() > q1Var.f18869c && (trySplit = spliterator.trySplit()) != null) {
            q1Var.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            q1Var.a(trySplit, q1Var.f18870d, estimateSize).fork();
            q1Var = q1Var.a(spliterator, q1Var.f18870d + estimateSize, q1Var.f18871e - estimateSize);
        }
        q1Var.f18868b.u1(spliterator, q1Var);
        q1Var.propagateCompletion();
    }

    public final /* synthetic */ void end() {
    }

    public final void f(long j10) {
        long j11 = this.f18871e;
        if (j10 <= j11) {
            int i10 = (int) this.f18870d;
            this.f18872f = i10;
            this.f18873g = i10 + ((int) j11);
            return;
        }
        throw new IllegalStateException("size passed to Sink.begin exceeds array length");
    }

    public final /* synthetic */ boolean h() {
        return false;
    }
}
