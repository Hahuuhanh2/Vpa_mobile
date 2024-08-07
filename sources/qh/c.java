package qh;

import android.support.v4.media.a;
import com.vpa.daugia.module.history.data.model.NotifyAuction;
import sk.j;

/* compiled from: NotifyActionItemState.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final NotifyAuction f22756a;

    public c(NotifyAuction notifyAuction) {
        j.f(notifyAuction, "item");
        this.f22756a = notifyAuction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && j.a(this.f22756a, ((c) obj).f22756a);
    }

    public final int hashCode() {
        return this.f22756a.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = a.q("NotifyActionItemState(item=");
        q10.append(this.f22756a);
        q10.append(')');
        return q10.toString();
    }
}
