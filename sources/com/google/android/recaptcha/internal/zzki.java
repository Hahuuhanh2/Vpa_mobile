package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzki {
    private static final zzki zzb = new zzki(true);
    public final zzmu zza = new zzmn(16);
    private boolean zzc;
    private boolean zzd;

    private zzki() {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011f, code lost:
        r1 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0121, code lost:
        return r4 + r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zza(com.google.android.recaptcha.internal.zzkh r4, java.lang.Object r5) {
        /*
            com.google.android.recaptcha.internal.zznm r0 = r4.zzd()
            int r1 = r4.zza()
            r4.zzg()
            int r4 = r1 << 3
            int r4 = com.google.android.recaptcha.internal.zzjg.zzx(r4)
            com.google.android.recaptcha.internal.zznm r1 = com.google.android.recaptcha.internal.zznm.GROUP
            if (r0 != r1) goto L_0x0024
            r1 = r5
            com.google.android.recaptcha.internal.zzlx r1 = (com.google.android.recaptcha.internal.zzlx) r1
            java.nio.charset.Charset r2 = com.google.android.recaptcha.internal.zzla.zza
            boolean r2 = r1 instanceof com.google.android.recaptcha.internal.zzih
            if (r2 != 0) goto L_0x0020
            int r4 = r4 + r4
            goto L_0x0024
        L_0x0020:
            com.google.android.recaptcha.internal.zzih r1 = (com.google.android.recaptcha.internal.zzih) r1
            r4 = 0
            throw r4
        L_0x0024:
            com.google.android.recaptcha.internal.zznn r1 = com.google.android.recaptcha.internal.zznn.INT
            int r0 = r0.ordinal()
            r1 = 4
            r2 = 8
            switch(r0) {
                case 0: goto L_0x011a;
                case 1: goto L_0x0114;
                case 2: goto L_0x0109;
                case 3: goto L_0x00fe;
                case 4: goto L_0x00f2;
                case 5: goto L_0x00ec;
                case 6: goto L_0x00e6;
                case 7: goto L_0x00df;
                case 8: goto L_0x00c7;
                case 9: goto L_0x00c0;
                case 10: goto L_0x00aa;
                case 11: goto L_0x0093;
                case 12: goto L_0x0087;
                case 13: goto L_0x0069;
                case 14: goto L_0x0062;
                case 15: goto L_0x005b;
                case 16: goto L_0x004a;
                case 17: goto L_0x0038;
                default: goto L_0x0030;
            }
        L_0x0030:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "There is no way to get here, but the compiler thinks otherwise."
            r4.<init>(r5)
            throw r4
        L_0x0038:
            java.lang.Long r5 = (java.lang.Long) r5
            long r0 = r5.longValue()
            long r2 = r0 + r0
            r5 = 63
            long r0 = r0 >> r5
            long r0 = r0 ^ r2
            int r1 = com.google.android.recaptcha.internal.zzjg.zzy(r0)
            goto L_0x0120
        L_0x004a:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r0 = r5 + r5
            int r5 = r5 >> 31
            r5 = r5 ^ r0
            int r1 = com.google.android.recaptcha.internal.zzjg.zzx(r5)
            goto L_0x0120
        L_0x005b:
            java.lang.Long r5 = (java.lang.Long) r5
            r5.longValue()
            goto L_0x011f
        L_0x0062:
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.intValue()
            goto L_0x0120
        L_0x0069:
            boolean r0 = r5 instanceof com.google.android.recaptcha.internal.zzku
            if (r0 == 0) goto L_0x007a
            com.google.android.recaptcha.internal.zzku r5 = (com.google.android.recaptcha.internal.zzku) r5
            int r5 = r5.zza()
            long r0 = (long) r5
            int r1 = com.google.android.recaptcha.internal.zzjg.zzy(r0)
            goto L_0x0120
        L_0x007a:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            long r0 = (long) r5
            int r1 = com.google.android.recaptcha.internal.zzjg.zzy(r0)
            goto L_0x0120
        L_0x0087:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r1 = com.google.android.recaptcha.internal.zzjg.zzx(r5)
            goto L_0x0120
        L_0x0093:
            boolean r0 = r5 instanceof com.google.android.recaptcha.internal.zziv
            if (r0 == 0) goto L_0x00a2
            com.google.android.recaptcha.internal.zziv r5 = (com.google.android.recaptcha.internal.zziv) r5
            int r5 = r5.zzd()
            int r0 = com.google.android.recaptcha.internal.zzjg.zzx(r5)
            goto L_0x00d5
        L_0x00a2:
            byte[] r5 = (byte[]) r5
            int r5 = r5.length
            int r0 = com.google.android.recaptcha.internal.zzjg.zzx(r5)
            goto L_0x00d5
        L_0x00aa:
            boolean r0 = r5 instanceof com.google.android.recaptcha.internal.zzlh
            if (r0 == 0) goto L_0x00b9
            com.google.android.recaptcha.internal.zzlh r5 = (com.google.android.recaptcha.internal.zzlh) r5
            int r5 = r5.zza()
            int r0 = com.google.android.recaptcha.internal.zzjg.zzx(r5)
            goto L_0x00d5
        L_0x00b9:
            com.google.android.recaptcha.internal.zzlx r5 = (com.google.android.recaptcha.internal.zzlx) r5
            int r1 = com.google.android.recaptcha.internal.zzjg.zzu(r5)
            goto L_0x0120
        L_0x00c0:
            com.google.android.recaptcha.internal.zzlx r5 = (com.google.android.recaptcha.internal.zzlx) r5
            int r1 = r5.zzn()
            goto L_0x0120
        L_0x00c7:
            boolean r0 = r5 instanceof com.google.android.recaptcha.internal.zziv
            if (r0 == 0) goto L_0x00d8
            com.google.android.recaptcha.internal.zziv r5 = (com.google.android.recaptcha.internal.zziv) r5
            int r5 = r5.zzd()
            int r0 = com.google.android.recaptcha.internal.zzjg.zzx(r5)
        L_0x00d5:
            int r1 = r0 + r5
            goto L_0x0120
        L_0x00d8:
            java.lang.String r5 = (java.lang.String) r5
            int r1 = com.google.android.recaptcha.internal.zzjg.zzw(r5)
            goto L_0x0120
        L_0x00df:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.booleanValue()
            r1 = 1
            goto L_0x0120
        L_0x00e6:
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.intValue()
            goto L_0x0120
        L_0x00ec:
            java.lang.Long r5 = (java.lang.Long) r5
            r5.longValue()
            goto L_0x011f
        L_0x00f2:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            long r0 = (long) r5
            int r1 = com.google.android.recaptcha.internal.zzjg.zzy(r0)
            goto L_0x0120
        L_0x00fe:
            java.lang.Long r5 = (java.lang.Long) r5
            long r0 = r5.longValue()
            int r1 = com.google.android.recaptcha.internal.zzjg.zzy(r0)
            goto L_0x0120
        L_0x0109:
            java.lang.Long r5 = (java.lang.Long) r5
            long r0 = r5.longValue()
            int r1 = com.google.android.recaptcha.internal.zzjg.zzy(r0)
            goto L_0x0120
        L_0x0114:
            java.lang.Float r5 = (java.lang.Float) r5
            r5.floatValue()
            goto L_0x0120
        L_0x011a:
            java.lang.Double r5 = (java.lang.Double) r5
            r5.doubleValue()
        L_0x011f:
            r1 = r2
        L_0x0120:
            int r4 = r4 + r1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzki.zza(com.google.android.recaptcha.internal.zzkh, java.lang.Object):int");
    }

    public static zzki zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzmc) {
            return ((zzmc) obj).zzd();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzm(Map.Entry entry) {
        Object obj;
        zzkh zzkh = (zzkh) entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof zzlh;
        zzkh.zzg();
        if (zzkh.zze() == zznn.MESSAGE) {
            Object zze = zze(zzkh);
            if (zze == null) {
                this.zza.put(zzkh, zzl(value));
                if (z10) {
                    this.zzd = true;
                }
            } else if (!z10) {
                if (zze instanceof zzmc) {
                    obj = zzkh.zzc((zzmc) zze, (zzmc) value);
                } else {
                    zzlw zzab = ((zzlx) zze).zzab();
                    zzkh.zzb(zzab, (zzlx) value);
                    obj = zzab.zzj();
                }
                this.zza.put(zzkh, obj);
            } else {
                zzlh zzlh = (zzlh) value;
                throw null;
            }
        } else if (!z10) {
            this.zza.put(zzkh, zzl(value));
        } else {
            throw new IllegalStateException("Lazy fields must be message-valued");
        }
    }

    private static boolean zzn(Map.Entry entry) {
        zzkh zzkh = (zzkh) entry.getKey();
        if (zzkh.zze() != zznn.MESSAGE) {
            return true;
        }
        zzkh.zzg();
        Object value = entry.getValue();
        if (value instanceof zzly) {
            return ((zzly) value).zzo();
        }
        if (value instanceof zzlh) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        zzkh zzkh = (zzkh) entry.getKey();
        Object value = entry.getValue();
        if (zzkh.zze() != zznn.MESSAGE) {
            return zza(zzkh, value);
        }
        zzkh.zzg();
        zzkh.zzf();
        if (value instanceof zzlh) {
            int zza2 = ((zzkh) entry.getKey()).zza();
            int zzx = zzjg.zzx(8);
            int zzx2 = zzjg.zzx(zza2) + zzjg.zzx(16);
            int zzx3 = zzjg.zzx(24);
            int zza3 = ((zzlh) value).zza();
            return zzx + zzx + zzx2 + zzjg.zzx(zza3) + zza3 + zzx3;
        }
        int zza4 = ((zzkh) entry.getKey()).zza();
        int zzx4 = zzjg.zzx(8);
        int zzx5 = zzjg.zzx(16);
        int zzx6 = zzjg.zzx(24);
        return zzx4 + zzx4 + zzjg.zzx(zza4) + zzx5 + zzjg.zzu((zzlx) value) + zzx6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzki)) {
            return false;
        }
        return this.zza.equals(((zzki) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.zza.zzb(); i11++) {
            i10 += zzo(this.zza.zzg(i11));
        }
        for (Map.Entry zzo : this.zza.zzc()) {
            i10 += zzo(zzo);
        }
        return i10;
    }

    /* renamed from: zzc */
    public final zzki clone() {
        zzki zzki = new zzki();
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry zzg = this.zza.zzg(i10);
            zzki.zzi((zzkh) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzki.zzi((zzkh) entry.getKey(), entry.getValue());
        }
        zzki.zzd = this.zzd;
        return zzki;
    }

    public final Object zze(zzkh zzkh) {
        Object obj = this.zza.get(zzkh);
        if (!(obj instanceof zzlh)) {
            return obj;
        }
        zzlh zzlh = (zzlh) obj;
        throw null;
    }

    public final Iterator zzf() {
        if (this.zzd) {
            return new zzlg(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (!this.zzc) {
            for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
                Map.Entry zzg = this.zza.zzg(i10);
                if (zzg.getValue() instanceof zzks) {
                    ((zzks) zzg.getValue()).zzD();
                }
            }
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzh(zzki zzki) {
        for (int i10 = 0; i10 < zzki.zza.zzb(); i10++) {
            zzm(zzki.zza.zzg(i10));
        }
        for (Map.Entry zzm : zzki.zza.zzc()) {
            zzm(zzm);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if ((r7 instanceof byte[]) == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r0 != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        if ((r7 instanceof com.google.android.recaptcha.internal.zzlh) == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        r5.zzd = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        r5.zza.zze(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new java.lang.Object[]{java.lang.Integer.valueOf(r6.zza()), r6.zzd().zza(), r7.getClass().getName()}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if ((r7 instanceof com.google.android.recaptcha.internal.zzlh) == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if ((r7 instanceof com.google.android.recaptcha.internal.zzku) == false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzi(com.google.android.recaptcha.internal.zzkh r6, java.lang.Object r7) {
        /*
            r5 = this;
            r6.zzg()
            com.google.android.recaptcha.internal.zznm r0 = r6.zzd()
            java.nio.charset.Charset r1 = com.google.android.recaptcha.internal.zzla.zza
            r7.getClass()
            com.google.android.recaptcha.internal.zznm r1 = com.google.android.recaptcha.internal.zznm.DOUBLE
            com.google.android.recaptcha.internal.zznn r1 = com.google.android.recaptcha.internal.zznn.INT
            com.google.android.recaptcha.internal.zznn r0 = r0.zza()
            int r0 = r0.ordinal()
            r1 = 1
            switch(r0) {
                case 0: goto L_0x0047;
                case 1: goto L_0x0044;
                case 2: goto L_0x0041;
                case 3: goto L_0x003e;
                case 4: goto L_0x003b;
                case 5: goto L_0x0038;
                case 6: goto L_0x002f;
                case 7: goto L_0x0026;
                case 8: goto L_0x001d;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0057
        L_0x001d:
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzlx
            if (r0 != 0) goto L_0x004b
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzlh
            if (r0 == 0) goto L_0x0057
            goto L_0x004b
        L_0x0026:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x004b
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzku
            if (r0 == 0) goto L_0x0057
            goto L_0x004b
        L_0x002f:
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zziv
            if (r0 != 0) goto L_0x004b
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L_0x0057
            goto L_0x004b
        L_0x0038:
            boolean r0 = r7 instanceof java.lang.String
            goto L_0x0049
        L_0x003b:
            boolean r0 = r7 instanceof java.lang.Boolean
            goto L_0x0049
        L_0x003e:
            boolean r0 = r7 instanceof java.lang.Double
            goto L_0x0049
        L_0x0041:
            boolean r0 = r7 instanceof java.lang.Float
            goto L_0x0049
        L_0x0044:
            boolean r0 = r7 instanceof java.lang.Long
            goto L_0x0049
        L_0x0047:
            boolean r0 = r7 instanceof java.lang.Integer
        L_0x0049:
            if (r0 == 0) goto L_0x0057
        L_0x004b:
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzlh
            if (r0 == 0) goto L_0x0051
            r5.zzd = r1
        L_0x0051:
            com.google.android.recaptcha.internal.zzmu r0 = r5.zza
            r0.put(r6, r7)
            return
        L_0x0057:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            int r4 = r6.zza()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            com.google.android.recaptcha.internal.zznm r6 = r6.zzd()
            com.google.android.recaptcha.internal.zznn r6 = r6.zza()
            r2[r1] = r6
            r6 = 2
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            r2[r6] = r7
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r2)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzki.zzi(com.google.android.recaptcha.internal.zzkh, java.lang.Object):void");
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            if (!zzn(this.zza.zzg(i10))) {
                return false;
            }
        }
        for (Map.Entry zzn : this.zza.zzc()) {
            if (!zzn(zzn)) {
                return false;
            }
        }
        return true;
    }

    private zzki(boolean z10) {
        zzg();
        zzg();
    }
}
