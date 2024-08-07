package f6;

import android.util.Base64;
import c6.d;
import f6.j;

/* compiled from: TransportContext */
public abstract class s {

    /* compiled from: TransportContext */
    public static abstract class a {
    }

    public static j.a a() {
        j.a aVar = new j.a();
        aVar.c(d.DEFAULT);
        return aVar;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract d d();

    public final j e(d dVar) {
        j.a a10 = a();
        a10.b(b());
        a10.c(dVar);
        a10.f10006b = c();
        return a10.a();
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        if (c() == null) {
            str = "";
        } else {
            str = Base64.encodeToString(c(), 2);
        }
        objArr[2] = str;
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
