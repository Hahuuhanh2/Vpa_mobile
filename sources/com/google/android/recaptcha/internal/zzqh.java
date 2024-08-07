package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzqh extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzqh zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzqh zzqh = new zzqh();
        zzb = zzqh;
        zzks.zzF(zzqh.class, zzqh);
    }

    private zzqh() {
    }

    public final String zzg() {
        return this.zze;
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzqh();
        } else {
            if (i11 == 4) {
                return new zzqg((zzqb) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final String zzi() {
        return this.zzf;
    }
}
