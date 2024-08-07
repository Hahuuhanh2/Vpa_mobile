package b5;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.InputStream;
import o5.a;
import s4.h;
import s4.j;
import u4.u;

/* compiled from: InputStreamBitmapImageDecoderResourceDecoder */
public final class s implements j<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final c f4068a = new c();

    public final u a(Object obj, int i10, int i11, h hVar) {
        return this.f4068a.a(ImageDecoder.createSource(a.b((InputStream) obj)), i10, i11, hVar);
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj, h hVar) {
        InputStream inputStream = (InputStream) obj;
        return true;
    }
}
