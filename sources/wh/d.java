package wh;

import com.vpa.daugia.module.notification.ui.activity.NotificationManagerActivity;
import ef.n;
import ek.i;
import rk.l;
import sk.k;
import ze.f;

/* compiled from: NotificationManagerActivity.kt */
public final class d extends k implements l<f<? extends Object>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NotificationManagerActivity f23412a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(NotificationManagerActivity notificationManagerActivity) {
        super(1);
        this.f23412a = notificationManagerActivity;
    }

    public final Object invoke(Object obj) {
        if (((f) obj) instanceof f.c) {
            NotificationManagerActivity notificationManagerActivity = this.f23412a;
            int i10 = NotificationManagerActivity.T;
            notificationManagerActivity.U().f19771e = new n<>((Object) null);
            this.f23412a.U().d();
            this.f23412a.setResult(-1);
        }
        return i.f20112a;
    }
}
