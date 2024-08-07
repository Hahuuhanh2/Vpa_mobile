package zg;

import android.os.Build;
import android.os.CountDownTimer;
import android.text.Html;
import android.text.Spanned;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.module.auth.ui.activity.StepTwoActivity;
import mg.c4;
import sk.j;

/* compiled from: StepTwoActivity.kt */
public final class k2 extends CountDownTimer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepTwoActivity f23686a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k2(StepTwoActivity stepTwoActivity) {
        super(120000, 1000);
        this.f23686a = stepTwoActivity;
    }

    public final void onFinish() {
        Spanned spanned;
        Spanned spanned2;
        ((c4) this.f23686a.M()).f21011z.M.setEnabled(true);
        ((c4) this.f23686a.M()).f21010y.O.setEnabled(true);
        AppTextView appTextView = ((c4) this.f23686a.M()).f21011z.M;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            spanned = Html.fromHtml("<strong><u><font color = '#94A3B8'>Gửi mã\n<br>(120s)</font></u></strong>", 0);
            j.c(spanned);
        } else {
            spanned = Html.fromHtml("<strong><u><font color = '#94A3B8'>Gửi mã\n<br>(120s)</font></u></strong>");
            j.c(spanned);
        }
        appTextView.setText(spanned);
        AppTextView appTextView2 = ((c4) this.f23686a.M()).f21010y.O;
        if (i10 >= 24) {
            spanned2 = Html.fromHtml("<strong><u><font color = '#94A3B8'>Gửi mã\n<br>(120s)</font></u></strong>", 0);
            j.c(spanned2);
        } else {
            spanned2 = Html.fromHtml("<strong><u><font color = '#94A3B8'>Gửi mã\n<br>(120s)</font></u></strong>");
            j.c(spanned2);
        }
        appTextView2.setText(spanned2);
        ((c4) this.f23686a.M()).f21011z.F.setEnabled(true);
        ((c4) this.f23686a.M()).f21010y.C.setEnabled(true);
    }

    public final void onTick(long j10) {
        Spanned spanned;
        Spanned spanned2;
        long j11 = j10 / ((long) 1000);
        AppTextView appTextView = ((c4) this.f23686a.M()).f21011z.M;
        String str = "<strong><font color = '#94A3B8'>Gửi lại\n<br>(" + j11 + "s)</font></strong>";
        j.f(str, "string");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            spanned = Html.fromHtml(str, 0);
            j.c(spanned);
        } else {
            spanned = Html.fromHtml(str);
            j.c(spanned);
        }
        appTextView.setText(spanned);
        AppTextView appTextView2 = ((c4) this.f23686a.M()).f21010y.O;
        String str2 = "<strong><font color = '#94A3B8'>Gửi lại\n<br>(" + j11 + "s)</font></strong>";
        j.f(str2, "string");
        if (i10 >= 24) {
            spanned2 = Html.fromHtml(str2, 0);
            j.c(spanned2);
        } else {
            spanned2 = Html.fromHtml(str2);
            j.c(spanned2);
        }
        appTextView2.setText(spanned2);
    }
}
