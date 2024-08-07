package j$.util.stream;

import j$.util.C;
import j$.util.Spliterator;
import j$.util.function.IntFunction;

/* renamed from: j$.util.stream.n2  reason: case insensitive filesystem */
final class C0472n2 extends A {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f18844v = 0;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ long f18845t;

    /* renamed from: u  reason: collision with root package name */
    final /* synthetic */ long f18846u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0472n2(C0423c cVar, int i10, long j10, long j11) {
        super(cVar, i10);
        this.f18845t = j10;
        this.f18846u = j11;
    }

    static C Q1(C c10, long j10, long j11, long j12) {
        long j13;
        long j14;
        if (j10 <= j12) {
            j13 = j11 >= 0 ? Math.min(j11, j12 - j10) : j12 - j10;
            j14 = 0;
        } else {
            j14 = j10;
            j13 = j11;
        }
        return new r3(c10, j14, j13);
    }

    /* access modifiers changed from: package-private */
    public final E0 F1(Spliterator spliterator, IntFunction intFunction, C0423c cVar) {
        Spliterator spliterator2 = spliterator;
        C0423c cVar2 = cVar;
        long Y0 = cVar2.Y0(spliterator);
        if (Y0 > 0 && spliterator.hasCharacteristics(16384)) {
            return C0501v0.P0(cVar2, C0501v0.I0(cVar.C1(), spliterator, this.f18845t, this.f18846u), true);
        } else if (!T2.ORDERED.t(cVar.e1())) {
            return C0501v0.P0(this, Q1((C) cVar2.M1(spliterator), this.f18845t, this.f18846u, Y0), true);
        } else {
            return (E0) new C0480p2(this, cVar, spliterator, intFunction, this.f18845t, this.f18846u).invoke();
        }
    }

    /* access modifiers changed from: package-private */
    public final Spliterator G1(C0423c cVar, Spliterator spliterator) {
        long Y0 = cVar.Y0(spliterator);
        if (Y0 > 0 && spliterator.hasCharacteristics(16384)) {
            long j10 = this.f18845t;
            return new j3((C) cVar.M1(spliterator), j10, C0501v0.H0(j10, this.f18846u));
        } else if (!T2.ORDERED.t(cVar.e1())) {
            return Q1((C) cVar.M1(spliterator), this.f18845t, this.f18846u, Y0);
        } else {
            return ((E0) new C0480p2(this, cVar, spliterator, new J0(11), this.f18845t, this.f18846u).invoke()).spliterator();
        }
    }

    /* access modifiers changed from: package-private */
    public final C0440f2 I1(int i10, C0440f2 f2Var) {
        return new C0468m2(this, f2Var);
    }
}
