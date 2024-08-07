package xb;

import n0.l;
import sk.j;

/* compiled from: ApplicationInfo.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f17172a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17173b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17174c;

    /* renamed from: d  reason: collision with root package name */
    public final String f17175d;

    public a(String str, String str2, String str3, String str4) {
        j.f(str2, "versionName");
        j.f(str3, "appBuildVersion");
        this.f17172a = str;
        this.f17173b = str2;
        this.f17174c = str3;
        this.f17175d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f17172a, aVar.f17172a) && j.a(this.f17173b, aVar.f17173b) && j.a(this.f17174c, aVar.f17174c) && j.a(this.f17175d, aVar.f17175d);
    }

    public final int hashCode() {
        return this.f17175d.hashCode() + l.f(this.f17174c, l.f(this.f17173b, this.f17172a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("AndroidApplicationInfo(packageName=");
        q10.append(this.f17172a);
        q10.append(", versionName=");
        q10.append(this.f17173b);
        q10.append(", appBuildVersion=");
        q10.append(this.f17174c);
        q10.append(", deviceManufacturer=");
        return l.k(q10, this.f17175d, ')');
    }
}
