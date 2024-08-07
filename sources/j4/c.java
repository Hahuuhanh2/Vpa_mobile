package j4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.airbnb.lottie.c0;
import com.airbnb.lottie.g0;
import com.airbnb.lottie.i;
import e4.a;
import e4.p;
import f0.b0;
import h4.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n4.g;
import v.v;
import v0.e;
import z.k;

/* compiled from: CompositionLayer */
public final class c extends b {
    public a<Float, Float> C;
    public final ArrayList D = new ArrayList();
    public final RectF E = new RectF();
    public final RectF F = new RectF();
    public final Paint G = new Paint();
    public boolean H = true;

    public c(c0 c0Var, e eVar, List<e> list, i iVar) {
        super(c0Var, eVar);
        int i10;
        b bVar;
        b bVar2;
        b bVar3 = eVar.f11680s;
        if (bVar3 != null) {
            a<Float, Float> a10 = bVar3.a();
            this.C = a10;
            e(a10);
            this.C.a(this);
        } else {
            this.C = null;
        }
        e eVar2 = new e(iVar.f4840i.size());
        int size = list.size() - 1;
        b bVar4 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar3 = list.get(size);
            int g2 = v.g(eVar3.f11666e);
            if (g2 == 0) {
                bVar2 = new c(c0Var, eVar3, iVar.f4834c.get(eVar3.f11668g), iVar);
            } else if (g2 == 1) {
                bVar2 = new h(c0Var, eVar3);
            } else if (g2 == 2) {
                bVar2 = new d(c0Var, eVar3);
            } else if (g2 == 3) {
                bVar2 = new f(c0Var, eVar3);
            } else if (g2 == 4) {
                bVar2 = new g(c0Var, eVar3, this);
            } else if (g2 != 5) {
                StringBuilder q10 = android.support.v4.media.a.q("Unknown layer type ");
                q10.append(b0.H(eVar3.f11666e));
                n4.c.b(q10.toString());
                bVar2 = null;
            } else {
                bVar2 = new i(c0Var, eVar3);
            }
            if (bVar2 != null) {
                eVar2.j(bVar2, bVar2.f11651p.f11665d);
                if (bVar4 != null) {
                    bVar4.f11654s = bVar2;
                    bVar4 = null;
                } else {
                    this.D.add(0, bVar2);
                    int g10 = v.g(eVar3.f11682u);
                    if (g10 == 1 || g10 == 2) {
                        bVar4 = bVar2;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < eVar2.l(); i10++) {
            b bVar5 = (b) eVar2.f((Long) null, eVar2.g(i10));
            if (!(bVar5 == null || (bVar = (b) eVar2.f((Long) null, bVar5.f11651p.f11667f)) == null)) {
                bVar5.f11655t = bVar;
            }
        }
    }

    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        for (int size = this.D.size() - 1; size >= 0; size--) {
            this.E.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) this.D.get(size)).d(this.E, this.f11649n, true);
            rectF.union(this.E);
        }
    }

    public final void h(k kVar, Object obj) {
        super.h(kVar, obj);
        if (obj != g0.E) {
            return;
        }
        if (kVar == null) {
            a<Float, Float> aVar = this.C;
            if (aVar != null) {
                aVar.k((k) null);
                return;
            }
            return;
        }
        p pVar = new p(kVar, null);
        this.C = pVar;
        pVar.a(this);
        e(this.C);
    }

    public final void l(Canvas canvas, Matrix matrix, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        RectF rectF = this.F;
        e eVar = this.f11651p;
        rectF.set(0.0f, 0.0f, (float) eVar.f11676o, (float) eVar.f11677p);
        matrix.mapRect(this.F);
        if (!this.f11650o.f4789y || this.D.size() <= 1 || i10 == 255) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.G.setAlpha(i10);
            RectF rectF2 = this.F;
            Paint paint = this.G;
            g.a aVar = g.f13513a;
            canvas.saveLayer(rectF2, paint);
            m9.b.v();
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.D.size() - 1; size >= 0; size--) {
            if (this.H || !"__container".equals(this.f11651p.f11664c)) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11 || this.F.isEmpty()) {
                z12 = true;
            } else {
                z12 = canvas.clipRect(this.F);
            }
            if (z12) {
                ((b) this.D.get(size)).f(canvas, matrix, i10);
            }
        }
        canvas.restore();
        m9.b.v();
    }

    public final void r(g4.e eVar, int i10, ArrayList arrayList, g4.e eVar2) {
        for (int i11 = 0; i11 < this.D.size(); i11++) {
            ((b) this.D.get(i11)).i(eVar, i10, arrayList, eVar2);
        }
    }

    public final void s(boolean z10) {
        super.s(z10);
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            ((b) it.next()).s(z10);
        }
    }

    public final void t(float f10) {
        super.t(f10);
        a<Float, Float> aVar = this.C;
        if (aVar != null) {
            i iVar = this.f11650o.f4772a;
            f10 = ((aVar.f().floatValue() * this.f11651p.f11663b.f4844m) - this.f11651p.f11663b.f4842k) / ((iVar.f4843l - iVar.f4842k) + 0.01f);
        }
        if (this.C == null) {
            e eVar = this.f11651p;
            float f11 = eVar.f11675n;
            i iVar2 = eVar.f11663b;
            f10 -= f11 / (iVar2.f4843l - iVar2.f4842k);
        }
        e eVar2 = this.f11651p;
        if (eVar2.f11674m != 0.0f && !"__container".equals(eVar2.f11664c)) {
            f10 /= this.f11651p.f11674m;
        }
        int size = this.D.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((b) this.D.get(size)).t(f10);
            } else {
                return;
            }
        }
    }
}
