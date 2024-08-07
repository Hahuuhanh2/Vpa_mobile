package ul;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: Platform */
public class v {

    /* renamed from: c  reason: collision with root package name */
    public static final v f23191c;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f23192a;

    /* renamed from: b  reason: collision with root package name */
    public final Constructor<MethodHandles.Lookup> f23193b;

    /* compiled from: Platform */
    public static final class a extends v {

        /* renamed from: ul.v$a$a  reason: collision with other inner class name */
        /* compiled from: Platform */
        public static final class C0311a implements Executor {

            /* renamed from: a  reason: collision with root package name */
            public final Handler f23194a = new Handler(Looper.getMainLooper());

            public final void execute(Runnable runnable) {
                this.f23194a.post(runnable);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a() {
            /*
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 24
                if (r0 < r1) goto L_0x0008
                r0 = 1
                goto L_0x0009
            L_0x0008:
                r0 = 0
            L_0x0009:
                r2.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ul.v.a.<init>():void");
        }

        public final Executor a() {
            return new C0311a();
        }

        public final Object b(Method method, Class<?> cls, Object obj, Object... objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return v.super.b(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    static {
        v vVar;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            vVar = new a();
        } else {
            vVar = new v(true);
        }
        f23191c = vVar;
    }

    public v(boolean z10) {
        this.f23192a = z10;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z10) {
            Class<MethodHandles.Lookup> cls = MethodHandles.Lookup.class;
            try {
                constructor = cls.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f23193b = constructor;
    }

    public Executor a() {
        return null;
    }

    @IgnoreJRERequirement
    public Object b(Method method, Class<?> cls, Object obj, Object... objArr) {
        MethodHandles.Lookup lookup;
        Constructor<MethodHandles.Lookup> constructor = this.f23193b;
        if (constructor != null) {
            lookup = constructor.newInstance(new Object[]{cls, -1});
        } else {
            lookup = MethodHandles.lookup();
        }
        return lookup.unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
