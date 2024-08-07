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
public final class w1 implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepTwoActivity f23751a;

    /* compiled from: EditTextExtensions.kt */
    public static final class a extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Editable f23752a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ StepTwoActivity f23753b;

        /* renamed from: zg.w1$a$a  reason: collision with other inner class name */
        /* compiled from: EditTextExtensions.kt */
        public static final class C0329a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Editable f23754a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ StepTwoActivity f23755b;

            public C0329a(Editable editable, StepTwoActivity stepTwoActivity) {
                this.f23754a = editable;
                this.f23755b = stepTwoActivity;
            }

            public final void run() {
                Editable editable = this.f23754a;
                if (editable != null) {
                    String obj = editable.toString();
                }
                ((c4) this.f23755b.M()).f21010y.f21156w.setEnabled(StepTwoActivity.T(this.f23755b));
            }
        }

        public a(Editable editable, StepTwoActivity stepTwoActivity) {
            this.f23752a = editable;
            this.f23753b = stepTwoActivity;
        }

        public final void run() {
            new Handler(Looper.getMainLooper()).post(new C0329a(this.f23752a, this.f23753b));
        }
    }

    public w1(StepTwoActivity stepTwoActivity) {
        this.f23751a = stepTwoActivity;
    }

    public final void afterTextChanged(Editable editable) {
        Timer n10 = l.n(df.a.f8965a);
        df.a.f8965a = n10;
        n10.schedule(new a(editable, this.f23751a), 500);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
