package d1;

import c1.e;
import c1.h;

/* compiled from: GuidelineReference */
public final class j extends p {
    public j(e eVar) {
        super(eVar);
        eVar.f4425d.f();
        eVar.f4427e.f();
        this.f8533f = ((h) eVar).A0;
    }

    public final void a(d dVar) {
        f fVar = this.f8535h;
        if (fVar.f8505c && !fVar.f8512j) {
            this.f8535h.d((int) ((((float) ((f) fVar.f8514l.get(0)).f8509g) * ((h) this.f8529b).f4501w0) + 0.5f));
        }
    }

    public final void d() {
        e eVar = this.f8529b;
        h hVar = (h) eVar;
        int i10 = hVar.f4502x0;
        int i11 = hVar.f4503y0;
        if (hVar.A0 == 1) {
            if (i10 != -1) {
                this.f8535h.f8514l.add(eVar.W.f4425d.f8535h);
                this.f8529b.W.f4425d.f8535h.f8513k.add(this.f8535h);
                this.f8535h.f8508f = i10;
            } else if (i11 != -1) {
                this.f8535h.f8514l.add(eVar.W.f4425d.f8536i);
                this.f8529b.W.f4425d.f8536i.f8513k.add(this.f8535h);
                this.f8535h.f8508f = -i11;
            } else {
                f fVar = this.f8535h;
                fVar.f8504b = true;
                fVar.f8514l.add(eVar.W.f4425d.f8536i);
                this.f8529b.W.f4425d.f8536i.f8513k.add(this.f8535h);
            }
            m(this.f8529b.f4425d.f8535h);
            m(this.f8529b.f4425d.f8536i);
            return;
        }
        if (i10 != -1) {
            this.f8535h.f8514l.add(eVar.W.f4427e.f8535h);
            this.f8529b.W.f4427e.f8535h.f8513k.add(this.f8535h);
            this.f8535h.f8508f = i10;
        } else if (i11 != -1) {
            this.f8535h.f8514l.add(eVar.W.f4427e.f8536i);
            this.f8529b.W.f4427e.f8536i.f8513k.add(this.f8535h);
            this.f8535h.f8508f = -i11;
        } else {
            f fVar2 = this.f8535h;
            fVar2.f8504b = true;
            fVar2.f8514l.add(eVar.W.f4427e.f8536i);
            this.f8529b.W.f4427e.f8536i.f8513k.add(this.f8535h);
        }
        m(this.f8529b.f4427e.f8535h);
        m(this.f8529b.f4427e.f8536i);
    }

    public final void e() {
        e eVar = this.f8529b;
        if (((h) eVar).A0 == 1) {
            eVar.f4422b0 = this.f8535h.f8509g;
        } else {
            eVar.f4424c0 = this.f8535h.f8509g;
        }
    }

    public final void f() {
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
