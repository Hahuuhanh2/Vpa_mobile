package com.google.android.gms.internal.p001firebaseauthapi;

import java.nio.charset.Charset;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzajm implements zzama {
    private final zzajl zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzajm(zzajl zzajl) {
        Charset charset = zzakq.zza;
        this.zza = zzajl;
        zzajl.zzc = this;
    }

    private final void zzP(Object obj, zzamb zzamb, zzajx zzajx) {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzamb.zzh(obj, this, zzajx);
            if (this.zzb != this.zzc) {
                throw zzaks.zzg();
            }
        } finally {
            this.zzc = i10;
        }
    }

    private final void zzQ(Object obj, zzamb zzamb, zzajx zzajx) {
        zzajl zzajl = this.zza;
        int zzn = zzajl.zzn();
        if (zzajl.zza < zzajl.zzb) {
            int zze = this.zza.zze(zzn);
            this.zza.zza++;
            zzamb.zzh(obj, this, zzajx);
            this.zza.zzz(0);
            zzajl zzajl2 = this.zza;
            zzajl2.zza--;
            zzajl2.zzA(zze);
            return;
        }
        throw new zzaks("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final void zzR(int i10) {
        if (this.zza.zzd() != i10) {
            throw zzaks.zzj();
        }
    }

    private final void zzS(int i10) {
        if ((this.zzb & 7) != i10) {
            throw zzaks.zza();
        }
    }

    private static final void zzT(int i10) {
        if ((i10 & 3) != 0) {
            throw zzaks.zzg();
        }
    }

    private static final void zzU(int i10) {
        if ((i10 & 7) != 0) {
            throw zzaks.zzg();
        }
    }

    public static zzajm zzq(zzajl zzajl) {
        zzajm zzajm = zzajl.zzc;
        if (zzajm != null) {
            return zzajm;
        }
        return new zzajm(zzajl);
    }

    public final void zzA(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzale) {
            zzale zzale = (zzale) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzale.zzf(this.zza.zzo());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzale.zzf(this.zza.zzo());
                } while (this.zza.zzd() < zzd2);
            } else {
                throw zzaks.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzd() < zzd3);
            } else {
                throw zzaks.zza();
            }
        }
    }

    public final void zzB(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzake) {
            zzake zzake = (zzake) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzake.zze(this.zza.zzc());
                } while (this.zza.zzd() < zzd2);
            } else if (i10 == 5) {
                do {
                    zzake.zze(this.zza.zzc());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else {
                throw zzaks.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < zzd3);
            } else if (i11 == 5) {
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else {
                throw zzaks.zza();
            }
        }
    }

    @Deprecated
    public final void zzC(List list, zzamb zzamb, zzajx zzajx) {
        int zzm;
        int i10 = this.zzb;
        if ((i10 & 7) == 3) {
            do {
                Object zze = zzamb.zze();
                zzP(zze, zzamb, zzajx);
                zzamb.zzf(zze);
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
        throw zzaks.zza();
    }

    public final void zzD(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzakl) {
            zzakl zzakl = (zzakl) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzakl.zzf(this.zza.zzh());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                zzajl zzajl = this.zza;
                int zzd2 = zzajl.zzd() + zzajl.zzn();
                do {
                    zzakl.zzf(this.zza.zzh());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzaks.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                zzajl zzajl2 = this.zza;
                int zzd3 = zzajl2.zzd() + zzajl2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzaks.zza();
            }
        }
    }

    public final void zzE(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzale) {
            zzale zzale = (zzale) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzale.zzf(this.zza.zzp());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                zzajl zzajl = this.zza;
                int zzd2 = zzajl.zzd() + zzajl.zzn();
                do {
                    zzale.zzf(this.zza.zzp());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzaks.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                zzajl zzajl2 = this.zza;
                int zzd3 = zzajl2.zzd() + zzajl2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzaks.zza();
            }
        }
    }

    public final void zzF(List list, zzamb zzamb, zzajx zzajx) {
        int zzm;
        int i10 = this.zzb;
        if ((i10 & 7) == 2) {
            do {
                Object zze = zzamb.zze();
                zzQ(zze, zzamb, zzajx);
                zzamb.zzf(zze);
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
        throw zzaks.zza();
    }

    public final void zzG(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzakl) {
            zzakl zzakl = (zzakl) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzakl.zzf(this.zza.zzk());
                } while (this.zza.zzd() < zzd2);
            } else if (i10 == 5) {
                do {
                    zzakl.zzf(this.zza.zzk());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else {
                throw zzaks.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < zzd3);
            } else if (i11 == 5) {
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else {
                throw zzaks.zza();
            }
        }
    }

    public final void zzH(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzale) {
            zzale zzale = (zzale) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzale.zzf(this.zza.zzt());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzale.zzf(this.zza.zzt());
                } while (this.zza.zzd() < zzd2);
            } else {
                throw zzaks.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzd() < zzd3);
            } else {
                throw zzaks.zza();
            }
        }
    }

    public final void zzI(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzakl) {
            zzakl zzakl = (zzakl) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzakl.zzf(this.zza.zzl());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                zzajl zzajl = this.zza;
                int zzd2 = zzajl.zzd() + zzajl.zzn();
                do {
                    zzakl.zzf(this.zza.zzl());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzaks.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                zzajl zzajl2 = this.zza;
                int zzd3 = zzajl2.zzd() + zzajl2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzaks.zza();
            }
        }
    }

    public final void zzJ(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzale) {
            zzale zzale = (zzale) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzale.zzf(this.zza.zzu());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                zzajl zzajl = this.zza;
                int zzd2 = zzajl.zzd() + zzajl.zzn();
                do {
                    zzale.zzf(this.zza.zzu());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzaks.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                zzajl zzajl2 = this.zza;
                int zzd3 = zzajl2.zzd() + zzajl2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzaks.zza();
            }
        }
    }

    public final void zzK(List list, boolean z10) {
        String str;
        int zzm;
        int zzm2;
        if ((this.zzb & 7) != 2) {
            throw zzaks.zza();
        } else if ((list instanceof zzakx) && !z10) {
            zzakx zzakx = (zzakx) list;
            do {
                zzakx.zzi(zzp());
                if (!this.zza.zzC()) {
                    zzm2 = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
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
            this.zzd = zzm;
        }
    }

    public final void zzL(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzakl) {
            zzakl zzakl = (zzakl) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzakl.zzf(this.zza.zzn());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                zzajl zzajl = this.zza;
                int zzd2 = zzajl.zzd() + zzajl.zzn();
                do {
                    zzakl.zzf(this.zza.zzn());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzaks.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                zzajl zzajl2 = this.zza;
                int zzd3 = zzajl2.zzd() + zzajl2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzaks.zza();
            }
        }
    }

    public final void zzM(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzale) {
            zzale zzale = (zzale) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzale.zzf(this.zza.zzv());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                zzajl zzajl = this.zza;
                int zzd2 = zzajl.zzd() + zzajl.zzn();
                do {
                    zzale.zzf(this.zza.zzv());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzaks.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                zzajl zzajl2 = this.zza;
                int zzd3 = zzajl2.zzd() + zzajl2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzaks.zza();
            }
        }
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

    public final zzajf zzp() {
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

    public final void zzt(Object obj, zzamb zzamb, zzajx zzajx) {
        zzS(3);
        zzP(obj, zzamb, zzajx);
    }

    public final void zzu(Object obj, zzamb zzamb, zzajx zzajx) {
        zzS(2);
        zzQ(obj, zzamb, zzajx);
    }

    public final void zzv(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzaiu) {
            zzaiu zzaiu = (zzaiu) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzaiu.zze(this.zza.zzD());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                zzajl zzajl = this.zza;
                int zzd2 = zzajl.zzd() + zzajl.zzn();
                do {
                    zzaiu.zze(this.zza.zzD());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzaks.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                zzajl zzajl2 = this.zza;
                int zzd3 = zzajl2.zzd() + zzajl2.zzn();
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzaks.zza();
            }
        }
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
        throw zzaks.zza();
    }

    public final void zzx(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzaju) {
            zzaju zzaju = (zzaju) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzaju.zze(this.zza.zzb());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzaju.zze(this.zza.zzb());
                } while (this.zza.zzd() < zzd2);
            } else {
                throw zzaks.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 1) {
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                } while (this.zza.zzd() < zzd3);
            } else {
                throw zzaks.zza();
            }
        }
    }

    public final void zzy(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzakl) {
            zzakl zzakl = (zzakl) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzakl.zzf(this.zza.zzf());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                zzajl zzajl = this.zza;
                int zzd2 = zzajl.zzd() + zzajl.zzn();
                do {
                    zzakl.zzf(this.zza.zzf());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzaks.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                zzajl zzajl2 = this.zza;
                int zzd3 = zzajl2.zzd() + zzajl2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzaks.zza();
            }
        }
    }

    public final void zzz(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzakl) {
            zzakl zzakl = (zzakl) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzakl.zzf(this.zza.zzg());
                } while (this.zza.zzd() < zzd2);
            } else if (i10 == 5) {
                do {
                    zzakl.zzf(this.zza.zzg());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else {
                throw zzaks.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < zzd3);
            } else if (i11 == 5) {
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else {
                throw zzaks.zza();
            }
        }
    }
}
