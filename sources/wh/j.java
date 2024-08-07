package wh;

import android.view.View;
import android.widget.PopupWindow;
import com.vpa.daugia.module.notification.ui.activity.NotificationManagerActivity;
import ef.n;
import ek.i;
import rk.l;
import sk.k;

/* compiled from: NotificationManagerActivity.kt */
public final class j extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PopupWindow f23420a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ NotificationManagerActivity f23421b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(PopupWindow popupWindow, NotificationManagerActivity notificationManagerActivity) {
        super(1);
        this.f23420a = popupWindow;
        this.f23421b = notificationManagerActivity;
    }

    public final Object invoke(Object obj) {
        sk.j.f((View) obj, "it");
        this.f23420a.dismiss();
        NotificationManagerActivity notificationManagerActivity = this.f23421b;
        int i10 = NotificationManagerActivity.T;
        notificationManagerActivity.U().f19778l.j(0);
        this.f23421b.U().f19771e = new n<>((Object) null);
        this.f23421b.U().d();
        return i.f20112a;
    }
}
