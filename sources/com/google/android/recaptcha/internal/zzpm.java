package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzpm extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzpm zzb;
    private int zzd;
    private String zze = "";

    static {
        zzpm zzpm = new zzpm();
        zzb = zzpm;
        zzks.zzF(zzpm.class, zzpm);
    }

    private zzpm() {
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzpm();
        } else {
            if (i11 == 4) {
                return new zzpl((zzpk) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
