package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
final class zzhw implements Comparator<zzhu> {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzhu zzhu = (zzhu) obj;
        zzhu zzhu2 = (zzhu) obj2;
        zzia zzia = (zzia) zzhu.iterator();
        zzia zzia2 = (zzia) zzhu2.iterator();
        while (zzia.hasNext() && zzia2.hasNext()) {
            int compareTo = Integer.valueOf(zzhu.zza(zzia.zza())).compareTo(Integer.valueOf(zzhu.zza(zzia2.zza())));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzhu.zzb()).compareTo(Integer.valueOf(zzhu2.zzb()));
    }
}
