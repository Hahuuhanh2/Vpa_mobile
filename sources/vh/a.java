package vh;

import al.d0;
import com.vpa.daugia.module.notification.data.api.NotificationApiHelper;
import com.vpa.daugia.module.notification.ui.NotificationViewModel;
import ef.k;
import ik.d;
import kk.e;
import kk.i;
import n0.l;
import p3.l0;
import rk.p;
import ze.f;

@e(c = "com.vpa.daugia.module.notification.ui.NotificationViewModel$markAllAsRead$1", f = "NotificationViewModel.kt", l = {92}, m = "invokeSuspend")
/* compiled from: NotificationViewModel.kt */
public final class a extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f23320a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ NotificationViewModel f23321b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(NotificationViewModel notificationViewModel, d<? super a> dVar) {
        super(2, dVar);
        this.f23321b = notificationViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new a(this.f23321b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        jk.a aVar = jk.a.COROUTINE_SUSPENDED;
        int i10 = this.f23320a;
        if (i10 == 0) {
            l0.Q0(obj);
            NotificationApiHelper notificationApiHelper = this.f23321b.f19770d;
            this.f23320a = 1;
            obj = notificationApiHelper.markAllAsRead(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                l.p(e10, this.f23321b.f19776j);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k kVar = (k) obj;
        if (kVar.e()) {
            this.f23321b.f19776j.k(new f.c(kVar));
        } else {
            this.f23321b.f19776j.k(new f.a(new Exception((String) fk.p.N0(kVar.c()))));
        }
        return ek.i.f20112a;
    }
}
