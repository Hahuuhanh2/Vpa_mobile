package z1;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* compiled from: InputContentInfoCompat */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final c f17808a;

    /* compiled from: InputContentInfoCompat */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f17810a;

        /* renamed from: b  reason: collision with root package name */
        public final ClipDescription f17811b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri f17812c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f17810a = uri;
            this.f17811b = clipDescription;
            this.f17812c = uri2;
        }

        public final Uri a() {
            return this.f17810a;
        }

        public final void b() {
        }

        public final Uri c() {
            return this.f17812c;
        }

        public final ClipDescription d() {
            return this.f17811b;
        }

        public final Object e() {
            return null;
        }
    }

    /* compiled from: InputContentInfoCompat */
    public interface c {
        Uri a();

        void b();

        Uri c();

        ClipDescription d();

        Object e();
    }

    public e(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f17808a = new a(uri, clipDescription, uri2);
        } else {
            this.f17808a = new b(uri, clipDescription, uri2);
        }
    }

    /* compiled from: InputContentInfoCompat */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final InputContentInfo f17809a;

        public a(Object obj) {
            this.f17809a = (InputContentInfo) obj;
        }

        public final Uri a() {
            return this.f17809a.getContentUri();
        }

        public final void b() {
            this.f17809a.requestPermission();
        }

        public final Uri c() {
            return this.f17809a.getLinkUri();
        }

        public final ClipDescription d() {
            return this.f17809a.getDescription();
        }

        public final Object e() {
            return this.f17809a;
        }

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f17809a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public e(a aVar) {
        this.f17808a = aVar;
    }
}
