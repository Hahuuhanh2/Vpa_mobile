package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzps extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzps zzb;
    private zziv zzd;
    private String zze = "";
    private long zzf;
    private zziv zzg;
    private String zzh;
    private String zzi;

    static {
        zzps zzps = new zzps();
        zzb = zzps;
        zzks.zzF(zzps.class, zzps);
    }

    private zzps() {
        zziv zziv = zziv.zzb;
        this.zzd = zziv;
        this.zzg = zziv;
        this.zzh = "";
        this.zzi = "";
    }

    public static zzps zzk() {
        return zzb;
    }

    public final String zzJ() {
        return this.zze;
    }

    public final long zzf() {
        return this.zzf;
    }

    public final zziv zzg() {
        return this.zzg;
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\u0002\u0004\n\u0005Ȉ\u0006Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i11 == 3) {
            return new zzps();
        } else {
            if (i11 == 4) {
                return new zzpr((zzpk) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zziv zzi() {
        return this.zzd;
    }
}
