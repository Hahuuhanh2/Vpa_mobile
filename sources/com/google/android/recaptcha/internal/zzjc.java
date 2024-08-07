package com.google.android.recaptcha.internal;

import java.nio.charset.Charset;
import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzjc implements zzmj {
    private final zzjb zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzjc(zzjb zzjb) {
        Charset charset = zzla.zza;
        this.zza = zzjb;
        zzjb.zzc = this;
    }

    private final void zzP(Object obj, zzmk zzmk, zzkd zzkd) {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzmk.zzh(obj, this, zzkd);
            if (this.zzb != this.zzc) {
                throw zzlc.zzg();
            }
        } finally {
            this.zzc = i10;
        }
    }

    private final void zzQ(Object obj, zzmk zzmk, zzkd zzkd) {
        zzjb zzjb = this.zza;
        int zzn = zzjb.zzn();
        if (zzjb.zza < zzjb.zzb) {
            int zze = this.zza.zze(zzn);
            this.zza.zza++;
            zzmk.zzh(obj, this, zzkd);
            this.zza.zzz(0);
            zzjb zzjb2 = this.zza;
            zzjb2.zza--;
            zzjb2.zzA(zze);
            return;
        }
        throw new zzlc("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final void zzR(int i10) {
        if (this.zza.zzd() != i10) {
            throw zzlc.zzi();
        }
    }

    private final void zzS(int i10) {
        if ((this.zzb & 7) != i10) {
            throw zzlc.zza();
        }
    }

    private static final void zzT(int i10) {
        if ((i10 & 3) != 0) {
            throw zzlc.zzg();
        }
    }

    private static final void zzU(int i10) {
        if ((i10 & 7) != 0) {
            throw zzlc.zzg();
        }
    }

    public static zzjc zzq(zzjb zzjb) {
        zzjc zzjc = zzjb.zzc;
        if (zzjc != null) {
            return zzjc;
        }
        return new zzjc(zzjb);
    }

    public final void zzA(List list) {
        int i10;
        int zzm;
        if (list instanceof zzlm) {
            zzlm zzlm = (zzlm) list;
            int i11 = this.zzb & 7;
            if (i11 == 1) {
                do {
                    zzlm.zzg(this.zza.zzo());
                    if (!this.zza.zzC()) {
                        i10 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i10 == this.zzb);
            } else if (i11 == 2) {
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzlm.zzg(this.zza.zzo());
                } while (this.zza.zzd() < zzd2);
                return;
            } else {
                throw zzlc.zza();
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i10 = zzm;
            } else if (i12 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzd() < zzd3);
                return;
            } else {
                throw zzlc.zza();
            }
        }
        this.zzd = i10;
    }

    public final void zzB(List list) {
        int i10;
        int zzm;
        if (list instanceof zzkk) {
            zzkk zzkk = (zzkk) list;
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzkk.zzf(this.zza.zzc());
                } while (this.zza.zzd() < zzd2);
                return;
            } else if (i11 == 5) {
                do {
                    zzkk.zzf(this.zza.zzc());
                    if (!this.zza.zzC()) {
                        i10 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i10 == this.zzb);
            } else {
                throw zzlc.zza();
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < zzd3);
                return;
            } else if (i12 == 5) {
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i10 = zzm;
            } else {
                throw zzlc.zza();
            }
        }
        this.zzd = i10;
    }

    @Deprecated
    public final void zzC(List list, zzmk zzmk, zzkd zzkd) {
        int zzm;
        int i10 = this.zzb;
        if ((i10 & 7) == 3) {
            do {
                Object zze = zzmk.zze();
                zzP(zze, zzmk, zzkd);
                zzmk.zzf(zze);
                list.add(zze);
                if (!this.zza.zzC() && this.zzd == 0) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == i10);
            this.zzd = zzm;
            return;
        }
        throw zzlc.zza();
    }

    public final void zzD(List list) {
        int i10;
        int zzm;
        if (list instanceof zzkt) {
            zzkt zzkt = (zzkt) list;
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    zzkt.zzh(this.zza.zzh());
                    if (!this.zza.zzC()) {
                        i10 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i10 == this.zzb);
            } else if (i11 == 2) {
                zzjb zzjb = this.zza;
                int zzd2 = zzjb.zzd() + zzjb.zzn();
                do {
                    zzkt.zzh(this.zza.zzh());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            } else {
                throw zzlc.zza();
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i10 = zzm;
            } else if (i12 == 2) {
                zzjb zzjb2 = this.zza;
                int zzd3 = zzjb2.zzd() + zzjb2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
                return;
            } else {
                throw zzlc.zza();
            }
        }
        this.zzd = i10;
    }

    public final void zzE(List list) {
        int i10;
        int zzm;
        if (list instanceof zzlm) {
            zzlm zzlm = (zzlm) list;
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    zzlm.zzg(this.zza.zzp());
                    if (!this.zza.zzC()) {
                        i10 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i10 == this.zzb);
            } else if (i11 == 2) {
                zzjb zzjb = this.zza;
                int zzd2 = zzjb.zzd() + zzjb.zzn();
                do {
                    zzlm.zzg(this.zza.zzp());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            } else {
                throw zzlc.zza();
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i10 = zzm;
            } else if (i12 == 2) {
                zzjb zzjb2 = this.zza;
                int zzd3 = zzjb2.zzd() + zzjb2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
                return;
            } else {
                throw zzlc.zza();
            }
        }
        this.zzd = i10;
    }

    public final void zzF(List list, zzmk zzmk, zzkd zzkd) {
        int zzm;
        int i10 = this.zzb;
        if ((i10 & 7) == 2) {
            do {
                Object zze = zzmk.zze();
                zzQ(zze, zzmk, zzkd);
                zzmk.zzf(zze);
                list.add(zze);
                if (!this.zza.zzC() && this.zzd == 0) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == i10);
            this.zzd = zzm;
            return;
        }
        throw zzlc.zza();
    }

    public final void zzG(List list) {
        int i10;
        int zzm;
        if (list instanceof zzkt) {
            zzkt zzkt = (zzkt) list;
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzkt.zzh(this.zza.zzk());
                } while (this.zza.zzd() < zzd2);
                return;
            } else if (i11 == 5) {
                do {
                    zzkt.zzh(this.zza.zzk());
                    if (!this.zza.zzC()) {
                        i10 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i10 == this.zzb);
            } else {
                throw zzlc.zza();
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < zzd3);
                return;
            } else if (i12 == 5) {
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i10 = zzm;
            } else {
                throw zzlc.zza();
            }
        }
        this.zzd = i10;
    }

    public final void zzH(List list) {
        int i10;
        int zzm;
        if (list instanceof zzlm) {
            zzlm zzlm = (zzlm) list;
            int i11 = this.zzb & 7;
            if (i11 == 1) {
                do {
                    zzlm.zzg(this.zza.zzt());
                    if (!this.zza.zzC()) {
                        i10 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i10 == this.zzb);
            } else if (i11 == 2) {
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzlm.zzg(this.zza.zzt());
                } while (this.zza.zzd() < zzd2);
                return;
            } else {
                throw zzlc.zza();
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i10 = zzm;
            } else if (i12 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzd() < zzd3);
                return;
            } else {
                throw zzlc.zza();
            }
        }
        this.zzd = i10;
    }

    public final void zzI(List list) {
        int i10;
        int zzm;
        if (list instanceof zzkt) {
            zzkt zzkt = (zzkt) list;
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    zzkt.zzh(this.zza.zzl());
                    if (!this.zza.zzC()) {
                        i10 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i10 == this.zzb);
            } else if (i11 == 2) {
                zzjb zzjb = this.zza;
                int zzd2 = zzjb.zzd() + zzjb.zzn();
                do {
                    zzkt.zzh(this.zza.zzl());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            } else {
                throw zzlc.zza();
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i10 = zzm;
            } else if (i12 == 2) {
                zzjb zzjb2 = this.zza;
                int zzd3 = zzjb2.zzd() + zzjb2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
                return;
            } else {
                throw zzlc.zza();
            }
        }
        this.zzd = i10;
    }

    public final void zzJ(List list) {
        int i10;
        int zzm;
        if (list instanceof zzlm) {
            zzlm zzlm = (zzlm) list;
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    zzlm.zzg(this.zza.zzu());
                    if (!this.zza.zzC()) {
                        i10 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i10 == this.zzb);
            } else if (i11 == 2) {
                zzjb zzjb = this.zza;
                int zzd2 = zzjb.zzd() + zzjb.zzn();
                do {
                    zzlm.zzg(this.zza.zzu());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            } else {
                throw zzlc.zza();
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i10 = zzm;
            } else if (i12 == 2) {
                zzjb zzjb2 = this.zza;
                int zzd3 = zzjb2.zzd() + zzjb2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
                return;
            } else {
                throw zzlc.zza();
            }
        }
        this.zzd = i10;
    }

    public final void zzK(List list, boolean z10) {
        String str;
        int zzm;
        int i10;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzlj) && !z10) {
                zzlj zzlj = (zzlj) list;
                do {
                    zzp();
                    zzlj.zzb();
                    if (!this.zza.zzC()) {
                        i10 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i10 == this.zzb);
            } else {
                do {
                    if (z10) {
                        str = zzs();
                    } else {
                        str = zzr();
                    }
                    list.add(str);
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i10 = zzm;
            }
            this.zzd = i10;
            return;
        }
        throw zzlc.zza();
    }

    public final void zzL(List list) {
        int i10;
        int zzm;
        if (list instanceof zzkt) {
            zzkt zzkt = (zzkt) list;
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    zzkt.zzh(this.zza.zzn());
                    if (!this.zza.zzC()) {
                        i10 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i10 == this.zzb);
            } else if (i11 == 2) {
                zzjb zzjb = this.zza;
                int zzd2 = zzjb.zzd() + zzjb.zzn();
                do {
                    zzkt.zzh(this.zza.zzn());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            } else {
                throw zzlc.zza();
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i10 = zzm;
            } else if (i12 == 2) {
                zzjb zzjb2 = this.zza;
                int zzd3 = zzjb2.zzd() + zzjb2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
                return;
            } else {
                throw zzlc.zza();
            }
        }
        this.zzd = i10;
    }

    public final void zzM(List list) {
        int i10;
        int zzm;
        if (list instanceof zzlm) {
            zzlm zzlm = (zzlm) list;
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    zzlm.zzg(this.zza.zzv());
                    if (!this.zza.zzC()) {
                        i10 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i10 == this.zzb);
            } else if (i11 == 2) {
                zzjb zzjb = this.zza;
                int zzd2 = zzjb.zzd() + zzjb.zzn();
                do {
                    zzlm.zzg(this.zza.zzv());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            } else {
                throw zzlc.zza();
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i10 = zzm;
            } else if (i12 == 2) {
                zzjb zzjb2 = this.zza;
                int zzd3 = zzjb2.zzd() + zzjb2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
                return;
            } else {
                throw zzlc.zza();
            }
        }
        this.zzd = i10;
    }

    public final boolean zzN() {
        zzS(0);
        return this.zza.zzD();
    }

    public final boolean zzO() {
        int i10;
        if (this.zza.zzC() || (i10 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzE(i10);
    }

    public final double zza() {
        zzS(1);
        return this.zza.zzb();
    }

    public final float zzb() {
        zzS(5);
        return this.zza.zzc();
    }

    public final int zzc() {
        int i10 = this.zzd;
        if (i10 != 0) {
            this.zzb = i10;
            this.zzd = 0;
        } else {
            i10 = this.zza.zzm();
            this.zzb = i10;
        }
        if (i10 == 0 || i10 == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i10 >>> 3;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzS(0);
        return this.zza.zzf();
    }

    public final int zzf() {
        zzS(5);
        return this.zza.zzg();
    }

    public final int zzg() {
        zzS(0);
        return this.zza.zzh();
    }

    public final int zzh() {
        zzS(5);
        return this.zza.zzk();
    }

    public final int zzi() {
        zzS(0);
        return this.zza.zzl();
    }

    public final int zzj() {
        zzS(0);
        return this.zza.zzn();
    }

    public final long zzk() {
        zzS(1);
        return this.zza.zzo();
    }

    public final long zzl() {
        zzS(0);
        return this.zza.zzp();
    }

    public final long zzm() {
        zzS(1);
        return this.zza.zzt();
    }

    public final long zzn() {
        zzS(0);
        return this.zza.zzu();
    }

    public final long zzo() {
        zzS(0);
        return this.zza.zzv();
    }

    public final zziv zzp() {
        zzS(2);
        return this.zza.zzw();
    }

    public final String zzr() {
        zzS(2);
        return this.zza.zzx();
    }

    public final String zzs() {
        zzS(2);
        return this.zza.zzy();
    }

    public final void zzt(Object obj, zzmk zzmk, zzkd zzkd) {
        zzS(3);
        zzP(obj, zzmk, zzkd);
    }

    public final void zzu(Object obj, zzmk zzmk, zzkd zzkd) {
        zzS(2);
        zzQ(obj, zzmk, zzkd);
    }

    public final void zzv(List list) {
        int i10;
        int zzm;
        if (list instanceof zzim) {
            zzim zzim = (zzim) list;
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    zzim.zze(this.zza.zzD());
                    if (!this.zza.zzC()) {
                        i10 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i10 == this.zzb);
            } else if (i11 == 2) {
                zzjb zzjb = this.zza;
                int zzd2 = zzjb.zzd() + zzjb.zzn();
                do {
                    zzim.zze(this.zza.zzD());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            } else {
                throw zzlc.zza();
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 == 0) {
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i10 = zzm;
            } else if (i12 == 2) {
                zzjb zzjb2 = this.zza;
                int zzd3 = zzjb2.zzd() + zzjb2.zzn();
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
                return;
            } else {
                throw zzlc.zza();
            }
        }
        this.zzd = i10;
    }

    public final void zzw(List list) {
        int zzm;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        throw zzlc.zza();
    }

    public final void zzx(List list) {
        int i10;
        int zzm;
        if (list instanceof zzjx) {
            zzjx zzjx = (zzjx) list;
            int i11 = this.zzb & 7;
            if (i11 == 1) {
                do {
                    zzjx.zzf(this.zza.zzb());
                    if (!this.zza.zzC()) {
                        i10 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i10 == this.zzb);
            } else if (i11 == 2) {
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzjx.zzf(this.zza.zzb());
                } while (this.zza.zzd() < zzd2);
                return;
            } else {
                throw zzlc.zza();
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 == 1) {
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i10 = zzm;
            } else if (i12 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                } while (this.zza.zzd() < zzd3);
                return;
            } else {
                throw zzlc.zza();
            }
        }
        this.zzd = i10;
    }

    public final void zzy(List list) {
        int i10;
        int zzm;
        if (list instanceof zzkt) {
            zzkt zzkt = (zzkt) list;
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    zzkt.zzh(this.zza.zzf());
                    if (!this.zza.zzC()) {
                        i10 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i10 == this.zzb);
            } else if (i11 == 2) {
                zzjb zzjb = this.zza;
                int zzd2 = zzjb.zzd() + zzjb.zzn();
                do {
                    zzkt.zzh(this.zza.zzf());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            } else {
                throw zzlc.zza();
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i10 = zzm;
            } else if (i12 == 2) {
                zzjb zzjb2 = this.zza;
                int zzd3 = zzjb2.zzd() + zzjb2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
                return;
            } else {
                throw zzlc.zza();
            }
        }
        this.zzd = i10;
    }

    public final void zzz(List list) {
        int i10;
        int zzm;
        if (list instanceof zzkt) {
            zzkt zzkt = (zzkt) list;
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzkt.zzh(this.zza.zzg());
                } while (this.zza.zzd() < zzd2);
                return;
            } else if (i11 == 5) {
                do {
                    zzkt.zzh(this.zza.zzg());
                    if (!this.zza.zzC()) {
                        i10 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i10 == this.zzb);
            } else {
                throw zzlc.zza();
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < zzd3);
                return;
            } else if (i12 == 5) {
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i10 = zzm;
            } else {
                throw zzlc.zza();
            }
        }
        this.zzd = i10;
    }
}
