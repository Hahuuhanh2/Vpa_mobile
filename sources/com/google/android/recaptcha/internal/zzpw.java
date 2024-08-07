package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzpw extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzpw zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzqa zzj;
    private zzpu zzk;
    private zzpy zzl;
    private zzpm zzm;

    static {
        zzpw zzpw = new zzpw();
        zzb = zzpw;
        zzks.zzF(zzpw.class, zzpw);
    }

    private zzpw() {
    }

    public static /* synthetic */ void zzL(zzpw zzpw, String str) {
        str.getClass();
        zzpw.zzd |= 1;
        zzpw.zze = str;
    }

    public static /* synthetic */ void zzM(zzpw zzpw, zzqa zzqa) {
        zzqa.getClass();
        zzpw.zzj = zzqa;
        zzpw.zzd |= 32;
    }

    public static /* synthetic */ void zzN(zzpw zzpw, zzpu zzpu) {
        zzpu.getClass();
        zzpw.zzk = zzpu;
        zzpw.zzd |= 64;
    }

    public static /* synthetic */ void zzO(zzpw zzpw, zzpy zzpy) {
        zzpy.getClass();
        zzpw.zzl = zzpy;
        zzpw.zzd |= 128;
    }

    public static zzpv zzf() {
        return (zzpv) zzb.zzp();
    }

    public static zzpw zzi(byte[] bArr) {
        return (zzpw) zzks.zzv(zzb, bArr);
    }

    @Deprecated
    public final String zzJ() {
        return this.zzf;
    }

    @Deprecated
    public final String zzK() {
        return this.zzg;
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        } else if (i11 == 3) {
            return new zzpw();
        } else {
            if (i11 == 4) {
                return new zzpv((zzpk) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    @Deprecated
    public final String zzj() {
        return this.zzh;
    }

    public final String zzk() {
        return this.zze;
    }
}
