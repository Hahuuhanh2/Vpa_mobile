package w6;

import com.google.android.gms.common.Feature;
import java.util.Arrays;
import y6.i;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final a f16560a;

    /* renamed from: b  reason: collision with root package name */
    public final Feature f16561b;

    public /* synthetic */ c0(a aVar, Feature feature) {
        this.f16560a = aVar;
        this.f16561b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof c0)) {
            c0 c0Var = (c0) obj;
            if (!i.a(this.f16560a, c0Var.f16560a) || !i.a(this.f16561b, c0Var.f16561b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16560a, this.f16561b});
    }

    public final String toString() {
        i.a aVar = new i.a(this);
        aVar.a(this.f16560a, "key");
        aVar.a(this.f16561b, "feature");
        return aVar.toString();
    }
}
