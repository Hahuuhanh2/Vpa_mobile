package y4;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;
import s4.h;
import y4.n;

/* compiled from: ResourceLoader */
public final class s<Data> implements n<Integer, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final n<Uri, Data> f17510a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f17511b;

    /* compiled from: ResourceLoader */
    public static final class a implements o<Integer, AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f17512a;

        public a(Resources resources) {
            this.f17512a = resources;
        }

        public final n<Integer, AssetFileDescriptor> a(r rVar) {
            return new s(this.f17512a, rVar.b(Uri.class, AssetFileDescriptor.class));
        }

        public final void b() {
        }
    }

    /* compiled from: ResourceLoader */
    public static class b implements o<Integer, ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f17513a;

        public b(Resources resources) {
            this.f17513a = resources;
        }

        public final n<Integer, ParcelFileDescriptor> a(r rVar) {
            return new s(this.f17513a, rVar.b(Uri.class, ParcelFileDescriptor.class));
        }

        public final void b() {
        }
    }

    /* compiled from: ResourceLoader */
    public static class c implements o<Integer, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f17514a;

        public c(Resources resources) {
            this.f17514a = resources;
        }

        public final n<Integer, InputStream> a(r rVar) {
            return new s(this.f17514a, rVar.b(Uri.class, InputStream.class));
        }

        public final void b() {
        }
    }

    /* compiled from: ResourceLoader */
    public static class d implements o<Integer, Uri> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f17515a;

        public d(Resources resources) {
            this.f17515a = resources;
        }

        public final n<Integer, Uri> a(r rVar) {
            return new s(this.f17515a, u.f17517a);
        }

        public final void b() {
        }
    }

    public s(Resources resources, n<Uri, Data> nVar) {
        this.f17511b = resources;
        this.f17510a = nVar;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        Integer num = (Integer) obj;
        return true;
    }

    public final n.a b(Object obj, int i10, int i11, h hVar) {
        Uri uri;
        Integer num = (Integer) obj;
        try {
            uri = Uri.parse("android.resource://" + this.f17511b.getResourcePackageName(num.intValue()) + '/' + this.f17511b.getResourceTypeName(num.intValue()) + '/' + this.f17511b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            Log.isLoggable("ResourceLoader", 5);
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f17510a.b(uri, i10, i11, hVar);
    }
}
