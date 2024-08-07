package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
final class zzkk implements zzks {
    private zzks[] zza;

    public zzkk(zzks... zzksArr) {
        this.zza = zzksArr;
    }

    public final zzkp zza(Class<?> cls) {
        for (zzks zzks : this.zza) {
            if (zzks.zzb(cls)) {
                return zzks.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    public final boolean zzb(Class<?> cls) {
        for (zzks zzb : this.zza) {
            if (zzb.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
