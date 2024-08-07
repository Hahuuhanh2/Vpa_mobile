package com.vpa.daugia.module.notification.ui.activity;

import al.r0;
import com.vpa.daugia.module.home.data.model.Action;
import com.vpa.daugia.module.notification.data.model.Notification;
import com.vpa.daugia.module.notification.ui.NotificationViewModel;
import ek.i;
import ik.d;
import p3.l0;
import rk.l;
import sk.e;
import sk.j;
import sk.k;
import vh.b;

/* compiled from: NotificationManagerActivity.kt */
public final class a extends k implements l<Notification, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NotificationManagerActivity f19787a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(NotificationManagerActivity notificationManagerActivity) {
        super(1);
        this.f19787a = notificationManagerActivity;
    }

    public final Object invoke(Object obj) {
        Notification notification = (Notification) obj;
        j.f(notification, "it");
        Integer isSeen = notification.isSeen();
        if (isSeen == null || isSeen.intValue() != 1) {
            NotificationManagerActivity notificationManagerActivity = this.f19787a;
            int i10 = NotificationManagerActivity.T;
            NotificationViewModel U = notificationManagerActivity.U();
            l0.j0(l0.d0(U), r0.f19085b, new b(U, notification.getUuid(), (d<? super b>) null), 2);
        }
        NotificationManagerActivity notificationManagerActivity2 = this.f19787a;
        notificationManagerActivity2.getClass();
        if (notification.getClickAction() != null) {
            j7.a.d(notificationManagerActivity2, new Action(notification.getClickAction(), (String) null, 2, (e) null), false);
        }
        return i.f20112a;
    }
}
