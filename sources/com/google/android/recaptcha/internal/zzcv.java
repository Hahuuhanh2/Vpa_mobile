package com.google.android.recaptcha.internal;

import al.d0;
import com.google.android.recaptcha.RecaptchaAction;
import ik.d;
import jk.a;
import kk.i;
import kotlinx.coroutines.TimeoutCancellationException;
import p3.l0;
import rk.p;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzcv extends i implements p {
    public int zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzdc zzc;
    public final /* synthetic */ zzcx zzd;
    public final /* synthetic */ RecaptchaAction zze;
    public final /* synthetic */ zzpw zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcv(long j10, zzdc zzdc, zzcx zzcx, RecaptchaAction recaptchaAction, zzpw zzpw, d dVar) {
        super(2, dVar);
        this.zzb = j10;
        this.zzc = zzdc;
        this.zzd = zzcx;
        this.zze = recaptchaAction;
        this.zzf = zzpw;
    }

    public final d create(Object obj, d dVar) {
        return new zzcv(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcv) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.zza != 0) {
            try {
                l0.Q0(obj);
            } catch (TimeoutCancellationException unused) {
                throw new zzbj(zzbh.zzc, zzbg.zzb, (String) null);
            } catch (zzbj e10) {
                throw e10;
            } catch (Exception unused2) {
                throw new zzbj(zzbh.zzb, zzbg.zza, (String) null);
            }
        } else {
            l0.Q0(obj);
            long j10 = this.zzb;
            zzcu zzcu = new zzcu(this.zzc, this.zzd, this.zze, this.zzf, (d) null);
            this.zza = 1;
            obj = l0.W0(j10, zzcu, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return (zzqf) obj;
    }
}
