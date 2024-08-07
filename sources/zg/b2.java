package zg;

import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.module.auth.ui.activity.StepTwoActivity;
import java.util.Timer;
import java.util.TimerTask;
import mg.c4;
import n0.l;
import sk.j;

/* compiled from: EditTextExtensions.kt */
public final class b2 implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepTwoActivity f23628a;

    /* compiled from: EditTextExtensions.kt */
    public static final class a extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Editable f23629a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ StepTwoActivity f23630b;

        /* renamed from: zg.b2$a$a  reason: collision with other inner class name */
        /* compiled from: EditTextExtensions.kt */
        public static final class C0320a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Editable f23631a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ StepTwoActivity f23632b;

            public C0320a(Editable editable, StepTwoActivity stepTwoActivity) {
                this.f23631a = editable;
                this.f23632b = stepTwoActivity;
            }

            public final void run() {
                String str;
                boolean z10;
                Editable editable = this.f23631a;
                String str2 = "";
                if (editable == null || (str = editable.toString()) == null) {
                    str = str2;
                }
                ((c4) this.f23632b.M()).f21011z.f21275w.setEnabled(this.f23632b.U());
                int i10 = 0;
                if (str.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    AppTextView appTextView = ((c4) this.f23632b.M()).f21011z.L;
                    j.e(appTextView, "tvErrorOldPassword");
                    Editable text = ((c4) this.f23632b.M()).f21011z.E.getText();
                    if (text != null) {
                        str2 = android.support.v4.media.a.j(text);
                    }
                    if (j.a(str, str2)) {
                        i10 = 4;
                    }
                    appTextView.setVisibility(i10);
                    return;
                }
                AppTextView appTextView2 = ((c4) this.f23632b.M()).f21011z.L;
                j.e(appTextView2, "tvErrorOldPassword");
                appTextView2.setVisibility(4);
            }
        }

        public a(Editable editable, StepTwoActivity stepTwoActivity) {
            this.f23629a = editable;
            this.f23630b = stepTwoActivity;
        }

        public final void run() {
            new Handler(Looper.getMainLooper()).post(new C0320a(this.f23629a, this.f23630b));
        }
    }

    public b2(StepTwoActivity stepTwoActivity) {
        this.f23628a = stepTwoActivity;
    }

    public final void afterTextChanged(Editable editable) {
        Timer n10 = l.n(df.a.f8965a);
        df.a.f8965a = n10;
        n10.schedule(new a(editable, this.f23628a), 500);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
