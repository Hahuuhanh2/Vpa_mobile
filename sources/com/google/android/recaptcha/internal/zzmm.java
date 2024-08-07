package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzmm {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zznb zzc;
    private static final zznb zzd = new zznd();

    static {
        Class<?> cls;
        Class<?> cls2;
        zznb zznb = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zznb = (zznb) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zznb;
    }

    public static void zzA(int i10, List list, zzno zzno, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzno.zzu(i10, list, z10);
        }
    }

    public static void zzB(int i10, List list, zzno zzno, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzno.zzy(i10, list, z10);
        }
    }

    public static void zzC(int i10, List list, zzno zzno, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzno.zzA(i10, list, z10);
        }
    }

    public static void zzD(int i10, List list, zzno zzno, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzno.zzC(i10, list, z10);
        }
    }

    public static void zzE(int i10, List list, zzno zzno, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzno.zzE(i10, list, z10);
        }
    }

    public static void zzF(int i10, List list, zzno zzno, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzno.zzJ(i10, list, z10);
        }
    }

    public static void zzG(int i10, List list, zzno zzno, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzno.zzL(i10, list, z10);
        }
    }

    public static boolean zzH(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public static int zza(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzkt = (zzkt) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjg.zzy((long) zzkt.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzjg.zzy((long) ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzb(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjg.zzx(i10 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjg.zzx(i10 << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzkt = (zzkt) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjg.zzy((long) zzkt.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzjg.zzy((long) ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzg(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlm) {
            zzlm zzlm = (zzlm) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjg.zzy(zzlm.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzjg.zzy(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzh(int i10, Object obj, zzmk zzmk) {
        int i11 = i10 << 3;
        if (obj instanceof zzli) {
            int zzx = zzjg.zzx(i11);
            int zza2 = ((zzli) obj).zza();
            return zzjg.zzx(zza2) + zza2 + zzx;
        }
        return zzjg.zzv((zzlx) obj, zzmk) + zzjg.zzx(i11);
    }

    public static int zzi(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzkt = (zzkt) list;
            i10 = 0;
            while (i11 < size) {
                int zze = zzkt.zze(i11);
                i10 += zzjg.zzx((zze >> 31) ^ (zze + zze));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i12 = i10 + zzjg.zzx((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    public static int zzj(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlm) {
            zzlm zzlm = (zzlm) list;
            i10 = 0;
            while (i11 < size) {
                long zze = zzlm.zze(i11);
                i10 += zzjg.zzy((zze >> 63) ^ (zze + zze));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i12 = i10 + zzjg.zzy((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    public static int zzk(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzkt = (zzkt) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjg.zzx(zzkt.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzjg.zzx(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzl(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlm) {
            zzlm zzlm = (zzlm) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjg.zzy(zzlm.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzjg.zzy(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static zznb zzm() {
        return zzc;
    }

    public static zznb zzn() {
        return zzd;
    }

    public static Object zzo(Object obj, int i10, List list, zzkw zzkw, Object obj2, zznb zznb) {
        if (zzkw == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                if (zzkw.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    obj2 = zzp(obj, i10, intValue, obj2, zznb);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzkw.zza(intValue2)) {
                    obj2 = zzp(obj, i10, intValue2, obj2, zznb);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzp(Object obj, int i10, int i11, Object obj2, zznb zznb) {
        if (obj2 == null) {
            obj2 = zznb.zzc(obj);
        }
        zznb.zzl(obj2, i10, (long) i11);
        return obj2;
    }

    public static void zzq(zzke zzke, Object obj, Object obj2) {
        zzki zzb2 = zzke.zzb(obj2);
        if (!zzb2.zza.isEmpty()) {
            zzke.zzc(obj).zzh(zzb2);
        }
    }

    public static void zzr(zznb zznb, Object obj, Object obj2) {
        zznb.zzo(obj, zznb.zze(zznb.zzd(obj), zznb.zzd(obj2)));
    }

    public static void zzs(Class cls) {
        Class cls2;
        if (!zzks.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzt(int i10, List list, zzno zzno, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzno.zzc(i10, list, z10);
        }
    }

    public static void zzu(int i10, List list, zzno zzno, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzno.zzg(i10, list, z10);
        }
    }

    public static void zzv(int i10, List list, zzno zzno, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzno.zzj(i10, list, z10);
        }
    }

    public static void zzw(int i10, List list, zzno zzno, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzno.zzl(i10, list, z10);
        }
    }

    public static void zzx(int i10, List list, zzno zzno, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzno.zzn(i10, list, z10);
        }
    }

    public static void zzy(int i10, List list, zzno zzno, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzno.zzp(i10, list, z10);
        }
    }

    public static void zzz(int i10, List list, zzno zzno, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzno.zzs(i10, list, z10);
        }
    }
}
