package dj;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.f0;
import java.util.Set;
import ng.i;
import p3.l0;
import u8.f;

/* compiled from: DefaultViewModelFactories */
public final class a {

    /* renamed from: dj.a$a  reason: collision with other inner class name */
    /* compiled from: DefaultViewModelFactories */
    public interface C0273a {
        c a();
    }

    /* compiled from: DefaultViewModelFactories */
    public interface b {
        c a();
    }

    /* compiled from: DefaultViewModelFactories */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Set<String> f19943a;

        /* renamed from: b  reason: collision with root package name */
        public final cj.a f19944b;

        public c(f fVar, i iVar) {
            this.f19943a = fVar;
            this.f19944b = iVar;
        }
    }

    public static c a(ComponentActivity componentActivity, f0.b bVar) {
        c a10 = ((C0273a) l0.X(C0273a.class, componentActivity)).a();
        Set<String> set = a10.f19943a;
        bVar.getClass();
        return new c(set, bVar, a10.f19944b);
    }

    public static c b(Fragment fragment, f0.b bVar) {
        c a10 = ((b) l0.X(b.class, fragment)).a();
        Set<String> set = a10.f19943a;
        bVar.getClass();
        return new c(set, bVar, a10.f19944b);
    }
}
