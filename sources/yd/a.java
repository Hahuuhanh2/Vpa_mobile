package yd;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;

/* compiled from: AutoFocusManager */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final ArrayList f17661g;

    /* renamed from: a  reason: collision with root package name */
    public boolean f17662a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17663b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f17664c;

    /* renamed from: d  reason: collision with root package name */
    public final Camera f17665d;

    /* renamed from: e  reason: collision with root package name */
    public Handler f17666e;

    /* renamed from: f  reason: collision with root package name */
    public final b f17667f;

    /* renamed from: yd.a$a  reason: collision with other inner class name */
    /* compiled from: AutoFocusManager */
    public class C0237a implements Handler.Callback {
        public C0237a() {
        }

        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            a.this.getClass();
            if (i10 != 1) {
                return false;
            }
            a aVar = a.this;
            if (aVar.f17664c && !aVar.f17662a && !aVar.f17663b) {
                try {
                    aVar.f17665d.autoFocus(aVar.f17667f);
                    aVar.f17663b = true;
                } catch (RuntimeException unused) {
                    aVar.a();
                }
            }
            return true;
        }
    }

    /* compiled from: AutoFocusManager */
    public class b implements Camera.AutoFocusCallback {

        /* renamed from: yd.a$b$a  reason: collision with other inner class name */
        /* compiled from: AutoFocusManager */
        public class C0238a implements Runnable {
            public C0238a() {
            }

            public final void run() {
                a aVar = a.this;
                aVar.f17663b = false;
                aVar.a();
            }
        }

        public b() {
        }

        public final void onAutoFocus(boolean z10, Camera camera) {
            a.this.f17666e.post(new C0238a());
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f17661g = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public a(Camera camera, f fVar) {
        C0237a aVar = new C0237a();
        b bVar = new b();
        this.f17667f = bVar;
        this.f17666e = new Handler(aVar);
        this.f17665d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        fVar.getClass();
        boolean contains = f17661g.contains(focusMode);
        this.f17664c = contains;
        if (contains && !this.f17663b) {
            try {
                camera.autoFocus(bVar);
                this.f17663b = true;
            } catch (RuntimeException unused) {
                a();
            }
        }
    }

    public final synchronized void a() {
        if (!this.f17662a && !this.f17666e.hasMessages(1)) {
            Handler handler = this.f17666e;
            handler.sendMessageDelayed(handler.obtainMessage(1), 2000);
        }
    }
}
