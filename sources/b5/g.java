package b5;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;
import s4.h;
import s4.j;
import u4.u;

/* compiled from: ByteBufferBitmapImageDecoderResourceDecoder */
public final class g implements j<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final c f4021a = new c();

    public final u a(Object obj, int i10, int i11, h hVar) {
        return this.f4021a.a(ImageDecoder.createSource((ByteBuffer) obj), i10, i11, hVar);
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj, h hVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        return true;
    }
}
