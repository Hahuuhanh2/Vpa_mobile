package com.google.android.recaptcha.internal;

import al.d0;
import android.app.Application;
import android.os.Build;
import ik.d;
import jk.a;
import kk.i;
import p3.l0;
import rk.p;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzcj extends i implements p {
    public int zza;
    public final /* synthetic */ Application zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zzdc zzd;
    public final /* synthetic */ zzbl zze;
    public final /* synthetic */ zzdq zzf;
    public final /* synthetic */ zzbv zzg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcj(Application application, String str, zzdc zzdc, zzbl zzbl, zzdq zzdq, zzbv zzbv, d dVar) {
        super(2, dVar);
        this.zzb = application;
        this.zzc = str;
        this.zzd = zzdc;
        this.zze = zzbl;
        this.zzf = zzdq;
        this.zzg = zzbv;
    }

    public final d create(Object obj, d dVar) {
        return new zzcj(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcj) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.zza;
        l0.Q0(obj);
        if (i10 == 0) {
            Application application = this.zzb;
            int i11 = zzbz.zza;
            String str = this.zzc;
            zzdc zzdc = this.zzd;
            zzbl zzbl = this.zze;
            int zza2 = zzbz.zza(application);
            String packageName = application.getPackageName();
            String zzd2 = zzdc.zzd();
            int i12 = Build.VERSION.SDK_INT;
            String zza3 = zzbl.zza();
            zzqs zzf2 = zzqt.zzf();
            zzf2.zzs(str);
            zzf2.zzp(packageName);
            zzf2.zzt(zza2);
            zzf2.zzq("18.5.1");
            zzf2.zzr(zzd2);
            zzf2.zze(String.valueOf(i12));
            zzf2.zzd(zza3);
            zzdq zzdq = this.zzf;
            zzbv zzbv = this.zzg;
            zzdc zzdc2 = this.zzd;
            String zzb2 = zzbv.zzb();
            this.zza = 1;
            obj = zzdq.zza(zzb2, (zzqt) zzf2.zzj(), zzdc2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
