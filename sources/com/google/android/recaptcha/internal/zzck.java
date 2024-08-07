package com.google.android.recaptcha.internal;

import al.d0;
import android.app.Application;
import ik.d;
import jk.a;
import kk.i;
import kotlinx.coroutines.TimeoutCancellationException;
import p3.l0;
import rk.p;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzck extends i implements p {
    public int zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ Application zzc;
    public final /* synthetic */ String zzd;
    public final /* synthetic */ zzdc zze;
    public final /* synthetic */ zzbl zzf;
    public final /* synthetic */ zzdq zzg;
    public final /* synthetic */ zzbv zzh;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzck(long j10, Application application, String str, zzdc zzdc, zzbl zzbl, zzdq zzdq, zzbv zzbv, d dVar) {
        super(2, dVar);
        this.zzb = j10;
        this.zzc = application;
        this.zzd = str;
        this.zze = zzdc;
        this.zzf = zzbl;
        this.zzg = zzdq;
        this.zzh = zzbv;
    }

    public final d create(Object obj, d dVar) {
        return new zzck(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzck) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        zzbj zzbj;
        zzbj zzbj2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.zza != 0) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                zzco zzco = zzco.zza;
                if (e10 instanceof TimeoutCancellationException) {
                    zzbj2 = new zzbj(zzbh.zzc, zzbg.zzb, e10.getMessage());
                } else if (e10 instanceof zzbj) {
                    zzbj = (zzbj) e10;
                    throw zzbj;
                } else {
                    zzbj2 = new zzbj(zzbh.zzb, zzbg.zza, e10.getMessage());
                }
                zzbj = zzbj2;
                throw zzbj;
            }
        } else {
            l0.Q0(obj);
            long j10 = this.zzb;
            zzcj zzcj = new zzcj(this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, (d) null);
            this.zza = 1;
            obj = l0.W0(j10, zzcj, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return (zzpq) obj;
    }
}
