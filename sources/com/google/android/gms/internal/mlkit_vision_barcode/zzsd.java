package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzsd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsd> CREATOR = new zzss();
    private final zzsh zza;
    private final String zzb;
    private final String zzc;
    private final zzsi[] zzd;
    private final zzsf[] zze;
    private final String[] zzf;
    private final zzsa[] zzg;

    public zzsd(zzsh zzsh, String str, String str2, zzsi[] zzsiArr, zzsf[] zzsfArr, String[] strArr, zzsa[] zzsaArr) {
        this.zza = zzsh;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzsiArr;
        this.zze = zzsfArr;
        this.zzf = strArr;
        this.zzg = zzsaArr;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.e1(parcel, 1, this.zza, i10);
        l0.f1(parcel, 2, this.zzb);
        l0.f1(parcel, 3, this.zzc);
        l0.i1(parcel, 4, this.zzd, i10);
        l0.i1(parcel, 5, this.zze, i10);
        l0.g1(parcel, 6, this.zzf);
        l0.i1(parcel, 7, this.zzg, i10);
        l0.o1(n12, parcel);
    }

    public final zzsh zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final zzsa[] zzd() {
        return this.zzg;
    }

    public final zzsf[] zze() {
        return this.zze;
    }

    public final zzsi[] zzf() {
        return this.zzd;
    }

    public final String[] zzg() {
        return this.zzf;
    }
}
