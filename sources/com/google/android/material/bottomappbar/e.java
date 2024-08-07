package com.google.android.material.bottomappbar;

import android.support.v4.media.a;
import l8.f;
import l8.p;

/* compiled from: BottomAppBarTopEdgeTreatment */
public final class e extends f implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public float f5796a;

    /* renamed from: b  reason: collision with root package name */
    public float f5797b;

    /* renamed from: c  reason: collision with root package name */
    public float f5798c;

    /* renamed from: d  reason: collision with root package name */
    public float f5799d;

    /* renamed from: e  reason: collision with root package name */
    public float f5800e;

    /* renamed from: f  reason: collision with root package name */
    public float f5801f = -1.0f;

    public e(float f10, float f11, float f12) {
        this.f5797b = f10;
        this.f5796a = f11;
        if (f12 >= 0.0f) {
            this.f5799d = f12;
            this.f5800e = 0.0f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    public final void b(float f10, float f11, float f12, p pVar) {
        boolean z10;
        float f13;
        float f14;
        float f15 = f10;
        float f16 = f12;
        p pVar2 = pVar;
        float f17 = this.f5798c;
        if (f17 == 0.0f) {
            pVar2.d(f15, 0.0f);
            return;
        }
        float f18 = ((this.f5797b * 2.0f) + f17) / 2.0f;
        float f19 = f16 * this.f5796a;
        float f20 = f11 + this.f5800e;
        float e10 = a.e(1.0f, f16, f18, this.f5799d * f16);
        if (e10 / f18 >= 1.0f) {
            pVar2.d(f15, 0.0f);
            return;
        }
        float f21 = this.f5801f;
        float f22 = f21 * f16;
        if (f21 == -1.0f || Math.abs((f21 * 2.0f) - f17) < 0.1f) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        if (!z11) {
            f14 = 1.75f;
            f13 = 0.0f;
        } else {
            f13 = e10;
            f14 = 0.0f;
        }
        float f23 = f18 + f19;
        float f24 = f13 + f19;
        float sqrt = (float) Math.sqrt((double) ((f23 * f23) - (f24 * f24)));
        float f25 = f20 - sqrt;
        float f26 = f20 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f24)));
        float f27 = (90.0f - degrees) + f14;
        pVar2.d(f25, 0.0f);
        float f28 = f19 * 2.0f;
        float f29 = degrees;
        pVar.a(f25 - f19, 0.0f, f25 + f19, f28, 270.0f, degrees);
        if (z11) {
            pVar.a(f20 - f18, (-f18) - f13, f20 + f18, f18 - f13, 180.0f - f27, (f27 * 2.0f) - 180.0f);
        } else {
            float f30 = this.f5797b;
            float f31 = f22 * 2.0f;
            float f32 = f20 - f18;
            float f33 = f22 + f30;
            pVar.a(f32, -f33, f32 + f30 + f31, f33, 180.0f - f27, ((f27 * 2.0f) - 180.0f) / 2.0f);
            float f34 = f20 + f18;
            float f35 = this.f5797b;
            pVar2.d(f34 - ((f35 / 2.0f) + f22), f35 + f22);
            float f36 = this.f5797b;
            float f37 = f22 + f36;
            pVar.a(f34 - (f31 + f36), -f37, f34, f37, 90.0f, f27 - 0.049804688f);
        }
        pVar.a(f26 - f19, 0.0f, f26 + f19, f28, 270.0f - f29, f29);
        pVar2.d(f15, 0.0f);
    }
}
