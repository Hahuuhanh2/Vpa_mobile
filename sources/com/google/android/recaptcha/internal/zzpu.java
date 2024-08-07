package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzpu extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzpu zzb;
    private int zzd;
    private String zze = "";

    static {
        zzpu zzpu = new zzpu();
        zzb = zzpu;
        zzks.zzF(zzpu.class, zzpu);
    }

    private zzpu() {
    }

    public static zzpt zzf() {
        return (zzpt) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzpu zzpu, String str) {
        zzpu.zzd |= 1;
        zzpu.zze = str;
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzpu();
        } else {
            if (i11 == 4) {
                return new zzpt((zzpk) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
