package xe;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import we.b;

/* compiled from: ToastUtils */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static long f17329a;

    /* renamed from: b  reason: collision with root package name */
    public static String f17330b;

    /* compiled from: ToastUtils */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17331a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f17332b;

        public a(Context context, String str) {
            this.f17331a = context;
            this.f17332b = str;
        }

        public final void run() {
            ie.a.a().getClass();
            Toast.makeText(this.f17331a.getApplicationContext(), this.f17332b, 0).show();
            k.f17330b = this.f17332b;
        }
    }

    public static void a(Context context, String str) {
        boolean z10;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z11 = true;
        if (currentTimeMillis - f17329a < 1000) {
            z10 = true;
        } else {
            f17329a = currentTimeMillis;
            z10 = false;
        }
        if (!z10 || !TextUtils.equals(str, f17330b)) {
            ie.a.a().getClass();
            Context applicationContext = context.getApplicationContext();
            Handler handler = b.f16802a;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                z11 = false;
            }
            if (z11) {
                Toast.makeText(applicationContext, str, 0).show();
                f17330b = str;
                return;
            }
            b.d(new a(context, str));
        }
    }
}
