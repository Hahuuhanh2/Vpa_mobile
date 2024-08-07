package com.google.android.gms.internal.safetynet;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.zza;
import com.google.android.gms.safetynet.zzd;
import com.google.android.gms.safetynet.zzh;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
public abstract class zzf extends zzb implements zzg {
    public zzf() {
        super("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzd((Status) zzc.zza(parcel, Status.CREATOR), (zza) zzc.zza(parcel, zza.CREATOR));
        } else if (i10 == 2) {
            zze(parcel.readString());
        } else if (i10 == 3) {
            zzj((Status) zzc.zza(parcel, Status.CREATOR), (SafeBrowsingData) zzc.zza(parcel, SafeBrowsingData.CREATOR));
        } else if (i10 == 4) {
            zzb((Status) zzc.zza(parcel, Status.CREATOR), zzc.zzc(parcel));
        } else if (i10 == 6) {
            zzh((Status) zzc.zza(parcel, Status.CREATOR), (com.google.android.gms.safetynet.zzf) zzc.zza(parcel, com.google.android.gms.safetynet.zzf.CREATOR));
        } else if (i10 == 8) {
            zzg((Status) zzc.zza(parcel, Status.CREATOR), (zzd) zzc.zza(parcel, zzd.CREATOR));
        } else if (i10 == 10) {
            zzf((Status) zzc.zza(parcel, Status.CREATOR), zzc.zzc(parcel));
        } else if (i10 == 11) {
            zzc((Status) zzc.zza(parcel, Status.CREATOR));
        } else if (i10 == 15) {
            zzi((Status) zzc.zza(parcel, Status.CREATOR), (zzh) zzc.zza(parcel, zzh.CREATOR));
        } else if (i10 != 16) {
            return false;
        } else {
            zzk((Status) zzc.zza(parcel, Status.CREATOR), parcel.readString(), parcel.readInt());
        }
        return true;
    }
}
