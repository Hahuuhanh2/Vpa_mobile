package m9;

import android.content.Context;
import android.text.TextUtils;
import h7.i;
import java.util.Arrays;
import y0.h;
import y6.i;
import y6.j;

/* compiled from: FirebaseOptions */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f13231a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13232b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13233c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13234d;

    /* renamed from: e  reason: collision with root package name */
    public final String f13235e;

    /* renamed from: f  reason: collision with root package name */
    public final String f13236f;

    /* renamed from: g  reason: collision with root package name */
    public final String f13237g;

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z10;
        int i10 = i.f10619a;
        if (str == null || str.trim().isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        j.h("ApplicationId must be set.", true ^ z10);
        this.f13232b = str;
        this.f13231a = str2;
        this.f13233c = str3;
        this.f13234d = str4;
        this.f13235e = str5;
        this.f13236f = str6;
        this.f13237g = str7;
    }

    public static e a(Context context) {
        h hVar = new h(context);
        String e10 = hVar.e("google_app_id");
        if (TextUtils.isEmpty(e10)) {
            return null;
        }
        return new e(e10, hVar.e("google_api_key"), hVar.e("firebase_database_url"), hVar.e("ga_trackingId"), hVar.e("gcm_defaultSenderId"), hVar.e("google_storage_bucket"), hVar.e("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!y6.i.a(this.f13232b, eVar.f13232b) || !y6.i.a(this.f13231a, eVar.f13231a) || !y6.i.a(this.f13233c, eVar.f13233c) || !y6.i.a(this.f13234d, eVar.f13234d) || !y6.i.a(this.f13235e, eVar.f13235e) || !y6.i.a(this.f13236f, eVar.f13236f) || !y6.i.a(this.f13237g, eVar.f13237g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13232b, this.f13231a, this.f13233c, this.f13234d, this.f13235e, this.f13236f, this.f13237g});
    }

    public final String toString() {
        i.a aVar = new i.a(this);
        aVar.a(this.f13232b, "applicationId");
        aVar.a(this.f13231a, "apiKey");
        aVar.a(this.f13233c, "databaseUrl");
        aVar.a(this.f13235e, "gcmSenderId");
        aVar.a(this.f13236f, "storageBucket");
        aVar.a(this.f13237g, "projectId");
        return aVar.toString();
    }
}
