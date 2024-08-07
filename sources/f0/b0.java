package f0;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.widget.TextView;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.n;
import androidx.camera.core.impl.t;
import androidx.camera.core.impl.x;
import androidx.camera.core.impl.y;
import b0.e;
import bl.a;
import bl.b;
import c0.d1;
import c0.t0;
import fl.l;
import j0.c;
import j0.h;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceConfigurationError;
import v.v;

/* compiled from: ImageInputConfig */
public final /* synthetic */ class b0 implements t0.c {
    public static /* synthetic */ void A(int i10, String str) {
        if (i10 == 0) {
            throw new NullPointerException(r(str, " must not be null"));
        }
    }

    public static /* synthetic */ void B(TextView textView) {
        if (textView != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ Iterator C() {
        try {
            return Arrays.asList(new l[]{new a()}).iterator();
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    public static /* synthetic */ String D(int i10) {
        return i10 == 1 ? "PRIV" : i10 == 2 ? "YUV" : i10 == 3 ? "JPEG" : i10 == 4 ? "RAW" : "null";
    }

    public static /* synthetic */ String E(int i10) {
        return i10 == 1 ? "OK" : i10 == 2 ? "TRANSIENT_ERROR" : i10 == 3 ? "FATAL_ERROR" : i10 == 4 ? "INVALID_PAYLOAD" : "null";
    }

    public static /* synthetic */ String F(int i10) {
        return i10 == 1 ? "BEGIN_ARRAY" : i10 == 2 ? "END_ARRAY" : i10 == 3 ? "BEGIN_OBJECT" : i10 == 4 ? "END_OBJECT" : i10 == 5 ? "NAME" : i10 == 6 ? "STRING" : i10 == 7 ? "NUMBER" : i10 == 8 ? "BOOLEAN" : i10 == 9 ? "NULL" : i10 == 10 ? "END_DOCUMENT" : "null";
    }

    public static /* synthetic */ String G(int i10) {
        return i10 == 1 ? "MERGE" : i10 == 2 ? "ADD" : i10 == 3 ? "SUBTRACT" : i10 == 4 ? "INTERSECT" : i10 == 5 ? "EXCLUDE_INTERSECTIONS" : "null";
    }

    public static /* synthetic */ String H(int i10) {
        return i10 == 1 ? "PRE_COMP" : i10 == 2 ? "SOLID" : i10 == 3 ? "IMAGE" : i10 == 4 ? "NULL" : i10 == 5 ? "SHAPE" : i10 == 6 ? "TEXT" : i10 == 7 ? "UNKNOWN" : "null";
    }

    public static /* synthetic */ String I(int i10) {
        return i10 == 1 ? "BEGIN_ARRAY" : i10 == 2 ? "END_ARRAY" : i10 == 3 ? "BEGIN_OBJECT" : i10 == 4 ? "END_OBJECT" : i10 == 5 ? "NAME" : i10 == 6 ? "STRING" : i10 == 7 ? "NUMBER" : i10 == 8 ? "BOOLEAN" : i10 == 9 ? "NULL" : i10 == 10 ? "END_DOCUMENT" : "null";
    }

    public static int[] _values() {
        return v.k(8);
    }

    public static void b(t tVar, e eVar) {
        tVar.b().f(eVar);
    }

    public static y.b c(x xVar) {
        return (y.b) xVar.a(x.f1424y);
    }

    public static c0.x d(x xVar) {
        c0.x xVar2 = (c0.x) xVar.e(n.f1380e, c0.x.f4366c);
        xVar2.getClass();
        return xVar2;
    }

    public static int e(x xVar) {
        return ((Integer) xVar.a(x.f1419t)).intValue();
    }

    public static int f(x xVar) {
        return ((Integer) xVar.e(x.f1419t, 0)).intValue();
    }

    public static String g(x xVar) {
        return (String) xVar.a(h.A);
    }

    public static String h(h hVar, String str) {
        return (String) hVar.e(h.A, str);
    }

    public static boolean i(x xVar) {
        return ((Boolean) xVar.e(x.f1423x, Boolean.FALSE)).booleanValue();
    }

    public static boolean j(x xVar) {
        return ((Boolean) xVar.e(x.f1422w, Boolean.FALSE)).booleanValue();
    }

    public static Object k(t tVar, i.a aVar) {
        return tVar.b().a(aVar);
    }

    public static /* synthetic */ int l(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 3) {
            return 3;
        }
        if (i10 == 4) {
            return 4;
        }
        throw null;
    }

    public static /* synthetic */ boolean m(int i10) {
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return false;
        }
        if (i10 == 4 || i10 == 5) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ int n(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        throw null;
    }

    public static int o(int i10, int i11, int i12, int i13) {
        return ((i10 * i11) / i12) + i13;
    }

    public static String p(String str, int i10, String str2, int i11) {
        return str + i10 + str2 + i11;
    }

    public static String q(String str, Object obj) {
        return str + obj;
    }

    public static String r(String str, String str2) {
        return str + str2;
    }

    public static String s(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String t(NumberFormat numberFormat, long j10, StringBuilder sb2, String str) {
        sb2.append(numberFormat.format(j10));
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder u(String str, int i10, String str2, int i11, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i11);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder v(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder w(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static HashMap x(Class cls, va.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static /* synthetic */ Iterator y() {
        try {
            return Arrays.asList(new al.b0[]{new b()}).iterator();
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    public static Map z(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public void a(d1 d1Var) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(d1Var.f4214b.getWidth(), d1Var.f4214b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        d1Var.a(surface, j7.a.x(), new c(surface, surfaceTexture));
    }
}
