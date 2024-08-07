package b5;

import android.graphics.Bitmap;
import b5.r;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;
import s4.h;
import s4.j;
import u4.u;

/* compiled from: ByteBufferBitmapDecoder */
public final class f implements j<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final l f4020a;

    public f(l lVar) {
        this.f4020a = lVar;
    }

    public final u a(Object obj, int i10, int i11, h hVar) {
        l lVar = this.f4020a;
        List<ImageHeaderParser> list = lVar.f4042d;
        return lVar.a(new r.a(lVar.f4041c, (ByteBuffer) obj, list), i10, i11, hVar, l.f4037k);
    }

    public final boolean b(Object obj, h hVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        this.f4020a.getClass();
        return true;
    }
}
