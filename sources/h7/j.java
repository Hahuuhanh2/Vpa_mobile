package h7;

import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f10620a;

    /* renamed from: b  reason: collision with root package name */
    public static final Method f10621b;

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f10622c = null;

    static {
        Method method;
        Method method2;
        boolean z10;
        boolean z11;
        boolean z12;
        Class<String> cls = String.class;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            method = null;
        }
        f10620a = method;
        try {
            method2 = WorkSource.class.getMethod("add", new Class[]{Integer.TYPE, cls});
        } catch (Exception unused2) {
            method2 = null;
        }
        f10621b = method2;
        try {
            WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused3) {
        }
        try {
            WorkSource.class.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
        } catch (Exception unused5) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            try {
                WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception unused6) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, cls});
            } catch (Exception unused7) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            try {
                WorkSource.class.getMethod("isEmpty", new Class[0]).setAccessible(true);
            } catch (Exception unused8) {
            }
        }
    }
}
