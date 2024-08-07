package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
final class zzkx<T> implements zzlj<T> {
    private final zzkr zza;
    private final zzmi<?, ?> zzb;
    private final boolean zzc;
    private final zziu<?> zzd;

    private zzkx(zzmi<?, ?> zzmi, zziu<?> zziu, zzkr zzkr) {
        this.zzb = zzmi;
        this.zzc = zziu.zza(zzkr);
        this.zzd = zziu;
        this.zza = zzkr;
    }

    public final int zza(T t10) {
        zzmi<?, ?> zzmi = this.zzb;
        int zzb2 = zzmi.zzb(zzmi.zzd(t10)) + 0;
        return this.zzc ? zzb2 + this.zzd.zza((Object) t10).zza() : zzb2;
    }

    public final int zzb(T t10) {
        int hashCode = this.zzb.zzd(t10).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zza((Object) t10).hashCode() : hashCode;
    }

    public final void zzc(T t10) {
        this.zzb.zzf(t10);
        this.zzd.zzc(t10);
    }

    public final boolean zzd(T t10) {
        return this.zzd.zza((Object) t10).zzg();
    }

    public final boolean zzb(T t10, T t11) {
        if (!this.zzb.zzd(t10).equals(this.zzb.zzd(t11))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza((Object) t10).equals(this.zzd.zza((Object) t11));
        }
        return true;
    }

    public static <T> zzkx<T> zza(zzmi<?, ?> zzmi, zziu<?> zziu, zzkr zzkr) {
        return new zzkx<>(zzmi, zziu, zzkr);
    }

    public final T zza() {
        zzkr zzkr = this.zza;
        if (zzkr instanceof zzjf) {
            return ((zzjf) zzkr).zzbz();
        }
        return zzkr.zzcd().zzai();
    }

    public final void zza(T t10, T t11) {
        zzll.zza(this.zzb, t10, t11);
        if (this.zzc) {
            zzll.zza(this.zzd, t10, t11);
        }
    }

    public final void zza(T t10, zzlk zzlk, zzis zzis) {
        boolean z10;
        zzmi<?, ?> zzmi = this.zzb;
        zziu<?> zziu = this.zzd;
        Object zzc2 = zzmi.zzc(t10);
        zziy<?> zzb2 = zziu.zzb(t10);
        do {
            try {
                if (zzlk.zzc() == Integer.MAX_VALUE) {
                    zzmi.zzb((Object) t10, zzc2);
                    return;
                }
                int zzd2 = zzlk.zzd();
                if (zzd2 == 11) {
                    int i10 = 0;
                    Object obj = null;
                    zzhu zzhu = null;
                    while (zzlk.zzc() != Integer.MAX_VALUE) {
                        int zzd3 = zzlk.zzd();
                        if (zzd3 == 16) {
                            i10 = zzlk.zzj();
                            obj = zziu.zza(zzis, this.zza, i10);
                        } else if (zzd3 == 26) {
                            if (obj != null) {
                                zziu.zza(zzlk, obj, zzis, zzb2);
                            } else {
                                zzhu = zzlk.zzp();
                            }
                        } else if (!zzlk.zzt()) {
                            break;
                        }
                    }
                    if (zzlk.zzd() != 12) {
                        throw zzjq.zzb();
                    } else if (zzhu != null) {
                        if (obj != null) {
                            zziu.zza(zzhu, obj, zzis, zzb2);
                        } else {
                            zzmi.zza(zzc2, i10, zzhu);
                        }
                    }
                } else if ((zzd2 & 7) == 2) {
                    Object zza2 = zziu.zza(zzis, this.zza, zzd2 >>> 3);
                    if (zza2 != null) {
                        zziu.zza(zzlk, zza2, zzis, zzb2);
                    } else {
                        z10 = zzmi.zza(zzc2, zzlk);
                        continue;
                    }
                } else {
                    z10 = zzlk.zzt();
                    continue;
                }
                z10 = true;
                continue;
            } finally {
                zzmi.zzb((Object) t10, zzc2);
            }
        } while (z10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.internal.measurement.zzjf$zzf} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.measurement.zzht r14) {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.measurement.zzjf r0 = (com.google.android.gms.internal.measurement.zzjf) r0
            com.google.android.gms.internal.measurement.zzmh r1 = r0.zzb
            com.google.android.gms.internal.measurement.zzmh r2 = com.google.android.gms.internal.measurement.zzmh.zzc()
            if (r1 != r2) goto L_0x0011
            com.google.android.gms.internal.measurement.zzmh r1 = com.google.android.gms.internal.measurement.zzmh.zzd()
            r0.zzb = r1
        L_0x0011:
            com.google.android.gms.internal.measurement.zzjf$zzd r10 = (com.google.android.gms.internal.measurement.zzjf.zzd) r10
            r10.zza()
            r10 = 0
            r0 = r10
        L_0x0018:
            if (r12 >= r13) goto L_0x00a4
            int r4 = com.google.android.gms.internal.measurement.zzhq.zzc(r11, r12, r14)
            int r2 = r14.zza
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L_0x0051
            r12 = r2 & 7
            if (r12 != r3) goto L_0x004c
            com.google.android.gms.internal.measurement.zziu<?> r12 = r9.zzd
            com.google.android.gms.internal.measurement.zzis r0 = r14.zzd
            com.google.android.gms.internal.measurement.zzkr r3 = r9.zza
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.measurement.zzjf$zzf r0 = (com.google.android.gms.internal.measurement.zzjf.zzf) r0
            if (r0 != 0) goto L_0x0043
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.measurement.zzhq.zza((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.measurement.zzmh) r6, (com.google.android.gms.internal.measurement.zzht) r7)
            goto L_0x0018
        L_0x0043:
            com.google.android.gms.internal.measurement.zzlf.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x004c:
            int r12 = com.google.android.gms.internal.measurement.zzhq.zza((int) r2, (byte[]) r11, (int) r4, (int) r13, (com.google.android.gms.internal.measurement.zzht) r14)
            goto L_0x0018
        L_0x0051:
            r12 = 0
            r2 = r10
        L_0x0053:
            if (r4 >= r13) goto L_0x0099
            int r4 = com.google.android.gms.internal.measurement.zzhq.zzc(r11, r4, r14)
            int r5 = r14.zza
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L_0x007b
            r8 = 3
            if (r6 == r8) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            if (r0 != 0) goto L_0x0072
            if (r7 != r3) goto L_0x0090
            int r4 = com.google.android.gms.internal.measurement.zzhq.zza(r11, r4, r14)
            java.lang.Object r2 = r14.zzc
            com.google.android.gms.internal.measurement.zzhu r2 = (com.google.android.gms.internal.measurement.zzhu) r2
            goto L_0x0053
        L_0x0072:
            com.google.android.gms.internal.measurement.zzlf.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x007b:
            if (r7 != 0) goto L_0x0090
            int r4 = com.google.android.gms.internal.measurement.zzhq.zzc(r11, r4, r14)
            int r12 = r14.zza
            com.google.android.gms.internal.measurement.zziu<?> r0 = r9.zzd
            com.google.android.gms.internal.measurement.zzis r5 = r14.zzd
            com.google.android.gms.internal.measurement.zzkr r6 = r9.zza
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.measurement.zzjf$zzf r0 = (com.google.android.gms.internal.measurement.zzjf.zzf) r0
            goto L_0x0053
        L_0x0090:
            r6 = 12
            if (r5 == r6) goto L_0x0099
            int r4 = com.google.android.gms.internal.measurement.zzhq.zza((int) r5, (byte[]) r11, (int) r4, (int) r13, (com.google.android.gms.internal.measurement.zzht) r14)
            goto L_0x0053
        L_0x0099:
            if (r2 == 0) goto L_0x00a1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zza((int) r12, (java.lang.Object) r2)
        L_0x00a1:
            r12 = r4
            goto L_0x0018
        L_0x00a4:
            if (r12 != r13) goto L_0x00a7
            return
        L_0x00a7:
            com.google.android.gms.internal.measurement.zzjq r10 = com.google.android.gms.internal.measurement.zzjq.zzg()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkx.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzht):void");
    }

    public final void zza(T t10, zzne zzne) {
        Iterator<Map.Entry<?, Object>> zzd2 = this.zzd.zza((Object) t10).zzd();
        while (zzd2.hasNext()) {
            Map.Entry next = zzd2.next();
            zzja zzja = (zzja) next.getKey();
            if (zzja.zzc() != zznf.MESSAGE || zzja.zze() || zzja.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof zzju) {
                zzne.zza(zzja.zza(), (Object) ((zzju) next).zza().zzc());
            } else {
                zzne.zza(zzja.zza(), next.getValue());
            }
        }
        zzmi<?, ?> zzmi = this.zzb;
        zzmi.zza(zzmi.zzd(t10), zzne);
    }
}
