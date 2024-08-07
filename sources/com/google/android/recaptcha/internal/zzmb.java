package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzmb implements zzmk {
    private final zzlx zza;
    private final zznb zzb;
    private final boolean zzc;
    private final zzke zzd;

    private zzmb(zznb zznb, zzke zzke, zzlx zzlx) {
        this.zzb = zznb;
        this.zzc = zzke.zzj(zzlx);
        this.zzd = zzke;
        this.zza = zzlx;
    }

    public static zzmb zzc(zznb zznb, zzke zzke, zzlx zzlx) {
        return new zzmb(zznb, zzke, zzlx);
    }

    public final int zza(Object obj) {
        zznb zznb = this.zzb;
        int zzb2 = zznb.zzb(zznb.zzd(obj));
        if (this.zzc) {
            return zzb2 + this.zzd.zzb(obj).zzb();
        }
        return zzb2;
    }

    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (this.zzc) {
            return (hashCode * 53) + this.zzd.zzb(obj).zza.hashCode();
        }
        return hashCode;
    }

    public final Object zze() {
        zzlx zzlx = this.zza;
        if (zzlx instanceof zzks) {
            return ((zzks) zzlx).zzt();
        }
        return zzlx.zzaa().zzk();
    }

    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zzf(obj);
    }

    public final void zzg(Object obj, Object obj2) {
        zzmm.zzr(this.zzb, obj, obj2);
        if (this.zzc) {
            zzmm.zzq(this.zzd, obj, obj2);
        }
    }

    public final void zzh(Object obj, zzmj zzmj, zzkd zzkd) {
        boolean z10;
        zznb zznb = this.zzb;
        Object zzc2 = zznb.zzc(obj);
        zzke zzke = this.zzd;
        zzki zzc3 = zzke.zzc(obj);
        while (true) {
            if (zzmj.zzc() == Integer.MAX_VALUE) {
                break;
            }
            int zzd2 = zzmj.zzd();
            if (zzd2 != 11) {
                if ((zzd2 & 7) == 2) {
                    Object zzd3 = zzke.zzd(zzkd, this.zza, zzd2 >>> 3);
                    if (zzd3 != null) {
                        zzke.zzg(zzmj, zzd3, zzkd, zzc3);
                    } else {
                        z10 = zznb.zzr(zzc2, zzmj);
                    }
                } else {
                    z10 = zzmj.zzO();
                }
                if (!z10) {
                    break;
                }
            } else {
                int i10 = 0;
                Object obj2 = null;
                zziv zziv = null;
                while (true) {
                    try {
                        if (zzmj.zzc() == Integer.MAX_VALUE) {
                            break;
                        }
                        int zzd4 = zzmj.zzd();
                        if (zzd4 == 16) {
                            i10 = zzmj.zzj();
                            obj2 = zzke.zzd(zzkd, this.zza, i10);
                        } else if (zzd4 == 26) {
                            if (obj2 != null) {
                                zzke.zzg(zzmj, obj2, zzkd, zzc3);
                            } else {
                                zziv = zzmj.zzp();
                            }
                        } else if (!zzmj.zzO()) {
                            break;
                        }
                    } catch (Throwable th2) {
                        zznb.zzn(obj, zzc2);
                        throw th2;
                    }
                }
                if (zzmj.zzd() != 12) {
                    throw zzlc.zzb();
                } else if (zziv != null) {
                    if (obj2 != null) {
                        zzke.zzh(zziv, obj2, zzkd, zzc3);
                    } else {
                        zznb.zzk(zzc2, i10, zziv);
                    }
                }
            }
        }
        zznb.zzn(obj, zzc2);
    }

    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzik zzik) {
        zzks zzks = (zzks) obj;
        zznc zznc = zzks.zzc;
        if (zznc == zznc.zzc()) {
            zznc = zznc.zzf();
            zzks.zzc = zznc;
        }
        ((zzko) obj).zzi();
        Object obj2 = null;
        while (i10 < i11) {
            int zzi = zzil.zzi(bArr, i10, zzik);
            int i12 = zzik.zza;
            if (i12 == 11) {
                int i13 = 0;
                zziv zziv = null;
                while (zzi < i11) {
                    zzi = zzil.zzi(bArr, zzi, zzik);
                    int i14 = zzik.zza;
                    int i15 = i14 >>> 3;
                    int i16 = i14 & 7;
                    if (i15 != 2) {
                        if (i15 == 3) {
                            if (obj2 != null) {
                                int i17 = zzmg.zza;
                                throw null;
                            } else if (i16 == 2) {
                                zzi = zzil.zza(bArr, zzi, zzik);
                                zziv = (zziv) zzik.zzc;
                            }
                        }
                    } else if (i16 == 0) {
                        zzi = zzil.zzi(bArr, zzi, zzik);
                        i13 = zzik.zza;
                        obj2 = this.zzd.zzd(zzik.zzd, this.zza, i13);
                    }
                    if (i14 == 12) {
                        break;
                    }
                    zzi = zzil.zzo(i14, bArr, zzi, i11, zzik);
                }
                if (zziv != null) {
                    zznc.zzj((i13 << 3) | 2, zziv);
                }
                i10 = zzi;
            } else if ((i12 & 7) == 2) {
                obj2 = this.zzd.zzd(zzik.zzd, this.zza, i12 >>> 3);
                if (obj2 == null) {
                    i10 = zzil.zzh(i12, bArr, zzi, i11, zznc, zzik);
                } else {
                    int i18 = zzmg.zza;
                    throw null;
                }
            } else {
                i10 = zzil.zzo(i12, bArr, zzi, i11, zzik);
            }
        }
        if (i10 != i11) {
            throw zzlc.zzg();
        }
    }

    public final void zzj(Object obj, zzno zzno) {
        Iterator zzf = this.zzd.zzb(obj).zzf();
        while (zzf.hasNext()) {
            Map.Entry entry = (Map.Entry) zzf.next();
            zzkh zzkh = (zzkh) entry.getKey();
            if (zzkh.zze() == zznn.MESSAGE) {
                zzkh.zzg();
                zzkh.zzf();
                if (entry instanceof zzlf) {
                    zzno.zzw(zzkh.zza(), ((zzlf) entry).zza().zzb());
                } else {
                    zzno.zzw(zzkh.zza(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zznb zznb = this.zzb;
        zznb.zzp(zznb.zzd(obj), zzno);
    }

    public final boolean zzk(Object obj, Object obj2) {
        zznb zznb = this.zzb;
        if (!zznb.zzd(obj).equals(zznb.zzd(obj2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zzb(obj).equals(this.zzd.zzb(obj2));
        }
        return true;
    }

    public final boolean zzl(Object obj) {
        return this.zzd.zzb(obj).zzk();
    }
}
