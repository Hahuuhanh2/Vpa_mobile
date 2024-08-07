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
public final class u1 implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepTwoActivity f23733a;

    /* compiled from: EditTextExtensions.kt */
    public static final class a extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Editable f23734a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ StepTwoActivity f23735b;

        /* renamed from: zg.u1$a$a  reason: collision with other inner class name */
        /* compiled from: EditTextExtensions.kt */
        public static final class C0327a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Editable f23736a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ StepTwoActivity f23737b;

            public C0327a(Editable editable, StepTwoActivity stepTwoActivity) {
                this.f23736a = editable;
                this.f23737b = stepTwoActivity;
            }

            public final void run() {
                Editable editable = this.f23736a;
                if (editable != null) {
                    String obj = editable.toString();
                }
                ((c4) this.f23737b.M()).f21010y.f21156w.setEnabled(StepTwoActivity.T(this.f23737b));
            }
        }

        public a(Editable editable, StepTwoActivity stepTwoActivity) {
            this.f23734a = editable;
            this.f23735b = stepTwoActivity;
        }

        public final void run() {
            new Handler(Looper.getMainLooper()).post(new C0327a(this.f23734a, this.f23735b));
        }
    }

    public u1(StepTwoActivity stepTwoActivity) {
        this.f23733a = stepTwoActivity;
    }

    public final void afterTextChanged(Editable editable) {
        Timer n10 = l.n(df.a.f8965a);
        df.a.f8965a = n10;
        n10.schedule(new a(editable, this.f23733a), 500);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
