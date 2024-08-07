package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzjk extends zzko {
    /* access modifiers changed from: private */
    public static final zzjk zzd;
    private int zze;
    private boolean zzf;
    private zzjs zzg;
    private boolean zzh;
    private zzkz zzi = zzmh.zze();
    private byte zzj = 2;

    static {
        zzjk zzjk = new zzjk();
        zzd = zzjk;
        zzks.zzF(zzjk.class, zzjk);
    }

    private zzjk() {
    }

    public static zzjk zzg() {
        return zzd;
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzj);
        }
        byte b10 = 1;
        if (i11 == 2) {
            return new zzmi(zzd, "\u0001\u0004\u0000\u0001\u0001ϧ\u0004\u0000\u0001\u0002\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002ϧЛ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzjw.class});
        } else if (i11 == 3) {
            return new zzjk();
        } else {
            if (i11 == 4) {
                return new zzjj((zzji) null);
            }
            if (i11 == 5) {
                return zzd;
            }
            if (obj == null) {
                b10 = 0;
            }
            this.zzj = b10;
            return null;
        }
    }
}
