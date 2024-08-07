package com.google.firebase.auth.internal;

import aa.f;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ba.i0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.p001firebaseauthapi.zzags;
import com.google.android.gms.internal.p001firebaseauthapi.zzahg;
import com.google.android.gms.internal.p001firebaseauthapi.zzzr;
import org.json.JSONException;
import org.json.JSONObject;
import p3.l0;
import y6.j;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzt extends AbstractSafeParcelable implements f {
    public static final Parcelable.Creator<zzt> CREATOR = new i0();

    /* renamed from: a  reason: collision with root package name */
    public final String f7536a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7537b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7538c;

    /* renamed from: d  reason: collision with root package name */
    public String f7539d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7540e;

    /* renamed from: f  reason: collision with root package name */
    public final String f7541f;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f7542n;

    /* renamed from: o  reason: collision with root package name */
    public final String f7543o;

    public zzt(zzags zzags) {
        j.f(zzags);
        j.c("firebase");
        String zzo = zzags.zzo();
        j.c(zzo);
        this.f7536a = zzo;
        this.f7537b = "firebase";
        this.f7540e = zzags.zzn();
        this.f7538c = zzags.zzm();
        Uri zzc = zzags.zzc();
        if (zzc != null) {
            this.f7539d = zzc.toString();
        }
        this.f7542n = zzags.zzs();
        this.f7543o = null;
        this.f7541f = zzags.zzp();
    }

    public final String R() {
        return this.f7537b;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f7536a;
        int n12 = l0.n1(20293, parcel);
        l0.f1(parcel, 1, str);
        l0.f1(parcel, 2, this.f7537b);
        l0.f1(parcel, 3, this.f7538c);
        l0.f1(parcel, 4, this.f7539d);
        l0.f1(parcel, 5, this.f7540e);
        l0.f1(parcel, 6, this.f7541f);
        l0.X0(parcel, 7, this.f7542n);
        l0.f1(parcel, 8, this.f7543o);
        l0.o1(n12, parcel);
    }

    public final String zzb() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f7536a);
            jSONObject.putOpt("providerId", this.f7537b);
            jSONObject.putOpt("displayName", this.f7538c);
            jSONObject.putOpt("photoUrl", this.f7539d);
            jSONObject.putOpt("email", this.f7540e);
            jSONObject.putOpt("phoneNumber", this.f7541f);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f7542n));
            jSONObject.putOpt("rawUserInfo", this.f7543o);
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new zzzr(e10);
        }
    }

    public zzt(zzahg zzahg) {
        j.f(zzahg);
        this.f7536a = zzahg.zzd();
        String zzf = zzahg.zzf();
        j.c(zzf);
        this.f7537b = zzf;
        this.f7538c = zzahg.zzb();
        Uri zza = zzahg.zza();
        if (zza != null) {
            this.f7539d = zza.toString();
        }
        this.f7540e = zzahg.zzc();
        this.f7541f = zzahg.zze();
        this.f7542n = false;
        this.f7543o = zzahg.zzg();
    }

    public zzt(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, String str7) {
        this.f7536a = str;
        this.f7537b = str2;
        this.f7540e = str3;
        this.f7541f = str4;
        this.f7538c = str5;
        this.f7539d = str6;
        if (!TextUtils.isEmpty(str6)) {
            Uri.parse(this.f7539d);
        }
        this.f7542n = z10;
        this.f7543o = str7;
    }
}
