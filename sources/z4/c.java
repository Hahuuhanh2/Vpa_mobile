package z4;

import al.g0;
import android.content.Context;
import android.net.Uri;
import b5.b0;
import java.io.InputStream;
import n5.d;
import s4.h;
import t4.a;
import y4.n;
import y4.o;
import y4.r;

/* compiled from: MediaStoreVideoThumbLoader */
public final class c implements n<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17871a;

    /* compiled from: MediaStoreVideoThumbLoader */
    public static class a implements o<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f17872a;

        public a(Context context) {
            this.f17872a = context;
        }

        public final n<Uri, InputStream> a(r rVar) {
            return new c(this.f17872a);
        }

        public final void b() {
        }
    }

    public c(Context context) {
        this.f17871a = context.getApplicationContext();
    }

    public final boolean a(Object obj) {
        Uri uri = (Uri) obj;
        if (!g0.c0(uri) || !uri.getPathSegments().contains("video")) {
            return false;
        }
        return true;
    }

    public final n.a b(Object obj, int i10, int i11, h hVar) {
        boolean z10;
        Uri uri = (Uri) obj;
        boolean z11 = true;
        if (i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE || i10 > 512 || i11 > 384) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            Long l10 = (Long) hVar.c(b0.f4008d);
            if (l10 == null || l10.longValue() != -1) {
                z11 = false;
            }
            if (z11) {
                d dVar = new d(uri);
                Context context = this.f17871a;
                return new n.a(dVar, t4.a.c(context, uri, new a.b(context.getContentResolver())));
            }
        }
        return null;
    }
}
