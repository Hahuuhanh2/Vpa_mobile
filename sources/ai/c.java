package ai;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vpa.daugia.module.plate_selection.ui.activity.PlateSelectionActivity;
import com.vpa.daugia.module.profile.ui.activity.InstructVerifyActivity;
import com.vpa.daugia.module.profile.ui.activity.PolicyAndTermActivity;
import com.vpa.daugia.module.profile.ui.activity.VerifyActivity;
import com.vpa.daugia.module.qr.QROverlayView;
import com.vpa.daugia.module.searching.ui.activity.FilterActivity;
import com.vpa.daugia.module.searching.ui.activity.SearchingActivity;
import com.vpa.daugia.module.support.ui.activity.SupportActivity;
import ei.b;
import fk.p;
import java.util.List;
import ji.d;
import mg.e4;
import mg.z;
import rk.a;
import sk.j;
import yk.l;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18972a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f18973b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f18972a = i10;
        this.f18973b = obj;
    }

    public final void onClick(View view) {
        String str;
        switch (this.f18972a) {
            case 0:
                j jVar = (j) this.f18973b;
                int i10 = j.f18980n0;
                j.f(jVar, "this$0");
                FragmentActivity c02 = jVar.c0();
                CharSequence text = ((e4) jVar.i0()).E.getText();
                if (text == null) {
                    str = "";
                } else {
                    str = l.k1(text.toString()).toString();
                }
                f fVar = new f(jVar);
                Object systemService = c02.getSystemService("clipboard");
                j.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("\"text\"", str));
                fVar.invoke("Đã lưu vào bộ nhớ tạm");
                return;
            case 1:
                PlateSelectionActivity plateSelectionActivity = (PlateSelectionActivity) this.f18973b;
                int i11 = PlateSelectionActivity.P;
                j.f(plateSelectionActivity, "this$0");
                plateSelectionActivity.finish();
                return;
            case 2:
                b bVar = (b) this.f18973b;
                j.f(bVar, "this$0");
                bVar.a();
                return;
            case 3:
                PolicyAndTermActivity policyAndTermActivity = (PolicyAndTermActivity) this.f18973b;
                int i12 = PolicyAndTermActivity.P;
                j.f(policyAndTermActivity, "this$0");
                Intent intent = new Intent(policyAndTermActivity, InstructVerifyActivity.class);
                intent.putExtra("ON_VERIFY_PROFILE", policyAndTermActivity.O);
                policyAndTermActivity.startActivity(intent);
                policyAndTermActivity.finish();
                return;
            case 4:
                VerifyActivity verifyActivity = (VerifyActivity) this.f18973b;
                int i13 = VerifyActivity.f19818a0;
                j.f(verifyActivity, "this$0");
                verifyActivity.finish();
                return;
            case 5:
                a aVar = (a) this.f18973b;
                int i14 = QROverlayView.f19826y;
                j.f(aVar, "$action");
                aVar.invoke();
                return;
            case 6:
                ji.a aVar2 = (ji.a) this.f18973b;
                j.f(aVar2, "this$0");
                aVar2.a();
                return;
            case 7:
                ji.c cVar = (ji.c) this.f18973b;
                j.f(cVar, "this$0");
                if (cVar.f20783i.f21400y.isChecked()) {
                    d dVar = cVar.f20784j;
                    if (dVar != null) {
                        dVar.a();
                        cVar.a();
                        return;
                    }
                    j.l("onActionDone");
                    throw null;
                }
                return;
            case 8:
                FilterActivity filterActivity = (FilterActivity) this.f18973b;
                int i15 = FilterActivity.Y;
                j.f(filterActivity, "this$0");
                List<T> Z0 = p.Z0(filterActivity.V().f9444f);
                List<gf.b> Z02 = p.Z0(filterActivity.U().f22651e);
                for (T t10 : Z0) {
                    t10.f10499c = false;
                }
                for (gf.b bVar2 : Z02) {
                    bVar2.f10499c = false;
                }
                filterActivity.V().A(p.b1(Z0));
                filterActivity.U().v(p.b1(Z02));
                ((z) filterActivity.M()).f21507x.setEnabled(false);
                return;
            case 9:
                SearchingActivity searchingActivity = (SearchingActivity) this.f18973b;
                int i16 = SearchingActivity.Q;
                j.f(searchingActivity, "this$0");
                searchingActivity.finish();
                return;
            default:
                SupportActivity supportActivity = (SupportActivity) this.f18973b;
                int i17 = SupportActivity.U;
                j.f(supportActivity, "this$0");
                supportActivity.finish();
                return;
        }
    }
}
