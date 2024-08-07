package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzpy extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzpy zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzpy zzpy = new zzpy();
        zzb = zzpy;
        zzks.zzF(zzpy.class, zzpy);
    }

    private zzpy() {
    }

    public static zzpx zzf() {
        return (zzpx) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzpy zzpy, String str) {
        str.getClass();
        zzpy.zzd |= 1;
        zzpy.zze = str;
    }

    public static /* synthetic */ void zzj(zzpy zzpy, String str) {
        str.getClass();
        zzpy.zzd |= 2;
        zzpy.zzf = str;
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzpy();
        } else {
            if (i11 == 4) {
                return new zzpx((zzpk) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
