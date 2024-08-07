package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzpb extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzpb zzb;
    private int zzd;
    private String zze = "";
    private zzog zzf;
    private zzoa zzg;
    private zzoj zzh;
    private String zzi = "";
    private String zzj = "";

    static {
        zzpb zzpb = new zzpb();
        zzb = zzpb;
        zzks.zzF(zzpb.class, zzpb);
    }

    private zzpb() {
    }

    public static /* synthetic */ void zzJ(zzpb zzpb, zzoa zzoa) {
        zzoa.getClass();
        zzpb.zzg = zzoa;
        zzpb.zzd |= 2;
    }

    public static zzpa zzf() {
        return (zzpa) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzpb zzpb, String str) {
        str.getClass();
        zzpb.zze = str;
    }

    public static /* synthetic */ void zzj(zzpb zzpb, String str) {
        str.getClass();
        zzpb.zzi = str;
    }

    public static /* synthetic */ void zzk(zzpb zzpb, String str) {
        str.getClass();
        zzpb.zzj = str;
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005Ȉ\u0006Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i11 == 3) {
            return new zzpb();
        } else {
            if (i11 == 4) {
                return new zzpa((zzoz) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
