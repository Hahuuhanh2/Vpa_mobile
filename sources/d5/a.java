package d5;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o5.l;
import s4.h;
import s4.j;
import u4.u;

/* compiled from: AnimatedWebpDecoder */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<ImageHeaderParser> f8742a;

    /* renamed from: b  reason: collision with root package name */
    public final v4.b f8743b;

    /* renamed from: d5.a$a  reason: collision with other inner class name */
    /* compiled from: AnimatedWebpDecoder */
    public static final class C0088a implements u<Drawable> {

        /* renamed from: a  reason: collision with root package name */
        public final AnimatedImageDrawable f8744a;

        public C0088a(AnimatedImageDrawable animatedImageDrawable) {
            this.f8744a = animatedImageDrawable;
        }

        public final void b() {
            this.f8744a.stop();
            this.f8744a.clearAnimationCallbacks();
        }

        public final Class<Drawable> c() {
            return Drawable.class;
        }

        public final int g() {
            return l.d(Bitmap.Config.ARGB_8888) * this.f8744a.getIntrinsicHeight() * this.f8744a.getIntrinsicWidth() * 2;
        }

        public final Object get() {
            return this.f8744a;
        }
    }

    /* compiled from: AnimatedWebpDecoder */
    public static final class b implements j<ByteBuffer, Drawable> {

        /* renamed from: a  reason: collision with root package name */
        public final a f8745a;

        public b(a aVar) {
            this.f8745a = aVar;
        }

        public final u a(Object obj, int i10, int i11, h hVar) {
            ImageDecoder.Source createSource = ImageDecoder.createSource((ByteBuffer) obj);
            this.f8745a.getClass();
            return a.a(createSource, i10, i11, hVar);
        }

        public final boolean b(Object obj, h hVar) {
            if (com.bumptech.glide.load.a.b(this.f8745a.f8742a, (ByteBuffer) obj) == ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: AnimatedWebpDecoder */
    public static final class c implements j<InputStream, Drawable> {

        /* renamed from: a  reason: collision with root package name */
        public final a f8746a;

        public c(a aVar) {
            this.f8746a = aVar;
        }

        public final u a(Object obj, int i10, int i11, h hVar) {
            ImageDecoder.Source createSource = ImageDecoder.createSource(o5.a.b((InputStream) obj));
            this.f8746a.getClass();
            return a.a(createSource, i10, i11, hVar);
        }

        public final boolean b(Object obj, h hVar) {
            a aVar = this.f8746a;
            List<ImageHeaderParser> list = aVar.f8742a;
            if (com.bumptech.glide.load.a.c(aVar.f8743b, (InputStream) obj, list) == ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return true;
            }
            return false;
        }
    }

    public a(List<ImageHeaderParser> list, v4.b bVar) {
        this.f8742a = list;
        this.f8743b = bVar;
    }

    public static C0088a a(ImageDecoder.Source source, int i10, int i11, h hVar) {
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new a5.a(i10, i11, hVar));
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            return new C0088a((AnimatedImageDrawable) decodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: " + decodeDrawable);
    }
}
