package vb;

import android.view.View;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.vpa.daugia.module.auth.ui.activity.AuthActivity;
import com.vpa.daugia.module.auth.ui.activity.StepOneActivity;
import com.vpa.daugia.module.support.ui.activity.QuestionActivity;
import n1.e;
import sk.j;
import w1.q;
import w1.w0;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements SuccessContinuation, q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16141a;

    public /* synthetic */ d(int i10) {
        this.f16141a = i10;
    }

    public final w0 g(View view, w0 w0Var) {
        switch (this.f16141a) {
            case 1:
                int i10 = AuthActivity.R;
                j.f(view, "v");
                e a10 = w0Var.a(7);
                j.e(a10, "getInsets(...)");
                view.setPadding(a10.f13427a, a10.f13428b, a10.f13429c, a10.f13430d);
                return w0Var;
            case 2:
                int i11 = StepOneActivity.T;
                j.f(view, "v");
                e a11 = w0Var.a(7);
                j.e(a11, "getInsets(...)");
                view.setPadding(a11.f13427a, a11.f13428b, a11.f13429c, a11.f13430d);
                return w0Var;
            default:
                int i12 = QuestionActivity.T;
                j.f(view, "v");
                e a12 = w0Var.a(7);
                j.e(a12, "getInsets(...)");
                view.setPadding(a12.f13427a, a12.f13428b, a12.f13429c, a12.f13430d);
                return w0Var;
        }
    }

    public final Task then(Object obj) {
        wb.d dVar = (wb.d) obj;
        return Tasks.forResult(null);
    }
}
