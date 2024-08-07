package zh;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.w;
import bc.h;
import com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.payment.ui.activity.PaymentActivity;
import com.vpa.daugia.module.payment.ui.activity.RegulationActivity;
import com.vpa.daugia.module.plate_selection.ui.activity.PlateSelectionActivity;
import com.vpa.daugia.module.profile.ui.activity.InstructVerifyActivity;
import com.vpa.daugia.module.profile.ui.activity.OrganizationProfileActivity;
import com.vpa.daugia.module.profile.ui.activity.PolicyAndTermActivity;
import com.vpa.daugia.module.profile.ui.activity.VerifyActivity;
import com.vpa.daugia.module.register.ui.ListAwaitAuctionActivity;
import com.vpa.daugia.module.scope.ui.activity.ScopeActivity;
import com.vpa.daugia.module.searching.ui.activity.FilterActivity;
import com.vpa.daugia.module.searching.ui.activity.SearchingActivity;
import com.vpa.daugia.module.support.ui.activity.QuestionActivity;
import com.vpa.daugia.ui.MainActivity;
import com.vpa.daugia.ui.WelcomeActivity;
import ei.b;
import ek.i;
import fk.p;
import gf.a;
import io.github.g00fy2.quickie.QROverlayView;
import java.util.ArrayList;
import mg.e4;
import mg.m0;
import sk.j;
import yk.l;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23779a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f23780b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f23779a = i10;
        this.f23780b = obj;
    }

    public final void onClick(View view) {
        ContactPersonIdentityCard contactPersonIdentityCard;
        ArrayList<a> files;
        String str = "";
        switch (this.f23779a) {
            case 0:
                RegulationActivity regulationActivity = (RegulationActivity) this.f23780b;
                int i10 = RegulationActivity.O;
                j.f(regulationActivity, "this$0");
                regulationActivity.startActivity(new Intent(regulationActivity, PaymentActivity.class));
                return;
            case 1:
                ai.j jVar = (ai.j) this.f23780b;
                int i11 = ai.j.f18980n0;
                j.f(jVar, "this$0");
                FragmentActivity c02 = jVar.c0();
                CharSequence text = ((e4) jVar.i0()).A.getText();
                if (text != null) {
                    str = l.k1(text.toString()).toString();
                }
                ai.d dVar = new ai.d(jVar);
                Object systemService = c02.getSystemService("clipboard");
                j.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("\"text\"", str));
                dVar.invoke("Đã lưu vào bộ nhớ tạm");
                return;
            case 2:
                PlateSelectionActivity plateSelectionActivity = (PlateSelectionActivity) this.f23780b;
                int i12 = PlateSelectionActivity.P;
                j.f(plateSelectionActivity, "this$0");
                b bVar = new b(plateSelectionActivity);
                bVar.f20071i = ci.a.f19200a;
                bVar.h();
                return;
            case 3:
                b bVar2 = (b) this.f23780b;
                j.f(bVar2, "this$0");
                bVar2.a();
                rk.a<i> aVar = bVar2.f20071i;
                if (aVar != null) {
                    aVar.invoke();
                    return;
                }
                return;
            case 4:
                InstructVerifyActivity instructVerifyActivity = (InstructVerifyActivity) this.f23780b;
                int i13 = InstructVerifyActivity.P;
                j.f(instructVerifyActivity, "this$0");
                instructVerifyActivity.finish();
                return;
            case 5:
                OrganizationProfileActivity organizationProfileActivity = (OrganizationProfileActivity) this.f23780b;
                int i14 = OrganizationProfileActivity.f19804d0;
                j.f(organizationProfileActivity, "this$0");
                organizationProfileActivity.f19806b0 = str;
                User user = (User) organizationProfileActivity.V().L.f8545b;
                if (!(user == null || (contactPersonIdentityCard = user.getContactPersonIdentityCard()) == null || (files = contactPersonIdentityCard.getFiles()) == null)) {
                    a aVar2 = (a) fk.l.K0(files);
                }
                ((m0) organizationProfileActivity.M()).f21190h0.setImageResource(0);
                j.c(view);
                view.setVisibility(8);
                return;
            case 6:
                PolicyAndTermActivity policyAndTermActivity = (PolicyAndTermActivity) this.f23780b;
                int i15 = PolicyAndTermActivity.P;
                j.f(policyAndTermActivity, "this$0");
                policyAndTermActivity.finish();
                return;
            case 7:
                VerifyActivity verifyActivity = (VerifyActivity) this.f23780b;
                int i16 = VerifyActivity.f19818a0;
                j.f(verifyActivity, "this$0");
                verifyActivity.finish();
                return;
            case 8:
                ListAwaitAuctionActivity listAwaitAuctionActivity = (ListAwaitAuctionActivity) this.f23780b;
                int i17 = ListAwaitAuctionActivity.Z;
                j.f(listAwaitAuctionActivity, "this$0");
                listAwaitAuctionActivity.finish();
                return;
            case 9:
                ScopeActivity scopeActivity = (ScopeActivity) this.f23780b;
                int i18 = ScopeActivity.R;
                j.f(scopeActivity, "this$0");
                scopeActivity.finish();
                return;
            case 10:
                FilterActivity filterActivity = (FilterActivity) this.f23780b;
                int i19 = FilterActivity.Y;
                j.f(filterActivity, "this$0");
                Intent intent = new Intent();
                intent.putExtra("selected_vehicles", new h().i((gf.b) p.N0(filterActivity.V().B())));
                intent.putExtra("selected_provinces", new h().i((gf.b) p.N0(filterActivity.U().u())));
                filterActivity.setResult(-1, intent);
                filterActivity.finish();
                return;
            case 11:
                SearchingActivity searchingActivity = (SearchingActivity) this.f23780b;
                int i20 = SearchingActivity.Q;
                j.f(searchingActivity, "this$0");
                searchingActivity.P.a(new Intent(searchingActivity, FilterActivity.class));
                return;
            case 12:
                QuestionActivity questionActivity = (QuestionActivity) this.f23780b;
                int i21 = QuestionActivity.T;
                j.f(questionActivity, "this$0");
                questionActivity.finish();
                return;
            case 13:
                MainActivity mainActivity = (MainActivity) this.f23780b;
                int i22 = MainActivity.Z;
                j.f(mainActivity, "this$0");
                w G = mainActivity.G();
                G.getClass();
                G.w(new FragmentManager.m(-1, 0), false);
                return;
            case 14:
                WelcomeActivity welcomeActivity = (WelcomeActivity) this.f23780b;
                int i23 = WelcomeActivity.S;
                j.f(welcomeActivity, "this$0");
                Intent intent2 = new Intent(welcomeActivity, MainActivity.class);
                lg.b bVar3 = welcomeActivity.R;
                if (bVar3 != null) {
                    bVar3.f20850a.edit().putBoolean("PREF_KEY_FIRST", true).apply();
                    welcomeActivity.startActivity(intent2);
                    welcomeActivity.finish();
                    return;
                }
                j.l("sharedPrefsHelper");
                throw null;
            default:
                rk.a aVar3 = (rk.a) this.f23780b;
                int i24 = QROverlayView.f20700y;
                j.f(aVar3, "$action");
                aVar3.invoke();
                return;
        }
    }
}
