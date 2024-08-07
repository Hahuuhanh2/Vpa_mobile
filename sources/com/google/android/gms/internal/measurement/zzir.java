package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
final class zzir implements zzne {
    private final zzio zza;

    private zzir(zzio zzio) {
        zzio zzio2 = (zzio) zzjh.zza(zzio, "output");
        this.zza = zzio2;
        zzio2.zza = this;
    }

    public static zzir zza(zzio zzio) {
        zzir zzir = zzio.zza;
        if (zzir != null) {
            return zzir;
        }
        return new zzir(zzio);
    }

    public final void zzb(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzio.zza(list.get(i13).doubleValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11).doubleValue());
            i11++;
        }
    }

    public final void zzc(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzio.zzd(list.get(i13).intValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzd(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzio.zze(list.get(i13).intValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zza(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zza(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zze(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzio.zzc(list.get(i13).longValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zza(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zza(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void zzf(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzio.zza(list.get(i13).floatValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11).floatValue());
            i11++;
        }
    }

    public final void zzg(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzio.zzf(list.get(i13).intValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzh(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzio.zzd(list.get(i13).longValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void zzi(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzio.zzg(list.get(i13).intValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zza(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zza(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzj(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzio.zze(list.get(i13).longValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zza(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zza(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void zzk(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzio.zzh(list.get(i13).intValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zzk(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzk(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzl(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzio.zzf(list.get(i13).longValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zzh(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void zzm(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzio.zzj(list.get(i13).intValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zzc(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzd(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzn(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzio.zzg(list.get(i13).longValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final int zza() {
        return zznh.zza;
    }

    public final void zza(int i10, boolean z10) {
        this.zza.zza(i10, z10);
    }

    public final void zza(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzio.zza(list.get(i13).booleanValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zza(i10, list.get(i11).booleanValue());
            i11++;
        }
    }

    public final void zzb(int i10, int i11) {
        this.zza.zza(i10, i11);
    }

    public final void zzd(int i10, int i11) {
        this.zza.zza(i10, i11);
    }

    public final void zze(int i10, int i11) {
        this.zza.zzk(i10, i11);
    }

    public final void zzf(int i10, int i11) {
        this.zza.zzd(i10, i11);
    }

    public final void zzb(int i10, long j10) {
        this.zza.zzb(i10, j10);
    }

    public final void zze(int i10, long j10) {
        this.zza.zzb(i10, j10);
    }

    public final void zzc(int i10, int i11) {
        this.zza.zzb(i10, i11);
    }

    public final void zzd(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    public final void zzb(int i10, Object obj, zzlj zzlj) {
        this.zza.zza(i10, (zzkr) obj, zzlj);
    }

    public final void zzc(int i10, long j10) {
        this.zza.zza(i10, j10);
    }

    public final void zza(int i10, zzhu zzhu) {
        this.zza.zza(i10, zzhu);
    }

    public final void zzb(int i10, List<?> list, zzlj zzlj) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzb(i10, (Object) list.get(i11), zzlj);
        }
    }

    public final void zza(int i10, List<zzhu> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zza(i10, list.get(i11));
        }
    }

    @Deprecated
    public final void zzb(int i10) {
        this.zza.zzc(i10, 3);
    }

    public final void zza(int i10, double d10) {
        this.zza.zzb(i10, d10);
    }

    public final void zzb(int i10, List<String> list) {
        int i11 = 0;
        if (list instanceof zzjx) {
            zzjx zzjx = (zzjx) list;
            while (i11 < list.size()) {
                Object zzb = zzjx.zzb(i11);
                if (zzb instanceof String) {
                    this.zza.zza(i10, (String) zzb);
                } else {
                    this.zza.zza(i10, (zzhu) zzb);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zza(i10, list.get(i11));
            i11++;
        }
    }

    @Deprecated
    public final void zza(int i10) {
        this.zza.zzc(i10, 4);
    }

    public final void zza(int i10, int i11) {
        this.zza.zzb(i10, i11);
    }

    public final void zza(int i10, long j10) {
        this.zza.zza(i10, j10);
    }

    public final void zza(int i10, float f10) {
        this.zza.zzb(i10, f10);
    }

    public final void zza(int i10, Object obj, zzlj zzlj) {
        zzio zzio = this.zza;
        zzio.zzc(i10, 3);
        zzlj.zza((zzkr) obj, (zzne) zzio.zza);
        zzio.zzc(i10, 4);
    }

    public final void zza(int i10, List<?> list, zzlj zzlj) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zza(i10, (Object) list.get(i11), zzlj);
        }
    }

    public final <K, V> void zza(int i10, zzkm<K, V> zzkm, Map<K, V> map) {
        for (Map.Entry next : map.entrySet()) {
            this.zza.zzc(i10, 2);
            this.zza.zzc(zzkj.zza(zzkm, next.getKey(), next.getValue()));
            zzkj.zza(this.zza, zzkm, next.getKey(), next.getValue());
        }
    }

    public final void zza(int i10, Object obj) {
        if (obj instanceof zzhu) {
            this.zza.zzb(i10, (zzhu) obj);
        } else {
            this.zza.zza(i10, (zzkr) obj);
        }
    }

    public final void zza(int i10, String str) {
        this.zza.zza(i10, str);
    }
}
