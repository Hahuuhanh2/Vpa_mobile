package n0;

import al.g0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.d;
import f0.k;
import g0.e;

/* compiled from: Packet */
public abstract class n<T> {
    public static c i(d dVar, e eVar, Size size, Rect rect, int i10, Matrix matrix, k kVar) {
        if (dVar.getFormat() == 256) {
            e eVar2 = eVar;
            g0.D(eVar, "JPEG image must have Exif.");
        } else {
            e eVar3 = eVar;
        }
        return new c(dVar, eVar, dVar.getFormat(), size, rect, i10, matrix, kVar);
    }

    public static c j(byte[] bArr, e eVar, Size size, Rect rect, int i10, Matrix matrix, k kVar) {
        return new c(bArr, eVar, 256, size, rect, i10, matrix, kVar);
    }

    public abstract k a();

    public abstract Rect b();

    public abstract T c();

    public abstract e d();

    public abstract int e();

    public abstract int f();

    public abstract Matrix g();

    public abstract Size h();
}
