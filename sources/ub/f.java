package ub;

import android.content.Context;
import ca.b;
import ca.m;

/* compiled from: LibraryVersionComponent */
public final class f {

    /* compiled from: LibraryVersionComponent */
    public interface a<T> {
        String d(Context context);
    }

    public static b<?> a(String str, String str2) {
        a aVar = new a(str, str2);
        b.a<d> b10 = b.b(d.class);
        b10.f4618e = 1;
        b10.f4619f = new ca.a(aVar, 0);
        return b10.b();
    }

    public static b<?> b(String str, a<Context> aVar) {
        b.a<d> b10 = b.b(d.class);
        b10.f4618e = 1;
        b10.a(m.b(Context.class));
        b10.f4619f = new e(str, 0, aVar);
        return b10.b();
    }
}
