package d1;

import java.util.ArrayList;

/* compiled from: RunGroup */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public p f8518a = null;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<p> f8519b = new ArrayList<>();

    public m(p pVar) {
        this.f8518a = pVar;
    }

    public static long a(f fVar, long j10) {
        p pVar = fVar.f8506d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f8513k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.f8513k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f8506d != pVar) {
                    j11 = Math.min(j11, a(fVar2, ((long) fVar2.f8508f) + j10));
                }
            }
        }
        if (fVar != pVar.f8536i) {
            return j11;
        }
        long j12 = j10 - pVar.j();
        return Math.min(Math.min(j11, a(pVar.f8535h, j12)), j12 - ((long) pVar.f8535h.f8508f));
    }

    public static long b(f fVar, long j10) {
        p pVar = fVar.f8506d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f8513k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.f8513k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f8506d != pVar) {
                    j11 = Math.max(j11, b(fVar2, ((long) fVar2.f8508f) + j10));
                }
            }
        }
        if (fVar != pVar.f8535h) {
            return j11;
        }
        long j12 = j10 + pVar.j();
        return Math.max(Math.max(j11, b(pVar.f8536i, j12)), j12 - ((long) pVar.f8536i.f8508f));
    }
}
