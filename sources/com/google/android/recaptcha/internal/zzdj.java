package com.google.android.recaptcha.internal;

import al.d0;
import android.content.ContentValues;
import ik.d;
import jk.a;
import kk.i;
import p3.l0;
import rk.p;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzdj extends i implements p {
    public final /* synthetic */ zzdk zza;
    public final /* synthetic */ zzre zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdj(zzdk zzdk, zzre zzre, d dVar) {
        super(2, dVar);
        this.zza = zzdk;
        this.zzb = zzre;
    }

    public final d create(Object obj, d dVar) {
        return new zzdj(this.zza, this.zzb, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdj) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        l0.Q0(obj);
        zzre zzre = this.zzb;
        zzdk zzdk = this.zza;
        synchronized (zzdg.class) {
            if (zzdk.zze != null) {
                byte[] zzd = zzre.zzd();
                zzdb zzdb = new zzdb(zzhz.zzg().zzi(zzd, 0, zzd.length), System.currentTimeMillis(), 0);
                zzda zzb2 = zzdk.zze;
                ContentValues contentValues = new ContentValues();
                contentValues.put("ss", zzdb.zzc());
                contentValues.put("ts", Long.valueOf(zzdb.zzb()));
                zzb2.getWritableDatabase().insert("ce", (String) null, contentValues);
                int zzb3 = zzdk.zze.zzb() - 500;
                if (zzb3 > 0) {
                    zzdk.zze.zza(fk.p.V0(zzdk.zze.zzd(), zzb3));
                }
                if (zzdk.zze.zzb() >= 20) {
                    zzdk.zzg();
                }
            }
        }
        return ek.i.f20112a;
    }
}
