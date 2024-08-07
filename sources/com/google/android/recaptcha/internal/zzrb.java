package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzrb extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzrb zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzrb zzrb = new zzrb();
        zzb = zzrb;
        zzks.zzF(zzrb.class, zzrb);
    }

    private zzrb() {
    }

    public static zzrb zzg(byte[] bArr) {
        return (zzrb) zzks.zzv(zzb, bArr);
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzrb();
        } else {
            if (i11 == 4) {
                return new zzra((zzqr) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzrc zzi() {
        zzrc zzb2 = zzrc.zzb(this.zzf);
        if (zzb2 == null) {
            return zzrc.UNRECOGNIZED;
        }
        return zzb2;
    }
}
