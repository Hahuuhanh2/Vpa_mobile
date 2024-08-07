package e4;

import android.graphics.Color;
import c7.j;
import e4.a;
import o4.b;
import z.k;

/* compiled from: DropShadowKeyframeAnimation */
public final class c implements a.C0097a {

    /* renamed from: a  reason: collision with root package name */
    public final a.C0097a f9108a;

    /* renamed from: b  reason: collision with root package name */
    public final a<Integer, Integer> f9109b;

    /* renamed from: c  reason: collision with root package name */
    public final d f9110c;

    /* renamed from: d  reason: collision with root package name */
    public final d f9111d;

    /* renamed from: e  reason: collision with root package name */
    public final d f9112e;

    /* renamed from: f  reason: collision with root package name */
    public final d f9113f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9114g = true;

    /* compiled from: DropShadowKeyframeAnimation */
    public class a extends k {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ k f9115d;

        public a(k kVar) {
            this.f9115d = kVar;
        }

        public final Object b(b bVar) {
            Float f10 = (Float) this.f9115d.b(bVar);
            if (f10 == null) {
                return null;
            }
            return Float.valueOf(f10.floatValue() * 2.55f);
        }
    }

    public c(a.C0097a aVar, j4.b bVar, j jVar) {
        this.f9108a = aVar;
        a<Integer, Integer> a10 = ((h4.a) jVar.f4572a).a();
        this.f9109b = a10;
        a10.a(this);
        bVar.e(a10);
        a<Float, Float> a11 = ((h4.b) jVar.f4573b).a();
        this.f9110c = (d) a11;
        a11.a(this);
        bVar.e(a11);
        a<Float, Float> a12 = ((h4.b) jVar.f4574c).a();
        this.f9111d = (d) a12;
        a12.a(this);
        bVar.e(a12);
        a<Float, Float> a13 = ((h4.b) jVar.f4575d).a();
        this.f9112e = (d) a13;
        a13.a(this);
        bVar.e(a13);
        a<Float, Float> a14 = ((h4.b) jVar.f4576e).a();
        this.f9113f = (d) a14;
        a14.a(this);
        bVar.e(a14);
    }

    public final void a() {
        this.f9114g = true;
        this.f9108a.a();
    }

    public final void b(c4.a aVar) {
        if (this.f9114g) {
            this.f9114g = false;
            double floatValue = ((double) ((Float) this.f9111d.f()).floatValue()) * 0.017453292519943295d;
            float floatValue2 = ((Float) this.f9112e.f()).floatValue();
            float sin = ((float) Math.sin(floatValue)) * floatValue2;
            float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
            int intValue = this.f9109b.f().intValue();
            aVar.setShadowLayer(((Float) this.f9113f.f()).floatValue(), sin, cos, Color.argb(Math.round(((Float) this.f9110c.f()).floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }

    public final void c(k kVar) {
        if (kVar == null) {
            this.f9110c.k((k) null);
        } else {
            this.f9110c.k(new a(kVar));
        }
    }
}
