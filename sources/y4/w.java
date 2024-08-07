package y4;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import s4.h;
import y4.n;

/* compiled from: UrlUriLoader */
public final class w<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f17525b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a  reason: collision with root package name */
    public final n<f, Data> f17526a;

    /* compiled from: UrlUriLoader */
    public static class a implements o<Uri, InputStream> {
        public final n<Uri, InputStream> a(r rVar) {
            return new w(rVar.b(f.class, InputStream.class));
        }

        public final void b() {
        }
    }

    public w(n<f, Data> nVar) {
        this.f17526a = nVar;
    }

    public final boolean a(Object obj) {
        return f17525b.contains(((Uri) obj).getScheme());
    }

    public final n.a b(Object obj, int i10, int i11, h hVar) {
        return this.f17526a.b(new f(((Uri) obj).toString(), g.f17469m), i10, i11, hVar);
    }
}
