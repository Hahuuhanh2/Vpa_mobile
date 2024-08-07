package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzsc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsc> CREATOR = new zzsr();
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final zzsb zzf;
    private final zzsb zzg;

    public zzsc(String str, String str2, String str3, String str4, String str5, zzsb zzsb, zzsb zzsb2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = zzsb;
        this.zzg = zzsb2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.f1(parcel, 1, this.zza);
        l0.f1(parcel, 2, this.zzb);
        l0.f1(parcel, 3, this.zzc);
        l0.f1(parcel, 4, this.zzd);
        l0.f1(parcel, 5, this.zze);
        l0.e1(parcel, 6, this.zzf, i10);
        l0.e1(parcel, 7, this.zzg, i10);
        l0.o1(n12, parcel);
    }

    public final zzsb zza() {
        return this.zzg;
    }

    public final zzsb zzb() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzd;
    }

    public final String zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zza;
    }
}
