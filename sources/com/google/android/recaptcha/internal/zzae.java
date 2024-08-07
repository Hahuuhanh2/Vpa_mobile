package com.google.android.recaptcha.internal;

import al.d0;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import ik.d;
import jk.a;
import kk.i;
import p3.l0;
import rk.p;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzae extends i implements p {
    public Object zza;
    public int zzb;
    public final /* synthetic */ zzag zzc;
    public final /* synthetic */ String zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzae(zzag zzag, String str, d dVar) {
        super(2, dVar);
        this.zzc = zzag;
        this.zzd = str;
    }

    public final d create(Object obj, d dVar) {
        return new zzae(this.zzc, this.zzd, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzae) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        zzaa zzaa;
        zzdf zzdf;
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.zzb;
        if (i10 == 0) {
            l0.Q0(obj);
            zzdf = zzab.zzb(this.zzc, this.zzd);
            zzag zzag = this.zzc;
            zzap zzg = zzag.zzb;
            String zzh = zzag.zzd;
            this.zza = zzdf;
            this.zzb = 1;
            obj = zzg.zzc(zzh, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 != 1) {
            zzaa = (zzaa) this.zza;
            l0.Q0(obj);
            int zza2 = zzaa.zza();
            zzrh zzrh = (zzrh) ((zzri) obj).zzq();
            zzrh.zze(zzaa.zza());
            return new zzy(zza2, (zzri) zzrh.zzj());
        } else {
            zzdf = (zzdf) this.zza;
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                zzdf.zzb(new zzbj(zzbh.zzb, zzbg.zzab, e10.getMessage()));
                zzag zzag2 = this.zzc;
                this.zza = zzag2;
                int i11 = 2;
                this.zzb = 2;
                if (e10 instanceof StandardIntegrityException) {
                    int errorCode = ((StandardIntegrityException) e10).getErrorCode();
                    if (errorCode == -100) {
                        i11 = 44;
                    } else if (errorCode == -12) {
                        i11 = 39;
                    } else if (errorCode == -3) {
                        i11 = 30;
                    } else if (errorCode == -2) {
                        i11 = 29;
                    } else if (errorCode != -1) {
                        switch (errorCode) {
                            case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID:
                                i11 = 54;
                                break;
                            case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR:
                                i11 = 53;
                                break;
                            case -17:
                                i11 = 52;
                                break;
                            case -16:
                                i11 = 43;
                                break;
                            case -15:
                                i11 = 42;
                                break;
                            case -14:
                                i11 = 41;
                                break;
                            default:
                                switch (errorCode) {
                                    case -9:
                                        i11 = 36;
                                        break;
                                    case -8:
                                        i11 = 35;
                                        break;
                                    case -7:
                                        i11 = 34;
                                        break;
                                    case -6:
                                        i11 = 33;
                                        break;
                                    case -5:
                                        i11 = 32;
                                        break;
                                }
                        }
                    } else {
                        i11 = 28;
                    }
                } else {
                    i11 = 45;
                }
                zzrh zzf = zzri.zzf();
                zzf.zzp(i11);
                zzf.zzq(15);
                obj = zzf.zzj();
                if (obj == aVar) {
                    return aVar;
                }
                zzaa = zzag2;
            }
        }
        zzdf.zza();
        zzag zzag3 = this.zzc;
        zzrj zzf2 = zzrm.zzf();
        zzrk zzf3 = zzrl.zzf();
        zzf3.zzv((String) obj);
        zzf2.zze((zzrl) zzf3.zzj());
        return zzab.zza(zzag3, (zzrm) zzf2.zzj());
    }
}
