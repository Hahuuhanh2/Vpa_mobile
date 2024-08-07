package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;

/* renamed from: j$.util.stream.h2  reason: case insensitive filesystem */
final class C0448h2 extends V1 {

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ long f18799t;

    /* renamed from: u  reason: collision with root package name */
    final /* synthetic */ long f18800u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0448h2(C0423c cVar, int i10, long j10, long j11) {
        super(cVar, i10);
        this.f18799t = j10;
        this.f18800u = j11;
    }

    static Spliterator O1(Spliterator spliterator, long j10, long j11, long j12) {
        long j13;
        long j14;
        if (j10 <= j12) {
            j13 = j11 >= 0 ? Math.min(j11, j12 - j10) : j12 - j10;
            j14 = 0;
        } else {
            j14 = j10;
            j13 = j11;
        }
        return new v3(spliterator, j14, j13);
    }

    /* access modifiers changed from: package-private */
    public final E0 F1(Spliterator spliterator, IntFunction intFunction, C0423c cVar) {
        Spliterator spliterator2 = spliterator;
        IntFunction intFunction2 = intFunction;
        C0423c cVar2 = cVar;
        long Y0 = cVar2.Y0(spliterator2);
        if (Y0 > 0 && spliterator2.hasCharacteristics(16384)) {
            return C0501v0.O0(cVar2, C0501v0.I0(cVar.C1(), spliterator, this.f18799t, this.f18800u), true, intFunction2);
        } else if (!T2.ORDERED.t(cVar.e1())) {
            return C0501v0.O0(this, O1(cVar2.M1(spliterator2), this.f18799t, this.f18800u, Y0), true, intFunction2);
        } else {
            return (E0) new C0480p2(this, cVar, spliterator, intFunction, this.f18799t, this.f18800u).invoke();
        }
    }

    /* access modifiers changed from: package-private */
    public final Spliterator G1(C0423c cVar, Spliterator spliterator) {
        long Y0 = cVar.Y0(spliterator);
        if (Y0 > 0 && spliterator.hasCharacteristics(16384)) {
            Spliterator M1 = cVar.M1(spliterator);
            long j10 = this.f18799t;
            return new p3(M1, j10, C0501v0.H0(j10, this.f18800u));
        } else if (!T2.ORDERED.t(cVar.e1())) {
            return O1(cVar.M1(spliterator), this.f18799t, this.f18800u, Y0);
        } else {
            return ((E0) new C0480p2(this, cVar, spliterator, new J0(8), this.f18799t, this.f18800u).invoke()).spliterator();
        }
    }

    /* access modifiers changed from: package-private */
    public final C0440f2 I1(int i10, C0440f2 f2Var) {
        return new C0444g2(this, f2Var);
    }
}
