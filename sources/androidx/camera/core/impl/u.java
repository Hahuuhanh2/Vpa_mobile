package androidx.camera.core.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.d;
import androidx.camera.core.impl.g;
import c0.p0;
import c0.x;
import f0.i0;
import f0.k;
import f0.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* compiled from: SessionConfig */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final List<e> f1391a;

    /* renamed from: b  reason: collision with root package name */
    public final List<CameraDevice.StateCallback> f1392b;

    /* renamed from: c  reason: collision with root package name */
    public final List<CameraCaptureSession.StateCallback> f1393c;

    /* renamed from: d  reason: collision with root package name */
    public final List<f0.f> f1394d;

    /* renamed from: e  reason: collision with root package name */
    public final List<c> f1395e;

    /* renamed from: f  reason: collision with root package name */
    public final g f1396f;

    /* renamed from: g  reason: collision with root package name */
    public InputConfiguration f1397g;

    /* compiled from: SessionConfig */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final LinkedHashSet f1398a = new LinkedHashSet();

        /* renamed from: b  reason: collision with root package name */
        public final g.a f1399b = new g.a();

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f1400c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f1401d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final ArrayList f1402e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        public final ArrayList f1403f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        public InputConfiguration f1404g;
    }

    /* compiled from: SessionConfig */
    public static class b extends a {
        public static b d(x<?> xVar, Size size) {
            d q10 = xVar.q();
            if (q10 != null) {
                b bVar = new b();
                q10.a(size, xVar, bVar);
                return bVar;
            }
            StringBuilder q11 = android.support.v4.media.a.q("Implementation is missing option unpacker for ");
            q11.append(xVar.t(xVar.toString()));
            throw new IllegalStateException(q11.toString());
        }

        public final void a(CameraCaptureSession.StateCallback stateCallback) {
            if (!this.f1401d.contains(stateCallback)) {
                this.f1401d.add(stateCallback);
            }
        }

        public final void b(DeferrableSurface deferrableSurface, x xVar) {
            d.a a10 = e.a(deferrableSurface);
            a10.b(xVar);
            this.f1398a.add(a10.a());
            this.f1399b.f1365a.add(deferrableSurface);
        }

        public final u c() {
            return new u(new ArrayList(this.f1398a), new ArrayList(this.f1400c), new ArrayList(this.f1401d), new ArrayList(this.f1403f), new ArrayList(this.f1402e), this.f1399b.d(), this.f1404g);
        }
    }

    /* compiled from: SessionConfig */
    public interface c {
        void a();
    }

    /* compiled from: SessionConfig */
    public interface d {
        void a(Size size, x<?> xVar, b bVar);
    }

    /* compiled from: SessionConfig */
    public static abstract class e {

        /* compiled from: SessionConfig */
        public static abstract class a {
        }

        public static d.a a(DeferrableSurface deferrableSurface) {
            d.a aVar = new d.a();
            if (deferrableSurface != null) {
                aVar.f1339a = deferrableSurface;
                List<DeferrableSurface> emptyList = Collections.emptyList();
                if (emptyList != null) {
                    aVar.f1340b = emptyList;
                    aVar.f1341c = null;
                    aVar.f1342d = -1;
                    aVar.b(x.f4367d);
                    return aVar;
                }
                throw new NullPointerException("Null sharedSurfaces");
            }
            throw new NullPointerException("Null surface");
        }

        public abstract x b();

        public abstract String c();

        public abstract List<DeferrableSurface> d();

        public abstract DeferrableSurface e();

        public abstract int f();
    }

    /* compiled from: SessionConfig */
    public static final class f extends a {

        /* renamed from: k  reason: collision with root package name */
        public static final List<Integer> f1405k = Arrays.asList(new Integer[]{1, 5, 3});

        /* renamed from: h  reason: collision with root package name */
        public final l0.c f1406h = new l0.c();

        /* renamed from: i  reason: collision with root package name */
        public boolean f1407i = true;

        /* renamed from: j  reason: collision with root package name */
        public boolean f1408j = false;

        public final void a(u uVar) {
            Map<String, Object> map;
            g gVar = uVar.f1396f;
            int i10 = gVar.f1359c;
            if (i10 != -1) {
                this.f1408j = true;
                g.a aVar = this.f1399b;
                int i11 = aVar.f1367c;
                List<Integer> list = f1405k;
                if (list.indexOf(Integer.valueOf(i10)) < list.indexOf(Integer.valueOf(i11))) {
                    i10 = i11;
                }
                aVar.f1367c = i10;
            }
            Range<Integer> range = gVar.f1360d;
            Range<Integer> range2 = v.f1409a;
            if (!range.equals(range2)) {
                if (this.f1399b.f1368d.equals(range2)) {
                    this.f1399b.f1368d = range;
                } else if (!this.f1399b.f1368d.equals(range)) {
                    this.f1407i = false;
                    p0.a("ValidatingBuilder");
                }
            }
            u0 u0Var = uVar.f1396f.f1363g;
            Map<String, Object> map2 = this.f1399b.f1371g.f9605a;
            if (!(map2 == null || (map = u0Var.f9605a) == null)) {
                map2.putAll(map);
            }
            this.f1400c.addAll(uVar.f1392b);
            this.f1401d.addAll(uVar.f1393c);
            this.f1399b.a(uVar.f1396f.f1361e);
            this.f1403f.addAll(uVar.f1394d);
            this.f1402e.addAll(uVar.f1395e);
            InputConfiguration inputConfiguration = uVar.f1397g;
            if (inputConfiguration != null) {
                this.f1404g = inputConfiguration;
            }
            this.f1398a.addAll(uVar.f1391a);
            this.f1399b.f1365a.addAll(gVar.a());
            ArrayList arrayList = new ArrayList();
            for (e eVar : this.f1398a) {
                arrayList.add(eVar.e());
                for (DeferrableSurface add : eVar.d()) {
                    arrayList.add(add);
                }
            }
            if (!arrayList.containsAll(this.f1399b.f1365a)) {
                p0.a("ValidatingBuilder");
                this.f1407i = false;
            }
            this.f1399b.c(gVar.f1358b);
        }

        public final u b() {
            if (this.f1407i) {
                ArrayList arrayList = new ArrayList(this.f1398a);
                l0.c cVar = this.f1406h;
                if (cVar.f12630a) {
                    Collections.sort(arrayList, new l0.b(cVar));
                }
                return new u(arrayList, new ArrayList(this.f1400c), new ArrayList(this.f1401d), new ArrayList(this.f1403f), new ArrayList(this.f1402e), this.f1399b.d(), this.f1404g);
            }
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }
    }

    public u(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, g gVar, InputConfiguration inputConfiguration) {
        this.f1391a = arrayList;
        this.f1392b = Collections.unmodifiableList(arrayList2);
        this.f1393c = Collections.unmodifiableList(arrayList3);
        this.f1394d = Collections.unmodifiableList(arrayList4);
        this.f1395e = Collections.unmodifiableList(arrayList5);
        this.f1396f = gVar;
        this.f1397g = inputConfiguration;
    }

    public static u a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        ArrayList arrayList5 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        q L = q.L();
        Range<Integer> range = v.f1409a;
        ArrayList arrayList6 = new ArrayList();
        i0 c10 = i0.c();
        ArrayList arrayList7 = new ArrayList(hashSet);
        r K = r.K(L);
        ArrayList arrayList8 = new ArrayList(arrayList6);
        u0 u0Var = u0.f9604b;
        ArrayMap arrayMap = new ArrayMap();
        for (String next : c10.b()) {
            arrayMap.put(next, c10.a(next));
        }
        return new u(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, new g(arrayList7, K, -1, range, arrayList8, false, new u0(arrayMap), (k) null), (InputConfiguration) null);
    }

    public final List<DeferrableSurface> b() {
        ArrayList arrayList = new ArrayList();
        for (e next : this.f1391a) {
            arrayList.add(next.e());
            for (DeferrableSurface add : next.d()) {
                arrayList.add(add);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
