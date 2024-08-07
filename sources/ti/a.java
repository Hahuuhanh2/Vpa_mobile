package ti;

import com.vpa.daugia.module.support.ui.activity.Hilt_QuestionActivity;
import com.vpa.daugia.module.support.ui.activity.QuestionActivity;
import e.b;

/* compiled from: Hilt_QuestionActivity */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Hilt_QuestionActivity f23017a;

    public a(Hilt_QuestionActivity hilt_QuestionActivity) {
        this.f23017a = hilt_QuestionActivity;
    }

    public final void a() {
        Hilt_QuestionActivity hilt_QuestionActivity = this.f23017a;
        if (!hilt_QuestionActivity.Q) {
            hilt_QuestionActivity.Q = true;
            QuestionActivity questionActivity = (QuestionActivity) hilt_QuestionActivity;
            ((d) hilt_QuestionActivity.d()).v();
        }
    }
}
