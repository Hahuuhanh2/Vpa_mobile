package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzu();
    public zzl zza;
    public String zzb;
    public String zzc;
    public zzm[] zzd;
    public zzj[] zze;
    public String[] zzf;
    public zze[] zzg;

    public zzh() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.e1(parcel, 2, this.zza, i10);
        l0.f1(parcel, 3, this.zzb);
        l0.f1(parcel, 4, this.zzc);
        l0.i1(parcel, 5, this.zzd, i10);
        l0.i1(parcel, 6, this.zze, i10);
        l0.g1(parcel, 7, this.zzf);
        l0.i1(parcel, 8, this.zzg, i10);
        l0.o1(n12, parcel);
    }

    public zzh(zzl zzl, String str, String str2, zzm[] zzmArr, zzj[] zzjArr, String[] strArr, zze[] zzeArr) {
        this.zza = zzl;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzmArr;
        this.zze = zzjArr;
        this.zzf = strArr;
        this.zzg = zzeArr;
    }
}
