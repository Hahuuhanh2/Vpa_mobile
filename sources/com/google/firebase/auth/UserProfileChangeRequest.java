package com.google.firebase.auth;

import aa.r;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public class UserProfileChangeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UserProfileChangeRequest> CREATOR = new r();

    /* renamed from: a  reason: collision with root package name */
    public final String f7510a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7511b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7512c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f7513d;

    /* renamed from: e  reason: collision with root package name */
    public final Uri f7514e;

    public UserProfileChangeRequest(String str, String str2, boolean z10, boolean z11) {
        Uri uri;
        this.f7510a = str;
        this.f7511b = str2;
        this.f7512c = z10;
        this.f7513d = z11;
        if (TextUtils.isEmpty(str2)) {
            uri = null;
        } else {
            uri = Uri.parse(str2);
        }
        this.f7514e = uri;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.f1(parcel, 2, this.f7510a);
        l0.f1(parcel, 3, this.f7511b);
        l0.X0(parcel, 4, this.f7512c);
        l0.X0(parcel, 5, this.f7513d);
        l0.o1(n12, parcel);
    }
}
