package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzre extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzre zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzre zzre = new zzre();
        zzb = zzre;
        zzks.zzF(zzre.class, zzre);
    }

    private zzre() {
    }

    public static /* synthetic */ void zzJ(zzre zzre, zzop zzop) {
        zzop.getClass();
        zzre.zze = zzop;
        zzre.zzd = 1;
    }

    public static /* synthetic */ void zzK(zzre zzre, zzpe zzpe) {
        zzpe.getClass();
        zzre.zze = zzpe;
        zzre.zzd = 2;
    }

    public static zzrd zzi() {
        return (zzrd) zzb.zzp();
    }

    public static zzre zzk(byte[] bArr) {
        return (zzre) zzks.zzv(zzb, bArr);
    }

    public final int zzL() {
        int i10 = this.zzd;
        if (i10 == 0) {
            return 3;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                return 0;
            }
        }
        return i11;
    }

    public final zzop zzf() {
        if (this.zzd == 1) {
            return (zzop) this.zze;
        }
        return zzop.zzk();
    }

    public final zzpe zzg() {
        if (this.zzd == 2) {
            return (zzpe) this.zze;
        }
        return zzpe.zzg();
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzd", zzop.class, zzpe.class});
        } else if (i11 == 3) {
            return new zzre();
        } else {
            if (i11 == 4) {
                return new zzrd((zzqr) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
