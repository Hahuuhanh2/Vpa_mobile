package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzrm extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzrm zzb;
    private zzkz zzd = zzks.zzz();
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzrm zzrm = new zzrm();
        zzb = zzrm;
        zzks.zzF(zzrm.class, zzrm);
    }

    private zzrm() {
    }

    private final void zzJ() {
        zzkz zzkz = this.zzd;
        if (!zzkz.zzc()) {
            this.zzd = zzks.zzA(zzkz);
        }
    }

    public static zzrj zzf() {
        return (zzrj) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzrm zzrm, zzrl zzrl) {
        zzrl.getClass();
        zzrm.zzJ();
        zzrm.zzd.add(zzrl);
    }

    public static /* synthetic */ void zzj(zzrm zzrm, Iterable iterable) {
        zzrm.zzJ();
        zzig.zzc(iterable, zzrm.zzd);
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u000b", new Object[]{"zzd", zzrl.class, "zze"});
        } else if (i11 == 3) {
            return new zzrm();
        } else {
            if (i11 == 4) {
                return new zzrj((zzqr) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
