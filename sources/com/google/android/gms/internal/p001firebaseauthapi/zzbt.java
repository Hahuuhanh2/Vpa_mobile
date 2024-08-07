package com.google.android.gms.internal.p001firebaseauthapi;

import android.support.v4.media.a;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbt  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzbt {
    private static final Logger zza = Logger.getLogger(zzbt.class.getName());
    private final ConcurrentMap zzb;

    public zzbt() {
        this.zzb = new ConcurrentHashMap();
    }

    private final synchronized zzbs zzf(String str) {
        if (this.zzb.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzbs) this.zzb.get(str);
    }

    private final synchronized void zzg(zzbs zzbs, boolean z10) {
        String zzc = zzbs.zzb().zzc();
        zzbs zzbs2 = (zzbs) this.zzb.get(zzc);
        if (zzbs2 != null) {
            if (!zzbs2.zzc().equals(zzbs.zzc())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(zzc));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{zzc, zzbs2.zzc().getName(), zzbs.zzc().getName()}));
            }
        }
        if (!z10) {
            this.zzb.putIfAbsent(zzc, zzbs);
        } else {
            this.zzb.put(zzc, zzbs);
        }
    }

    public final zzbo zza(String str, Class cls) {
        zzbs zzf = zzf(str);
        if (zzf.zze().contains(cls)) {
            return zzf.zza(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzf.zzc());
        Set<Class> zze = zzf.zze();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Class cls2 : zze) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(cls2.getCanonicalName());
            z10 = false;
        }
        String sb3 = sb2.toString();
        StringBuilder r10 = a.r("Primitive type ", name, " not supported by key manager of type ", valueOf, ", supported primitives: ");
        r10.append(sb3);
        throw new GeneralSecurityException(r10.toString());
    }

    public final zzbo zzb(String str) {
        return zzf(str).zzb();
    }

    public final synchronized void zzc(zzon zzon, zzng zzng) {
        Class zzd;
        if (!zzij.zza(1)) {
            String valueOf = String.valueOf(zzon.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        } else if (zzij.zza(zzng.zzf())) {
            String zzd2 = zzon.zzd();
            String zzd3 = zzng.zzd();
            if (!(!this.zzb.containsKey(zzd2) || ((zzbs) this.zzb.get(zzd2)).zzd() == null || (zzd = ((zzbs) this.zzb.get(zzd2)).zzd()) == null)) {
                if (!zzd.getName().equals(zzng.getClass().getName())) {
                    Logger logger = zza;
                    Level level = Level.WARNING;
                    logger.logp(level, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + zzd2 + " with inconsistent public key type " + zzd3);
                    throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{zzon.getClass().getName(), zzd.getName(), zzng.getClass().getName()}));
                }
            }
            zzg(new zzbr(zzon, zzng), true);
            zzg(new zzbq(zzng), false);
        } else {
            String valueOf2 = String.valueOf(zzng.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf2 + " as it is not FIPS compatible.");
        }
    }

    public final synchronized void zzd(zzng zzng) {
        if (zzij.zza(zzng.zzf())) {
            zzg(new zzbq(zzng), false);
        } else {
            String valueOf = String.valueOf(zzng.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        }
    }

    public final boolean zze(String str) {
        return this.zzb.containsKey(str);
    }

    public zzbt(zzbt zzbt) {
        this.zzb = new ConcurrentHashMap(zzbt.zzb);
    }
}
