package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzoa extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzoa zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private String zze = "";
    /* access modifiers changed from: private */
    public String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzkx zzj = zzks.zzw();

    static {
        zzoa zzoa = new zzoa();
        zzb = zzoa;
        zzks.zzF(zzoa.class, zzoa);
    }

    private zzoa() {
    }

    public static /* synthetic */ void zzJ(zzoa zzoa, Iterable iterable) {
        zzkx zzkx = zzoa.zzj;
        if (!zzkx.zzc()) {
            zzoa.zzj = zzks.zzx(zzkx);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzoa.zzj.zzh(((zznz) it.next()).zza());
        }
    }

    public static /* synthetic */ void zzK(zzoa zzoa, String str) {
        str.getClass();
        zzoa.zze = str;
    }

    public static /* synthetic */ void zzM(zzoa zzoa, String str) {
        str.getClass();
        zzoa.zzg = str;
    }

    public static zzny zzf() {
        return (zzny) zzb.zzp();
    }

    public static /* synthetic */ void zzj(zzoa zzoa, String str) {
        str.getClass();
        zzoa.zzh = str;
    }

    public static /* synthetic */ void zzk(zzoa zzoa, String str) {
        str.getClass();
        zzoa.zzi = str;
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007,", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i11 == 3) {
            return new zzoa();
        } else {
            if (i11 == 4) {
                return new zzny((zznx) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
