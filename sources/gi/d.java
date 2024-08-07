package gi;

import android.content.Intent;
import android.view.View;
import com.vpa.daugia.module.profile.ui.activity.InstructVerifyActivity;
import com.vpa.daugia.module.profile.ui.activity.VerifyActivity;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20359a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InstructVerifyActivity f20360b;

    public /* synthetic */ d(InstructVerifyActivity instructVerifyActivity, int i10) {
        this.f20359a = i10;
        this.f20360b = instructVerifyActivity;
    }

    public final void onClick(View view) {
        switch (this.f20359a) {
            case 0:
                InstructVerifyActivity instructVerifyActivity = this.f20360b;
                int i10 = InstructVerifyActivity.P;
                j.f(instructVerifyActivity, "this$0");
                Intent intent = new Intent(instructVerifyActivity, VerifyActivity.class);
                intent.putExtra("ON_VERIFY_PROFILE", instructVerifyActivity.O);
                instructVerifyActivity.startActivity(intent);
                instructVerifyActivity.finish();
                return;
            default:
                InstructVerifyActivity instructVerifyActivity2 = this.f20360b;
                int i11 = InstructVerifyActivity.P;
                j.f(instructVerifyActivity2, "this$0");
                instructVerifyActivity2.finish();
                return;
        }
    }
}
