package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzqd extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzqd zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private zzpw zzl;

    static {
        zzqd zzqd = new zzqd();
        zzb = zzqd;
        zzks.zzF(zzqd.class, zzqd);
    }

    private zzqd() {
    }

    public static /* synthetic */ void zzJ(zzqd zzqd, String str) {
        str.getClass();
        zzqd.zzd |= 32;
        zzqd.zzj = str;
    }

    public static /* synthetic */ void zzK(zzqd zzqd, String str) {
        str.getClass();
        zzqd.zzd |= 64;
        zzqd.zzk = str;
    }

    public static /* synthetic */ void zzL(zzqd zzqd, zzpw zzpw) {
        zzpw.getClass();
        zzqd.zzl = zzpw;
        zzqd.zzd |= 128;
    }

    public static /* synthetic */ void zzM(zzqd zzqd, String str) {
        str.getClass();
        zzqd.zzd |= 2;
        zzqd.zzf = str;
    }

    public static /* synthetic */ void zzN(zzqd zzqd, String str) {
        str.getClass();
        zzqd.zzd |= 4;
        zzqd.zzg = str;
    }

    public static zzqc zzf() {
        return (zzqc) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzqd zzqd, String str) {
        str.getClass();
        zzqd.zzd |= 1;
        zzqd.zze = str;
    }

    public static /* synthetic */ void zzj(zzqd zzqd, String str) {
        str.getClass();
        zzqd.zzd |= 8;
        zzqd.zzh = str;
    }

    public static /* synthetic */ void zzk(zzqd zzqd, String str) {
        str.getClass();
        zzqd.zzd |= 16;
        zzqd.zzi = str;
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bဉ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i11 == 3) {
            return new zzqd();
        } else {
            if (i11 == 4) {
                return new zzqc((zzqb) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
