package com.google.android.recaptcha.internal;

import fk.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzel {
    private final Map zza = new LinkedHashMap();
    private final Set zzb = new LinkedHashSet();

    private final List zzh(List list) {
        ArrayList arrayList = new ArrayList(j.H0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zza((zzrr) it.next()));
        }
        return arrayList;
    }

    public final Object zza(zzrr zzrr) {
        int zzQ = zzrr.zzQ();
        int i10 = zzQ - 1;
        if (zzQ != 0) {
            switch (i10) {
                case 0:
                    return this.zza.get(Integer.valueOf(zzrr.zzi()));
                case 1:
                    return Boolean.valueOf(zzrr.zzO());
                case 2:
                    byte[] zzl = zzrr.zzK().zzl();
                    if (zzl.length == 1) {
                        return Byte.valueOf(zzl[0]);
                    }
                    throw new zzby(4, 6, (Throwable) null);
                case 3:
                    String zzM = zzrr.zzM();
                    if (zzM.length() == 1) {
                        return Character.valueOf(zzM.charAt(0));
                    }
                    throw new zzby(4, 6, (Throwable) null);
                case 4:
                    int zzj = zzrr.zzj();
                    if (zzj >= -32768 && zzj <= 32767) {
                        return Short.valueOf((short) zzj);
                    }
                    throw new zzby(4, 6, (Throwable) null);
                case 5:
                    return Integer.valueOf(zzrr.zzk());
                case 6:
                case 8:
                    throw new zzby(4, 6, (Throwable) null);
                case 7:
                    return Long.valueOf(zzrr.zzJ());
                case 9:
                    return Float.valueOf(zzrr.zzg());
                case 10:
                    return Double.valueOf(zzrr.zzf());
                case 11:
                    return zzrr.zzN();
                case 12:
                    return null;
                default:
                    throw new zzby(4, 5, (Throwable) null);
            }
        } else {
            throw null;
        }
    }

    public final Object zzb(int i10) {
        return this.zza.remove(Integer.valueOf(i10));
    }

    public final void zzc() {
        this.zza.clear();
    }

    public final void zzd(int i10, Object obj) {
        zze(173, obj);
        this.zzb.add(173);
    }

    public final void zze(int i10, Object obj) {
        this.zza.put(Integer.valueOf(i10), obj);
    }

    public final Class[] zzf(List list) {
        List<Object> zzh = zzh(list);
        ArrayList arrayList = new ArrayList(j.H0(zzh));
        for (Object zza2 : zzh) {
            arrayList.add(zzej.zza(zza2));
        }
        return (Class[]) arrayList.toArray(new Class[0]);
    }

    public final Object[] zzg(List list) {
        return zzh(list).toArray(new Object[0]);
    }
}
