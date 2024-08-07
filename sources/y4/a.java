package y4;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.h;
import com.bumptech.glide.load.data.l;
import java.io.InputStream;
import y4.n;

/* compiled from: AssetUriLoader */
public final class a<Data> implements n<Uri, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final AssetManager f17444a;

    /* renamed from: b  reason: collision with root package name */
    public final C0229a<Data> f17445b;

    /* renamed from: y4.a$a  reason: collision with other inner class name */
    /* compiled from: AssetUriLoader */
    public interface C0229a<Data> {
        d<Data> c(AssetManager assetManager, String str);
    }

    /* compiled from: AssetUriLoader */
    public static class b implements o<Uri, AssetFileDescriptor>, C0229a<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f17446a;

        public b(AssetManager assetManager) {
            this.f17446a = assetManager;
        }

        public final n<Uri, AssetFileDescriptor> a(r rVar) {
            return new a(this.f17446a, this);
        }

        public final void b() {
        }

        public final d<AssetFileDescriptor> c(AssetManager assetManager, String str) {
            return new h(assetManager, str);
        }
    }

    /* compiled from: AssetUriLoader */
    public static class c implements o<Uri, InputStream>, C0229a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f17447a;

        public c(AssetManager assetManager) {
            this.f17447a = assetManager;
        }

        public final n<Uri, InputStream> a(r rVar) {
            return new a(this.f17447a, this);
        }

        public final void b() {
        }

        public final d<InputStream> c(AssetManager assetManager, String str) {
            return new l(assetManager, str);
        }
    }

    public a(AssetManager assetManager, C0229a<Data> aVar) {
        this.f17444a = assetManager;
        this.f17445b = aVar;
    }

    public final boolean a(Object obj) {
        Uri uri = (Uri) obj;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    public final n.a b(Object obj, int i10, int i11, s4.h hVar) {
        Uri uri = (Uri) obj;
        return new n.a(new n5.d(uri), this.f17445b.c(this.f17444a, uri.toString().substring(22)));
    }
}
