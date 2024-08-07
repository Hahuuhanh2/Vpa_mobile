package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import n0.l;
import org.json.JSONArray;
import org.json.JSONObject;
import p3.l0;
import r6.a;
import y6.j;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f5289a;

    /* renamed from: b  reason: collision with root package name */
    public String f5290b;

    /* renamed from: c  reason: collision with root package name */
    public String f5291c;

    /* renamed from: d  reason: collision with root package name */
    public String f5292d;

    /* renamed from: e  reason: collision with root package name */
    public String f5293e;

    /* renamed from: f  reason: collision with root package name */
    public Uri f5294f;

    /* renamed from: n  reason: collision with root package name */
    public String f5295n;

    /* renamed from: o  reason: collision with root package name */
    public long f5296o;

    /* renamed from: p  reason: collision with root package name */
    public String f5297p;

    /* renamed from: q  reason: collision with root package name */
    public List f5298q;

    /* renamed from: r  reason: collision with root package name */
    public String f5299r;

    /* renamed from: s  reason: collision with root package name */
    public String f5300s;

    /* renamed from: t  reason: collision with root package name */
    public HashSet f5301t = new HashSet();

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, ArrayList arrayList, String str7, String str8) {
        this.f5289a = i10;
        this.f5290b = str;
        this.f5291c = str2;
        this.f5292d = str3;
        this.f5293e = str4;
        this.f5294f = uri;
        this.f5295n = str5;
        this.f5296o = j10;
        this.f5297p = str6;
        this.f5298q = arrayList;
        this.f5299r = str7;
        this.f5300s = str8;
    }

    public static GoogleSignInAccount Q0(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        long longValue = valueOf.longValue();
        j.c(string);
        GoogleSignInAccount googleSignInAccount = r3;
        GoogleSignInAccount googleSignInAccount2 = new GoogleSignInAccount(3, optString2, str2, str3, str4, uri, (String) null, longValue, string, new ArrayList(hashSet), str5, str6);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        } else {
            str7 = null;
        }
        googleSignInAccount.f5295n = str7;
        return googleSignInAccount;
    }

    public final HashSet P0() {
        HashSet hashSet = new HashSet(this.f5298q);
        hashSet.addAll(this.f5301t);
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f5297p.equals(this.f5297p) || !googleSignInAccount.P0().equals(P0())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return P0().hashCode() + l.f(this.f5297p, 527, 31);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5289a);
        l0.f1(parcel, 2, this.f5290b);
        l0.f1(parcel, 3, this.f5291c);
        l0.f1(parcel, 4, this.f5292d);
        l0.f1(parcel, 5, this.f5293e);
        l0.e1(parcel, 6, this.f5294f, i10);
        l0.f1(parcel, 7, this.f5295n);
        l0.c1(parcel, 8, this.f5296o);
        l0.f1(parcel, 9, this.f5297p);
        l0.j1(parcel, 10, this.f5298q);
        l0.f1(parcel, 11, this.f5299r);
        l0.f1(parcel, 12, this.f5300s);
        l0.o1(n12, parcel);
    }
}
