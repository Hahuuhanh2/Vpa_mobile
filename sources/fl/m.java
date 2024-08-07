package fl;

import al.q1;

/* compiled from: MainDispatchers.kt */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final q1 f20254a;

    /* JADX WARNING: type inference failed for: r0v7, types: [xk.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r3.a();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0069 */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            int r1 = fl.u.f20263a
            r1 = 0
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ SecurityException -> 0x000a }
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            if (r0 == 0) goto L_0x0010
            java.lang.Boolean.parseBoolean(r0)
        L_0x0010:
            java.util.Iterator r0 = f0.b0.C()     // Catch:{ all -> 0x0079 }
            java.lang.String r2 = "<this>"
            sk.j.f(r0, r2)     // Catch:{ all -> 0x0079 }
            xk.j r2 = new xk.j     // Catch:{ all -> 0x0079 }
            r2.<init>(r0)     // Catch:{ all -> 0x0079 }
            boolean r0 = r2 instanceof xk.a     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0023
            goto L_0x0029
        L_0x0023:
            xk.a r0 = new xk.a     // Catch:{ all -> 0x0079 }
            r0.<init>(r2)     // Catch:{ all -> 0x0079 }
            r2 = r0
        L_0x0029:
            java.util.List r0 = xk.h.q1(r2)     // Catch:{ all -> 0x0079 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0079 }
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0079 }
            if (r3 != 0) goto L_0x0039
            r3 = r1
            goto L_0x0060
        L_0x0039:
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0079 }
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0079 }
            if (r4 != 0) goto L_0x0044
            goto L_0x0060
        L_0x0044:
            r4 = r3
            fl.l r4 = (fl.l) r4     // Catch:{ all -> 0x0079 }
            int r4 = r4.c()     // Catch:{ all -> 0x0079 }
        L_0x004b:
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0079 }
            r6 = r5
            fl.l r6 = (fl.l) r6     // Catch:{ all -> 0x0079 }
            int r6 = r6.c()     // Catch:{ all -> 0x0079 }
            if (r4 >= r6) goto L_0x005a
            r3 = r5
            r4 = r6
        L_0x005a:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x0079 }
            if (r5 != 0) goto L_0x004b
        L_0x0060:
            fl.l r3 = (fl.l) r3     // Catch:{ all -> 0x0079 }
            if (r3 == 0) goto L_0x0071
            al.q1 r1 = r3.b(r0)     // Catch:{ all -> 0x0069 }
            goto L_0x006c
        L_0x0069:
            r3.a()     // Catch:{ all -> 0x0079 }
        L_0x006c:
            if (r1 == 0) goto L_0x0071
            f20254a = r1
            return
        L_0x0071:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            r0.<init>(r1)     // Catch:{ all -> 0x0079 }
            throw r0     // Catch:{ all -> 0x0079 }
        L_0x0079:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fl.m.<clinit>():void");
    }
}
