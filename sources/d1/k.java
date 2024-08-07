package d1;

import c1.a;
import c1.e;
import java.util.Iterator;

/* compiled from: HelperReferences */
public final class k extends p {
    public k(e eVar) {
        super(eVar);
    }

    public final void a(d dVar) {
        a aVar = (a) this.f8529b;
        int i10 = aVar.f4382y0;
        Iterator it = this.f8535h.f8514l.iterator();
        int i11 = 0;
        int i12 = -1;
        while (it.hasNext()) {
            int i13 = ((f) it.next()).f8509g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (i10 == 0 || i10 == 2) {
            this.f8535h.d(i12 + aVar.A0);
        } else {
            this.f8535h.d(i11 + aVar.A0);
        }
    }

    public final void d() {
        e eVar = this.f8529b;
        if (eVar instanceof a) {
            f fVar = this.f8535h;
            fVar.f8504b = true;
            a aVar = (a) eVar;
            int i10 = aVar.f4382y0;
            boolean z10 = aVar.f4383z0;
            int i11 = 0;
            if (i10 == 0) {
                fVar.f8507e = 4;
                while (i11 < aVar.f4506x0) {
                    e eVar2 = aVar.f4505w0[i11];
                    if (z10 || eVar2.f4438j0 != 8) {
                        f fVar2 = eVar2.f4425d.f8535h;
                        fVar2.f8513k.add(this.f8535h);
                        this.f8535h.f8514l.add(fVar2);
                    }
                    i11++;
                }
                m(this.f8529b.f4425d.f8535h);
                m(this.f8529b.f4425d.f8536i);
            } else if (i10 == 1) {
                fVar.f8507e = 5;
                while (i11 < aVar.f4506x0) {
                    e eVar3 = aVar.f4505w0[i11];
                    if (z10 || eVar3.f4438j0 != 8) {
                        f fVar3 = eVar3.f4425d.f8536i;
                        fVar3.f8513k.add(this.f8535h);
                        this.f8535h.f8514l.add(fVar3);
                    }
                    i11++;
                }
                m(this.f8529b.f4425d.f8535h);
                m(this.f8529b.f4425d.f8536i);
            } else if (i10 == 2) {
                fVar.f8507e = 6;
                while (i11 < aVar.f4506x0) {
                    e eVar4 = aVar.f4505w0[i11];
                    if (z10 || eVar4.f4438j0 != 8) {
                        f fVar4 = eVar4.f4427e.f8535h;
                        fVar4.f8513k.add(this.f8535h);
                        this.f8535h.f8514l.add(fVar4);
                    }
                    i11++;
                }
                m(this.f8529b.f4427e.f8535h);
                m(this.f8529b.f4427e.f8536i);
            } else if (i10 == 3) {
                fVar.f8507e = 7;
                while (i11 < aVar.f4506x0) {
                    e eVar5 = aVar.f4505w0[i11];
                    if (z10 || eVar5.f4438j0 != 8) {
                        f fVar5 = eVar5.f4427e.f8536i;
                        fVar5.f8513k.add(this.f8535h);
                        this.f8535h.f8514l.add(fVar5);
                    }
                    i11++;
                }
                m(this.f8529b.f4427e.f8535h);
                m(this.f8529b.f4427e.f8536i);
            }
        }
    }

    public final void e() {
        e eVar = this.f8529b;
        if (eVar instanceof a) {
            int i10 = ((a) eVar).f4382y0;
            if (i10 == 0 || i10 == 1) {
                eVar.f4422b0 = this.f8535h.f8509g;
            } else {
                eVar.f4424c0 = this.f8535h.f8509g;
            }
        }
    }

    public final void f() {
        this.f8530c = null;
        this.f8535h.c();
    }

    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        this.f8535h.f8513k.add(fVar);
        fVar.f8514l.add(this.f8535h);
    }
}
