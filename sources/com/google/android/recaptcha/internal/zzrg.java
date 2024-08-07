package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzrg extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzrg zzb;
    private zzkz zzd = zzks.zzz();

    static {
        zzrg zzrg = new zzrg();
        zzb = zzrg;
        zzks.zzF(zzrg.class, zzrg);
    }

    private zzrg() {
    }

    public static zzrg zzg(byte[] bArr) {
        return (zzrg) zzks.zzv(zzb, bArr);
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzrs.class});
        } else if (i11 == 3) {
            return new zzrg();
        } else {
            if (i11 == 4) {
                return new zzrf((zzqr) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final List zzi() {
        return this.zzd;
    }
}
