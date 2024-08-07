package xe;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import j7.a;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
import java.util.Objects;

/* compiled from: PictureFileUtils */
public final class h {
    public static void a(Closeable closeable) {
        if (closeable instanceof Closeable) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static File b(Context context, int i10, String str, String str2, String str3) {
        File file;
        File file2;
        Context applicationContext = context.getApplicationContext();
        if (TextUtils.isEmpty(str3)) {
            if (TextUtils.equals("mounted", Environment.getExternalStorageState())) {
                file2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(file2.getAbsolutePath());
                String str4 = File.separator;
                sb2.append(str4);
                sb2.append("Camera");
                sb2.append(str4);
                file = new File(sb2.toString());
            } else {
                File file3 = new File(d.a(applicationContext, i10));
                File file4 = file3;
                file = new File(file3.getAbsolutePath() + File.separator);
                file2 = file4;
            }
            if (!file2.exists()) {
                file2.mkdirs();
            }
        } else {
            File file5 = new File(str3);
            File parentFile = file5.getParentFile();
            Objects.requireNonNull(parentFile);
            if (!parentFile.exists()) {
                file5.getParentFile().mkdirs();
            }
            file = file5;
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        if (i10 == 2) {
            if (isEmpty) {
                str = b.c("VID_") + ".mp4";
            }
            return new File(file, str);
        } else if (i10 != 3) {
            if (TextUtils.isEmpty(str2)) {
                str2 = ".jpg";
            }
            if (isEmpty) {
                str = b.c("IMG_") + str2;
            }
            return new File(file, str);
        } else {
            if (isEmpty) {
                str = b.c("AUD_") + ".amr";
            }
            return new File(file, str);
        }
    }

    public static String c(Context context, Uri uri, String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, (String) null);
            if (cursor == null || !cursor.moveToFirst()) {
                if (cursor == null) {
                    return "";
                }
                cursor.close();
                return "";
            }
            String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
            cursor.close();
            return string;
        } catch (IllegalArgumentException e10) {
            String.format(Locale.getDefault(), "getDataColumn: _data - [%s]", new Object[]{e10.getMessage()});
            if (cursor == null) {
                return "";
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    @SuppressLint({"NewApi"})
    public static String d(Context context, Uri uri) {
        Context applicationContext = context.getApplicationContext();
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(applicationContext, uri)) {
            if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                String[] split = DocumentsContract.getDocumentId(uri).split(":");
                if (!"primary".equalsIgnoreCase(split[0])) {
                    return "";
                }
                if (i.a()) {
                    return applicationContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES) + "/" + split[1];
                }
                return Environment.getExternalStorageDirectory() + "/" + split[1];
            } else if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                return c(applicationContext, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), a.C0(DocumentsContract.getDocumentId(uri))), (String) null, (String[]) null);
            } else if (!"com.android.providers.media.documents".equals(uri.getAuthority())) {
                return "";
            } else {
                String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                String str = split2[0];
                if ("image".equals(str)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return c(applicationContext, uri2, "_id=?", new String[]{split2[1]});
            }
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            if ("com.google.android.apps.photos.content".equals(uri.getAuthority())) {
                return uri.getLastPathSegment();
            }
            return c(applicationContext, uri, (String) null, (String[]) null);
        } else if ("file".equalsIgnoreCase(uri.getScheme())) {
            return uri.getPath();
        } else {
            return "";
        }
    }

    public static Uri e(Context context, File file) {
        String str = context.getPackageName() + ".luckProvider";
        if (Build.VERSION.SDK_INT > 23) {
            return FileProvider.c(context, str, file);
        }
        return Uri.fromFile(file);
    }

    public static boolean f(InputStream inputStream, OutputStream outputStream) {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                bufferedOutputStream = new BufferedOutputStream(outputStream);
            } catch (Exception e10) {
                e = e10;
                bufferedOutputStream = null;
                bufferedInputStream = bufferedInputStream2;
                try {
                    e.printStackTrace();
                    a(bufferedInputStream);
                    a(bufferedOutputStream);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    a(bufferedInputStream);
                    a(bufferedOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
                bufferedInputStream = bufferedInputStream2;
                a(bufferedInputStream);
                a(bufferedOutputStream);
                throw th;
            }
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = bufferedInputStream2.read(bArr);
                    if (read != -1) {
                        outputStream.write(bArr, 0, read);
                    } else {
                        outputStream.flush();
                        a(bufferedInputStream2);
                        a(bufferedOutputStream);
                        return true;
                    }
                }
            } catch (Exception e11) {
                e = e11;
                bufferedInputStream = bufferedInputStream2;
                e.printStackTrace();
                a(bufferedInputStream);
                a(bufferedOutputStream);
                return false;
            } catch (Throwable th4) {
                th = th4;
                bufferedInputStream = bufferedInputStream2;
                a(bufferedInputStream);
                a(bufferedOutputStream);
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            bufferedOutputStream = null;
            e.printStackTrace();
            a(bufferedInputStream);
            a(bufferedOutputStream);
            return false;
        } catch (Throwable th5) {
            th = th5;
            bufferedOutputStream = null;
            a(bufferedInputStream);
            a(bufferedOutputStream);
            throw th;
        }
    }
}
