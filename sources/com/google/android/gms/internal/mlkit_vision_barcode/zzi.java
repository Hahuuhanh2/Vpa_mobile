package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new zzv();
    public String zza;
    public String zzb;
    public String zzc;
    public String zzd;
    public String zze;
    public String zzf;
    public String zzg;
    public String zzh;
    public String zzi;
    public String zzj;
    public String zzk;
    public String zzl;
    public String zzm;
    public String zzn;

    public zzi() {
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
        l0.f1(parcel, 9, this.zzh);
        l0.f1(parcel, 10, this.zzi);
        l0.f1(parcel, 11, this.zzj);
        l0.f1(parcel, 12, this.zzk);
        l0.f1(parcel, 13, this.zzl);
        l0.f1(parcel, 14, this.zzm);
        l0.f1(parcel, 15, this.zzn);
        l0.o1(n12, parcel);
    }

    public zzi(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = str9;
        this.zzj = str10;
        this.zzk = str11;
        this.zzl = str12;
        this.zzm = str13;
        this.zzn = str14;
    }
}
