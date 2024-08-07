package com.google.android.gms.internal.safetynet;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.zza;
import com.google.android.gms.safetynet.zzd;
import com.google.android.gms.safetynet.zzf;
import com.google.android.gms.safetynet.zzh;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
public interface zzg extends IInterface {
    void zzb(Status status, boolean z10);

    void zzc(Status status);

    void zzd(Status status, zza zza);

    void zze(String str);

    void zzf(Status status, boolean z10);

    void zzg(Status status, zzd zzd);

    void zzh(Status status, zzf zzf);

    void zzi(Status status, zzh zzh);

    void zzj(Status status, SafeBrowsingData safeBrowsingData);

    void zzk(Status status, String str, int i10);
}
