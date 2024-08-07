package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzqt extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzqt zzb;
    private String zzd = "";
    private String zze = "";
    /* access modifiers changed from: private */
    public String zzf = "";
    /* access modifiers changed from: private */
    public int zzg;
    private String zzh = "";
    private String zzi = "";
    /* access modifiers changed from: private */
    public String zzj = "";

    static {
        zzqt zzqt = new zzqt();
        zzb = zzqt;
        zzks.zzF(zzqt.class, zzqt);
    }

    private zzqt() {
    }

    public static /* synthetic */ void zzM(zzqt zzqt, String str) {
        str.getClass();
        zzqt.zzd = str;
    }

    public static /* synthetic */ void zzN(zzqt zzqt, String str) {
        str.getClass();
        zzqt.zzh = str;
    }

    public static /* synthetic */ void zzO(zzqt zzqt, String str) {
        str.getClass();
        zzqt.zzi = str;
    }

    public static /* synthetic */ void zzQ(zzqt zzqt, String str) {
        str.getClass();
        zzqt.zze = str;
    }

    public static zzqs zzf() {
        return (zzqs) zzb.zzp();
    }

    public final String zzJ() {
        return this.zzf;
    }

    public final String zzK() {
        return this.zzh;
    }

    public final String zzL() {
        return this.zzd;
    }

    public final int zzS() {
        int i10 = this.zzg;
        int i11 = 3;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 != 1) {
            i11 = i10 != 2 ? i10 != 3 ? 0 : 5 : 4;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0006Ȉ\u0007Ȉ\bȈ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i11 == 3) {
            return new zzqt();
        } else {
            if (i11 == 4) {
                return new zzqs((zzqr) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final String zzi() {
        return this.zzj;
    }

    public final String zzj() {
        return this.zzi;
    }

    public final String zzk() {
        return this.zze;
    }
}
