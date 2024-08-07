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
public final class f2 implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepTwoActivity f23661a;

    /* compiled from: EditTextExtensions.kt */
    public static final class a extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Editable f23662a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ StepTwoActivity f23663b;

        /* renamed from: zg.f2$a$a  reason: collision with other inner class name */
        /* compiled from: EditTextExtensions.kt */
        public static final class C0324a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Editable f23664a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ StepTwoActivity f23665b;

            public C0324a(Editable editable, StepTwoActivity stepTwoActivity) {
                this.f23664a = editable;
                this.f23665b = stepTwoActivity;
            }

            public final void run() {
                Editable editable = this.f23664a;
                if (editable != null) {
                    String obj = editable.toString();
                }
                ((c4) this.f23665b.M()).f21011z.f21275w.setEnabled(this.f23665b.U());
            }
        }

        public a(Editable editable, StepTwoActivity stepTwoActivity) {
            this.f23662a = editable;
            this.f23663b = stepTwoActivity;
        }

        public final void run() {
            new Handler(Looper.getMainLooper()).post(new C0324a(this.f23662a, this.f23663b));
        }
    }

    public f2(StepTwoActivity stepTwoActivity) {
        this.f23661a = stepTwoActivity;
    }

    public final void afterTextChanged(Editable editable) {
        Timer n10 = l.n(df.a.f8965a);
        df.a.f8965a = n10;
        n10.schedule(new a(editable, this.f23661a), 500);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
