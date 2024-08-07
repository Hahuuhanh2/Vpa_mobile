package com.google.android.recaptcha.internal;

import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzqf extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzqf zzb;
    private int zzd;
    private String zze = "";
    private long zzf;
    private int zzg;
    private zzkz zzh = zzks.zzz();
    private zziv zzi = zziv.zzb;
    private String zzj = "";
    private String zzk = "";

    static {
        zzqf zzqf = new zzqf();
        zzb = zzqf;
        zzks.zzF(zzqf.class, zzqf);
    }

    private zzqf() {
    }

    public static zzqf zzi(InputStream inputStream) {
        return (zzqf) zzks.zzu(zzb, inputStream);
    }

    public final zziv zzf() {
        return this.zzi;
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0004ဌ\u0002\u0005\u001b\u0006ည\u0003\u0007ለ\u0004\bለ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzqh.class, "zzi", "zzj", "zzk"});
        } else if (i11 == 3) {
            return new zzqf();
        } else {
            if (i11 == 4) {
                return new zzqe((zzqb) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final String zzj() {
        return this.zze;
    }

    public final List zzk() {
        return this.zzh;
    }
}
