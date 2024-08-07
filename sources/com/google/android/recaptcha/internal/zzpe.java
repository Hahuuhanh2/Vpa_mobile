package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzpe extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzpe zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private zzka zzi;
    private zzmz zzj;
    private int zzk;
    private zzom zzl;
    private zzkz zzm = zzks.zzz();

    static {
        zzpe zzpe = new zzpe();
        zzb = zzpe;
        zzks.zzF(zzpe.class, zzpe);
    }

    private zzpe() {
    }

    public static zzpe zzg() {
        return zzb;
    }

    public static zzpe zzi(byte[] bArr) {
        return (zzpe) zzks.zzv(zzb, bArr);
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0000\u0001\u0004\u0003ဉ\u0000\u0004ဉ\u0001\u0005\f\u0007\u001b\b\f\tȈ\nȈ\u000bဉ\u0002", new Object[]{"zzd", "zze", "zzi", "zzj", "zzk", "zzm", zzov.class, "zzf", "zzg", "zzh", "zzl"});
        } else if (i11 == 3) {
            return new zzpe();
        } else {
            if (i11 == 4) {
                return new zzpd((zzpc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
