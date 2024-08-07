package xe;

import android.content.ContentUris;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import j7.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLConnection;
import oe.b;

/* compiled from: MediaUtils */
public final class g {
    public static Bundle a(String str, String[] strArr, int i10, int i11, String str2) {
        boolean z10;
        Bundle bundle = new Bundle();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            bundle.putString("android:query-arg-sql-selection", str);
            bundle.putStringArray("android:query-arg-sql-selection-args", strArr);
            bundle.putString("android:query-arg-sql-sort-order", str2);
            if (i12 >= 30) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                bundle.putString("android:query-arg-sql-limit", i10 + " offset " + i11);
            }
        }
        return bundle;
    }

    public static void b(Context context, String str) {
        try {
            if (!TextUtils.isEmpty(str) && a.S(str)) {
                context.getContentResolver().delete(Uri.parse(str), (String) null, (String[]) null);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static b c(Context context, String str) {
        b bVar = new b();
        if (a.X(str)) {
            return bVar;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            if (a.S(str)) {
                mediaMetadataRetriever.setDataSource(context, Uri.parse(str));
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            bVar.f13869c = a.C0(mediaMetadataRetriever.extractMetadata(9));
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            mediaMetadataRetriever.release();
        } catch (Throwable th2) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            throw th2;
        }
        return bVar;
    }

    public static b d(Context context, String str) {
        InputStream inputStream;
        b bVar = new b();
        if (a.X(str)) {
            return bVar;
        }
        InputStream inputStream2 = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            if (a.S(str)) {
                inputStream = m9.b.N(context, Uri.parse(str));
            } else {
                inputStream = new FileInputStream(str);
            }
            try {
                BitmapFactory.decodeStream(inputStream, (Rect) null, options);
                bVar.f13867a = options.outWidth;
                bVar.f13868b = options.outHeight;
                h.a(inputStream);
            } catch (Exception e10) {
                inputStream2 = inputStream;
                e = e10;
                try {
                    e.printStackTrace();
                    h.a(inputStream2);
                    return bVar;
                } catch (Throwable th2) {
                    th = th2;
                    h.a(inputStream2);
                    throw th;
                }
            } catch (Throwable th3) {
                inputStream2 = inputStream;
                th = th3;
                h.a(inputStream2);
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            e.printStackTrace();
            h.a(inputStream2);
            return bVar;
        }
        return bVar;
    }

    public static String e(String str) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str).toLowerCase());
        if (TextUtils.isEmpty(mimeTypeFromExtension)) {
            mimeTypeFromExtension = URLConnection.getFileNameMap().getContentTypeFor(new File(str).getName());
        }
        if (TextUtils.isEmpty(mimeTypeFromExtension)) {
            return "image/jpeg";
        }
        return mimeTypeFromExtension;
    }

    public static String f(long j10, String str) {
        Uri uri;
        if (a.Y(str)) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (a.Z(str)) {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else if (a.U(str)) {
            uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        } else {
            uri = MediaStore.Files.getContentUri("external");
        }
        return ContentUris.withAppendedId(uri, j10).toString();
    }

    public static b g(Context context, String str) {
        int i10;
        int i11;
        b bVar = new b();
        if (a.X(str)) {
            return bVar;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            if (a.S(str)) {
                mediaMetadataRetriever.setDataSource(context, Uri.parse(str));
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
            if (!TextUtils.equals("90", extractMetadata)) {
                if (!TextUtils.equals("270", extractMetadata)) {
                    i10 = a.A0(mediaMetadataRetriever.extractMetadata(18));
                    i11 = a.A0(mediaMetadataRetriever.extractMetadata(19));
                    bVar.f13867a = i10;
                    bVar.f13868b = i11;
                    bVar.f13870d = extractMetadata;
                    bVar.f13869c = a.C0(mediaMetadataRetriever.extractMetadata(9));
                    mediaMetadataRetriever.release();
                    return bVar;
                }
            }
            int A0 = a.A0(mediaMetadataRetriever.extractMetadata(18));
            i11 = A0;
            i10 = a.A0(mediaMetadataRetriever.extractMetadata(19));
            bVar.f13867a = i10;
            bVar.f13868b = i11;
            bVar.f13870d = extractMetadata;
            bVar.f13869c = a.C0(mediaMetadataRetriever.extractMetadata(9));
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            mediaMetadataRetriever.release();
        } catch (Throwable th2) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            throw th2;
        }
        return bVar;
    }
}
