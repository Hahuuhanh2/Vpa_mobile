package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzql extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzql zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private zzkx zzg = zzks.zzw();
    private int zzh;
    private int zzi;

    static {
        zzql zzql = new zzql();
        zzb = zzql;
        zzks.zzF(zzql.class, zzql);
    }

    private zzql() {
    }

    public static zzqj zzf() {
        return (zzqj) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzql zzql, String str) {
        str.getClass();
        zzql.zzd |= 1;
        zzql.zze = str;
    }

    public static /* synthetic */ void zzj(zzql zzql, String str) {
        str.getClass();
        zzql.zzd |= 2;
        zzql.zzf = str;
    }

    public static /* synthetic */ void zzk(zzql zzql, int i10) {
        zzql.zzh = 2;
        zzql.zzd |= 4;
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003'\u0004᠌\u0002\u0005င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzqk.zza, "zzi"});
        } else if (i11 == 3) {
            return new zzql();
        } else {
            if (i11 == 4) {
                return new zzqj((zzqi) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
