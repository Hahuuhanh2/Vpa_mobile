package t1;

import android.support.v4.media.a;
import android.util.Base64;
import java.util.List;

/* compiled from: FontRequest */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f14763a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14764b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14765c;

    /* renamed from: d  reason: collision with root package name */
    public final List<List<byte[]>> f14766d;

    /* renamed from: e  reason: collision with root package name */
    public final String f14767e;

    public f(String str, String str2, String str3, List<List<byte[]>> list) {
        str.getClass();
        this.f14763a = str;
        str2.getClass();
        this.f14764b = str2;
        this.f14765c = str3;
        list.getClass();
        this.f14766d = list;
        this.f14767e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder q10 = a.q("FontRequest {mProviderAuthority: ");
        q10.append(this.f14763a);
        q10.append(", mProviderPackage: ");
        q10.append(this.f14764b);
        q10.append(", mQuery: ");
        q10.append(this.f14765c);
        q10.append(", mCertificates:");
        sb2.append(q10.toString());
        for (int i10 = 0; i10 < this.f14766d.size(); i10++) {
            sb2.append(" [");
            List list = this.f14766d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        return a.o(sb2, "}", "mCertificatesArray: 0");
    }
}
