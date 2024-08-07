package hi;

import android.os.Handler;
import android.os.Looper;
import com.vpa.daugia.module.qr.ScanQrActivity;
import java.util.TimerTask;

/* compiled from: SearchViewExtensions.kt */
public final class b extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ScanQrActivity f20523a;

    /* compiled from: SearchViewExtensions.kt */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ScanQrActivity f20524a;

        public a(ScanQrActivity scanQrActivity) {
            this.f20524a = scanQrActivity;
        }

        public final void run() {
            this.f20524a.finish();
        }
    }

    public b(ScanQrActivity scanQrActivity) {
        this.f20523a = scanQrActivity;
    }

    public final void run() {
        new Handler(Looper.getMainLooper()).post(new a(this.f20523a));
    }
}
