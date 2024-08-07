package com.google.firebase.auth;

import aa.n;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p001firebaseauthapi.zzzr;
import org.json.JSONException;
import org.json.JSONObject;
import p3.l0;
import y6.j;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public class PhoneMultiFactorInfo extends MultiFactorInfo {
    public static final Parcelable.Creator<PhoneMultiFactorInfo> CREATOR = new n();

    /* renamed from: a  reason: collision with root package name */
    public final String f7499a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7500b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7501c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7502d;

    public PhoneMultiFactorInfo(long j10, String str, String str2, String str3) {
        j.c(str);
        this.f7499a = str;
        this.f7500b = str2;
        this.f7501c = j10;
        j.c(str3);
        this.f7502d = str3;
    }

    public final String P0() {
        return "phone";
    }

    public final JSONObject Q0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f7499a);
            jSONObject.putOpt("displayName", this.f7500b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f7501c));
            jSONObject.putOpt("phoneNumber", this.f7502d);
            return jSONObject;
        } catch (JSONException e10) {
            throw new zzzr(e10);
        }
    }

    @SuppressLint({"FirebaseUnknownNullness"})
    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.f1(parcel, 1, this.f7499a);
        l0.f1(parcel, 2, this.f7500b);
        l0.c1(parcel, 3, this.f7501c);
        l0.f1(parcel, 4, this.f7502d);
        l0.o1(n12, parcel);
    }
}
