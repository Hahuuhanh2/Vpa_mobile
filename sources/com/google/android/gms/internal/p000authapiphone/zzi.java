package com.google.android.gms.internal.p000authapiphone;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import w6.e;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzi  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public final class zzi extends zzb implements zzj {
    public zzi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    public final void zza(zzl zzl) {
        Parcel zza = zza();
        zzd.zza(zza, (IInterface) zzl);
        zza(1, zza);
    }

    public final void zza(String str, zzl zzl) {
        Parcel zza = zza();
        zza.writeString(str);
        zzd.zza(zza, (IInterface) zzl);
        zza(2, zza);
    }

    public final void zza(e eVar) {
        Parcel zza = zza();
        zzd.zza(zza, (IInterface) eVar);
        zza(3, zza);
    }

    public final void zza(zzf zzf) {
        Parcel zza = zza();
        zzd.zza(zza, (IInterface) zzf);
        zza(4, zza);
    }

    public final void zza(String str, zzh zzh) {
        Parcel zza = zza();
        zza.writeString(str);
        zzd.zza(zza, (IInterface) zzh);
        zza(5, zza);
    }
}