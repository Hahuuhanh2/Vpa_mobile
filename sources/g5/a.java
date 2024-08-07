package g5;

import android.graphics.Bitmap;
import c5.b;
import java.io.ByteArrayOutputStream;
import s4.h;
import u4.u;

/* compiled from: BitmapBytesTranscoder */
public final class a implements b<Bitmap, byte[]> {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap.CompressFormat f10367a = Bitmap.CompressFormat.JPEG;

    /* renamed from: b  reason: collision with root package name */
    public final int f10368b = 100;

    public final u<byte[]> f(u<Bitmap> uVar, h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        uVar.get().compress(this.f10367a, this.f10368b, byteArrayOutputStream);
        uVar.b();
        return new b(byteArrayOutputStream.toByteArray());
    }
}
