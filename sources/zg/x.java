package zg;

import android.os.Build;
import android.os.CountDownTimer;
import android.text.Html;
import android.text.Spanned;
import android.widget.LinearLayout;
import com.ots.base.utils.customview.otp.helpers.OTPChildEditText;
import com.ots.base.utils.customview.otp.helpers.OtpTextView;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.module.auth.ui.activity.OtpActivity;
import java.util.Arrays;
import mg.o0;
import sk.j;

/* compiled from: OtpActivity.kt */
public final class x extends CountDownTimer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OtpActivity f23756a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(OtpActivity otpActivity) {
        super(120000, 1000);
        this.f23756a = otpActivity;
    }

    public final void onFinish() {
        Spanned spanned;
        AppTextView appTextView = ((o0) this.f23756a.M()).E;
        if (Build.VERSION.SDK_INT >= 24) {
            spanned = Html.fromHtml("<strong><u><font color = '#94A3B8'>Gửi lại mã</font></u></strong>", 0);
            j.c(spanned);
        } else {
            spanned = Html.fromHtml("<strong><u><font color = '#94A3B8'>Gửi lại mã</font></u></strong>");
            j.c(spanned);
        }
        appTextView.setText(spanned);
        OtpTextView otpTextView = ((o0) this.f23756a.M()).B;
        j.e(otpTextView, "otvOTP");
        otpTextView.setVisibility(0);
        ((o0) this.f23756a.M()).B.setOTP("");
        LinearLayout linearLayout = ((o0) this.f23756a.M()).f21263x;
        j.e(linearLayout, "emptyOTP");
        linearLayout.setVisibility(8);
        OTPChildEditText otpEditText = ((o0) this.f23756a.M()).B.getOtpEditText();
        if (otpEditText != null) {
            otpEditText.requestFocus();
        }
        this.f23756a.U = true;
    }

    public final void onTick(long j10) {
        Spanned spanned;
        long j11 = j10 / ((long) 1000);
        long j12 = (long) 60;
        j.e(String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j11 / j12), Long.valueOf(j11 % j12)}, 2)), "format(format, *args)");
        AppTextView appTextView = ((o0) this.f23756a.M()).E;
        String str = "<strong><u><font color = '#94A3B8'>Gửi lại (" + j11 + "S)</font></u></strong>";
        j.f(str, "string");
        if (Build.VERSION.SDK_INT >= 24) {
            spanned = Html.fromHtml(str, 0);
            j.c(spanned);
        } else {
            spanned = Html.fromHtml(str);
            j.c(spanned);
        }
        appTextView.setText(spanned);
    }
}
