package u4;

import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;
import s4.a;
import u4.h;
import u4.m;
import y4.n;

/* compiled from: DataCacheGenerator */
public final class e implements h, d.a<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final List<s4.e> f15101a;

    /* renamed from: b  reason: collision with root package name */
    public final i<?> f15102b;

    /* renamed from: c  reason: collision with root package name */
    public final h.a f15103c;

    /* renamed from: d  reason: collision with root package name */
    public int f15104d = -1;

    /* renamed from: e  reason: collision with root package name */
    public s4.e f15105e;

    /* renamed from: f  reason: collision with root package name */
    public List<n<File, ?>> f15106f;

    /* renamed from: n  reason: collision with root package name */
    public int f15107n;

    /* renamed from: o  reason: collision with root package name */
    public volatile n.a<?> f15108o;

    /* renamed from: p  reason: collision with root package name */
    public File f15109p;

    public e(List<s4.e> list, i<?> iVar, h.a aVar) {
        this.f15101a = list;
        this.f15102b = iVar;
        this.f15103c = aVar;
    }

    public final boolean a() {
        boolean z10;
        boolean z11;
        boolean z12;
        while (true) {
            List<n<File, ?>> list = this.f15106f;
            if (list != null) {
                if (this.f15107n < list.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f15108o = null;
                    boolean z13 = false;
                    while (!z13) {
                        if (this.f15107n < this.f15106f.size()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            break;
                        }
                        List<n<File, ?>> list2 = this.f15106f;
                        int i10 = this.f15107n;
                        this.f15107n = i10 + 1;
                        File file = this.f15109p;
                        i<?> iVar = this.f15102b;
                        this.f15108o = list2.get(i10).b(file, iVar.f15119e, iVar.f15120f, iVar.f15123i);
                        if (this.f15108o != null) {
                            if (this.f15102b.c(this.f15108o.f17487c.a()) != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                this.f15108o.f17487c.e(this.f15102b.f15129o, this);
                                z13 = true;
                            }
                        }
                    }
                    return z13;
                }
            }
            int i11 = this.f15104d + 1;
            this.f15104d = i11;
            if (i11 >= this.f15101a.size()) {
                return false;
            }
            s4.e eVar = this.f15101a.get(this.f15104d);
            i<?> iVar2 = this.f15102b;
            File q10 = ((m.c) iVar2.f15122h).a().q(new f(eVar, iVar2.f15128n));
            this.f15109p = q10;
            if (q10 != null) {
                this.f15105e = eVar;
                this.f15106f = this.f15102b.f15117c.f4926b.e(q10);
                this.f15107n = 0;
            }
        }
    }

    public final void c(Exception exc) {
        this.f15103c.c(this.f15105e, exc, this.f15108o.f17487c, a.DATA_DISK_CACHE);
    }

    public final void cancel() {
        n.a<?> aVar = this.f15108o;
        if (aVar != null) {
            aVar.f17487c.cancel();
        }
    }

    public final void f(Object obj) {
        this.f15103c.i(this.f15105e, obj, this.f15108o.f17487c, a.DATA_DISK_CACHE, this.f15105e);
    }
}
