package com.google.android.gms.internal.p001firebaseauthapi;

import android.support.v4.media.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzib  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
abstract class zzib {
    public int[] zza;
    private final int zzb;

    public zzib(byte[] bArr, int i10) {
        if (bArr.length == 32) {
            this.zza = zzhx.zzd(bArr);
            this.zzb = i10;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public abstract int zza();

    public abstract int[] zzb(int[] iArr, int i10);

    public final ByteBuffer zzc(byte[] bArr, int i10) {
        int[] zzb2 = zzb(zzhx.zzd(bArr), i10);
        int[] iArr = (int[]) zzb2.clone();
        zzhx.zzc(iArr);
        for (int i11 = 0; i11 < 16; i11++) {
            zzb2[i11] = zzb2[i11] + iArr[i11];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zzb2, 0, 16);
        return order;
    }

    public final byte[] zzd(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length == zza()) {
            int remaining = byteBuffer.remaining();
            int i10 = remaining / 64;
            int i11 = 0;
            while (true) {
                int i12 = i10 + 1;
                if (i11 >= i12) {
                    return allocate.array();
                }
                ByteBuffer zzc = zzc(bArr, this.zzb + i11);
                if (i11 == i12 - 1) {
                    zzyf.zza(allocate, byteBuffer, zzc, remaining % 64);
                } else {
                    zzyf.zza(allocate, byteBuffer, zzc, 64);
                }
                i11++;
            }
        } else {
            throw new GeneralSecurityException(a.m("The nonce length (in bytes) must be ", zza()));
        }
    }
}
