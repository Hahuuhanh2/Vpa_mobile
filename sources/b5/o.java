package b5;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import o5.a;
import v4.b;

/* compiled from: ExifInterfaceImageHeaderParser */
public final class o implements ImageHeaderParser {
    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public final int b(ByteBuffer byteBuffer, b bVar) {
        AtomicReference<byte[]> atomicReference = a.f13728a;
        return c(new a.C0170a(byteBuffer), bVar);
    }

    public final int c(InputStream inputStream, b bVar) {
        int d10 = new o2.a(inputStream).d(1, "Orientation");
        if (d10 == 0) {
            return -1;
        }
        return d10;
    }

    public final ImageHeaderParser.ImageType d(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
