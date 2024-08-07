package v;

import android.content.Context;
import androidx.camera.core.impl.y;

/* compiled from: Camera2UseCaseConfigFactory */
public final class m0 implements y {

    /* renamed from: b  reason: collision with root package name */
    public final d1 f15748b;

    public m0(Context context) {
        this.f15748b = d1.b(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x009b A[LOOP:0: B:14:0x0095->B:16:0x009b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0141 A[LOOP:1: B:29:0x013b->B:31:0x0141, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0170  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.camera.core.impl.i a(androidx.camera.core.impl.y.b r29, int r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            androidx.camera.core.impl.q r3 = androidx.camera.core.impl.q.L()
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            androidx.camera.core.impl.q r6 = androidx.camera.core.impl.q.L()
            android.util.Range<java.lang.Integer> r11 = androidx.camera.core.impl.v.f1409a
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            f0.i0 r8 = f0.i0.c()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            int r15 = r29.ordinal()
            r17 = 5
            if (r15 == 0) goto L_0x004c
            r13 = 3
            if (r15 == r13) goto L_0x0047
            r13 = 4
            if (r15 == r13) goto L_0x0048
            r15 = 2
            goto L_0x0053
        L_0x0047:
            r13 = 4
        L_0x0048:
            r15 = 2
            r18 = 3
            goto L_0x0055
        L_0x004c:
            r13 = 4
            r15 = 2
            if (r2 != r15) goto L_0x0053
            r18 = r17
            goto L_0x0055
        L_0x0053:
            r18 = 1
        L_0x0055:
            androidx.camera.core.impl.c r15 = androidx.camera.core.impl.x.f1415p
            r20 = r15
            androidx.camera.core.impl.u r15 = new androidx.camera.core.impl.u
            r21 = r15
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r14)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r12)
            androidx.camera.core.impl.g r26 = new androidx.camera.core.impl.g
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r5)
            androidx.camera.core.impl.r r5 = androidx.camera.core.impl.r.K(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r7)
            f0.u0 r7 = f0.u0.f9604b
            android.util.ArrayMap r7 = new android.util.ArrayMap
            r7.<init>()
            java.util.Set r22 = r8.b()
            java.util.Iterator r22 = r22.iterator()
        L_0x0095:
            boolean r23 = r22.hasNext()
            if (r23 == 0) goto L_0x00b0
            java.lang.Object r23 = r22.next()
            r13 = r23
            java.lang.String r13 = (java.lang.String) r13
            r23 = r9
            java.lang.Object r9 = r8.a(r13)
            r7.put(r13, r9)
            r9 = r23
            r13 = 4
            goto L_0x0095
        L_0x00b0:
            r23 = r9
            f0.u0 r13 = new f0.u0
            r13.<init>(r7)
            r22 = 0
            r7 = r26
            r8 = r12
            r9 = r5
            r5 = r10
            r10 = r18
            r12 = r6
            r16 = r13
            r6 = 3
            r13 = 0
            r18 = r14
            r14 = r16
            r19 = r15
            r6 = r20
            r16 = r21
            r15 = r22
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r27 = 0
            r20 = r16
            r21 = r19
            r22 = r4
            r24 = r5
            r25 = r18
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r4 = r16
            r3.O(r6, r4)
            androidx.camera.core.impl.c r4 = androidx.camera.core.impl.x.f1417r
            v.l0 r5 = v.l0.f15733a
            r3.O(r4, r5)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            androidx.camera.core.impl.q r5 = androidx.camera.core.impl.q.L()
            android.util.Range<java.lang.Integer> r10 = androidx.camera.core.impl.v.f1409a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r12 = 0
            f0.i0 r7 = f0.i0.c()
            int r8 = r29.ordinal()
            if (r8 == 0) goto L_0x0112
            r9 = 3
            if (r8 == r9) goto L_0x011a
            r2 = 4
            if (r8 == r2) goto L_0x011a
            r9 = 1
            goto L_0x011a
        L_0x0112:
            r8 = 2
            if (r2 != r8) goto L_0x0116
            goto L_0x0118
        L_0x0116:
            r17 = r8
        L_0x0118:
            r9 = r17
        L_0x011a:
            androidx.camera.core.impl.c r2 = androidx.camera.core.impl.x.f1416q
            androidx.camera.core.impl.g r15 = new androidx.camera.core.impl.g
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r4)
            androidx.camera.core.impl.r r4 = androidx.camera.core.impl.r.K(r5)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r6)
            f0.u0 r5 = f0.u0.f9604b
            android.util.ArrayMap r5 = new android.util.ArrayMap
            r5.<init>()
            java.util.Set r6 = r7.b()
            java.util.Iterator r6 = r6.iterator()
        L_0x013b:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L_0x014f
            java.lang.Object r13 = r6.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r7.a(r13)
            r5.put(r13, r14)
            goto L_0x013b
        L_0x014f:
            f0.u0 r13 = new f0.u0
            r13.<init>(r5)
            r14 = 0
            r6 = r15
            r7 = r8
            r8 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r3.O(r2, r15)
            androidx.camera.core.impl.c r2 = androidx.camera.core.impl.x.f1418s
            androidx.camera.core.impl.y$b r4 = androidx.camera.core.impl.y.b.IMAGE_CAPTURE
            if (r1 != r4) goto L_0x0167
            v.l1 r4 = v.l1.f15734c
            goto L_0x0169
        L_0x0167:
            v.a0 r4 = v.a0.f15574a
        L_0x0169:
            r3.O(r2, r4)
            androidx.camera.core.impl.y$b r2 = androidx.camera.core.impl.y.b.PREVIEW
            if (r1 != r2) goto L_0x017b
            v.d1 r2 = r0.f15748b
            android.util.Size r2 = r2.e()
            androidx.camera.core.impl.c r4 = androidx.camera.core.impl.o.f1387l
            r3.O(r4, r2)
        L_0x017b:
            v.d1 r2 = r0.f15748b
            r4 = 1
            android.view.Display r2 = r2.c(r4)
            int r2 = r2.getRotation()
            androidx.camera.core.impl.c r4 = androidx.camera.core.impl.o.f1382g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.O(r4, r2)
            androidx.camera.core.impl.y$b r2 = androidx.camera.core.impl.y.b.VIDEO_CAPTURE
            if (r1 == r2) goto L_0x0197
            androidx.camera.core.impl.y$b r2 = androidx.camera.core.impl.y.b.STREAM_SHARING
            if (r1 != r2) goto L_0x019e
        L_0x0197:
            androidx.camera.core.impl.c r1 = androidx.camera.core.impl.x.f1422w
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r3.O(r1, r2)
        L_0x019e:
            androidx.camera.core.impl.r r1 = androidx.camera.core.impl.r.K(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v.m0.a(androidx.camera.core.impl.y$b, int):androidx.camera.core.impl.i");
    }
}
