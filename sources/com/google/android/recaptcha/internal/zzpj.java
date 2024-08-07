package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzpj extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzpj zzb;
    private int zzd;
    private zzph zze;
    private zzph zzf;

    static {
        zzpj zzpj = new zzpj();
        zzb = zzpj;
        zzks.zzF(zzpj.class, zzpj);
    }

    private zzpj() {
    }

    public static zzpj zzj(byte[] bArr) {
        return (zzpj) zzks.zzv(zzb, bArr);
    }

    public final zzph zzf() {
        zzph zzph = this.zze;
        if (zzph == null) {
            return zzph.zzg();
        }
        return zzph;
    }

    public final zzph zzg() {
        zzph zzph = this.zzf;
        if (zzph == null) {
            return zzph.zzg();
        }
        return zzph;
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzpj();
        } else {
            if (i11 == 4) {
                return new zzpi((zzpf) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
