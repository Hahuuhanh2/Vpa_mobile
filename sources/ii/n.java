package ii;

import android.content.Intent;
import android.view.View;
import com.vpa.daugia.module.notification.ui.activity.NotificationManagerActivity;
import com.vpa.daugia.module.register.ui.ListAwaitAuctionActivity;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20598a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f20599b;

    public /* synthetic */ n(q qVar, int i10) {
        this.f20598a = i10;
        this.f20599b = qVar;
    }

    public final void onClick(View view) {
        Class<ListAwaitAuctionActivity> cls = ListAwaitAuctionActivity.class;
        switch (this.f20598a) {
            case 0:
                q qVar = this.f20599b;
                int i10 = q.f20604x0;
                j.f(qVar, "this$0");
                qVar.h0(new Intent(qVar.d0(), cls));
                return;
            case 1:
                q qVar2 = this.f20599b;
                int i11 = q.f20604x0;
                j.f(qVar2, "this$0");
                qVar2.h0(new Intent(qVar2.d0(), NotificationManagerActivity.class));
                return;
            default:
                q qVar3 = this.f20599b;
                int i12 = q.f20604x0;
                j.f(qVar3, "this$0");
                Intent intent = new Intent(qVar3.d0(), cls);
                intent.putExtra("AUTO_FILTER", true);
                qVar3.h0(intent);
                return;
        }
    }
}
