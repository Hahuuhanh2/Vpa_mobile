package com.google.android.gms.internal.safetynet;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;
import gl.i;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v6.e;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
public final class zzac implements e {
    private Status zza;
    private final SafeBrowsingData zzb;
    private String zzc = null;
    private long zzd;
    private byte[] zze;

    public zzac(Status status, SafeBrowsingData safeBrowsingData) {
        this.zza = status;
        this.zzb = safeBrowsingData;
        if (safeBrowsingData != null) {
            this.zzc = safeBrowsingData.f5546a;
            this.zzd = safeBrowsingData.f5549d;
            this.zze = safeBrowsingData.f5550e;
        } else if (status.P0()) {
            this.zza = new Status(8, (String) null, (PendingIntent) null, (ConnectionResult) null);
        }
    }

    public final List<i> getDetectedThreats() {
        ArrayList arrayList = new ArrayList();
        String str = this.zzc;
        if (str != null) {
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("matches");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    try {
                        arrayList.add(new i(Integer.parseInt(jSONArray.getJSONObject(i10).getString("threat_type"))));
                    } catch (NumberFormatException | JSONException unused) {
                    }
                }
            } catch (JSONException unused2) {
            }
        }
        return arrayList;
    }

    public final long getLastUpdateTimeMs() {
        return this.zzd;
    }

    public final String getMetadata() {
        return this.zzc;
    }

    public final byte[] getState() {
        return this.zze;
    }

    public final Status getStatus() {
        return this.zza;
    }
}
