package zg;

import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import com.vpa.daugia.module.auth.ui.activity.StepTwoActivity;
import java.util.Timer;
import java.util.TimerTask;
import mg.c4;
import n0.l;

/* compiled from: EditTextExtensions.kt */
public final class x1 implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepTwoActivity f23759a;

    /* compiled from: EditTextExtensions.kt */
    public static final class a extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Editable f23760a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ StepTwoActivity f23761b;

        /* renamed from: zg.x1$a$a  reason: collision with other inner class name */
        /* compiled from: EditTextExtensions.kt */
        public static final class C0330a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Editable f23762a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ StepTwoActivity f23763b;

            public C0330a(Editable editable, StepTwoActivity stepTwoActivity) {
                this.f23762a = editable;
                this.f23763b = stepTwoActivity;
            }

            public final void run() {
                Editable editable = this.f23762a;
                if (editable != null) {
                    String obj = editable.toString();
                }
                ((c4) this.f23763b.M()).f21010y.f21156w.setEnabled(StepTwoActivity.T(this.f23763b));
            }
        }

        public a(Editable editable, StepTwoActivity stepTwoActivity) {
            this.f23760a = editable;
            this.f23761b = stepTwoActivity;
        }

        public final void run() {
            new Handler(Looper.getMainLooper()).post(new C0330a(this.f23760a, this.f23761b));
        }
    }

    public x1(StepTwoActivity stepTwoActivity) {
        this.f23759a = stepTwoActivity;
    }

    public final void afterTextChanged(Editable editable) {
        Timer n10 = l.n(df.a.f8965a);
        df.a.f8965a = n10;
        n10.schedule(new a(editable, this.f23759a), 500);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
