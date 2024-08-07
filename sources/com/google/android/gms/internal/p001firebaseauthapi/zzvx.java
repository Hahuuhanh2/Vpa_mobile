package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzvx extends zzakk implements zzalq {
    /* access modifiers changed from: private */
    public static final zzvx zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzvx zzvx = new zzvx();
        zzb = zzvx;
        zzakk.zzH(zzvx.class, zzvx);
    }

    private zzvx() {
    }

    public static zzvw zzd() {
        return (zzvw) zzb.zzt();
    }

    public static zzvx zzf() {
        return zzb;
    }

    public final zzvn zza() {
        zzvn zzvn;
        int i10 = this.zzf;
        zzvn zzvn2 = zzvn.AEAD_UNKNOWN;
        if (i10 == 0) {
            zzvn = zzvn.AEAD_UNKNOWN;
        } else if (i10 == 1) {
            zzvn = zzvn.AES_128_GCM;
        } else if (i10 == 2) {
            zzvn = zzvn.AES_256_GCM;
        } else if (i10 != 3) {
            zzvn = null;
        } else {
            zzvn = zzvn.CHACHA20_POLY1305;
        }
        if (zzvn == null) {
            return zzvn.UNRECOGNIZED;
        }
        return zzvn;
    }

    public final zzvp zzb() {
        zzvp zzvp;
        int i10 = this.zze;
        zzvp zzvp2 = zzvp.KDF_UNKNOWN;
        if (i10 == 0) {
            zzvp = zzvp.KDF_UNKNOWN;
        } else if (i10 == 1) {
            zzvp = zzvp.HKDF_SHA256;
        } else if (i10 == 2) {
            zzvp = zzvp.HKDF_SHA384;
        } else if (i10 != 3) {
            zzvp = null;
        } else {
            zzvp = zzvp.HKDF_SHA512;
        }
        if (zzvp == null) {
            return zzvp.UNRECOGNIZED;
        }
        return zzvp;
    }

    public final zzvr zzc() {
        zzvr zzvr;
        int i10 = this.zzd;
        zzvr zzvr2 = zzvr.KEM_UNKNOWN;
        if (i10 == 0) {
            zzvr = zzvr.KEM_UNKNOWN;
        } else if (i10 == 1) {
            zzvr = zzvr.DHKEM_X25519_HKDF_SHA256;
        } else if (i10 == 2) {
            zzvr = zzvr.DHKEM_P256_HKDF_SHA256;
        } else if (i10 == 3) {
            zzvr = zzvr.DHKEM_P384_HKDF_SHA384;
        } else if (i10 != 4) {
            zzvr = null;
        } else {
            zzvr = zzvr.DHKEM_P521_HKDF_SHA512;
        }
        if (zzvr == null) {
            return zzvr.UNRECOGNIZED;
        }
        return zzvr;
    }

    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzvx();
        } else {
            if (i11 == 4) {
                return new zzvw((zzvv) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
