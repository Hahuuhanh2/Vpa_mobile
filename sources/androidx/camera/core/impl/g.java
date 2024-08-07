package androidx.camera.core.impl;

import android.util.ArrayMap;
import android.util.Range;
import androidx.camera.core.impl.i;
import f0.f;
import f0.h0;
import f0.i0;
import f0.k;
import f0.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: CaptureConfig */
public final class g {

    /* renamed from: i  reason: collision with root package name */
    public static final c f1355i = i.a.a(Integer.TYPE, "camerax.core.captureConfig.rotation");

    /* renamed from: j  reason: collision with root package name */
    public static final c f1356j = i.a.a(Integer.class, "camerax.core.captureConfig.jpegQuality");

    /* renamed from: a  reason: collision with root package name */
    public final List<DeferrableSurface> f1357a;

    /* renamed from: b  reason: collision with root package name */
    public final i f1358b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1359c;

    /* renamed from: d  reason: collision with root package name */
    public final Range<Integer> f1360d;

    /* renamed from: e  reason: collision with root package name */
    public final List<f> f1361e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1362f;

    /* renamed from: g  reason: collision with root package name */
    public final u0 f1363g;

    /* renamed from: h  reason: collision with root package name */
    public final k f1364h;

    /* compiled from: CaptureConfig */
    public interface b {
        void a(x<?> xVar, a aVar);
    }

    public g(ArrayList arrayList, r rVar, int i10, Range range, ArrayList arrayList2, boolean z10, u0 u0Var, k kVar) {
        this.f1357a = arrayList;
        this.f1358b = rVar;
        this.f1359c = i10;
        this.f1360d = range;
        this.f1361e = Collections.unmodifiableList(arrayList2);
        this.f1362f = z10;
        this.f1363g = u0Var;
        this.f1364h = kVar;
    }

    public final List<DeferrableSurface> a() {
        return Collections.unmodifiableList(this.f1357a);
    }

    /* compiled from: CaptureConfig */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashSet f1365a;

        /* renamed from: b  reason: collision with root package name */
        public q f1366b;

        /* renamed from: c  reason: collision with root package name */
        public int f1367c;

        /* renamed from: d  reason: collision with root package name */
        public Range<Integer> f1368d;

        /* renamed from: e  reason: collision with root package name */
        public ArrayList f1369e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1370f;

        /* renamed from: g  reason: collision with root package name */
        public i0 f1371g;

        /* renamed from: h  reason: collision with root package name */
        public k f1372h;

        public a() {
            this.f1365a = new HashSet();
            this.f1366b = q.L();
            this.f1367c = -1;
            this.f1368d = v.f1409a;
            this.f1369e = new ArrayList();
            this.f1370f = false;
            this.f1371g = i0.c();
        }

        public final void a(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b((f) it.next());
            }
        }

        public final void b(f fVar) {
            if (!this.f1369e.contains(fVar)) {
                this.f1369e.add(fVar);
            }
        }

        public final void c(i iVar) {
            for (i.a next : iVar.d()) {
                q qVar = this.f1366b;
                Object obj = null;
                qVar.getClass();
                try {
                    obj = qVar.a(next);
                } catch (IllegalArgumentException unused) {
                }
                Object a10 = iVar.a(next);
                if (obj instanceof h0) {
                    h0 h0Var = (h0) a10;
                    h0Var.getClass();
                    ((h0) obj).f9547a.addAll(Collections.unmodifiableList(new ArrayList(h0Var.f9547a)));
                } else {
                    if (a10 instanceof h0) {
                        a10 = ((h0) a10).clone();
                    }
                    this.f1366b.N(next, iVar.v(next), a10);
                }
            }
        }

        public final g d() {
            ArrayList arrayList = new ArrayList(this.f1365a);
            r K = r.K(this.f1366b);
            int i10 = this.f1367c;
            Range<Integer> range = this.f1368d;
            ArrayList arrayList2 = new ArrayList(this.f1369e);
            boolean z10 = this.f1370f;
            i0 i0Var = this.f1371g;
            u0 u0Var = u0.f9604b;
            ArrayMap arrayMap = new ArrayMap();
            for (String next : i0Var.b()) {
                arrayMap.put(next, i0Var.a(next));
            }
            return new g(arrayList, K, i10, range, arrayList2, z10, new u0(arrayMap), this.f1372h);
        }

        public a(g gVar) {
            HashSet hashSet = new HashSet();
            this.f1365a = hashSet;
            this.f1366b = q.L();
            this.f1367c = -1;
            this.f1368d = v.f1409a;
            this.f1369e = new ArrayList();
            this.f1370f = false;
            this.f1371g = i0.c();
            hashSet.addAll(gVar.f1357a);
            this.f1366b = q.M(gVar.f1358b);
            this.f1367c = gVar.f1359c;
            this.f1368d = gVar.f1360d;
            this.f1369e.addAll(gVar.f1361e);
            this.f1370f = gVar.f1362f;
            u0 u0Var = gVar.f1363g;
            ArrayMap arrayMap = new ArrayMap();
            for (String next : u0Var.b()) {
                arrayMap.put(next, u0Var.a(next));
            }
            this.f1371g = new i0(arrayMap);
        }
    }
}
