package v;

import a0.a;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import f0.t;
import f0.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import p3.l0;
import w.z;

/* compiled from: Camera2CameraFactory */
public final class p implements f0.p {

    /* renamed from: a  reason: collision with root package name */
    public final a f15792a;

    /* renamed from: b  reason: collision with root package name */
    public final u f15793b;

    /* renamed from: c  reason: collision with root package name */
    public final t f15794c;

    /* renamed from: d  reason: collision with root package name */
    public final z f15795d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f15796e;

    /* renamed from: f  reason: collision with root package name */
    public final d1 f15797f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f15798g = new HashMap();

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p(android.content.Context r6, f0.a r7, c0.p r8) {
        /*
            r5 = this;
            r5.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.f15798g = r0
            r5.f15793b = r7
            android.os.Handler r7 = r7.f9515b
            w.z r7 = w.z.a(r6, r7)
            r5.f15795d = r7
            v.d1 r6 = v.d1.b(r6)
            r5.f15797f = r6
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            r6.<init>()     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            w.z$b r0 = r7.f16259a     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            w.d0 r0 = (w.d0) r0     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            r0.getClass()     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            android.hardware.camera2.CameraManager r0 = r0.f16196a     // Catch:{ CameraAccessException -> 0x0114 }
            java.lang.String[] r0 = r0.getCameraIdList()     // Catch:{ CameraAccessException -> 0x0114 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            if (r8 != 0) goto L_0x0046
            java.util.Iterator r7 = r0.iterator()     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
        L_0x0036:
            boolean r8 = r7.hasNext()     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            if (r8 == 0) goto L_0x0092
            java.lang.Object r8 = r7.next()     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            r6.add(r8)     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            goto L_0x0036
        L_0x0046:
            java.lang.Integer r1 = r8.c()     // Catch:{ IllegalStateException -> 0x004f }
            java.lang.String r7 = v.s0.a(r7, r1, r0)     // Catch:{ IllegalStateException -> 0x004f }
            goto L_0x0050
        L_0x004f:
            r7 = 0
        L_0x0050:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            r1.<init>()     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
        L_0x0059:
            boolean r2 = r0.hasNext()     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            if (r2 == 0) goto L_0x0074
            java.lang.Object r2 = r0.next()     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            boolean r3 = r2.equals(r7)     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            if (r3 == 0) goto L_0x006c
            goto L_0x0059
        L_0x006c:
            v.x r2 = r5.e(r2)     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            r1.add(r2)     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            goto L_0x0059
        L_0x0074:
            java.util.List r7 = r8.b(r1)     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
        L_0x007c:
            boolean r8 = r7.hasNext()     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            if (r8 == 0) goto L_0x0092
            java.lang.Object r8 = r7.next()     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            c0.o r8 = (c0.o) r8     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            f0.q r8 = (f0.q) r8     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            java.lang.String r8 = r8.b()     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            r6.add(r8)     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            goto L_0x007c
        L_0x0092:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x009b:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00fc
            java.lang.Object r8 = r6.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r0 = "0"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x00f8
            java.lang.String r0 = "1"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00b8
            goto L_0x00f8
        L_0x00b8:
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "robolectric"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c3
            goto L_0x00dc
        L_0x00c3:
            w.z r0 = r5.f15795d     // Catch:{ CameraAccessExceptionCompat -> 0x00ed }
            w.t r0 = r0.b(r8)     // Catch:{ CameraAccessExceptionCompat -> 0x00ed }
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES     // Catch:{ CameraAccessExceptionCompat -> 0x00ed }
            java.lang.Object r0 = r0.a(r1)     // Catch:{ CameraAccessExceptionCompat -> 0x00ed }
            int[] r0 = (int[]) r0     // Catch:{ CameraAccessExceptionCompat -> 0x00ed }
            r1 = 0
            if (r0 == 0) goto L_0x00e1
            int r2 = r0.length
            r3 = r1
        L_0x00d6:
            if (r3 >= r2) goto L_0x00e1
            r4 = r0[r3]
            if (r4 != 0) goto L_0x00de
        L_0x00dc:
            r1 = 1
            goto L_0x00e1
        L_0x00de:
            int r3 = r3 + 1
            goto L_0x00d6
        L_0x00e1:
            if (r1 == 0) goto L_0x00e7
            r7.add(r8)
            goto L_0x009b
        L_0x00e7:
            java.lang.String r8 = "Camera2CameraFactory"
            c0.p0.a(r8)
            goto L_0x009b
        L_0x00ed:
            r6 = move-exception
            androidx.camera.core.InitializationException r7 = new androidx.camera.core.InitializationException
            androidx.camera.core.CameraUnavailableException r6 = p3.l0.B(r6)
            r7.<init>(r6)
            throw r7
        L_0x00f8:
            r7.add(r8)
            goto L_0x009b
        L_0x00fc:
            r5.f15796e = r7
            a0.a r6 = new a0.a
            w.z r7 = r5.f15795d
            r6.<init>(r7)
            r5.f15792a = r6
            f0.t r7 = new f0.t
            r7.<init>(r6)
            r5.f15794c = r7
            java.util.ArrayList r6 = r6.f4a
            r6.add(r7)
            return
        L_0x0114:
            r6 = move-exception
            androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat r7 = new androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            r7.<init>((android.hardware.camera2.CameraAccessException) r6)     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
            throw r7     // Catch:{ CameraAccessExceptionCompat -> 0x0122, CameraUnavailableException -> 0x011b }
        L_0x011b:
            r6 = move-exception
            androidx.camera.core.InitializationException r7 = new androidx.camera.core.InitializationException
            r7.<init>(r6)
            throw r7
        L_0x0122:
            r6 = move-exception
            androidx.camera.core.InitializationException r7 = new androidx.camera.core.InitializationException
            androidx.camera.core.CameraUnavailableException r6 = p3.l0.B(r6)
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v.p.<init>(android.content.Context, f0.a, c0.p):void");
    }

    public final LinkedHashSet a() {
        return new LinkedHashSet(this.f15796e);
    }

    public final z b() {
        return this.f15795d;
    }

    public final u c(String str) {
        if (this.f15796e.contains(str)) {
            return new u(this.f15795d, str, e(str), this.f15792a, this.f15794c, this.f15793b.a(), this.f15793b.b(), this.f15797f);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    public final a d() {
        return this.f15792a;
    }

    public final x e(String str) {
        try {
            x xVar = (x) this.f15798g.get(str);
            if (xVar != null) {
                return xVar;
            }
            x xVar2 = new x(str, this.f15795d);
            this.f15798g.put(str, xVar2);
            return xVar2;
        } catch (CameraAccessExceptionCompat e10) {
            throw l0.B(e10);
        }
    }
}
