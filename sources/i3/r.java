package i3;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

/* compiled from: ViewUtils */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final w f11068a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f11069b = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final b f11070c = new b(Rect.class);

    /* compiled from: ViewUtils */
    public class a extends Property<View, Float> {
        public a() {
            super(Float.class, "translationAlpha");
        }

        public final Object get(Object obj) {
            return Float.valueOf(r.f11068a.H0((View) obj));
        }

        public final void set(Object obj, Object obj2) {
            r.b((View) obj, ((Float) obj2).floatValue());
        }
    }

    /* compiled from: ViewUtils */
    public class b extends Property<View, Rect> {
        public b(Class cls) {
            super(cls, "clipBounds");
        }

        public final Object get(Object obj) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            return d0.f.a((View) obj);
        }

        public final void set(Object obj, Object obj2) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.f.c((View) obj, (Rect) obj2);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f11068a = new x();
        } else {
            f11068a = new w();
        }
    }

    public static void a(View view, int i10, int i11, int i12, int i13) {
        f11068a.M0(view, i10, i11, i12, i13);
    }

    public static void b(View view, float f10) {
        f11068a.I0(view, f10);
    }

    public static void c(int i10, View view) {
        f11068a.t0(i10, view);
    }
}
