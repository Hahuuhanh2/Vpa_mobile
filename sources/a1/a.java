package a1;

import a1.b;
import f0.b0;
import java.util.Arrays;

/* compiled from: ArrayLinkedVariables */
public final class a implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public int f9a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final b f10b;

    /* renamed from: c  reason: collision with root package name */
    public final c f11c;

    /* renamed from: d  reason: collision with root package name */
    public int f12d = 8;

    /* renamed from: e  reason: collision with root package name */
    public int[] f13e = new int[8];

    /* renamed from: f  reason: collision with root package name */
    public int[] f14f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public float[] f15g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    public int f16h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f17i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f18j = false;

    public a(b bVar, c cVar) {
        this.f10b = bVar;
        this.f11c = cVar;
    }

    public final float a(g gVar, boolean z10) {
        int i10 = this.f16h;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f9a) {
            if (this.f13e[i10] == gVar.f55b) {
                if (i10 == this.f16h) {
                    this.f16h = this.f14f[i10];
                } else {
                    int[] iArr = this.f14f;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    gVar.c(this.f10b);
                }
                gVar.f65s--;
                this.f9a--;
                this.f13e[i10] = -1;
                if (this.f18j) {
                    this.f17i = i10;
                }
                return this.f15g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f14f[i10];
        }
        return 0.0f;
    }

    public final int b() {
        return this.f9a;
    }

    public final g c(int i10) {
        int i11 = this.f16h;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f9a) {
            if (i12 == i10) {
                return ((g[]) this.f11c.f27d)[this.f13e[i11]];
            }
            i11 = this.f14f[i11];
            i12++;
        }
        return null;
    }

    public final void clear() {
        int i10 = this.f16h;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f9a) {
            g gVar = ((g[]) this.f11c.f27d)[this.f13e[i10]];
            if (gVar != null) {
                gVar.c(this.f10b);
            }
            i10 = this.f14f[i10];
            i11++;
        }
        this.f16h = -1;
        this.f17i = -1;
        this.f18j = false;
        this.f9a = 0;
    }

    public final void d() {
        int i10 = this.f16h;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f9a) {
            float[] fArr = this.f15g;
            fArr[i10] = fArr[i10] * -1.0f;
            i10 = this.f14f[i10];
            i11++;
        }
    }

    public final float e(int i10) {
        int i11 = this.f16h;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f9a) {
            if (i12 == i10) {
                return this.f15g[i11];
            }
            i11 = this.f14f[i11];
            i12++;
        }
        return 0.0f;
    }

    public final boolean f(g gVar) {
        int i10 = this.f16h;
        if (i10 == -1) {
            return false;
        }
        int i11 = 0;
        while (i10 != -1 && i11 < this.f9a) {
            if (this.f13e[i10] == gVar.f55b) {
                return true;
            }
            i10 = this.f14f[i10];
            i11++;
        }
        return false;
    }

    public final float g(g gVar) {
        int i10 = this.f16h;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f9a) {
            if (this.f13e[i10] == gVar.f55b) {
                return this.f15g[i10];
            }
            i10 = this.f14f[i10];
            i11++;
        }
        return 0.0f;
    }

    public final float h(b bVar, boolean z10) {
        float g2 = g(bVar.f19a);
        a(bVar.f19a, z10);
        b.a aVar = bVar.f22d;
        int b10 = aVar.b();
        for (int i10 = 0; i10 < b10; i10++) {
            g c10 = aVar.c(i10);
            i(c10, aVar.g(c10) * g2, z10);
        }
        return g2;
    }

    public final void i(g gVar, float f10, boolean z10) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i10 = this.f16h;
            if (i10 == -1) {
                this.f16h = 0;
                this.f15g[0] = f10;
                this.f13e[0] = gVar.f55b;
                this.f14f[0] = -1;
                gVar.f65s++;
                gVar.b(this.f10b);
                this.f9a++;
                if (!this.f18j) {
                    int i11 = this.f17i + 1;
                    this.f17i = i11;
                    int[] iArr = this.f13e;
                    if (i11 >= iArr.length) {
                        this.f18j = true;
                        this.f17i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i12 = 0;
            int i13 = -1;
            while (i10 != -1 && i12 < this.f9a) {
                int i14 = this.f13e[i10];
                int i15 = gVar.f55b;
                if (i14 == i15) {
                    float[] fArr = this.f15g;
                    float f11 = fArr[i10] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i10] = f11;
                    if (f11 == 0.0f) {
                        if (i10 == this.f16h) {
                            this.f16h = this.f14f[i10];
                        } else {
                            int[] iArr2 = this.f14f;
                            iArr2[i13] = iArr2[i10];
                        }
                        if (z10) {
                            gVar.c(this.f10b);
                        }
                        if (this.f18j) {
                            this.f17i = i10;
                        }
                        gVar.f65s--;
                        this.f9a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i13 = i10;
                }
                i10 = this.f14f[i10];
                i12++;
            }
            int i16 = this.f17i;
            int i17 = i16 + 1;
            if (this.f18j) {
                int[] iArr3 = this.f13e;
                if (iArr3[i16] != -1) {
                    i16 = iArr3.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr4 = this.f13e;
            if (i16 >= iArr4.length && this.f9a < iArr4.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr5 = this.f13e;
                    if (i18 >= iArr5.length) {
                        break;
                    } else if (iArr5[i18] == -1) {
                        i16 = i18;
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            int[] iArr6 = this.f13e;
            if (i16 >= iArr6.length) {
                i16 = iArr6.length;
                int i19 = this.f12d * 2;
                this.f12d = i19;
                this.f18j = false;
                this.f17i = i16 - 1;
                this.f15g = Arrays.copyOf(this.f15g, i19);
                this.f13e = Arrays.copyOf(this.f13e, this.f12d);
                this.f14f = Arrays.copyOf(this.f14f, this.f12d);
            }
            this.f13e[i16] = gVar.f55b;
            this.f15g[i16] = f10;
            if (i13 != -1) {
                int[] iArr7 = this.f14f;
                iArr7[i16] = iArr7[i13];
                iArr7[i13] = i16;
            } else {
                this.f14f[i16] = this.f16h;
                this.f16h = i16;
            }
            gVar.f65s++;
            gVar.b(this.f10b);
            this.f9a++;
            if (!this.f18j) {
                this.f17i++;
            }
            int i20 = this.f17i;
            int[] iArr8 = this.f13e;
            if (i20 >= iArr8.length) {
                this.f18j = true;
                this.f17i = iArr8.length - 1;
            }
        }
    }

    public final void j(g gVar, float f10) {
        if (f10 == 0.0f) {
            a(gVar, true);
            return;
        }
        int i10 = this.f16h;
        if (i10 == -1) {
            this.f16h = 0;
            this.f15g[0] = f10;
            this.f13e[0] = gVar.f55b;
            this.f14f[0] = -1;
            gVar.f65s++;
            gVar.b(this.f10b);
            this.f9a++;
            if (!this.f18j) {
                int i11 = this.f17i + 1;
                this.f17i = i11;
                int[] iArr = this.f13e;
                if (i11 >= iArr.length) {
                    this.f18j = true;
                    this.f17i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = 0;
        int i13 = -1;
        while (i10 != -1 && i12 < this.f9a) {
            int i14 = this.f13e[i10];
            int i15 = gVar.f55b;
            if (i14 == i15) {
                this.f15g[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i13 = i10;
            }
            i10 = this.f14f[i10];
            i12++;
        }
        int i16 = this.f17i;
        int i17 = i16 + 1;
        if (this.f18j) {
            int[] iArr2 = this.f13e;
            if (iArr2[i16] != -1) {
                i16 = iArr2.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr3 = this.f13e;
        if (i16 >= iArr3.length && this.f9a < iArr3.length) {
            int i18 = 0;
            while (true) {
                int[] iArr4 = this.f13e;
                if (i18 >= iArr4.length) {
                    break;
                } else if (iArr4[i18] == -1) {
                    i16 = i18;
                    break;
                } else {
                    i18++;
                }
            }
        }
        int[] iArr5 = this.f13e;
        if (i16 >= iArr5.length) {
            i16 = iArr5.length;
            int i19 = this.f12d * 2;
            this.f12d = i19;
            this.f18j = false;
            this.f17i = i16 - 1;
            this.f15g = Arrays.copyOf(this.f15g, i19);
            this.f13e = Arrays.copyOf(this.f13e, this.f12d);
            this.f14f = Arrays.copyOf(this.f14f, this.f12d);
        }
        this.f13e[i16] = gVar.f55b;
        this.f15g[i16] = f10;
        if (i13 != -1) {
            int[] iArr6 = this.f14f;
            iArr6[i16] = iArr6[i13];
            iArr6[i13] = i16;
        } else {
            this.f14f[i16] = this.f16h;
            this.f16h = i16;
        }
        gVar.f65s++;
        gVar.b(this.f10b);
        int i20 = this.f9a + 1;
        this.f9a = i20;
        if (!this.f18j) {
            this.f17i++;
        }
        int[] iArr7 = this.f13e;
        if (i20 >= iArr7.length) {
            this.f18j = true;
        }
        if (this.f17i >= iArr7.length) {
            this.f18j = true;
            this.f17i = iArr7.length - 1;
        }
    }

    public final void k(float f10) {
        int i10 = this.f16h;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f9a) {
            float[] fArr = this.f15g;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f14f[i10];
            i11++;
        }
    }

    public final String toString() {
        int i10 = this.f16h;
        String str = "";
        int i11 = 0;
        while (i10 != -1 && i11 < this.f9a) {
            StringBuilder q10 = android.support.v4.media.a.q(b0.r(str, " -> "));
            q10.append(this.f15g[i10]);
            q10.append(" : ");
            StringBuilder q11 = android.support.v4.media.a.q(q10.toString());
            q11.append(((g[]) this.f11c.f27d)[this.f13e[i10]]);
            str = q11.toString();
            i10 = this.f14f[i10];
            i11++;
        }
        return str;
    }
}
