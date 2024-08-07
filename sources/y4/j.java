package y4;

import al.g0;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import s4.h;
import y4.n;

/* compiled from: MediaStoreFileLoader */
public final class j implements n<Uri, File> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17475a;

    /* compiled from: MediaStoreFileLoader */
    public static final class a implements o<Uri, File> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f17476a;

        public a(Context context) {
            this.f17476a = context;
        }

        public final n<Uri, File> a(r rVar) {
            return new j(this.f17476a);
        }

        public final void b() {
        }
    }

    /* compiled from: MediaStoreFileLoader */
    public static class b implements d<File> {

        /* renamed from: c  reason: collision with root package name */
        public static final String[] f17477c = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final Context f17478a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f17479b;

        public b(Context context, Uri uri) {
            this.f17478a = context;
            this.f17479b = uri;
        }

        public final Class<File> a() {
            return File.class;
        }

        public final void b() {
        }

        public final void cancel() {
        }

        public final s4.a d() {
            return s4.a.LOCAL;
        }

        public final void e(com.bumptech.glide.j jVar, d.a<? super File> aVar) {
            Cursor query = this.f17478a.getContentResolver().query(this.f17479b, f17477c, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                StringBuilder q10 = android.support.v4.media.a.q("Failed to find file path for: ");
                q10.append(this.f17479b);
                aVar.c(new FileNotFoundException(q10.toString()));
                return;
            }
            aVar.f(new File(str));
        }
    }

    public j(Context context) {
        this.f17475a = context;
    }

    public final boolean a(Object obj) {
        return g0.c0((Uri) obj);
    }

    public final n.a b(Object obj, int i10, int i11, h hVar) {
        Uri uri = (Uri) obj;
        return new n.a(new n5.d(uri), new b(this.f17475a, uri));
    }
}
