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
public final class y1 implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepTwoActivity f23766a;

    /* compiled from: EditTextExtensions.kt */
    public static final class a extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Editable f23767a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ StepTwoActivity f23768b;

        /* renamed from: zg.y1$a$a  reason: collision with other inner class name */
        /* compiled from: EditTextExtensions.kt */
        public static final class C0331a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Editable f23769a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ StepTwoActivity f23770b;

            public C0331a(Editable editable, StepTwoActivity stepTwoActivity) {
                this.f23769a = editable;
                this.f23770b = stepTwoActivity;
            }

            public final void run() {
                Editable editable = this.f23769a;
                if (editable != null) {
                    String obj = editable.toString();
                }
                ((c4) this.f23770b.M()).f21011z.f21275w.setEnabled(this.f23770b.U());
            }
        }

        public a(Editable editable, StepTwoActivity stepTwoActivity) {
            this.f23767a = editable;
            this.f23768b = stepTwoActivity;
        }

        public final void run() {
            new Handler(Looper.getMainLooper()).post(new C0331a(this.f23767a, this.f23768b));
        }
    }

    public y1(StepTwoActivity stepTwoActivity) {
        this.f23766a = stepTwoActivity;
    }

    public final void afterTextChanged(Editable editable) {
        Timer n10 = l.n(df.a.f8965a);
        df.a.f8965a = n10;
        n10.schedule(new a(editable, this.f23766a), 500);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
