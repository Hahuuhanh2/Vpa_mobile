package xh;

import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.notification.data.model.Notification;
import ef.d;
import ek.i;
import java.io.Serializable;
import mg.i6;
import rk.l;
import sk.j;

/* compiled from: NotificationAdapter.kt */
public final class a extends d<Notification, i6> {

    /* renamed from: p  reason: collision with root package name */
    public final l<Notification, i> f23475p;

    public a(com.vpa.daugia.module.notification.ui.activity.a aVar) {
        super(aVar);
        this.f23475p = aVar;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        i6 i6Var = (i6) lVar;
        Notification notification = (Notification) serializable;
        j.f(i6Var, "binding");
        j.f(notification, "model");
        i6Var.v(new b(y(), notification));
    }

    public final int x() {
        return C0535R$layout.item_notify;
    }

    public final void z(Serializable serializable) {
        Notification notification = (Notification) serializable;
        j.f(notification, "model");
        this.f23475p.invoke(notification);
    }
}
