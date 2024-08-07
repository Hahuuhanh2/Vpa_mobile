package zc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.journeyapps.barcodescanner.b;

/* compiled from: InactivityTimer */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17969a;

    /* renamed from: b  reason: collision with root package name */
    public final a f17970b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17971c = false;

    /* renamed from: d  reason: collision with root package name */
    public Handler f17972d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f17973e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17974f;

    /* compiled from: InactivityTimer */
    public final class a extends BroadcastReceiver {

        /* renamed from: zc.h$a$a  reason: collision with other inner class name */
        /* compiled from: InactivityTimer */
        public class C0253a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f17976a;

            public C0253a(boolean z10) {
                this.f17976a = z10;
            }

            public final void run() {
                h hVar = h.this;
                hVar.f17974f = this.f17976a;
                if (hVar.f17971c) {
                    hVar.f17972d.removeCallbacksAndMessages((Object) null);
                    if (hVar.f17974f) {
                        hVar.f17972d.postDelayed(hVar.f17973e, 300000);
                    }
                }
            }
        }

        public a() {
        }

        public final void onReceive(Context context, Intent intent) {
            boolean z10;
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                if (intent.getIntExtra("plugged", -1) <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h.this.f17972d.post(new C0253a(z10));
            }
        }
    }

    public h(Context context, b.c cVar) {
        this.f17969a = context;
        this.f17973e = cVar;
        this.f17970b = new a();
        this.f17972d = new Handler();
    }

    public final void a() {
        this.f17972d.removeCallbacksAndMessages((Object) null);
        if (this.f17971c) {
            this.f17969a.unregisterReceiver(this.f17970b);
            this.f17971c = false;
        }
    }
}
