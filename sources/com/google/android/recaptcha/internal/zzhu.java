package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzhu extends zzhk implements Serializable {
    private final MessageDigest zza;
    private final int zzb;
    private final boolean zzc;
    private final String zzd = "Hashing.sha256()";

    public zzhu(String str, String str2) {
        MessageDigest zzc2 = zzc("SHA-256");
        this.zza = zzc2;
        this.zzb = zzc2.getDigestLength();
        this.zzc = zzd(zzc2);
    }

    private static MessageDigest zzc(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    private static boolean zzd(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    public final String toString() {
        return this.zzd;
    }

    public final zzhp zzb() {
        if (this.zzc) {
            try {
                return new zzht((MessageDigest) this.zza.clone(), this.zzb, (zzhs) null);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new zzht(zzc(this.zza.getAlgorithm()), this.zzb, (zzhs) null);
    }
}
