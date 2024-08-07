package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzp extends zzm implements Serializable {
    private final Pattern zza;

    public zzp(Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final zzl zza(CharSequence charSequence) {
        return new zzo(this.zza.matcher(charSequence));
    }
}
