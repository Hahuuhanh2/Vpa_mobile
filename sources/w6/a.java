package w6;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import java.util.Arrays;
import y6.i;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class a<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    public final int f16535a;

    /* renamed from: b  reason: collision with root package name */
    public final com.google.android.gms.common.api.a f16536b;

    /* renamed from: c  reason: collision with root package name */
    public final a.d f16537c;

    /* renamed from: d  reason: collision with root package name */
    public final String f16538d;

    public a(com.google.android.gms.common.api.a aVar, a.d dVar, String str) {
        this.f16536b = aVar;
        this.f16537c = dVar;
        this.f16538d = str;
        this.f16535a = Arrays.hashCode(new Object[]{aVar, dVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!i.a(this.f16536b, aVar.f16536b) || !i.a(this.f16537c, aVar.f16537c) || !i.a(this.f16538d, aVar.f16538d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16535a;
    }
}
