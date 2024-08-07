package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ba.h0;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.zze;
import java.util.List;
import p3.l0;
import y6.j;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzr implements AuthResult {
    public static final Parcelable.Creator<zzr> CREATOR = new h0();

    /* renamed from: a  reason: collision with root package name */
    public zzx f7533a;

    /* renamed from: b  reason: collision with root package name */
    public zzp f7534b;

    /* renamed from: c  reason: collision with root package name */
    public zze f7535c;

    public zzr(zzx zzx) {
        j.f(zzx);
        this.f7533a = zzx;
        List list = zzx.f7548e;
        this.f7534b = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!TextUtils.isEmpty(((zzt) list.get(i10)).f7543o)) {
                this.f7534b = new zzp(((zzt) list.get(i10)).f7537b, ((zzt) list.get(i10)).f7543o, zzx.f7553q);
            }
        }
        if (this.f7534b == null) {
            this.f7534b = new zzp(zzx.f7553q);
        }
        this.f7535c = zzx.f7554r;
    }

    public zzr(zzx zzx, zzp zzp, zze zze) {
        this.f7533a = zzx;
        this.f7534b = zzp;
        this.f7535c = zze;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.e1(parcel, 1, this.f7533a, i10);
        l0.e1(parcel, 2, this.f7534b, i10);
        l0.e1(parcel, 3, this.f7535c, i10);
        l0.o1(n12, parcel);
    }
}
