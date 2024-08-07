package n4;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;

/* compiled from: Utils */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13513a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f13514b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final c f13515c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final d f13516d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static final float f13517e = ((float) (Math.sqrt(2.0d) / 2.0d));

    /* compiled from: Utils */
    public class a extends ThreadLocal<PathMeasure> {
        public final Object initialValue() {
            return new PathMeasure();
        }
    }

    /* compiled from: Utils */
    public class b extends ThreadLocal<Path> {
        public final Object initialValue() {
            return new Path();
        }
    }

    /* compiled from: Utils */
    public class c extends ThreadLocal<Path> {
        public final Object initialValue() {
            return new Path();
        }
    }

    /* compiled from: Utils */
    public class d extends ThreadLocal<float[]> {
        public final Object initialValue() {
            return new float[4];
        }
    }

    public static void a(Path path, float f10, float f11, float f12) {
        PathMeasure pathMeasure = (PathMeasure) f13513a.get();
        Path path2 = (Path) f13514b.get();
        Path path3 = (Path) f13515c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f10 == 1.0f && f11 == 0.0f) {
            m9.b.v();
        } else if (length < 1.0f || ((double) Math.abs((f11 - f10) - 1.0f)) < 0.01d) {
            m9.b.v();
        } else {
            float f13 = f10 * length;
            float f14 = f11 * length;
            float f15 = f12 * length;
            float min = Math.min(f13, f14) + f15;
            float max = Math.max(f13, f14) + f15;
            if (min >= length && max >= length) {
                min = (float) f.c(min, length);
                max = (float) f.c(max, length);
            }
            if (min < 0.0f) {
                min = (float) f.c(min, length);
            }
            if (max < 0.0f) {
                max = (float) f.c(max, length);
            }
            int i10 = (min > max ? 1 : (min == max ? 0 : -1));
            if (i10 == 0) {
                path.reset();
                m9.b.v();
                return;
            }
            if (i10 >= 0) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            m9.b.v();
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float d(Matrix matrix) {
        float[] fArr = (float[]) f13516d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f10 = f13517e;
        fArr[2] = f10;
        fArr[3] = f10;
        matrix.mapPoints(fArr);
        return (float) Math.hypot((double) (fArr[2] - fArr[0]), (double) (fArr[3] - fArr[1]));
    }
}
