package wh;

import android.view.View;
import android.widget.PopupWindow;
import com.vpa.daugia.module.notification.ui.activity.NotificationManagerActivity;
import ef.n;
import ek.i;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: NotificationManagerActivity.kt */
public final class h extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PopupWindow f23416a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ NotificationManagerActivity f23417b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(PopupWindow popupWindow, NotificationManagerActivity notificationManagerActivity) {
        super(1);
        this.f23416a = popupWindow;
        this.f23417b = notificationManagerActivity;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        this.f23416a.dismiss();
        NotificationManagerActivity notificationManagerActivity = this.f23417b;
        int i10 = NotificationManagerActivity.T;
        notificationManagerActivity.U().f19778l.j(null);
        this.f23417b.U().f19771e = new n<>((Object) null);
        this.f23417b.U().d();
        return i.f20112a;
    }
}
