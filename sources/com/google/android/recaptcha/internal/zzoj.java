package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzoj extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzoj zzb;
    private String zzd = "";
    private String zze = "";

    static {
        zzoj zzoj = new zzoj();
        zzb = zzoj;
        zzks.zzF(zzoj.class, zzoj);
    }

    private zzoj() {
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzoj();
        } else {
            if (i11 == 4) {
                return new zzoi((zzoh) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
