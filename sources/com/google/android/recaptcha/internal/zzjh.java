package com.google.android.recaptcha.internal;

import java.nio.charset.Charset;
import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzjh implements zzno {
    private final zzjg zza;

    private zzjh(zzjg zzjg) {
        Charset charset = zzla.zza;
        this.zza = zzjg;
        zzjg.zza = this;
    }

    public static zzjh zza(zzjg zzjg) {
        zzjh zzjh = zzjg.zza;
        if (zzjh != null) {
            return zzjh;
        }
        return new zzjh(zzjg);
    }

    public final void zzA(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzlm) {
            zzlm zzlm = (zzlm) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzlm.size(); i13++) {
                    zzlm.zze(i13);
                    i12 += 8;
                }
                this.zza.zzq(i12);
                while (i11 < zzlm.size()) {
                    this.zza.zzi(zzlm.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzlm.size()) {
                this.zza.zzh(i10, zzlm.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Long) list.get(i15)).longValue();
                i14 += 8;
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                this.zza.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public final void zzB(int i10, int i11) {
        this.zza.zzp(i10, (i11 >> 31) ^ (i11 + i11));
    }

    public final void zzC(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzkt) {
            zzkt zzkt = (zzkt) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzkt.size(); i13++) {
                    int zze = zzkt.zze(i13);
                    i12 += zzjg.zzx((zze >> 31) ^ (zze + zze));
                }
                this.zza.zzq(i12);
                while (i11 < zzkt.size()) {
                    zzjg zzjg = this.zza;
                    int zze2 = zzkt.zze(i11);
                    zzjg.zzq((zze2 >> 31) ^ (zze2 + zze2));
                    i11++;
                }
                return;
            }
            while (i11 < zzkt.size()) {
                zzjg zzjg2 = this.zza;
                int zze3 = zzkt.zze(i11);
                zzjg2.zzp(i10, (zze3 >> 31) ^ (zze3 + zze3));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                int intValue = ((Integer) list.get(i15)).intValue();
                i14 += zzjg.zzx((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                zzjg zzjg3 = this.zza;
                int intValue2 = ((Integer) list.get(i11)).intValue();
                zzjg3.zzq((intValue2 >> 31) ^ (intValue2 + intValue2));
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                zzjg zzjg4 = this.zza;
                int intValue3 = ((Integer) list.get(i11)).intValue();
                zzjg4.zzp(i10, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i11++;
            }
        }
    }

    public final void zzD(int i10, long j10) {
        this.zza.zzr(i10, (j10 >> 63) ^ (j10 + j10));
    }

    public final void zzE(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzlm) {
            zzlm zzlm = (zzlm) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzlm.size(); i13++) {
                    long zze = zzlm.zze(i13);
                    i12 += zzjg.zzy((zze >> 63) ^ (zze + zze));
                }
                this.zza.zzq(i12);
                while (i11 < zzlm.size()) {
                    zzjg zzjg = this.zza;
                    long zze2 = zzlm.zze(i11);
                    zzjg.zzs((zze2 >> 63) ^ (zze2 + zze2));
                    i11++;
                }
                return;
            }
            while (i11 < zzlm.size()) {
                zzjg zzjg2 = this.zza;
                long zze3 = zzlm.zze(i11);
                zzjg2.zzr(i10, (zze3 >> 63) ^ (zze3 + zze3));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                long longValue = ((Long) list.get(i15)).longValue();
                i14 += zzjg.zzy((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                zzjg zzjg3 = this.zza;
                long longValue2 = ((Long) list.get(i11)).longValue();
                zzjg3.zzs((longValue2 >> 63) ^ (longValue2 + longValue2));
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                zzjg zzjg4 = this.zza;
                long longValue3 = ((Long) list.get(i11)).longValue();
                zzjg4.zzr(i10, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i11++;
            }
        }
    }

    @Deprecated
    public final void zzF(int i10) {
        this.zza.zzo(i10, 3);
    }

    public final void zzG(int i10, String str) {
        this.zza.zzm(i10, str);
    }

    public final void zzH(int i10, List list) {
        int i11 = 0;
        if (list instanceof zzlj) {
            zzlj zzlj = (zzlj) list;
            while (i11 < list.size()) {
                Object zzc = zzlj.zzc();
                if (zzc instanceof String) {
                    this.zza.zzm(i10, (String) zzc);
                } else {
                    this.zza.zze(i10, (zziv) zzc);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzm(i10, (String) list.get(i11));
            i11++;
        }
    }

    public final void zzI(int i10, int i11) {
        this.zza.zzp(i10, i11);
    }

    public final void zzJ(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzkt) {
            zzkt zzkt = (zzkt) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzkt.size(); i13++) {
                    i12 += zzjg.zzx(zzkt.zze(i13));
                }
                this.zza.zzq(i12);
                while (i11 < zzkt.size()) {
                    this.zza.zzq(zzkt.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzkt.size()) {
                this.zza.zzp(i10, zzkt.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzjg.zzx(((Integer) list.get(i15)).intValue());
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                this.zza.zzq(((Integer) list.get(i11)).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzp(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public final void zzK(int i10, long j10) {
        this.zza.zzr(i10, j10);
    }

    public final void zzL(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzlm) {
            zzlm zzlm = (zzlm) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzlm.size(); i13++) {
                    i12 += zzjg.zzy(zzlm.zze(i13));
                }
                this.zza.zzq(i12);
                while (i11 < zzlm.size()) {
                    this.zza.zzs(zzlm.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzlm.size()) {
                this.zza.zzr(i10, zzlm.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzjg.zzy(((Long) list.get(i15)).longValue());
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                this.zza.zzs(((Long) list.get(i11)).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzr(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public final void zzb(int i10, boolean z10) {
        this.zza.zzd(i10, z10);
    }

    public final void zzc(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzim) {
            zzim zzim = (zzim) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzim.size(); i13++) {
                    zzim.zzf(i13);
                    i12++;
                }
                this.zza.zzq(i12);
                while (i11 < zzim.size()) {
                    this.zza.zzb(zzim.zzf(i11) ? (byte) 1 : 0);
                    i11++;
                }
                return;
            }
            while (i11 < zzim.size()) {
                this.zza.zzd(i10, zzim.zzf(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Boolean) list.get(i15)).booleanValue();
                i14++;
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : 0);
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzd(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
        }
    }

    public final void zzd(int i10, zziv zziv) {
        this.zza.zze(i10, zziv);
    }

    public final void zze(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zze(i10, (zziv) list.get(i11));
        }
    }

    public final void zzf(int i10, double d10) {
        this.zza.zzh(i10, Double.doubleToRawLongBits(d10));
    }

    public final void zzg(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzjx) {
            zzjx zzjx = (zzjx) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzjx.size(); i13++) {
                    zzjx.zze(i13);
                    i12 += 8;
                }
                this.zza.zzq(i12);
                while (i11 < zzjx.size()) {
                    this.zza.zzi(Double.doubleToRawLongBits(zzjx.zze(i11)));
                    i11++;
                }
                return;
            }
            while (i11 < zzjx.size()) {
                this.zza.zzh(i10, Double.doubleToRawLongBits(zzjx.zze(i11)));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Double) list.get(i15)).doubleValue();
                i14 += 8;
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzh(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
        }
    }

    @Deprecated
    public final void zzh(int i10) {
        this.zza.zzo(i10, 4);
    }

    public final void zzi(int i10, int i11) {
        this.zza.zzj(i10, i11);
    }

    public final void zzj(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzkt) {
            zzkt zzkt = (zzkt) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzkt.size(); i13++) {
                    i12 += zzjg.zzy((long) zzkt.zze(i13));
                }
                this.zza.zzq(i12);
                while (i11 < zzkt.size()) {
                    this.zza.zzk(zzkt.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzkt.size()) {
                this.zza.zzj(i10, zzkt.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzjg.zzy((long) ((Integer) list.get(i15)).intValue());
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                this.zza.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public final void zzk(int i10, int i11) {
        this.zza.zzf(i10, i11);
    }

    public final void zzl(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzkt) {
            zzkt zzkt = (zzkt) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzkt.size(); i13++) {
                    zzkt.zze(i13);
                    i12 += 4;
                }
                this.zza.zzq(i12);
                while (i11 < zzkt.size()) {
                    this.zza.zzg(zzkt.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzkt.size()) {
                this.zza.zzf(i10, zzkt.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Integer) list.get(i15)).intValue();
                i14 += 4;
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                this.zza.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public final void zzm(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    public final void zzn(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzlm) {
            zzlm zzlm = (zzlm) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzlm.size(); i13++) {
                    zzlm.zze(i13);
                    i12 += 8;
                }
                this.zza.zzq(i12);
                while (i11 < zzlm.size()) {
                    this.zza.zzi(zzlm.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzlm.size()) {
                this.zza.zzh(i10, zzlm.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Long) list.get(i15)).longValue();
                i14 += 8;
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                this.zza.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public final void zzo(int i10, float f10) {
        this.zza.zzf(i10, Float.floatToRawIntBits(f10));
    }

    public final void zzp(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzkk) {
            zzkk zzkk = (zzkk) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzkk.size(); i13++) {
                    zzkk.zze(i13);
                    i12 += 4;
                }
                this.zza.zzq(i12);
                while (i11 < zzkk.size()) {
                    this.zza.zzg(Float.floatToRawIntBits(zzkk.zze(i11)));
                    i11++;
                }
                return;
            }
            while (i11 < zzkk.size()) {
                this.zza.zzf(i10, Float.floatToRawIntBits(zzkk.zze(i11)));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Float) list.get(i15)).floatValue();
                i14 += 4;
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzf(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
        }
    }

    public final void zzq(int i10, Object obj, zzmk zzmk) {
        zzjg zzjg = this.zza;
        zzjg.zzo(i10, 3);
        zzmk.zzj((zzlx) obj, zzjg.zza);
        zzjg.zzo(i10, 4);
    }

    public final void zzr(int i10, int i11) {
        this.zza.zzj(i10, i11);
    }

    public final void zzs(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzkt) {
            zzkt zzkt = (zzkt) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzkt.size(); i13++) {
                    i12 += zzjg.zzy((long) zzkt.zze(i13));
                }
                this.zza.zzq(i12);
                while (i11 < zzkt.size()) {
                    this.zza.zzk(zzkt.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzkt.size()) {
                this.zza.zzj(i10, zzkt.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzjg.zzy((long) ((Integer) list.get(i15)).intValue());
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                this.zza.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public final void zzt(int i10, long j10) {
        this.zza.zzr(i10, j10);
    }

    public final void zzu(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzlm) {
            zzlm zzlm = (zzlm) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzlm.size(); i13++) {
                    i12 += zzjg.zzy(zzlm.zze(i13));
                }
                this.zza.zzq(i12);
                while (i11 < zzlm.size()) {
                    this.zza.zzs(zzlm.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzlm.size()) {
                this.zza.zzr(i10, zzlm.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzjg.zzy(((Long) list.get(i15)).longValue());
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                this.zza.zzs(((Long) list.get(i11)).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzr(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public final void zzv(int i10, Object obj, zzmk zzmk) {
        zzlx zzlx = (zzlx) obj;
        zzjd zzjd = (zzjd) this.zza;
        zzjd.zzq((i10 << 3) | 2);
        zzjd.zzq(((zzig) zzlx).zza(zzmk));
        zzmk.zzj(zzlx, zzjd.zza);
    }

    public final void zzw(int i10, Object obj) {
        if (obj instanceof zziv) {
            zzjd zzjd = (zzjd) this.zza;
            zzjd.zzq(11);
            zzjd.zzp(2, i10);
            zzjd.zze(3, (zziv) obj);
            zzjd.zzq(12);
            return;
        }
        zzjg zzjg = this.zza;
        zzlx zzlx = (zzlx) obj;
        zzjd zzjd2 = (zzjd) zzjg;
        zzjd2.zzq(11);
        zzjd2.zzp(2, i10);
        zzjd2.zzq(26);
        zzjd2.zzq(zzlx.zzn());
        zzlx.zze(zzjg);
        zzjd2.zzq(12);
    }

    public final void zzx(int i10, int i11) {
        this.zza.zzf(i10, i11);
    }

    public final void zzy(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzkt) {
            zzkt zzkt = (zzkt) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzkt.size(); i13++) {
                    zzkt.zze(i13);
                    i12 += 4;
                }
                this.zza.zzq(i12);
                while (i11 < zzkt.size()) {
                    this.zza.zzg(zzkt.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzkt.size()) {
                this.zza.zzf(i10, zzkt.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Integer) list.get(i15)).intValue();
                i14 += 4;
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                this.zza.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public final void zzz(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }
}
