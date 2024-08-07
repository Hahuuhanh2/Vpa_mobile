package gi;

import android.content.Intent;
import android.view.View;
import com.vpa.daugia.module.profile.ui.activity.PolicyAndTermActivity;
import com.vpa.daugia.module.profile.ui.activity.ProfileActivity;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20391a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ProfileActivity f20392b;

    public /* synthetic */ k0(ProfileActivity profileActivity, int i10) {
        this.f20391a = i10;
        this.f20392b = profileActivity;
    }

    public final void onClick(View view) {
        switch (this.f20391a) {
            case 0:
                ProfileActivity profileActivity = this.f20392b;
                int i10 = ProfileActivity.f19812b0;
                j.f(profileActivity, "this$0");
                profileActivity.finish();
                return;
            default:
                ProfileActivity profileActivity2 = this.f20392b;
                int i11 = ProfileActivity.f19812b0;
                j.f(profileActivity2, "this$0");
                Intent intent = new Intent(profileActivity2, PolicyAndTermActivity.class);
                intent.putExtra("ON_VERIFY_PROFILE", profileActivity2.U);
                profileActivity2.startActivity(intent);
                profileActivity2.finish();
                return;
        }
    }
}
