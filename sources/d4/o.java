package d4;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.c0;
import com.airbnb.lottie.g0;
import e4.a;
import e4.d;
import g4.e;
import i4.i;
import j4.b;
import java.util.ArrayList;
import java.util.List;
import n4.f;
import z.k;

/* compiled from: RectangleContent */
public final class o implements a.C0097a, k, m {

    /* renamed from: a  reason: collision with root package name */
    public final Path f8701a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final RectF f8702b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    public final String f8703c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f8704d;

    /* renamed from: e  reason: collision with root package name */
    public final c0 f8705e;

    /* renamed from: f  reason: collision with root package name */
    public final a<?, PointF> f8706f;

    /* renamed from: g  reason: collision with root package name */
    public final a<?, PointF> f8707g;

    /* renamed from: h  reason: collision with root package name */
    public final d f8708h;

    /* renamed from: i  reason: collision with root package name */
    public final b f8709i = new b();

    /* renamed from: j  reason: collision with root package name */
    public a<Float, Float> f8710j = null;

    /* renamed from: k  reason: collision with root package name */
    public boolean f8711k;

    public o(c0 c0Var, b bVar, i iVar) {
        this.f8703c = iVar.f11118a;
        this.f8704d = iVar.f11122e;
        this.f8705e = c0Var;
        a<PointF, PointF> a10 = iVar.f11119b.a();
        this.f8706f = a10;
        a<PointF, PointF> a11 = iVar.f11120c.a();
        this.f8707g = a11;
        a<Float, Float> a12 = iVar.f11121d.a();
        this.f8708h = (d) a12;
        bVar.e(a10);
        bVar.e(a11);
        bVar.e(a12);
        a10.a(this);
        a11.a(this);
        a12.a(this);
    }

    public final void a() {
        this.f8711k = false;
        this.f8705e.invalidateSelf();
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
                        this.f8709i.f8618a.add(uVar);
                        uVar.e(this);
                        i10++;
                    }
                }
                if (cVar instanceof q) {
                    this.f8710j = ((q) cVar).f8723b;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final Path g() {
        float f10;
        a<Float, Float> aVar;
        if (this.f8711k) {
            return this.f8701a;
        }
        this.f8701a.reset();
        if (this.f8704d) {
            this.f8711k = true;
            return this.f8701a;
        }
        PointF f11 = this.f8707g.f();
        float f12 = f11.x / 2.0f;
        float f13 = f11.y / 2.0f;
        d dVar = this.f8708h;
        if (dVar == null) {
            f10 = 0.0f;
        } else {
            f10 = dVar.l();
        }
        if (f10 == 0.0f && (aVar = this.f8710j) != null) {
            f10 = Math.min(aVar.f().floatValue(), Math.min(f12, f13));
        }
        float min = Math.min(f12, f13);
        if (f10 > min) {
            f10 = min;
        }
        PointF f14 = this.f8706f.f();
        this.f8701a.moveTo(f14.x + f12, (f14.y - f13) + f10);
        this.f8701a.lineTo(f14.x + f12, (f14.y + f13) - f10);
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            RectF rectF = this.f8702b;
            float f15 = f14.x + f12;
            float f16 = f10 * 2.0f;
            float f17 = f14.y + f13;
            rectF.set(f15 - f16, f17 - f16, f15, f17);
            this.f8701a.arcTo(this.f8702b, 0.0f, 90.0f, false);
        }
        this.f8701a.lineTo((f14.x - f12) + f10, f14.y + f13);
        if (i10 > 0) {
            RectF rectF2 = this.f8702b;
            float f18 = f14.x - f12;
            float f19 = f14.y + f13;
            float f20 = f10 * 2.0f;
            rectF2.set(f18, f19 - f20, f20 + f18, f19);
            this.f8701a.arcTo(this.f8702b, 90.0f, 90.0f, false);
        }
        this.f8701a.lineTo(f14.x - f12, (f14.y - f13) + f10);
        if (i10 > 0) {
            RectF rectF3 = this.f8702b;
            float f21 = f14.x - f12;
            float f22 = f14.y - f13;
            float f23 = f10 * 2.0f;
            rectF3.set(f21, f22, f21 + f23, f23 + f22);
            this.f8701a.arcTo(this.f8702b, 180.0f, 90.0f, false);
        }
        this.f8701a.lineTo((f14.x + f12) - f10, f14.y - f13);
        if (i10 > 0) {
            RectF rectF4 = this.f8702b;
            float f24 = f14.x + f12;
            float f25 = f10 * 2.0f;
            float f26 = f14.y - f13;
            rectF4.set(f24 - f25, f26, f24, f25 + f26);
            this.f8701a.arcTo(this.f8702b, 270.0f, 90.0f, false);
        }
        this.f8701a.close();
        this.f8709i.a(this.f8701a);
        this.f8711k = true;
        return this.f8701a;
    }

    public final String getName() {
        return this.f8703c;
    }

    public final void h(k kVar, Object obj) {
        if (obj == g0.f4812l) {
            this.f8707g.k(kVar);
        } else if (obj == g0.f4814n) {
            this.f8706f.k(kVar);
        } else if (obj == g0.f4813m) {
            this.f8708h.k(kVar);
        }
    }

    public final void i(e eVar, int i10, ArrayList arrayList, e eVar2) {
        f.d(eVar, i10, arrayList, eVar2, this);
    }
}
