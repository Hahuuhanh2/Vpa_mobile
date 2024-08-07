package e0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.d;
import androidx.camera.core.internal.utils.ImageUtil;
import g0.e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;
import n0.c;
import n0.n;

/* compiled from: Image2JpegBytes */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final l0.a f9027a;

    /* compiled from: Image2JpegBytes */
    public static abstract class a {
        public abstract int a();

        public abstract n<d> b();
    }

    public m(z.d dVar) {
        this.f9027a = new l0.a(dVar);
    }

    public static c c(a aVar) {
        n<d> b10 = aVar.b();
        d c10 = b10.c();
        Rect b11 = b10.b();
        try {
            byte[] a10 = ImageUtil.a(c10, b11, aVar.a(), b10.f());
            try {
                e eVar = new e(new o2.a((InputStream) new ByteArrayInputStream(a10)));
                Size size = new Size(b11.width(), b11.height());
                Rect rect = new Rect(0, 0, b11.width(), b11.height());
                int f10 = b10.f();
                Matrix g2 = b10.g();
                RectF rectF = g0.n.f10263a;
                Matrix matrix = new Matrix(g2);
                matrix.postTranslate((float) (-b11.left), (float) (-b11.top));
                return n.j(a10, eVar, size, rect, f10, matrix, b10.a());
            } catch (IOException e10) {
                throw new ImageCaptureException("Failed to extract Exif from YUV-generated JPEG", e10);
            }
        } catch (ImageUtil.CodecFailedException e11) {
            throw new ImageCaptureException("Failed to encode the image to JPEG.", e11);
        }
    }

    public final Object a(Object obj) {
        c cVar;
        a aVar = (a) obj;
        try {
            int e10 = aVar.b().e();
            if (e10 == 35) {
                cVar = c(aVar);
            } else if (e10 == 256) {
                cVar = b(aVar);
            } else {
                throw new IllegalArgumentException("Unexpected format: " + e10);
            }
            return cVar;
        } finally {
            aVar.b().c().close();
        }
    }

    public final c b(a aVar) {
        byte[] bArr;
        boolean z10;
        byte[] copyOfRange;
        byte b10;
        n<d> b11 = aVar.b();
        l0.a aVar2 = this.f9027a;
        d c10 = b11.c();
        int i10 = 0;
        if (aVar2.f12628a == null) {
            ByteBuffer a10 = c10.l()[0].a();
            copyOfRange = new byte[a10.capacity()];
            a10.rewind();
            a10.get(copyOfRange);
        } else {
            ByteBuffer a11 = c10.l()[0].a();
            int capacity = a11.capacity();
            byte[] bArr2 = new byte[capacity];
            a11.rewind();
            a11.get(bArr2);
            int i11 = 2;
            int i12 = 2;
            while (true) {
                if (i12 + 4 <= capacity && (b10 = bArr2[i12]) == -1) {
                    if (b10 == -1 && bArr2[i12 + 1] == -38) {
                        z10 = true;
                        break;
                    }
                    i12 += (((bArr2[i12 + 2] & 255) << 8) | (bArr2[i12 + 3] & 255)) + 2;
                } else {
                    z10 = false;
                }
            }
            z10 = false;
            if (!z10) {
                while (true) {
                    int i13 = i11 + 1;
                    if (i13 <= capacity) {
                        if (bArr2[i11] == -1 && bArr2[i13] == -40) {
                            i10 = i11;
                            break;
                        }
                        i11 = i13;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 == -1) {
                    bArr = bArr2;
                    e d10 = b11.d();
                    Objects.requireNonNull(d10);
                    return n.j(bArr, d10, b11.h(), b11.b(), b11.f(), b11.g(), b11.a());
                }
            }
            copyOfRange = Arrays.copyOfRange(bArr2, i10, a11.limit());
        }
        bArr = copyOfRange;
        e d102 = b11.d();
        Objects.requireNonNull(d102);
        return n.j(bArr, d102, b11.h(), b11.b(), b11.f(), b11.g(), b11.a());
    }
}
