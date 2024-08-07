package xh;

import android.content.Context;
import android.support.v4.media.a;
import com.vpa.daugia.module.notification.data.model.Notification;
import sk.j;

/* compiled from: NotificationItemState.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f23476a;

    /* renamed from: b  reason: collision with root package name */
    public final Notification f23477b;

    public b(Context context, Notification notification) {
        j.f(notification, "item");
        this.f23476a = context;
        this.f23477b = notification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j.a(this.f23476a, bVar.f23476a) && j.a(this.f23477b, bVar.f23477b);
    }

    public final int hashCode() {
        return this.f23477b.hashCode() + (this.f23476a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder q10 = a.q("NotificationItemState(context=");
        q10.append(this.f23476a);
        q10.append(", item=");
        q10.append(this.f23477b);
        q10.append(')');
        return q10.toString();
    }
}
