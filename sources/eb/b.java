package eb;

import java.util.Arrays;
import y6.i;

/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f9337a;

    public b(String str) {
        this.f9337a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return i.a(this.f9337a, ((b) obj).f9337a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9337a});
    }

    public final String toString() {
        i.a aVar = new i.a(this);
        aVar.a(this.f9337a, "token");
        return aVar.toString();
    }
}
