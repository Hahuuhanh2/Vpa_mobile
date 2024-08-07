package y6;

import com.google.android.gms.common.api.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class m implements a.d {

    /* renamed from: b  reason: collision with root package name */
    public static final m f17572b = new m(new a().f17574a);

    /* renamed from: a  reason: collision with root package name */
    public final String f17573a;

    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f17574a;
    }

    public /* synthetic */ m(String str) {
        this.f17573a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        return i.a(this.f17573a, ((m) obj).f17573a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17573a});
    }
}
