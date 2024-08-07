package kf;

import al.g0;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import ek.i;
import ik.d;
import java.io.File;
import kk.c;
import kk.e;
import rk.l;
import sk.j;
import sk.k;
import yk.h;

/* compiled from: ImageUtil.kt */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f12554a = new g();

    @e(c = "com.ots.core.utils.ImageUtil", f = "ImageUtil.kt", l = {128}, m = "compressImage")
    /* compiled from: ImageUtil.kt */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public File f12555a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f12556b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ g f12557c;

        /* renamed from: d  reason: collision with root package name */
        public int f12558d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g gVar, d<? super a> dVar) {
            super(dVar);
            this.f12557c = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12556b = obj;
            this.f12558d |= Integer.MIN_VALUE;
            return this.f12557c.a((Context) null, (File) null, this);
        }
    }

    /* compiled from: ImageUtil.kt */
    public static final class b extends k implements l<kj.a, i> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f12559a = new b();

        public b() {
            super(1);
        }

        public final Object invoke(Object obj) {
            kj.a aVar = (kj.a) obj;
            j.f(aVar, "$this$compress");
            g0.L(aVar, 800, Bitmap.CompressFormat.JPEG, 60, 2);
            return i.f20112a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ all -> 0x0033 }
            sk.j.c(r9)     // Catch:{ all -> 0x0033 }
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0033 }
            if (r8 == 0) goto L_0x002d
            boolean r9 = r8.moveToFirst()     // Catch:{ all -> 0x002a }
            if (r9 == 0) goto L_0x002d
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x002a }
            java.lang.String r9 = r8.getString(r9)     // Catch:{ all -> 0x002a }
            r8.close()
            return r9
        L_0x002a:
            r9 = move-exception
            r7 = r8
            goto L_0x0035
        L_0x002d:
            if (r8 == 0) goto L_0x0032
            r8.close()
        L_0x0032:
            return r7
        L_0x0033:
            r8 = move-exception
            r9 = r8
        L_0x0035:
            if (r7 == 0) goto L_0x003a
            r7.close()
        L_0x003a:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.g.b(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static String c(Context context, Uri uri) {
        j.f(context, "context");
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (j.a("com.android.externalstorage.documents", uri.getAuthority())) {
                String documentId = DocumentsContract.getDocumentId(uri);
                j.c(documentId);
                String[] strArr = (String[]) yk.l.f1(documentId, new String[]{":"}).toArray(new String[0]);
                if (!h.G0("primary", strArr[0])) {
                    return null;
                }
                return context.getExternalFilesDir((String) null) + '/' + strArr[1];
            } else if (j.a("com.android.providers.downloads.documents", uri.getAuthority())) {
                String documentId2 = DocumentsContract.getDocumentId(uri);
                Uri parse = Uri.parse("content://downloads/public_downloads");
                Long valueOf = Long.valueOf(documentId2);
                j.e(valueOf, "valueOf(...)");
                Uri withAppendedId = ContentUris.withAppendedId(parse, valueOf.longValue());
                j.e(withAppendedId, "withAppendedId(...)");
                return b(context, withAppendedId, (String) null, (String[]) null);
            } else if (!j.a("com.android.providers.media.documents", uri.getAuthority())) {
                return null;
            } else {
                String documentId3 = DocumentsContract.getDocumentId(uri);
                j.c(documentId3);
                String[] strArr2 = (String[]) yk.l.f1(documentId3, new String[]{":"}).toArray(new String[0]);
                String str = strArr2[0];
                if (j.a("image", str)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if (j.a("video", str)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if (j.a("audio", str)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return b(context, uri2, "_id=?", new String[]{strArr2[1]});
            }
        } else if (h.G0("content", uri.getScheme())) {
            return b(context, uri, (String) null, (String[]) null);
        } else {
            if (h.G0("file", uri.getScheme())) {
                return uri.getPath();
            }
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(android.content.Context r6, java.io.File r7, ik.d<? super java.io.File> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof kf.g.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kf.g$a r0 = (kf.g.a) r0
            int r1 = r0.f12558d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12558d = r1
            goto L_0x0018
        L_0x0013:
            kf.g$a r0 = new kf.g$a
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f12556b
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f12558d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.io.File r7 = r0.f12555a
            p3.l0.Q0(r8)     // Catch:{ Exception -> 0x004c }
            goto L_0x0049
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            p3.l0.Q0(r8)
            kf.g$b r8 = kf.g.b.f12559a     // Catch:{ Exception -> 0x004c }
            r0.f12555a = r7     // Catch:{ Exception -> 0x004c }
            r0.f12558d = r3     // Catch:{ Exception -> 0x004c }
            gl.b r2 = al.r0.f19085b     // Catch:{ Exception -> 0x004c }
            jj.a r3 = new jj.a     // Catch:{ Exception -> 0x004c }
            r4 = 0
            r3.<init>(r8, r6, r7, r4)     // Catch:{ Exception -> 0x004c }
            java.lang.Object r8 = p3.l0.V0(r0, r2, r3)     // Catch:{ Exception -> 0x004c }
            if (r8 != r1) goto L_0x0049
            return r1
        L_0x0049:
            java.io.File r8 = (java.io.File) r8     // Catch:{ Exception -> 0x004c }
            goto L_0x004d
        L_0x004c:
            r8 = r7
        L_0x004d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.g.a(android.content.Context, java.io.File, ik.d):java.lang.Object");
    }
}
