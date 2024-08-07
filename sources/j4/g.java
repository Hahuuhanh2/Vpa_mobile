package j4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import c7.j;
import com.airbnb.lottie.c0;
import d4.d;
import g4.e;
import i4.n;
import java.util.ArrayList;
import java.util.Collections;
import lc.b;

/* compiled from: ShapeLayer */
public final class g extends b {
    public final d C;
    public final c D;

    public g(c0 c0Var, e eVar, c cVar) {
        super(c0Var, eVar);
        this.D = cVar;
        d dVar = new d(c0Var, this, new n("__container", eVar.f11662a, false));
        this.C = dVar;
        dVar.b(Collections.emptyList(), Collections.emptyList());
    }

    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        this.C.d(rectF, this.f11649n, z10);
    }

    public final void l(Canvas canvas, Matrix matrix, int i10) {
        this.C.f(canvas, matrix, i10);
    }

    public final b m() {
        b bVar = this.f11651p.f11684w;
        if (bVar != null) {
            return bVar;
        }
        return this.D.f11651p.f11684w;
    }

    public final j n() {
        j jVar = this.f11651p.f11685x;
        if (jVar != null) {
            return jVar;
        }
        return this.D.f11651p.f11685x;
    }

    public final void r(e eVar, int i10, ArrayList arrayList, e eVar2) {
        this.C.i(eVar, i10, arrayList, eVar2);
    }
}
