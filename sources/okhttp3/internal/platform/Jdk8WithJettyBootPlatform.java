package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import okhttp3.internal.platform.Platform;
import sk.j;

/* compiled from: Jdk8WithJettyBootPlatform.kt */
public final class Jdk8WithJettyBootPlatform extends Platform {

    /* renamed from: i  reason: collision with root package name */
    public static final Companion f22548i = new Companion(0);

    /* renamed from: d  reason: collision with root package name */
    public final Method f22549d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f22550e;

    /* renamed from: f  reason: collision with root package name */
    public final Method f22551f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f22552g;

    /* renamed from: h  reason: collision with root package name */
    public final Class<?> f22553h;

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    public static final class AlpnProvider implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f22554a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f22555b;

        /* renamed from: c  reason: collision with root package name */
        public String f22556c;

        public AlpnProvider(ArrayList arrayList) {
            this.f22554a = arrayList;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            boolean z10;
            j.f(obj, "proxy");
            j.f(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (j.a(name, "supports") && j.a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (!j.a(name, "unsupported") || !j.a(Void.TYPE, returnType)) {
                if (j.a(name, "protocols")) {
                    if (objArr.length == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        return this.f22554a;
                    }
                }
                if ((j.a(name, "selectProtocol") || j.a(name, "select")) && j.a(String.class, returnType) && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        j.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                        List list = (List) obj2;
                        int size = list.size();
                        if (size >= 0) {
                            int i10 = 0;
                            while (true) {
                                Object obj3 = list.get(i10);
                                j.d(obj3, "null cannot be cast to non-null type kotlin.String");
                                String str = (String) obj3;
                                if (!this.f22554a.contains(str)) {
                                    if (i10 == size) {
                                        break;
                                    }
                                    i10++;
                                } else {
                                    this.f22556c = str;
                                    return str;
                                }
                            }
                        }
                        String str2 = this.f22554a.get(0);
                        this.f22556c = str2;
                        return str2;
                    }
                }
                if ((!j.a(name, "protocolSelected") && !j.a(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                }
                Object obj4 = objArr[0];
                j.d(obj4, "null cannot be cast to non-null type kotlin.String");
                this.f22556c = (String) obj4;
                return null;
            }
            this.f22555b = true;
            return null;
        }
    }

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    public Jdk8WithJettyBootPlatform(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f22549d = method;
        this.f22550e = method2;
        this.f22551f = method3;
        this.f22552g = cls;
        this.f22553h = cls2;
    }

    public final void a(SSLSocket sSLSocket) {
        try {
            this.f22551f.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        j.f(list, "protocols");
        Platform.f22562a.getClass();
        ArrayList a10 = Platform.Companion.a(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.f22552g, this.f22553h}, new AlpnProvider(a10));
            this.f22549d.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (IllegalAccessException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f22550e.invoke((Object) null, new Object[]{sSLSocket}));
            j.d(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            AlpnProvider alpnProvider = (AlpnProvider) invocationHandler;
            boolean z10 = alpnProvider.f22555b;
            if (!z10 && alpnProvider.f22556c == null) {
                Platform.j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6);
                return null;
            } else if (z10) {
                return null;
            } else {
                return alpnProvider.f22556c;
            }
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (IllegalAccessException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
