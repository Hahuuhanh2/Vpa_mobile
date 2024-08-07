package hi;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.vpa.daugia.module.qr.ScanQrActivity;
import java.util.TimerTask;

/* compiled from: SearchViewExtensions.kt */
public final class d extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ScanQrActivity f20526a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f20527b;

    /* compiled from: SearchViewExtensions.kt */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ScanQrActivity f20528a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Intent f20529b;

        public a(ScanQrActivity scanQrActivity, Intent intent) {
            this.f20528a = scanQrActivity;
            this.f20529b = intent;
        }

        public final void run() {
            u2.a.a(this.f20528a).c(this.f20529b);
            this.f20528a.finish();
        }
    }

    public d(ScanQrActivity scanQrActivity, Intent intent) {
        this.f20526a = scanQrActivity;
        this.f20527b = intent;
    }

    public final void run() {
        new Handler(Looper.getMainLooper()).post(new a(this.f20526a, this.f20527b));
    }
}
