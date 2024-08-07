package i3;

import android.support.v4.media.a;
import android.view.View;
import androidx.transition.Transition;
import f0.b0;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: TransitionValues */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f11062a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public View f11063b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<Transition> f11064c = new ArrayList<>();

    @Deprecated
    public p() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f11063b != pVar.f11063b || !this.f11062a.equals(pVar.f11062a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f11062a.hashCode() + (this.f11063b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder q10 = a.q("TransitionValues@");
        q10.append(Integer.toHexString(hashCode()));
        q10.append(":\n");
        StringBuilder v2 = b0.v(q10.toString(), "    view = ");
        v2.append(this.f11063b);
        v2.append("\n");
        String r10 = b0.r(v2.toString(), "    values:");
        for (String str : this.f11062a.keySet()) {
            r10 = r10 + "    " + str + ": " + this.f11062a.get(str) + "\n";
        }
        return r10;
    }

    public p(View view) {
        this.f11063b = view;
    }
}
