package y4;

import android.net.Uri;
import android.text.TextUtils;
import j7.a;
import java.net.URL;
import java.security.MessageDigest;
import s4.e;

/* compiled from: GlideUrl */
public final class f implements e {

    /* renamed from: b  reason: collision with root package name */
    public final g f17462b;

    /* renamed from: c  reason: collision with root package name */
    public final URL f17463c;

    /* renamed from: d  reason: collision with root package name */
    public final String f17464d;

    /* renamed from: e  reason: collision with root package name */
    public String f17465e;

    /* renamed from: f  reason: collision with root package name */
    public URL f17466f;

    /* renamed from: g  reason: collision with root package name */
    public volatile byte[] f17467g;

    /* renamed from: h  reason: collision with root package name */
    public int f17468h;

    public f(URL url) {
        i iVar = g.f17469m;
        a.r(url);
        this.f17463c = url;
        this.f17464d = null;
        a.r(iVar);
        this.f17462b = iVar;
    }

    public final void a(MessageDigest messageDigest) {
        if (this.f17467g == null) {
            this.f17467g = c().getBytes(e.f14624a);
        }
        messageDigest.update(this.f17467g);
    }

    public final String c() {
        String str = this.f17464d;
        if (str != null) {
            return str;
        }
        URL url = this.f17463c;
        a.r(url);
        return url.toString();
    }

    public final String d() {
        if (TextUtils.isEmpty(this.f17465e)) {
            String str = this.f17464d;
            if (TextUtils.isEmpty(str)) {
                URL url = this.f17463c;
                a.r(url);
                str = url.toString();
            }
            this.f17465e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f17465e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!c().equals(fVar.c()) || !this.f17462b.equals(fVar.f17462b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f17468h == 0) {
            int hashCode = c().hashCode();
            this.f17468h = hashCode;
            this.f17468h = this.f17462b.hashCode() + (hashCode * 31);
        }
        return this.f17468h;
    }

    public final String toString() {
        return c();
    }

    public f(String str, g gVar) {
        this.f17463c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f17464d = str;
            a.r(gVar);
            this.f17462b = gVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
