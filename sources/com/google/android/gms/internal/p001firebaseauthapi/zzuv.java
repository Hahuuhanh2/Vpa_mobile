package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzuv extends zzakk implements zzalq {
    /* access modifiers changed from: private */
    public static final zzuv zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzajf zzf = zzajf.zzb;

    static {
        zzuv zzuv = new zzuv();
        zzb = zzuv;
        zzakk.zzH(zzuv.class, zzuv);
    }

    private zzuv() {
    }

    public static zzuu zza() {
        return (zzuu) zzb.zzt();
    }

    public static zzuv zzc() {
        return zzb;
    }

    public final zzux zzd() {
        zzux zzux;
        int i10 = this.zzd;
        zzux zzux2 = zzux.UNKNOWN_CURVE;
        if (i10 == 0) {
            zzux = zzux.UNKNOWN_CURVE;
        } else if (i10 == 2) {
            zzux = zzux.NIST_P256;
        } else if (i10 == 3) {
            zzux = zzux.NIST_P384;
        } else if (i10 == 4) {
            zzux = zzux.NIST_P521;
        } else if (i10 != 5) {
            zzux = null;
        } else {
            zzux = zzux.CURVE25519;
        }
        if (zzux == null) {
            return zzux.UNRECOGNIZED;
        }
        return zzux;
    }

    public final zzvc zze() {
        zzvc zzb2 = zzvc.zzb(this.zze);
        if (zzb2 == null) {
            return zzvc.UNRECOGNIZED;
        }
        return zzb2;
    }

    public final zzajf zzf() {
        return this.zzf;
    }

    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzuv();
        } else {
            if (i11 == 4) {
                return new zzuu((zzut) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
