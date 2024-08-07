package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.ref.WeakReference;

/* compiled from: SnackbarManager */
public final class g {

    /* renamed from: e  reason: collision with root package name */
    public static g f6857e;

    /* renamed from: a  reason: collision with root package name */
    public final Object f6858a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f6859b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c  reason: collision with root package name */
    public c f6860c;

    /* renamed from: d  reason: collision with root package name */
    public c f6861d;

    /* compiled from: SnackbarManager */
    public class a implements Handler.Callback {
        public a() {
        }

        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            g gVar = g.this;
            c cVar = (c) message.obj;
            synchronized (gVar.f6858a) {
                if (gVar.f6860c == cVar || gVar.f6861d == cVar) {
                    gVar.a(cVar, 2);
                }
            }
            return true;
        }
    }

    /* compiled from: SnackbarManager */
    public interface b {
        void b();

        void c(int i10);
    }

    /* compiled from: SnackbarManager */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<b> f6863a;

        /* renamed from: b  reason: collision with root package name */
        public int f6864b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f6865c;

        public c(int i10, BaseTransientBottomBar.c cVar) {
            this.f6863a = new WeakReference<>(cVar);
            this.f6864b = i10;
        }
    }

    public static g b() {
        if (f6857e == null) {
            f6857e = new g();
        }
        return f6857e;
    }

    public final boolean a(c cVar, int i10) {
        b bVar = cVar.f6863a.get();
        if (bVar == null) {
            return false;
        }
        this.f6859b.removeCallbacksAndMessages(cVar);
        bVar.c(i10);
        return true;
    }

    public final boolean c(BaseTransientBottomBar.c cVar) {
        boolean z10;
        c cVar2 = this.f6860c;
        if (cVar2 != null) {
            if (cVar == null || cVar2.f6863a.get() != cVar) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final void d(c cVar) {
        int i10 = cVar.f6864b;
        if (i10 != -2) {
            if (i10 <= 0) {
                if (i10 == -1) {
                    i10 = 1500;
                } else {
                    i10 = 2750;
                }
            }
            this.f6859b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f6859b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i10);
        }
    }
}
