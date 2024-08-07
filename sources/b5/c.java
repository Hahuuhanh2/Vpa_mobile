package b5;

import a5.a;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import s4.h;
import s4.j;
import v4.d;

/* compiled from: BitmapImageDecoderResourceDecoder */
public final class c implements j<ImageDecoder.Source, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final d f4016a = new d();

    public final /* bridge */ /* synthetic */ boolean b(Object obj, h hVar) {
        ImageDecoder.Source source = (ImageDecoder.Source) obj;
        return true;
    }

    /* renamed from: c */
    public final d a(ImageDecoder.Source source, int i10, int i11, h hVar) {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new a(i10, i11, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            decodeBitmap.getWidth();
            decodeBitmap.getHeight();
        }
        return new d(decodeBitmap, this.f4016a);
    }
}
