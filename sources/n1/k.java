package n1;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface$Builder;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import m1.c;
import t1.m;

/* compiled from: TypefaceCompatApi26Impl */
public class k extends i {

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f13445f;

    /* renamed from: g  reason: collision with root package name */
    public final Constructor<?> f13446g;

    /* renamed from: h  reason: collision with root package name */
    public final Method f13447h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f13448i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f13449j;

    /* renamed from: k  reason: collision with root package name */
    public final Method f13450k;

    /* renamed from: l  reason: collision with root package name */
    public final Method f13451l;

    public k() {
        Method method;
        Method method2;
        Method method3;
        Constructor<?> constructor;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = l(cls2);
            method2 = m(cls2);
            method = cls2.getMethod("freeze", new Class[0]);
            method4 = cls2.getMethod("abortCreation", new Class[0]);
            Class<?> cls3 = cls2;
            method5 = n(cls2);
            cls = cls3;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method5 = null;
            method4 = null;
            constructor = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f13445f = cls;
        this.f13446g = constructor;
        this.f13447h = method3;
        this.f13448i = method2;
        this.f13449j = method;
        this.f13450k = method4;
        this.f13451l = method5;
    }

    public static Method l(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    public static Method m(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    public final Typeface a(Context context, c.C0159c cVar, Resources resources, int i10) {
        boolean z10;
        Object obj;
        if (this.f13447h != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return super.a(context, cVar, resources, i10);
        }
        try {
            obj = this.f13446g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (c.d dVar : cVar.f13049a) {
            if (!i(context, obj, dVar.f13050a, dVar.f13054e, dVar.f13051b, dVar.f13052c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.f13053d))) {
                try {
                    this.f13450k.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (!k(obj)) {
            return null;
        }
        return j(obj);
    }

    public final Typeface b(Context context, m[] mVarArr, int i10) {
        boolean z10;
        Object obj;
        Typeface j10;
        boolean z11;
        ParcelFileDescriptor openFileDescriptor;
        if (mVarArr.length < 1) {
            return null;
        }
        if (this.f13447h != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            m f10 = f(i10, mVarArr);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(f10.f14786a, "r", (CancellationSignal) null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface$Builder(openFileDescriptor.getFileDescriptor()).setWeight(f10.f14788c).setItalic(f10.f14789d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            HashMap hashMap = new HashMap();
            for (m mVar : mVarArr) {
                if (mVar.f14790e == 0) {
                    Uri uri = mVar.f14786a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, p.e(context, uri));
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            try {
                obj = this.f13446g.newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
                obj = null;
            }
            if (obj == null) {
                return null;
            }
            boolean z12 = false;
            for (m mVar2 : mVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(mVar2.f14786a);
                if (byteBuffer != null) {
                    try {
                        z11 = ((Boolean) this.f13448i.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(mVar2.f14787b), null, Integer.valueOf(mVar2.f14788c), Integer.valueOf(mVar2.f14789d ? 1 : 0)})).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        z11 = false;
                    }
                    if (!z11) {
                        try {
                            this.f13450k.invoke(obj, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException unused4) {
                        }
                        return null;
                    }
                    z12 = true;
                }
            }
            if (!z12) {
                try {
                    this.f13450k.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused5) {
                }
                return null;
            } else if (k(obj) && (j10 = j(obj)) != null) {
                return Typeface.create(j10, i10);
            } else {
                return null;
            }
        }
        throw th;
    }

    public final Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        boolean z10;
        Object obj;
        if (this.f13447h != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return super.d(context, resources, i10, str, i11);
        }
        try {
            obj = this.f13446g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!i(context, obj, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            try {
                this.f13450k.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        } else if (!k(obj)) {
            return null;
        } else {
            return j(obj);
        }
    }

    public final boolean i(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f13447h.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f13445f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f13451l.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.f13449j.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method n(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
