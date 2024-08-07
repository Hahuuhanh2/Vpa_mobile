package androidx.appcompat.app;

import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* compiled from: ResourcesFlusher */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static Field f465a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f466b;

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f467c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f468d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f469e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f470f;

    /* renamed from: g  reason: collision with root package name */
    public static Field f471g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f472h;

    /* compiled from: ResourcesFlusher */
    public static class a {
        public static void a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    public static void a(Object obj) {
        if (!f468d) {
            try {
                f467c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f468d = true;
        }
        Class<?> cls = f467c;
        if (cls != null) {
            if (!f470f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f469e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused2) {
                }
                f470f = true;
            }
            Field field = f469e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException unused3) {
                }
                if (longSparseArray != null) {
                    a.a(longSparseArray);
                }
            }
        }
    }
}
