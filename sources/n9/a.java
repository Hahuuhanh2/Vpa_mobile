package n9;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p9.a;

/* compiled from: AbtExperimentInfo */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f13530g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h  reason: collision with root package name */
    public static final SimpleDateFormat f13531h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a  reason: collision with root package name */
    public final String f13532a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13533b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13534c;

    /* renamed from: d  reason: collision with root package name */
    public final Date f13535d;

    /* renamed from: e  reason: collision with root package name */
    public final long f13536e;

    /* renamed from: f  reason: collision with root package name */
    public final long f13537f;

    public a(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f13532a = str;
        this.f13533b = str2;
        this.f13534c = str3;
        this.f13535d = date;
        this.f13536e = j10;
        this.f13537f = j11;
    }

    public final a.b a(String str) {
        String str2;
        a.b bVar = new a.b();
        bVar.f14089a = str;
        bVar.f14101m = this.f13535d.getTime();
        bVar.f14090b = this.f13532a;
        bVar.f14091c = this.f13533b;
        if (TextUtils.isEmpty(this.f13534c)) {
            str2 = null;
        } else {
            str2 = this.f13534c;
        }
        bVar.f14092d = str2;
        bVar.f14093e = this.f13536e;
        bVar.f14098j = this.f13537f;
        return bVar;
    }
}
