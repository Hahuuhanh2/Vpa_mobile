package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzahf {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzaia zze;
    private String zzf;

    public zzahf(String str, String str2, String str3, long j10, zzaia zzaia) {
        if (TextUtils.isEmpty(str) || zzaia == null) {
            this.zza = str;
            j.c(str2);
            this.zzb = str2;
            this.zzc = str3;
            this.zzd = j10;
            this.zze = zzaia;
            return;
        }
        throw new IllegalArgumentException("Cannot have both MFA phone_info and totp_info");
    }

    public static zzahf zzb(JSONObject jSONObject) {
        zzaia zzaia;
        String optString = jSONObject.optString("phoneInfo", (String) null);
        String optString2 = jSONObject.optString("mfaEnrollmentId", (String) null);
        String optString3 = jSONObject.optString("displayName", (String) null);
        long zzh = zzh(jSONObject.optString("enrolledAt", ""));
        if (jSONObject.opt("totpInfo") != null) {
            zzaia = new zzaia();
        } else {
            zzaia = null;
        }
        zzahf zzahf = new zzahf(optString, optString2, optString3, zzh, zzaia);
        zzahf.zzf = jSONObject.optString("unobfuscatedPhoneInfo");
        return zzahf;
    }

    public static List zzg(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(zzb(jSONArray.getJSONObject(i10)));
        }
        return arrayList;
    }

    private static long zzh(String str) {
        try {
            zzamt zzb2 = zzano.zzb(str);
            zzano.zza(zzb2);
            return zzb2.zzb();
        } catch (ParseException unused) {
            return 0;
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final zzaia zzc() {
        return this.zze;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zza;
    }
}