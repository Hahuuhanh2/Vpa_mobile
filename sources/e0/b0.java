package e0;

import al.g0;
import android.content.res.Configuration;
import androidx.camera.core.d;
import androidx.fragment.app.FragmentActivity;
import androidx.window.layout.z;
import c0.d1;
import cl.e;
import g0.m;
import java.util.Objects;
import sk.j;
import v1.a;
import z0.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b0 implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8983a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f8984b;

    public /* synthetic */ b0(Object obj, int i10) {
        this.f8983a = i10;
        this.f8984b = obj;
    }

    public final void accept(Object obj) {
        boolean z10;
        switch (this.f8983a) {
            case 0:
                e0 e0Var = (e0) this.f8984b;
                d dVar = (d) obj;
                e0Var.getClass();
                m.a();
                boolean z11 = true;
                if (e0Var.f8996a != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g0.E((String) null, z10);
                Object a10 = dVar.f0().a().a(e0Var.f8996a.f9056f);
                Objects.requireNonNull(a10);
                if (((Integer) a10).intValue() != ((Integer) e0Var.f8996a.f9057g.get(0)).intValue()) {
                    z11 = false;
                }
                g0.E((String) null, z11);
                e0Var.f8997b.f8998a.accept(new g(e0Var.f8996a, dVar));
                e0Var.f8996a = null;
                return;
            case 1:
                ((b.a) this.f8984b).a((d1.c) obj);
                return;
            case 2:
                Configuration configuration = (Configuration) obj;
                ((FragmentActivity) this.f8984b).B.a();
                return;
            default:
                z zVar = (z) obj;
                j.e(zVar, "info");
                ((e) this.f8984b).l(zVar);
                return;
        }
    }
}
