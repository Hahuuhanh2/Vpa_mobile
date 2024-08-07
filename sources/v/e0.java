package v;

import i0.a;
import java.util.List;
import v.c0;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e0 implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c0.c f15659a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f15660b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f15661c;

    public /* synthetic */ e0(c0.c cVar, List list, int i10) {
        this.f15659a = cVar;
        this.f15660b = list;
        this.f15661c = i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final v8.a apply(java.lang.Object r15) {
        /*
            r14 = this;
            v.c0$c r0 = r14.f15659a
            java.util.List r1 = r14.f15660b
            int r2 = r14.f15661c
            android.hardware.camera2.TotalCaptureResult r15 = (android.hardware.camera2.TotalCaptureResult) r15
            r0.getClass()
            java.lang.String r15 = "ZslControlImpl"
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x001b:
            boolean r5 = r1.hasNext()
            r6 = 1
            if (r5 == 0) goto L_0x00eb
            java.lang.Object r5 = r1.next()
            androidx.camera.core.impl.g r5 = (androidx.camera.core.impl.g) r5
            androidx.camera.core.impl.g$a r7 = new androidx.camera.core.impl.g$a
            r7.<init>(r5)
            int r8 = r5.f1359c
            r9 = 5
            r10 = 0
            r11 = 0
            if (r8 != r9) goto L_0x008a
            v.o r8 = r0.f15624c
            v.l2 r8 = r8.f15766l
            boolean r12 = r8.f15739d
            if (r12 != 0) goto L_0x008a
            boolean r12 = r8.f15738c
            if (r12 != 0) goto L_0x008a
            m0.b r8 = r8.f15737b     // Catch:{ NoSuchElementException -> 0x0052 }
            java.lang.Object r12 = r8.f13043b     // Catch:{ NoSuchElementException -> 0x0052 }
            monitor-enter(r12)     // Catch:{ NoSuchElementException -> 0x0052 }
            java.util.ArrayDeque<androidx.camera.core.d> r8 = r8.f13042a     // Catch:{ all -> 0x004f }
            java.lang.Object r8 = r8.removeLast()     // Catch:{ all -> 0x004f }
            monitor-exit(r12)     // Catch:{ all -> 0x004f }
            androidx.camera.core.d r8 = (androidx.camera.core.d) r8     // Catch:{ NoSuchElementException -> 0x0052 }
            goto L_0x0056
        L_0x004f:
            r8 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x004f }
            throw r8     // Catch:{ NoSuchElementException -> 0x0052 }
        L_0x0052:
            c0.p0.b(r15)
            r8 = r11
        L_0x0056:
            if (r8 == 0) goto L_0x007a
            v.o r12 = r0.f15624c
            v.l2 r12 = r12.f15766l
            r12.getClass()
            android.media.Image r13 = r8.r0()
            android.media.ImageWriter r12 = r12.f15745j
            if (r12 == 0) goto L_0x0075
            if (r13 == 0) goto L_0x0075
            r12.queueInputImage(r13)     // Catch:{ IllegalStateException -> 0x006e }
            r12 = r6
            goto L_0x0076
        L_0x006e:
            r12 = move-exception
            r12.getMessage()
            c0.p0.b(r15)
        L_0x0075:
            r12 = r10
        L_0x0076:
            if (r12 == 0) goto L_0x007a
            r12 = r6
            goto L_0x007b
        L_0x007a:
            r12 = r10
        L_0x007b:
            if (r12 == 0) goto L_0x008a
            c0.k0 r8 = r8.f0()
            boolean r12 = r8 instanceof j0.b
            if (r12 == 0) goto L_0x008a
            j0.b r8 = (j0.b) r8
            f0.k r8 = r8.f11451a
            r11 = r8
        L_0x008a:
            r8 = 3
            if (r11 == 0) goto L_0x0090
            r7.f1372h = r11
            goto L_0x00a9
        L_0x0090:
            int r11 = r0.f15622a
            r12 = -1
            if (r11 != r8) goto L_0x009b
            boolean r11 = r0.f15626e
            if (r11 != 0) goto L_0x009b
            r5 = 4
            goto L_0x00a5
        L_0x009b:
            int r5 = r5.f1359c
            if (r5 == r12) goto L_0x00a4
            if (r5 != r9) goto L_0x00a2
            goto L_0x00a4
        L_0x00a2:
            r5 = r12
            goto L_0x00a5
        L_0x00a4:
            r5 = 2
        L_0x00a5:
            if (r5 == r12) goto L_0x00a9
            r7.f1367c = r5
        L_0x00a9:
            z.l r5 = r0.f15625d
            boolean r9 = r5.f17758b
            if (r9 == 0) goto L_0x00b6
            if (r2 != 0) goto L_0x00b6
            boolean r5 = r5.f17757a
            if (r5 == 0) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r6 = r10
        L_0x00b7:
            if (r6 == 0) goto L_0x00d6
            androidx.camera.core.impl.q r5 = androidx.camera.core.impl.q.L()
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            androidx.camera.core.impl.c r6 = u.a.K(r6)
            r5.O(r6, r8)
            u.a r6 = new u.a
            androidx.camera.core.impl.r r5 = androidx.camera.core.impl.r.K(r5)
            r6.<init>(r5)
            r7.c(r6)
        L_0x00d6:
            v.f0 r5 = new v.f0
            r5.<init>(r10, r0, r7)
            z0.b$d r5 = z0.b.a(r5)
            r3.add(r5)
            androidx.camera.core.impl.g r5 = r7.d()
            r4.add(r5)
            goto L_0x001b
        L_0x00eb:
            v.o r15 = r0.f15624c
            r15.r(r4)
            i0.m r15 = new i0.m
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            h0.a r1 = j7.a.x()
            r15.<init>(r0, r6, r1)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: v.e0.apply(java.lang.Object):v8.a");
    }
}
