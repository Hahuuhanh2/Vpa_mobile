package gl;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Arrays;
import l4.c0;
import m4.c;
import n4.f;
import qa.b;

/* compiled from: Tasks.kt */
public final class i implements h, c0, b {

    /* renamed from: a  reason: collision with root package name */
    public int f20487a;

    public /* synthetic */ i(int i10) {
        this.f20487a = i10;
    }

    public void a() {
    }

    public Object b(c cVar, float f10) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f11;
        ArrayList arrayList = new ArrayList();
        int i15 = 1;
        if (cVar.K() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            cVar.d();
        }
        while (cVar.v()) {
            arrayList.add(Float.valueOf((float) cVar.z()));
        }
        int i16 = 4;
        int i17 = 2;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f20487a = 2;
        }
        if (z10) {
            cVar.i();
        }
        if (this.f20487a == -1) {
            this.f20487a = arrayList.size() / 4;
        }
        int i18 = this.f20487a;
        float[] fArr = new float[i18];
        int[] iArr = new int[i18];
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (true) {
            i10 = this.f20487a * i16;
            if (i19 >= i10) {
                break;
            }
            int i22 = i19 / 4;
            double floatValue = (double) ((Float) arrayList.get(i19)).floatValue();
            int i23 = i19 % 4;
            if (i23 == 0) {
                if (i22 > 0) {
                    float f12 = (float) floatValue;
                    if (fArr[i22 - 1] >= f12) {
                        fArr[i22] = f12 + 0.01f;
                    }
                }
                fArr[i22] = (float) floatValue;
            } else if (i23 == i15) {
                i20 = (int) (floatValue * 255.0d);
            } else if (i23 == 2) {
                i21 = (int) (floatValue * 255.0d);
            } else if (i23 == 3) {
                iArr[i22] = Color.argb(255, i20, i21, (int) (floatValue * 255.0d));
            }
            i19++;
            i15 = 1;
            i16 = 4;
        }
        i4.c cVar2 = new i4.c(fArr, iArr);
        if (arrayList.size() <= i10) {
            return cVar2;
        }
        int size = (arrayList.size() - i10) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i24 = 0;
        while (i10 < arrayList.size()) {
            if (i10 % 2 == 0) {
                fArr2[i24] = ((Float) arrayList.get(i10)).floatValue();
            } else {
                fArr3[i24] = ((Float) arrayList.get(i10)).floatValue();
                i24++;
            }
            i10++;
        }
        float[] fArr4 = cVar2.f11078a;
        if (fArr4.length == 0) {
            fArr4 = fArr2;
        } else if (size != 0) {
            int length = fArr4.length + size;
            float[] fArr5 = new float[length];
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            for (int i28 = 0; i28 < length; i28++) {
                float f13 = Float.NaN;
                if (i26 < fArr4.length) {
                    f11 = fArr4[i26];
                } else {
                    f11 = Float.NaN;
                }
                if (i27 < size) {
                    f13 = fArr2[i27];
                }
                if (Float.isNaN(f13) || f11 < f13) {
                    fArr5[i28] = f11;
                    i26++;
                } else if (Float.isNaN(f11) || f13 < f11) {
                    fArr5[i28] = f13;
                    i27++;
                } else {
                    fArr5[i28] = f11;
                    i26++;
                    i27++;
                    i25++;
                }
            }
            if (i25 == 0) {
                fArr4 = fArr5;
            } else {
                fArr4 = Arrays.copyOf(fArr5, length - i25);
            }
        }
        int length2 = fArr4.length;
        int[] iArr2 = new int[length2];
        int i29 = 0;
        while (i29 < length2) {
            float f14 = fArr4[i29];
            int binarySearch = Arrays.binarySearch(fArr, f14);
            int binarySearch2 = Arrays.binarySearch(fArr2, f14);
            if (binarySearch < 0 || binarySearch2 > 0) {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                float f15 = fArr3[binarySearch2];
                if (i18 < 2 || f14 == fArr[0]) {
                    i11 = i18;
                    i12 = iArr[0];
                } else {
                    int i30 = 1;
                    while (i30 < i18) {
                        float f16 = fArr[i30];
                        if (f16 >= f14 || i30 == i18 - 1) {
                            int i31 = i30 - 1;
                            float f17 = fArr[i31];
                            float f18 = (f14 - f17) / (f16 - f17);
                            int i32 = iArr[i30];
                            int i33 = iArr[i31];
                            int red = Color.red(i33);
                            int red2 = Color.red(i32);
                            PointF pointF = f.f13512a;
                            int i34 = (int) ((((float) (red2 - red)) * f18) + ((float) red));
                            int green = Color.green(i33);
                            i11 = i18;
                            int green2 = (int) ((((float) (Color.green(i32) - green)) * f18) + ((float) green));
                            int blue = Color.blue(i33);
                            i12 = Color.argb((int) (f15 * 255.0f), i34, green2, (int) ((f18 * ((float) (Color.blue(i32) - blue))) + ((float) blue)));
                        } else {
                            i30++;
                        }
                    }
                    throw new IllegalArgumentException("Unreachable code.");
                }
                iArr2[i29] = i12;
            } else {
                int i35 = iArr[binarySearch];
                if (size < i17 || f14 <= fArr2[0]) {
                    i13 = Color.argb((int) (fArr3[0] * 255.0f), Color.red(i35), Color.green(i35), Color.blue(i35));
                } else {
                    int i36 = 1;
                    while (i36 < size) {
                        float f19 = fArr2[i36];
                        int i37 = (f19 > f14 ? 1 : (f19 == f14 ? 0 : -1));
                        if (i37 >= 0 || i36 == size - 1) {
                            if (i37 <= 0) {
                                i14 = (int) (fArr3[i36] * 255.0f);
                            } else {
                                int i38 = i36 - 1;
                                float f20 = fArr2[i38];
                                float f21 = f14 - f20;
                                float f22 = fArr3[i38];
                                float f23 = fArr3[i36];
                                PointF pointF2 = f.f13512a;
                                i14 = (int) ((((f23 - f22) * (f21 / (f19 - f20))) + f22) * 255.0f);
                            }
                            i13 = Color.argb(i14, Color.red(i35), Color.green(i35), Color.blue(i35));
                        } else {
                            i36++;
                        }
                    }
                    throw new IllegalArgumentException("Unreachable code.");
                }
                iArr2[i29] = i13;
                i11 = i18;
            }
            i29++;
            i18 = i11;
            i17 = 2;
        }
        return new i4.c(fArr4, iArr2);
    }

    public int c() {
        return this.f20487a;
    }

    public StackTraceElement[] j(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i10 = this.f20487a;
        if (length <= i10) {
            return stackTraceElementArr;
        }
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i10];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i12);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i11, stackTraceElementArr2, i12, i11);
        return stackTraceElementArr2;
    }
}
