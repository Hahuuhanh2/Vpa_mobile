package w1;

import al.g0;
import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: ContentInfoCompat */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final e f16284a;

    /* compiled from: ContentInfoCompat */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo.Builder f16285a;

        public a(ClipData clipData, int i10) {
            this.f16285a = new ContentInfo.Builder(clipData, i10);
        }

        public final void a(Uri uri) {
            this.f16285a.setLinkUri(uri);
        }

        public final void b(int i10) {
            this.f16285a.setFlags(i10);
        }

        public final c build() {
            return new c(new d(this.f16285a.build()));
        }

        public final void setExtras(Bundle bundle) {
            this.f16285a.setExtras(bundle);
        }
    }

    /* compiled from: ContentInfoCompat */
    public interface b {
        void a(Uri uri);

        void b(int i10);

        c build();

        void setExtras(Bundle bundle);
    }

    /* renamed from: w1.c$c  reason: collision with other inner class name */
    /* compiled from: ContentInfoCompat */
    public static final class C0211c implements b {

        /* renamed from: a  reason: collision with root package name */
        public ClipData f16286a;

        /* renamed from: b  reason: collision with root package name */
        public int f16287b;

        /* renamed from: c  reason: collision with root package name */
        public int f16288c;

        /* renamed from: d  reason: collision with root package name */
        public Uri f16289d;

        /* renamed from: e  reason: collision with root package name */
        public Bundle f16290e;

        public C0211c(ClipData clipData, int i10) {
            this.f16286a = clipData;
            this.f16287b = i10;
        }

        public final void a(Uri uri) {
            this.f16289d = uri;
        }

        public final void b(int i10) {
            this.f16288c = i10;
        }

        public final c build() {
            return new c(new f(this));
        }

        public final void setExtras(Bundle bundle) {
            this.f16290e = bundle;
        }
    }

    /* compiled from: ContentInfoCompat */
    public static final class d implements e {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo f16291a;

        public d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f16291a = contentInfo;
        }

        public final int a() {
            return this.f16291a.getSource();
        }

        public final ClipData b() {
            return this.f16291a.getClip();
        }

        public final int c() {
            return this.f16291a.getFlags();
        }

        public final ContentInfo d() {
            return this.f16291a;
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("ContentInfoCompat{");
            q10.append(this.f16291a);
            q10.append("}");
            return q10.toString();
        }
    }

    /* compiled from: ContentInfoCompat */
    public interface e {
        int a();

        ClipData b();

        int c();

        ContentInfo d();
    }

    /* compiled from: ContentInfoCompat */
    public static final class f implements e {

        /* renamed from: a  reason: collision with root package name */
        public final ClipData f16292a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16293b;

        /* renamed from: c  reason: collision with root package name */
        public final int f16294c;

        /* renamed from: d  reason: collision with root package name */
        public final Uri f16295d;

        /* renamed from: e  reason: collision with root package name */
        public final Bundle f16296e;

        public f(C0211c cVar) {
            ClipData clipData = cVar.f16286a;
            clipData.getClass();
            this.f16292a = clipData;
            int i10 = cVar.f16287b;
            g0.A(i10, 0, 5, "source");
            this.f16293b = i10;
            int i11 = cVar.f16288c;
            if ((i11 & 1) == i11) {
                this.f16294c = i11;
                this.f16295d = cVar.f16289d;
                this.f16296e = cVar.f16290e;
                return;
            }
            StringBuilder q10 = android.support.v4.media.a.q("Requested flags 0x");
            q10.append(Integer.toHexString(i11));
            q10.append(", but only 0x");
            q10.append(Integer.toHexString(1));
            q10.append(" are allowed");
            throw new IllegalArgumentException(q10.toString());
        }

        public final int a() {
            return this.f16293b;
        }

        public final ClipData b() {
            return this.f16292a;
        }

        public final int c() {
            return this.f16294c;
        }

        public final ContentInfo d() {
            return null;
        }

        public final String toString() {
            String str;
            String str2;
            String str3;
            StringBuilder q10 = android.support.v4.media.a.q("ContentInfoCompat{clip=");
            q10.append(this.f16292a.getDescription());
            q10.append(", source=");
            int i10 = this.f16293b;
            if (i10 == 0) {
                str = "SOURCE_APP";
            } else if (i10 == 1) {
                str = "SOURCE_CLIPBOARD";
            } else if (i10 == 2) {
                str = "SOURCE_INPUT_METHOD";
            } else if (i10 == 3) {
                str = "SOURCE_DRAG_AND_DROP";
            } else if (i10 == 4) {
                str = "SOURCE_AUTOFILL";
            } else if (i10 != 5) {
                str = String.valueOf(i10);
            } else {
                str = "SOURCE_PROCESS_TEXT";
            }
            q10.append(str);
            q10.append(", flags=");
            int i11 = this.f16294c;
            if ((i11 & 1) != 0) {
                str2 = "FLAG_CONVERT_TO_PLAIN_TEXT";
            } else {
                str2 = String.valueOf(i11);
            }
            q10.append(str2);
            String str4 = "";
            if (this.f16295d == null) {
                str3 = str4;
            } else {
                StringBuilder q11 = android.support.v4.media.a.q(", hasLinkUri(");
                q11.append(this.f16295d.toString().length());
                q11.append(")");
                str3 = q11.toString();
            }
            q10.append(str3);
            if (this.f16296e != null) {
                str4 = ", hasExtras";
            }
            return android.support.v4.media.a.o(q10, str4, "}");
        }
    }

    public c(e eVar) {
        this.f16284a = eVar;
    }

    public final String toString() {
        return this.f16284a.toString();
    }
}
