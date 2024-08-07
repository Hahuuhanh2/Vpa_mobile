package cd;

/* compiled from: PerspectiveTransform */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final float f4712a;

    /* renamed from: b  reason: collision with root package name */
    public final float f4713b;

    /* renamed from: c  reason: collision with root package name */
    public final float f4714c;

    /* renamed from: d  reason: collision with root package name */
    public final float f4715d;

    /* renamed from: e  reason: collision with root package name */
    public final float f4716e;

    /* renamed from: f  reason: collision with root package name */
    public final float f4717f;

    /* renamed from: g  reason: collision with root package name */
    public final float f4718g;

    /* renamed from: h  reason: collision with root package name */
    public final float f4719h;

    /* renamed from: i  reason: collision with root package name */
    public final float f4720i;

    public g(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f4712a = f10;
        this.f4713b = f13;
        this.f4714c = f16;
        this.f4715d = f11;
        this.f4716e = f14;
        this.f4717f = f17;
        this.f4718g = f12;
        this.f4719h = f15;
        this.f4720i = f18;
    }

    public static g a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) {
        g b10 = b(f10, f11, f12, f13, f14, f15, f16, f17);
        float f26 = b10.f4716e;
        float f27 = b10.f4720i;
        float f28 = b10.f4717f;
        float f29 = b10.f4719h;
        float f30 = (f26 * f27) - (f28 * f29);
        float f31 = b10.f4718g;
        float f32 = b10.f4715d;
        float f33 = (f28 * f31) - (f32 * f27);
        float f34 = (f32 * f29) - (f26 * f31);
        float f35 = b10.f4714c;
        float f36 = b10.f4713b;
        float f37 = (f35 * f29) - (f36 * f27);
        float f38 = b10.f4712a;
        float f39 = (f27 * f38) - (f35 * f31);
        float f40 = (f31 * f36) - (f29 * f38);
        float f41 = (f36 * f28) - (f35 * f26);
        float f42 = (f35 * f32) - (f28 * f38);
        float f43 = (f38 * f26) - (f36 * f32);
        g b11 = b(f18, f19, f20, f21, f22, f23, f24, f25);
        float f44 = b11.f4712a;
        float f45 = b11.f4715d;
        float f46 = b11.f4718g;
        float f47 = (f45 * f37) + (f44 * f30) + (f46 * f41);
        float f48 = (f46 * f42) + (f45 * f39) + (f44 * f33);
        float f49 = f46 * f43;
        float f50 = f49 + (f45 * f40) + (f44 * f34);
        float f51 = b11.f4713b;
        float f52 = f50;
        float f53 = b11.f4716e;
        float f54 = b11.f4719h;
        float f55 = (f54 * f41) + (f53 * f37) + (f51 * f30);
        float f56 = (f53 * f39) + (f51 * f33);
        float f57 = (f53 * f40) + (f51 * f34) + (f54 * f43);
        float f58 = b11.f4714c;
        float f59 = b11.f4717f;
        float f60 = f37 * f59;
        float f61 = b11.f4720i;
        return new g(f47, f48, f52, f55, (f54 * f42) + f56, f57, (f41 * f61) + f60 + (f30 * f58), (f39 * f59) + (f33 * f58) + (f42 * f61), (f61 * f43) + (f59 * f40) + (f58 * f34));
    }

    public static g b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18 = ((f10 - f12) + f14) - f16;
        float f19 = ((f11 - f13) + f15) - f17;
        if (f18 == 0.0f && f19 == 0.0f) {
            return new g(f12 - f10, f14 - f12, f10, f13 - f11, f15 - f13, f11, 0.0f, 0.0f, 1.0f);
        }
        float f20 = f12 - f14;
        float f21 = f16 - f14;
        float f22 = f13 - f15;
        float f23 = f17 - f15;
        float f24 = (f20 * f23) - (f21 * f22);
        float f25 = ((f23 * f18) - (f21 * f19)) / f24;
        float f26 = ((f20 * f19) - (f18 * f22)) / f24;
        return new g((f25 * f12) + (f12 - f10), (f26 * f16) + (f16 - f10), f10, (f25 * f13) + (f13 - f11), (f26 * f17) + (f17 - f11), f11, f25, f26, 1.0f);
    }
}
