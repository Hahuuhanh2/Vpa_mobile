package androidx.window.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;

/* compiled from: WindowMetricsCalculatorCompat.kt */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f3667a = new a0();

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0135  */
    @android.annotation.SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Rect a(android.app.Activity r9) {
        /*
            java.lang.String r0 = "activity"
            sk.j.f(r9, r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.content.res.Resources r1 = r9.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            r2 = 1
            r3 = 0
            java.lang.Class<android.content.res.Configuration> r4 = android.content.res.Configuration.class
            java.lang.String r5 = "windowConfiguration"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch:{ NoSuchFieldException -> 0x008f, NoSuchMethodException -> 0x0083, IllegalAccessException -> 0x0077, InvocationTargetException -> 0x006b }
            r4.setAccessible(r2)     // Catch:{ NoSuchFieldException -> 0x008f, NoSuchMethodException -> 0x0083, IllegalAccessException -> 0x0077, InvocationTargetException -> 0x006b }
            java.lang.Object r1 = r4.get(r1)     // Catch:{ NoSuchFieldException -> 0x008f, NoSuchMethodException -> 0x0083, IllegalAccessException -> 0x0077, InvocationTargetException -> 0x006b }
            boolean r4 = r9.isInMultiWindowMode()     // Catch:{ NoSuchFieldException -> 0x008f, NoSuchMethodException -> 0x0083, IllegalAccessException -> 0x0077, InvocationTargetException -> 0x006b }
            java.lang.String r5 = "null cannot be cast to non-null type android.graphics.Rect"
            if (r4 == 0) goto L_0x004b
            java.lang.Class r4 = r1.getClass()     // Catch:{ NoSuchFieldException -> 0x008f, NoSuchMethodException -> 0x0083, IllegalAccessException -> 0x0077, InvocationTargetException -> 0x006b }
            java.lang.String r6 = "getBounds"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ NoSuchFieldException -> 0x008f, NoSuchMethodException -> 0x0083, IllegalAccessException -> 0x0077, InvocationTargetException -> 0x006b }
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r6, r7)     // Catch:{ NoSuchFieldException -> 0x008f, NoSuchMethodException -> 0x0083, IllegalAccessException -> 0x0077, InvocationTargetException -> 0x006b }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ NoSuchFieldException -> 0x008f, NoSuchMethodException -> 0x0083, IllegalAccessException -> 0x0077, InvocationTargetException -> 0x006b }
            java.lang.Object r1 = r4.invoke(r1, r6)     // Catch:{ NoSuchFieldException -> 0x008f, NoSuchMethodException -> 0x0083, IllegalAccessException -> 0x0077, InvocationTargetException -> 0x006b }
            if (r1 == 0) goto L_0x0045
            android.graphics.Rect r1 = (android.graphics.Rect) r1     // Catch:{ NoSuchFieldException -> 0x008f, NoSuchMethodException -> 0x0083, IllegalAccessException -> 0x0077, InvocationTargetException -> 0x006b }
            r0.set(r1)     // Catch:{ NoSuchFieldException -> 0x008f, NoSuchMethodException -> 0x0083, IllegalAccessException -> 0x0077, InvocationTargetException -> 0x006b }
            goto L_0x009a
        L_0x0045:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ NoSuchFieldException -> 0x008f, NoSuchMethodException -> 0x0083, IllegalAccessException -> 0x0077, InvocationTargetException -> 0x006b }
            r1.<init>(r5)     // Catch:{ NoSuchFieldException -> 0x008f, NoSuchMethodException -> 0x0083, IllegalAccessException -> 0x0077, InvocationTargetException -> 0x006b }
            throw r1     // Catch:{ NoSuchFieldException -> 0x008f, NoSuchMethodException -> 0x0083, IllegalAccessException -> 0x0077, InvocationTargetException -> 0x006b }
        L_0x004b:
            java.lang.Class r4 = r1.getClass()     // Catch:{ NoSuchFieldException -> 0x008f, NoSuchMethodException -> 0x0083, IllegalAccessException -> 0x0077, InvocationTargetException -> 0x006b }
            java.lang.String r6 = "getAppBounds"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ NoSuchFieldException -> 0x008f, NoSuchMethodException -> 0x0083, IllegalAccessException -> 0x0077, InvocationTargetException -> 0x006b }
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r6, r7)     // Catch:{ NoSuchFieldException -> 0x008f, NoSuchMethodException -> 0x0083, IllegalAccessException -> 0x0077, InvocationTargetException -> 0x006b }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ NoSuchFieldException -> 0x008f, NoSuchMethodException -> 0x0083, IllegalAccessException -> 0x0077, InvocationTargetException -> 0x006b }
            java.lang.Object r1 = r4.invoke(r1, r6)     // Catch:{ NoSuchFieldException -> 0x008f, NoSuchMethodException -> 0x0083, IllegalAccessException -> 0x0077, InvocationTargetException -> 0x006b }
            if (r1 == 0) goto L_0x0065
            android.graphics.Rect r1 = (android.graphics.Rect) r1     // Catch:{ NoSuchFieldException -> 0x008f, NoSuchMethodException -> 0x0083, IllegalAccessException -> 0x0077, InvocationTargetException -> 0x006b }
            r0.set(r1)     // Catch:{ NoSuchFieldException -> 0x008f, NoSuchMethodException -> 0x0083, IllegalAccessException -> 0x0077, InvocationTargetException -> 0x006b }
            goto L_0x009a
        L_0x0065:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ NoSuchFieldException -> 0x008f, NoSuchMethodException -> 0x0083, IllegalAccessException -> 0x0077, InvocationTargetException -> 0x006b }
            r1.<init>(r5)     // Catch:{ NoSuchFieldException -> 0x008f, NoSuchMethodException -> 0x0083, IllegalAccessException -> 0x0077, InvocationTargetException -> 0x006b }
            throw r1     // Catch:{ NoSuchFieldException -> 0x008f, NoSuchMethodException -> 0x0083, IllegalAccessException -> 0x0077, InvocationTargetException -> 0x006b }
        L_0x006b:
            android.view.WindowManager r1 = r9.getWindowManager()
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getRectSize(r0)
            goto L_0x009a
        L_0x0077:
            android.view.WindowManager r1 = r9.getWindowManager()
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getRectSize(r0)
            goto L_0x009a
        L_0x0083:
            android.view.WindowManager r1 = r9.getWindowManager()
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getRectSize(r0)
            goto L_0x009a
        L_0x008f:
            android.view.WindowManager r1 = r9.getWindowManager()
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getRectSize(r0)
        L_0x009a:
            android.view.WindowManager r1 = r9.getWindowManager()
            android.view.Display r1 = r1.getDefaultDisplay()
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>()
            java.lang.String r5 = "currentDisplay"
            sk.j.e(r1, r5)
            r1.getRealSize(r4)
            boolean r5 = r9.isInMultiWindowMode()
            if (r5 != 0) goto L_0x00d3
            int r5 = b(r9)
            int r6 = r0.bottom
            int r6 = r6 + r5
            int r7 = r4.y
            if (r6 != r7) goto L_0x00c3
            r0.bottom = r6
            goto L_0x00d3
        L_0x00c3:
            int r6 = r0.right
            int r6 = r6 + r5
            int r7 = r4.x
            if (r6 != r7) goto L_0x00cd
            r0.right = r6
            goto L_0x00d3
        L_0x00cd:
            int r6 = r0.left
            if (r6 != r5) goto L_0x00d3
            r0.left = r3
        L_0x00d3:
            int r5 = r0.width()
            int r6 = r4.x
            if (r5 < r6) goto L_0x00e3
            int r5 = r0.height()
            int r6 = r4.y
            if (r5 >= r6) goto L_0x0171
        L_0x00e3:
            boolean r9 = r9.isInMultiWindowMode()
            if (r9 != 0) goto L_0x0171
            java.lang.String r9 = "android.view.DisplayInfo"
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0132 }
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0132 }
            java.lang.reflect.Constructor r9 = r9.getConstructor(r5)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0132 }
            r9.setAccessible(r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0132 }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0132 }
            java.lang.Object r9 = r9.newInstance(r5)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0132 }
            java.lang.Class r5 = r1.getClass()     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0132 }
            java.lang.String r6 = "getDisplayInfo"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0132 }
            java.lang.Class r8 = r9.getClass()     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0132 }
            r7[r3] = r8     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0132 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0132 }
            r5.setAccessible(r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0132 }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0132 }
            r6[r3] = r9     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0132 }
            r5.invoke(r1, r6)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0132 }
            java.lang.Class r1 = r9.getClass()     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0132 }
            java.lang.String r5 = "displayCutout"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r5)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0132 }
            r1.setAccessible(r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0132 }
            java.lang.Object r9 = r1.get(r9)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0132 }
            boolean r1 = r9 instanceof android.view.DisplayCutout     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0132 }
            if (r1 == 0) goto L_0x0132
            android.view.DisplayCutout r9 = (android.view.DisplayCutout) r9     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0132 }
            goto L_0x0133
        L_0x0132:
            r9 = 0
        L_0x0133:
            if (r9 == 0) goto L_0x0171
            int r1 = r0.left
            int r2 = androidx.window.layout.b.b(r9)
            if (r1 != r2) goto L_0x013f
            r0.left = r3
        L_0x013f:
            int r1 = r4.x
            int r2 = r0.right
            int r1 = r1 - r2
            int r2 = androidx.window.layout.b.c(r9)
            if (r1 != r2) goto L_0x0153
            int r1 = r0.right
            int r2 = androidx.window.layout.b.c(r9)
            int r2 = r2 + r1
            r0.right = r2
        L_0x0153:
            int r1 = r0.top
            int r2 = androidx.window.layout.b.d(r9)
            if (r1 != r2) goto L_0x015d
            r0.top = r3
        L_0x015d:
            int r1 = r4.y
            int r2 = r0.bottom
            int r1 = r1 - r2
            int r2 = androidx.window.layout.b.a(r9)
            if (r1 != r2) goto L_0x0171
            int r1 = r0.bottom
            int r9 = androidx.window.layout.b.a(r9)
            int r9 = r9 + r1
            r0.bottom = r9
        L_0x0171:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.a0.a(android.app.Activity):android.graphics.Rect");
    }

    public static int b(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static Point c(Display display) {
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }
}
