package d4;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.c0;
import com.airbnb.lottie.g0;
import e4.a;
import e4.d;
import g4.e;
import i4.h;
import j4.b;
import java.util.ArrayList;
import java.util.List;
import n4.f;
import v.v;
import z.k;

/* compiled from: PolystarContent */
public final class n implements m, a.C0097a, k {

    /* renamed from: a  reason: collision with root package name */
    public final Path f8686a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final String f8687b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f8688c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8689d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f8690e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f8691f;

    /* renamed from: g  reason: collision with root package name */
    public final d f8692g;

    /* renamed from: h  reason: collision with root package name */
    public final a<?, PointF> f8693h;

    /* renamed from: i  reason: collision with root package name */
    public final d f8694i;

    /* renamed from: j  reason: collision with root package name */
    public final d f8695j;

    /* renamed from: k  reason: collision with root package name */
    public final d f8696k;

    /* renamed from: l  reason: collision with root package name */
    public final d f8697l;

    /* renamed from: m  reason: collision with root package name */
    public final d f8698m;

    /* renamed from: n  reason: collision with root package name */
    public final b f8699n = new b();

    /* renamed from: o  reason: collision with root package name */
    public boolean f8700o;

    public n(c0 c0Var, b bVar, h hVar) {
        this.f8688c = c0Var;
        this.f8687b = hVar.f11107a;
        int i10 = hVar.f11108b;
        this.f8689d = i10;
        this.f8690e = hVar.f11116j;
        this.f8691f = hVar.f11117k;
        a<Float, Float> a10 = hVar.f11109c.a();
        this.f8692g = (d) a10;
        a<PointF, PointF> a11 = hVar.f11110d.a();
        this.f8693h = a11;
        a<Float, Float> a12 = hVar.f11111e.a();
        this.f8694i = (d) a12;
        a<Float, Float> a13 = hVar.f11113g.a();
        this.f8696k = (d) a13;
        a<Float, Float> a14 = hVar.f11115i.a();
        this.f8698m = (d) a14;
        if (i10 == 1) {
            this.f8695j = (d) hVar.f11112f.a();
            this.f8697l = (d) hVar.f11114h.a();
        } else {
            this.f8695j = null;
            this.f8697l = null;
        }
        bVar.e(a10);
        bVar.e(a11);
        bVar.e(a12);
        bVar.e(a13);
        bVar.e(a14);
        if (i10 == 1) {
            bVar.e(this.f8695j);
            bVar.e(this.f8697l);
        }
        a10.a(this);
        a11.a(this);
        a12.a(this);
        a13.a(this);
        a14.a(this);
        if (i10 == 1) {
            this.f8695j.a(this);
            this.f8697l.a(this);
        }
    }

    public final void a() {
        this.f8700o = false;
        this.f8688c.invalidateSelf();
    }

    public final void b(List<c> list, List<c> list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i10 < arrayList.size()) {
                c cVar = (c) arrayList.get(i10);
                if (cVar instanceof u) {
                    u uVar = (u) cVar;
                    if (uVar.f8738c == 1) {
                        this.f8699n.f8618a.add(uVar);
                        uVar.e(this);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final Path g() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        double d10;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        double d11;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        double d12;
        double d13;
        double d14;
        if (this.f8700o) {
            return this.f8686a;
        }
        this.f8686a.reset();
        if (this.f8690e) {
            this.f8700o = true;
            return this.f8686a;
        }
        int g2 = v.g(this.f8689d);
        double d15 = 0.0d;
        if (g2 == 0) {
            float floatValue = ((Float) this.f8692g.f()).floatValue();
            d dVar = this.f8694i;
            if (dVar != null) {
                d15 = (double) ((Float) dVar.f()).floatValue();
            }
            double radians = Math.toRadians(d15 - 90.0d);
            double d16 = (double) floatValue;
            float f28 = (float) (6.283185307179586d / d16);
            if (this.f8691f) {
                f28 *= -1.0f;
            }
            float f29 = f28 / 2.0f;
            float f30 = floatValue - ((float) ((int) floatValue));
            int i10 = (f30 > 0.0f ? 1 : (f30 == 0.0f ? 0 : -1));
            if (i10 != 0) {
                radians += (double) ((1.0f - f30) * f29);
            }
            float floatValue2 = ((Float) this.f8696k.f()).floatValue();
            float floatValue3 = ((Float) this.f8695j.f()).floatValue();
            d dVar2 = this.f8697l;
            if (dVar2 != null) {
                f10 = ((Float) dVar2.f()).floatValue() / 100.0f;
            } else {
                f10 = 0.0f;
            }
            d dVar3 = this.f8698m;
            if (dVar3 != null) {
                f11 = ((Float) dVar3.f()).floatValue() / 100.0f;
            } else {
                f11 = 0.0f;
            }
            if (i10 != 0) {
                f16 = android.support.v4.media.a.e(floatValue2, floatValue3, f30, floatValue3);
                double d17 = (double) f16;
                f13 = floatValue3;
                f12 = f10;
                f15 = (float) (Math.cos(radians) * d17);
                f14 = (float) (d17 * Math.sin(radians));
                this.f8686a.moveTo(f15, f14);
                d10 = radians + ((double) ((f28 * f30) / 2.0f));
            } else {
                f13 = floatValue3;
                f12 = f10;
                double d18 = (double) floatValue2;
                float cos = (float) (Math.cos(radians) * d18);
                f14 = (float) (Math.sin(radians) * d18);
                this.f8686a.moveTo(cos, f14);
                d10 = radians + ((double) f29);
                f15 = cos;
                f16 = 0.0f;
            }
            double ceil = Math.ceil(d16) * 2.0d;
            float f31 = f29;
            int i11 = i10;
            int i12 = 0;
            boolean z10 = false;
            while (true) {
                double d19 = (double) i12;
                if (d19 >= ceil) {
                    break;
                }
                if (z10) {
                    f17 = floatValue2;
                } else {
                    f17 = f13;
                }
                int i13 = (f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1));
                if (i13 == 0 || d19 != ceil - 2.0d) {
                    f18 = f28;
                    f19 = f31;
                } else {
                    f18 = f28;
                    f19 = (f28 * f30) / 2.0f;
                }
                if (i13 == 0 || d19 != ceil - 1.0d) {
                    f20 = f16;
                    f16 = f17;
                    f21 = f19;
                } else {
                    f21 = f19;
                    f20 = f16;
                }
                double d20 = (double) f16;
                double d21 = d19;
                float cos2 = (float) (Math.cos(d10) * d20);
                float sin = (float) (d20 * Math.sin(d10));
                if (f12 == 0.0f && f11 == 0.0f) {
                    this.f8686a.lineTo(cos2, sin);
                    f22 = sin;
                    d11 = d10;
                    f23 = f11;
                } else {
                    d11 = d10;
                    float f32 = f14;
                    float f33 = f11;
                    double atan2 = (double) ((float) (Math.atan2((double) f14, (double) f15) - 1.5707963267948966d));
                    float cos3 = (float) Math.cos(atan2);
                    float sin2 = (float) Math.sin(atan2);
                    float f34 = f32;
                    f22 = sin;
                    f23 = f33;
                    double atan22 = (double) ((float) (Math.atan2((double) sin, (double) cos2) - 1.5707963267948966d));
                    float cos4 = (float) Math.cos(atan22);
                    float sin3 = (float) Math.sin(atan22);
                    if (z10) {
                        f24 = f12;
                    } else {
                        f24 = f23;
                    }
                    if (z10) {
                        f25 = f23;
                    } else {
                        f25 = f12;
                    }
                    if (z10) {
                        f26 = f13;
                    } else {
                        f26 = floatValue2;
                    }
                    if (z10) {
                        f27 = floatValue2;
                    } else {
                        f27 = f13;
                    }
                    float f35 = f26 * f24 * 0.47829f;
                    float f36 = cos3 * f35;
                    float f37 = f35 * sin2;
                    float f38 = f27 * f25 * 0.47829f;
                    float f39 = cos4 * f38;
                    float f40 = f38 * sin3;
                    if (i11 != 0) {
                        if (i12 == 0) {
                            f36 *= f30;
                            f37 *= f30;
                        } else if (d21 == ceil - 1.0d) {
                            f39 *= f30;
                            f40 *= f30;
                        }
                    }
                    this.f8686a.cubicTo(f15 - f36, f34 - f37, cos2 + f39, f22 + f40, cos2, f22);
                }
                d10 = d11 + ((double) f21);
                z10 = !z10;
                i12++;
                f15 = cos2;
                f16 = f20;
                f28 = f18;
                f14 = f22;
                f11 = f23;
            }
            PointF f41 = this.f8693h.f();
            this.f8686a.offset(f41.x, f41.y);
            this.f8686a.close();
        } else if (g2 == 1) {
            int floor = (int) Math.floor((double) ((Float) this.f8692g.f()).floatValue());
            d dVar4 = this.f8694i;
            if (dVar4 != null) {
                d15 = (double) ((Float) dVar4.f()).floatValue();
            }
            double radians2 = Math.toRadians(d15 - 90.0d);
            double d22 = (double) floor;
            float floatValue4 = ((Float) this.f8698m.f()).floatValue() / 100.0f;
            float floatValue5 = ((Float) this.f8696k.f()).floatValue();
            double d23 = (double) floatValue5;
            float cos5 = (float) (Math.cos(radians2) * d23);
            float sin4 = (float) (Math.sin(radians2) * d23);
            this.f8686a.moveTo(cos5, sin4);
            double d24 = (double) ((float) (6.283185307179586d / d22));
            double d25 = radians2 + d24;
            double ceil2 = Math.ceil(d22);
            int i14 = 0;
            while (((double) i14) < ceil2) {
                float cos6 = (float) (Math.cos(d25) * d23);
                double d26 = ceil2;
                float sin5 = (float) (Math.sin(d25) * d23);
                if (floatValue4 != 0.0f) {
                    d14 = d23;
                    d13 = d25;
                    double atan23 = (double) ((float) (Math.atan2((double) sin4, (double) cos5) - 1.5707963267948966d));
                    float cos7 = (float) Math.cos(atan23);
                    d12 = d24;
                    double atan24 = (double) ((float) (Math.atan2((double) sin5, (double) cos6) - 1.5707963267948966d));
                    float f42 = floatValue5 * floatValue4 * 0.25f;
                    this.f8686a.cubicTo(cos5 - (cos7 * f42), sin4 - (((float) Math.sin(atan23)) * f42), cos6 + (((float) Math.cos(atan24)) * f42), sin5 + (f42 * ((float) Math.sin(atan24))), cos6, sin5);
                } else {
                    d13 = d25;
                    d14 = d23;
                    d12 = d24;
                    this.f8686a.lineTo(cos6, sin5);
                }
                d25 = d13 + d12;
                i14++;
                sin4 = sin5;
                cos5 = cos6;
                ceil2 = d26;
                d23 = d14;
                d24 = d12;
            }
            PointF f43 = this.f8693h.f();
            this.f8686a.offset(f43.x, f43.y);
            this.f8686a.close();
        }
        this.f8686a.close();
        this.f8699n.a(this.f8686a);
        this.f8700o = true;
        return this.f8686a;
    }

    public final String getName() {
        return this.f8687b;
    }

    public final void h(k kVar, Object obj) {
        d dVar;
        d dVar2;
        if (obj == g0.f4823w) {
            this.f8692g.k(kVar);
        } else if (obj == g0.f4824x) {
            this.f8694i.k(kVar);
        } else if (obj == g0.f4814n) {
            this.f8693h.k(kVar);
        } else if (obj == g0.f4825y && (dVar2 = this.f8695j) != null) {
            dVar2.k(kVar);
        } else if (obj == g0.f4826z) {
            this.f8696k.k(kVar);
        } else if (obj == g0.A && (dVar = this.f8697l) != null) {
            dVar.k(kVar);
        } else if (obj == g0.B) {
            this.f8698m.k(kVar);
        }
    }

    public final void i(e eVar, int i10, ArrayList arrayList, e eVar2) {
        f.d(eVar, i10, arrayList, eVar2, this);
    }
}
