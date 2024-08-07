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
public final class a2 implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepTwoActivity f23617a;

    /* compiled from: EditTextExtensions.kt */
    public static final class a extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Editable f23618a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ StepTwoActivity f23619b;

        /* renamed from: zg.a2$a$a  reason: collision with other inner class name */
        /* compiled from: EditTextExtensions.kt */
        public static final class C0319a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Editable f23620a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ StepTwoActivity f23621b;

            public C0319a(Editable editable, StepTwoActivity stepTwoActivity) {
                this.f23620a = editable;
                this.f23621b = stepTwoActivity;
            }

            public final void run() {
                String str;
                boolean z10;
                Editable editable = this.f23620a;
                String str2 = "";
                if (editable == null || (str = editable.toString()) == null) {
                    str = str2;
                }
                ((c4) this.f23621b.M()).f21011z.f21275w.setEnabled(this.f23621b.U());
                Editable text = ((c4) this.f23621b.M()).f21011z.f21278z.getText();
                if (text != null) {
                    int i10 = 0;
                    if (text.length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        AppTextView appTextView = ((c4) this.f23621b.M()).f21011z.L;
                        j.e(appTextView, "tvErrorOldPassword");
                        String obj = text.toString();
                        if (obj != null) {
                            str2 = obj;
                        }
                        if (j.a(str, str2)) {
                            i10 = 4;
                        }
                        appTextView.setVisibility(i10);
                    }
                }
            }
        }

        public a(Editable editable, StepTwoActivity stepTwoActivity) {
            this.f23618a = editable;
            this.f23619b = stepTwoActivity;
        }

        public final void run() {
            new Handler(Looper.getMainLooper()).post(new C0319a(this.f23618a, this.f23619b));
        }
    }

    public a2(StepTwoActivity stepTwoActivity) {
        this.f23617a = stepTwoActivity;
    }

    public final void afterTextChanged(Editable editable) {
        Timer n10 = l.n(df.a.f8965a);
        df.a.f8965a = n10;
        n10.schedule(new a(editable, this.f23617a), 500);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
