package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzy();
    public String zza;
    public String zzb;
    public String zzc;
    public String zzd;
    public String zze;
    public String zzf;
    public String zzg;

    public zzl() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.f1(parcel, 2, this.zza);
        l0.f1(parcel, 3, this.zzb);
        l0.f1(parcel, 4, this.zzc);
        l0.f1(parcel, 5, this.zzd);
        l0.f1(parcel, 6, this.zze);
        l0.f1(parcel, 7, this.zzf);
        l0.f1(parcel, 8, this.zzg);
        l0.o1(n12, parcel);
    }

    public zzl(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
    }
}
