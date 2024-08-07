package com.google.android.recaptcha.internal;

import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzht extends zzhj {
    private final MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    public /* synthetic */ zzht(MessageDigest messageDigest, int i10, zzhs zzhs) {
        this.zza = messageDigest;
        this.zzb = i10;
    }

    private final void zzc() {
        zzgx.zze(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    public final void zza(byte[] bArr, int i10, int i11) {
        zzc();
        this.zza.update(bArr, 0, i11);
    }

    public final zzhn zzb() {
        zzc();
        this.zzc = true;
        int i10 = this.zzb;
        if (i10 == this.zza.getDigestLength()) {
            byte[] digest = this.zza.digest();
            int i11 = zzhn.zzb;
            return new zzhm(digest);
        }
        byte[] copyOf = Arrays.copyOf(this.zza.digest(), i10);
        int i12 = zzhn.zzb;
        return new zzhm(copyOf);
    }
}
