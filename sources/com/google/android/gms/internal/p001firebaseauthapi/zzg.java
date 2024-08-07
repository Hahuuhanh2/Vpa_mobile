package com.google.android.gms.internal.p001firebaseauthapi;

import f0.b0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzg  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzg extends zzf {
    private final char zza;

    public zzg(char c10) {
        this.zza = c10;
    }

    public final String toString() {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i10 = this.zza;
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        return b0.s("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    public final boolean zza(char c10) {
        return c10 == this.zza;
    }
}
