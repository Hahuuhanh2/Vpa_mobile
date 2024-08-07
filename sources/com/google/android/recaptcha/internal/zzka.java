package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzka extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzka zzb;
    /* access modifiers changed from: private */
    public long zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzka zzka = new zzka();
        zzb = zzka;
        zzks.zzF(zzka.class, zzka);
    }

    private zzka() {
    }

    public static zzjz zzi() {
        return (zzjz) zzb.zzp();
    }

    public final int zzf() {
        return this.zze;
    }

    public final long zzg() {
        return this.zzd;
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new zzmi(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzka();
        } else {
            if (i11 == 4) {
                return new zzjz((zzjy) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
