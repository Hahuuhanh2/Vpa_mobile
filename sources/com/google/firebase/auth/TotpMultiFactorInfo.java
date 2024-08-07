package com.google.firebase.auth;

import aa.p;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p001firebaseauthapi.zzaia;
import com.google.android.gms.internal.p001firebaseauthapi.zzzr;
import org.json.JSONException;
import org.json.JSONObject;
import p3.l0;
import y6.j;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public class TotpMultiFactorInfo extends MultiFactorInfo {
    public static final Parcelable.Creator<TotpMultiFactorInfo> CREATOR = new p();

    /* renamed from: a  reason: collision with root package name */
    public final String f7504a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7505b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7506c;

    /* renamed from: d  reason: collision with root package name */
    public final zzaia f7507d;

    public TotpMultiFactorInfo(String str, String str2, long j10, zzaia zzaia) {
        j.c(str);
        this.f7504a = str;
        this.f7505b = str2;
        this.f7506c = j10;
        if (zzaia != null) {
            this.f7507d = zzaia;
            return;
        }
        throw new NullPointerException("totpInfo cannot be null.");
    }

    public final String P0() {
        return "totp";
    }

    public final JSONObject Q0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f7504a);
            jSONObject.putOpt("displayName", this.f7505b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f7506c));
            jSONObject.putOpt("totpInfo", this.f7507d);
            return jSONObject;
        } catch (JSONException e10) {
            throw new zzzr(e10);
        }
    }

    @SuppressLint({"FirebaseUnknownNullness"})
    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.f1(parcel, 1, this.f7504a);
        l0.f1(parcel, 2, this.f7505b);
        l0.c1(parcel, 3, this.f7506c);
        l0.e1(parcel, 4, this.f7507d, i10);
        l0.o1(n12, parcel);
    }
}
