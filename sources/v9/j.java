package v9;

import android.content.Context;
import eb.a;
import m9.d;
import wa.c;
import xa.f;
import za.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16112a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f16113b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f16114c;

    public /* synthetic */ j(int i10, Context context, String str) {
        this.f16112a = i10;
        this.f16113b = context;
        this.f16114c = str;
    }

    public /* synthetic */ j(d dVar, Context context) {
        this.f16112a = 2;
        this.f16114c = dVar;
        this.f16113b = context;
    }

    public final Object get() {
        switch (this.f16112a) {
            case 0:
                return this.f16113b.getSharedPreferences((String) this.f16114c, 0);
            case 1:
                return new f(this.f16113b, (String) this.f16114c);
            default:
                d dVar = (d) this.f16114c;
                Context context = this.f16113b;
                Object obj = d.f13216k;
                return new a(context, dVar.f(), (c) dVar.f13221d.a(c.class));
        }
    }
}
