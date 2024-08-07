package dj;

import androidx.lifecycle.f0;
import java.util.Set;
import r2.v;
import u8.k;

/* compiled from: HiltViewModelFactory */
public final class c implements f0.b {

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f19946a;

    /* renamed from: b  reason: collision with root package name */
    public final f0.b f19947b;

    /* renamed from: c  reason: collision with root package name */
    public final a f19948c;

    /* compiled from: HiltViewModelFactory */
    public class a extends androidx.lifecycle.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cj.a f19949a;

        public a(cj.a aVar) {
            this.f19949a = aVar;
        }
    }

    /* compiled from: HiltViewModelFactory */
    public interface b {
        k a();
    }

    public c(Set<String> set, f0.b bVar, cj.a aVar) {
        this.f19946a = set;
        this.f19947b = bVar;
        this.f19948c = new a(aVar);
    }

    public final <T extends v> T a(Class<T> cls) {
        if (!this.f19946a.contains(cls.getName())) {
            return this.f19947b.a(cls);
        }
        this.f19948c.a(cls);
        throw null;
    }

    public final v b(Class cls, s2.b bVar) {
        if (this.f19946a.contains(cls.getName())) {
            return this.f19948c.b(cls, bVar);
        }
        return this.f19947b.b(cls, bVar);
    }
}
