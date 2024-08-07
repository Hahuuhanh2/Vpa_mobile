package p3;

import android.content.Context;
import c3.c;
import d3.d;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class y implements c.C0050c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f14038a;

    public /* synthetic */ y(Context context) {
        this.f14038a = context;
    }

    public final c c(c.b bVar) {
        boolean z10;
        Context context = this.f14038a;
        j.f(context, "$context");
        String str = bVar.f4557b;
        c.a aVar = bVar.f4558c;
        j.f(aVar, "callback");
        if (str == null || str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (true ^ z10) {
            return new d(context, str, aVar, true, true);
        }
        throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
    }
}
