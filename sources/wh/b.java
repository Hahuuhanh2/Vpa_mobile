package wh;

import com.vpa.daugia.module.notification.data.model.Notification;
import com.vpa.daugia.module.notification.ui.activity.NotificationManagerActivity;
import ek.i;
import java.util.ArrayList;
import java.util.List;
import mg.k0;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: NotificationManagerActivity.kt */
public final class b extends k implements l<f<? extends ArrayList<Notification>>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NotificationManagerActivity f23410a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(NotificationManagerActivity notificationManagerActivity) {
        super(1);
        this.f23410a = notificationManagerActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (!(fVar instanceof f.a) && !j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            if (((k0) this.f23410a.M()).f21143x.getOnLoadMore()) {
                this.f23410a.T().t((List) ((f.c) fVar).f18006a);
                ((k0) this.f23410a.M()).f21143x.setOnLoadMore(false);
            } else {
                this.f23410a.T().A((List) ((f.c) fVar).f18006a);
            }
            ((k0) this.f23410a.M()).f21143x.b(this.f23410a.T().f9444f);
        }
        return i.f20112a;
    }
}
