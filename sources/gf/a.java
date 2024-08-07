package gf;

import android.graphics.Bitmap;
import cc.b;
import java.io.Serializable;
import sk.j;

/* compiled from: File.kt */
public final class a implements Serializable {
    @b("fileUrl")

    /* renamed from: a  reason: collision with root package name */
    private String f10494a;
    @b("filename")

    /* renamed from: b  reason: collision with root package name */
    private String f10495b;

    /* renamed from: c  reason: collision with root package name */
    public Bitmap f10496c;

    public a() {
        this((String) null, (String) null, 7);
    }

    public a(String str, String str2, int i10) {
        str = (i10 & 1) != 0 ? null : str;
        str2 = (i10 & 2) != 0 ? null : str2;
        this.f10494a = str;
        this.f10495b = str2;
        this.f10496c = null;
    }

    public final String a() {
        return this.f10494a;
    }

    public final String b() {
        return this.f10495b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f10494a, aVar.f10494a) && j.a(this.f10495b, aVar.f10495b) && j.a(this.f10496c, aVar.f10496c);
    }

    public final int hashCode() {
        String str = this.f10494a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10495b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Bitmap bitmap = this.f10496c;
        if (bitmap != null) {
            i10 = bitmap.hashCode();
        }
        return hashCode2 + i10;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("File(fileUrl=");
        q10.append(this.f10494a);
        q10.append(", filename=");
        q10.append(this.f10495b);
        q10.append(", bitmap=");
        q10.append(this.f10496c);
        q10.append(')');
        return q10.toString();
    }
}
