package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
final class zzll {
    private static final Class<?> zza = zzd();
    private static final zzmi<?, ?> zzb = zzc();
    private static final zzmi<?, ?> zzc = new zzmk();

    public static int zza(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzio.zzb(i10, true) * size;
    }

    public static int zzb(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzio.zzi(i10) * size) + zzb(list);
    }

    public static int zzc(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzio.zzf(i10, 0) * size;
    }

    public static int zzd(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzio.zzc(i10, 0) * size;
    }

    public static int zze(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzio.zzi(i10) * size) + zze(list);
    }

    public static int zzf(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzio.zzi(i10) * list.size()) + zzf(list);
    }

    public static int zzg(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzio.zzi(i10) * size) + zzg(list);
    }

    public static int zzh(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzio.zzi(i10) * size) + zzh(list);
    }

    public static int zzi(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzio.zzi(i10) * size) + zzi(list);
    }

    public static int zzj(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzio.zzi(i10) * size) + zzj(list);
    }

    public static void zzk(int i10, List<Integer> list, zzne zzne, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzne.zzk(i10, list, z10);
        }
    }

    public static void zzl(int i10, List<Long> list, zzne zzne, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzne.zzl(i10, list, z10);
        }
    }

    public static void zzm(int i10, List<Integer> list, zzne zzne, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzne.zzm(i10, list, z10);
        }
    }

    public static void zzn(int i10, List<Long> list, zzne zzne, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzne.zzn(i10, list, z10);
        }
    }

    public static int zza(List<?> list) {
        return list.size();
    }

    public static int zzc(List<?> list) {
        return list.size() << 2;
    }

    public static int zzd(List<?> list) {
        return list.size() << 3;
    }

    public static int zza(int i10, List<zzhu> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = zzio.zzi(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzi += zzio.zzb(list.get(i11));
        }
        return zzi;
    }

    public static int zzb(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzji) {
            zzji zzji = (zzji) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzio.zzd(zzji.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzio.zzd(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    private static zzmi<?, ?> zzc() {
        try {
            Class<?> zze = zze();
            if (zze == null) {
                return null;
            }
            return (zzmi) zze.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzd() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int zze(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzji) {
            zzji zzji = (zzji) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzio.zzf(zzji.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzio.zzf(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzf(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkg) {
            zzkg zzkg = (zzkg) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzio.zzd(zzkg.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzio.zzd(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzg(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzji) {
            zzji zzji = (zzji) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzio.zzh(zzji.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzio.zzh(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzh(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkg) {
            zzkg zzkg = (zzkg) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzio.zzf(zzkg.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzio.zzf(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzi(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzji) {
            zzji zzji = (zzji) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzio.zzj(zzji.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzio.zzj(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzj(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkg) {
            zzkg zzkg = (zzkg) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzio.zzg(zzkg.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzio.zzg(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzd(int i10, List<Integer> list, zzne zzne, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzne.zzd(i10, list, z10);
        }
    }

    public static void zzc(int i10, List<Integer> list, zzne zzne, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzne.zzc(i10, list, z10);
        }
    }

    public static int zza(int i10, List<zzkr> list, zzlj zzlj) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += zzio.zzb(i10, list.get(i12), zzlj);
        }
        return i11;
    }

    public static int zzb(int i10, List<?> list, zzlj zzlj) {
        int i11;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = zzio.zzi(i10) * size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            if (obj instanceof zzjv) {
                i11 = zzio.zza((zzjv) obj);
            } else {
                i11 = zzio.zza((zzkr) obj, zzlj);
            }
            zzi = i11 + zzi;
        }
        return zzi;
    }

    private static Class<?> zze() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzf(int i10, List<Float> list, zzne zzne, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzne.zzf(i10, list, z10);
        }
    }

    public static void zzg(int i10, List<Integer> list, zzne zzne, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzne.zzg(i10, list, z10);
        }
    }

    public static void zzh(int i10, List<Long> list, zzne zzne, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzne.zzh(i10, list, z10);
        }
    }

    public static void zzi(int i10, List<Integer> list, zzne zzne, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzne.zzi(i10, list, z10);
        }
    }

    public static void zzj(int i10, List<Long> list, zzne zzne, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzne.zzj(i10, list, z10);
        }
    }

    public static int zza(int i10, Object obj, zzlj zzlj) {
        if (obj instanceof zzjv) {
            return zzio.zzb(i10, (zzjv) obj);
        }
        return zzio.zzc(i10, (zzkr) obj, zzlj);
    }

    public static void zze(int i10, List<Long> list, zzne zzne, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzne.zze(i10, list, z10);
        }
    }

    public static zzmi<?, ?> zza() {
        return zzb;
    }

    public static <UT, UB> UB zza(Object obj, int i10, List<Integer> list, zzjm zzjm, UB ub2, zzmi<UT, UB> zzmi) {
        if (zzjm == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (zzjm.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = zza(obj, i10, intValue, ub2, zzmi);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzjm.zza(intValue2)) {
                    ub2 = zza(obj, i10, intValue2, ub2, zzmi);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    public static int zzb(int i10, List<?> list) {
        int i11;
        int i12;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        int zzi = zzio.zzi(i10) * size;
        if (list instanceof zzjx) {
            zzjx zzjx = (zzjx) list;
            while (i13 < size) {
                Object zzb2 = zzjx.zzb(i13);
                if (zzb2 instanceof zzhu) {
                    i12 = zzio.zzb((zzhu) zzb2);
                } else {
                    i12 = zzio.zzb((String) zzb2);
                }
                zzi = i12 + zzi;
                i13++;
            }
        } else {
            while (i13 < size) {
                Object obj = list.get(i13);
                if (obj instanceof zzhu) {
                    i11 = zzio.zzb((zzhu) obj);
                } else {
                    i11 = zzio.zzb((String) obj);
                }
                zzi = i11 + zzi;
                i13++;
            }
        }
        return zzi;
    }

    public static <UT, UB> UB zza(Object obj, int i10, int i11, UB ub2, zzmi<UT, UB> zzmi) {
        if (ub2 == null) {
            ub2 = zzmi.zzc(obj);
        }
        zzmi.zzb(ub2, i10, (long) i11);
        return ub2;
    }

    public static zzmi<?, ?> zzb() {
        return zzc;
    }

    public static <T, FT extends zzja<FT>> void zza(zziu<FT> zziu, T t10, T t11) {
        zziy<FT> zza2 = zziu.zza((Object) t11);
        if (!zza2.zza.isEmpty()) {
            zziu.zzb(t10).zza(zza2);
        }
    }

    public static void zzb(int i10, List<Double> list, zzne zzne, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzne.zzb(i10, list, z10);
        }
    }

    public static void zzb(int i10, List<?> list, zzne zzne, zzlj zzlj) {
        if (list != null && !list.isEmpty()) {
            zzne.zzb(i10, list, zzlj);
        }
    }

    public static <T> void zza(zzko zzko, T t10, T t11, long j10) {
        zzmo.zza((Object) t10, j10, zzko.zza(zzmo.zze(t10, j10), zzmo.zze(t11, j10)));
    }

    public static void zzb(int i10, List<String> list, zzne zzne) {
        if (list != null && !list.isEmpty()) {
            zzne.zzb(i10, list);
        }
    }

    public static <T, UT, UB> void zza(zzmi<UT, UB> zzmi, T t10, T t11) {
        zzmi.zzc(t10, zzmi.zza(zzmi.zzd(t10), zzmi.zzd(t11)));
    }

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzjf.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zza(int i10, List<Boolean> list, zzne zzne, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzne.zza(i10, list, z10);
        }
    }

    public static void zza(int i10, List<zzhu> list, zzne zzne) {
        if (list != null && !list.isEmpty()) {
            zzne.zza(i10, list);
        }
    }

    public static void zza(int i10, List<?> list, zzne zzne, zzlj zzlj) {
        if (list != null && !list.isEmpty()) {
            zzne.zza(i10, list, zzlj);
        }
    }

    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
