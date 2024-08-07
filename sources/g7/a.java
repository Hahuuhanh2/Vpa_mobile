package g7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import j$.util.concurrent.ConcurrentHashMap;
import j7.c;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import y6.j;
import y6.y0;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f10394b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static volatile a f10395c;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f10396a = new ConcurrentHashMap();

    public static a a() {
        if (f10395c == null) {
            synchronized (f10394b) {
                if (f10395c == null) {
                    f10395c = new a();
                }
            }
        }
        a aVar = f10395c;
        j.f(aVar);
        return aVar;
    }

    public final void b(Context context, ServiceConnection serviceConnection) {
        if (!(!(serviceConnection instanceof y0)) || !this.f10396a.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService((ServiceConnection) this.f10396a.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                this.f10396a.remove(serviceConnection);
            }
        }
    }

    public final boolean c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        boolean z10;
        ComponentName component = intent.getComponent();
        boolean z11 = false;
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((c.a(context).f11719a.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        boolean z12 = true;
        if (!(serviceConnection instanceof y0)) {
            ServiceConnection serviceConnection2 = (ServiceConnection) this.f10396a.putIfAbsent(serviceConnection, serviceConnection);
            if (!(serviceConnection2 == null || serviceConnection == serviceConnection2)) {
                String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()});
            }
            if (executor == null) {
                executor = null;
            }
            try {
                if (Build.VERSION.SDK_INT < 29) {
                    z12 = false;
                }
                if (!z12 || executor == null) {
                    z10 = context.bindService(intent, serviceConnection, i10);
                } else {
                    z10 = context.bindService(intent, i10, executor, serviceConnection);
                }
                if (z10) {
                    return z10;
                }
                this.f10396a.remove(serviceConnection, serviceConnection);
                return false;
            } catch (Throwable th2) {
                this.f10396a.remove(serviceConnection, serviceConnection);
                throw th2;
            }
        } else {
            if (executor == null) {
                executor = null;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                z11 = true;
            }
            if (!z11 || executor == null) {
                return context.bindService(intent, serviceConnection, i10);
            }
            return context.bindService(intent, i10, executor, serviceConnection);
        }
    }
}
