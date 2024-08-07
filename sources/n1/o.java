package n1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;
import m1.c;
import t1.m;

/* compiled from: TypefaceCompatBaseImpl */
public class o {

    /* compiled from: TypefaceCompatBaseImpl */
    public interface a<T> {
        int a(T t10);

        boolean b(T t10);
    }

    public o() {
        new ConcurrentHashMap();
    }

    public static <T> T e(T[] tArr, int i10, a<T> aVar) {
        int i11;
        boolean z10;
        int i12;
        if ((i10 & 1) == 0) {
            i11 = 400;
        } else {
            i11 = 700;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        T t10 = null;
        int i13 = Integer.MAX_VALUE;
        for (T t11 : tArr) {
            int abs = Math.abs(aVar.a(t11) - i11) * 2;
            if (aVar.b(t11) == z10) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            int i14 = abs + i12;
            if (t10 == null || i13 > i14) {
                t10 = t11;
                i13 = i14;
            }
        }
        return t10;
    }

    public Typeface a(Context context, c.C0159c cVar, Resources resources, int i10) {
        throw null;
    }

    public Typeface b(Context context, m[] mVarArr, int i10) {
        throw null;
    }

    public Typeface c(Context context, InputStream inputStream) {
        File d10 = p.d(context);
        if (d10 == null) {
            return null;
        }
        try {
            if (!p.c(d10, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(d10.getPath());
            d10.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d10.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        File d10 = p.d(context);
        if (d10 == null) {
            return null;
        }
        try {
            if (!p.b(d10, resources, i10)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(d10.getPath());
            d10.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d10.delete();
        }
    }

    public m f(int i10, m[] mVarArr) {
        return (m) e(mVarArr, i10, new n());
    }
}
