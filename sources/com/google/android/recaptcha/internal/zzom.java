package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzom extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzom zzb;
    private int zzd;
    private String zze = "";
    private int zzf;
    private String zzg = "";
    private int zzh;
    private String zzi = "";
    private int zzj;

    static {
        zzom zzom = new zzom();
        zzb = zzom;
        zzks.zzF(zzom.class, zzom);
    }

    private zzom() {
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005\u0004\u0006Ȉ\u0007\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i11 == 3) {
            return new zzom();
        } else {
            if (i11 == 4) {
                return new zzol((zzok) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
