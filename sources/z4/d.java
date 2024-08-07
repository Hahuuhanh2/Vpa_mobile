package z4;

import al.g0;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import s4.h;
import y4.n;
import y4.o;
import y4.r;

/* compiled from: QMediaStoreUriLoader */
public final class d<DataT> implements n<Uri, DataT> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17873a;

    /* renamed from: b  reason: collision with root package name */
    public final n<File, DataT> f17874b;

    /* renamed from: c  reason: collision with root package name */
    public final n<Uri, DataT> f17875c;

    /* renamed from: d  reason: collision with root package name */
    public final Class<DataT> f17876d;

    /* compiled from: QMediaStoreUriLoader */
    public static abstract class a<DataT> implements o<Uri, DataT> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f17877a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<DataT> f17878b;

        public a(Context context, Class<DataT> cls) {
            this.f17877a = context;
            this.f17878b = cls;
        }

        public final n<Uri, DataT> a(r rVar) {
            return new d(this.f17877a, rVar.b(File.class, this.f17878b), rVar.b(Uri.class, this.f17878b), this.f17878b);
        }

        public final void b() {
        }
    }

    /* compiled from: QMediaStoreUriLoader */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: z4.d$d  reason: collision with other inner class name */
    /* compiled from: QMediaStoreUriLoader */
    public static final class C0249d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: r  reason: collision with root package name */
        public static final String[] f17879r = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final Context f17880a;

        /* renamed from: b  reason: collision with root package name */
        public final n<File, DataT> f17881b;

        /* renamed from: c  reason: collision with root package name */
        public final n<Uri, DataT> f17882c;

        /* renamed from: d  reason: collision with root package name */
        public final Uri f17883d;

        /* renamed from: e  reason: collision with root package name */
        public final int f17884e;

        /* renamed from: f  reason: collision with root package name */
        public final int f17885f;

        /* renamed from: n  reason: collision with root package name */
        public final h f17886n;

        /* renamed from: o  reason: collision with root package name */
        public final Class<DataT> f17887o;

        /* renamed from: p  reason: collision with root package name */
        public volatile boolean f17888p;

        /* renamed from: q  reason: collision with root package name */
        public volatile com.bumptech.glide.load.data.d<DataT> f17889q;

        public C0249d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i10, int i11, h hVar, Class<DataT> cls) {
            this.f17880a = context.getApplicationContext();
            this.f17881b = nVar;
            this.f17882c = nVar2;
            this.f17883d = uri;
            this.f17884e = i10;
            this.f17885f = i11;
            this.f17886n = hVar;
            this.f17887o = cls;
        }

        public final Class<DataT> a() {
            return this.f17887o;
        }

        public final void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f17889q;
            if (dVar != null) {
                dVar.b();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bumptech.glide.load.data.d<DataT> c() {
            /*
                r9 = this;
                boolean r0 = android.os.Environment.isExternalStorageLegacy()
                r1 = 0
                if (r0 == 0) goto L_0x007e
                y4.n<java.io.File, DataT> r0 = r9.f17881b
                android.net.Uri r8 = r9.f17883d
                android.content.Context r2 = r9.f17880a     // Catch:{ all -> 0x0077 }
                android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x0077 }
                java.lang.String[] r4 = f17879r     // Catch:{ all -> 0x0077 }
                r5 = 0
                r6 = 0
                r7 = 0
                r3 = r8
                android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0077 }
                if (r2 == 0) goto L_0x005d
                boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x0074 }
                if (r3 == 0) goto L_0x005d
                java.lang.String r3 = "_data"
                int r3 = r2.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = r2.getString(r3)     // Catch:{ all -> 0x0074 }
                boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0074 }
                if (r4 != 0) goto L_0x0046
                java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0074 }
                r4.<init>(r3)     // Catch:{ all -> 0x0074 }
                r2.close()
                int r2 = r9.f17884e
                int r3 = r9.f17885f
                s4.h r5 = r9.f17886n
                y4.n$a r0 = r0.b(r4, r2, r3, r5)
                goto L_0x00a2
            L_0x0046:
                java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0074 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
                r1.<init>()     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = "File path was empty in media store for: "
                r1.append(r3)     // Catch:{ all -> 0x0074 }
                r1.append(r8)     // Catch:{ all -> 0x0074 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0074 }
                r0.<init>(r1)     // Catch:{ all -> 0x0074 }
                throw r0     // Catch:{ all -> 0x0074 }
            L_0x005d:
                java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0074 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
                r1.<init>()     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = "Failed to media store entry for: "
                r1.append(r3)     // Catch:{ all -> 0x0074 }
                r1.append(r8)     // Catch:{ all -> 0x0074 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0074 }
                r0.<init>(r1)     // Catch:{ all -> 0x0074 }
                throw r0     // Catch:{ all -> 0x0074 }
            L_0x0074:
                r0 = move-exception
                r1 = r2
                goto L_0x0078
            L_0x0077:
                r0 = move-exception
            L_0x0078:
                if (r1 == 0) goto L_0x007d
                r1.close()
            L_0x007d:
                throw r0
            L_0x007e:
                android.content.Context r0 = r9.f17880a
                java.lang.String r2 = "android.permission.ACCESS_MEDIA_LOCATION"
                int r0 = r0.checkSelfPermission(r2)
                if (r0 != 0) goto L_0x008a
                r0 = 1
                goto L_0x008b
            L_0x008a:
                r0 = 0
            L_0x008b:
                if (r0 == 0) goto L_0x0094
                android.net.Uri r0 = r9.f17883d
                android.net.Uri r0 = android.provider.MediaStore.setRequireOriginal(r0)
                goto L_0x0096
            L_0x0094:
                android.net.Uri r0 = r9.f17883d
            L_0x0096:
                y4.n<android.net.Uri, DataT> r2 = r9.f17882c
                int r3 = r9.f17884e
                int r4 = r9.f17885f
                s4.h r5 = r9.f17886n
                y4.n$a r0 = r2.b(r0, r3, r4, r5)
            L_0x00a2:
                if (r0 == 0) goto L_0x00a6
                com.bumptech.glide.load.data.d<Data> r1 = r0.f17487c
            L_0x00a6:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: z4.d.C0249d.c():com.bumptech.glide.load.data.d");
        }

        public final void cancel() {
            this.f17888p = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f17889q;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        public final s4.a d() {
            return s4.a.LOCAL;
        }

        public final void e(j jVar, d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> c10 = c();
                if (c10 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f17883d));
                    return;
                }
                this.f17889q = c10;
                if (this.f17888p) {
                    cancel();
                } else {
                    c10.e(jVar, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.c(e10);
            }
        }
    }

    public d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f17873a = context.getApplicationContext();
        this.f17874b = nVar;
        this.f17875c = nVar2;
        this.f17876d = cls;
    }

    public final boolean a(Object obj) {
        Uri uri = (Uri) obj;
        if (Build.VERSION.SDK_INT < 29 || !g0.c0(uri)) {
            return false;
        }
        return true;
    }

    public final n.a b(Object obj, int i10, int i11, h hVar) {
        Uri uri = (Uri) obj;
        return new n.a(new n5.d(uri), new C0249d(this.f17873a, this.f17874b, this.f17875c, uri, i10, i11, hVar, this.f17876d));
    }
}
