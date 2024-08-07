package com.google.android.recaptcha.internal;

import fk.h;
import fk.r;
import j7.a;
import java.util.ArrayList;
import java.util.List;
import sk.j;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzff implements zzfe {
    public static final zzff zza = new zzff();

    private zzff() {
    }

    private static final List zzc(Object obj) {
        List list;
        int i10 = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            j.f(bArr, "<this>");
            int length = bArr.length;
            if (length == 0) {
                return r.f20213a;
            }
            if (length == 1) {
                return a.c0(Byte.valueOf(bArr[0]));
            }
            ArrayList arrayList = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i10 < length2) {
                arrayList.add(Byte.valueOf(bArr[i10]));
                i10++;
            }
            return arrayList;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            j.f(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 == 0) {
                list = r.f20213a;
            } else if (length3 != 1) {
                ArrayList arrayList2 = new ArrayList(sArr.length);
                int length4 = sArr.length;
                while (i10 < length4) {
                    arrayList2.add(Short.valueOf(sArr[i10]));
                    i10++;
                }
                return arrayList2;
            } else {
                list = a.c0(Short.valueOf(sArr[0]));
            }
        } else if (obj instanceof int[]) {
            return h.x0((int[]) obj);
        } else {
            if (obj instanceof long[]) {
                return h.y0((long[]) obj);
            }
            if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                j.f(fArr, "<this>");
                int length5 = fArr.length;
                if (length5 == 0) {
                    list = r.f20213a;
                } else if (length5 != 1) {
                    ArrayList arrayList3 = new ArrayList(fArr.length);
                    int length6 = fArr.length;
                    while (i10 < length6) {
                        arrayList3.add(Float.valueOf(fArr[i10]));
                        i10++;
                    }
                    return arrayList3;
                } else {
                    list = a.c0(Float.valueOf(fArr[0]));
                }
            } else if (!(obj instanceof double[])) {
                return null;
            } else {
                double[] dArr = (double[]) obj;
                j.f(dArr, "<this>");
                int length7 = dArr.length;
                if (length7 == 0) {
                    return r.f20213a;
                }
                if (length7 == 1) {
                    return a.c0(Double.valueOf(dArr[0]));
                }
                ArrayList arrayList4 = new ArrayList(dArr.length);
                int length8 = dArr.length;
                while (i10 < length8) {
                    arrayList4.add(Double.valueOf(dArr[i10]));
                    i10++;
                }
                return arrayList4;
            }
        }
        return list;
    }

    public final void zza(int i10, zzek zzek, zzrr... zzrrArr) {
        if (zzrrArr.length == 2) {
            Object zza2 = zzek.zzc().zza(zzrrArr[0]);
            if (true != (zza2 instanceof Object)) {
                zza2 = null;
            }
            if (zza2 != null) {
                Object zza3 = zzek.zzc().zza(zzrrArr[1]);
                if (true != (zza3 instanceof Object)) {
                    zza3 = null;
                }
                if (zza3 != null) {
                    zzek.zzc().zze(i10, zzb(zza2, zza3));
                    return;
                }
                throw new zzby(4, 5, (Throwable) null);
            }
            throw new zzby(4, 5, (Throwable) null);
        }
        throw new zzby(4, 3, (Throwable) null);
    }

    public final Object zzb(Object obj, Object obj2) {
        List<Number> zzc = zzc(obj);
        List<Number> zzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (zzc2 != null) {
                ArrayList arrayList = new ArrayList(fk.j.H0(zzc2));
                for (Number doubleValue : zzc2) {
                    arrayList.add(Double.valueOf(Math.pow(doubleValue.doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (zzc != null && (obj2 instanceof Number)) {
            ArrayList arrayList2 = new ArrayList(fk.j.H0(zzc));
            for (Number doubleValue2 : zzc) {
                arrayList2.add(Double.valueOf(Math.pow(doubleValue2.doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        } else if (zzc == null || zzc2 == null) {
            throw new zzby(4, 5, (Throwable) null);
        } else {
            zzfd.zza(this, zzc.size(), zzc2.size());
            int size = zzc.size();
            Double[] dArr = new Double[size];
            for (int i10 = 0; i10 < size; i10++) {
                dArr[i10] = Double.valueOf(Math.pow(((Number) zzc.get(i10)).doubleValue(), ((Number) zzc2.get(i10)).doubleValue()));
            }
            return dArr;
        }
    }
}
