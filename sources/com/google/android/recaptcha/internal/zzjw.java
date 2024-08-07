package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzjw extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzjw zzb;
    private int zzd;
    private zzkz zze = zzmh.zze();
    private String zzf = "";
    private long zzg;
    private long zzh;
    private double zzi;
    private zziv zzj = zziv.zzb;
    private String zzk = "";
    private byte zzl = 2;

    static {
        zzjw zzjw = new zzjw();
        zzb = zzjw;
        zzks.zzF(zzjw.class, zzjw);
    }

    private zzjw() {
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzl);
        }
        byte b10 = 1;
        if (i11 == 2) {
            return new zzmi(zzb, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"zzd", "zze", zzjv.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i11 == 3) {
            return new zzjw();
        } else {
            if (i11 == 4) {
                return new zzjt((zzji) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            if (obj == null) {
                b10 = 0;
            }
            this.zzl = b10;
            return null;
        }
    }
}
