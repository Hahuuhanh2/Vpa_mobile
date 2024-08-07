package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.interfaces.ECPublicKey;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzyj implements zzbl {
    private final zzyl zza;
    private final String zzb;
    private final byte[] zzc;
    private final zzyh zzd;

    public zzyj(ECPublicKey eCPublicKey, byte[] bArr, String str, int i10, zzyh zzyh) {
        zzmq.zzf(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.zza = new zzyl(eCPublicKey);
        this.zzc = bArr;
        this.zzb = str;
        this.zzd = zzyh;
    }
}
