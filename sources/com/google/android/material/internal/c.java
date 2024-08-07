package com.google.android.material.internal;

import al.g0;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.material.internal.p;
import i8.a;
import i8.d;
import java.util.WeakHashMap;
import u1.f;
import w1.d0;
import w1.q0;

/* compiled from: CollapsingTextHelper */
public final class c {
    public Typeface A;
    public Typeface B;
    public Typeface C;
    public i8.a D;
    public i8.a E;
    public TextUtils.TruncateAt F = TextUtils.TruncateAt.END;
    public CharSequence G;
    public CharSequence H;
    public boolean I;
    public boolean J = true;
    public Bitmap K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public int[] R;
    public boolean S;
    public final TextPaint T;
    public final TextPaint U;
    public TimeInterpolator V;
    public TimeInterpolator W;
    public float X;
    public float Y;
    public float Z;

    /* renamed from: a  reason: collision with root package name */
    public final View f6388a;

    /* renamed from: a0  reason: collision with root package name */
    public ColorStateList f6389a0;

    /* renamed from: b  reason: collision with root package name */
    public float f6390b;

    /* renamed from: b0  reason: collision with root package name */
    public float f6391b0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6392c;

    /* renamed from: c0  reason: collision with root package name */
    public float f6393c0;

    /* renamed from: d  reason: collision with root package name */
    public float f6394d;

    /* renamed from: d0  reason: collision with root package name */
    public float f6395d0;

    /* renamed from: e  reason: collision with root package name */
    public float f6396e;

    /* renamed from: e0  reason: collision with root package name */
    public ColorStateList f6397e0;

    /* renamed from: f  reason: collision with root package name */
    public int f6398f;

    /* renamed from: f0  reason: collision with root package name */
    public float f6399f0;

    /* renamed from: g  reason: collision with root package name */
    public final Rect f6400g;

    /* renamed from: g0  reason: collision with root package name */
    public float f6401g0;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f6402h;

    /* renamed from: h0  reason: collision with root package name */
    public float f6403h0;

    /* renamed from: i  reason: collision with root package name */
    public final RectF f6404i;

    /* renamed from: i0  reason: collision with root package name */
    public StaticLayout f6405i0;

    /* renamed from: j  reason: collision with root package name */
    public int f6406j = 16;

    /* renamed from: j0  reason: collision with root package name */
    public float f6407j0;

    /* renamed from: k  reason: collision with root package name */
    public int f6408k = 16;

    /* renamed from: k0  reason: collision with root package name */
    public float f6409k0;

    /* renamed from: l  reason: collision with root package name */
    public float f6410l = 15.0f;

    /* renamed from: l0  reason: collision with root package name */
    public float f6411l0;

    /* renamed from: m  reason: collision with root package name */
    public float f6412m = 15.0f;

    /* renamed from: m0  reason: collision with root package name */
    public CharSequence f6413m0;

    /* renamed from: n  reason: collision with root package name */
    public ColorStateList f6414n;

    /* renamed from: n0  reason: collision with root package name */
    public int f6415n0 = 1;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f6416o;

    /* renamed from: o0  reason: collision with root package name */
    public float f6417o0 = 0.0f;

    /* renamed from: p  reason: collision with root package name */
    public int f6418p;

    /* renamed from: p0  reason: collision with root package name */
    public float f6419p0 = 1.0f;

    /* renamed from: q  reason: collision with root package name */
    public float f6420q;

    /* renamed from: q0  reason: collision with root package name */
    public int f6421q0 = 1;

    /* renamed from: r  reason: collision with root package name */
    public float f6422r;

    /* renamed from: s  reason: collision with root package name */
    public float f6423s;

    /* renamed from: t  reason: collision with root package name */
    public float f6424t;

    /* renamed from: u  reason: collision with root package name */
    public float f6425u;

    /* renamed from: v  reason: collision with root package name */
    public float f6426v;

    /* renamed from: w  reason: collision with root package name */
    public Typeface f6427w;

    /* renamed from: x  reason: collision with root package name */
    public Typeface f6428x;

    /* renamed from: y  reason: collision with root package name */
    public Typeface f6429y;

    /* renamed from: z  reason: collision with root package name */
    public Typeface f6430z;

    /* compiled from: CollapsingTextHelper */
    public class a implements a.C0124a {
        public a() {
        }

        public final void a(Typeface typeface) {
            c cVar = c.this;
            if (cVar.m(typeface)) {
                cVar.i(false);
            }
        }
    }

    /* compiled from: CollapsingTextHelper */
    public class b implements a.C0124a {
        public b() {
        }

        public final void a(Typeface typeface) {
            c cVar = c.this;
            if (cVar.o(typeface)) {
                cVar.i(false);
            }
        }
    }

    public c(View view) {
        this.f6388a = view;
        TextPaint textPaint = new TextPaint(129);
        this.T = textPaint;
        this.U = new TextPaint(textPaint);
        this.f6402h = new Rect();
        this.f6400g = new Rect();
        this.f6404i = new RectF();
        float f10 = this.f6394d;
        this.f6396e = android.support.v4.media.a.e(1.0f, f10, 0.5f, f10);
        h(view.getContext().getResources().getConfiguration());
    }

    public static int a(float f10, int i10, int i11) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((((float) Color.alpha(i11)) * f10) + (((float) Color.alpha(i10)) * f11)), Math.round((((float) Color.red(i11)) * f10) + (((float) Color.red(i10)) * f11)), Math.round((((float) Color.green(i11)) * f10) + (((float) Color.green(i10)) * f11)), Math.round((((float) Color.blue(i11)) * f10) + (((float) Color.blue(i10)) * f11)));
    }

    public static float g(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        LinearInterpolator linearInterpolator = t7.b.f14885a;
        return android.support.v4.media.a.e(f11, f10, f12, f10);
    }

    public final boolean b(CharSequence charSequence) {
        f.d dVar;
        View view = this.f6388a;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        boolean z10 = true;
        if (d0.e.d(view) != 1) {
            z10 = false;
        }
        if (!this.J) {
            return z10;
        }
        if (z10) {
            dVar = f.f15059d;
        } else {
            dVar = f.f15058c;
        }
        return dVar.b(charSequence, charSequence.length());
    }

    public final void c(float f10, boolean z10) {
        boolean z11;
        float f11;
        float f12;
        Typeface typeface;
        boolean z12;
        boolean z13;
        StaticLayout staticLayout;
        Layout.Alignment alignment;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        if (this.G != null) {
            float width = (float) this.f6402h.width();
            float width2 = (float) this.f6400g.width();
            if (Math.abs(f10 - 1.0f) < 1.0E-5f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                f12 = this.f6412m;
                f11 = this.f6399f0;
                this.L = 1.0f;
                typeface = this.f6427w;
            } else {
                float f13 = this.f6410l;
                float f14 = this.f6401g0;
                Typeface typeface2 = this.f6430z;
                if (Math.abs(f10 - 0.0f) < 1.0E-5f) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (z19) {
                    this.L = 1.0f;
                } else {
                    this.L = g(this.f6410l, this.f6412m, f10, this.W) / this.f6410l;
                }
                float f15 = this.f6412m / this.f6410l;
                float f16 = width2 * f15;
                if (z10 || this.f6392c || f16 <= width) {
                    width = width2;
                } else {
                    width = Math.min(width / f15, width2);
                }
                f12 = f13;
                f11 = f14;
                typeface = typeface2;
            }
            if (width > 0.0f) {
                if (this.M != f12) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (this.f6403h0 != f11) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (this.C != typeface) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                StaticLayout staticLayout2 = this.f6405i0;
                if (staticLayout2 == null || width == ((float) staticLayout2.getWidth())) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                if (z14 || z15 || z17 || z16 || this.S) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.M = f12;
                this.f6403h0 = f11;
                this.C = typeface;
                this.S = false;
                TextPaint textPaint = this.T;
                if (this.L != 1.0f) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                textPaint.setLinearText(z18);
            } else {
                z12 = false;
            }
            if (this.H == null || z12) {
                this.T.setTextSize(this.M);
                this.T.setTypeface(this.C);
                this.T.setLetterSpacing(this.f6403h0);
                boolean b10 = b(this.G);
                this.I = b10;
                int i10 = this.f6415n0;
                if (i10 <= 1 || (b10 && !this.f6392c)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (!z13) {
                    i10 = 1;
                }
                if (i10 == 1) {
                    try {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } catch (p.a e10) {
                        e10.getCause().getMessage();
                        staticLayout = null;
                    }
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f6406j, b10 ? 1 : 0) & 7;
                    if (absoluteGravity == 1) {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    } else if (absoluteGravity != 5) {
                        if (this.I) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        }
                    } else if (this.I) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    }
                }
                p pVar = new p(this.G, this.T, (int) width);
                pVar.f6493l = this.F;
                pVar.f6492k = b10;
                pVar.f6486e = alignment;
                pVar.f6491j = false;
                pVar.f6487f = i10;
                float f17 = this.f6417o0;
                float f18 = this.f6419p0;
                pVar.f6488g = f17;
                pVar.f6489h = f18;
                pVar.f6490i = this.f6421q0;
                staticLayout = pVar.a();
                staticLayout.getClass();
                this.f6405i0 = staticLayout;
                this.H = staticLayout.getText();
            }
        }
    }

    public final void d(Canvas canvas) {
        Canvas canvas2 = canvas;
        int save = canvas.save();
        if (this.H != null && this.f6404i.width() > 0.0f && this.f6404i.height() > 0.0f) {
            this.T.setTextSize(this.M);
            float f10 = this.f6425u;
            float f11 = this.f6426v;
            float f12 = this.L;
            if (f12 != 1.0f && !this.f6392c) {
                canvas2.scale(f12, f12, f10, f11);
            }
            boolean z10 = true;
            if (this.f6415n0 <= 1 || (this.I && !this.f6392c)) {
                z10 = false;
            }
            if (!z10 || (this.f6392c && this.f6390b <= this.f6396e)) {
                canvas2.translate(f10, f11);
                this.f6405i0.draw(canvas2);
            } else {
                float lineStart = this.f6425u - ((float) this.f6405i0.getLineStart(0));
                int alpha = this.T.getAlpha();
                canvas2.translate(lineStart, f11);
                if (!this.f6392c) {
                    this.T.setAlpha((int) (this.f6411l0 * ((float) alpha)));
                    if (Build.VERSION.SDK_INT >= 31) {
                        TextPaint textPaint = this.T;
                        textPaint.setShadowLayer(this.N, this.O, this.P, m9.b.m(this.Q, textPaint.getAlpha()));
                    }
                    this.f6405i0.draw(canvas2);
                }
                if (!this.f6392c) {
                    this.T.setAlpha((int) (this.f6409k0 * ((float) alpha)));
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 31) {
                    TextPaint textPaint2 = this.T;
                    textPaint2.setShadowLayer(this.N, this.O, this.P, m9.b.m(this.Q, textPaint2.getAlpha()));
                }
                int lineBaseline = this.f6405i0.getLineBaseline(0);
                CharSequence charSequence = this.f6413m0;
                float f13 = (float) lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f13, this.T);
                if (i10 >= 31) {
                    this.T.setShadowLayer(this.N, this.O, this.P, this.Q);
                }
                if (!this.f6392c) {
                    String trim = this.f6413m0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    this.T.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(this.f6405i0.getLineEnd(0), str.length()), 0.0f, f13, this.T);
                }
            }
            canvas2.restoreToCount(save);
        }
    }

    public final float e() {
        TextPaint textPaint = this.U;
        textPaint.setTextSize(this.f6412m);
        textPaint.setTypeface(this.f6427w);
        textPaint.setLetterSpacing(this.f6399f0);
        return -this.U.ascent();
    }

    public final int f(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.R;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void h(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f6429y;
            if (typeface != null) {
                this.f6428x = i8.f.a(configuration, typeface);
            }
            Typeface typeface2 = this.B;
            if (typeface2 != null) {
                this.A = i8.f.a(configuration, typeface2);
            }
            Typeface typeface3 = this.f6428x;
            if (typeface3 == null) {
                typeface3 = this.f6429y;
            }
            this.f6427w = typeface3;
            Typeface typeface4 = this.A;
            if (typeface4 == null) {
                typeface4 = this.B;
            }
            this.f6430z = typeface4;
            i(true);
        }
    }

    public final void i(boolean z10) {
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        Rect rect;
        StaticLayout staticLayout;
        if ((this.f6388a.getHeight() > 0 && this.f6388a.getWidth() > 0) || z10) {
            c(1.0f, z10);
            CharSequence charSequence = this.H;
            if (!(charSequence == null || (staticLayout = this.f6405i0) == null)) {
                this.f6413m0 = TextUtils.ellipsize(charSequence, this.T, (float) staticLayout.getWidth(), this.F);
            }
            CharSequence charSequence2 = this.f6413m0;
            if (charSequence2 != null) {
                this.f6407j0 = this.T.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.f6407j0 = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f6408k, this.I ? 1 : 0);
            int i11 = absoluteGravity & 112;
            if (i11 == 48) {
                this.f6422r = (float) this.f6402h.top;
            } else if (i11 != 80) {
                this.f6422r = ((float) this.f6402h.centerY()) - ((this.T.descent() - this.T.ascent()) / 2.0f);
            } else {
                this.f6422r = this.T.ascent() + ((float) this.f6402h.bottom);
            }
            int i12 = absoluteGravity & 8388615;
            if (i12 == 1) {
                this.f6424t = ((float) this.f6402h.centerX()) - (this.f6407j0 / 2.0f);
            } else if (i12 != 5) {
                this.f6424t = (float) this.f6402h.left;
            } else {
                this.f6424t = ((float) this.f6402h.right) - this.f6407j0;
            }
            c(0.0f, z10);
            StaticLayout staticLayout2 = this.f6405i0;
            if (staticLayout2 != null) {
                f10 = (float) staticLayout2.getHeight();
            } else {
                f10 = 0.0f;
            }
            StaticLayout staticLayout3 = this.f6405i0;
            if (staticLayout3 == null || this.f6415n0 <= 1) {
                CharSequence charSequence3 = this.H;
                if (charSequence3 != null) {
                    f11 = this.T.measureText(charSequence3, 0, charSequence3.length());
                } else {
                    f11 = 0.0f;
                }
            } else {
                f11 = (float) staticLayout3.getWidth();
            }
            StaticLayout staticLayout4 = this.f6405i0;
            if (staticLayout4 != null) {
                i10 = staticLayout4.getLineCount();
            } else {
                i10 = 0;
            }
            this.f6418p = i10;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f6406j, this.I ? 1 : 0);
            int i13 = absoluteGravity2 & 112;
            if (i13 == 48) {
                this.f6420q = (float) this.f6400g.top;
            } else if (i13 != 80) {
                this.f6420q = ((float) this.f6400g.centerY()) - (f10 / 2.0f);
            } else {
                this.f6420q = this.T.descent() + (((float) this.f6400g.bottom) - f10);
            }
            int i14 = absoluteGravity2 & 8388615;
            if (i14 == 1) {
                this.f6423s = ((float) this.f6400g.centerX()) - (f11 / 2.0f);
            } else if (i14 != 5) {
                this.f6423s = (float) this.f6400g.left;
            } else {
                this.f6423s = ((float) this.f6400g.right) - f11;
            }
            Bitmap bitmap = this.K;
            if (bitmap != null) {
                bitmap.recycle();
                this.K = null;
            }
            q(this.f6390b);
            float f14 = this.f6390b;
            if (this.f6392c) {
                RectF rectF = this.f6404i;
                if (f14 < this.f6396e) {
                    rect = this.f6400g;
                } else {
                    rect = this.f6402h;
                }
                rectF.set(rect);
            } else {
                this.f6404i.left = g((float) this.f6400g.left, (float) this.f6402h.left, f14, this.V);
                this.f6404i.top = g(this.f6420q, this.f6422r, f14, this.V);
                this.f6404i.right = g((float) this.f6400g.right, (float) this.f6402h.right, f14, this.V);
                this.f6404i.bottom = g((float) this.f6400g.bottom, (float) this.f6402h.bottom, f14, this.V);
            }
            if (!this.f6392c) {
                this.f6425u = g(this.f6423s, this.f6424t, f14, this.V);
                this.f6426v = g(this.f6420q, this.f6422r, f14, this.V);
                q(f14);
                f12 = f14;
            } else if (f14 < this.f6396e) {
                this.f6425u = this.f6423s;
                this.f6426v = this.f6420q;
                q(0.0f);
                f12 = 0.0f;
            } else {
                this.f6425u = this.f6424t;
                this.f6426v = this.f6422r - ((float) Math.max(0, this.f6398f));
                q(1.0f);
                f12 = 1.0f;
            }
            q2.b bVar = t7.b.f14886b;
            this.f6409k0 = 1.0f - g(0.0f, 1.0f, 1.0f - f14, bVar);
            View view = this.f6388a;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.d.k(view);
            this.f6411l0 = g(1.0f, 0.0f, f14, bVar);
            d0.d.k(this.f6388a);
            ColorStateList colorStateList = this.f6416o;
            ColorStateList colorStateList2 = this.f6414n;
            if (colorStateList != colorStateList2) {
                this.T.setColor(a(f12, f(colorStateList2), f(this.f6416o)));
            } else {
                this.T.setColor(f(colorStateList));
            }
            float f15 = this.f6399f0;
            float f16 = this.f6401g0;
            if (f15 != f16) {
                this.T.setLetterSpacing(g(f16, f15, f14, bVar));
            } else {
                this.T.setLetterSpacing(f15);
            }
            this.N = g(this.f6391b0, this.X, f14, (TimeInterpolator) null);
            this.O = g(this.f6393c0, this.Y, f14, (TimeInterpolator) null);
            this.P = g(this.f6395d0, this.Z, f14, (TimeInterpolator) null);
            int a10 = a(f14, f(this.f6397e0), f(this.f6389a0));
            this.Q = a10;
            this.T.setShadowLayer(this.N, this.O, this.P, a10);
            if (this.f6392c) {
                int alpha = this.T.getAlpha();
                float f17 = this.f6396e;
                if (f14 <= f17) {
                    f13 = t7.b.a(1.0f, 0.0f, this.f6394d, f17, f14);
                } else {
                    f13 = t7.b.a(0.0f, 1.0f, f17, 1.0f, f14);
                }
                this.T.setAlpha((int) (f13 * ((float) alpha)));
            }
            d0.d.k(this.f6388a);
        }
    }

    public final void j(ColorStateList colorStateList) {
        if (this.f6416o != colorStateList || this.f6414n != colorStateList) {
            this.f6416o = colorStateList;
            this.f6414n = colorStateList;
            i(false);
        }
    }

    public final void k(int i10) {
        d dVar = new d(this.f6388a.getContext(), i10);
        ColorStateList colorStateList = dVar.f11205j;
        if (colorStateList != null) {
            this.f6416o = colorStateList;
        }
        float f10 = dVar.f11206k;
        if (f10 != 0.0f) {
            this.f6412m = f10;
        }
        ColorStateList colorStateList2 = dVar.f11196a;
        if (colorStateList2 != null) {
            this.f6389a0 = colorStateList2;
        }
        this.Y = dVar.f11200e;
        this.Z = dVar.f11201f;
        this.X = dVar.f11202g;
        this.f6399f0 = dVar.f11204i;
        i8.a aVar = this.E;
        if (aVar != null) {
            aVar.f11195d = true;
        }
        a aVar2 = new a();
        dVar.a();
        this.E = new i8.a(aVar2, dVar.f11209n);
        dVar.c(this.f6388a.getContext(), this.E);
        i(false);
    }

    public final void l(int i10) {
        if (this.f6408k != i10) {
            this.f6408k = i10;
            i(false);
        }
    }

    public final boolean m(Typeface typeface) {
        i8.a aVar = this.E;
        if (aVar != null) {
            aVar.f11195d = true;
        }
        if (this.f6429y == typeface) {
            return false;
        }
        this.f6429y = typeface;
        Typeface a10 = i8.f.a(this.f6388a.getContext().getResources().getConfiguration(), typeface);
        this.f6428x = a10;
        if (a10 == null) {
            a10 = this.f6429y;
        }
        this.f6427w = a10;
        return true;
    }

    public final void n(int i10) {
        d dVar = new d(this.f6388a.getContext(), i10);
        ColorStateList colorStateList = dVar.f11205j;
        if (colorStateList != null) {
            this.f6414n = colorStateList;
        }
        float f10 = dVar.f11206k;
        if (f10 != 0.0f) {
            this.f6410l = f10;
        }
        ColorStateList colorStateList2 = dVar.f11196a;
        if (colorStateList2 != null) {
            this.f6397e0 = colorStateList2;
        }
        this.f6393c0 = dVar.f11200e;
        this.f6395d0 = dVar.f11201f;
        this.f6391b0 = dVar.f11202g;
        this.f6401g0 = dVar.f11204i;
        i8.a aVar = this.D;
        if (aVar != null) {
            aVar.f11195d = true;
        }
        b bVar = new b();
        dVar.a();
        this.D = new i8.a(bVar, dVar.f11209n);
        dVar.c(this.f6388a.getContext(), this.D);
        i(false);
    }

    public final boolean o(Typeface typeface) {
        i8.a aVar = this.D;
        if (aVar != null) {
            aVar.f11195d = true;
        }
        if (this.B == typeface) {
            return false;
        }
        this.B = typeface;
        Typeface a10 = i8.f.a(this.f6388a.getContext().getResources().getConfiguration(), typeface);
        this.A = a10;
        if (a10 == null) {
            a10 = this.B;
        }
        this.f6430z = a10;
        return true;
    }

    public final void p(float f10) {
        float f11;
        float f12;
        Rect rect;
        float F2 = g0.F(f10, 0.0f, 1.0f);
        if (F2 != this.f6390b) {
            this.f6390b = F2;
            if (this.f6392c) {
                RectF rectF = this.f6404i;
                if (F2 < this.f6396e) {
                    rect = this.f6400g;
                } else {
                    rect = this.f6402h;
                }
                rectF.set(rect);
            } else {
                this.f6404i.left = g((float) this.f6400g.left, (float) this.f6402h.left, F2, this.V);
                this.f6404i.top = g(this.f6420q, this.f6422r, F2, this.V);
                this.f6404i.right = g((float) this.f6400g.right, (float) this.f6402h.right, F2, this.V);
                this.f6404i.bottom = g((float) this.f6400g.bottom, (float) this.f6402h.bottom, F2, this.V);
            }
            if (!this.f6392c) {
                this.f6425u = g(this.f6423s, this.f6424t, F2, this.V);
                this.f6426v = g(this.f6420q, this.f6422r, F2, this.V);
                q(F2);
                f11 = F2;
            } else if (F2 < this.f6396e) {
                this.f6425u = this.f6423s;
                this.f6426v = this.f6420q;
                q(0.0f);
                f11 = 0.0f;
            } else {
                this.f6425u = this.f6424t;
                this.f6426v = this.f6422r - ((float) Math.max(0, this.f6398f));
                q(1.0f);
                f11 = 1.0f;
            }
            q2.b bVar = t7.b.f14886b;
            this.f6409k0 = 1.0f - g(0.0f, 1.0f, 1.0f - F2, bVar);
            View view = this.f6388a;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.d.k(view);
            this.f6411l0 = g(1.0f, 0.0f, F2, bVar);
            d0.d.k(this.f6388a);
            ColorStateList colorStateList = this.f6416o;
            ColorStateList colorStateList2 = this.f6414n;
            if (colorStateList != colorStateList2) {
                this.T.setColor(a(f11, f(colorStateList2), f(this.f6416o)));
            } else {
                this.T.setColor(f(colorStateList));
            }
            float f13 = this.f6399f0;
            float f14 = this.f6401g0;
            if (f13 != f14) {
                this.T.setLetterSpacing(g(f14, f13, F2, bVar));
            } else {
                this.T.setLetterSpacing(f13);
            }
            this.N = g(this.f6391b0, this.X, F2, (TimeInterpolator) null);
            this.O = g(this.f6393c0, this.Y, F2, (TimeInterpolator) null);
            this.P = g(this.f6395d0, this.Z, F2, (TimeInterpolator) null);
            int a10 = a(F2, f(this.f6397e0), f(this.f6389a0));
            this.Q = a10;
            this.T.setShadowLayer(this.N, this.O, this.P, a10);
            if (this.f6392c) {
                int alpha = this.T.getAlpha();
                float f15 = this.f6396e;
                if (F2 <= f15) {
                    f12 = t7.b.a(1.0f, 0.0f, this.f6394d, f15, F2);
                } else {
                    f12 = t7.b.a(0.0f, 1.0f, f15, 1.0f, F2);
                }
                this.T.setAlpha((int) (f12 * ((float) alpha)));
            }
            d0.d.k(this.f6388a);
        }
    }

    public final void q(float f10) {
        c(f10, false);
        View view = this.f6388a;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.d.k(view);
    }

    public final boolean r(int[] iArr) {
        boolean z10;
        ColorStateList colorStateList;
        this.R = iArr;
        ColorStateList colorStateList2 = this.f6416o;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = this.f6414n) == null || !colorStateList.isStateful())) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        i(false);
        return true;
    }
}
