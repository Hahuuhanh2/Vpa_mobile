package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzrl extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzrl zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzrl zzrl = new zzrl();
        zzb = zzrl;
        zzks.zzF(zzrl.class, zzrl);
    }

    private zzrl() {
    }

    public static /* synthetic */ void zzJ(zzrl zzrl, double d10) {
        zzrl.zzd = 10;
        zzrl.zze = Double.valueOf(d10);
    }

    public static /* synthetic */ void zzK(zzrl zzrl, String str) {
        str.getClass();
        zzrl.zzd = 11;
        zzrl.zze = str;
    }

    public static /* synthetic */ void zzL(zzrl zzrl, boolean z10) {
        zzrl.zzd = 1;
        zzrl.zze = Boolean.valueOf(z10);
    }

    public static /* synthetic */ void zzM(zzrl zzrl, zziv zziv) {
        zzrl.zzd = 2;
        zzrl.zze = zziv;
    }

    public static /* synthetic */ void zzN(zzrl zzrl, String str) {
        str.getClass();
        zzrl.zzd = 3;
        zzrl.zze = str;
    }

    public static /* synthetic */ void zzO(zzrl zzrl, int i10) {
        zzrl.zzd = 4;
        zzrl.zze = Integer.valueOf(i10);
    }

    public static zzrk zzf() {
        return (zzrk) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzrl zzrl, int i10) {
        zzrl.zzd = 5;
        zzrl.zze = Integer.valueOf(i10);
    }

    public static /* synthetic */ void zzj(zzrl zzrl, long j10) {
        zzrl.zzd = 7;
        zzrl.zze = Long.valueOf(j10);
    }

    public static /* synthetic */ void zzk(zzrl zzrl, float f10) {
        zzrl.zzd = 9;
        zzrl.zze = Float.valueOf(f10);
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001:\u0000\u0002=\u0000\u0003Ȼ\u0000\u0004B\u0000\u0005B\u0000\u0006>\u0000\u0007C\u0000\b6\u0000\t4\u0000\n3\u0000\u000bȻ\u0000", new Object[]{"zze", "zzd"});
        } else if (i11 == 3) {
            return new zzrl();
        } else {
            if (i11 == 4) {
                return new zzrk((zzqr) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
