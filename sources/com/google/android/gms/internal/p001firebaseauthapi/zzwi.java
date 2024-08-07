package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwi  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzwi extends zzakk implements zzalq {
    /* access modifiers changed from: private */
    public static final zzwi zzb;
    private String zzd = "";
    private zzajf zze = zzajf.zzb;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzwi zzwi = new zzwi();
        zzb = zzwi;
        zzakk.zzH(zzwi.class, zzwi);
    }

    private zzwi() {
    }

    public static zzwf zza() {
        return (zzwf) zzb.zzt();
    }

    public static zzwi zzd() {
        return zzb;
    }

    public static /* synthetic */ void zzg(zzwi zzwi, String str) {
        str.getClass();
        zzwi.zzd = str;
    }

    public static /* synthetic */ void zzh(zzwi zzwi, zzajf zzajf) {
        zzajf.getClass();
        zzwi.zze = zzajf;
    }

    public final zzwh zzb() {
        zzwh zzwh;
        int i10 = this.zzf;
        zzwh zzwh2 = zzwh.UNKNOWN_KEYMATERIAL;
        if (i10 == 0) {
            zzwh = zzwh.UNKNOWN_KEYMATERIAL;
        } else if (i10 == 1) {
            zzwh = zzwh.SYMMETRIC;
        } else if (i10 == 2) {
            zzwh = zzwh.ASYMMETRIC_PRIVATE;
        } else if (i10 == 3) {
            zzwh = zzwh.ASYMMETRIC_PUBLIC;
        } else if (i10 != 4) {
            zzwh = null;
        } else {
            zzwh = zzwh.REMOTE;
        }
        if (zzwh == null) {
            return zzwh.UNRECOGNIZED;
        }
        return zzwh;
    }

    public final zzajf zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzd;
    }

    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzwi();
        } else {
            if (i11 == 4) {
                return new zzwf((zzwe) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
