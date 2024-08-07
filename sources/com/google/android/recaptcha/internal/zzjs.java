package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzjs extends zzko {
    /* access modifiers changed from: private */
    public static final zzjs zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private byte zzl = 2;

    static {
        zzjs zzjs = new zzjs();
        zzd = zzjs;
        zzks.zzF(zzjs.class, zzjs);
    }

    private zzjs() {
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzl);
        }
        byte b10 = 1;
        if (i11 == 2) {
            return new zzmi(zzd, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"zze", "zzf", zzjn.zza, "zzg", zzjm.zza, "zzh", zzjq.zza, "zzi", zzjr.zza, "zzj", zzjp.zza, "zzk", zzjo.zza});
        } else if (i11 == 3) {
            return new zzjs();
        } else {
            if (i11 == 4) {
                return new zzjl((zzji) null);
            }
            if (i11 == 5) {
                return zzd;
            }
            if (obj == null) {
                b10 = 0;
            }
            this.zzl = b10;
            return null;
        }
    }
}
