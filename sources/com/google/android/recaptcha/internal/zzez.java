package com.google.android.recaptcha.internal;

import java.lang.reflect.Proxy;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzez implements zzfe {
    public static final zzez zza = new zzez();

    private zzez() {
    }

    public final void zza(int i10, zzek zzek, zzrr... zzrrArr) {
        int i11;
        int length = zzrrArr.length;
        if (length == 4 || length == 5) {
            Object zza2 = zzek.zzc().zza(zzrrArr[0]);
            if (true != (zza2 instanceof String)) {
                zza2 = null;
            }
            String str = (String) zza2;
            if (str != null) {
                Object zza3 = zzek.zzc().zza(zzrrArr[1]);
                if (true != (zza3 instanceof Object)) {
                    zza3 = null;
                }
                if (zza3 != null) {
                    Object zza4 = zzek.zzc().zza(zzrrArr[2]);
                    if (true != (zza4 instanceof String)) {
                        zza4 = null;
                    }
                    String str2 = (String) zza4;
                    if (str2 != null) {
                        String zza5 = zzek.zzh().zza(str2);
                        Object zza6 = zzek.zzc().zza(zzrrArr[3]);
                        if (length == 5) {
                            Object zza7 = zzek.zzc().zza(zzrrArr[4]);
                            if (true != (zza7 instanceof Integer)) {
                                zza7 = null;
                            }
                            Integer num = (Integer) zza7;
                            if (num != null) {
                                i11 = num.intValue();
                            } else {
                                throw new zzby(4, 5, (Throwable) null);
                            }
                        } else {
                            i11 = -1;
                        }
                        try {
                            if (zza3 instanceof String) {
                                zza3 = zzek.zzh().zza((String) zza3);
                            }
                            Class zza8 = zzej.zza(zza3);
                            zzek.zzc().zze(i10, Proxy.newProxyInstance(zza8.getClassLoader(), new Class[]{zza8}, new zzef(new zzey(zzek, str, i11), zza5, zza6)));
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
            throw new zzby(4, 3, (Throwable) null);
        }
    }
}
