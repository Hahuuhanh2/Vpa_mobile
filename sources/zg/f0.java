package zg;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.vpa.daugia.module.auth.ui.activity.StepOneActivity;
import java.util.TimerTask;

/* compiled from: SearchViewExtensions.kt */
public final class f0 extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepOneActivity f23656a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f23657b;

    /* compiled from: SearchViewExtensions.kt */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StepOneActivity f23658a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Intent f23659b;

        public a(StepOneActivity stepOneActivity, Intent intent) {
            this.f23658a = stepOneActivity;
            this.f23659b = intent;
        }

        public final void run() {
            u2.a.a(this.f23658a).c(this.f23659b);
            this.f23658a.finish();
        }
    }

    public f0(StepOneActivity stepOneActivity, Intent intent) {
        this.f23656a = stepOneActivity;
        this.f23657b = intent;
    }

    public final void run() {
        new Handler(Looper.getMainLooper()).post(new a(this.f23656a, this.f23657b));
    }
}
