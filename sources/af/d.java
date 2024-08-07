package af;

import ah.g;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import com.ots.base.utils.customview.DebugView;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.module.cart.data.model.Cart;
import com.vpa.daugia.module.profile.ui.activity.ProfileActivity;
import d.h;
import eh.f;
import ek.i;
import j$.time.LocalDate;
import jf.b;
import kf.e;
import mg.x0;
import rk.l;
import sk.j;
import sk.q;
import zd.a;
import zd.c;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f185a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f186b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f187c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f185a = i10;
        this.f186b = obj;
        this.f187c = obj2;
    }

    public final void onClick(View view) {
        switch (this.f185a) {
            case 0:
                DebugView debugView = (DebugView) this.f186b;
                Context context = (Context) this.f187c;
                int i10 = DebugView.f8249f;
                j.f(debugView, "this$0");
                j.f(context, "$context");
                int i11 = debugView.f8252e + 1;
                debugView.f8252e = i11;
                if (i11 == 5) {
                    b bVar = new b(context, "Đổi môi trường API:", "Chọn môi trường API cần đổi?", "PRO API", "DEV API", true);
                    bVar.f11889j = new DebugView.a(debugView, context);
                    bVar.h();
                    return;
                }
                new Handler(Looper.getMainLooper()).postDelayed(new h(debugView, 28), 2000);
                return;
            case 1:
                g gVar = (g) this.f186b;
                ah.d dVar = (ah.d) this.f187c;
                j.f(gVar, "this$0");
                j.f(dVar, "this$1");
                a aVar = gVar.K;
                if (aVar == null) {
                    j.l("day");
                    throw null;
                } else if (aVar.f17979b != c.MonthDate) {
                    return;
                } else {
                    if (aVar != null) {
                        LocalDate localDate = aVar.f17978a;
                        dVar.f18962k.clear();
                        if (dVar.f18962k.contains(localDate)) {
                            dVar.f18962k.remove(localDate);
                        } else {
                            dVar.f18962k.add(localDate);
                        }
                        dVar.f18960i.f21334x.x0();
                        return;
                    }
                    j.l("day");
                    throw null;
                }
            case 2:
                f fVar = (f) this.f186b;
                Cart cart = (Cart) this.f187c;
                j.f(fVar, "this$0");
                j.f(cart, "$model");
                l<? super Cart, i> lVar = fVar.f20067q;
                if (lVar != null) {
                    lVar.invoke(cart);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f186b;
                q qVar = (q) this.f187c;
                int i12 = ProfileActivity.f19812b0;
                j.f(profileActivity, "this$0");
                j.f(qVar, "$isShowBank");
                LinearLayout linearLayout = ((x0) profileActivity.M()).f21429a0;
                j.e(linearLayout, "lnBank");
                e.j(linearLayout);
                if (qVar.f22930a) {
                    ((x0) profileActivity.M()).f21447z.setCompoundDrawablesWithIntrinsicBounds((int) C0531R$drawable.ic_card_white, 0, (int) C0531R$drawable.ic_direction_down, 0);
                } else {
                    ((x0) profileActivity.M()).f21447z.setCompoundDrawablesWithIntrinsicBounds((int) C0531R$drawable.ic_card_white, 0, (int) C0531R$drawable.ic_direction_up, 0);
                }
                qVar.f22930a = !qVar.f22930a;
                return;
        }
    }
}
