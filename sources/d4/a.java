package d4;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.c0;
import com.airbnb.lottie.g0;
import e4.a;
import e4.c;
import e4.d;
import e4.f;
import e4.g;
import e4.p;
import g4.e;
import j4.b;
import java.util.ArrayList;
import java.util.List;
import z.k;

/* compiled from: BaseStrokeContent */
public abstract class a implements a.C0097a, k, e {

    /* renamed from: a  reason: collision with root package name */
    public final PathMeasure f8599a = new PathMeasure();

    /* renamed from: b  reason: collision with root package name */
    public final Path f8600b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final Path f8601c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final RectF f8602d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    public final c0 f8603e;

    /* renamed from: f  reason: collision with root package name */
    public final b f8604f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f8605g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f8606h;

    /* renamed from: i  reason: collision with root package name */
    public final c4.a f8607i;

    /* renamed from: j  reason: collision with root package name */
    public final d f8608j;

    /* renamed from: k  reason: collision with root package name */
    public final g f8609k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f8610l;

    /* renamed from: m  reason: collision with root package name */
    public final d f8611m;

    /* renamed from: n  reason: collision with root package name */
    public p f8612n;

    /* renamed from: o  reason: collision with root package name */
    public e4.a<Float, Float> f8613o;

    /* renamed from: p  reason: collision with root package name */
    public float f8614p;

    /* renamed from: q  reason: collision with root package name */
    public c f8615q;

    /* renamed from: d4.a$a  reason: collision with other inner class name */
    /* compiled from: BaseStrokeContent */
    public static final class C0087a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f8616a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final u f8617b;

        public C0087a(u uVar) {
            this.f8617b = uVar;
        }
    }

    public a(c0 c0Var, b bVar, Paint.Cap cap, Paint.Join join, float f10, h4.d dVar, h4.b bVar2, List<h4.b> list, h4.b bVar3) {
        c4.a aVar = new c4.a(1);
        this.f8607i = aVar;
        this.f8614p = 0.0f;
        this.f8603e = c0Var;
        this.f8604f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f10);
        this.f8609k = (g) dVar.a();
        this.f8608j = (d) bVar2.a();
        if (bVar3 == null) {
            this.f8611m = null;
        } else {
            this.f8611m = (d) bVar3.a();
        }
        this.f8610l = new ArrayList(list.size());
        this.f8606h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f8610l.add(list.get(i10).a());
        }
        bVar.e(this.f8609k);
        bVar.e(this.f8608j);
        for (int i11 = 0; i11 < this.f8610l.size(); i11++) {
            bVar.e((e4.a) this.f8610l.get(i11));
        }
        d dVar2 = this.f8611m;
        if (dVar2 != null) {
            bVar.e(dVar2);
        }
        this.f8609k.a(this);
        this.f8608j.a(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((e4.a) this.f8610l.get(i12)).a(this);
        }
        d dVar3 = this.f8611m;
        if (dVar3 != null) {
            dVar3.a(this);
        }
        if (bVar.m() != null) {
            e4.a<Float, Float> a10 = ((h4.b) bVar.m().f12907b).a();
            this.f8613o = a10;
            a10.a(this);
            bVar.e(this.f8613o);
        }
        if (bVar.n() != null) {
            this.f8615q = new c(this, bVar, bVar.n());
        }
    }

    public final void a() {
        this.f8603e.invalidateSelf();
    }

    public final void b(List<c> list, List<c> list2) {
        ArrayList arrayList = (ArrayList) list;
        C0087a aVar = null;
        u uVar = null;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof u) {
                u uVar2 = (u) cVar;
                if (uVar2.f8738c == 2) {
                    uVar = uVar2;
                }
            }
        }
        if (uVar != null) {
            uVar.e(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof u) {
                u uVar3 = (u) cVar2;
                if (uVar3.f8738c == 2) {
                    if (aVar != null) {
                        this.f8605g.add(aVar);
                    }
                    C0087a aVar2 = new C0087a(uVar3);
                    uVar3.e(this);
                    aVar = aVar2;
                }
            }
            if (cVar2 instanceof m) {
                if (aVar == null) {
                    aVar = new C0087a(uVar);
                }
                aVar.f8616a.add((m) cVar2);
            }
        }
        if (aVar != null) {
            this.f8605g.add(aVar);
        }
    }

    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        this.f8600b.reset();
        for (int i10 = 0; i10 < this.f8605g.size(); i10++) {
            C0087a aVar = (C0087a) this.f8605g.get(i10);
            for (int i11 = 0; i11 < aVar.f8616a.size(); i11++) {
                this.f8600b.addPath(((m) aVar.f8616a.get(i11)).g(), matrix);
            }
        }
        this.f8600b.computeBounds(this.f8602d, false);
        float l10 = this.f8608j.l();
        RectF rectF2 = this.f8602d;
        float f10 = l10 / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.f8602d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        m9.b.v();
    }

    public void f(Canvas canvas, Matrix matrix, int i10) {
        boolean z10;
        float f10;
        float f11;
        float f12;
        BlurMaskFilter blurMaskFilter;
        float f13;
        Canvas canvas2 = canvas;
        Matrix matrix2 = matrix;
        float[] fArr = (float[]) n4.g.f13516d.get();
        boolean z11 = false;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix2.mapPoints(fArr);
        if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            m9.b.v();
            return;
        }
        f fVar = (f) this.f8609k;
        float l10 = (((float) i10) / 255.0f) * ((float) fVar.l(fVar.b(), fVar.d()));
        float f14 = 100.0f;
        c4.a aVar = this.f8607i;
        PointF pointF = n4.f.f13512a;
        aVar.setAlpha(Math.max(0, Math.min(255, (int) ((l10 / 100.0f) * 255.0f))));
        this.f8607i.setStrokeWidth(n4.g.d(matrix) * this.f8608j.l());
        if (this.f8607i.getStrokeWidth() <= 0.0f) {
            m9.b.v();
            return;
        }
        float f15 = 1.0f;
        if (this.f8610l.isEmpty()) {
            m9.b.v();
        } else {
            float d10 = n4.g.d(matrix);
            for (int i11 = 0; i11 < this.f8610l.size(); i11++) {
                this.f8606h[i11] = ((Float) ((e4.a) this.f8610l.get(i11)).f()).floatValue();
                if (i11 % 2 == 0) {
                    float[] fArr2 = this.f8606h;
                    if (fArr2[i11] < 1.0f) {
                        fArr2[i11] = 1.0f;
                    }
                } else {
                    float[] fArr3 = this.f8606h;
                    if (fArr3[i11] < 0.1f) {
                        fArr3[i11] = 0.1f;
                    }
                }
                float[] fArr4 = this.f8606h;
                fArr4[i11] = fArr4[i11] * d10;
            }
            d dVar = this.f8611m;
            if (dVar == null) {
                f13 = 0.0f;
            } else {
                f13 = ((Float) dVar.f()).floatValue() * d10;
            }
            this.f8607i.setPathEffect(new DashPathEffect(this.f8606h, f13));
            m9.b.v();
        }
        p pVar = this.f8612n;
        if (pVar != null) {
            this.f8607i.setColorFilter((ColorFilter) pVar.f());
        }
        e4.a<Float, Float> aVar2 = this.f8613o;
        if (aVar2 != null) {
            float floatValue = aVar2.f().floatValue();
            if (floatValue == 0.0f) {
                this.f8607i.setMaskFilter((MaskFilter) null);
            } else if (floatValue != this.f8614p) {
                b bVar = this.f8604f;
                if (bVar.A == floatValue) {
                    blurMaskFilter = bVar.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    bVar.B = blurMaskFilter2;
                    bVar.A = floatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                this.f8607i.setMaskFilter(blurMaskFilter);
            }
            this.f8614p = floatValue;
        }
        c cVar = this.f8615q;
        if (cVar != null) {
            cVar.b(this.f8607i);
        }
        int i12 = 0;
        while (i12 < this.f8605g.size()) {
            C0087a aVar3 = (C0087a) this.f8605g.get(i12);
            if (aVar3.f8617b != null) {
                this.f8600b.reset();
                int size = aVar3.f8616a.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.f8600b.addPath(((m) aVar3.f8616a.get(size)).g(), matrix2);
                }
                float floatValue2 = ((Float) aVar3.f8617b.f8739d.f()).floatValue() / f14;
                float floatValue3 = ((Float) aVar3.f8617b.f8740e.f()).floatValue() / f14;
                float floatValue4 = ((Float) aVar3.f8617b.f8741f.f()).floatValue() / 360.0f;
                if (floatValue2 >= 0.01f || floatValue3 <= 0.99f) {
                    this.f8599a.setPath(this.f8600b, z11);
                    float length = this.f8599a.getLength();
                    while (this.f8599a.nextContour()) {
                        length += this.f8599a.getLength();
                    }
                    float f16 = floatValue4 * length;
                    float f17 = (floatValue2 * length) + f16;
                    float min = Math.min((floatValue3 * length) + f16, (f17 + length) - f15);
                    int size2 = aVar3.f8616a.size() - 1;
                    float f18 = 0.0f;
                    while (size2 >= 0) {
                        this.f8601c.set(((m) aVar3.f8616a.get(size2)).g());
                        this.f8601c.transform(matrix2);
                        this.f8599a.setPath(this.f8601c, z11);
                        float length2 = this.f8599a.getLength();
                        if (min > length) {
                            float f19 = min - length;
                            if (f19 < f18 + length2 && f18 < f19) {
                                if (f17 > length) {
                                    f12 = (f17 - length) / length2;
                                } else {
                                    f12 = 0.0f;
                                }
                                n4.g.a(this.f8601c, f12, Math.min(f19 / length2, f15), 0.0f);
                                canvas2.drawPath(this.f8601c, this.f8607i);
                                f18 += length2;
                                size2--;
                                z11 = false;
                                f15 = 1.0f;
                            }
                        }
                        float f20 = f18 + length2;
                        if (f20 >= f17 && f18 <= min) {
                            if (f20 > min || f17 >= f18) {
                                if (f17 < f18) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = (f17 - f18) / length2;
                                }
                                if (min > f20) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = (min - f18) / length2;
                                }
                                n4.g.a(this.f8601c, f10, f11, 0.0f);
                                canvas2.drawPath(this.f8601c, this.f8607i);
                            } else {
                                canvas2.drawPath(this.f8601c, this.f8607i);
                            }
                        }
                        f18 += length2;
                        size2--;
                        z11 = false;
                        f15 = 1.0f;
                    }
                    m9.b.v();
                } else {
                    canvas2.drawPath(this.f8600b, this.f8607i);
                    m9.b.v();
                }
            } else {
                this.f8600b.reset();
                for (int size3 = aVar3.f8616a.size() - 1; size3 >= 0; size3--) {
                    this.f8600b.addPath(((m) aVar3.f8616a.get(size3)).g(), matrix2);
                }
                m9.b.v();
                canvas2.drawPath(this.f8600b, this.f8607i);
                m9.b.v();
            }
            i12++;
            z11 = false;
            f15 = 1.0f;
            f14 = 100.0f;
        }
        m9.b.v();
    }

    public void h(k kVar, Object obj) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        c cVar5;
        if (obj == g0.f4804d) {
            this.f8609k.k(kVar);
        } else if (obj == g0.f4819s) {
            this.f8608j.k(kVar);
        } else if (obj == g0.K) {
            p pVar = this.f8612n;
            if (pVar != null) {
                this.f8604f.q(pVar);
            }
            if (kVar == null) {
                this.f8612n = null;
                return;
            }
            p pVar2 = new p(kVar, null);
            this.f8612n = pVar2;
            pVar2.a(this);
            this.f8604f.e(this.f8612n);
        } else if (obj == g0.f4810j) {
            e4.a<Float, Float> aVar = this.f8613o;
            if (aVar != null) {
                aVar.k(kVar);
                return;
            }
            p pVar3 = new p(kVar, null);
            this.f8613o = pVar3;
            pVar3.a(this);
            this.f8604f.e(this.f8613o);
        } else if (obj == g0.f4805e && (cVar5 = this.f8615q) != null) {
            cVar5.f9109b.k(kVar);
        } else if (obj == g0.G && (cVar4 = this.f8615q) != null) {
            cVar4.c(kVar);
        } else if (obj == g0.H && (cVar3 = this.f8615q) != null) {
            cVar3.f9111d.k(kVar);
        } else if (obj == g0.I && (cVar2 = this.f8615q) != null) {
            cVar2.f9112e.k(kVar);
        } else if (obj == g0.J && (cVar = this.f8615q) != null) {
            cVar.f9113f.k(kVar);
        }
    }

    public final void i(e eVar, int i10, ArrayList arrayList, e eVar2) {
        n4.f.d(eVar, i10, arrayList, eVar2, this);
    }
}
