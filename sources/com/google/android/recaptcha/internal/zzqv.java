package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzqv extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzqv zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";

    static {
        zzqv zzqv = new zzqv();
        zzb = zzqv;
        zzks.zzF(zzqv.class, zzqv);
    }

    private zzqv() {
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzqv();
        } else {
            if (i11 == 4) {
                return new zzqu((zzqr) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
