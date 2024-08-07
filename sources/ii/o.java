package ii;

import android.content.Intent;
import android.view.View;
import com.vpa.daugia.module.cart.ui.CartManagerActivity;
import com.vpa.daugia.module.register.ui.ListAwaitAuctionActivity;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20600a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f20601b;

    public /* synthetic */ o(q qVar, int i10) {
        this.f20600a = i10;
        this.f20601b = qVar;
    }

    public final void onClick(View view) {
        switch (this.f20600a) {
            case 0:
                q qVar = this.f20601b;
                int i10 = q.f20604x0;
                j.f(qVar, "this$0");
                Intent intent = new Intent(qVar.d0(), ListAwaitAuctionActivity.class);
                intent.putExtra("PROVINCE_ID", "01");
                intent.putExtra("PROVINCE_TEXT", "Thủ đô Hà Nội");
                qVar.h0(intent);
                return;
            default:
                q qVar2 = this.f20601b;
                int i11 = q.f20604x0;
                j.f(qVar2, "this$0");
                qVar2.h0(new Intent(qVar2.d0(), CartManagerActivity.class));
                return;
        }
    }
}
