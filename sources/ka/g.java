package ka;

import android.support.v4.media.a;
import java.util.Arrays;
import ka.b0;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File */
public final class g extends b0.d.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f12293a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f12294b;

    public g(String str, byte[] bArr) {
        this.f12293a = str;
        this.f12294b = bArr;
    }

    public final byte[] a() {
        return this.f12294b;
    }

    public final String b() {
        return this.f12293a;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.d.a)) {
            return false;
        }
        b0.d.a aVar = (b0.d.a) obj;
        if (this.f12293a.equals(aVar.b())) {
            byte[] bArr2 = this.f12294b;
            if (aVar instanceof g) {
                bArr = ((g) aVar).f12294b;
            } else {
                bArr = aVar.a();
            }
            if (Arrays.equals(bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f12293a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12294b);
    }

    public final String toString() {
        StringBuilder q10 = a.q("File{filename=");
        q10.append(this.f12293a);
        q10.append(", contents=");
        q10.append(Arrays.toString(this.f12294b));
        q10.append("}");
        return q10.toString();
    }
}
