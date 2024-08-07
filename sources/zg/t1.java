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
public final class t1 implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepTwoActivity f23726a;

    /* compiled from: EditTextExtensions.kt */
    public static final class a extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Editable f23727a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ StepTwoActivity f23728b;

        /* renamed from: zg.t1$a$a  reason: collision with other inner class name */
        /* compiled from: EditTextExtensions.kt */
        public static final class C0326a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Editable f23729a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ StepTwoActivity f23730b;

            public C0326a(Editable editable, StepTwoActivity stepTwoActivity) {
                this.f23729a = editable;
                this.f23730b = stepTwoActivity;
            }

            public final void run() {
                Editable editable = this.f23729a;
                if (editable != null) {
                    String obj = editable.toString();
                }
                ((c4) this.f23730b.M()).f21010y.f21156w.setEnabled(StepTwoActivity.T(this.f23730b));
            }
        }

        public a(Editable editable, StepTwoActivity stepTwoActivity) {
            this.f23727a = editable;
            this.f23728b = stepTwoActivity;
        }

        public final void run() {
            new Handler(Looper.getMainLooper()).post(new C0326a(this.f23727a, this.f23728b));
        }
    }

    public t1(StepTwoActivity stepTwoActivity) {
        this.f23726a = stepTwoActivity;
    }

    public final void afterTextChanged(Editable editable) {
        Timer n10 = l.n(df.a.f8965a);
        df.a.f8965a = n10;
        n10.schedule(new a(editable, this.f23726a), 500);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
