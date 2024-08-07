package y4;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import s4.h;
import y4.n;

/* compiled from: StringLoader */
public final class t<Data> implements n<String, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final n<Uri, Data> f17516a;

    /* compiled from: StringLoader */
    public static final class a implements o<String, AssetFileDescriptor> {
        public final n<String, AssetFileDescriptor> a(r rVar) {
            return new t(rVar.b(Uri.class, AssetFileDescriptor.class));
        }

        public final void b() {
        }
    }

    /* compiled from: StringLoader */
    public static class b implements o<String, ParcelFileDescriptor> {
        public final n<String, ParcelFileDescriptor> a(r rVar) {
            return new t(rVar.b(Uri.class, ParcelFileDescriptor.class));
        }

        public final void b() {
        }
    }

    /* compiled from: StringLoader */
    public static class c implements o<String, InputStream> {
        public final n<String, InputStream> a(r rVar) {
            return new t(rVar.b(Uri.class, InputStream.class));
        }

        public final void b() {
        }
    }

    public t(n<Uri, Data> nVar) {
        this.f17516a = nVar;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        String str = (String) obj;
        return true;
    }

    public final n.a b(Object obj, int i10, int i11, h hVar) {
        Uri uri;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            uri = null;
        } else if (str.charAt(0) == '/') {
            uri = Uri.fromFile(new File(str));
        } else {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() == null) {
                uri = Uri.fromFile(new File(str));
            } else {
                uri = parse;
            }
        }
        if (uri == null || !this.f17516a.a(uri)) {
            return null;
        }
        return this.f17516a.b(uri, i10, i11, hVar);
    }
}
