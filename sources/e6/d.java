package e6;

import android.support.v4.media.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AutoValue_BatchedLogRequest */
public final class d extends j {

    /* renamed from: a  reason: collision with root package name */
    public final List<m> f9203a;

    public d(ArrayList arrayList) {
        this.f9203a = arrayList;
    }

    public final List<m> a() {
        return this.f9203a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f9203a.equals(((j) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f9203a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder q10 = a.q("BatchedLogRequest{logRequests=");
        q10.append(this.f9203a);
        q10.append("}");
        return q10.toString();
    }
}
