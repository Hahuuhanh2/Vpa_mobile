package e0;

import al.g0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.d;
import androidx.camera.core.impl.g;
import e0.v;
import g0.e;
import g0.n;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import k0.b;
import k0.c;
import o2.a;

/* compiled from: ProcessingInput2Packet */
public final class t {
    public final Object a(Object obj) {
        e eVar;
        boolean z10;
        Size size;
        v.b bVar = (v.b) obj;
        d a10 = bVar.a();
        w b10 = bVar.b();
        if (a10.getFormat() == 256) {
            try {
                e.a aVar = e.f10223b;
                ByteBuffer a11 = a10.l()[0].a();
                a11.rewind();
                byte[] bArr = new byte[a11.capacity()];
                a11.get(bArr);
                e eVar2 = new e(new a((InputStream) new ByteArrayInputStream(bArr)));
                a10.l()[0].a().rewind();
                eVar = eVar2;
            } catch (IOException e10) {
                throw new ImageCaptureException("Failed to extract EXIF data.", e10);
            }
        } else {
            eVar = null;
        }
        boolean z11 = true;
        if (((c) b.a(c.class)) != null) {
            androidx.camera.core.impl.c cVar = g.f1355i;
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 || a10.getFormat() != 256) {
            z11 = false;
        }
        if (z11) {
            g0.D(eVar, "JPEG image must have exif.");
            Size size2 = new Size(a10.c(), a10.b());
            int b11 = b10.f9052b - eVar.b();
            RectF rectF = n.f10263a;
            if (n.c(((b11 % 360) + 360) % 360)) {
                size = new Size(size2.getHeight(), size2.getWidth());
            } else {
                size = size2;
            }
            Matrix a12 = n.a(b11, new RectF(0.0f, 0.0f, (float) size2.getWidth(), (float) size2.getHeight()), new RectF(0.0f, 0.0f, (float) size.getWidth(), (float) size.getHeight()), false);
            RectF rectF2 = new RectF(b10.f9051a);
            a12.mapRect(rectF2);
            rectF2.sort();
            Rect rect = new Rect();
            rectF2.round(rect);
            int b12 = eVar.b();
            Matrix matrix = new Matrix(b10.f9054d);
            matrix.postConcat(a12);
            return n0.n.i(a10, eVar, size, rect, b12, matrix, ((j0.b) a10.f0()).f11451a);
        }
        return n0.n.i(a10, eVar, new Size(a10.c(), a10.b()), b10.f9051a, b10.f9052b, b10.f9054d, ((j0.b) a10.f0()).f11451a);
    }
}
