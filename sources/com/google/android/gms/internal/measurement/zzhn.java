package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhl;
import com.google.android.gms.internal.measurement.zzhn;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
public abstract class zzhn<MessageType extends zzhl<MessageType, BuilderType>, BuilderType extends zzhn<MessageType, BuilderType>> implements zzku {
    /* renamed from: zza */
    public abstract BuilderType zzb(zzij zzij, zzis zzis);

    public BuilderType zza(byte[] bArr, int i10, int i11) {
        try {
            zzij zza = zzij.zza(bArr, 0, i11, false);
            zzb(zza, zzis.zza);
            zza.zzb(0);
            return this;
        } catch (zzjq e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("byte array"), e11);
        }
    }

    /* renamed from: zzae */
    public abstract BuilderType clone();

    public BuilderType zza(byte[] bArr, int i10, int i11, zzis zzis) {
        try {
            zzij zza = zzij.zza(bArr, 0, i11, false);
            zzb(zza, zzis);
            zza.zzb(0);
            return this;
        } catch (zzjq e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("byte array"), e11);
        }
    }

    public final /* synthetic */ zzku zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public final /* synthetic */ zzku zza(byte[] bArr, zzis zzis) {
        return zza(bArr, 0, bArr.length, zzis);
    }

    private final String zza(String str) {
        String name = getClass().getName();
        return "Reading " + name + " from a " + str + " threw an IOException (should never happen).";
    }
}
