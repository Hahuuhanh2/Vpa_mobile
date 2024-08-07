package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzro extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzro zzb;
    private int zzd;
    private String zze = "";
    private zzkx zzf = zzks.zzw();
    private zzky zzg = zzks.zzy();
    private zzqq zzh;

    static {
        zzro zzro = new zzro();
        zzb = zzro;
        zzks.zzF(zzro.class, zzro);
    }

    private zzro() {
    }

    public static zzro zzi(byte[] bArr) {
        return (zzro) zzks.zzv(zzb, bArr);
    }

    public final zzqq zzf() {
        zzqq zzqq = this.zzh;
        if (zzqq == null) {
            return zzqq.zzg();
        }
        return zzqq;
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002'\u0003%\u0004ဉ\u0000", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzro();
        } else {
            if (i11 == 4) {
                return new zzrn((zzqr) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final String zzj() {
        return this.zze;
    }

    public final List zzk() {
        return this.zzg;
    }
}
