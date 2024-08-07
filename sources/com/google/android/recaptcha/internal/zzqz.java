package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzqz extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzqz zzb;
    private int zzd;

    static {
        zzqz zzqz = new zzqz();
        zzb = zzqz;
        zzks.zzF(zzqz.class, zzqz);
    }

    private zzqz() {
    }

    public static zzqz zzg(byte[] bArr) {
        return (zzqz) zzks.zzv(zzb, bArr);
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zzd"});
        } else if (i11 == 3) {
            return new zzqz();
        } else {
            if (i11 == 4) {
                return new zzqy((zzqr) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzrc zzi() {
        zzrc zzb2 = zzrc.zzb(this.zzd);
        if (zzb2 == null) {
            return zzrc.UNRECOGNIZED;
        }
        return zzb2;
    }
}
