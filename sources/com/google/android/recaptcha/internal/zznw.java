package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zznw extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zznw zzb;
    private int zzd;
    private zzka zze;
    private int zzf;

    static {
        zznw zznw = new zznw();
        zzb = zznw;
        zzks.zzF(zznw.class, zznw);
    }

    private zznw() {
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zznw();
        } else {
            if (i11 == 4) {
                return new zznv((zznu) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
