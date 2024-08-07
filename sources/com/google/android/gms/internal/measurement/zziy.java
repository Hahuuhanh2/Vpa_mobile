package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzja;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
final class zziy<T extends zzja<T>> {
    private static final zziy zzb = new zziy(true);
    public final zzlo<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    private zziy() {
        this.zza = zzlo.zza(16);
    }

    public static int zza(zzmv zzmv, int i10, Object obj) {
        int zzi = zzio.zzi(i10);
        if (zzmv == zzmv.GROUP) {
            zzjh.zza((zzkr) obj);
            zzi <<= 1;
        }
        return zzi + zza(zzmv, obj);
    }

    public static <T extends zzja<T>> zziy<T> zzb() {
        return zzb;
    }

    public final /* synthetic */ Object clone() {
        zziy zziy = new zziy();
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry<T, Object> zzb2 = this.zza.zzb(i10);
            zziy.zzb((zzja) zzb2.getKey(), zzb2.getValue());
        }
        for (Map.Entry next : this.zza.zzc()) {
            zziy.zzb((zzja) next.getKey(), next.getValue());
        }
        zziy.zzd = this.zzd;
        return zziy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zziy)) {
            return false;
        }
        return this.zza.equals(((zziy) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> zzc() {
        if (this.zzd) {
            return new zzjw(this.zza.zzd().iterator());
        }
        return this.zza.zzd().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        if (this.zzd) {
            return new zzjw(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    public final void zze() {
        if (!this.zzc) {
            for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
                Map.Entry<T, Object> zzb2 = this.zza.zzb(i10);
                if (zzb2.getValue() instanceof zzjf) {
                    ((zzjf) zzb2.getValue()).zzcg();
                }
            }
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            if (!zzc(this.zza.zzb(i10))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> zzc2 : this.zza.zzc()) {
            if (!zzc(zzc2)) {
                return false;
            }
        }
        return true;
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        Object obj;
        zzja zzja = (zzja) entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof zzjr;
        if (zzja.zze()) {
            if (!z10) {
                Object zza2 = zza(zzja);
                if (zza2 == null) {
                    zza2 = new ArrayList();
                }
                for (Object zza3 : (List) value) {
                    ((List) zza2).add(zza(zza3));
                }
                this.zza.put(zzja, zza2);
                return;
            }
            throw new IllegalStateException("Lazy fields can not be repeated");
        } else if (zzja.zzc() == zznf.MESSAGE) {
            Object zza4 = zza(zzja);
            if (zza4 == null) {
                this.zza.put(zzja, zza(value));
                if (z10) {
                    this.zzd = true;
                    return;
                }
                return;
            }
            if (z10) {
                zzjr zzjr = (zzjr) value;
                value = zzjr.zza();
            }
            if (zza4 instanceof zzla) {
                obj = zzja.zza((zzla) zza4, (zzla) value);
            } else {
                obj = zzja.zza(((zzkr) zza4).zzce(), (zzkr) value).zzah();
            }
            this.zza.put(zzja, obj);
        } else if (!z10) {
            this.zza.put(zzja, zza(value));
        } else {
            throw new IllegalStateException("Lazy fields must be message-valued");
        }
    }

    private zziy(zzlo<T, Object> zzlo) {
        this.zza = zzlo;
        zze();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if ((r6 instanceof com.google.android.gms.internal.measurement.zzjk) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if ((r6 instanceof byte[]) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        if (r0 == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new java.lang.Object[]{java.lang.Integer.valueOf(r5.zza()), r5.zzb().zzb(), r6.getClass().getName()}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0018, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if ((r6 instanceof com.google.android.gms.internal.measurement.zzjr) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zzc(T r5, java.lang.Object r6) {
        /*
            com.google.android.gms.internal.measurement.zzmv r0 = r5.zzb()
            com.google.android.gms.internal.measurement.zzjh.zza(r6)
            int[] r1 = com.google.android.gms.internal.measurement.zzix.zza
            com.google.android.gms.internal.measurement.zznf r0 = r0.zzb()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L_0x0045;
                case 2: goto L_0x0042;
                case 3: goto L_0x003f;
                case 4: goto L_0x003c;
                case 5: goto L_0x0039;
                case 6: goto L_0x0036;
                case 7: goto L_0x002c;
                case 8: goto L_0x0023;
                case 9: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            r0 = r2
            goto L_0x0047
        L_0x001a:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzkr
            if (r0 != 0) goto L_0x0034
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzjr
            if (r0 == 0) goto L_0x0018
            goto L_0x0034
        L_0x0023:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0034
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzjk
            if (r0 == 0) goto L_0x0018
            goto L_0x0034
        L_0x002c:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzhu
            if (r0 != 0) goto L_0x0034
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L_0x0018
        L_0x0034:
            r0 = r1
            goto L_0x0047
        L_0x0036:
            boolean r0 = r6 instanceof java.lang.String
            goto L_0x0047
        L_0x0039:
            boolean r0 = r6 instanceof java.lang.Boolean
            goto L_0x0047
        L_0x003c:
            boolean r0 = r6 instanceof java.lang.Double
            goto L_0x0047
        L_0x003f:
            boolean r0 = r6 instanceof java.lang.Float
            goto L_0x0047
        L_0x0042:
            boolean r0 = r6 instanceof java.lang.Long
            goto L_0x0047
        L_0x0045:
            boolean r0 = r6 instanceof java.lang.Integer
        L_0x0047:
            if (r0 == 0) goto L_0x004a
            return
        L_0x004a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r5.zza()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r2] = r4
            com.google.android.gms.internal.measurement.zzmv r5 = r5.zzb()
            com.google.android.gms.internal.measurement.zznf r5 = r5.zzb()
            r3[r1] = r5
            r5 = 2
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r3[r5] = r6
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r3)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zziy.zzc(com.google.android.gms.internal.measurement.zzja, java.lang.Object):void");
    }

    private static int zza(zzmv zzmv, Object obj) {
        switch (zzix.zzb[zzmv.ordinal()]) {
            case 1:
                return zzio.zza(((Double) obj).doubleValue());
            case 2:
                return zzio.zza(((Float) obj).floatValue());
            case 3:
                return zzio.zzd(((Long) obj).longValue());
            case 4:
                return zzio.zzg(((Long) obj).longValue());
            case 5:
                return zzio.zzf(((Integer) obj).intValue());
            case 6:
                return zzio.zzc(((Long) obj).longValue());
            case 7:
                return zzio.zze(((Integer) obj).intValue());
            case 8:
                return zzio.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzio.zzb((zzkr) obj);
            case 10:
                if (obj instanceof zzjr) {
                    return zzio.zza((zzjv) (zzjr) obj);
                }
                return zzio.zzc((zzkr) obj);
            case 11:
                if (obj instanceof zzhu) {
                    return zzio.zzb((zzhu) obj);
                }
                return zzio.zzb((String) obj);
            case 12:
                if (obj instanceof zzhu) {
                    return zzio.zzb((zzhu) obj);
                }
                return zzio.zza((byte[]) obj);
            case 13:
                return zzio.zzj(((Integer) obj).intValue());
            case 14:
                return zzio.zzg(((Integer) obj).intValue());
            case 15:
                return zzio.zze(((Long) obj).longValue());
            case 16:
                return zzio.zzh(((Integer) obj).intValue());
            case 17:
                return zzio.zzf(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzjk) {
                    return zzio.zzd(((zzjk) obj).zza());
                }
                return zzio.zzd(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private zziy(boolean z10) {
        this(zzlo.zza(0));
        zze();
    }

    private static <T extends zzja<T>> boolean zzc(Map.Entry<T, Object> entry) {
        zzja zzja = (zzja) entry.getKey();
        if (zzja.zzc() != zznf.MESSAGE) {
            return true;
        }
        if (!zzja.zze()) {
            return zzb(entry.getValue());
        }
        for (Object zzb2 : (List) entry.getValue()) {
            if (!zzb(zzb2)) {
                return false;
            }
        }
        return true;
    }

    private final void zzb(T t10, Object obj) {
        if (!t10.zze()) {
            zzc(t10, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                zzc(t10, obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzjr) {
            this.zzd = true;
        }
        this.zza.put(t10, obj);
    }

    public static int zza(zzja<?> zzja, Object obj) {
        zzmv zzb2 = zzja.zzb();
        int zza2 = zzja.zza();
        if (!zzja.zze()) {
            return zza(zzb2, zza2, obj);
        }
        List<Object> list = (List) obj;
        int i10 = 0;
        if (!zzja.zzd()) {
            for (Object zza3 : list) {
                i10 += zza(zzb2, zza2, zza3);
            }
            return i10;
        } else if (list.isEmpty()) {
            return 0;
        } else {
            for (Object zza4 : list) {
                i10 += zza(zzb2, zza4);
            }
            return zzio.zzj(i10) + zzio.zzi(zza2) + i10;
        }
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzkt) {
            return ((zzkt) obj).zzci();
        }
        if (obj instanceof zzjr) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final int zza() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.zza.zzb(); i11++) {
            i10 += zza(this.zza.zzb(i11));
        }
        for (Map.Entry<T, Object> zza2 : this.zza.zzc()) {
            i10 += zza(zza2);
        }
        return i10;
    }

    private static int zza(Map.Entry<T, Object> entry) {
        zzja zzja = (zzja) entry.getKey();
        Object value = entry.getValue();
        if (zzja.zzc() != zznf.MESSAGE || zzja.zze() || zzja.zzd()) {
            return zza((zzja<?>) zzja, value);
        }
        if (value instanceof zzjr) {
            return zzio.zza(((zzja) entry.getKey()).zza(), (zzjv) (zzjr) value);
        }
        return zzio.zzb(((zzja) entry.getKey()).zza(), (zzkr) value);
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzla) {
            return ((zzla) obj).zza();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final Object zza(T t10) {
        Object obj = this.zza.get(t10);
        if (!(obj instanceof zzjr)) {
            return obj;
        }
        zzjr zzjr = (zzjr) obj;
        return zzjr.zza();
    }

    public final void zza(zziy<T> zziy) {
        for (int i10 = 0; i10 < zziy.zza.zzb(); i10++) {
            zzb(zziy.zza.zzb(i10));
        }
        for (Map.Entry<T, Object> zzb2 : zziy.zza.zzc()) {
            zzb(zzb2);
        }
    }

    public static void zza(zzio zzio, zzmv zzmv, int i10, Object obj) {
        if (zzmv == zzmv.GROUP) {
            zzkr zzkr = (zzkr) obj;
            zzjh.zza(zzkr);
            zzio.zzc(i10, 3);
            zzkr.zza(zzio);
            zzio.zzc(i10, 4);
            return;
        }
        zzio.zzc(i10, zzmv.zza());
        switch (zzix.zzb[zzmv.ordinal()]) {
            case 1:
                zzio.zzb(((Double) obj).doubleValue());
                return;
            case 2:
                zzio.zzb(((Float) obj).floatValue());
                return;
            case 3:
                zzio.zzb(((Long) obj).longValue());
                return;
            case 4:
                zzio.zzb(((Long) obj).longValue());
                return;
            case 5:
                zzio.zzb(((Integer) obj).intValue());
                return;
            case 6:
                zzio.zza(((Long) obj).longValue());
                return;
            case 7:
                zzio.zza(((Integer) obj).intValue());
                return;
            case 8:
                zzio.zzb(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzkr) obj).zza(zzio);
                return;
            case 10:
                zzio.zza((zzkr) obj);
                return;
            case 11:
                if (obj instanceof zzhu) {
                    zzio.zza((zzhu) obj);
                    return;
                } else {
                    zzio.zza((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzhu) {
                    zzio.zza((zzhu) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzio.zzb(bArr, 0, bArr.length);
                return;
            case 13:
                zzio.zzc(((Integer) obj).intValue());
                return;
            case 14:
                zzio.zza(((Integer) obj).intValue());
                return;
            case 15:
                zzio.zza(((Long) obj).longValue());
                return;
            case 16:
                zzio.zzk(((Integer) obj).intValue());
                return;
            case 17:
                zzio.zzh(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzjk) {
                    zzio.zzb(((zzjk) obj).zza());
                    return;
                } else {
                    zzio.zzb(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }
}
