package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
final class zzin implements zzlk {
    private final zzij zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzin(zzij zzij) {
        zzij zzij2 = (zzij) zzjh.zza(zzij, "input");
        this.zza = zzij2;
        zzij2.zzc = this;
    }

    public final double zza() {
        zzb(1);
        return this.zza.zza();
    }

    public final float zzb() {
        zzb(5);
        return this.zza.zzb();
    }

    public final int zzc() {
        int i10 = this.zzd;
        if (i10 != 0) {
            this.zzb = i10;
            this.zzd = 0;
        } else {
            this.zzb = this.zza.zzi();
        }
        int i11 = this.zzb;
        if (i11 == 0 || i11 == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i11 >>> 3;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzb(0);
        return this.zza.zzd();
    }

    public final int zzf() {
        zzb(5);
        return this.zza.zze();
    }

    public final int zzg() {
        zzb(0);
        return this.zza.zzf();
    }

    public final int zzh() {
        zzb(5);
        return this.zza.zzg();
    }

    public final int zzi() {
        zzb(0);
        return this.zza.zzh();
    }

    public final int zzj() {
        zzb(0);
        return this.zza.zzj();
    }

    public final long zzk() {
        zzb(1);
        return this.zza.zzk();
    }

    public final long zzl() {
        zzb(0);
        return this.zza.zzl();
    }

    public final long zzm() {
        zzb(1);
        return this.zza.zzn();
    }

    public final long zzn() {
        zzb(0);
        return this.zza.zzo();
    }

    public final long zzo() {
        zzb(0);
        return this.zza.zzp();
    }

    public final zzhu zzp() {
        zzb(2);
        return this.zza.zzq();
    }

    public final String zzq() {
        zzb(2);
        return this.zza.zzr();
    }

    public final String zzr() {
        zzb(2);
        return this.zza.zzs();
    }

    public final boolean zzs() {
        zzb(0);
        return this.zza.zzu();
    }

    public final boolean zzt() {
        int i10;
        if (this.zza.zzt() || (i10 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzd(i10);
    }

    private final <T> void zzd(T t10, zzlj<T> zzlj, zzis zzis) {
        int zzj = this.zza.zzj();
        zzij zzij = this.zza;
        if (zzij.zza < zzij.zzb) {
            int zza2 = zzij.zza(zzj);
            this.zza.zza++;
            zzlj.zza(t10, this, zzis);
            this.zza.zzb(0);
            zzij zzij2 = this.zza;
            zzij2.zza--;
            zzij2.zzc(zza2);
            return;
        }
        throw new zzjq("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static zzin zza(zzij zzij) {
        zzin zzin = zzij.zzc;
        if (zzin != null) {
            return zzin;
        }
        return new zzin(zzij);
    }

    private final <T> T zzb(zzlj<T> zzlj, zzis zzis) {
        T zza2 = zzlj.zza();
        zzd(zza2, zzlj, zzis);
        zzlj.zzc(zza2);
        return zza2;
    }

    public final void zze(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzji) {
            zzji zzji = (zzji) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzji.zzd(this.zza.zze());
                } while (this.zza.zzc() < zzc2);
            } else if (i10 == 5) {
                do {
                    zzji.zzd(this.zza.zze());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else {
                throw zzjq.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zzj2 = this.zza.zzj();
                zzc(zzj2);
                int zzc3 = this.zza.zzc() + zzj2;
                do {
                    list.add(Integer.valueOf(this.zza.zze()));
                } while (this.zza.zzc() < zzc3);
            } else if (i11 == 5) {
                do {
                    list.add(Integer.valueOf(this.zza.zze()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else {
                throw zzjq.zza();
            }
        }
    }

    public final void zzf(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzkg) {
            zzkg zzkg = (zzkg) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzkg.zza(this.zza.zzk());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzkg.zza(this.zza.zzk());
                } while (this.zza.zzc() < zzc2);
            } else {
                throw zzjq.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzk()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzj2 = this.zza.zzj();
                zzd(zzj2);
                int zzc3 = this.zza.zzc() + zzj2;
                do {
                    list.add(Long.valueOf(this.zza.zzk()));
                } while (this.zza.zzc() < zzc3);
            } else {
                throw zzjq.zza();
            }
        }
    }

    public final void zzg(List<Float> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzje) {
            zzje zzje = (zzje) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzje.zza(this.zza.zzb());
                } while (this.zza.zzc() < zzc2);
            } else if (i10 == 5) {
                do {
                    zzje.zza(this.zza.zzb());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else {
                throw zzjq.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zzj2 = this.zza.zzj();
                zzc(zzj2);
                int zzc3 = this.zza.zzc() + zzj2;
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                } while (this.zza.zzc() < zzc3);
            } else if (i11 == 5) {
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else {
                throw zzjq.zza();
            }
        }
    }

    public final void zzh(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzji) {
            zzji zzji = (zzji) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzji.zzd(this.zza.zzf());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzji.zzd(this.zza.zzf());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzjq.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzjq.zza();
            }
        }
    }

    public final void zzi(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzkg) {
            zzkg zzkg = (zzkg) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzkg.zza(this.zza.zzl());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzkg.zza(this.zza.zzl());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzjq.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzl()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzl()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzjq.zza();
            }
        }
    }

    public final void zzj(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzji) {
            zzji zzji = (zzji) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzji.zzd(this.zza.zzg());
                } while (this.zza.zzc() < zzc2);
            } else if (i10 == 5) {
                do {
                    zzji.zzd(this.zza.zzg());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else {
                throw zzjq.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zzj2 = this.zza.zzj();
                zzc(zzj2);
                int zzc3 = this.zza.zzc() + zzj2;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzc() < zzc3);
            } else if (i11 == 5) {
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else {
                throw zzjq.zza();
            }
        }
    }

    public final void zzk(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzkg) {
            zzkg zzkg = (zzkg) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzkg.zza(this.zza.zzn());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzkg.zza(this.zza.zzn());
                } while (this.zza.zzc() < zzc2);
            } else {
                throw zzjq.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzj2 = this.zza.zzj();
                zzd(zzj2);
                int zzc3 = this.zza.zzc() + zzj2;
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                } while (this.zza.zzc() < zzc3);
            } else {
                throw zzjq.zza();
            }
        }
    }

    public final void zzl(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzji) {
            zzji zzji = (zzji) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzji.zzd(this.zza.zzh());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzji.zzd(this.zza.zzh());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzjq.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzjq.zza();
            }
        }
    }

    public final void zzm(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzkg) {
            zzkg zzkg = (zzkg) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzkg.zza(this.zza.zzo());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzkg.zza(this.zza.zzo());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzjq.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzjq.zza();
            }
        }
    }

    public final void zzn(List<String> list) {
        zza(list, false);
    }

    public final void zzo(List<String> list) {
        zza(list, true);
    }

    public final void zzp(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzji) {
            zzji zzji = (zzji) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzji.zzd(this.zza.zzj());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzji.zzd(this.zza.zzj());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzjq.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzjq.zza();
            }
        }
    }

    public final void zzq(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzkg) {
            zzkg zzkg = (zzkg) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzkg.zza(this.zza.zzp());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzkg.zza(this.zza.zzp());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzjq.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzjq.zza();
            }
        }
    }

    private final Object zza(zzmv zzmv, Class<?> cls, zzis zzis) {
        switch (zzim.zza[zzmv.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzs());
            case 2:
                return zzp();
            case 3:
                return Double.valueOf(zza());
            case 4:
                return Integer.valueOf(zze());
            case 5:
                return Integer.valueOf(zzf());
            case 6:
                return Long.valueOf(zzk());
            case 7:
                return Float.valueOf(zzb());
            case 8:
                return Integer.valueOf(zzg());
            case 9:
                return Long.valueOf(zzl());
            case 10:
                zzb(2);
                return zzb(zzlf.zza().zza(cls), zzis);
            case 11:
                return Integer.valueOf(zzh());
            case 12:
                return Long.valueOf(zzm());
            case 13:
                return Integer.valueOf(zzi());
            case 14:
                return Long.valueOf(zzn());
            case 15:
                return zzr();
            case 16:
                return Integer.valueOf(zzj());
            case 17:
                return Long.valueOf(zzo());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private final <T> void zzc(T t10, zzlj<T> zzlj, zzis zzis) {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzlj.zza(t10, this, zzis);
            if (this.zzb != this.zzc) {
                throw zzjq.zzg();
            }
        } finally {
            this.zzc = i10;
        }
    }

    public final <T> void zzb(T t10, zzlj<T> zzlj, zzis zzis) {
        zzb(2);
        zzd(t10, zzlj, zzis);
    }

    public final void zzb(List<zzhu> list) {
        int zzi;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                if (!this.zza.zzt()) {
                    zzi = this.zza.zzi();
                } else {
                    return;
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzjq.zza();
    }

    public final void zzd(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzji) {
            zzji zzji = (zzji) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzji.zzd(this.zza.zzd());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzji.zzd(this.zza.zzd());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzjq.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzd()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzd()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzjq.zza();
            }
        }
    }

    public final <T> void zzb(List<T> list, zzlj<T> zzlj, zzis zzis) {
        int zzi;
        int i10 = this.zzb;
        if ((i10 & 7) == 2) {
            do {
                list.add(zzb(zzlj, zzis));
                if (!this.zza.zzt() && this.zzd == 0) {
                    zzi = this.zza.zzi();
                } else {
                    return;
                }
            } while (zzi == i10);
            this.zzd = zzi;
            return;
        }
        throw zzjq.zza();
    }

    public final void zzc(List<Double> list) {
        int zzi;
        int zzi2;
        if (list instanceof zziq) {
            zziq zziq = (zziq) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zziq.zza(this.zza.zza());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zziq.zza(this.zza.zza());
                } while (this.zza.zzc() < zzc2);
            } else {
                throw zzjq.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 1) {
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzj2 = this.zza.zzj();
                zzd(zzj2);
                int zzc3 = this.zza.zzc() + zzj2;
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                } while (this.zza.zzc() < zzc3);
            } else {
                throw zzjq.zza();
            }
        }
    }

    private final void zzb(int i10) {
        if ((this.zzb & 7) != i10) {
            throw zzjq.zza();
        }
    }

    private final <T> T zza(zzlj<T> zzlj, zzis zzis) {
        T zza2 = zzlj.zza();
        zzc(zza2, zzlj, zzis);
        zzlj.zzc(zza2);
        return zza2;
    }

    public final <T> void zza(T t10, zzlj<T> zzlj, zzis zzis) {
        zzb(3);
        zzc(t10, zzlj, zzis);
    }

    public final void zza(List<Boolean> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzhs) {
            zzhs zzhs = (zzhs) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzhs.zza(this.zza.zzu());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzhs.zza(this.zza.zzu());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzjq.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Boolean.valueOf(this.zza.zzu()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Boolean.valueOf(this.zza.zzu()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzjq.zza();
            }
        }
    }

    private static void zzd(int i10) {
        if ((i10 & 7) != 0) {
            throw zzjq.zzg();
        }
    }

    private static void zzc(int i10) {
        if ((i10 & 3) != 0) {
            throw zzjq.zzg();
        }
    }

    @Deprecated
    public final <T> void zza(List<T> list, zzlj<T> zzlj, zzis zzis) {
        int zzi;
        int i10 = this.zzb;
        if ((i10 & 7) == 3) {
            do {
                list.add(zza(zzlj, zzis));
                if (!this.zza.zzt() && this.zzd == 0) {
                    zzi = this.zza.zzi();
                } else {
                    return;
                }
            } while (zzi == i10);
            this.zzd = zzi;
            return;
        }
        throw zzjq.zza();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (zzt() != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        throw new com.google.android.gms.internal.measurement.zzjq("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void zza(java.util.Map<K, V> r8, com.google.android.gms.internal.measurement.zzkm<K, V> r9, com.google.android.gms.internal.measurement.zzis r10) {
        /*
            r7 = this;
            r0 = 2
            r7.zzb((int) r0)
            com.google.android.gms.internal.measurement.zzij r1 = r7.zza
            int r1 = r1.zzj()
            com.google.android.gms.internal.measurement.zzij r2 = r7.zza
            int r1 = r2.zza((int) r1)
            K r2 = r9.zzb
            V r3 = r9.zzd
        L_0x0014:
            int r4 = r7.zzc()     // Catch:{ all -> 0x0064 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005b
            com.google.android.gms.internal.measurement.zzij r5 = r7.zza     // Catch:{ all -> 0x0064 }
            boolean r5 = r5.zzt()     // Catch:{ all -> 0x0064 }
            if (r5 != 0) goto L_0x005b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0046
            if (r4 == r0) goto L_0x0039
            boolean r4 = r7.zzt()     // Catch:{ zzjp -> 0x004e }
            if (r4 == 0) goto L_0x0033
            goto L_0x0014
        L_0x0033:
            com.google.android.gms.internal.measurement.zzjq r4 = new com.google.android.gms.internal.measurement.zzjq     // Catch:{ zzjp -> 0x004e }
            r4.<init>(r6)     // Catch:{ zzjp -> 0x004e }
            throw r4     // Catch:{ zzjp -> 0x004e }
        L_0x0039:
            com.google.android.gms.internal.measurement.zzmv r4 = r9.zzc     // Catch:{ zzjp -> 0x004e }
            V r5 = r9.zzd     // Catch:{ zzjp -> 0x004e }
            java.lang.Class r5 = r5.getClass()     // Catch:{ zzjp -> 0x004e }
            java.lang.Object r3 = r7.zza((com.google.android.gms.internal.measurement.zzmv) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.measurement.zzis) r10)     // Catch:{ zzjp -> 0x004e }
            goto L_0x0014
        L_0x0046:
            com.google.android.gms.internal.measurement.zzmv r4 = r9.zza     // Catch:{ zzjp -> 0x004e }
            r5 = 0
            java.lang.Object r2 = r7.zza((com.google.android.gms.internal.measurement.zzmv) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.measurement.zzis) r5)     // Catch:{ zzjp -> 0x004e }
            goto L_0x0014
        L_0x004e:
            boolean r4 = r7.zzt()     // Catch:{ all -> 0x0064 }
            if (r4 == 0) goto L_0x0055
            goto L_0x0014
        L_0x0055:
            com.google.android.gms.internal.measurement.zzjq r8 = new com.google.android.gms.internal.measurement.zzjq     // Catch:{ all -> 0x0064 }
            r8.<init>(r6)     // Catch:{ all -> 0x0064 }
            throw r8     // Catch:{ all -> 0x0064 }
        L_0x005b:
            r8.put(r2, r3)     // Catch:{ all -> 0x0064 }
            com.google.android.gms.internal.measurement.zzij r8 = r7.zza
            r8.zzc(r1)
            return
        L_0x0064:
            r8 = move-exception
            com.google.android.gms.internal.measurement.zzij r9 = r7.zza
            r9.zzc(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzin.zza(java.util.Map, com.google.android.gms.internal.measurement.zzkm, com.google.android.gms.internal.measurement.zzis):void");
    }

    private final void zza(List<String> list, boolean z10) {
        int zzi;
        int zzi2;
        if ((this.zzb & 7) != 2) {
            throw zzjq.zza();
        } else if (!(list instanceof zzjx) || z10) {
            do {
                list.add(z10 ? zzr() : zzq());
                if (!this.zza.zzt()) {
                    zzi = this.zza.zzi();
                } else {
                    return;
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
        } else {
            zzjx zzjx = (zzjx) list;
            do {
                zzjx.zza(zzp());
                if (!this.zza.zzt()) {
                    zzi2 = this.zza.zzi();
                } else {
                    return;
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
        }
    }

    private final void zza(int i10) {
        if (this.zza.zzc() != i10) {
            throw zzjq.zzh();
        }
    }
}
