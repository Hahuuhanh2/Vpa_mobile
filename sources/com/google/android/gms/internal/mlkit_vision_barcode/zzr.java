package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzr implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int t10 = SafeParcelReader.t(parcel);
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        String str = null;
        String str2 = null;
        Point[] pointArr = null;
        zzj zzj = null;
        zzm zzm = null;
        zzn zzn = null;
        zzp zzp = null;
        zzo zzo = null;
        zzk zzk = null;
        zzg zzg = null;
        zzh zzh = null;
        zzi zzi = null;
        byte[] bArr = null;
        double d10 = 0.0d;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i10 = SafeParcelReader.o(readInt, parcel2);
                    break;
                case 3:
                    str = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 4:
                    str2 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 5:
                    i11 = SafeParcelReader.o(readInt, parcel2);
                    break;
                case 6:
                    pointArr = (Point[]) SafeParcelReader.i(parcel2, readInt, Point.CREATOR);
                    break;
                case 7:
                    zzj = (zzj) SafeParcelReader.e(parcel2, readInt, zzj.CREATOR);
                    break;
                case 8:
                    zzm = (zzm) SafeParcelReader.e(parcel2, readInt, zzm.CREATOR);
                    break;
                case 9:
                    zzn = (zzn) SafeParcelReader.e(parcel2, readInt, zzn.CREATOR);
                    break;
                case 10:
                    zzp = (zzp) SafeParcelReader.e(parcel2, readInt, zzp.CREATOR);
                    break;
                case 11:
                    zzo = (zzo) SafeParcelReader.e(parcel2, readInt, zzo.CREATOR);
                    break;
                case 12:
                    zzk = (zzk) SafeParcelReader.e(parcel2, readInt, zzk.CREATOR);
                    break;
                case 13:
                    zzg = (zzg) SafeParcelReader.e(parcel2, readInt, zzg.CREATOR);
                    break;
                case 14:
                    zzh = (zzh) SafeParcelReader.e(parcel2, readInt, zzh.CREATOR);
                    break;
                case 15:
                    zzi = (zzi) SafeParcelReader.e(parcel2, readInt, zzi.CREATOR);
                    break;
                case 16:
                    bArr = SafeParcelReader.c(readInt, parcel2);
                    break;
                case 17:
                    z10 = SafeParcelReader.l(readInt, parcel2);
                    break;
                case 18:
                    d10 = SafeParcelReader.m(readInt, parcel2);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel2);
                    break;
            }
        }
        SafeParcelReader.k(t10, parcel2);
        return new zzq(i10, str, str2, i11, pointArr, zzj, zzm, zzn, zzp, zzo, zzk, zzg, zzh, zzi, bArr, z10, d10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzq[i10];
    }
}
