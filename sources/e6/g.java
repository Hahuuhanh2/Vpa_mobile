package e6;

import android.support.v4.media.a;
import java.util.List;

/* compiled from: AutoValue_LogRequest */
public final class g extends m {

    /* renamed from: a  reason: collision with root package name */
    public final long f9220a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9221b;

    /* renamed from: c  reason: collision with root package name */
    public final k f9222c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f9223d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9224e;

    /* renamed from: f  reason: collision with root package name */
    public final List<l> f9225f;

    /* renamed from: g  reason: collision with root package name */
    public final p f9226g;

    public g() {
        throw null;
    }

    public g(long j10, long j11, k kVar, Integer num, String str, List list, p pVar) {
        this.f9220a = j10;
        this.f9221b = j11;
        this.f9222c = kVar;
        this.f9223d = num;
        this.f9224e = str;
        this.f9225f = list;
        this.f9226g = pVar;
    }

    public final k a() {
        return this.f9222c;
    }

    public final List<l> b() {
        return this.f9225f;
    }

    public final Integer c() {
        return this.f9223d;
    }

    public final String d() {
        return this.f9224e;
    }

    public final p e() {
        return this.f9226g;
    }

    public final boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f9220a == mVar.f() && this.f9221b == mVar.g() && ((kVar = this.f9222c) != null ? kVar.equals(mVar.a()) : mVar.a() == null) && ((num = this.f9223d) != null ? num.equals(mVar.c()) : mVar.c() == null) && ((str = this.f9224e) != null ? str.equals(mVar.d()) : mVar.d() == null) && ((list = this.f9225f) != null ? list.equals(mVar.b()) : mVar.b() == null)) {
            p pVar = this.f9226g;
            if (pVar == null) {
                if (mVar.e() == null) {
                    return true;
                }
            } else if (pVar.equals(mVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return this.f9220a;
    }

    public final long g() {
        return this.f9221b;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        long j10 = this.f9220a;
        long j11 = this.f9221b;
        int i14 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        k kVar = this.f9222c;
        int i15 = 0;
        if (kVar == null) {
            i10 = 0;
        } else {
            i10 = kVar.hashCode();
        }
        int i16 = (i14 ^ i10) * 1000003;
        Integer num = this.f9223d;
        if (num == null) {
            i11 = 0;
        } else {
            i11 = num.hashCode();
        }
        int i17 = (i16 ^ i11) * 1000003;
        String str = this.f9224e;
        if (str == null) {
            i12 = 0;
        } else {
            i12 = str.hashCode();
        }
        int i18 = (i17 ^ i12) * 1000003;
        List<l> list = this.f9225f;
        if (list == null) {
            i13 = 0;
        } else {
            i13 = list.hashCode();
        }
        int i19 = (i18 ^ i13) * 1000003;
        p pVar = this.f9226g;
        if (pVar != null) {
            i15 = pVar.hashCode();
        }
        return i19 ^ i15;
    }

    public final String toString() {
        StringBuilder q10 = a.q("LogRequest{requestTimeMs=");
        q10.append(this.f9220a);
        q10.append(", requestUptimeMs=");
        q10.append(this.f9221b);
        q10.append(", clientInfo=");
        q10.append(this.f9222c);
        q10.append(", logSource=");
        q10.append(this.f9223d);
        q10.append(", logSourceName=");
        q10.append(this.f9224e);
        q10.append(", logEvents=");
        q10.append(this.f9225f);
        q10.append(", qosTier=");
        q10.append(this.f9226g);
        q10.append("}");
        return q10.toString();
    }
}
