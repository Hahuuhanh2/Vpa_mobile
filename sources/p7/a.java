package p7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import u6.b;
import u6.d;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f14081a = b.f15290b;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f14082b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static Method f14083c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f14084d;

    /* renamed from: p7.a$a  reason: collision with other inner class name */
    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    public interface C0179a {
        void c(int i10);

        void s();
    }

    public static void a(Context context) {
        Context context2;
        Context context3;
        if (context != null) {
            f14081a.getClass();
            AtomicBoolean atomicBoolean = d.f15292a;
            b bVar = b.f15290b;
            int c10 = bVar.c(context, 11925000);
            if (c10 == 0) {
                synchronized (f14082b) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        context2 = DynamiteModule.c(context, DynamiteModule.f5527e, "com.google.android.gms.providerinstaller.dynamite").f5538a;
                    } catch (DynamiteModule.LoadingException e10) {
                        "Failed to load providerinstaller module: ".concat(String.valueOf(e10.getMessage()));
                        context2 = null;
                    }
                    if (context2 != null) {
                        c(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                        return;
                    }
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    try {
                        context3 = context.createPackageContext("com.google.android.gms", 3);
                    } catch (PackageManager.NameNotFoundException unused) {
                        context3 = null;
                    }
                    if (context3 != null) {
                        try {
                            if (f14084d == null) {
                                Class cls = Long.TYPE;
                                f14084d = context3.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("reportRequestStats", new Class[]{Context.class, cls, cls});
                            }
                            f14084d.invoke((Object) null, new Object[]{context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2)});
                        } catch (Exception e11) {
                            "Failed to report request stats: ".concat(String.valueOf(e11.getMessage()));
                        }
                    }
                    if (context3 != null) {
                        c(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
                        return;
                    }
                    throw new GooglePlayServicesNotAvailableException(8);
                }
            } else if (bVar.a(c10, context, "e") == null) {
                throw new GooglePlayServicesNotAvailableException(c10);
            } else {
                throw new GooglePlayServicesRepairableException(c10);
            }
        } else {
            throw new NullPointerException("Context must not be null");
        }
    }

    public static void b(Context context, C0179a aVar) {
        boolean z10;
        if (context == null) {
            throw new NullPointerException("Context must not be null");
        } else if (aVar != null) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                new b(context, aVar).execute(new Void[0]);
                return;
            }
            throw new IllegalStateException("Must be called on the UI thread");
        } else {
            throw new NullPointerException("Listener must not be null");
        }
    }

    public static void c(Context context, String str) {
        String str2;
        try {
            if (f14083c == null) {
                f14083c = context.getClassLoader().loadClass(str).getMethod("insertProvider", new Class[]{Context.class});
            }
            f14083c.invoke((Object) null, new Object[]{context});
        } catch (Exception e10) {
            Throwable cause = e10.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                if (cause == null) {
                    str2 = e10.getMessage();
                } else {
                    str2 = cause.getMessage();
                }
                "Failed to install provider: ".concat(String.valueOf(str2));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
