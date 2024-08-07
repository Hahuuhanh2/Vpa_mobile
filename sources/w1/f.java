package w1;

import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.R$id;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import w1.d0;

/* compiled from: KeyEventDispatcher */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f16317a = false;

    /* renamed from: b  reason: collision with root package name */
    public static Method f16318b = null;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f16319c = false;

    /* renamed from: d  reason: collision with root package name */
    public static Field f16320d;

    /* compiled from: KeyEventDispatcher */
    public interface a {
        boolean u(KeyEvent keyEvent);
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        int indexOfKey;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList<WeakReference<View>> arrayList = d0.s.f16313d;
            int i10 = R$id.tag_unhandled_key_event_manager;
            d0.s sVar = (d0.s) view.getTag(i10);
            if (sVar == null) {
                sVar = new d0.s();
                view.setTag(i10, sVar);
            }
            WeakReference<KeyEvent> weakReference = sVar.f16316c;
            if (weakReference == null || weakReference.get() != keyEvent) {
                sVar.f16316c = new WeakReference<>(keyEvent);
                WeakReference weakReference2 = null;
                if (sVar.f16315b == null) {
                    sVar.f16315b = new SparseArray<>();
                }
                SparseArray<WeakReference<View>> sparseArray = sVar.f16315b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    View view2 = (View) weakReference2.get();
                    if (view2 == null || !d0.g.b(view2)) {
                        return true;
                    }
                    d0.s.b(view2, keyEvent);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"LambdaLast"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(w1.f.a r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x000f
            boolean r7 = r7.u(r10)
            return r7
        L_0x000f:
            boolean r1 = r9 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0081
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L_0x0064
            android.app.ActionBar r8 = r9.getActionBar()
            int r1 = r10.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L_0x0064
            if (r8 == 0) goto L_0x0064
            boolean r1 = f16317a
            if (r1 != 0) goto L_0x004c
            java.lang.Class r1 = r8.getClass()     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r0] = r6     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x004a }
            f16318b = r1     // Catch:{ NoSuchMethodException -> 0x004a }
        L_0x004a:
            f16317a = r3
        L_0x004c:
            java.lang.reflect.Method r1 = f16318b
            if (r1 == 0) goto L_0x0061
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061 }
            r4[r0] = r10     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061 }
            java.lang.Object r8 = r1.invoke(r8, r4)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061 }
            if (r8 != 0) goto L_0x005b
            goto L_0x0061
        L_0x005b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061 }
            boolean r0 = r8.booleanValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061 }
        L_0x0061:
            if (r0 == 0) goto L_0x0064
            goto L_0x0080
        L_0x0064:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L_0x006b
            goto L_0x0080
        L_0x006b:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = w1.d0.c(r7, r10)
            if (r8 == 0) goto L_0x0076
            goto L_0x0080
        L_0x0076:
            if (r7 == 0) goto L_0x007c
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L_0x007c:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L_0x0080:
            return r3
        L_0x0081:
            boolean r1 = r9 instanceof android.app.Dialog
            if (r1 == 0) goto L_0x00d4
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = f16319c
            if (r7 != 0) goto L_0x009a
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x0098 }
            f16320d = r7     // Catch:{ NoSuchFieldException -> 0x0098 }
            r7.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x0098 }
        L_0x0098:
            f16319c = r3
        L_0x009a:
            java.lang.reflect.Field r7 = f16320d
            if (r7 == 0) goto L_0x00a5
            java.lang.Object r7 = r7.get(r9)     // Catch:{ IllegalAccessException -> 0x00a5 }
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch:{ IllegalAccessException -> 0x00a5 }
            goto L_0x00a6
        L_0x00a5:
            r7 = r2
        L_0x00a6:
            if (r7 == 0) goto L_0x00b3
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto L_0x00b3
            goto L_0x00d3
        L_0x00b3:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L_0x00be
            goto L_0x00d3
        L_0x00be:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = w1.d0.c(r7, r10)
            if (r8 == 0) goto L_0x00c9
            goto L_0x00d3
        L_0x00c9:
            if (r7 == 0) goto L_0x00cf
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L_0x00cf:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L_0x00d3:
            return r3
        L_0x00d4:
            if (r8 == 0) goto L_0x00dc
            boolean r8 = w1.d0.c(r8, r10)
            if (r8 != 0) goto L_0x00e2
        L_0x00dc:
            boolean r7 = r7.u(r10)
            if (r7 == 0) goto L_0x00e3
        L_0x00e2:
            r0 = r3
        L_0x00e3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.f.b(w1.f$a, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }
}
