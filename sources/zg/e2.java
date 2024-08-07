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
public final class e2 implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepTwoActivity f23651a;

    /* compiled from: EditTextExtensions.kt */
    public static final class a extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Editable f23652a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ StepTwoActivity f23653b;

        /* renamed from: zg.e2$a$a  reason: collision with other inner class name */
        /* compiled from: EditTextExtensions.kt */
        public static final class C0323a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Editable f23654a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ StepTwoActivity f23655b;

            public C0323a(Editable editable, StepTwoActivity stepTwoActivity) {
                this.f23654a = editable;
                this.f23655b = stepTwoActivity;
            }

            public final void run() {
                Editable editable = this.f23654a;
                if (editable != null) {
                    String obj = editable.toString();
                }
                ((c4) this.f23655b.M()).f21011z.f21275w.setEnabled(this.f23655b.U());
            }
        }

        public a(Editable editable, StepTwoActivity stepTwoActivity) {
            this.f23652a = editable;
            this.f23653b = stepTwoActivity;
        }

        public final void run() {
            new Handler(Looper.getMainLooper()).post(new C0323a(this.f23652a, this.f23653b));
        }
    }

    public e2(StepTwoActivity stepTwoActivity) {
        this.f23651a = stepTwoActivity;
    }

    public final void afterTextChanged(Editable editable) {
        Timer n10 = l.n(df.a.f8965a);
        df.a.f8965a = n10;
        n10.schedule(new a(editable, this.f23651a), 500);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
