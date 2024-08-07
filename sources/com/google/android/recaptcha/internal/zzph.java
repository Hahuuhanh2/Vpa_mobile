package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzph extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzph zzb;
    private zzkz zzd = zzks.zzz();

    static {
        zzph zzph = new zzph();
        zzb = zzph;
        zzks.zzF(zzph.class, zzph);
    }

    private zzph() {
    }

    public static zzph zzg() {
        return zzb;
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"zzd"});
        } else if (i11 == 3) {
            return new zzph();
        } else {
            if (i11 == 4) {
                return new zzpg((zzpf) null);
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
