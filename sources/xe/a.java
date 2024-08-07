package xe;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import m9.b;

/* compiled from: BitmapUtils */
public final class a {
    public static int a(int i10, int i11) {
        if (i10 % 2 == 1) {
            i10++;
        }
        if (i11 % 2 == 1) {
            i11++;
        }
        int max = Math.max(i10, i11);
        float min = ((float) Math.min(i10, i11)) / ((float) max);
        if (min > 1.0f || ((double) min) <= 0.5625d) {
            double d10 = (double) min;
            if (d10 > 0.5625d || d10 <= 0.5d) {
                return (int) Math.ceil(((double) max) / (1280.0d / d10));
            }
            int i12 = max / 1280;
            if (i12 == 0) {
                return 1;
            }
            return i12;
        } else if (max < 1664) {
            return 1;
        } else {
            if (max < 4990) {
                return 2;
            }
            if (max <= 4990 || max >= 10240) {
                return max / 1280;
            }
            return 4;
        }
    }

    public static int b(Context context, String str) {
        o2.a aVar;
        int i10;
        InputStream inputStream = null;
        try {
            if (j7.a.S(str)) {
                inputStream = b.N(context, Uri.parse(str));
                aVar = new o2.a(inputStream);
            } else {
                aVar = new o2.a(str);
            }
            int d10 = aVar.d(1, "Orientation");
            if (d10 == 3) {
                i10 = 180;
            } else if (d10 == 6) {
                i10 = 90;
            } else if (d10 != 8) {
                return 0;
            } else {
                i10 = 270;
            }
            h.a(inputStream);
            return i10;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        } finally {
            h.a(inputStream);
        }
    }

    public static void c(Bitmap bitmap, FileOutputStream fileOutputStream) {
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 60, fileOutputStream);
                fileOutputStream.write(byteArrayOutputStream2.toByteArray());
                fileOutputStream.flush();
                fileOutputStream.close();
                h.a(fileOutputStream);
                h.a(byteArrayOutputStream2);
            } catch (Exception e10) {
                e = e10;
                byteArrayOutputStream = byteArrayOutputStream2;
                try {
                    e.printStackTrace();
                    h.a(fileOutputStream);
                    h.a(byteArrayOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    h.a(fileOutputStream);
                    h.a(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = byteArrayOutputStream2;
                h.a(fileOutputStream);
                h.a(byteArrayOutputStream);
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            e.printStackTrace();
            h.a(fileOutputStream);
            h.a(byteArrayOutputStream);
        }
    }
}
