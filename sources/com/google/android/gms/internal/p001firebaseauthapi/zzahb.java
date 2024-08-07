package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h7.i;
import org.json.JSONException;
import org.json.JSONObject;
import p3.l0;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzahb extends AbstractSafeParcelable implements zzaek<zzahb> {
    public static final Parcelable.Creator<zzahb> CREATOR = new zzahc();
    private static final String zza = "zzahb";
    private String zzb;
    private String zzc;
    private Long zzd;
    private String zze;
    private Long zzf;

    static {
        Class<zzahb> cls = zzahb.class;
    }

    public zzahb() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    public static zzahb zzd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzahb zzahb = new zzahb();
            zzahb.zzb = jSONObject.optString("refresh_token", (String) null);
            zzahb.zzc = jSONObject.optString("access_token", (String) null);
            zzahb.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzahb.zze = jSONObject.optString("token_type", (String) null);
            zzahb.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzahb;
        } catch (JSONException e10) {
            throw new zzzr(e10);
        }
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.f1(parcel, 2, this.zzb);
        l0.f1(parcel, 3, this.zzc);
        l0.d1(parcel, 4, Long.valueOf(zzb()));
        l0.f1(parcel, 5, this.zze);
        l0.d1(parcel, 6, Long.valueOf(this.zzf.longValue()));
        l0.o1(n12, parcel);
    }

    public final /* bridge */ /* synthetic */ zzaek zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = i.a(jSONObject.optString("refresh_token"));
            this.zzc = i.a(jSONObject.optString("access_token"));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0));
            this.zze = i.a(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzain.zza(e10, zza, str);
        }
    }

    public final long zzb() {
        Long l10 = this.zzd;
        if (l10 == null) {
            return 0;
        }
        return l10.longValue();
    }

    public final long zzc() {
        return this.zzf.longValue();
    }

    public final String zze() {
        return this.zzc;
    }

    public final String zzf() {
        return this.zzb;
    }

    public final String zzg() {
        return this.zze;
    }

    public final String zzh() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put("access_token", this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new zzzr(e10);
        }
    }

    public final void zzi(String str) {
        j.c(str);
        this.zzb = str;
    }

    public final boolean zzj() {
        if (System.currentTimeMillis() + 300000 < (this.zzd.longValue() * 1000) + this.zzf.longValue()) {
            return true;
        }
        return false;
    }

    public zzahb(String str, String str2, Long l10, String str3) {
        this(str, str2, l10, str3, Long.valueOf(System.currentTimeMillis()));
    }

    public zzahb(String str, String str2, Long l10, String str3, Long l11) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l10;
        this.zze = str3;
        this.zzf = l11;
    }
}
