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
public final class c2 implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepTwoActivity f23637a;

    /* compiled from: EditTextExtensions.kt */
    public static final class a extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Editable f23638a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ StepTwoActivity f23639b;

        /* renamed from: zg.c2$a$a  reason: collision with other inner class name */
        /* compiled from: EditTextExtensions.kt */
        public static final class C0321a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Editable f23640a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ StepTwoActivity f23641b;

            public C0321a(Editable editable, StepTwoActivity stepTwoActivity) {
                this.f23640a = editable;
                this.f23641b = stepTwoActivity;
            }

            public final void run() {
                String str;
                boolean z10;
                Editable editable = this.f23640a;
                String str2 = "";
                if (editable == null || (str = editable.toString()) == null) {
                    str = str2;
                }
                StepTwoActivity.Z(((c4) this.f23641b.M()).f21010y.N, str);
                ((c4) this.f23641b.M()).f21010y.f21156w.setEnabled(StepTwoActivity.T(this.f23641b));
                Editable text = ((c4) this.f23641b.M()).f21010y.f21158y.getText();
                if (text != null) {
                    int i10 = 0;
                    if (text.length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        AppTextView appTextView = ((c4) this.f23641b.M()).f21010y.M;
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
            this.f23638a = editable;
            this.f23639b = stepTwoActivity;
        }

        public final void run() {
            new Handler(Looper.getMainLooper()).post(new C0321a(this.f23638a, this.f23639b));
        }
    }

    public c2(StepTwoActivity stepTwoActivity) {
        this.f23637a = stepTwoActivity;
    }

    public final void afterTextChanged(Editable editable) {
        Timer n10 = l.n(df.a.f8965a);
        df.a.f8965a = n10;
        n10.schedule(new a(editable, this.f23637a), 500);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
