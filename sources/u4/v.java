package u4;

import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import s4.a;
import s4.e;
import s4.l;
import u4.h;
import u4.m;
import y4.n;

/* compiled from: ResourceCacheGenerator */
public final class v implements h, d.a<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final h.a f15251a;

    /* renamed from: b  reason: collision with root package name */
    public final i<?> f15252b;

    /* renamed from: c  reason: collision with root package name */
    public int f15253c;

    /* renamed from: d  reason: collision with root package name */
    public int f15254d = -1;

    /* renamed from: e  reason: collision with root package name */
    public e f15255e;

    /* renamed from: f  reason: collision with root package name */
    public List<n<File, ?>> f15256f;

    /* renamed from: n  reason: collision with root package name */
    public int f15257n;

    /* renamed from: o  reason: collision with root package name */
    public volatile n.a<?> f15258o;

    /* renamed from: p  reason: collision with root package name */
    public File f15259p;

    /* renamed from: q  reason: collision with root package name */
    public w f15260q;

    public v(i<?> iVar, h.a aVar) {
        this.f15252b = iVar;
        this.f15251a = aVar;
    }

    public final boolean a() {
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList a10 = this.f15252b.a();
        if (a10.isEmpty()) {
            return false;
        }
        List<Class<?>> d10 = this.f15252b.d();
        if (!d10.isEmpty()) {
            while (true) {
                List<n<File, ?>> list = this.f15256f;
                if (list != null) {
                    if (this.f15257n < list.size()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        this.f15258o = null;
                        boolean z13 = false;
                        while (!z13) {
                            if (this.f15257n < this.f15256f.size()) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                break;
                            }
                            List<n<File, ?>> list2 = this.f15256f;
                            int i10 = this.f15257n;
                            this.f15257n = i10 + 1;
                            File file = this.f15259p;
                            i<?> iVar = this.f15252b;
                            this.f15258o = list2.get(i10).b(file, iVar.f15119e, iVar.f15120f, iVar.f15123i);
                            if (this.f15258o != null) {
                                if (this.f15252b.c(this.f15258o.f17487c.a()) != null) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    this.f15258o.f17487c.e(this.f15252b.f15129o, this);
                                    z13 = true;
                                }
                            }
                        }
                        return z13;
                    }
                }
                int i11 = this.f15254d + 1;
                this.f15254d = i11;
                if (i11 >= d10.size()) {
                    int i12 = this.f15253c + 1;
                    this.f15253c = i12;
                    if (i12 >= a10.size()) {
                        return false;
                    }
                    this.f15254d = 0;
                }
                e eVar = (e) a10.get(this.f15253c);
                Class cls = d10.get(this.f15254d);
                l<Z> f10 = this.f15252b.f(cls);
                i<?> iVar2 = this.f15252b;
                this.f15260q = new w(iVar2.f15117c.f4925a, eVar, iVar2.f15128n, iVar2.f15119e, iVar2.f15120f, f10, cls, iVar2.f15123i);
                File q10 = ((m.c) iVar2.f15122h).a().q(this.f15260q);
                this.f15259p = q10;
                if (q10 != null) {
                    this.f15255e = eVar;
                    this.f15256f = this.f15252b.f15117c.f4926b.e(q10);
                    this.f15257n = 0;
                }
            }
        } else if (File.class.equals(this.f15252b.f15125k)) {
            return false;
        } else {
            throw new IllegalStateException("Failed to find any load path from " + this.f15252b.f15118d.getClass() + " to " + this.f15252b.f15125k);
        }
    }

    public final void c(Exception exc) {
        this.f15251a.c(this.f15260q, exc, this.f15258o.f17487c, a.RESOURCE_DISK_CACHE);
    }

    public final void cancel() {
        n.a<?> aVar = this.f15258o;
        if (aVar != null) {
            aVar.f17487c.cancel();
        }
    }

    public final void f(Object obj) {
        this.f15251a.i(this.f15255e, obj, this.f15258o.f17487c, a.RESOURCE_DISK_CACHE, this.f15260q);
    }
}
