package v;

import al.g0;
import android.hardware.camera2.CameraCharacteristics;
import android.text.TextUtils;
import c0.p0;
import c0.x;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import w.t;
import x.b;

/* compiled from: DynamicRangeResolver */
public final class e1 {

    /* renamed from: a  reason: collision with root package name */
    public final t f15662a;

    /* renamed from: b  reason: collision with root package name */
    public final b f15663b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15664c;

    /* compiled from: DynamicRangeResolver */
    public static final class a {
        public static x a(t tVar) {
            Long l10 = (Long) tVar.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l10 != null) {
                return x.a.b(l10.longValue());
            }
            return null;
        }
    }

    public e1(t tVar) {
        this.f15662a = tVar;
        this.f15663b = b.a(tVar);
        int[] iArr = (int[]) tVar.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z10 = false;
        if (iArr != null) {
            int length = iArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (iArr[i10] == 18) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f15664c = z10;
    }

    public static boolean a(x xVar, x xVar2) {
        g0.E("Fully specified range is not actually fully specified.", xVar2.b());
        int i10 = xVar.f4373a;
        if (i10 == 2 && xVar2.f4373a == 1) {
            return false;
        }
        if (i10 != 2 && i10 != 0 && i10 != xVar2.f4373a) {
            return false;
        }
        int i11 = xVar.f4374b;
        if (i11 == 0 || i11 == xVar2.f4374b) {
            return true;
        }
        return false;
    }

    public static boolean b(x xVar, x xVar2, HashSet hashSet) {
        if (hashSet.contains(xVar2)) {
            return a(xVar, xVar2);
        }
        String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", new Object[]{xVar, xVar2});
        p0.a("DynamicRangeResolver");
        return false;
    }

    public static x c(x xVar, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (xVar.f4373a == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            x xVar2 = (x) it.next();
            g0.D(xVar2, "Fully specified DynamicRange cannot be null.");
            int i10 = xVar2.f4373a;
            g0.E("Fully specified DynamicRange must have fully defined encoding.", xVar2.b());
            if (i10 != 1 && b(xVar, xVar2, hashSet)) {
                return xVar2;
            }
        }
        return null;
    }

    public static void d(HashSet hashSet, x xVar, b bVar) {
        g0.E("Cannot update already-empty constraints.", !hashSet.isEmpty());
        Set<x> c10 = bVar.f16822a.c(xVar);
        if (!c10.isEmpty()) {
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet.retainAll(c10);
            if (hashSet.isEmpty()) {
                throw new IllegalArgumentException(String.format("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", new Object[]{xVar, TextUtils.join("\n  ", c10), TextUtils.join("\n  ", hashSet2)}));
            }
        }
    }
}
