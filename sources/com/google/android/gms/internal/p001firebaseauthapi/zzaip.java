package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzaio;
import com.google.android.gms.internal.p001firebaseauthapi.zzaip;
import f0.b0;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaip  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public abstract class zzaip<MessageType extends zzaip<MessageType, BuilderType>, BuilderType extends zzaio<MessageType, BuilderType>> implements zzalp {
    public int zza = 0;

    public int zzn(zzamb zzamb) {
        throw null;
    }

    public final zzajf zzo() {
        try {
            int zzs = zzs();
            zzajf zzajf = zzajf.zzb;
            byte[] bArr = new byte[zzs];
            zzajs zzC = zzajs.zzC(bArr, 0, zzs);
            zzJ(zzC);
            zzC.zzD();
            return new zzajc(bArr);
        } catch (IOException e10) {
            throw new RuntimeException(b0.s("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    public final void zzp(OutputStream outputStream) {
        int zzs = zzs();
        int i10 = zzajs.zzf;
        if (zzs > 4096) {
            zzs = 4096;
        }
        zzajq zzajq = new zzajq(outputStream, zzs);
        zzJ(zzajq);
        zzajq.zzI();
    }

    public final byte[] zzq() {
        try {
            int zzs = zzs();
            byte[] bArr = new byte[zzs];
            zzajs zzC = zzajs.zzC(bArr, 0, zzs);
            zzJ(zzC);
            zzC.zzD();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(b0.s("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }
}
