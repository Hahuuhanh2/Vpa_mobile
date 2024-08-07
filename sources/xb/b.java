package xb;

import android.support.v4.media.a;
import n0.l;
import sk.j;

/* compiled from: ApplicationInfo.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f17176a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17177b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17178c = "1.0.2";

    /* renamed from: d  reason: collision with root package name */
    public final String f17179d;

    /* renamed from: e  reason: collision with root package name */
    public final o f17180e;

    /* renamed from: f  reason: collision with root package name */
    public final a f17181f;

    public b(String str, String str2, String str3, a aVar) {
        o oVar = o.LOG_ENVIRONMENT_PROD;
        this.f17176a = str;
        this.f17177b = str2;
        this.f17179d = str3;
        this.f17180e = oVar;
        this.f17181f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j.a(this.f17176a, bVar.f17176a) && j.a(this.f17177b, bVar.f17177b) && j.a(this.f17178c, bVar.f17178c) && j.a(this.f17179d, bVar.f17179d) && this.f17180e == bVar.f17180e && j.a(this.f17181f, bVar.f17181f);
    }

    public final int hashCode() {
        int f10 = l.f(this.f17179d, l.f(this.f17178c, l.f(this.f17177b, this.f17176a.hashCode() * 31, 31), 31), 31);
        return this.f17181f.hashCode() + ((this.f17180e.hashCode() + f10) * 31);
    }

    public final String toString() {
        StringBuilder q10 = a.q("ApplicationInfo(appId=");
        q10.append(this.f17176a);
        q10.append(", deviceModel=");
        q10.append(this.f17177b);
        q10.append(", sessionSdkVersion=");
        q10.append(this.f17178c);
        q10.append(", osVersion=");
        q10.append(this.f17179d);
        q10.append(", logEnvironment=");
        q10.append(this.f17180e);
        q10.append(", androidAppInfo=");
        q10.append(this.f17181f);
        q10.append(')');
        return q10.toString();
    }
}
