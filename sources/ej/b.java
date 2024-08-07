package ej;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.f0;
import ej.c;
import j7.a;
import ng.l;
import p3.l0;
import r2.v;
import sk.j;

/* compiled from: ActivityRetainedComponentManager */
public final class b implements f0.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f20076a;

    public b(ComponentActivity componentActivity) {
        this.f20076a = componentActivity;
    }

    public final <T extends v> T a(Class<T> cls) {
        Context context = this.f20076a;
        j.f(context, "context");
        return new c.b(new l(((c.a) l0.X(c.a.class, a.F(context.getApplicationContext()))).d().f21577a));
    }

    public final v b(Class cls, s2.b bVar) {
        return a(cls);
    }
}
