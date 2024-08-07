package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k3.a;
import v0.b;

public abstract class VersionedParcel {

    /* renamed from: a  reason: collision with root package name */
    public final b<String, Method> f3517a;

    /* renamed from: b  reason: collision with root package name */
    public final b<String, Method> f3518b;

    /* renamed from: c  reason: collision with root package name */
    public final b<String, Class> f3519c;

    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(b<String, Method> bVar, b<String, Method> bVar2, b<String, Class> bVar3) {
        this.f3517a = bVar;
        this.f3518b = bVar2;
        this.f3519c = bVar3;
    }

    public abstract a a();

    public final Class b(Class<? extends k3.b> cls) {
        Class orDefault = this.f3519c.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f3519c.put(cls.getName(), cls2);
        return cls2;
    }

    public final Method c(String str) {
        Class<VersionedParcel> cls = VersionedParcel.class;
        Method orDefault = this.f3517a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f3517a.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        Method orDefault = this.f3518b.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class b10 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b10.getDeclaredMethod("write", new Class[]{cls, VersionedParcel.class});
        this.f3518b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e();

    public abstract byte[] f();

    public abstract CharSequence g();

    public abstract boolean h(int i10);

    public abstract int i();

    public final int j(int i10, int i11) {
        if (!h(i11)) {
            return i10;
        }
        return i();
    }

    public abstract <T extends Parcelable> T k();

    public abstract String l();

    public final <T extends k3.b> T m() {
        String l10 = l();
        if (l10 == null) {
            return null;
        }
        a a10 = a();
        try {
            return (k3.b) c(l10).invoke((Object) null, new Object[]{a10});
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e11.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e13);
        }
    }

    public abstract void n(int i10);

    public abstract void o(boolean z10);

    public abstract void p(byte[] bArr);

    public abstract void q(CharSequence charSequence);

    public abstract void r(int i10);

    public final void s(int i10, int i11) {
        n(i11);
        r(i10);
    }

    public abstract void t(Parcelable parcelable);

    public abstract void u(String str);

    public final void v(k3.b bVar) {
        if (bVar == null) {
            u((String) null);
            return;
        }
        try {
            u(b(bVar.getClass()).getName());
            a a10 = a();
            try {
                d(bVar.getClass()).invoke((Object) null, new Object[]{bVar, a10});
                a10.w();
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
            } catch (InvocationTargetException e11) {
                if (e11.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e11.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
            } catch (ClassNotFoundException e13) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e13);
            }
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException(bVar.getClass().getSimpleName() + " does not have a Parcelizer", e14);
        }
    }
}
