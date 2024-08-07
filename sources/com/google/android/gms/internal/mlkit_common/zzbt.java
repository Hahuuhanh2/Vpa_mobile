package com.google.android.gms.internal.mlkit_common;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import sa.c;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final class zzbt {
    private final Map zza;
    private final Map zzb;
    private final c zzc;

    public zzbt(Map map, Map map2, c cVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = cVar;
    }

    public final byte[] zza(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzbq(byteArrayOutputStream, this.zza, this.zzb, this.zzc).zzf(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
