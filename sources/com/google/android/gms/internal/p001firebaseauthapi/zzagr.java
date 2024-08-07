package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.zze;
import h7.i;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzagr implements zzaek {
    private static final String zza = "zzagr";
    private zzagt zzb;

    public final /* bridge */ /* synthetic */ zzaek zza(String str) {
        zzagt zzagt;
        int i10;
        zzags zzags;
        String str2 = str;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (!jSONObject.has("users")) {
                this.zzb = new zzagt();
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                if (optJSONArray != null) {
                    if (optJSONArray.length() != 0) {
                        ArrayList arrayList = new ArrayList(optJSONArray.length());
                        boolean z10 = false;
                        int i11 = 0;
                        while (i11 < optJSONArray.length()) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                            if (jSONObject2 == null) {
                                zzags = new zzags();
                                i10 = i11;
                            } else {
                                i10 = i11;
                                zzags = new zzags(i.a(jSONObject2.optString("localId", (String) null)), i.a(jSONObject2.optString("email", (String) null)), jSONObject2.optBoolean("emailVerified", z10), i.a(jSONObject2.optString("displayName", (String) null)), i.a(jSONObject2.optString("photoUrl", (String) null)), zzahh.zza(jSONObject2.optJSONArray("providerUserInfo")), i.a(jSONObject2.optString("rawPassword", (String) null)), i.a(jSONObject2.optString("phoneNumber", (String) null)), jSONObject2.optLong("createdAt", 0), jSONObject2.optLong("lastLoginAt", 0), false, (zze) null, zzahf.zzg(jSONObject2.optJSONArray("mfaInfo")));
                            }
                            arrayList.add(zzags);
                            i11 = i10 + 1;
                            z10 = false;
                        }
                        zzagt = new zzagt(arrayList);
                        this.zzb = zzagt;
                    }
                }
                zzagt = new zzagt(new ArrayList());
                this.zzb = zzagt;
            }
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzain.zza(e10, zza, str2);
        }
    }

    public final List zzb() {
        return this.zzb.zza();
    }
}
