package com.google.android.recaptcha.internal;

import java.nio.charset.Charset;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzkf extends zzke {
    public final int zza(Map.Entry entry) {
        return ((zzkp) entry.getKey()).zza;
    }

    public final zzki zzb(Object obj) {
        return ((zzko) obj).zzb;
    }

    public final zzki zzc(Object obj) {
        return ((zzko) obj).zzi();
    }

    public final Object zzd(zzkd zzkd, zzlx zzlx, int i10) {
        return zzkd.zza(zzlx, i10);
    }

    public final Object zze(Object obj, zzmj zzmj, Object obj2, zzkd zzkd, zzki zzki, Object obj3, zznb zznb) {
        Object zze;
        zzkq zzkq = (zzkq) obj2;
        zznm zznm = zzkq.zza.zzb;
        Object obj4 = null;
        if (zznm != zznm.ENUM) {
            switch (zznm.ordinal()) {
                case 0:
                    obj4 = Double.valueOf(zzmj.zza());
                    break;
                case 1:
                    obj4 = Float.valueOf(zzmj.zzb());
                    break;
                case 2:
                    obj4 = Long.valueOf(zzmj.zzl());
                    break;
                case 3:
                    obj4 = Long.valueOf(zzmj.zzo());
                    break;
                case 4:
                    obj4 = Integer.valueOf(zzmj.zzg());
                    break;
                case 5:
                    obj4 = Long.valueOf(zzmj.zzk());
                    break;
                case 6:
                    obj4 = Integer.valueOf(zzmj.zzf());
                    break;
                case 7:
                    obj4 = Boolean.valueOf(zzmj.zzN());
                    break;
                case 8:
                    obj4 = zzmj.zzr();
                    break;
                case 9:
                    Object zze2 = zzki.zze(zzkq.zza);
                    if (zze2 instanceof zzks) {
                        zzmk zzb = zzmg.zza().zzb(zze2.getClass());
                        if (!((zzks) zze2).zzI()) {
                            Object zze3 = zzb.zze();
                            zzb.zzg(zze3, zze2);
                            zzki.zzi(zzkq.zza, zze3);
                            zze2 = zze3;
                        }
                        zzmj.zzt(zze2, zzb, zzkd);
                        return obj3;
                    }
                    throw null;
                case 10:
                    Object zze4 = zzki.zze(zzkq.zza);
                    if (zze4 instanceof zzks) {
                        zzmk zzb2 = zzmg.zza().zzb(zze4.getClass());
                        if (!((zzks) zze4).zzI()) {
                            Object zze5 = zzb2.zze();
                            zzb2.zzg(zze5, zze4);
                            zzki.zzi(zzkq.zza, zze5);
                            zze4 = zze5;
                        }
                        zzmj.zzu(zze4, zzb2, zzkd);
                        return obj3;
                    }
                    throw null;
                case 11:
                    obj4 = zzmj.zzp();
                    break;
                case 12:
                    obj4 = Integer.valueOf(zzmj.zzj());
                    break;
                case 13:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 14:
                    obj4 = Integer.valueOf(zzmj.zzh());
                    break;
                case 15:
                    obj4 = Long.valueOf(zzmj.zzm());
                    break;
                case 16:
                    obj4 = Integer.valueOf(zzmj.zzi());
                    break;
                case 17:
                    obj4 = Long.valueOf(zzmj.zzn());
                    break;
            }
            int ordinal = zzkq.zza.zzb.ordinal();
            if ((ordinal == 9 || ordinal == 10) && (zze = zzki.zze(zzkq.zza)) != null) {
                Charset charset = zzla.zza;
                obj4 = ((zzlx) zze).zzab().zzc((zzlx) obj4).zzk();
            }
            zzki.zzi(zzkq.zza, obj4);
            return obj3;
        }
        zzmj.zzg();
        throw null;
    }

    public final void zzf(Object obj) {
        ((zzko) obj).zzb.zzg();
    }

    public final void zzg(zzmj zzmj, Object obj, zzkd zzkd, zzki zzki) {
        throw null;
    }

    public final void zzh(zziv zziv, Object obj, zzkd zzkd, zzki zzki) {
        throw null;
    }

    public final void zzi(zzno zzno, Map.Entry entry) {
        zzkp zzkp = (zzkp) entry.getKey();
        zznm zznm = zznm.DOUBLE;
        switch (zzkp.zzb.ordinal()) {
            case 0:
                zzno.zzf(zzkp.zza, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                zzno.zzo(zzkp.zza, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                zzno.zzt(zzkp.zza, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                zzno.zzK(zzkp.zza, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                zzno.zzr(zzkp.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                zzno.zzm(zzkp.zza, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                zzno.zzk(zzkp.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                zzno.zzb(zzkp.zza, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                zzno.zzG(zzkp.zza, (String) entry.getValue());
                return;
            case 9:
                zzno.zzq(zzkp.zza, entry.getValue(), zzmg.zza().zzb(entry.getValue().getClass()));
                return;
            case 10:
                zzno.zzv(zzkp.zza, entry.getValue(), zzmg.zza().zzb(entry.getValue().getClass()));
                return;
            case 11:
                zzno.zzd(zzkp.zza, (zziv) entry.getValue());
                return;
            case 12:
                zzno.zzI(zzkp.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                zzno.zzr(zzkp.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                zzno.zzx(zzkp.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                zzno.zzz(zzkp.zza, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                zzno.zzB(zzkp.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                zzno.zzD(zzkp.zza, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }

    public final boolean zzj(zzlx zzlx) {
        return zzlx instanceof zzko;
    }
}
