package yd;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: CameraThread */
public final class g {

    /* renamed from: e  reason: collision with root package name */
    public static g f17712e;

    /* renamed from: a  reason: collision with root package name */
    public Handler f17713a;

    /* renamed from: b  reason: collision with root package name */
    public HandlerThread f17714b;

    /* renamed from: c  reason: collision with root package name */
    public int f17715c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final Object f17716d = new Object();

    public final void a() {
        synchronized (this.f17716d) {
            if (this.f17713a == null) {
                if (this.f17715c > 0) {
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.f17714b = handlerThread;
                    handlerThread.start();
                    this.f17713a = new Handler(this.f17714b.getLooper());
                } else {
                    throw new IllegalStateException("CameraThread is not open");
                }
            }
        }
    }

    public final void b(Runnable runnable) {
        synchronized (this.f17716d) {
            a();
            this.f17713a.post(runnable);
        }
    }
}
