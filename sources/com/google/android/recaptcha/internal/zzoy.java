package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzoy extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzoy zzb;
    private int zzd;
    private zzka zze;
    private zzmz zzf;
    private zzka zzg;
    private zzmz zzh;

    static {
        zzoy zzoy = new zzoy();
        zzb = zzoy;
        zzks.zzF(zzoy.class, zzoy);
    }

    private zzoy() {
    }

    public static /* synthetic */ void zzJ(zzoy zzoy, zzka zzka) {
        zzka.getClass();
        zzoy.zzg = zzka;
        zzoy.zzd |= 4;
    }

    public static zzox zzf() {
        return (zzox) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzoy zzoy, zzka zzka) {
        zzka.getClass();
        zzoy.zze = zzka;
        zzoy.zzd |= 1;
    }

    public static /* synthetic */ void zzj(zzoy zzoy, zzmz zzmz) {
        zzmz.getClass();
        zzoy.zzh = zzmz;
        zzoy.zzd |= 8;
    }

    public static /* synthetic */ void zzk(zzoy zzoy, zzmz zzmz) {
        zzmz.getClass();
        zzoy.zzf = zzmz;
        zzoy.zzd |= 2;
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzoy();
        } else {
            if (i11 == 4) {
                return new zzox((zzow) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
