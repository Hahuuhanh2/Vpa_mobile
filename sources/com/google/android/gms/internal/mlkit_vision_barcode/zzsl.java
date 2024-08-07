package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzsl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsl> CREATOR = new zzte();
    private final String zza;
    private final String zzb;
    private final int zzc;

    public zzsl(String str, String str2, int i10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.f1(parcel, 1, this.zza);
        l0.f1(parcel, 2, this.zzb);
        l0.b1(parcel, 3, this.zzc);
        l0.o1(n12, parcel);
    }

    public final int zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }
}
