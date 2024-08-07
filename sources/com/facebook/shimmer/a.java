package com.facebook.shimmer;

import android.content.res.TypedArray;
import android.graphics.RectF;
import n0.l;

/* compiled from: Shimmer */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f5015a = new float[4];

    /* renamed from: b  reason: collision with root package name */
    public final int[] f5016b = new int[4];

    /* renamed from: c  reason: collision with root package name */
    public int f5017c;

    /* renamed from: d  reason: collision with root package name */
    public int f5018d;

    /* renamed from: e  reason: collision with root package name */
    public int f5019e;

    /* renamed from: f  reason: collision with root package name */
    public int f5020f;

    /* renamed from: g  reason: collision with root package name */
    public int f5021g;

    /* renamed from: h  reason: collision with root package name */
    public int f5022h;

    /* renamed from: i  reason: collision with root package name */
    public float f5023i;

    /* renamed from: j  reason: collision with root package name */
    public float f5024j;

    /* renamed from: k  reason: collision with root package name */
    public float f5025k;

    /* renamed from: l  reason: collision with root package name */
    public float f5026l;

    /* renamed from: m  reason: collision with root package name */
    public float f5027m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5028n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5029o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5030p;

    /* renamed from: q  reason: collision with root package name */
    public int f5031q;

    /* renamed from: r  reason: collision with root package name */
    public int f5032r;

    /* renamed from: s  reason: collision with root package name */
    public long f5033s;

    /* renamed from: t  reason: collision with root package name */
    public long f5034t;

    /* renamed from: com.facebook.shimmer.a$a  reason: collision with other inner class name */
    /* compiled from: Shimmer */
    public static class C0055a extends b<C0055a> {
        public C0055a() {
            this.f5035a.f5030p = true;
        }

        public final b c() {
            return this;
        }
    }

    /* compiled from: Shimmer */
    public static abstract class b<T extends b<T>> {

        /* renamed from: a  reason: collision with root package name */
        public final a f5035a = new a();

        public final a a() {
            a aVar = this.f5035a;
            int i10 = aVar.f5020f;
            if (i10 != 1) {
                int[] iArr = aVar.f5016b;
                int i11 = aVar.f5019e;
                iArr[0] = i11;
                int i12 = aVar.f5018d;
                iArr[1] = i12;
                iArr[2] = i12;
                iArr[3] = i11;
            } else {
                int[] iArr2 = aVar.f5016b;
                int i13 = aVar.f5018d;
                iArr2[0] = i13;
                iArr2[1] = i13;
                int i14 = aVar.f5019e;
                iArr2[2] = i14;
                iArr2[3] = i14;
            }
            if (i10 != 1) {
                aVar.f5015a[0] = Math.max(((1.0f - aVar.f5025k) - aVar.f5026l) / 2.0f, 0.0f);
                aVar.f5015a[1] = Math.max(((1.0f - aVar.f5025k) - 0.001f) / 2.0f, 0.0f);
                aVar.f5015a[2] = Math.min(((aVar.f5025k + 1.0f) + 0.001f) / 2.0f, 1.0f);
                aVar.f5015a[3] = Math.min(((aVar.f5025k + 1.0f) + aVar.f5026l) / 2.0f, 1.0f);
            } else {
                float[] fArr = aVar.f5015a;
                fArr[0] = 0.0f;
                fArr[1] = Math.min(aVar.f5025k, 1.0f);
                aVar.f5015a[2] = Math.min(aVar.f5025k + aVar.f5026l, 1.0f);
                aVar.f5015a[3] = 1.0f;
            }
            return this.f5035a;
        }

        public T b(TypedArray typedArray) {
            int i10 = R$styleable.ShimmerFrameLayout_shimmer_clip_to_children;
            if (typedArray.hasValue(i10)) {
                this.f5035a.f5028n = typedArray.getBoolean(i10, this.f5035a.f5028n);
                c();
            }
            int i11 = R$styleable.ShimmerFrameLayout_shimmer_auto_start;
            if (typedArray.hasValue(i11)) {
                this.f5035a.f5029o = typedArray.getBoolean(i11, this.f5035a.f5029o);
                c();
            }
            int i12 = R$styleable.ShimmerFrameLayout_shimmer_base_alpha;
            if (typedArray.hasValue(i12)) {
                a aVar = this.f5035a;
                aVar.f5019e = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(i12, 0.3f))) * 255.0f)) << 24) | (aVar.f5019e & 16777215);
                c();
            }
            int i13 = R$styleable.ShimmerFrameLayout_shimmer_highlight_alpha;
            if (typedArray.hasValue(i13)) {
                a aVar2 = this.f5035a;
                aVar2.f5018d = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(i13, 1.0f))) * 255.0f)) << 24) | (16777215 & aVar2.f5018d);
                c();
            }
            int i14 = R$styleable.ShimmerFrameLayout_shimmer_duration;
            if (typedArray.hasValue(i14)) {
                long j10 = (long) typedArray.getInt(i14, (int) this.f5035a.f5033s);
                if (j10 >= 0) {
                    this.f5035a.f5033s = j10;
                    c();
                } else {
                    throw new IllegalArgumentException(l.i("Given a negative duration: ", j10));
                }
            }
            int i15 = R$styleable.ShimmerFrameLayout_shimmer_repeat_count;
            if (typedArray.hasValue(i15)) {
                this.f5035a.f5031q = typedArray.getInt(i15, this.f5035a.f5031q);
                c();
            }
            int i16 = R$styleable.ShimmerFrameLayout_shimmer_repeat_delay;
            if (typedArray.hasValue(i16)) {
                long j11 = (long) typedArray.getInt(i16, (int) this.f5035a.f5034t);
                if (j11 >= 0) {
                    this.f5035a.f5034t = j11;
                    c();
                } else {
                    throw new IllegalArgumentException(l.i("Given a negative repeat delay: ", j11));
                }
            }
            int i17 = R$styleable.ShimmerFrameLayout_shimmer_repeat_mode;
            if (typedArray.hasValue(i17)) {
                this.f5035a.f5032r = typedArray.getInt(i17, this.f5035a.f5032r);
                c();
            }
            int i18 = R$styleable.ShimmerFrameLayout_shimmer_direction;
            if (typedArray.hasValue(i18)) {
                int i19 = typedArray.getInt(i18, this.f5035a.f5017c);
                if (i19 == 1) {
                    this.f5035a.f5017c = 1;
                    c();
                } else if (i19 == 2) {
                    this.f5035a.f5017c = 2;
                    c();
                } else if (i19 != 3) {
                    this.f5035a.f5017c = 0;
                    c();
                } else {
                    this.f5035a.f5017c = 3;
                    c();
                }
            }
            int i20 = R$styleable.ShimmerFrameLayout_shimmer_shape;
            if (typedArray.hasValue(i20)) {
                if (typedArray.getInt(i20, this.f5035a.f5020f) != 1) {
                    this.f5035a.f5020f = 0;
                    c();
                } else {
                    this.f5035a.f5020f = 1;
                    c();
                }
            }
            int i21 = R$styleable.ShimmerFrameLayout_shimmer_dropoff;
            if (typedArray.hasValue(i21)) {
                float f10 = typedArray.getFloat(i21, this.f5035a.f5026l);
                if (f10 >= 0.0f) {
                    this.f5035a.f5026l = f10;
                    c();
                } else {
                    throw new IllegalArgumentException("Given invalid dropoff value: " + f10);
                }
            }
            int i22 = R$styleable.ShimmerFrameLayout_shimmer_fixed_width;
            if (typedArray.hasValue(i22)) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(i22, this.f5035a.f5021g);
                if (dimensionPixelSize >= 0) {
                    this.f5035a.f5021g = dimensionPixelSize;
                    c();
                } else {
                    throw new IllegalArgumentException(android.support.v4.media.a.m("Given invalid width: ", dimensionPixelSize));
                }
            }
            int i23 = R$styleable.ShimmerFrameLayout_shimmer_fixed_height;
            if (typedArray.hasValue(i23)) {
                int dimensionPixelSize2 = typedArray.getDimensionPixelSize(i23, this.f5035a.f5022h);
                if (dimensionPixelSize2 >= 0) {
                    this.f5035a.f5022h = dimensionPixelSize2;
                    c();
                } else {
                    throw new IllegalArgumentException(android.support.v4.media.a.m("Given invalid height: ", dimensionPixelSize2));
                }
            }
            int i24 = R$styleable.ShimmerFrameLayout_shimmer_intensity;
            if (typedArray.hasValue(i24)) {
                float f11 = typedArray.getFloat(i24, this.f5035a.f5025k);
                if (f11 >= 0.0f) {
                    this.f5035a.f5025k = f11;
                    c();
                } else {
                    throw new IllegalArgumentException("Given invalid intensity value: " + f11);
                }
            }
            int i25 = R$styleable.ShimmerFrameLayout_shimmer_width_ratio;
            if (typedArray.hasValue(i25)) {
                float f12 = typedArray.getFloat(i25, this.f5035a.f5023i);
                if (f12 >= 0.0f) {
                    this.f5035a.f5023i = f12;
                    c();
                } else {
                    throw new IllegalArgumentException("Given invalid width ratio: " + f12);
                }
            }
            int i26 = R$styleable.ShimmerFrameLayout_shimmer_height_ratio;
            if (typedArray.hasValue(i26)) {
                float f13 = typedArray.getFloat(i26, this.f5035a.f5024j);
                if (f13 >= 0.0f) {
                    this.f5035a.f5024j = f13;
                    c();
                } else {
                    throw new IllegalArgumentException("Given invalid height ratio: " + f13);
                }
            }
            int i27 = R$styleable.ShimmerFrameLayout_shimmer_tilt;
            if (typedArray.hasValue(i27)) {
                this.f5035a.f5027m = typedArray.getFloat(i27, this.f5035a.f5027m);
                c();
            }
            return c();
        }

        public abstract T c();
    }

    /* compiled from: Shimmer */
    public static class c extends b<c> {
        public c() {
            this.f5035a.f5030p = false;
        }

        public final b b(TypedArray typedArray) {
            super.b(typedArray);
            int i10 = R$styleable.ShimmerFrameLayout_shimmer_base_color;
            if (typedArray.hasValue(i10)) {
                int color = typedArray.getColor(i10, this.f5035a.f5019e);
                a aVar = this.f5035a;
                aVar.f5019e = (color & 16777215) | (aVar.f5019e & -16777216);
            }
            int i11 = R$styleable.ShimmerFrameLayout_shimmer_highlight_color;
            if (typedArray.hasValue(i11)) {
                this.f5035a.f5018d = typedArray.getColor(i11, this.f5035a.f5018d);
            }
            return this;
        }

        public final b c() {
            return this;
        }
    }

    public a() {
        new RectF();
        this.f5017c = 0;
        this.f5018d = -1;
        this.f5019e = 1291845631;
        this.f5020f = 0;
        this.f5021g = 0;
        this.f5022h = 0;
        this.f5023i = 1.0f;
        this.f5024j = 1.0f;
        this.f5025k = 0.0f;
        this.f5026l = 0.5f;
        this.f5027m = 20.0f;
        this.f5028n = true;
        this.f5029o = true;
        this.f5030p = true;
        this.f5031q = -1;
        this.f5032r = 1;
        this.f5033s = 1000;
    }
}
