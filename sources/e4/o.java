package e4;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.g0;
import e4.a;
import h4.b;
import h4.d;
import h4.e;
import h4.g;
import h4.h;
import java.util.Collections;
import o4.c;
import z.k;

/* compiled from: TransformKeyframeAnimation */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f9137a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f9138b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f9139c;

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f9140d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f9141e;

    /* renamed from: f  reason: collision with root package name */
    public a<PointF, PointF> f9142f;

    /* renamed from: g  reason: collision with root package name */
    public a<?, PointF> f9143g;

    /* renamed from: h  reason: collision with root package name */
    public a<c, c> f9144h;

    /* renamed from: i  reason: collision with root package name */
    public a<Float, Float> f9145i;

    /* renamed from: j  reason: collision with root package name */
    public a<Integer, Integer> f9146j;

    /* renamed from: k  reason: collision with root package name */
    public d f9147k;

    /* renamed from: l  reason: collision with root package name */
    public d f9148l;

    /* renamed from: m  reason: collision with root package name */
    public a<?, Float> f9149m;

    /* renamed from: n  reason: collision with root package name */
    public a<?, Float> f9150n;

    public o(g gVar) {
        a<PointF, PointF> aVar;
        a<PointF, PointF> aVar2;
        a<c, c> aVar3;
        a<Float, Float> aVar4;
        d dVar;
        d dVar2;
        e eVar = gVar.f10550a;
        if (eVar == null) {
            aVar = null;
        } else {
            aVar = eVar.a();
        }
        this.f9142f = aVar;
        h<PointF, PointF> hVar = gVar.f10551b;
        if (hVar == null) {
            aVar2 = null;
        } else {
            aVar2 = hVar.a();
        }
        this.f9143g = aVar2;
        d dVar3 = gVar.f10552c;
        if (dVar3 == null) {
            aVar3 = null;
        } else {
            aVar3 = dVar3.a();
        }
        this.f9144h = aVar3;
        b bVar = gVar.f10553d;
        if (bVar == null) {
            aVar4 = null;
        } else {
            aVar4 = bVar.a();
        }
        this.f9145i = aVar4;
        b bVar2 = gVar.f10555f;
        if (bVar2 == null) {
            dVar = null;
        } else {
            dVar = (d) bVar2.a();
        }
        this.f9147k = dVar;
        if (dVar != null) {
            this.f9138b = new Matrix();
            this.f9139c = new Matrix();
            this.f9140d = new Matrix();
            this.f9141e = new float[9];
        } else {
            this.f9138b = null;
            this.f9139c = null;
            this.f9140d = null;
            this.f9141e = null;
        }
        b bVar3 = gVar.f10556g;
        if (bVar3 == null) {
            dVar2 = null;
        } else {
            dVar2 = (d) bVar3.a();
        }
        this.f9148l = dVar2;
        d dVar4 = gVar.f10554e;
        if (dVar4 != null) {
            this.f9146j = dVar4.a();
        }
        b bVar4 = gVar.f10557h;
        if (bVar4 != null) {
            this.f9149m = bVar4.a();
        } else {
            this.f9149m = null;
        }
        b bVar5 = gVar.f10558i;
        if (bVar5 != null) {
            this.f9150n = bVar5.a();
        } else {
            this.f9150n = null;
        }
    }

    public final void a(j4.b bVar) {
        bVar.e(this.f9146j);
        bVar.e(this.f9149m);
        bVar.e(this.f9150n);
        bVar.e(this.f9142f);
        bVar.e(this.f9143g);
        bVar.e(this.f9144h);
        bVar.e(this.f9145i);
        bVar.e(this.f9147k);
        bVar.e(this.f9148l);
    }

    public final void b(a.C0097a aVar) {
        a<Integer, Integer> aVar2 = this.f9146j;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
        a<?, Float> aVar3 = this.f9149m;
        if (aVar3 != null) {
            aVar3.a(aVar);
        }
        a<?, Float> aVar4 = this.f9150n;
        if (aVar4 != null) {
            aVar4.a(aVar);
        }
        a<PointF, PointF> aVar5 = this.f9142f;
        if (aVar5 != null) {
            aVar5.a(aVar);
        }
        a<?, PointF> aVar6 = this.f9143g;
        if (aVar6 != null) {
            aVar6.a(aVar);
        }
        a<c, c> aVar7 = this.f9144h;
        if (aVar7 != null) {
            aVar7.a(aVar);
        }
        a<Float, Float> aVar8 = this.f9145i;
        if (aVar8 != null) {
            aVar8.a(aVar);
        }
        d dVar = this.f9147k;
        if (dVar != null) {
            dVar.a(aVar);
        }
        d dVar2 = this.f9148l;
        if (dVar2 != null) {
            dVar2.a(aVar);
        }
    }

    public final boolean c(k kVar, Object obj) {
        if (obj == g0.f4806f) {
            a<PointF, PointF> aVar = this.f9142f;
            if (aVar == null) {
                this.f9142f = new p(kVar, new PointF());
                return true;
            }
            aVar.k(kVar);
            return true;
        } else if (obj == g0.f4807g) {
            a<?, PointF> aVar2 = this.f9143g;
            if (aVar2 == null) {
                this.f9143g = new p(kVar, new PointF());
                return true;
            }
            aVar2.k(kVar);
            return true;
        } else {
            if (obj == g0.f4808h) {
                a<?, PointF> aVar3 = this.f9143g;
                if (aVar3 instanceof l) {
                    l lVar = (l) aVar3;
                    k kVar2 = lVar.f9132m;
                    if (kVar2 != null) {
                        kVar2.f17755b = null;
                    }
                    lVar.f9132m = kVar;
                    if (kVar == null) {
                        return true;
                    }
                    kVar.f17755b = lVar;
                    return true;
                }
            }
            if (obj == g0.f4809i) {
                a<?, PointF> aVar4 = this.f9143g;
                if (aVar4 instanceof l) {
                    l lVar2 = (l) aVar4;
                    k kVar3 = lVar2.f9133n;
                    if (kVar3 != null) {
                        kVar3.f17755b = null;
                    }
                    lVar2.f9133n = kVar;
                    if (kVar == null) {
                        return true;
                    }
                    kVar.f17755b = lVar2;
                    return true;
                }
            }
            if (obj == g0.f4815o) {
                a<c, c> aVar5 = this.f9144h;
                if (aVar5 == null) {
                    this.f9144h = new p(kVar, new c());
                    return true;
                }
                aVar5.k(kVar);
                return true;
            } else if (obj == g0.f4816p) {
                a<Float, Float> aVar6 = this.f9145i;
                if (aVar6 == null) {
                    this.f9145i = new p(kVar, Float.valueOf(0.0f));
                    return true;
                }
                aVar6.k(kVar);
                return true;
            } else if (obj == g0.f4803c) {
                a<Integer, Integer> aVar7 = this.f9146j;
                if (aVar7 == null) {
                    this.f9146j = new p(kVar, 100);
                    return true;
                }
                aVar7.k(kVar);
                return true;
            } else if (obj == g0.C) {
                a<?, Float> aVar8 = this.f9149m;
                if (aVar8 == null) {
                    this.f9149m = new p(kVar, Float.valueOf(100.0f));
                    return true;
                }
                aVar8.k(kVar);
                return true;
            } else if (obj == g0.D) {
                a<?, Float> aVar9 = this.f9150n;
                if (aVar9 == null) {
                    this.f9150n = new p(kVar, Float.valueOf(100.0f));
                    return true;
                }
                aVar9.k(kVar);
                return true;
            } else if (obj == g0.f4817q) {
                if (this.f9147k == null) {
                    this.f9147k = new d(Collections.singletonList(new o4.a(Float.valueOf(0.0f))));
                }
                this.f9147k.k(kVar);
                return true;
            } else if (obj != g0.f4818r) {
                return false;
            } else {
                if (this.f9148l == null) {
                    this.f9148l = new d(Collections.singletonList(new o4.a(Float.valueOf(0.0f))));
                }
                this.f9148l.k(kVar);
                return true;
            }
        }
    }

    public final Matrix d() {
        float f10;
        float f11;
        float f12;
        PointF f13;
        this.f9137a.reset();
        a<?, PointF> aVar = this.f9143g;
        if (!(aVar == null || (f13 = aVar.f()) == null)) {
            float f14 = f13.x;
            if (!(f14 == 0.0f && f13.y == 0.0f)) {
                this.f9137a.preTranslate(f14, f13.y);
            }
        }
        a<Float, Float> aVar2 = this.f9145i;
        if (aVar2 != null) {
            if (aVar2 instanceof p) {
                f12 = aVar2.f().floatValue();
            } else {
                f12 = ((d) aVar2).l();
            }
            if (f12 != 0.0f) {
                this.f9137a.preRotate(f12);
            }
        }
        d dVar = this.f9147k;
        if (dVar != null) {
            d dVar2 = this.f9148l;
            if (dVar2 == null) {
                f10 = 0.0f;
            } else {
                f10 = (float) Math.cos(Math.toRadians((double) ((-dVar2.l()) + 90.0f)));
            }
            d dVar3 = this.f9148l;
            if (dVar3 == null) {
                f11 = 1.0f;
            } else {
                f11 = (float) Math.sin(Math.toRadians((double) ((-dVar3.l()) + 90.0f)));
            }
            float tan = (float) Math.tan(Math.toRadians((double) dVar.l()));
            for (int i10 = 0; i10 < 9; i10++) {
                this.f9141e[i10] = 0.0f;
            }
            float[] fArr = this.f9141e;
            fArr[0] = f10;
            fArr[1] = f11;
            float f15 = -f11;
            fArr[3] = f15;
            fArr[4] = f10;
            fArr[8] = 1.0f;
            this.f9138b.setValues(fArr);
            for (int i11 = 0; i11 < 9; i11++) {
                this.f9141e[i11] = 0.0f;
            }
            float[] fArr2 = this.f9141e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f9139c.setValues(fArr2);
            for (int i12 = 0; i12 < 9; i12++) {
                this.f9141e[i12] = 0.0f;
            }
            float[] fArr3 = this.f9141e;
            fArr3[0] = f10;
            fArr3[1] = f15;
            fArr3[3] = f11;
            fArr3[4] = f10;
            fArr3[8] = 1.0f;
            this.f9140d.setValues(fArr3);
            this.f9139c.preConcat(this.f9138b);
            this.f9140d.preConcat(this.f9139c);
            this.f9137a.preConcat(this.f9140d);
        }
        a<c, c> aVar3 = this.f9144h;
        if (aVar3 != null) {
            c f16 = aVar3.f();
            float f17 = f16.f13726a;
            if (!(f17 == 1.0f && f16.f13727b == 1.0f)) {
                this.f9137a.preScale(f17, f16.f13727b);
            }
        }
        a<PointF, PointF> aVar4 = this.f9142f;
        if (aVar4 != null) {
            PointF f18 = aVar4.f();
            float f19 = f18.x;
            if (!(f19 == 0.0f && f18.y == 0.0f)) {
                this.f9137a.preTranslate(-f19, -f18.y);
            }
        }
        return this.f9137a;
    }

    public final Matrix e(float f10) {
        PointF pointF;
        c cVar;
        float f11;
        a<?, PointF> aVar = this.f9143g;
        PointF pointF2 = null;
        if (aVar == null) {
            pointF = null;
        } else {
            pointF = aVar.f();
        }
        a<c, c> aVar2 = this.f9144h;
        if (aVar2 == null) {
            cVar = null;
        } else {
            cVar = aVar2.f();
        }
        this.f9137a.reset();
        if (pointF != null) {
            this.f9137a.preTranslate(pointF.x * f10, pointF.y * f10);
        }
        if (cVar != null) {
            double d10 = (double) f10;
            this.f9137a.preScale((float) Math.pow((double) cVar.f13726a, d10), (float) Math.pow((double) cVar.f13727b, d10));
        }
        a<Float, Float> aVar3 = this.f9145i;
        if (aVar3 != null) {
            float floatValue = aVar3.f().floatValue();
            a<PointF, PointF> aVar4 = this.f9142f;
            if (aVar4 != null) {
                pointF2 = aVar4.f();
            }
            Matrix matrix = this.f9137a;
            float f12 = floatValue * f10;
            float f13 = 0.0f;
            if (pointF2 == null) {
                f11 = 0.0f;
            } else {
                f11 = pointF2.x;
            }
            if (pointF2 != null) {
                f13 = pointF2.y;
            }
            matrix.preRotate(f12, f11, f13);
        }
        return this.f9137a;
    }
}
