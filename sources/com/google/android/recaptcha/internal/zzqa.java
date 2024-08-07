package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzqa extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzqa zzb;
    private int zzd;
    private String zze = "";

    static {
        zzqa zzqa = new zzqa();
        zzb = zzqa;
        zzks.zzF(zzqa.class, zzqa);
    }

    private zzqa() {
    }

    public static zzpz zzf() {
        return (zzpz) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzqa zzqa, String str) {
        str.getClass();
        zzqa.zzd |= 1;
        zzqa.zze = str;
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzqa();
        } else {
            if (i11 == 4) {
                return new zzpz((zzpk) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
