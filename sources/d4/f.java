package d4;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.c0;
import com.airbnb.lottie.g0;
import e4.a;
import e4.g;
import g4.e;
import j4.b;
import java.util.ArrayList;
import java.util.List;
import z.k;

/* compiled from: EllipseContent */
public final class f implements m, a.C0097a, k {

    /* renamed from: a  reason: collision with root package name */
    public final Path f8630a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final String f8631b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f8632c;

    /* renamed from: d  reason: collision with root package name */
    public final g f8633d;

    /* renamed from: e  reason: collision with root package name */
    public final a<?, PointF> f8634e;

    /* renamed from: f  reason: collision with root package name */
    public final i4.a f8635f;

    /* renamed from: g  reason: collision with root package name */
    public final b f8636g = new b();

    /* renamed from: h  reason: collision with root package name */
    public boolean f8637h;

    public f(c0 c0Var, b bVar, i4.a aVar) {
        this.f8631b = aVar.f11073a;
        this.f8632c = c0Var;
        a a10 = aVar.f11075c.a();
        this.f8633d = (g) a10;
        a<PointF, PointF> a11 = aVar.f11074b.a();
        this.f8634e = a11;
        this.f8635f = aVar;
        bVar.e(a10);
        bVar.e(a11);
        a10.a(this);
        a11.a(this);
    }

    public final void a() {
        this.f8637h = false;
        this.f8632c.invalidateSelf();
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
                        this.f8636g.f8618a.add(uVar);
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
        if (this.f8637h) {
            return this.f8630a;
        }
        this.f8630a.reset();
        if (this.f8635f.f11077e) {
            this.f8637h = true;
            return this.f8630a;
        }
        PointF pointF = (PointF) this.f8633d.f();
        float f10 = pointF.x / 2.0f;
        float f11 = pointF.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = 0.55228f * f11;
        this.f8630a.reset();
        if (this.f8635f.f11076d) {
            float f14 = -f11;
            this.f8630a.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.f8630a.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            float f19 = f14;
            this.f8630a.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f20 = f12 + 0.0f;
            this.f8630a.cubicTo(f20, f11, f10, f18, f10, 0.0f);
            this.f8630a.cubicTo(f10, f17, f20, f19, 0.0f, f19);
        } else {
            float f21 = -f11;
            this.f8630a.moveTo(0.0f, f21);
            float f22 = f12 + 0.0f;
            float f23 = 0.0f - f13;
            this.f8630a.cubicTo(f22, f21, f10, f23, f10, 0.0f);
            float f24 = f13 + 0.0f;
            this.f8630a.cubicTo(f10, f24, f22, f11, 0.0f, f11);
            float f25 = 0.0f - f12;
            float f26 = -f10;
            this.f8630a.cubicTo(f25, f11, f26, f24, f26, 0.0f);
            float f27 = f21;
            this.f8630a.cubicTo(f26, f23, f25, f27, 0.0f, f27);
        }
        PointF f28 = this.f8634e.f();
        this.f8630a.offset(f28.x, f28.y);
        this.f8630a.close();
        this.f8636g.a(this.f8630a);
        this.f8637h = true;
        return this.f8630a;
    }

    public final String getName() {
        return this.f8631b;
    }

    public final void h(k kVar, Object obj) {
        if (obj == g0.f4811k) {
            this.f8633d.k(kVar);
        } else if (obj == g0.f4814n) {
            this.f8634e.k(kVar);
        }
    }

    public final void i(e eVar, int i10, ArrayList arrayList, e eVar2) {
        n4.f.d(eVar, i10, arrayList, eVar2, this);
    }
}
