package gf;

import android.support.v4.media.a;
import java.io.Serializable;
import n0.l;
import sk.j;

/* compiled from: SelectionItem.kt */
public final class b implements Serializable {
    @cc.b("text")

    /* renamed from: a  reason: collision with root package name */
    private String f10497a;
    @cc.b("default")

    /* renamed from: b  reason: collision with root package name */
    private boolean f10498b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10499c;
    @cc.b("value")

    /* renamed from: d  reason: collision with root package name */
    private String f10500d;

    /* renamed from: e  reason: collision with root package name */
    public Integer f10501e;

    /* renamed from: f  reason: collision with root package name */
    public String f10502f;

    public b() {
        this((String) null, false, (String) null, (Integer) null, 63);
    }

    public b(String str, boolean z10, String str2, Integer num, int i10) {
        String str3 = "";
        str = (i10 & 1) != 0 ? str3 : str;
        z10 = (i10 & 4) != 0 ? false : z10;
        str2 = (i10 & 8) != 0 ? str3 : str2;
        num = (i10 & 16) != 0 ? null : num;
        str3 = (i10 & 32) == 0 ? null : str3;
        this.f10497a = str;
        this.f10498b = false;
        this.f10499c = z10;
        this.f10500d = str2;
        this.f10501e = num;
        this.f10502f = str3;
    }

    public final String a() {
        return this.f10497a;
    }

    public final String b() {
        return this.f10500d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j.a(this.f10497a, bVar.f10497a) && this.f10498b == bVar.f10498b && this.f10499c == bVar.f10499c && j.a(this.f10500d, bVar.f10500d) && j.a(this.f10501e, bVar.f10501e) && j.a(this.f10502f, bVar.f10502f);
    }

    public final int hashCode() {
        String str = this.f10497a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z10 = this.f10498b;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i11 = (hashCode + (z10 ? 1 : 0)) * 31;
        boolean z12 = this.f10499c;
        if (!z12) {
            z11 = z12;
        }
        int i12 = (i11 + (z11 ? 1 : 0)) * 31;
        String str2 = this.f10500d;
        int hashCode2 = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f10501e;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f10502f;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode3 + i10;
    }

    public final String toString() {
        StringBuilder q10 = a.q("SelectionItem(text=");
        q10.append(this.f10497a);
        q10.append(", default=");
        q10.append(this.f10498b);
        q10.append(", checked=");
        q10.append(this.f10499c);
        q10.append(", value=");
        q10.append(this.f10500d);
        q10.append(", icon=");
        q10.append(this.f10501e);
        q10.append(", textNoAccent=");
        return l.k(q10, this.f10502f, ')');
    }
}
