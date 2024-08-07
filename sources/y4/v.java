package y4;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.m;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import s4.h;
import y4.n;

/* compiled from: UriLoader */
public final class v<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f17520b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));

    /* renamed from: a  reason: collision with root package name */
    public final c<Data> f17521a;

    /* compiled from: UriLoader */
    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f17522a;

        public a(ContentResolver contentResolver) {
            this.f17522a = contentResolver;
        }

        public final n<Uri, AssetFileDescriptor> a(r rVar) {
            return new v(this);
        }

        public final void b() {
        }

        public final com.bumptech.glide.load.data.d<AssetFileDescriptor> c(Uri uri) {
            return new com.bumptech.glide.load.data.a(0, this.f17522a, uri);
        }
    }

    /* compiled from: UriLoader */
    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f17523a;

        public b(ContentResolver contentResolver) {
            this.f17523a = contentResolver;
        }

        public final n<Uri, ParcelFileDescriptor> a(r rVar) {
            return new v(this);
        }

        public final void b() {
        }

        public final com.bumptech.glide.load.data.d<ParcelFileDescriptor> c(Uri uri) {
            return new com.bumptech.glide.load.data.a(1, this.f17523a, uri);
        }
    }

    /* compiled from: UriLoader */
    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> c(Uri uri);
    }

    /* compiled from: UriLoader */
    public static class d implements o<Uri, InputStream>, c<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f17524a;

        public d(ContentResolver contentResolver) {
            this.f17524a = contentResolver;
        }

        public final n<Uri, InputStream> a(r rVar) {
            return new v(this);
        }

        public final void b() {
        }

        public final com.bumptech.glide.load.data.d<InputStream> c(Uri uri) {
            return new m(this.f17524a, uri);
        }
    }

    public v(c<Data> cVar) {
        this.f17521a = cVar;
    }

    public final boolean a(Object obj) {
        return f17520b.contains(((Uri) obj).getScheme());
    }

    public final n.a b(Object obj, int i10, int i11, h hVar) {
        Uri uri = (Uri) obj;
        return new n.a(new n5.d(uri), this.f17521a.c(uri));
    }
}
