package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ba.d0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONObject;
import p3.l0;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaic  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzaic extends AbstractSafeParcelable implements zzaej {
    public static final Parcelable.Creator<zzaic> CREATOR = new zzaid();
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private boolean zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private boolean zzo;
    private String zzp;

    public zzaic() {
        this.zzi = true;
        this.zzj = true;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.f1(parcel, 2, this.zza);
        l0.f1(parcel, 3, this.zzb);
        l0.f1(parcel, 4, this.zzc);
        l0.f1(parcel, 5, this.zzd);
        l0.f1(parcel, 6, this.zze);
        l0.f1(parcel, 7, this.zzf);
        l0.f1(parcel, 8, this.zzg);
        l0.f1(parcel, 9, this.zzh);
        l0.X0(parcel, 10, this.zzi);
        l0.X0(parcel, 11, this.zzj);
        l0.f1(parcel, 12, this.zzk);
        l0.f1(parcel, 13, this.zzl);
        l0.f1(parcel, 14, this.zzm);
        l0.f1(parcel, 15, this.zzn);
        l0.X0(parcel, 16, this.zzo);
        l0.f1(parcel, 17, this.zzp);
        l0.o1(n12, parcel);
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.zzj);
        jSONObject.put("returnSecureToken", this.zzi);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.zzg;
        if (str2 != null) {
            jSONObject.put("postBody", str2);
        }
        String str3 = this.zzn;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zzp;
        if (str4 != null) {
            jSONObject.put("pendingToken", str4);
        }
        if (!TextUtils.isEmpty(this.zzl)) {
            jSONObject.put("sessionId", this.zzl);
        }
        if (!TextUtils.isEmpty(this.zzm)) {
            jSONObject.put("requestUri", this.zzm);
        } else {
            String str5 = this.zza;
            if (str5 != null) {
                jSONObject.put("requestUri", str5);
            }
        }
        jSONObject.put("returnIdpCredential", this.zzo);
        return jSONObject.toString();
    }

    public final zzaic zzb(boolean z10) {
        this.zzj = false;
        return this;
    }

    public final zzaic zzc(String str) {
        j.c(str);
        this.zzb = str;
        return this;
    }

    public final zzaic zzd(boolean z10) {
        this.zzo = true;
        return this;
    }

    public final zzaic zze(boolean z10) {
        this.zzi = true;
        return this;
    }

    public final zzaic zzf(String str) {
        this.zzn = str;
        return this;
    }

    public zzaic(d0 d0Var, String str) {
        j.f(d0Var);
        String str2 = d0Var.f4103a;
        j.c(str2);
        this.zzl = str2;
        j.c(str);
        this.zzm = str;
        String str3 = d0Var.f4105c;
        j.c(str3);
        this.zze = str3;
        this.zzi = true;
        this.zzg = "providerId=".concat(String.valueOf(str3));
    }

    public zzaic(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.zza = "http://localhost";
        this.zzc = str;
        this.zzd = str2;
        this.zzh = str5;
        this.zzk = str6;
        this.zzn = str7;
        this.zzp = str8;
        this.zzi = true;
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(this.zzd) || !TextUtils.isEmpty(this.zzk)) {
            j.c(str3);
            this.zze = str3;
            this.zzf = null;
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(this.zzc)) {
                sb2.append("id_token=");
                sb2.append(this.zzc);
                sb2.append("&");
            }
            if (!TextUtils.isEmpty(this.zzd)) {
                sb2.append("access_token=");
                sb2.append(this.zzd);
                sb2.append("&");
            }
            if (!TextUtils.isEmpty(this.zzf)) {
                sb2.append("identifier=");
                sb2.append(this.zzf);
                sb2.append("&");
            }
            if (!TextUtils.isEmpty(this.zzh)) {
                sb2.append("oauth_token_secret=");
                sb2.append(this.zzh);
                sb2.append("&");
            }
            if (!TextUtils.isEmpty(this.zzk)) {
                sb2.append("code=");
                sb2.append(this.zzk);
                sb2.append("&");
            }
            if (!TextUtils.isEmpty(str9)) {
                sb2.append("nonce=");
                sb2.append(str9);
                sb2.append("&");
            }
            sb2.append("providerId=");
            sb2.append(this.zze);
            this.zzg = sb2.toString();
            this.zzj = true;
            return;
        }
        throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
    }

    public zzaic(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z10, boolean z11, String str9, String str10, String str11, String str12, boolean z12, String str13) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = z10;
        this.zzj = z11;
        this.zzk = str9;
        this.zzl = str10;
        this.zzm = str11;
        this.zzn = str12;
        this.zzo = z12;
        this.zzp = str13;
    }
}
