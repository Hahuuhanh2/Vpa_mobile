package com.google.android.recaptcha.internal;

import java.lang.reflect.Proxy;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzfa implements zzfe {
    public static final zzfa zza = new zzfa();

    private zzfa() {
    }

    public final void zza(int i10, zzek zzek, zzrr... zzrrArr) {
        int length = zzrrArr.length;
        Object obj = null;
        if (length == 4 || length == 5) {
            Object zza2 = zzek.zzc().zza(zzrrArr[0]);
            if (true != (zza2 instanceof Integer)) {
                zza2 = null;
            }
            Integer num = (Integer) zza2;
            if (num != null) {
                int intValue = num.intValue();
                Object zza3 = zzek.zzc().zza(zzrrArr[1]);
                if (true != (zza3 instanceof Integer)) {
                    zza3 = null;
                }
                Integer num2 = (Integer) zza3;
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    Object zza4 = zzek.zzc().zza(zzrrArr[2]);
                    if (true != (zza4 instanceof String)) {
                        zza4 = null;
                    }
                    String str = (String) zza4;
                    if (str != null) {
                        String zza5 = zzek.zzh().zza(str);
                        Object zza6 = zzek.zzc().zza(zzrrArr[3]);
                        if (true != (zza6 instanceof String)) {
                            zza6 = null;
                        }
                        String str2 = (String) zza6;
                        if (str2 != null) {
                            String zza7 = zzek.zzh().zza(str2);
                            if (length == 5) {
                                obj = zzek.zzc().zza(zzrrArr[4]);
                            }
                            zzeg zzeg = new zzeg(intValue2);
                            try {
                                Class zza8 = zzej.zza(zza5);
                                zzek.zzc().zze(intValue, Proxy.newProxyInstance(zza8.getClassLoader(), new Class[]{zza8}, new zzeh(zzeg, zza7, obj)));
                                zzek.zzc().zze(i10, zzeg);
                            } catch (Exception e10) {
                                throw new zzby(6, 20, e10);
                            }
                        } else {
                            throw new zzby(4, 5, (Throwable) null);
                        }
                    } else {
                        throw new zzby(4, 5, (Throwable) null);
                    }
                } else {
                    throw new zzby(4, 5, (Throwable) null);
                }
            } else {
                throw new zzby(4, 5, (Throwable) null);
            }
        } else {
            throw new zzby(4, 3, (Throwable) null);
        }
    }
}
