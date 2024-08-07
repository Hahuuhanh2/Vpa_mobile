package ii;

import android.content.Intent;
import android.view.View;
import com.vpa.daugia.module.register.ui.ListAwaitAuctionActivity;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20602a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f20603b;

    public /* synthetic */ p(q qVar, int i10) {
        this.f20602a = i10;
        this.f20603b = qVar;
    }

    public final void onClick(View view) {
        Class<ListAwaitAuctionActivity> cls = ListAwaitAuctionActivity.class;
        switch (this.f20602a) {
            case 0:
                q qVar = this.f20603b;
                int i10 = q.f20604x0;
                j.f(qVar, "this$0");
                Intent intent = new Intent(qVar.d0(), cls);
                intent.putExtra("PROVINCE_ID", "79");
                intent.putExtra("PROVINCE_TEXT", "TP. Hồ Chí Minh");
                qVar.h0(intent);
                return;
            default:
                q qVar2 = this.f20603b;
                int i11 = q.f20604x0;
                j.f(qVar2, "this$0");
                Intent intent2 = new Intent(qVar2.d0(), cls);
                intent2.putExtra("AUTO_SEARCH", true);
                qVar2.h0(intent2);
                return;
        }
    }
}
