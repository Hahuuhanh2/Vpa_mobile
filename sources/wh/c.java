package wh;

import com.vpa.daugia.module.notification.data.model.Notification;
import com.vpa.daugia.module.notification.ui.activity.NotificationManagerActivity;
import ek.i;
import java.util.Iterator;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: NotificationManagerActivity.kt */
public final class c extends k implements l<f<? extends String>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NotificationManagerActivity f23411a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(NotificationManagerActivity notificationManagerActivity) {
        super(1);
        this.f23411a = notificationManagerActivity;
    }

    public final Object invoke(Object obj) {
        T t10;
        f fVar = (f) obj;
        if (fVar instanceof f.c) {
            NotificationManagerActivity notificationManagerActivity = this.f23411a;
            int i10 = NotificationManagerActivity.T;
            Iterator<T> it = notificationManagerActivity.T().f9444f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (j.a(((Notification) t10).getUuid(), ((f.c) fVar).f18006a)) {
                    break;
                }
            }
            Notification notification = (Notification) t10;
            if (notification != null) {
                notification.setSeen(1);
            }
            this.f23411a.T().f();
            this.f23411a.setResult(-1);
        }
        return i.f20112a;
    }
}
