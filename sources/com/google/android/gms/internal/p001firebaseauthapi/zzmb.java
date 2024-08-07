package com.google.android.gms.internal.p001firebaseauthapi;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzmb {
    public static final byte[] zza = zzd(1, 0);
    public static final byte[] zzb = zzd(1, 2);
    public static final byte[] zzc = zzd(2, 32);
    public static final byte[] zzd = zzd(2, 16);
    public static final byte[] zze = zzd(2, 17);
    public static final byte[] zzf = zzd(2, 18);
    public static final byte[] zzg = zzd(2, 1);
    public static final byte[] zzh = zzd(2, 2);
    public static final byte[] zzi = zzd(2, 3);
    public static final byte[] zzj = zzd(2, 1);
    public static final byte[] zzk = zzd(2, 2);
    public static final byte[] zzl = zzd(2, 3);
    public static final byte[] zzm = new byte[0];
    private static final byte[] zzn;
    private static final byte[] zzo;
    private static final byte[] zzp;

    static {
        Charset charset = zzpd.zza;
        zzn = "KEM".getBytes(charset);
        zzo = "HPKE".getBytes(charset);
        zzp = "HPKE-v1".getBytes(charset);
    }

    public static int zza(zzvr zzvr) {
        zzvr zzvr2 = zzvr.KEM_UNKNOWN;
        int ordinal = zzvr.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return 32;
        }
        if (ordinal == 3) {
            return 48;
        }
        if (ordinal == 4) {
            return 66;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static void zzb(zzvx zzvx) {
        if (zzvx.zzc() == zzvr.KEM_UNKNOWN || zzvx.zzc() == zzvr.UNRECOGNIZED) {
            throw new GeneralSecurityException("Invalid KEM param: ".concat(String.valueOf(zzvx.zzc().name())));
        } else if (zzvx.zzb() == zzvp.KDF_UNKNOWN || zzvx.zzb() == zzvp.UNRECOGNIZED) {
            throw new GeneralSecurityException("Invalid KDF param: ".concat(String.valueOf(zzvx.zzb().name())));
        } else if (zzvx.zza() == zzvn.AEAD_UNKNOWN || zzvx.zza() == zzvn.UNRECOGNIZED) {
            throw new GeneralSecurityException("Invalid AEAD param: ".concat(String.valueOf(zzvx.zza().name())));
        }
    }

    public static byte[] zzc(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return zzyf.zzb(zzo, bArr, bArr2, bArr3);
    }

    public static byte[] zzd(int i10, int i11) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) ((i11 >> (((i10 - i12) - 1) * 8)) & 255);
        }
        return bArr;
    }

    public static byte[] zze(byte[] bArr) {
        return zzyf.zzb(zzn, bArr);
    }

    public static byte[] zzf(String str, byte[] bArr, byte[] bArr2) {
        return zzyf.zzb(zzp, bArr2, str.getBytes(zzpd.zza), bArr);
    }

    public static byte[] zzg(String str, byte[] bArr, byte[] bArr2, int i10) {
        return zzyf.zzb(zzd(2, i10), zzp, bArr2, str.getBytes(zzpd.zza), bArr);
    }

    public static int zzh(zzvr zzvr) {
        zzvr zzvr2 = zzvr.KEM_UNKNOWN;
        int ordinal = zzvr.ordinal();
        if (ordinal == 2) {
            return 1;
        }
        if (ordinal == 3) {
            return 2;
        }
        if (ordinal == 4) {
            return 3;
        }
        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
    }
}
