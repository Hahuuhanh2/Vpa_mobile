package v;

import al.g0;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Size;
import androidx.lifecycle.p;
import b0.d;
import c0.e;
import c0.p0;
import ea.c;
import f0.f;
import f0.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p3.l0;
import r2.o;
import w.t;
import w.z;

/* compiled from: Camera2CameraInfoImpl */
public final class x implements q {

    /* renamed from: a  reason: collision with root package name */
    public final String f15910a;

    /* renamed from: b  reason: collision with root package name */
    public final t f15911b;

    /* renamed from: c  reason: collision with root package name */
    public final d f15912c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f15913d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public o f15914e;

    /* renamed from: f  reason: collision with root package name */
    public a<Integer> f15915f = null;

    /* renamed from: g  reason: collision with root package name */
    public final a<c0.q> f15916g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f15917h = null;

    /* renamed from: i  reason: collision with root package name */
    public final z.d f15918i;

    /* compiled from: Camera2CameraInfoImpl */
    public static class a<T> extends o<T> {

        /* renamed from: m  reason: collision with root package name */
        public p<T> f15919m;

        /* renamed from: n  reason: collision with root package name */
        public final T f15920n;

        public a(T t10) {
            this.f15920n = t10;
        }

        public final T d() {
            p<T> pVar = this.f15919m;
            if (pVar == null) {
                return this.f15920n;
            }
            return pVar.d();
        }

        public final void l(r2.p pVar) {
            o.a l10;
            p<T> pVar2 = this.f15919m;
            if (!(pVar2 == null || (l10 = this.f14484l.l(pVar2)) == null)) {
                l10.f14485a.i(l10);
            }
            this.f15919m = pVar;
            boolean z10 = false;
            w wVar = new w(this, 0);
            if (pVar != null) {
                o.a aVar = new o.a(pVar, wVar);
                o.a i10 = this.f14484l.i(pVar, aVar);
                if (i10 != null && i10.f14486b != wVar) {
                    throw new IllegalArgumentException("This source was already added with the different observer");
                } else if (i10 == null) {
                    if (this.f2797c > 0) {
                        z10 = true;
                    }
                    if (z10) {
                        aVar.a();
                    }
                }
            } else {
                throw new NullPointerException("source cannot be null");
            }
        }
    }

    public x(String str, z zVar) {
        str.getClass();
        this.f15910a = str;
        t b10 = zVar.b(str);
        this.f15911b = b10;
        this.f15912c = new d(this);
        this.f15918i = l0.Y(b10);
        new HashMap();
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            p0.g("Camera2EncoderProfilesProvider");
        }
        this.f15916g = new a<>(new c0.d(5, (e) null));
    }

    public final int a() {
        return j(0);
    }

    public final String b() {
        return this.f15910a;
    }

    public final void c(f fVar) {
        synchronized (this.f15913d) {
            o oVar = this.f15914e;
            if (oVar == null) {
                ArrayList arrayList = this.f15917h;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((Pair) it.next()).first == fVar) {
                            it.remove();
                        }
                    }
                    return;
                }
                return;
            }
            oVar.f15757c.execute(new f(0, oVar, fVar));
        }
    }

    public final p<Integer> d() {
        synchronized (this.f15913d) {
            o oVar = this.f15914e;
            if (oVar == null) {
                if (this.f15915f == null) {
                    this.f15915f = new a<>(0);
                }
                a<Integer> aVar = this.f15915f;
                return aVar;
            }
            a<Integer> aVar2 = this.f15915f;
            if (aVar2 != null) {
                return aVar2;
            }
            r2.p<Integer> pVar = oVar.f15764j.f15677b;
            return pVar;
        }
    }

    public final q e() {
        return this;
    }

    public final int f() {
        boolean z10;
        Integer num = (Integer) this.f15911b.a(CameraCharacteristics.LENS_FACING);
        if (num != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0.y("Unable to get the lens facing of the camera.", z10);
        int intValue = num.intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue == 1) {
            return 1;
        }
        if (intValue == 2) {
            return 2;
        }
        throw new IllegalArgumentException(v.d("The given lens facing integer: ", intValue, " can not be recognized."));
    }

    public final void g(h0.a aVar, r0.d dVar) {
        synchronized (this.f15913d) {
            o oVar = this.f15914e;
            if (oVar == null) {
                if (this.f15917h == null) {
                    this.f15917h = new ArrayList();
                }
                this.f15917h.add(new Pair(dVar, aVar));
                return;
            }
            oVar.f15757c.execute(new i(0, oVar, aVar, dVar));
        }
    }

    public final String h() {
        if (n() == 2) {
            return "androidx.camera.camera2.legacy";
        }
        return "androidx.camera.camera2";
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.util.Size> i(int r4) {
        /*
            r3 = this;
            w.t r0 = r3.f15911b
            w.e0 r0 = r0.b()
            java.util.HashMap r1 = r0.f16203d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x0034
            java.util.HashMap r1 = r0.f16203d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = r1.get(r2)
            android.util.Size[] r1 = (android.util.Size[]) r1
            if (r1 != 0) goto L_0x0021
            goto L_0x0059
        L_0x0021:
            java.util.HashMap r0 = r0.f16203d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            android.util.Size[] r4 = (android.util.Size[]) r4
            java.lang.Object r4 = r4.clone()
            android.util.Size[] r4 = (android.util.Size[]) r4
            goto L_0x005a
        L_0x0034:
            w.f0 r1 = r0.f16200a
            android.hardware.camera2.params.StreamConfigurationMap r1 = r1.f16212a
            android.util.Size[] r1 = w.g0.a.a(r1, r4)
            if (r1 == 0) goto L_0x0047
            int r2 = r1.length
            if (r2 <= 0) goto L_0x0047
            z.k r2 = r0.f16201b
            android.util.Size[] r1 = r2.a(r1, r4)
        L_0x0047:
            java.util.HashMap r0 = r0.f16203d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r4, r1)
            if (r1 == 0) goto L_0x0059
            java.lang.Object r4 = r1.clone()
            android.util.Size[] r4 = (android.util.Size[]) r4
            goto L_0x005a
        L_0x0059:
            r4 = 0
        L_0x005a:
            if (r4 == 0) goto L_0x0061
            java.util.List r4 = java.util.Arrays.asList(r4)
            goto L_0x0065
        L_0x0061:
            java.util.List r4 = java.util.Collections.emptyList()
        L_0x0065:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v.x.i(int):java.util.List");
    }

    public final int j(int i10) {
        Integer num = (Integer) this.f15911b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        int intValue = num.intValue();
        int M0 = l0.M0(i10);
        boolean z10 = true;
        if (1 != f()) {
            z10 = false;
        }
        return l0.c0(z10, M0, intValue);
    }

    public final boolean k() {
        t tVar = this.f15911b;
        Objects.requireNonNull(tVar);
        return z.e.a(new c(tVar, 0));
    }

    public final z.d l() {
        return this.f15918i;
    }

    public final List<Size> m(int i10) {
        Size[] a10 = this.f15911b.b().a(i10);
        if (a10 != null) {
            return Arrays.asList(a10);
        }
        return Collections.emptyList();
    }

    public final int n() {
        Integer num = (Integer) this.f15911b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue();
    }

    public final void o(o oVar) {
        synchronized (this.f15913d) {
            try {
                this.f15914e = oVar;
                a<Integer> aVar = this.f15915f;
                if (aVar != null) {
                    aVar.l(oVar.f15764j.f15677b);
                }
                ArrayList arrayList = this.f15917h;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        o oVar2 = this.f15914e;
                        oVar2.f15757c.execute(new i(0, oVar2, (Executor) pair.second, (f) pair.first));
                    }
                    this.f15917h = null;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        int n10 = n();
        if (!(n10 == 0 || n10 == 1 || n10 == 2)) {
        }
        p0.e(4, p0.f("Camera2CameraInfo"));
    }
}
