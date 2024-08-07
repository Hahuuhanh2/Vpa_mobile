package b5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import v4.c;

/* compiled from: TransformationUtils */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final Paint f4085a = new Paint(6);

    /* renamed from: b  reason: collision with root package name */
    public static final Paint f4086b = new Paint(7);

    /* renamed from: c  reason: collision with root package name */
    public static final Paint f4087c;

    /* renamed from: d  reason: collision with root package name */
    public static final Lock f4088d;

    /* compiled from: TransformationUtils */
    public static final class a implements Lock {
        public final void lock() {
        }

        public final void lockInterruptibly() {
        }

        public final Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public final boolean tryLock() {
            return true;
        }

        public final boolean tryLock(long j10, TimeUnit timeUnit) {
            return true;
        }

        public final void unlock() {
        }
    }

    static {
        Lock lock;
        if (new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"})).contains(Build.MODEL)) {
            lock = new ReentrantLock();
        } else {
            lock = new a();
        }
        f4088d = lock;
        Paint paint = new Paint(7);
        f4087c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f4088d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f4085a);
            canvas.setBitmap((Bitmap) null);
            lock.unlock();
        } catch (Throwable th2) {
            f4088d.unlock();
            throw th2;
        }
    }

    public static Bitmap b(c cVar, Bitmap bitmap, int i10, int i11) {
        Bitmap.Config config;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        float min = Math.min(((float) i10) / ((float) bitmap.getWidth()), ((float) i11) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        int width = (int) (((float) bitmap.getWidth()) * min);
        int height = (int) (((float) bitmap.getHeight()) * min);
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap e10 = cVar.e(width, height, config);
        e10.setHasAlpha(bitmap.hasAlpha());
        if (Log.isLoggable("TransformationUtils", 2)) {
            bitmap.getWidth();
            bitmap.getHeight();
            e10.getWidth();
            e10.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        a(bitmap, e10, matrix);
        return e10;
    }

    public static Bitmap c(Bitmap bitmap, c cVar) {
        Bitmap.Config d10 = d(bitmap);
        if (d10.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap e10 = cVar.e(bitmap.getWidth(), bitmap.getHeight(), d10);
        new Canvas(e10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return e10;
    }

    public static Bitmap.Config d(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            return Bitmap.Config.ARGB_8888;
        }
        return Bitmap.Config.RGBA_F16;
    }
}
