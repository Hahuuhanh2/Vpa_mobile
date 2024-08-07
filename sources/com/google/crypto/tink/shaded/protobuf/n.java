package com.google.crypto.tink.shaded.protobuf;

import androidx.fragment.app.o;
import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.f;
import com.google.crypto.tink.shaded.protobuf.l;
import com.google.crypto.tink.shaded.protobuf.n;
import com.google.crypto.tink.shaded.protobuf.n.a;
import com.google.crypto.tink.shaded.protobuf.x;
import j$.util.concurrent.ConcurrentHashMap;
import j9.c0;
import j9.e0;
import j9.q;
import j9.w;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: GeneratedMessageLite */
public abstract class n<MessageType extends n<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    public static final int UNINITIALIZED_HASH_CODE = 0;
    public static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, n<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    public h0 unknownFields = h0.f7386f;

    /* compiled from: GeneratedMessageLite */
    public static abstract class a<MessageType extends n<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.C0068a<MessageType, BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        public final MessageType f7404a;

        /* renamed from: b  reason: collision with root package name */
        public MessageType f7405b;

        public a(MessageType messagetype) {
            this.f7404a = messagetype;
            if (!messagetype.w()) {
                this.f7405b = (n) messagetype.r();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        public static void q(n nVar, Object obj) {
            w wVar = w.f11791c;
            wVar.getClass();
            wVar.a(nVar.getClass()).a(nVar, obj);
        }

        public final boolean f() {
            return n.v(this.f7405b, false);
        }

        public n g() {
            return this.f7404a;
        }

        /* renamed from: l */
        public final MessageType build() {
            MessageType m10 = n0();
            m10.getClass();
            if (n.v(m10, true)) {
                return m10;
            }
            throw new UninitializedMessageException();
        }

        /* renamed from: m */
        public final MessageType n0() {
            if (!this.f7405b.w()) {
                return this.f7405b;
            }
            MessageType messagetype = this.f7405b;
            messagetype.getClass();
            w wVar = w.f11791c;
            wVar.getClass();
            wVar.a(messagetype.getClass()).c(messagetype);
            messagetype.x();
            return this.f7405b;
        }

        /* renamed from: n */
        public final BuilderType clone() {
            BuilderType y10 = this.f7404a.e();
            y10.f7405b = n0();
            return y10;
        }

        public final void o() {
            if (!this.f7405b.w()) {
                MessageType messagetype = (n) this.f7404a.r();
                q(messagetype, this.f7405b);
                this.f7405b = messagetype;
            }
        }

        public final void p(n nVar) {
            if (!this.f7404a.equals(nVar)) {
                o();
                q(this.f7405b, nVar);
            }
        }
    }

    /* compiled from: GeneratedMessageLite */
    public static class b<T extends n<T, ?>> extends b<T> {
        public b(T t10) {
        }
    }

    /* compiled from: GeneratedMessageLite */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends n<MessageType, BuilderType> implements q {
        public l<d> extensions = l.f7398d;

        public final /* bridge */ /* synthetic */ a a() {
            return a();
        }

        public final /* bridge */ /* synthetic */ a e() {
            return e();
        }

        public final /* bridge */ /* synthetic */ n g() {
            return g();
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

        public final e0 f() {
            throw null;
        }

        public final void g() {
        }

        public final a l(x.a aVar, x xVar) {
            a aVar2 = (a) aVar;
            aVar2.p((n) xVar);
            return aVar2;
        }
    }

    /* compiled from: GeneratedMessageLite */
    public static class e<ContainingType extends x, Type> extends o {
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

    public static <T extends n<T, ?>> T A(T t10, f fVar, i iVar) {
        T t11 = (n) t10.r();
        try {
            w wVar = w.f11791c;
            wVar.getClass();
            c0<?> a10 = wVar.a(t11.getClass());
            g gVar = fVar.f7347d;
            if (gVar == null) {
                gVar = new g(fVar);
            }
            a10.h(t11, gVar, iVar);
            a10.c(t11);
            return t11;
        } catch (InvalidProtocolBufferException e10) {
            e = e10;
            if (e.f7325a) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e;
        } catch (UninitializedMessageException e11) {
            throw new InvalidProtocolBufferException(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw new InvalidProtocolBufferException(e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e13.getCause());
            }
            throw e13;
        }
    }

    public static <T extends n<?, ?>> void B(Class<T> cls, T t10) {
        t10.x();
        defaultInstanceMap.put(cls, t10);
    }

    public static void m(n nVar) {
        if (!v(nVar, true)) {
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        }
    }

    public static <T extends n<?, ?>> T s(Class<T> cls) {
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
            t10 = ((n) c0.b(cls)).g();
            if (t10 != null) {
                defaultInstanceMap.put(cls, t10);
            } else {
                throw new IllegalStateException();
            }
        }
        return t10;
    }

    static Object u(Method method, Object obj, Object... objArr) {
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

    public static final <T extends n<T, ?>> boolean v(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.q(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        w wVar = w.f11791c;
        wVar.getClass();
        boolean d10 = wVar.a(t10.getClass()).d(t10);
        if (z10) {
            t10.q(f.SET_MEMOIZED_IS_INITIALIZED);
        }
        return d10;
    }

    public static <T extends n<T, ?>> T z(T t10, j9.c cVar, i iVar) {
        f.a p10 = cVar.p();
        T A = A(t10, p10, iVar);
        try {
            p10.a(0);
            m(A);
            return A;
        } catch (InvalidProtocolBufferException e10) {
            throw e10;
        }
    }

    /* renamed from: C */
    public final BuilderType a() {
        BuilderType buildertype = (a) q(f.NEW_BUILDER);
        buildertype.p(this);
        return buildertype;
    }

    public final int c() {
        return h((c0) null);
    }

    /* access modifiers changed from: package-private */
    public final int d() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w wVar = w.f11791c;
        wVar.getClass();
        return wVar.a(getClass()).e(this, (n) obj);
    }

    public final boolean f() {
        return v(this, true);
    }

    public final int h(c0 c0Var) {
        int i10;
        int i11;
        if (w()) {
            if (c0Var == null) {
                w wVar = w.f11791c;
                wVar.getClass();
                i11 = wVar.a(getClass()).f(this);
            } else {
                i11 = c0Var.f(this);
            }
            if (i11 >= 0) {
                return i11;
            }
            throw new IllegalStateException(android.support.v4.media.a.m("serialized size must be non-negative, was ", i11));
        } else if (d() != Integer.MAX_VALUE) {
            return d();
        } else {
            if (c0Var == null) {
                w wVar2 = w.f11791c;
                wVar2.getClass();
                i10 = wVar2.a(getClass()).f(this);
            } else {
                i10 = c0Var.f(this);
            }
            l(i10);
            return i10;
        }
    }

    public final int hashCode() {
        boolean z10;
        if (w()) {
            w wVar = w.f11791c;
            wVar.getClass();
            return wVar.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            w wVar2 = w.f11791c;
            wVar2.getClass();
            this.memoizedHashCode = wVar2.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    public final void j(CodedOutputStream codedOutputStream) {
        w wVar = w.f11791c;
        wVar.getClass();
        c0<?> a10 = wVar.a(getClass());
        j9.d dVar = codedOutputStream.f7320b;
        if (dVar == null) {
            dVar = new j9.d(codedOutputStream);
        }
        a10.i(this, dVar);
    }

    /* access modifiers changed from: package-private */
    public final void l(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException(android.support.v4.media.a.m("serialized size must be non-negative, was ", i10));
    }

    /* access modifiers changed from: package-private */
    public final void n() {
        this.memoizedHashCode = 0;
    }

    /* access modifiers changed from: package-private */
    public final void o() {
        l(Integer.MAX_VALUE);
    }

    public final <MessageType extends n<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType p() {
        return (a) q(f.NEW_BUILDER);
    }

    public abstract Object q(f fVar);

    public final Object r() {
        return q(f.NEW_MUTABLE_INSTANCE);
    }

    /* renamed from: t */
    public final MessageType g() {
        return (n) q(f.GET_DEFAULT_INSTANCE);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = y.f7429a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        y.c(this, sb2, 0);
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public final boolean w() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void x() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* renamed from: y */
    public final BuilderType e() {
        return (a) q(f.NEW_BUILDER);
    }
}
