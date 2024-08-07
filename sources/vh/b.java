package vh;

import al.d0;
import com.vpa.daugia.module.notification.data.api.NotificationApiHelper;
import com.vpa.daugia.module.notification.ui.NotificationViewModel;
import ef.k;
import ik.d;
import jk.a;
import kk.e;
import kk.i;
import n0.l;
import p3.l0;
import rk.p;
import ze.f;

@e(c = "com.vpa.daugia.module.notification.ui.NotificationViewModel$markAsRead$1", f = "NotificationViewModel.kt", l = {77}, m = "invokeSuspend")
/* compiled from: NotificationViewModel.kt */
public final class b extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f23322a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ NotificationViewModel f23323b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f23324c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(NotificationViewModel notificationViewModel, String str, d<? super b> dVar) {
        super(2, dVar);
        this.f23323b = notificationViewModel;
        this.f23324c = str;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new b(this.f23323b, this.f23324c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f23322a;
        if (i10 == 0) {
            l0.Q0(obj);
            NotificationApiHelper notificationApiHelper = this.f23323b.f19770d;
            String str = this.f23324c;
            this.f23322a = 1;
            obj = notificationApiHelper.markAsRead(str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                l.p(e10, this.f23323b.f19774h);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k kVar = (k) obj;
        if (kVar.e()) {
            r2.p<f<String>> pVar = this.f23323b.f19774h;
            String str2 = this.f23324c;
            if (str2 == null) {
                str2 = "";
            }
            pVar.k(new f.c(str2));
        } else {
            this.f23323b.f19774h.k(new f.a(new Exception((String) fk.p.N0(kVar.c()))));
        }
        return ek.i.f20112a;
    }
}
