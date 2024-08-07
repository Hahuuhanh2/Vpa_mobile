package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: KeylineState */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final float f5961a;

    /* renamed from: b  reason: collision with root package name */
    public final List<C0062b> f5962b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5963c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5964d;

    /* compiled from: KeylineState */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final float f5965a;

        /* renamed from: b  reason: collision with root package name */
        public final float f5966b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f5967c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public C0062b f5968d;

        /* renamed from: e  reason: collision with root package name */
        public C0062b f5969e;

        /* renamed from: f  reason: collision with root package name */
        public int f5970f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f5971g = -1;

        /* renamed from: h  reason: collision with root package name */
        public float f5972h = 0.0f;

        /* renamed from: i  reason: collision with root package name */
        public int f5973i = -1;

        public a(float f10, float f11) {
            this.f5965a = f10;
            this.f5966b = f11;
        }

        public final void a(float f10, float f11, float f12, boolean z10, boolean z11) {
            float f13;
            float f14;
            float f15 = f12 / 2.0f;
            float f16 = f10 - f15;
            float f17 = f15 + f10;
            float f18 = this.f5966b;
            if (f17 > f18) {
                f14 = Math.abs(f17 - Math.max(f17 - f12, f18));
            } else if (f16 < 0.0f) {
                f14 = Math.abs(f16 - Math.min(f16 + f12, 0.0f));
            } else {
                f13 = 0.0f;
                b(f10, f11, f12, z10, z11, f13);
            }
            f13 = f14;
            b(f10, f11, f12, z10, z11, f13);
        }

        public final void b(float f10, float f11, float f12, boolean z10, boolean z11, float f13) {
            if (f12 > 0.0f) {
                if (z11) {
                    if (!z10) {
                        int i10 = this.f5973i;
                        if (i10 == -1 || i10 == 0) {
                            this.f5973i = this.f5967c.size();
                        } else {
                            throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                        }
                    } else {
                        throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                    }
                }
                C0062b bVar = new C0062b(Float.MIN_VALUE, f10, f11, f12, z11, f13);
                if (z10) {
                    if (this.f5968d == null) {
                        this.f5968d = bVar;
                        this.f5970f = this.f5967c.size();
                    }
                    if (this.f5971g != -1 && this.f5967c.size() - this.f5971g > 1) {
                        throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                    } else if (f12 == this.f5968d.f5977d) {
                        this.f5969e = bVar;
                        this.f5971g = this.f5967c.size();
                    } else {
                        throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                    }
                } else if (this.f5968d == null && f12 < this.f5972h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                } else if (this.f5969e != null && f12 > this.f5972h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
                this.f5972h = f12;
                this.f5967c.add(bVar);
            }
        }

        public final void c(float f10, float f11, float f12, int i10, boolean z10) {
            if (i10 > 0 && f12 > 0.0f) {
                for (int i11 = 0; i11 < i10; i11++) {
                    a((((float) i11) * f12) + f10, f11, f12, z10, false);
                }
            }
        }

        public final b d() {
            if (this.f5968d != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f5967c.size(); i10++) {
                    C0062b bVar = (C0062b) this.f5967c.get(i10);
                    float f10 = this.f5968d.f5975b;
                    float f11 = this.f5965a;
                    arrayList.add(new C0062b((((float) i10) * f11) + (f10 - (((float) this.f5970f) * f11)), bVar.f5975b, bVar.f5976c, bVar.f5977d, bVar.f5978e, bVar.f5979f));
                }
                return new b(this.f5965a, arrayList, this.f5970f, this.f5971g);
            }
            throw new IllegalStateException("There must be a keyline marked as focal.");
        }
    }

    /* renamed from: com.google.android.material.carousel.b$b  reason: collision with other inner class name */
    /* compiled from: KeylineState */
    public static final class C0062b {

        /* renamed from: a  reason: collision with root package name */
        public final float f5974a;

        /* renamed from: b  reason: collision with root package name */
        public final float f5975b;

        /* renamed from: c  reason: collision with root package name */
        public final float f5976c;

        /* renamed from: d  reason: collision with root package name */
        public final float f5977d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f5978e;

        /* renamed from: f  reason: collision with root package name */
        public final float f5979f;

        public C0062b(float f10, float f11, float f12, float f13, boolean z10, float f14) {
            this.f5974a = f10;
            this.f5975b = f11;
            this.f5976c = f12;
            this.f5977d = f13;
            this.f5978e = z10;
            this.f5979f = f14;
        }
    }

    public b(float f10, ArrayList arrayList, int i10, int i11) {
        this.f5961a = f10;
        this.f5962b = Collections.unmodifiableList(arrayList);
        this.f5963c = i10;
        this.f5964d = i11;
    }

    public final C0062b a() {
        return this.f5962b.get(this.f5963c);
    }

    public final C0062b b() {
        return this.f5962b.get(0);
    }

    public final C0062b c() {
        return this.f5962b.get(this.f5964d);
    }

    public final C0062b d() {
        List<C0062b> list = this.f5962b;
        return list.get(list.size() - 1);
    }
}
