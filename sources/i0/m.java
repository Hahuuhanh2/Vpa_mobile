package i0;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import v8.a;
import z0.b;

/* compiled from: ListFuture */
public final class m<V> implements a<List<V>> {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends a<? extends V>> f10919a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f10920b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10921c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicInteger f10922d;

    /* renamed from: e  reason: collision with root package name */
    public final b.d f10923e = b.a(new j(this));

    /* renamed from: f  reason: collision with root package name */
    public b.a<List<V>> f10924f;

    public m(ArrayList arrayList, boolean z10, h0.a aVar) {
        this.f10919a = arrayList;
        this.f10920b = new ArrayList(arrayList.size());
        this.f10921c = z10;
        this.f10922d = new AtomicInteger(arrayList.size());
        b(new k(this), j7.a.x());
        if (this.f10919a.isEmpty()) {
            this.f10924f.a(new ArrayList(this.f10920b));
            return;
        }
        for (int i10 = 0; i10 < this.f10919a.size(); i10++) {
            this.f10920b.add((Object) null);
        }
        List<? extends a<? extends V>> list = this.f10919a;
        for (int i11 = 0; i11 < list.size(); i11++) {
            a aVar2 = (a) list.get(i11);
            aVar2.b(new l(this, i11, aVar2), aVar);
        }
    }

    public final void b(Runnable runnable, Executor executor) {
        this.f10923e.f17803b.b(runnable, executor);
    }

    public final boolean cancel(boolean z10) {
        List<? extends a<? extends V>> list = this.f10919a;
        if (list != null) {
            for (a cancel : list) {
                cancel.cancel(z10);
            }
        }
        return this.f10923e.cancel(z10);
    }

    public final Object get(long j10, TimeUnit timeUnit) {
        return (List) this.f10923e.f17803b.get(j10, timeUnit);
    }

    public final boolean isCancelled() {
        return this.f10923e.isCancelled();
    }

    public final boolean isDone() {
        return this.f10923e.isDone();
    }

    public final Object get() {
        List<? extends a<? extends V>> list = this.f10919a;
        if (list != null && !isDone()) {
            loop0:
            for (a aVar : list) {
                while (true) {
                    if (!aVar.isDone()) {
                        try {
                            aVar.get();
                        } catch (Error e10) {
                            throw e10;
                        } catch (InterruptedException e11) {
                            throw e11;
                        } catch (Throwable unused) {
                            if (this.f10921c) {
                                break loop0;
                            }
                        }
                    }
                }
            }
        }
        return (List) this.f10923e.get();
    }
}
