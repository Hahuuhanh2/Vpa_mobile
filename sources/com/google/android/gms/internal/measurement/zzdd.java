package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzdg();
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final Bundle zzg;
    public final String zzh;

    public zzdd(long j10, long j11, boolean z10, String str, String str2, String str3, Bundle bundle, String str4) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = z10;
        this.zzd = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = bundle;
        this.zzh = str4;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.c1(parcel, 1, this.zza);
        l0.c1(parcel, 2, this.zzb);
        l0.X0(parcel, 3, this.zzc);
        l0.f1(parcel, 4, this.zzd);
        l0.f1(parcel, 5, this.zze);
        l0.f1(parcel, 6, this.zzf);
        l0.Y0(parcel, 7, this.zzg);
        l0.f1(parcel, 8, this.zzh);
        l0.o1(n12, parcel);
    }
}
