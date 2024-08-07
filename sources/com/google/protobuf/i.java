package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.h;
import com.google.protobuf.i;
import com.google.protobuf.i.a;
import com.google.protobuf.k;
import com.google.protobuf.u;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import tc.b0;
import tc.d0;
import tc.p;
import tc.v;
import tc.x;

/* compiled from: GeneratedMessageLite */
public abstract class i<MessageType extends i<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    public static final int UNINITIALIZED_HASH_CODE = 0;
    public static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, i<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    public d0 unknownFields = d0.f7893f;

    /* compiled from: GeneratedMessageLite */
    public static abstract class a<MessageType extends i<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.C0074a<MessageType, BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        public final MessageType f7905a;

        /* renamed from: b  reason: collision with root package name */
        public MessageType f7906b;

        public a(MessageType messagetype) {
            this.f7905a = messagetype;
            if (!messagetype.B()) {
                this.f7906b = (i) messagetype.x();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        public static void u(i iVar, Object obj) {
            v vVar = v.f15013c;
            vVar.getClass();
            vVar.a(iVar.getClass()).a(iVar, obj);
        }

        public final Object clone() {
            a aVar = (a) this.f7905a.w(e.NEW_BUILDER);
            aVar.f7906b = r();
            return aVar;
        }

        public final boolean f() {
            return i.A(this.f7906b, false);
        }

        public final i g() {
            return this.f7905a;
        }

        public final MessageType q() {
            MessageType r10 = r();
            r10.getClass();
            if (i.A(r10, true)) {
                return r10;
            }
            throw new UninitializedMessageException();
        }

        public final MessageType r() {
            if (!this.f7906b.B()) {
                return this.f7906b;
            }
            MessageType messagetype = this.f7906b;
            messagetype.getClass();
            v vVar = v.f15013c;
            vVar.getClass();
            vVar.a(messagetype.getClass()).c(messagetype);
            messagetype.C();
            return this.f7906b;
        }

        public final void s() {
            if (!this.f7906b.B()) {
                MessageType messagetype = (i) this.f7905a.x();
                u(messagetype, this.f7906b);
                this.f7906b = messagetype;
            }
        }

        public final void t(i iVar) {
            if (!this.f7905a.equals(iVar)) {
                s();
                u(this.f7906b, iVar);
            }
        }
    }

    /* compiled from: GeneratedMessageLite */
    public static class b<T extends i<T, ?>> extends b<T> {
        public b(T t10) {
        }
    }

    /* compiled from: GeneratedMessageLite */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends i<MessageType, BuilderType> implements p {
        public h<d> extensions = h.f7901d;

        public final a a() {
            a aVar = (a) w(e.NEW_BUILDER);
            aVar.t(this);
            return aVar;
        }

        public final a e() {
            return (a) w(e.NEW_BUILDER);
        }

        public final i g() {
            return (i) w(e.GET_DEFAULT_INSTANCE);
        }
    }

    /* compiled from: GeneratedMessageLite */
    public static final class d implements h.a<d> {
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

        public final d0 f() {
            throw null;
        }

        public final void g() {
        }

        public final a h(u.a aVar, u uVar) {
            a aVar2 = (a) aVar;
            aVar2.t((i) uVar);
            return aVar2;
        }
    }

    /* compiled from: GeneratedMessageLite */
    public enum e {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE
    }

    public static final <T extends i<T, ?>> boolean A(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.w(e.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        v vVar = v.f15013c;
        vVar.getClass();
        boolean d10 = vVar.a(t10.getClass()).d(t10);
        if (z10) {
            t10.w(e.SET_MEMOIZED_IS_INITIALIZED);
        }
        return d10;
    }

    public static <E> k.c<E> D(k.c<E> cVar) {
        int i10;
        int size = cVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size * 2;
        }
        return cVar.b(i10);
    }

    public static <T extends i<?, ?>> void E(Class<T> cls, T t10) {
        t10.C();
        defaultInstanceMap.put(cls, t10);
    }

    public static <T extends i<?, ?>> T y(Class<T> cls) {
        T t10 = (i) defaultInstanceMap.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (i) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 == null) {
            t10 = (i) ((i) b0.b(cls)).w(e.GET_DEFAULT_INSTANCE);
            if (t10 != null) {
                defaultInstanceMap.put(cls, t10);
            } else {
                throw new IllegalStateException();
            }
        }
        return t10;
    }

    static Object z(Method method, Object obj, Object... objArr) {
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

    /* access modifiers changed from: package-private */
    public final boolean B() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void C() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public a a() {
        a aVar = (a) w(e.NEW_BUILDER);
        aVar.t(this);
        return aVar;
    }

    public final int c() {
        return i((x) null);
    }

    public a e() {
        return (a) w(e.NEW_BUILDER);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        v vVar = v.f15013c;
        vVar.getClass();
        return vVar.a(getClass()).e(this, (i) obj);
    }

    public final boolean f() {
        return A(this, true);
    }

    public i g() {
        return (i) w(e.GET_DEFAULT_INSTANCE);
    }

    /* access modifiers changed from: package-private */
    public final int h() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public final int hashCode() {
        boolean z10;
        if (B()) {
            v vVar = v.f15013c;
            vVar.getClass();
            return vVar.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            v vVar2 = v.f15013c;
            vVar2.getClass();
            this.memoizedHashCode = vVar2.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    public final int i(x xVar) {
        int i10;
        int i11;
        if (B()) {
            if (xVar == null) {
                v vVar = v.f15013c;
                vVar.getClass();
                i11 = vVar.a(getClass()).f(this);
            } else {
                i11 = xVar.f(this);
            }
            if (i11 >= 0) {
                return i11;
            }
            throw new IllegalStateException(android.support.v4.media.a.m("serialized size must be non-negative, was ", i11));
        } else if (h() != Integer.MAX_VALUE) {
            return h();
        } else {
            if (xVar == null) {
                v vVar2 = v.f15013c;
                vVar2.getClass();
                i10 = vVar2.a(getClass()).f(this);
            } else {
                i10 = xVar.f(this);
            }
            r(i10);
            return i10;
        }
    }

    public final void k(CodedOutputStream codedOutputStream) {
        v vVar = v.f15013c;
        vVar.getClass();
        x<?> a10 = vVar.a(getClass());
        e eVar = codedOutputStream.f7865b;
        if (eVar == null) {
            eVar = new e(codedOutputStream);
        }
        a10.h(this, eVar);
    }

    /* access modifiers changed from: package-private */
    public final void r(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException(android.support.v4.media.a.m("serialized size must be non-negative, was ", i10));
    }

    /* access modifiers changed from: package-private */
    public final void t() {
        this.memoizedHashCode = 0;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = v.f7938a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        v.c(this, sb2, 0);
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public final void u() {
        r(Integer.MAX_VALUE);
    }

    public final <MessageType extends i<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType v() {
        return (a) w(e.NEW_BUILDER);
    }

    public abstract Object w(e eVar);

    public final Object x() {
        return w(e.NEW_MUTABLE_INSTANCE);
    }
}
