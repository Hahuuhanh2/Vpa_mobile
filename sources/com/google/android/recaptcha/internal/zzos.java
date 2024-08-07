package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzos extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzos zzb;
    private zzkz zzd = zzks.zzz();
    private zzkz zze = zzks.zzz();

    static {
        zzos zzos = new zzos();
        zzb = zzos;
        zzks.zzF(zzos.class, zzos);
    }

    private zzos() {
    }

    public static /* synthetic */ void zzK(zzos zzos, zzop zzop) {
        zzop.getClass();
        zzkz zzkz = zzos.zzd;
        if (!zzkz.zzc()) {
            zzos.zzd = zzks.zzA(zzkz);
        }
        zzos.zzd.add(zzop);
    }

    public static /* synthetic */ void zzL(zzos zzos, zzpe zzpe) {
        zzpe.getClass();
        zzkz zzkz = zzos.zze;
        if (!zzkz.zzc()) {
            zzos.zze = zzks.zzA(zzkz);
        }
        zzos.zze.add(zzpe);
    }

    public static zzor zzi() {
        return (zzor) zzb.zzp();
    }

    public static zzos zzk(byte[] bArr) {
        return (zzos) zzks.zzv(zzb, bArr);
    }

    public final List zzJ() {
        return this.zzd;
    }

    public final int zzf() {
        return this.zzd.size();
    }

    public final int zzg() {
        return this.zze.size();
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zzd", zzop.class, "zze", zzpe.class});
        } else if (i11 == 3) {
            return new zzos();
        } else {
            if (i11 == 4) {
                return new zzor((zzoq) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
