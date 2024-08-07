package rh;

import al.d0;
import al.m0;
import com.vpa.daugia.module.menu.ui.MenuViewModel;
import ik.d;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;
import sk.j;

@e(c = "com.vpa.daugia.module.menu.ui.MenuViewModel$getCurrentTime$1", f = "MenuViewModel.kt", l = {61}, m = "invokeSuspend")
/* compiled from: MenuViewModel.kt */
public final class a extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f22784a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MenuViewModel f22785b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(MenuViewModel menuViewModel, d<? super a> dVar) {
        super(2, dVar);
        this.f22785b = menuViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new a(this.f22785b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        jk.a aVar = jk.a.COROUTINE_SUSPENDED;
        int i10 = this.f22784a;
        if (i10 == 0 || i10 == 1) {
            l0.Q0(obj);
            do {
                r2.p<String> pVar = this.f22785b.f19753i;
                Calendar instance = Calendar.getInstance();
                j.e(instance, "getInstance(...)");
                try {
                    str = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy", Locale.getDefault()).format(instance.getTime());
                    j.e(str, "format(...)");
                } catch (Exception unused) {
                    str = "";
                }
                pVar.k(str);
                this.f22784a = 1;
            } while (m0.a(1000, this) != aVar);
            return aVar;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
