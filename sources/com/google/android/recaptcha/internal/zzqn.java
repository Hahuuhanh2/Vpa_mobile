package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzqn extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzqn zzb;
    private int zzd;
    private String zze = "";
    private zzkz zzf = zzks.zzz();

    static {
        zzqn zzqn = new zzqn();
        zzb = zzqn;
        zzks.zzF(zzqn.class, zzqn);
    }

    private zzqn() {
    }

    public static zzqm zzf() {
        return (zzqm) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzqn zzqn, String str) {
        str.getClass();
        zzqn.zzd |= 1;
        zzqn.zze = str;
    }

    public static /* synthetic */ void zzj(zzqn zzqn, zzql zzql) {
        zzql.getClass();
        zzkz zzkz = zzqn.zzf;
        if (!zzkz.zzc()) {
            zzqn.zzf = zzks.zzA(zzkz);
        }
        zzqn.zzf.add(zzql);
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"zzd", "zzf", zzql.class, "zze"});
        } else if (i11 == 3) {
            return new zzqn();
        } else {
            if (i11 == 4) {
                return new zzqm((zzqi) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
