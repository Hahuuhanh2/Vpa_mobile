package d4;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.c0;
import com.airbnb.lottie.g0;
import e4.a;
import e4.c;
import e4.p;
import g4.e;
import i4.m;
import j4.b;
import java.util.ArrayList;
import java.util.List;
import n4.f;
import z.k;

/* compiled from: FillContent */
public final class g implements e, a.C0097a, k {

    /* renamed from: a  reason: collision with root package name */
    public final Path f8638a;

    /* renamed from: b  reason: collision with root package name */
    public final c4.a f8639b = new c4.a(1);

    /* renamed from: c  reason: collision with root package name */
    public final b f8640c;

    /* renamed from: d  reason: collision with root package name */
    public final String f8641d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f8642e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f8643f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final a<Integer, Integer> f8644g;

    /* renamed from: h  reason: collision with root package name */
    public final e4.g f8645h;

    /* renamed from: i  reason: collision with root package name */
    public p f8646i;

    /* renamed from: j  reason: collision with root package name */
    public final c0 f8647j;

    /* renamed from: k  reason: collision with root package name */
    public a<Float, Float> f8648k;

    /* renamed from: l  reason: collision with root package name */
    public float f8649l;

    /* renamed from: m  reason: collision with root package name */
    public c f8650m;

    public g(c0 c0Var, b bVar, m mVar) {
        Path path = new Path();
        this.f8638a = path;
        this.f8640c = bVar;
        this.f8641d = mVar.f11134c;
        this.f8642e = mVar.f11137f;
        this.f8647j = c0Var;
        if (bVar.m() != null) {
            a<Float, Float> a10 = ((h4.b) bVar.m().f12907b).a();
            this.f8648k = a10;
            a10.a(this);
            bVar.e(this.f8648k);
        }
        if (bVar.n() != null) {
            this.f8650m = new c(this, bVar, bVar.n());
        }
        if (mVar.f11135d == null || mVar.f11136e == null) {
            this.f8644g = null;
            this.f8645h = null;
            return;
        }
        path.setFillType(mVar.f11133b);
        a<Integer, Integer> a11 = mVar.f11135d.a();
        this.f8644g = a11;
        a11.a(this);
        bVar.e(a11);
        a a12 = mVar.f11136e.a();
        this.f8645h = (e4.g) a12;
        a12.a(this);
        bVar.e(a12);
    }

    public final void a() {
        this.f8647j.invalidateSelf();
    }

    public final void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof m) {
                this.f8643f.add((m) cVar);
            }
        }
    }

    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        this.f8638a.reset();
        for (int i10 = 0; i10 < this.f8643f.size(); i10++) {
            this.f8638a.addPath(((m) this.f8643f.get(i10)).g(), matrix);
        }
        this.f8638a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public final void f(Canvas canvas, Matrix matrix, int i10) {
        BlurMaskFilter blurMaskFilter;
        if (!this.f8642e) {
            e4.b bVar = (e4.b) this.f8644g;
            int l10 = bVar.l(bVar.b(), bVar.d());
            c4.a aVar = this.f8639b;
            PointF pointF = f.f13512a;
            aVar.setColor((Math.max(0, Math.min(255, (int) ((((((float) i10) / 255.0f) * ((float) ((Integer) this.f8645h.f()).intValue())) / 100.0f) * 255.0f))) << 24) | (l10 & 16777215));
            p pVar = this.f8646i;
            if (pVar != null) {
                this.f8639b.setColorFilter((ColorFilter) pVar.f());
            }
            a<Float, Float> aVar2 = this.f8648k;
            if (aVar2 != null) {
                float floatValue = aVar2.f().floatValue();
                if (floatValue == 0.0f) {
                    this.f8639b.setMaskFilter((MaskFilter) null);
                } else if (floatValue != this.f8649l) {
                    b bVar2 = this.f8640c;
                    if (bVar2.A == floatValue) {
                        blurMaskFilter = bVar2.B;
                    } else {
                        BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                        bVar2.B = blurMaskFilter2;
                        bVar2.A = floatValue;
                        blurMaskFilter = blurMaskFilter2;
                    }
                    this.f8639b.setMaskFilter(blurMaskFilter);
                }
                this.f8649l = floatValue;
            }
            c cVar = this.f8650m;
            if (cVar != null) {
                cVar.b(this.f8639b);
            }
            this.f8638a.reset();
            for (int i11 = 0; i11 < this.f8643f.size(); i11++) {
                this.f8638a.addPath(((m) this.f8643f.get(i11)).g(), matrix);
            }
            canvas.drawPath(this.f8638a, this.f8639b);
            m9.b.v();
        }
    }

    public final String getName() {
        return this.f8641d;
    }

    public final void h(k kVar, Object obj) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        c cVar5;
        if (obj == g0.f4801a) {
            this.f8644g.k(kVar);
        } else if (obj == g0.f4804d) {
            this.f8645h.k(kVar);
        } else if (obj == g0.K) {
            p pVar = this.f8646i;
            if (pVar != null) {
                this.f8640c.q(pVar);
            }
            if (kVar == null) {
                this.f8646i = null;
                return;
            }
            p pVar2 = new p(kVar, null);
            this.f8646i = pVar2;
            pVar2.a(this);
            this.f8640c.e(this.f8646i);
        } else if (obj == g0.f4810j) {
            a<Float, Float> aVar = this.f8648k;
            if (aVar != null) {
                aVar.k(kVar);
                return;
            }
            p pVar3 = new p(kVar, null);
            this.f8648k = pVar3;
            pVar3.a(this);
            this.f8640c.e(this.f8648k);
        } else if (obj == g0.f4805e && (cVar5 = this.f8650m) != null) {
            cVar5.f9109b.k(kVar);
        } else if (obj == g0.G && (cVar4 = this.f8650m) != null) {
            cVar4.c(kVar);
        } else if (obj == g0.H && (cVar3 = this.f8650m) != null) {
            cVar3.f9111d.k(kVar);
        } else if (obj == g0.I && (cVar2 = this.f8650m) != null) {
            cVar2.f9112e.k(kVar);
        } else if (obj == g0.J && (cVar = this.f8650m) != null) {
            cVar.f9113f.k(kVar);
        }
    }

    public final void i(e eVar, int i10, ArrayList arrayList, e eVar2) {
        f.d(eVar, i10, arrayList, eVar2, this);
    }
}
