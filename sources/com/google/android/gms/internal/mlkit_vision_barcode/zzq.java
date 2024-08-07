package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    public int zza;
    public String zzb;
    public String zzc;
    public int zzd;
    public Point[] zze;
    public zzj zzf;
    public zzm zzg;
    public zzn zzh;
    public zzp zzi;
    public zzo zzj;
    public zzk zzk;
    public zzg zzl;
    public zzh zzm;
    public zzi zzn;
    public byte[] zzo;
    public boolean zzp;
    public double zzq;

    public zzq() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 2, this.zza);
        l0.f1(parcel, 3, this.zzb);
        l0.f1(parcel, 4, this.zzc);
        l0.b1(parcel, 5, this.zzd);
        l0.i1(parcel, 6, this.zze, i10);
        l0.e1(parcel, 7, this.zzf, i10);
        l0.e1(parcel, 8, this.zzg, i10);
        l0.e1(parcel, 9, this.zzh, i10);
        l0.e1(parcel, 10, this.zzi, i10);
        l0.e1(parcel, 11, this.zzj, i10);
        l0.e1(parcel, 12, this.zzk, i10);
        l0.e1(parcel, 13, this.zzl, i10);
        l0.e1(parcel, 14, this.zzm, i10);
        l0.e1(parcel, 15, this.zzn, i10);
        l0.Z0(parcel, 16, this.zzo);
        l0.X0(parcel, 17, this.zzp);
        double d10 = this.zzq;
        parcel.writeInt(524306);
        parcel.writeDouble(d10);
        l0.o1(n12, parcel);
    }

    public zzq(int i10, String str, String str2, int i11, Point[] pointArr, zzj zzj2, zzm zzm2, zzn zzn2, zzp zzp2, zzo zzo2, zzk zzk2, zzg zzg2, zzh zzh2, zzi zzi2, byte[] bArr, boolean z10, double d10) {
        this.zza = i10;
        this.zzb = str;
        this.zzo = bArr;
        this.zzc = str2;
        this.zzd = i11;
        this.zze = pointArr;
        this.zzp = z10;
        this.zzq = d10;
        this.zzf = zzj2;
        this.zzg = zzm2;
        this.zzh = zzn2;
        this.zzi = zzp2;
        this.zzj = zzo2;
        this.zzk = zzk2;
        this.zzl = zzg2;
        this.zzm = zzh2;
        this.zzn = zzi2;
    }
}
