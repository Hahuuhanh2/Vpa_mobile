package com.vpa.daugia.module.notification.ui;

import al.d0;
import al.r0;
import com.vpa.daugia.module.notification.data.api.NotificationApiHelper;
import com.vpa.daugia.module.notification.data.model.Notification;
import ef.k;
import ef.n;
import ik.d;
import java.util.ArrayList;
import kk.e;
import kk.i;
import n0.l;
import p3.l0;
import r2.p;
import r2.v;
import sk.j;
import ze.f;

/* compiled from: NotificationViewModel.kt */
public final class NotificationViewModel extends v {

    /* renamed from: d  reason: collision with root package name */
    public final NotificationApiHelper f19770d;

    /* renamed from: e  reason: collision with root package name */
    public n<Notification> f19771e = new n<>((Object) null);

    /* renamed from: f  reason: collision with root package name */
    public final p<f<ArrayList<Notification>>> f19772f;

    /* renamed from: g  reason: collision with root package name */
    public final p f19773g;

    /* renamed from: h  reason: collision with root package name */
    public final p<f<String>> f19774h;

    /* renamed from: i  reason: collision with root package name */
    public final p f19775i;

    /* renamed from: j  reason: collision with root package name */
    public final p<f<Object>> f19776j;

    /* renamed from: k  reason: collision with root package name */
    public final p f19777k;

    /* renamed from: l  reason: collision with root package name */
    public final p<Integer> f19778l;

    /* renamed from: m  reason: collision with root package name */
    public final p f19779m;

    @e(c = "com.vpa.daugia.module.notification.ui.NotificationViewModel$getNotifications$1", f = "NotificationViewModel.kt", l = {52}, m = "invokeSuspend")
    /* compiled from: NotificationViewModel.kt */
    public static final class a extends i implements rk.p<d0, d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19780a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ NotificationViewModel f19781b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(NotificationViewModel notificationViewModel, d<? super a> dVar) {
            super(2, dVar);
            this.f19781b = notificationViewModel;
        }

        public final d<ek.i> create(Object obj, d<?> dVar) {
            return new a(this.f19781b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i10 = this.f19780a;
            if (i10 == 0) {
                l0.Q0(obj);
                if (!this.f19781b.f19771e.d()) {
                    return ek.i.f20112a;
                }
                this.f19781b.f19772f.k(f.b.f18005a);
                NotificationViewModel notificationViewModel = this.f19781b;
                this.f19780a = 1;
                obj = notificationViewModel.f19770d.getNotifications(new Integer(notificationViewModel.f19771e.f()), new Integer(this.f19781b.f19771e.b()), this.f19781b.f19778l.d(), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i10 == 1) {
                try {
                    l0.Q0(obj);
                } catch (Exception e10) {
                    l.p(e10, this.f19781b.f19772f);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k kVar = (k) obj;
            if (kVar.e()) {
                n nVar = (n) kVar.d();
                if (nVar != null) {
                    arrayList = nVar.a();
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    p<f<ArrayList<Notification>>> pVar = this.f19781b.f19772f;
                    ArrayList a10 = nVar.a();
                    j.c(a10);
                    pVar.k(new f.c(a10));
                }
                if (nVar != null) {
                    NotificationViewModel notificationViewModel2 = this.f19781b;
                    Object d10 = kVar.d();
                    j.c(d10);
                    notificationViewModel2.getClass();
                    notificationViewModel2.f19771e = (n) d10;
                }
            } else {
                this.f19781b.f19772f.k(new f.a(new Exception((String) fk.p.N0(kVar.c()))));
            }
            return ek.i.f20112a;
        }
    }

    public NotificationViewModel(NotificationApiHelper notificationApiHelper) {
        j.f(notificationApiHelper, "notificationApiHelper");
        this.f19770d = notificationApiHelper;
        p<f<ArrayList<Notification>>> pVar = new p<>();
        this.f19772f = pVar;
        this.f19773g = pVar;
        p<f<String>> pVar2 = new p<>();
        this.f19774h = pVar2;
        this.f19775i = pVar2;
        p<f<Object>> pVar3 = new p<>();
        this.f19776j = pVar3;
        this.f19777k = pVar3;
        p<Integer> pVar4 = new p<>();
        this.f19778l = pVar4;
        this.f19779m = pVar4;
    }

    public final void d() {
        l0.j0(l0.d0(this), r0.f19085b, new a(this, (d<? super a>) null), 2);
    }
}
