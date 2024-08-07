package com.google.android.recaptcha.internal;

import fk.h;
import fk.p;
import java.util.Collection;
import rk.l;
import sk.j;
import yk.a;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzew implements zzfe {
    public static final zzew zza = new zzew();

    private zzew() {
    }

    public final void zza(int i10, zzek zzek, zzrr... zzrrArr) {
        String str;
        String str2;
        if (zzrrArr.length == 1) {
            int i11 = 0;
            Object zza2 = zzek.zzc().zza(zzrrArr[0]);
            if (true != (zza2 instanceof Object)) {
                zza2 = null;
            }
            if (zza2 != null) {
                if (zza2 instanceof int[]) {
                    int[] iArr = (int[]) zza2;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("[");
                    int length = iArr.length;
                    int i12 = 0;
                    while (i11 < length) {
                        int i13 = iArr[i11];
                        i12++;
                        if (i12 > 1) {
                            sb2.append(",");
                        }
                        sb2.append(String.valueOf(i13));
                        i11++;
                    }
                    sb2.append("]");
                    str = sb2.toString();
                    j.e(str, "joinTo(StringBuilder(), …ed, transform).toString()");
                } else {
                    if (zza2 instanceof byte[]) {
                        str2 = new String((byte[]) zza2, a.f23582b);
                    } else if (zza2 instanceof long[]) {
                        long[] jArr = (long[]) zza2;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("[");
                        int length2 = jArr.length;
                        int i14 = 0;
                        while (i11 < length2) {
                            long j10 = jArr[i11];
                            i14++;
                            if (i14 > 1) {
                                sb3.append(",");
                            }
                            sb3.append(String.valueOf(j10));
                            i11++;
                        }
                        sb3.append("]");
                        str = sb3.toString();
                        j.e(str, "joinTo(StringBuilder(), …ed, transform).toString()");
                    } else if (zza2 instanceof short[]) {
                        short[] sArr = (short[]) zza2;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("[");
                        int length3 = sArr.length;
                        int i15 = 0;
                        while (i11 < length3) {
                            short s10 = sArr[i11];
                            i15++;
                            if (i15 > 1) {
                                sb4.append(",");
                            }
                            sb4.append(String.valueOf(s10));
                            i11++;
                        }
                        sb4.append("]");
                        str = sb4.toString();
                        j.e(str, "joinTo(StringBuilder(), …ed, transform).toString()");
                    } else if (zza2 instanceof float[]) {
                        float[] fArr = (float[]) zza2;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("[");
                        int length4 = fArr.length;
                        int i16 = 0;
                        while (i11 < length4) {
                            float f10 = fArr[i11];
                            i16++;
                            if (i16 > 1) {
                                sb5.append(",");
                            }
                            sb5.append(String.valueOf(f10));
                            i11++;
                        }
                        sb5.append("]");
                        str = sb5.toString();
                        j.e(str, "joinTo(StringBuilder(), …ed, transform).toString()");
                    } else if (zza2 instanceof double[]) {
                        double[] dArr = (double[]) zza2;
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("[");
                        int length5 = dArr.length;
                        int i17 = 0;
                        while (i11 < length5) {
                            double d10 = dArr[i11];
                            i17++;
                            if (i17 > 1) {
                                sb6.append(",");
                            }
                            sb6.append(String.valueOf(d10));
                            i11++;
                        }
                        sb6.append("]");
                        str = sb6.toString();
                        j.e(str, "joinTo(StringBuilder(), …ed, transform).toString()");
                    } else if (zza2 instanceof char[]) {
                        str2 = new String((char[]) zza2);
                    } else if (zza2 instanceof Object[]) {
                        str = h.t0((Object[]) zza2, ",", "[", "]", 56);
                    } else if (zza2 instanceof Collection) {
                        str = p.Q0((Iterable) zza2, ",", "[", "]", (l) null, 56);
                    } else {
                        throw new zzby(4, 5, (Throwable) null);
                    }
                    str = str2;
                }
                zzek.zzc().zze(i10, str);
                return;
            }
            throw new zzby(4, 5, (Throwable) null);
        }
        throw new zzby(4, 3, (Throwable) null);
    }
}
