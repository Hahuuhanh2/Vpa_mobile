package okhttp3.internal.platform.android;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;
import sk.j;
import yk.a;

/* compiled from: AndroidSocketAdapter.kt */
public class AndroidSocketAdapter implements SocketAdapter {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f22573f = new Companion(0);

    /* renamed from: g  reason: collision with root package name */
    public static final AndroidSocketAdapter$Companion$factory$1 f22574g = new AndroidSocketAdapter$Companion$factory$1();

    /* renamed from: a  reason: collision with root package name */
    public final Class<? super SSLSocket> f22575a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f22576b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f22577c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f22578d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f22579e;

    /* compiled from: AndroidSocketAdapter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    public AndroidSocketAdapter(Class<? super SSLSocket> cls) {
        this.f22575a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        j.e(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f22576b = declaredMethod;
        this.f22577c = cls.getMethod("setHostname", new Class[]{String.class});
        this.f22578d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f22579e = cls.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    public final boolean a(SSLSocket sSLSocket) {
        return this.f22575a.isInstance(sSLSocket);
    }

    public final boolean b() {
        AndroidPlatform.f22535f.getClass();
        return AndroidPlatform.f22536g;
    }

    public final String c(SSLSocket sSLSocket) {
        if (!this.f22575a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f22578d.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, a.f23582b);
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && j.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        j.f(list, "protocols");
        if (this.f22575a.isInstance(sSLSocket)) {
            try {
                this.f22576b.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                if (str != null) {
                    this.f22577c.invoke(sSLSocket, new Object[]{str});
                }
                Method method = this.f22579e;
                Platform.f22562a.getClass();
                method.invoke(sSLSocket, new Object[]{Platform.Companion.b(list)});
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
