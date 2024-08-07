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
public final class s1 implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepTwoActivity f23719a;

    /* compiled from: EditTextExtensions.kt */
    public static final class a extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Editable f23720a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ StepTwoActivity f23721b;

        /* renamed from: zg.s1$a$a  reason: collision with other inner class name */
        /* compiled from: EditTextExtensions.kt */
        public static final class C0325a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Editable f23722a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ StepTwoActivity f23723b;

            public C0325a(Editable editable, StepTwoActivity stepTwoActivity) {
                this.f23722a = editable;
                this.f23723b = stepTwoActivity;
            }

            public final void run() {
                Editable editable = this.f23722a;
                if (editable != null) {
                    String obj = editable.toString();
                }
                ((c4) this.f23723b.M()).f21011z.f21275w.setEnabled(this.f23723b.U());
            }
        }

        public a(Editable editable, StepTwoActivity stepTwoActivity) {
            this.f23720a = editable;
            this.f23721b = stepTwoActivity;
        }

        public final void run() {
            new Handler(Looper.getMainLooper()).post(new C0325a(this.f23720a, this.f23721b));
        }
    }

    public s1(StepTwoActivity stepTwoActivity) {
        this.f23719a = stepTwoActivity;
    }

    public final void afterTextChanged(Editable editable) {
        Timer n10 = l.n(df.a.f8965a);
        df.a.f8965a = n10;
        n10.schedule(new a(editable, this.f23719a), 500);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
