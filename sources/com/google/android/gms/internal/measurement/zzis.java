package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjf;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
public class zzis {
    public static final zzis zza = new zzis(true);
    private static volatile boolean zzb = false;
    private static boolean zzc = true;
    private static volatile zzis zzd;
    private final Map<zza, zzjf.zzf<?, ?>> zze;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    public static final class zza {
        private final Object zza;
        private final int zzb;

        public zza(Object obj, int i10) {
            this.zza = obj;
            this.zzb = i10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza2 = (zza) obj;
            if (this.zza == zza2.zza && this.zzb == zza2.zzb) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.zza) * 65535) + this.zzb;
        }
    }

    public zzis() {
        this.zze = new HashMap();
    }

    public static zzis zza() {
        Class<zzis> cls = zzis.class;
        zzis zzis = zzd;
        if (zzis != null) {
            return zzis;
        }
        synchronized (cls) {
            zzis zzis2 = zzd;
            if (zzis2 != null) {
                return zzis2;
            }
            zzis zza2 = zzjd.zza(cls);
            zzd = zza2;
            return zza2;
        }
    }

    private zzis(boolean z10) {
        this.zze = Collections.emptyMap();
    }

    public final <ContainingType extends zzkr> zzjf.zzf<ContainingType, ?> zza(ContainingType containingtype, int i10) {
        return this.zze.get(new zza(containingtype, i10));
    }
}
