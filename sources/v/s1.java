package v;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.impl.c;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.q;
import androidx.camera.core.impl.y;
import f0.s0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import u.a;
import w.t;

/* compiled from: StreamUseCaseUtil */
public final class s1 {

    /* renamed from: a  reason: collision with root package name */
    public static final c f15834a = i.a.a(Long.TYPE, "camera2.streamSpec.streamUseCase");

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f15835b;

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap f15836c;

    static {
        HashMap hashMap = new HashMap();
        f15835b = hashMap;
        HashMap hashMap2 = new HashMap();
        f15836c = hashMap2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            y.b bVar = y.b.PREVIEW;
            hashSet.add(bVar);
            hashMap.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(bVar);
            hashSet2.add(y.b.IMAGE_ANALYSIS);
            hashMap.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            y.b bVar2 = y.b.IMAGE_CAPTURE;
            hashSet3.add(bVar2);
            hashMap.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            y.b bVar3 = y.b.VIDEO_CAPTURE;
            hashSet4.add(bVar3);
            hashMap.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(bVar);
            hashSet5.add(bVar2);
            hashSet5.add(bVar3);
            hashMap2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(bVar);
            hashSet6.add(bVar3);
            hashMap2.put(3L, hashSet6);
        }
    }

    public static boolean a(t tVar, List<s0> list) {
        long[] jArr;
        if (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) tVar.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (long valueOf : jArr) {
            hashSet.add(Long.valueOf(valueOf));
        }
        for (s0 d10 : list) {
            if (!hashSet.contains(Long.valueOf(d10.d()))) {
                return false;
            }
        }
        return true;
    }

    public static a b(i iVar, long j10) {
        c cVar = f15834a;
        if (iVar.c(cVar) && ((Long) iVar.a(cVar)).longValue() == j10) {
            return null;
        }
        q M = q.M(iVar);
        M.O(cVar, Long.valueOf(j10));
        return new a(M);
    }

    public static boolean c(y.b bVar, long j10, List<y.b> list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (bVar == y.b.STREAM_SHARING) {
            HashMap hashMap = f15836c;
            if (!hashMap.containsKey(Long.valueOf(j10))) {
                return false;
            }
            Set set = (Set) hashMap.get(Long.valueOf(j10));
            if (list.size() != set.size()) {
                return false;
            }
            for (y.b contains : list) {
                if (!set.contains(contains)) {
                    return false;
                }
            }
            return true;
        }
        HashMap hashMap2 = f15835b;
        if (!hashMap2.containsKey(Long.valueOf(j10)) || !((Set) hashMap2.get(Long.valueOf(j10))).contains(bVar)) {
            return false;
        }
        return true;
    }

    public static boolean d(t tVar) {
        long[] jArr;
        if (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) tVar.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (r5 != 4) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean e(androidx.camera.core.impl.i r4, androidx.camera.core.impl.y.b r5) {
        /*
            androidx.camera.core.impl.c r0 = androidx.camera.core.impl.x.f1422w
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r4.e(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0012
            return r1
        L_0x0012:
            androidx.camera.core.impl.c r0 = androidx.camera.core.impl.m.F
            boolean r2 = r4.c(r0)
            if (r2 != 0) goto L_0x001b
            return r1
        L_0x001b:
            java.lang.Object r4 = r4.a(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r5 = r5.ordinal()
            r0 = 5
            r2 = 1
            if (r5 == 0) goto L_0x0034
            r4 = 3
            if (r5 == r4) goto L_0x003a
            r3 = 4
            if (r5 == r3) goto L_0x003a
            goto L_0x0039
        L_0x0034:
            r5 = 2
            if (r4 != r5) goto L_0x0039
            r4 = r0
            goto L_0x003a
        L_0x0039:
            r4 = r2
        L_0x003a:
            if (r4 != r0) goto L_0x003d
            r1 = r2
        L_0x003d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v.s1.e(androidx.camera.core.impl.i, androidx.camera.core.impl.y$b):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean f(w.t r15, java.util.ArrayList r16, java.util.HashMap r17, java.util.HashMap r18) {
        /*
            r0 = r17
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 33
            if (r1 >= r3) goto L_0x000a
            return r2
        L_0x000a:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r3 = r17.keySet()
            r1.<init>(r3)
            java.util.Iterator r3 = r16.iterator()
        L_0x0017:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x002b
            java.lang.Object r4 = r3.next()
            androidx.camera.core.impl.a r4 = (androidx.camera.core.impl.a) r4
            androidx.camera.core.impl.i r4 = r4.d()
            al.g0.C(r4)
            goto L_0x0017
        L_0x002b:
            java.util.Iterator r3 = r1.iterator()
        L_0x002f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x004c
            java.lang.Object r4 = r3.next()
            androidx.camera.core.impl.x r4 = (androidx.camera.core.impl.x) r4
            java.lang.Object r4 = r0.get(r4)
            androidx.camera.core.impl.v r4 = (androidx.camera.core.impl.v) r4
            al.g0.C(r4)
            androidx.camera.core.impl.i r4 = r4.c()
            al.g0.C(r4)
            goto L_0x002f
        L_0x004c:
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES
            r4 = r15
            java.lang.Object r3 = r15.a(r3)
            long[] r3 = (long[]) r3
            if (r3 == 0) goto L_0x018d
            int r4 = r3.length
            if (r4 != 0) goto L_0x005c
            goto L_0x018d
        L_0x005c:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            int r5 = r3.length
            r6 = r2
        L_0x0063:
            if (r6 >= r5) goto L_0x0071
            r7 = r3[r6]
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r4.add(r7)
            int r6 = r6 + 1
            goto L_0x0063
        L_0x0071:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Iterator r5 = r16.iterator()
            boolean r6 = r5.hasNext()
            r7 = 0
            r9 = 1
            if (r6 == 0) goto L_0x00ae
            java.lang.Object r5 = r5.next()
            androidx.camera.core.impl.a r5 = (androidx.camera.core.impl.a) r5
            androidx.camera.core.impl.i r6 = r5.d()
            androidx.camera.core.impl.c r10 = u.a.G
            boolean r6 = r6.c(r10)
            if (r6 != 0) goto L_0x0096
            goto L_0x00a8
        L_0x0096:
            androidx.camera.core.impl.i r5 = r5.d()
            java.lang.Object r5 = r5.a(r10)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x00ab
        L_0x00a8:
            r6 = r2
            r5 = r9
            goto L_0x00b0
        L_0x00ab:
            r5 = r2
            r6 = r9
            goto L_0x00b0
        L_0x00ae:
            r5 = r2
            r6 = r5
        L_0x00b0:
            java.util.Iterator r10 = r1.iterator()
        L_0x00b4:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00fc
            java.lang.Object r11 = r10.next()
            androidx.camera.core.impl.x r11 = (androidx.camera.core.impl.x) r11
            androidx.camera.core.impl.c r12 = u.a.G
            boolean r13 = r11.c(r12)
            java.lang.String r14 = "Either all use cases must have non-default stream use case assigned or none should have it"
            if (r13 != 0) goto L_0x00d3
            if (r6 != 0) goto L_0x00cd
            goto L_0x00e3
        L_0x00cd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r14)
            throw r0
        L_0x00d3:
            java.lang.Object r11 = r11.a(r12)
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r13 != 0) goto L_0x00eb
            if (r6 != 0) goto L_0x00e5
        L_0x00e3:
            r5 = r9
            goto L_0x00b4
        L_0x00e5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r14)
            throw r0
        L_0x00eb:
            if (r5 != 0) goto L_0x00f6
            java.lang.Long r6 = java.lang.Long.valueOf(r11)
            r3.add(r6)
            r6 = r9
            goto L_0x00b4
        L_0x00f6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r14)
            throw r0
        L_0x00fc:
            if (r5 != 0) goto L_0x011b
            java.util.Iterator r3 = r3.iterator()
        L_0x0102:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0116
            java.lang.Object r5 = r3.next()
            java.lang.Long r5 = (java.lang.Long) r5
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L_0x0102
            r3 = r2
            goto L_0x0117
        L_0x0116:
            r3 = r9
        L_0x0117:
            if (r3 == 0) goto L_0x011b
            r3 = r9
            goto L_0x011c
        L_0x011b:
            r3 = r2
        L_0x011c:
            if (r3 == 0) goto L_0x018d
            java.util.Iterator r2 = r16.iterator()
        L_0x0122:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0151
            java.lang.Object r3 = r2.next()
            androidx.camera.core.impl.a r3 = (androidx.camera.core.impl.a) r3
            androidx.camera.core.impl.i r4 = r3.d()
            androidx.camera.core.impl.c r5 = u.a.G
            java.lang.Object r5 = r4.a(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            u.a r4 = b(r4, r5)
            if (r4 == 0) goto L_0x014e
            androidx.camera.core.impl.e r4 = r3.h(r4)
            r5 = r18
            r5.put(r3, r4)
            goto L_0x0122
        L_0x014e:
            r5 = r18
            goto L_0x0122
        L_0x0151:
            java.util.Iterator r1 = r1.iterator()
        L_0x0155:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x018c
            java.lang.Object r2 = r1.next()
            androidx.camera.core.impl.x r2 = (androidx.camera.core.impl.x) r2
            java.lang.Object r3 = r0.get(r2)
            androidx.camera.core.impl.v r3 = (androidx.camera.core.impl.v) r3
            androidx.camera.core.impl.i r4 = r3.c()
            androidx.camera.core.impl.c r5 = u.a.G
            java.lang.Object r5 = r4.a(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            u.a r4 = b(r4, r5)
            if (r4 == 0) goto L_0x0155
            androidx.camera.core.impl.e$a r3 = r3.e()
            r3.b(r4)
            androidx.camera.core.impl.e r3 = r3.a()
            r0.put(r2, r3)
            goto L_0x0155
        L_0x018c:
            return r9
        L_0x018d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v.s1.f(w.t, java.util.ArrayList, java.util.HashMap, java.util.HashMap):boolean");
    }
}
