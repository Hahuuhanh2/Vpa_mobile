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
public final class v1 implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepTwoActivity f23745a;

    /* compiled from: EditTextExtensions.kt */
    public static final class a extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Editable f23746a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ StepTwoActivity f23747b;

        /* renamed from: zg.v1$a$a  reason: collision with other inner class name */
        /* compiled from: EditTextExtensions.kt */
        public static final class C0328a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Editable f23748a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ StepTwoActivity f23749b;

            public C0328a(Editable editable, StepTwoActivity stepTwoActivity) {
                this.f23748a = editable;
                this.f23749b = stepTwoActivity;
            }

            public final void run() {
                Editable editable = this.f23748a;
                if (editable != null) {
                    String obj = editable.toString();
                }
                ((c4) this.f23749b.M()).f21010y.f21156w.setEnabled(StepTwoActivity.T(this.f23749b));
            }
        }

        public a(Editable editable, StepTwoActivity stepTwoActivity) {
            this.f23746a = editable;
            this.f23747b = stepTwoActivity;
        }

        public final void run() {
            new Handler(Looper.getMainLooper()).post(new C0328a(this.f23746a, this.f23747b));
        }
    }

    public v1(StepTwoActivity stepTwoActivity) {
        this.f23745a = stepTwoActivity;
    }

    public final void afterTextChanged(Editable editable) {
        Timer n10 = l.n(df.a.f8965a);
        df.a.f8965a = n10;
        n10.schedule(new a(editable, this.f23745a), 500);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
