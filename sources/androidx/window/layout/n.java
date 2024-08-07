package androidx.window.layout;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.window.layout.g;
import androidx.window.layout.h;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import fk.r;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n0.l;
import n3.d;
import sk.j;

/* compiled from: SidecarAdapter.kt */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final int f3695a = 3;

    /* compiled from: SidecarAdapter.kt */
    public static final class a {
        @SuppressLint({"BanUncheckedReflection"})
        public static int a(SidecarDeviceState sidecarDeviceState) {
            j.f(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                if (invoke != null) {
                    return ((Integer) invoke).intValue();
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return 0;
            }
        }

        public static int b(SidecarDeviceState sidecarDeviceState) {
            j.f(sidecarDeviceState, "sidecarDeviceState");
            int a10 = a(sidecarDeviceState);
            if (a10 < 0 || a10 > 4) {
                return 0;
            }
            return a10;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static List c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            j.f(sidecarWindowLayoutInfo, "info");
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                if (list == null) {
                    return r.f20213a;
                }
                return list;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                if (invoke != null) {
                    return (List) invoke;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return r.f20213a;
            }
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static void d(SidecarDeviceState sidecarDeviceState, int i10) {
            try {
                sidecarDeviceState.posture = i10;
            } catch (NoSuchFieldError unused) {
                Class<SidecarDeviceState> cls = SidecarDeviceState.class;
                try {
                    cls.getMethod("setPosture", new Class[]{Integer.TYPE}).invoke(sidecarDeviceState, new Object[]{Integer.valueOf(i10)});
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                }
            }
        }
    }

    public n(int i10) {
        l.o(3, "verificationMode");
    }

    public static boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (j.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        if (a.b(sidecarDeviceState) == a.b(sidecarDeviceState2)) {
            return true;
        }
        return false;
    }

    public static boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (j.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return j.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            if (!b((SidecarDisplayFeature) list.get(i10), (SidecarDisplayFeature) list2.get(i10))) {
                return false;
            }
            i10 = i11;
        }
        return true;
    }

    public static boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (j.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        return c(a.c(sidecarWindowLayoutInfo), a.c(sidecarWindowLayoutInfo2));
    }

    public final z e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        j.f(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new z(r.f20213a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        a.d(sidecarDeviceState2, a.b(sidecarDeviceState));
        return new z(f(a.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList f(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h g2 = g((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (g2 != null) {
                arrayList.add(g2);
            }
        }
        return arrayList;
    }

    public final h g(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        h.a aVar;
        g.b bVar;
        j.f(sidecarDisplayFeature, "feature");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) d.a.a(sidecarDisplayFeature, this.f3695a).c("Type must be either TYPE_FOLD or TYPE_HINGE", o.f3696a).c("Feature bounds must not be 0", p.f3697a).c("TYPE_FOLD must have 0 area", q.f3698a).c("Feature be pinned to either left or top", r.f3699a).a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            aVar = h.a.f3685b;
        } else if (type != 2) {
            return null;
        } else {
            aVar = h.a.f3686c;
        }
        int b10 = a.b(sidecarDeviceState);
        if (b10 == 0 || b10 == 1) {
            return null;
        }
        if (b10 == 2) {
            bVar = g.b.f3680c;
        } else if (b10 == 3) {
            bVar = g.b.f3679b;
        } else if (b10 == 4) {
            return null;
        } else {
            bVar = g.b.f3679b;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        j.e(rect, "feature.rect");
        return new h(new n3.a(rect), aVar, bVar);
    }
}
