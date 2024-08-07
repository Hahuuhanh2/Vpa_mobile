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
public final class d2 implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepTwoActivity f23644a;

    /* compiled from: EditTextExtensions.kt */
    public static final class a extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Editable f23645a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ StepTwoActivity f23646b;

        /* renamed from: zg.d2$a$a  reason: collision with other inner class name */
        /* compiled from: EditTextExtensions.kt */
        public static final class C0322a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Editable f23647a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ StepTwoActivity f23648b;

            public C0322a(Editable editable, StepTwoActivity stepTwoActivity) {
                this.f23647a = editable;
                this.f23648b = stepTwoActivity;
            }

            public final void run() {
                String str;
                boolean z10;
                Editable editable = this.f23647a;
                String str2 = "";
                if (editable == null || (str = editable.toString()) == null) {
                    str = str2;
                }
                ((c4) this.f23648b.M()).f21010y.f21156w.setEnabled(this.f23648b.U());
                int i10 = 0;
                if (str.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    AppTextView appTextView = ((c4) this.f23648b.M()).f21010y.M;
                    j.e(appTextView, "tvErrorOldPassword");
                    Editable text = ((c4) this.f23648b.M()).f21010y.B.getText();
                    if (text != null) {
                        str2 = android.support.v4.media.a.j(text);
                    }
                    if (j.a(str, str2)) {
                        i10 = 4;
                    }
                    appTextView.setVisibility(i10);
                    return;
                }
                AppTextView appTextView2 = ((c4) this.f23648b.M()).f21010y.M;
                j.e(appTextView2, "tvErrorOldPassword");
                appTextView2.setVisibility(4);
            }
        }

        public a(Editable editable, StepTwoActivity stepTwoActivity) {
            this.f23645a = editable;
            this.f23646b = stepTwoActivity;
        }

        public final void run() {
            new Handler(Looper.getMainLooper()).post(new C0322a(this.f23645a, this.f23646b));
        }
    }

    public d2(StepTwoActivity stepTwoActivity) {
        this.f23644a = stepTwoActivity;
    }

    public final void afterTextChanged(Editable editable) {
        Timer n10 = l.n(df.a.f8965a);
        df.a.f8965a = n10;
        n10.schedule(new a(editable, this.f23644a), 500);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
