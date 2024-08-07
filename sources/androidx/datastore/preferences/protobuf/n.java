package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.l;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.n.a;
import androidx.datastore.preferences.protobuf.z;
import androidx.fragment.app.o;
import j$.util.concurrent.ConcurrentHashMap;
import j2.a0;
import j2.s;
import j2.u;
import j2.y;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: GeneratedMessageLite */
public abstract class n<MessageType extends n<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a<MessageType, BuilderType> {
    private static Map<Object, n<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    public int memoizedSerializedSize = -1;
    public k0 unknownFields = k0.f2293f;

    /* compiled from: GeneratedMessageLite */
    public static abstract class a<MessageType extends n<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.C0019a<MessageType, BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        public final MessageType f2306a;

        /* renamed from: b  reason: collision with root package name */
        public MessageType f2307b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2308c = false;

        public a(MessageType messagetype) {
            this.f2306a = messagetype;
            this.f2307b = (n) messagetype.k(f.NEW_MUTABLE_INSTANCE);
        }

        public static void n(n nVar, n nVar2) {
            s sVar = s.f11516c;
            sVar.getClass();
            sVar.a(nVar.getClass()).a(nVar, nVar2);
        }

        public final Object clone() {
            a aVar = (a) this.f2306a.k(f.NEW_BUILDER);
            n l10 = l();
            aVar.m();
            n(aVar.f2307b, l10);
            return aVar;
        }

        public final n g() {
            return this.f2306a;
        }

        public final MessageType k() {
            MessageType l10 = l();
            if (l10.f()) {
                return l10;
            }
            throw new UninitializedMessageException();
        }

        public final MessageType l() {
            if (this.f2308c) {
                return this.f2307b;
            }
            MessageType messagetype = this.f2307b;
            messagetype.getClass();
            s sVar = s.f11516c;
            sVar.getClass();
            sVar.a(messagetype.getClass()).c(messagetype);
            this.f2308c = true;
            return this.f2307b;
        }

        public final void m() {
            if (this.f2308c) {
                MessageType messagetype = (n) this.f2307b.k(f.NEW_MUTABLE_INSTANCE);
                n(messagetype, this.f2307b);
                this.f2307b = messagetype;
                this.f2308c = false;
            }
        }
    }

    /* compiled from: GeneratedMessageLite */
    public static class b<T extends n<T, ?>> extends b<T> {
        public b(T t10) {
        }
    }

    /* compiled from: GeneratedMessageLite */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends n<MessageType, BuilderType> implements j2.n {
        public l<d> extensions = l.f2299d;

        public final a a() {
            a aVar = (a) k(f.NEW_BUILDER);
            aVar.m();
            a.n(aVar.f2307b, this);
            return aVar;
        }

        public final a e() {
            return (a) k(f.NEW_BUILDER);
        }

        public final n g() {
            return (n) k(f.GET_DEFAULT_INSTANCE);
        }
    }

    /* compiled from: GeneratedMessageLite */
    public static final class d implements l.a<d> {
        public final void a() {
        }

        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }

        public final void d() {
        }

        public final void e() {
        }

        public final a0 f() {
            throw null;
        }

        public final void g() {
        }

        public final a r(z.a aVar, z zVar) {
            a aVar2 = (a) aVar;
            aVar2.m();
            a.n(aVar2.f2307b, (n) zVar);
            return aVar2;
        }
    }

    /* compiled from: GeneratedMessageLite */
    public static class e<ContainingType extends z, Type> extends o {
    }

    /* compiled from: GeneratedMessageLite */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE
    }

    public static <T extends n<?, ?>> T l(Class<T> cls) {
        T t10 = (n) defaultInstanceMap.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (n) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 == null) {
            t10 = (n) ((n) y.a(cls)).k(f.GET_DEFAULT_INSTANCE);
            if (t10 != null) {
                defaultInstanceMap.put(cls, t10);
            } else {
                throw new IllegalStateException();
            }
        }
        return t10;
    }

    static Object m(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static <T extends n<T, ?>> T n(T t10, e eVar, i iVar) {
        T t11 = (n) t10.k(f.NEW_MUTABLE_INSTANCE);
        try {
            s sVar = s.f11516c;
            sVar.getClass();
            u<?> a10 = sVar.a(t11.getClass());
            f fVar = eVar.f2241d;
            if (fVar == null) {
                fVar = new f(eVar);
            }
            a10.h(t11, fVar, iVar);
            a10.c(t11);
            return t11;
        } catch (IOException e10) {
            if (e10.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e10.getCause());
            }
            throw new InvalidProtocolBufferException(e10.getMessage());
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e11.getCause());
            }
            throw e11;
        }
    }

    public static <T extends n<?, ?>> void o(Class<T> cls, T t10) {
        defaultInstanceMap.put(cls, t10);
    }

    public a a() {
        a aVar = (a) k(f.NEW_BUILDER);
        aVar.m();
        a.n(aVar.f2307b, this);
        return aVar;
    }

    public final int c() {
        if (this.memoizedSerializedSize == -1) {
            s sVar = s.f11516c;
            sVar.getClass();
            this.memoizedSerializedSize = sVar.a(getClass()).f(this);
        }
        return this.memoizedSerializedSize;
    }

    /* access modifiers changed from: package-private */
    public final int d() {
        return this.memoizedSerializedSize;
    }

    public a e() {
        return (a) k(f.NEW_BUILDER);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((n) k(f.GET_DEFAULT_INSTANCE)).getClass().isInstance(obj)) {
            return false;
        }
        s sVar = s.f11516c;
        sVar.getClass();
        return sVar.a(getClass()).e(this, (n) obj);
    }

    public final boolean f() {
        byte byteValue = ((Byte) k(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        s sVar = s.f11516c;
        sVar.getClass();
        boolean d10 = sVar.a(getClass()).d(this);
        k(f.SET_MEMOIZED_IS_INITIALIZED);
        return d10;
    }

    public n g() {
        return (n) k(f.GET_DEFAULT_INSTANCE);
    }

    public final int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        s sVar = s.f11516c;
        sVar.getClass();
        int g2 = sVar.a(getClass()).g(this);
        this.memoizedHashCode = g2;
        return g2;
    }

    /* access modifiers changed from: package-private */
    public final void i(int i10) {
        this.memoizedSerializedSize = i10;
    }

    public final void j(CodedOutputStream codedOutputStream) {
        s sVar = s.f11516c;
        sVar.getClass();
        u<?> a10 = sVar.a(getClass());
        g gVar = codedOutputStream.f2203b;
        if (gVar == null) {
            gVar = new g(codedOutputStream);
        }
        a10.i(this, gVar);
    }

    public abstract Object k(f fVar);

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        a0.c(this, sb2, 0);
        return sb2.toString();
    }
}
