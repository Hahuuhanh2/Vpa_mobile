package com.google.android.gms.internal.p001firebaseauthapi;

import android.support.v4.media.a;
import f0.b0;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkg  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzkg extends zzli {
    private final zzjx zza;
    private final ECPoint zzb;
    private final zzzo zzc;
    private final zzzo zzd;
    private final Integer zze;

    private zzkg(zzjx zzjx, ECPoint eCPoint, zzzo zzzo, zzzo zzzo2, Integer num) {
        this.zza = zzjx;
        this.zzb = eCPoint;
        this.zzc = zzzo;
        this.zzd = zzzo2;
        this.zze = num;
    }

    public static zzkg zzb(zzjx zzjx, zzzo zzzo, Integer num) {
        if (zzjx.zzc().equals(zzjs.zzd)) {
            zzg(zzjx.zzf(), num);
            if (zzzo.zza() == 32) {
                return new zzkg(zzjx, (ECPoint) null, zzzo, zzf(zzjx.zzf(), num), num);
            }
            throw new GeneralSecurityException("Encoded public point byte length for X25519 curve must be 32");
        }
        throw new GeneralSecurityException("createForCurveX25519 may only be called with parameters for curve X25519");
    }

    public static zzkg zzc(zzjx zzjx, ECPoint eCPoint, Integer num) {
        EllipticCurve ellipticCurve;
        if (!zzjx.zzc().equals(zzjs.zzd)) {
            zzg(zzjx.zzf(), num);
            zzjs zzc2 = zzjx.zzc();
            if (zzc2 == zzjs.zza) {
                ellipticCurve = zzmq.zza.getCurve();
            } else if (zzc2 == zzjs.zzb) {
                ellipticCurve = zzmq.zzb.getCurve();
            } else if (zzc2 == zzjs.zzc) {
                ellipticCurve = zzmq.zzc.getCurve();
            } else {
                throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(zzc2)));
            }
            zzmq.zzf(eCPoint, ellipticCurve);
            return new zzkg(zzjx, eCPoint, (zzzo) null, zzf(zzjx.zzf(), num), num);
        }
        throw new GeneralSecurityException("createForNistCurve may only be called with parameters for NIST curve");
    }

    private static zzzo zzf(zzjv zzjv, Integer num) {
        if (zzjv == zzjv.zzc) {
            return zzzo.zzb(new byte[0]);
        }
        if (num == null) {
            throw new IllegalStateException("idRequirement must be non-null for EciesParameters.Variant: ".concat(String.valueOf(zzjv)));
        } else if (zzjv == zzjv.zzb) {
            return a.f(num, ByteBuffer.allocate(5).put((byte) 0));
        } else {
            if (zzjv == zzjv.zza) {
                return a.f(num, ByteBuffer.allocate(5).put((byte) 1));
            }
            throw new IllegalStateException("Unknown EciesParameters.Variant: ".concat(String.valueOf(zzjv)));
        }
    }

    private static void zzg(zzjv zzjv, Integer num) {
        zzjv zzjv2 = zzjv.zzc;
        if (!zzjv.equals(zzjv2) && num == null) {
            throw new GeneralSecurityException(b0.s("'idRequirement' must be non-null for ", String.valueOf(zzjv), " variant."));
        } else if (zzjv.equals(zzjv2) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }

    public final zzjx zza() {
        return this.zza;
    }

    public final zzzo zzd() {
        return this.zzc;
    }

    public final ECPoint zze() {
        return this.zzb;
    }
}
