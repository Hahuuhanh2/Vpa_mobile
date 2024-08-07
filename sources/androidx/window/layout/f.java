package androidx.window.layout;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.g;
import androidx.window.layout.h;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import n3.a;
import sk.j;

/* compiled from: ExtensionsWindowLayoutInfoAdapter.kt */
public final class f {
    public static h a(Activity activity, FoldingFeature foldingFeature) {
        h.a aVar;
        g.b bVar;
        Rect rect;
        boolean z10;
        int i10;
        j.f(activity, "activity");
        int type = foldingFeature.getType();
        boolean z11 = true;
        if (type == 1) {
            aVar = h.a.f3685b;
        } else if (type != 2) {
            return null;
        } else {
            aVar = h.a.f3686c;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar = g.b.f3679b;
        } else if (state != 2) {
            return null;
        } else {
            bVar = g.b.f3680c;
        }
        Rect bounds = foldingFeature.getBounds();
        j.e(bounds, "oemFeature.bounds");
        a aVar2 = new a(bounds);
        a0.f3667a.getClass();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            rect = a.a(activity);
        } else if (i11 >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke != null) {
                    rect = new Rect((Rect) invoke);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
            } catch (NoSuchFieldException unused) {
                rect = a0.a(activity);
            } catch (NoSuchMethodException unused2) {
                rect = a0.a(activity);
            } catch (IllegalAccessException unused3) {
                rect = a0.a(activity);
            } catch (InvocationTargetException unused4) {
                rect = a0.a(activity);
            }
        } else if (i11 >= 28) {
            rect = a0.a(activity);
        } else if (i11 >= 24) {
            Rect rect2 = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect2);
            if (!activity.isInMultiWindowMode()) {
                Point c10 = a0.c(defaultDisplay);
                int b10 = a0.b(activity);
                int i12 = rect2.bottom + b10;
                if (i12 == c10.y) {
                    rect2.bottom = i12;
                } else {
                    int i13 = rect2.right + b10;
                    if (i13 == c10.x) {
                        rect2.right = i13;
                    }
                }
            }
            rect = rect2;
        } else {
            Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
            j.e(defaultDisplay2, "defaultDisplay");
            Point c11 = a0.c(defaultDisplay2);
            Rect rect3 = new Rect();
            int i14 = c11.x;
            if (i14 == 0 || (i10 = c11.y) == 0) {
                defaultDisplay2.getRectSize(rect3);
            } else {
                rect3.right = i14;
                rect3.bottom = i10;
            }
            rect = rect3;
        }
        Rect a10 = new a(rect).a();
        if (aVar2.f13480d - aVar2.f13478b == 0 && aVar2.f13479c - aVar2.f13477a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (!(aVar2.f13479c - aVar2.f13477a == a10.width() || aVar2.f13480d - aVar2.f13478b == a10.height()) || ((aVar2.f13479c - aVar2.f13477a < a10.width() && aVar2.f13480d - aVar2.f13478b < a10.height()) || (aVar2.f13479c - aVar2.f13477a == a10.width() && aVar2.f13480d - aVar2.f13478b == a10.height())))) {
            z11 = false;
        }
        if (!z11) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        j.e(bounds2, "oemFeature.bounds");
        return new h(new a(bounds2), aVar, bVar);
    }

    public static z b(Activity activity, WindowLayoutInfo windowLayoutInfo) {
        h hVar;
        j.f(activity, "activity");
        j.f(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        j.e(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                j.e(foldingFeature, "feature");
                hVar = a(activity, foldingFeature);
            } else {
                hVar = null;
            }
            if (hVar != null) {
                arrayList.add(hVar);
            }
        }
        return new z(arrayList);
    }
}
