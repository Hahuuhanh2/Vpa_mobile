package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.HashMap;
import java.util.Map;
import sa.c;
import sa.e;
import ta.b;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzdo implements b {
    public static final /* synthetic */ int zza = 0;
    private static final c zzb = zzdn.zza;
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final c zze = zzb;

    public final /* bridge */ /* synthetic */ b registerEncoder(Class cls, c cVar) {
        this.zzc.put(cls, cVar);
        this.zzd.remove(cls);
        return this;
    }

    public final zzdp zza() {
        return new zzdp(new HashMap(this.zzc), new HashMap(this.zzd), this.zze);
    }

    public final /* bridge */ /* synthetic */ b registerEncoder(Class cls, e eVar) {
        this.zzd.put(cls, eVar);
        this.zzc.remove(cls);
        return this;
    }
}
