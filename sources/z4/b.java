package z4;

import al.g0;
import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import n5.d;
import s4.h;
import t4.a;
import y4.n;
import y4.o;
import y4.r;

/* compiled from: MediaStoreImageThumbLoader */
public final class b implements n<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17869a;

    /* compiled from: MediaStoreImageThumbLoader */
    public static class a implements o<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f17870a;

        public a(Context context) {
            this.f17870a = context;
        }

        public final n<Uri, InputStream> a(r rVar) {
            return new b(this.f17870a);
        }

        public final void b() {
        }
    }

    public b(Context context) {
        this.f17869a = context.getApplicationContext();
    }

    public final boolean a(Object obj) {
        Uri uri = (Uri) obj;
        if (!g0.c0(uri) || uri.getPathSegments().contains("video")) {
            return false;
        }
        return true;
    }

    public final n.a b(Object obj, int i10, int i11, h hVar) {
        boolean z10;
        Uri uri = (Uri) obj;
        if (i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE || i10 > 512 || i11 > 384) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return null;
        }
        d dVar = new d(uri);
        Context context = this.f17869a;
        return new n.a(dVar, t4.a.c(context, uri, new a.C0194a(context.getContentResolver())));
    }
}
