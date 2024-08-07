package t4;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ThumbFetcher */
public final class a implements d<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f14823a;

    /* renamed from: b  reason: collision with root package name */
    public final c f14824b;

    /* renamed from: c  reason: collision with root package name */
    public InputStream f14825c;

    /* renamed from: t4.a$a  reason: collision with other inner class name */
    /* compiled from: ThumbFetcher */
    public static class C0194a implements b {

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f14826b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f14827a;

        public C0194a(ContentResolver contentResolver) {
            this.f14827a = contentResolver;
        }

        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f14827a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f14826b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    /* compiled from: ThumbFetcher */
    public static class b implements b {

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f14828b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f14829a;

        public b(ContentResolver contentResolver) {
            this.f14829a = contentResolver;
        }

        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f14829a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f14828b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    public a(Uri uri, c cVar) {
        this.f14823a = uri;
        this.f14824b = cVar;
    }

    public static a c(Context context, Uri uri, b bVar) {
        return new a(uri, new c(com.bumptech.glide.b.b(context).f4919d.d(), bVar, com.bumptech.glide.b.b(context).f4920e, context.getContentResolver()));
    }

    public final Class<InputStream> a() {
        return InputStream.class;
    }

    public final void b() {
        InputStream inputStream = this.f14825c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public final void cancel() {
    }

    public final s4.a d() {
        return s4.a.LOCAL;
    }

    public final void e(j jVar, d.a<? super InputStream> aVar) {
        try {
            InputStream f10 = f();
            this.f14825c = f10;
            aVar.f(f10);
        } catch (FileNotFoundException e10) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
            aVar.c(e10);
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:15|16|(1:18)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:43|44|(1:46)|(2:48|49)) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r6 != null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        if (android.util.Log.isLoggable("ThumbStreamOpener", 3) != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        java.util.Objects.toString(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r6 != null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0085, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008b, code lost:
        if (android.util.Log.isLoggable("ThumbStreamOpener", 3) != false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        java.util.Objects.toString(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0096, code lost:
        if (r5 != 0) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ce, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0087 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.InputStream f() {
        /*
            r11 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            t4.c r1 = r11.f14824b
            android.net.Uri r2 = r11.f14823a
            r1.getClass()
            r3 = 0
            r4 = 3
            r5 = 0
            t4.b r6 = r1.f14830a     // Catch:{ SecurityException -> 0x002c, all -> 0x0029 }
            android.database.Cursor r6 = r6.a(r2)     // Catch:{ SecurityException -> 0x002c, all -> 0x0029 }
            if (r6 == 0) goto L_0x0026
            boolean r7 = r6.moveToFirst()     // Catch:{ SecurityException -> 0x002d }
            if (r7 == 0) goto L_0x0026
            java.lang.String r7 = r6.getString(r3)     // Catch:{ SecurityException -> 0x002d }
            r6.close()
            goto L_0x003c
        L_0x0022:
            r0 = move-exception
            r5 = r6
            goto L_0x00cc
        L_0x0026:
            if (r6 == 0) goto L_0x003b
            goto L_0x0038
        L_0x0029:
            r0 = move-exception
            goto L_0x00cc
        L_0x002c:
            r6 = r5
        L_0x002d:
            boolean r7 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0022 }
            if (r7 == 0) goto L_0x0036
            java.util.Objects.toString(r2)     // Catch:{ all -> 0x0022 }
        L_0x0036:
            if (r6 == 0) goto L_0x003b
        L_0x0038:
            r6.close()
        L_0x003b:
            r7 = r5
        L_0x003c:
            boolean r6 = android.text.TextUtils.isEmpty(r7)
            if (r6 == 0) goto L_0x0044
        L_0x0042:
            r1 = r5
            goto L_0x0067
        L_0x0044:
            java.io.File r6 = new java.io.File
            r6.<init>(r7)
            boolean r7 = r6.exists()
            if (r7 == 0) goto L_0x005a
            r7 = 0
            long r9 = r6.length()
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x005a
            r3 = 1
        L_0x005a:
            if (r3 != 0) goto L_0x005d
            goto L_0x0042
        L_0x005d:
            android.net.Uri r3 = android.net.Uri.fromFile(r6)
            android.content.ContentResolver r1 = r1.f14832c     // Catch:{ NullPointerException -> 0x00a6 }
            java.io.InputStream r1 = r1.openInputStream(r3)     // Catch:{ NullPointerException -> 0x00a6 }
        L_0x0067:
            r2 = -1
            if (r1 == 0) goto L_0x009c
            t4.c r3 = r11.f14824b
            android.net.Uri r6 = r11.f14823a
            r3.getClass()
            android.content.ContentResolver r7 = r3.f14832c     // Catch:{ IOException | NullPointerException -> 0x0087 }
            java.io.InputStream r5 = r7.openInputStream(r6)     // Catch:{ IOException | NullPointerException -> 0x0087 }
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r7 = r3.f14833d     // Catch:{ IOException | NullPointerException -> 0x0087 }
            v4.b r3 = r3.f14831b     // Catch:{ IOException | NullPointerException -> 0x0087 }
            int r0 = com.bumptech.glide.load.a.a(r3, r5, r7)     // Catch:{ IOException | NullPointerException -> 0x0087 }
            if (r5 == 0) goto L_0x009d
            r5.close()     // Catch:{ IOException -> 0x009d }
            goto L_0x009d
        L_0x0085:
            r0 = move-exception
            goto L_0x0096
        L_0x0087:
            boolean r0 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0090
            java.util.Objects.toString(r6)     // Catch:{ all -> 0x0085 }
        L_0x0090:
            if (r5 == 0) goto L_0x009c
            r5.close()     // Catch:{ IOException -> 0x009c }
            goto L_0x009c
        L_0x0096:
            if (r5 == 0) goto L_0x009b
            r5.close()     // Catch:{ IOException -> 0x009b }
        L_0x009b:
            throw r0
        L_0x009c:
            r0 = r2
        L_0x009d:
            if (r0 == r2) goto L_0x00a5
            com.bumptech.glide.load.data.g r2 = new com.bumptech.glide.load.data.g
            r2.<init>(r1, r0)
            r1 = r2
        L_0x00a5:
            return r1
        L_0x00a6:
            r0 = move-exception
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "NPE opening uri: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " -> "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            java.lang.Throwable r0 = r1.initCause(r0)
            java.io.FileNotFoundException r0 = (java.io.FileNotFoundException) r0
            throw r0
        L_0x00cc:
            if (r5 == 0) goto L_0x00d1
            r5.close()
        L_0x00d1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.a.f():java.io.InputStream");
    }
}
