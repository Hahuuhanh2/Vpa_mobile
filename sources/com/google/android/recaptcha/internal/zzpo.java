package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzpo extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzpo zzb;
    private zziv zzd = zziv.zzb;

    static {
        zzpo zzpo = new zzpo();
        zzb = zzpo;
        zzks.zzF(zzpo.class, zzpo);
    }

    private zzpo() {
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"zzd"});
        } else if (i11 == 3) {
            return new zzpo();
        } else {
            if (i11 == 4) {
                return new zzpn((zzpk) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
