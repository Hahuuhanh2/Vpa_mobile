package jh;

import com.vpa.daugia.module.common.data.model.MyDocument;
import sk.j;

/* compiled from: DocumentItemState.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final MyDocument f20779a;

    public a(MyDocument myDocument) {
        j.f(myDocument, "item");
        this.f20779a = myDocument;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && j.a(this.f20779a, ((a) obj).f20779a);
    }

    public final int hashCode() {
        return this.f20779a.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("DocumentItemState(item=");
        q10.append(this.f20779a);
        q10.append(')');
        return q10.toString();
    }
}
