package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R$styleable;
import b1.a;
import b1.j;
import b1.p;
import e1.b;
import e1.c;
import f1.n;
import f1.o;
import java.util.HashMap;

public class MotionTelltales extends MockView {

    /* renamed from: s  reason: collision with root package name */
    public Paint f1832s = new Paint();

    /* renamed from: t  reason: collision with root package name */
    public MotionLayout f1833t;

    /* renamed from: u  reason: collision with root package name */
    public float[] f1834u = new float[2];

    /* renamed from: v  reason: collision with root package name */
    public Matrix f1835v = new Matrix();

    /* renamed from: w  reason: collision with root package name */
    public int f1836w = 0;

    /* renamed from: x  reason: collision with root package name */
    public int f1837x = -65281;

    /* renamed from: y  reason: collision with root package name */
    public float f1838y = 0.25f;

    public MotionTelltales(Context context) {
        super(context);
        a(context, (AttributeSet) null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MotionTelltales);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R$styleable.MotionTelltales_telltales_tailColor) {
                    this.f1837x = obtainStyledAttributes.getColor(index, this.f1837x);
                } else if (index == R$styleable.MotionTelltales_telltales_velocityMode) {
                    this.f1836w = obtainStyledAttributes.getInt(index, this.f1836w);
                } else if (index == R$styleable.MotionTelltales_telltales_tailScale) {
                    this.f1838y = obtainStyledAttributes.getFloat(index, this.f1838y);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1832s.setColor(this.f1837x);
        this.f1832s.setStrokeWidth(5.0f);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public final void onDraw(Canvas canvas) {
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float[] fArr;
        float[] fArr2;
        float f11;
        float f12;
        j jVar;
        j jVar2;
        j jVar3;
        j jVar4;
        int i15;
        j jVar5;
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        float f13;
        float f14;
        float f15;
        double[] dArr;
        int i16;
        float f16;
        float[] fArr3;
        MotionTelltales motionTelltales = this;
        super.onDraw(canvas);
        getMatrix().invert(motionTelltales.f1835v);
        if (motionTelltales.f1833t == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                motionTelltales.f1833t = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i17 = 5;
        float[] fArr4 = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        MotionTelltales motionTelltales2 = motionTelltales;
        int i18 = 0;
        while (i18 < i17) {
            float f17 = fArr4[i18];
            int i19 = 0;
            while (i19 < i17) {
                float f18 = fArr4[i19];
                MotionLayout motionLayout = motionTelltales2.f1833t;
                float[] fArr5 = motionTelltales2.f1834u;
                int i20 = motionTelltales2.f1836w;
                float f19 = motionLayout.A;
                float f20 = motionLayout.L;
                if (motionLayout.f1597y != null) {
                    float signum = Math.signum(motionLayout.N - f20);
                    float interpolation = motionLayout.f1597y.getInterpolation(motionLayout.L + 1.0E-5f);
                    f20 = motionLayout.f1597y.getInterpolation(motionLayout.L);
                    f19 = (((interpolation - f20) / 1.0E-5f) * signum) / motionLayout.J;
                }
                o oVar = motionLayout.f1597y;
                if (oVar instanceof o) {
                    f19 = oVar.a();
                }
                float f21 = f19;
                n nVar = motionLayout.H.get(motionTelltales2);
                if ((i20 & 1) == 0) {
                    int width2 = getWidth();
                    int height2 = getHeight();
                    float b10 = nVar.b(f20, nVar.f9750v);
                    HashMap<String, c> hashMap = nVar.f9753y;
                    b bVar5 = null;
                    if (hashMap == null) {
                        fArr = fArr4;
                        jVar = null;
                    } else {
                        jVar = hashMap.get("translationX");
                        fArr = fArr4;
                    }
                    HashMap<String, c> hashMap2 = nVar.f9753y;
                    i14 = i20;
                    if (hashMap2 == null) {
                        i13 = i18;
                        jVar2 = null;
                    } else {
                        jVar2 = hashMap2.get("translationY");
                        i13 = i18;
                    }
                    HashMap<String, c> hashMap3 = nVar.f9753y;
                    i12 = i19;
                    if (hashMap3 == null) {
                        i11 = height;
                        jVar3 = null;
                    } else {
                        jVar3 = hashMap3.get("rotation");
                        i11 = height;
                    }
                    HashMap<String, c> hashMap4 = nVar.f9753y;
                    i10 = width;
                    if (hashMap4 == null) {
                        jVar4 = null;
                    } else {
                        jVar4 = hashMap4.get("scaleX");
                    }
                    HashMap<String, c> hashMap5 = nVar.f9753y;
                    f10 = f21;
                    if (hashMap5 == null) {
                        i15 = width2;
                        jVar5 = null;
                    } else {
                        jVar5 = hashMap5.get("scaleY");
                        i15 = width2;
                    }
                    HashMap<String, b> hashMap6 = nVar.f9754z;
                    if (hashMap6 == null) {
                        bVar = null;
                    } else {
                        bVar = hashMap6.get("translationX");
                    }
                    HashMap<String, b> hashMap7 = nVar.f9754z;
                    if (hashMap7 == null) {
                        bVar2 = null;
                    } else {
                        bVar2 = hashMap7.get("translationY");
                    }
                    HashMap<String, b> hashMap8 = nVar.f9754z;
                    if (hashMap8 == null) {
                        bVar3 = null;
                    } else {
                        bVar3 = hashMap8.get("rotation");
                    }
                    HashMap<String, b> hashMap9 = nVar.f9754z;
                    if (hashMap9 == null) {
                        bVar4 = null;
                    } else {
                        bVar4 = hashMap9.get("scaleX");
                    }
                    HashMap<String, b> hashMap10 = nVar.f9754z;
                    if (hashMap10 != null) {
                        bVar5 = hashMap10.get("scaleY");
                    }
                    b bVar6 = bVar5;
                    p pVar = new p();
                    float[] fArr6 = fArr5;
                    pVar.f3981e = 0.0f;
                    pVar.f3980d = 0.0f;
                    pVar.f3979c = 0.0f;
                    pVar.f3978b = 0.0f;
                    pVar.f3977a = 0.0f;
                    if (jVar3 != null) {
                        f13 = f18;
                        f14 = f17;
                        pVar.f3981e = (float) jVar3.f3939a.e((double) b10);
                        pVar.f3982f = jVar3.a(b10);
                    } else {
                        f13 = f18;
                        f14 = f17;
                    }
                    if (jVar != null) {
                        pVar.f3979c = (float) jVar.f3939a.e((double) b10);
                    }
                    if (jVar2 != null) {
                        pVar.f3980d = (float) jVar2.f3939a.e((double) b10);
                    }
                    if (jVar4 != null) {
                        pVar.f3977a = (float) jVar4.f3939a.e((double) b10);
                    }
                    if (jVar5 != null) {
                        pVar.f3978b = (float) jVar5.f3939a.e((double) b10);
                    }
                    if (bVar3 != null) {
                        pVar.f3981e = bVar3.b(b10);
                    }
                    if (bVar != null) {
                        pVar.f3979c = bVar.b(b10);
                    }
                    if (bVar2 != null) {
                        pVar.f3980d = bVar2.b(b10);
                    }
                    if (bVar4 != null) {
                        pVar.f3977a = bVar4.b(b10);
                    }
                    if (bVar6 != null) {
                        pVar.f3978b = bVar6.b(b10);
                    }
                    a aVar = nVar.f9739k;
                    if (aVar != null) {
                        double[] dArr2 = nVar.f9744p;
                        if (dArr2.length > 0) {
                            double d10 = (double) b10;
                            aVar.c(d10, dArr2);
                            nVar.f9739k.f(d10, nVar.f9745q);
                            f1.p pVar2 = nVar.f9734f;
                            int[] iArr = nVar.f9743o;
                            double[] dArr3 = nVar.f9745q;
                            double[] dArr4 = nVar.f9744p;
                            pVar2.getClass();
                            i16 = i14;
                            fArr3 = fArr6;
                            f16 = f13;
                            f1.p.k(f13, f14, fArr6, iArr, dArr3, dArr4);
                        } else {
                            fArr3 = fArr6;
                            i16 = i14;
                            f16 = f13;
                        }
                        pVar.a(f16, f14, i15, height2, fArr3);
                        i14 = i16;
                        fArr2 = fArr3;
                        f12 = f16;
                    } else {
                        float[] fArr7 = fArr6;
                        float f22 = f13;
                        if (nVar.f9738j != null) {
                            double b11 = (double) nVar.b(b10, nVar.f9750v);
                            nVar.f9738j[0].f(b11, nVar.f9745q);
                            nVar.f9738j[0].c(b11, nVar.f9744p);
                            float f23 = nVar.f9750v[0];
                            int i21 = 0;
                            while (true) {
                                dArr = nVar.f9745q;
                                if (i21 >= dArr.length) {
                                    break;
                                }
                                dArr[i21] = dArr[i21] * ((double) f23);
                                i21++;
                            }
                            f1.p pVar3 = nVar.f9734f;
                            int[] iArr2 = nVar.f9743o;
                            double[] dArr5 = nVar.f9744p;
                            pVar3.getClass();
                            fArr2 = fArr7;
                            f12 = f22;
                            f1.p.k(f22, f14, fArr7, iArr2, dArr, dArr5);
                            pVar.a(f12, f14, i15, height2, fArr2);
                        } else {
                            fArr2 = fArr7;
                            f1.p pVar4 = nVar.f9735g;
                            b bVar7 = bVar6;
                            float f24 = pVar4.f9760e;
                            f1.p pVar5 = nVar.f9734f;
                            b bVar8 = bVar4;
                            float f25 = f24 - pVar5.f9760e;
                            b bVar9 = bVar2;
                            float f26 = pVar4.f9761f - pVar5.f9761f;
                            b bVar10 = bVar;
                            fArr2[0] = (((pVar4.f9762n - pVar5.f9762n) + f25) * f22) + ((1.0f - f22) * f25);
                            fArr2[1] = (((pVar4.f9763o - pVar5.f9763o) + f26) * f14) + ((1.0f - f14) * f26);
                            pVar.f3981e = 0.0f;
                            pVar.f3980d = 0.0f;
                            pVar.f3979c = 0.0f;
                            pVar.f3978b = 0.0f;
                            pVar.f3977a = 0.0f;
                            if (jVar3 != null) {
                                f15 = f22;
                                pVar.f3981e = (float) jVar3.f3939a.e((double) b10);
                                pVar.f3982f = jVar3.a(b10);
                            } else {
                                f15 = f22;
                            }
                            if (jVar != null) {
                                pVar.f3979c = (float) jVar.f3939a.e((double) b10);
                            }
                            if (jVar2 != null) {
                                pVar.f3980d = (float) jVar2.f3939a.e((double) b10);
                            }
                            if (jVar4 != null) {
                                pVar.f3977a = (float) jVar4.f3939a.e((double) b10);
                            }
                            if (jVar5 != null) {
                                pVar.f3978b = (float) jVar5.f3939a.e((double) b10);
                            }
                            if (bVar3 != null) {
                                pVar.f3981e = bVar3.b(b10);
                            }
                            if (bVar10 != null) {
                                pVar.f3979c = bVar10.b(b10);
                            }
                            if (bVar9 != null) {
                                pVar.f3980d = bVar9.b(b10);
                            }
                            if (bVar8 != null) {
                                pVar.f3977a = bVar8.b(b10);
                            }
                            if (bVar7 != null) {
                                pVar.f3978b = bVar7.b(b10);
                            }
                            f12 = f15;
                            pVar.a(f15, f14, i15, height2, fArr2);
                        }
                    }
                    f11 = f14;
                } else {
                    i10 = width;
                    i11 = height;
                    f10 = f21;
                    fArr = fArr4;
                    i13 = i18;
                    i14 = i20;
                    f12 = f18;
                    f11 = f17;
                    i12 = i19;
                    fArr2 = fArr5;
                    nVar.d(f20, f12, f11, fArr2);
                }
                if (i14 < 2) {
                    fArr2[0] = fArr2[0] * f10;
                    fArr2[1] = fArr2[1] * f10;
                }
                this.f1835v.mapVectors(this.f1834u);
                int i22 = i10;
                float f27 = ((float) i22) * f12;
                int i23 = i11;
                float f28 = ((float) i23) * f11;
                float[] fArr8 = this.f1834u;
                float f29 = fArr8[0];
                float f30 = this.f1838y;
                float f31 = f28 - (fArr8[1] * f30);
                this.f1835v.mapVectors(fArr8);
                canvas.drawLine(f27, f28, f27 - (f29 * f30), f31, this.f1832s);
                i19 = i12 + 1;
                f17 = f11;
                motionTelltales2 = this;
                width = i22;
                fArr4 = fArr;
                i18 = i13;
                i17 = 5;
                height = i23;
                motionTelltales = motionTelltales2;
            }
            int i24 = width;
            float[] fArr9 = fArr4;
            int i25 = height;
            MotionTelltales motionTelltales3 = motionTelltales;
            int i26 = i25;
            i18++;
            i17 = 5;
            MotionTelltales motionTelltales4 = motionTelltales3;
            height = i26;
            motionTelltales = motionTelltales4;
        }
        MotionTelltales motionTelltales5 = motionTelltales;
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f1794f = charSequence.toString();
        requestLayout();
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context, attributeSet);
    }
}
