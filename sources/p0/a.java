package p0;

import al.g0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.impl.e;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.n;
import androidx.camera.core.impl.o;
import androidx.camera.core.impl.q;
import androidx.camera.core.impl.u;
import androidx.camera.core.impl.v;
import androidx.camera.core.impl.x;
import androidx.camera.core.impl.y;
import c0.d1;
import c0.f1;
import c0.j0;
import c0.p0;
import c0.q0;
import c0.s0;
import c0.t0;
import c0.z;
import ea.c;
import f0.b0;
import f0.r;
import g0.m;
import h0.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import n0.d;
import n0.e;
import n0.j;
import n0.u;
import n0.w;
import n0.x;
import v.f;

/* compiled from: StreamSharing */
public final class a extends f1 {

    /* renamed from: n  reason: collision with root package name */
    public final c f13883n;

    /* renamed from: o  reason: collision with root package name */
    public final e f13884o;

    /* renamed from: p  reason: collision with root package name */
    public x f13885p;

    /* renamed from: q  reason: collision with root package name */
    public u f13886q;

    /* renamed from: r  reason: collision with root package name */
    public u f13887r;

    /* renamed from: s  reason: collision with root package name */
    public u.b f13888s;

    /* renamed from: p0.a$a  reason: collision with other inner class name */
    /* compiled from: StreamSharing */
    public interface C0174a {
    }

    public a(r rVar, HashSet hashSet, y yVar) {
        super(E(hashSet));
        this.f13883n = E(hashSet);
        this.f13884o = new e(rVar, hashSet, yVar, new q0(this, 4));
    }

    public static c E(HashSet hashSet) {
        q L = q.L();
        new b(L);
        L.O(n.f1379d, 34);
        L.O(androidx.camera.core.impl.x.f1424y, y.b.STREAM_SHARING);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            f1 f1Var = (f1) it.next();
            if (f1Var.f4259f.c(androidx.camera.core.impl.x.f1424y)) {
                arrayList.add(f1Var.f4259f.z());
            }
        }
        L.O(c.F, arrayList);
        L.O(o.f1384i, 2);
        return new c(androidx.camera.core.impl.r.K(L));
    }

    public final void C() {
        n0.u uVar = this.f13886q;
        if (uVar != null) {
            m.a();
            uVar.c();
            uVar.f13403n = true;
            this.f13886q = null;
        }
        n0.u uVar2 = this.f13887r;
        if (uVar2 != null) {
            m.a();
            uVar2.c();
            uVar2.f13403n = true;
            this.f13887r = null;
        }
        x xVar = this.f13885p;
        if (xVar != null) {
            xVar.b();
            this.f13885p = null;
        }
    }

    public final androidx.camera.core.impl.u D(String str, androidx.camera.core.impl.x<?> xVar, v vVar) {
        d1.d dVar;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        m.a();
        r b10 = b();
        b10.getClass();
        Matrix matrix = this.f4263j;
        boolean m10 = b10.m();
        Size d10 = vVar.d();
        Rect rect = this.f4262i;
        if (rect == null) {
            rect = new Rect(0, 0, d10.getWidth(), d10.getHeight());
        }
        n0.u uVar = new n0.u(3, 34, vVar, matrix, m10, rect, h(b10, false), -1, m(b10));
        this.f13886q = uVar;
        if (this.f4265l == null) {
            this.f13887r = uVar;
            this.f13885p = new x(b10, (w) j.a.f13349a.apply(vVar.a()));
            e eVar = this.f13884o;
            n0.u uVar2 = this.f13887r;
            eVar.getClass();
            HashMap hashMap = new HashMap();
            for (f1 next : eVar.f13891a) {
                boolean z11 = next instanceof t0;
                if (z11) {
                    i10 = eVar.f13895e.a().j(((o) ((t0) next).f4259f).x());
                } else {
                    i10 = 0;
                }
                if (z11) {
                    i11 = 1;
                } else {
                    if (next instanceof j0) {
                        i13 = 4;
                    } else {
                        i13 = 2;
                    }
                    i11 = i13;
                }
                if (next instanceof j0) {
                    i12 = 256;
                } else {
                    i12 = 34;
                }
                int i14 = i12;
                Rect rect2 = uVar2.f13393d;
                RectF rectF = g0.n.f10263a;
                hashMap.put(next, new e(UUID.randomUUID(), i11, i14, rect2, g0.n.e(i10, new Size(rect2.width(), rect2.height())), i10, next.m(eVar)));
            }
            x xVar2 = this.f13885p;
            d dVar2 = new d(this.f13887r, new ArrayList(hashMap.values()));
            xVar2.getClass();
            m.a();
            xVar2.f13421c = new x.c();
            n0.u uVar3 = dVar2.f13317a;
            Iterator<x.d> it = dVar2.f13318b.iterator();
            while (it.hasNext()) {
                x.d next2 = it.next();
                x.c cVar = xVar2.f13421c;
                Rect a10 = next2.a();
                int d11 = next2.d();
                boolean c10 = next2.c();
                Matrix matrix2 = new Matrix(uVar3.f13391b);
                matrix2.postConcat(g0.n.a(d11, new RectF(a10), g0.n.f(next2.e()), c10));
                g0.z(g0.n.d(g0.n.e(d11, new Size(a10.width(), a10.height())), false, next2.e()));
                e.a e10 = uVar3.f13395f.e();
                Size e11 = next2.e();
                if (e11 != null) {
                    e10.f1348a = e11;
                    androidx.camera.core.impl.e a11 = e10.a();
                    int f10 = next2.f();
                    int b11 = next2.b();
                    Size e12 = next2.e();
                    Iterator<x.d> it2 = it;
                    Rect rect3 = new Rect(0, 0, e12.getWidth() + 0, e12.getHeight() + 0);
                    int i15 = uVar3.f13397h - d11;
                    if (uVar3.f13394e != c10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    n0.u uVar4 = r12;
                    n0.u uVar5 = new n0.u(f10, b11, a11, matrix2, false, rect3, i15, -1, z10);
                    cVar.put(next2, uVar4);
                    it = it2;
                } else {
                    e10.getClass();
                    throw new NullPointerException("Null resolution");
                }
            }
            x.c cVar2 = xVar2.f13421c;
            d1 b12 = uVar3.b(xVar2.f13420b);
            b f02 = j7.a.f0();
            c cVar3 = new c(cVar2, 8);
            synchronized (b12.f4213a) {
                b12.f4223k = cVar3;
                b12.f4224l = f02;
                dVar = b12.f4222j;
            }
            if (dVar != null) {
                f02.execute(new f(7, cVar3, dVar));
            }
            try {
                xVar2.f13419a.b(b12);
            } catch (ProcessingException unused) {
                p0.c("SurfaceProcessorNode");
            }
            for (Map.Entry entry : xVar2.f13421c.entrySet()) {
                xVar2.a(uVar3, entry);
                n0.u uVar6 = (n0.u) entry.getValue();
                s0 s0Var = new s0(1, xVar2, uVar3, entry);
                uVar6.getClass();
                m.a();
                uVar6.a();
                uVar6.f13402m.add(s0Var);
            }
            x.c cVar4 = xVar2.f13421c;
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                hashMap2.put((f1) entry2.getKey(), (n0.u) cVar4.get(entry2.getValue()));
            }
            e eVar2 = this.f13884o;
            eVar2.f13892b.clear();
            eVar2.f13892b.putAll(hashMap2);
            for (Map.Entry entry3 : eVar2.f13892b.entrySet()) {
                f1 f1Var = (f1) entry3.getKey();
                n0.u uVar7 = (n0.u) entry3.getValue();
                f1Var.z(uVar7.f13393d);
                f1Var.y(uVar7.f13391b);
                f1Var.f4260g = f1Var.w(uVar7.f13395f);
                f1Var.p();
            }
            u.b d12 = u.b.d(xVar, vVar.d());
            n0.u uVar8 = this.f13886q;
            uVar8.getClass();
            m.a();
            uVar8.a();
            g0.E("Consumer can only be linked once.", !uVar8.f13399j);
            uVar8.f13399j = true;
            d12.b(uVar8.f13401l, c0.x.f4367d);
            d12.f1399b.b(this.f13884o.f13896f);
            if (vVar.c() != null) {
                d12.f1399b.c(vVar.c());
            }
            d12.f1402e.add(new z(this, str, xVar, vVar, 1));
            this.f13888s = d12;
            return d12.c();
        }
        throw null;
    }

    public final androidx.camera.core.impl.x<?> e(boolean z10, y yVar) {
        c cVar = this.f13883n;
        cVar.getClass();
        i a10 = yVar.a(b0.c(cVar), 1);
        if (z10) {
            a10 = android.support.v4.media.a.t(a10, this.f13883n.E);
        }
        if (a10 == null) {
            return null;
        }
        return ((b) j(a10)).b();
    }

    public final Set<Integer> i() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    public final x.a<?, ?, ?> j(i iVar) {
        return new b(q.M(iVar));
    }

    public final void q() {
        e eVar = this.f13884o;
        for (f1 next : eVar.f13891a) {
            next.a(eVar, (androidx.camera.core.impl.x<?>) null, next.e(true, eVar.f13894d));
        }
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [c0.y, androidx.camera.core.impl.x$a, androidx.camera.core.impl.x$a<?, ?, ?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.camera.core.impl.x<?> s(f0.q r9, androidx.camera.core.impl.x.a<?, ?, ?> r10) {
        /*
            r8 = this;
            p0.e r9 = r8.f13884o
            androidx.camera.core.impl.p r0 = r10.a()
            r9.getClass()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Set<c0.f1> r2 = r9.f13891a
            java.util.Iterator r2 = r2.iterator()
        L_0x0014:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x0036
            java.lang.Object r3 = r2.next()
            c0.f1 r3 = (c0.f1) r3
            f0.r r5 = r9.f13895e
            f0.q r5 = r5.n()
            r6 = 1
            androidx.camera.core.impl.y r7 = r9.f13894d
            androidx.camera.core.impl.x r6 = r3.e(r6, r7)
            androidx.camera.core.impl.x r3 = r3.n(r5, r4, r6)
            r1.add(r3)
            goto L_0x0014
        L_0x0036:
            java.util.ArrayList r2 = new java.util.ArrayList
            f0.r r3 = r9.f13895e
            f0.q r3 = r3.n()
            r5 = 34
            java.util.List r3 = r3.m(r5)
            r2.<init>(r3)
            f0.r r9 = r9.f13895e
            androidx.camera.core.impl.CameraControlInternal r9 = r9.h()
            android.graphics.Rect r9 = r9.b()
            android.graphics.RectF r3 = g0.n.f10263a
            android.util.Size r3 = new android.util.Size
            int r5 = r9.width()
            int r9 = r9.height()
            r3.<init>(r5, r9)
            androidx.camera.core.impl.c r9 = androidx.camera.core.impl.o.f1390o
            java.util.Iterator r3 = r1.iterator()
        L_0x0066:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007d
            java.lang.Object r5 = r3.next()
            androidx.camera.core.impl.x r5 = (androidx.camera.core.impl.x) r5
            androidx.camera.core.impl.c r6 = androidx.camera.core.impl.o.f1390o
            java.lang.Object r5 = r5.e(r6, r4)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x0066
            r2 = r5
        L_0x007d:
            androidx.camera.core.impl.q r0 = (androidx.camera.core.impl.q) r0
            r0.O(r9, r2)
            androidx.camera.core.impl.c r9 = androidx.camera.core.impl.x.f1419t
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x0089:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x009e
            java.lang.Object r3 = r1.next()
            androidx.camera.core.impl.x r3 = (androidx.camera.core.impl.x) r3
            int r3 = r3.p()
            int r2 = java.lang.Math.max(r2, r3)
            goto L_0x0089
        L_0x009e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.O(r9, r1)
            androidx.camera.core.impl.x r9 = r10.b()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.a.s(f0.q, androidx.camera.core.impl.x$a):androidx.camera.core.impl.x");
    }

    public final void t() {
        for (f1 t10 : this.f13884o.f13891a) {
            t10.t();
        }
    }

    public final void u() {
        for (f1 u10 : this.f13884o.f13891a) {
            u10.u();
        }
    }

    public final androidx.camera.core.impl.e v(i iVar) {
        this.f13888s.f1399b.c(iVar);
        B(this.f13888s.c());
        e.a e10 = this.f4260g.e();
        e10.f1351d = iVar;
        return e10.a();
    }

    public final v w(v vVar) {
        B(D(d(), this.f4259f, vVar));
        this.f4256c = 1;
        p();
        return vVar;
    }

    public final void x() {
        C();
        e eVar = this.f13884o;
        for (f1 A : eVar.f13891a) {
            A.A(eVar);
        }
    }
}
