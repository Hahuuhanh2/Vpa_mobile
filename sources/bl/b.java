package bl;

import al.b0;
import ik.a;

/* compiled from: AndroidExceptionPreHandler.kt */
public final class b extends a implements b0 {
    private volatile Object _preHandler = this;

    public b() {
        super(b0.a.f18992a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r0 != false) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void N(ik.f r6, java.lang.Throwable r7) {
        /*
            r5 = this;
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 1
            r1 = 0
            r2 = 26
            if (r2 > r6) goto L_0x000e
            r2 = 28
            if (r6 >= r2) goto L_0x000e
            r6 = r0
            goto L_0x000f
        L_0x000e:
            r6 = r1
        L_0x000f:
            if (r6 == 0) goto L_0x0059
            java.lang.Object r6 = r5._preHandler
            r2 = 0
            if (r6 == r5) goto L_0x0019
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            goto L_0x003f
        L_0x0019:
            java.lang.Class<java.lang.Thread> r6 = java.lang.Thread.class
            java.lang.String r3 = "getUncaughtExceptionPreHandler"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ all -> 0x003c }
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r3, r4)     // Catch:{ all -> 0x003c }
            int r3 = r6.getModifiers()     // Catch:{ all -> 0x003c }
            boolean r3 = java.lang.reflect.Modifier.isPublic(r3)     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x0038
            int r3 = r6.getModifiers()     // Catch:{ all -> 0x003c }
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r0 = r1
        L_0x0039:
            if (r0 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r6 = r2
        L_0x003d:
            r5._preHandler = r6
        L_0x003f:
            if (r6 == 0) goto L_0x0048
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Object r6 = r6.invoke(r2, r0)
            goto L_0x0049
        L_0x0048:
            r6 = r2
        L_0x0049:
            boolean r0 = r6 instanceof java.lang.Thread.UncaughtExceptionHandler
            if (r0 == 0) goto L_0x0050
            r2 = r6
            java.lang.Thread$UncaughtExceptionHandler r2 = (java.lang.Thread.UncaughtExceptionHandler) r2
        L_0x0050:
            if (r2 == 0) goto L_0x0059
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r2.uncaughtException(r6, r7)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.b.N(ik.f, java.lang.Throwable):void");
    }
}
