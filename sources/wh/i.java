package wh;

import android.view.View;
import android.widget.PopupWindow;
import com.vpa.daugia.module.notification.ui.activity.NotificationManagerActivity;
import ef.n;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: NotificationManagerActivity.kt */
public final class i extends k implements l<View, ek.i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PopupWindow f23418a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ NotificationManagerActivity f23419b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(PopupWindow popupWindow, NotificationManagerActivity notificationManagerActivity) {
        super(1);
        this.f23418a = popupWindow;
        this.f23419b = notificationManagerActivity;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        this.f23418a.dismiss();
        NotificationManagerActivity notificationManagerActivity = this.f23419b;
        int i10 = NotificationManagerActivity.T;
        notificationManagerActivity.U().f19778l.j(1);
        this.f23419b.U().f19771e = new n<>((Object) null);
        this.f23419b.U().d();
        return ek.i.f20112a;
    }
}
