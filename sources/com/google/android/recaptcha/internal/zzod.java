package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzod extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzod zzb;
    private String zzd = "";
    private String zze = "";
    /* access modifiers changed from: private */
    public int zzf;
    private String zzg = "";
    /* access modifiers changed from: private */
    public String zzh = "";
    private int zzi;
    /* access modifiers changed from: private */
    public int zzj;

    static {
        zzod zzod = new zzod();
        zzb = zzod;
        zzks.zzF(zzod.class, zzod);
    }

    private zzod() {
    }

    public static /* synthetic */ void zzJ(zzod zzod, String str) {
        str.getClass();
        zzod.zzd = str;
    }

    public static zzoc zzg() {
        return (zzoc) zzb.zzp();
    }

    public static zzod zzj() {
        return zzb;
    }

    public final int zzf() {
        return this.zzf;
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006Ȉ\u0007\u0004", new Object[]{"zzd", "zzf", "zzh", "zzi", "zze", "zzg", "zzj"});
        } else if (i11 == 3) {
            return new zzod();
        } else {
            if (i11 == 4) {
                return new zzoc((zzob) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final String zzk() {
        return this.zzd;
    }
}
