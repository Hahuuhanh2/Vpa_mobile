package com.google.android.gms.internal.p001firebaseauthapi;

import h7.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzahh {
    private final List zza;

    public zzahh() {
        this.zza = new ArrayList();
    }

    public static zzahh zza(JSONArray jSONArray) {
        zzahg zzahg;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzahh(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            if (jSONObject == null) {
                zzahg = new zzahg();
            } else {
                zzahg = new zzahg(i.a(jSONObject.optString("federatedId", (String) null)), i.a(jSONObject.optString("displayName", (String) null)), i.a(jSONObject.optString("photoUrl", (String) null)), i.a(jSONObject.optString("providerId", (String) null)), (String) null, i.a(jSONObject.optString("phoneNumber", (String) null)), i.a(jSONObject.optString("email", (String) null)));
            }
            arrayList.add(zzahg);
        }
        return new zzahh(arrayList);
    }

    public static zzahh zzb(zzahh zzahh) {
        zzahh zzahh2 = new zzahh();
        List list = zzahh.zza;
        if (list != null) {
            zzahh2.zza.addAll(list);
        }
        return zzahh2;
    }

    public final List zzc() {
        return this.zza;
    }

    public zzahh(List list) {
        if (!list.isEmpty()) {
            this.zza = Collections.unmodifiableList(list);
        } else {
            this.zza = Collections.emptyList();
        }
    }
}
