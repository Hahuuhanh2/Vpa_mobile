package y4;

import android.util.Base64;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import s4.h;
import y4.n;

/* compiled from: DataUrlLoader */
public final class d<Model, Data> implements n<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Data> f17452a;

    /* compiled from: DataUrlLoader */
    public interface a<Data> {
    }

    /* compiled from: DataUrlLoader */
    public static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final String f17453a;

        /* renamed from: b  reason: collision with root package name */
        public final a<Data> f17454b;

        /* renamed from: c  reason: collision with root package name */
        public ByteArrayInputStream f17455c;

        public b(String str, a<Data> aVar) {
            this.f17453a = str;
            this.f17454b = aVar;
        }

        public final Class<Data> a() {
            ((c.a) this.f17454b).getClass();
            return InputStream.class;
        }

        public final void b() {
            try {
                a<Data> aVar = this.f17454b;
                ByteArrayInputStream byteArrayInputStream = this.f17455c;
                ((c.a) aVar).getClass();
                byteArrayInputStream.close();
            } catch (IOException unused) {
            }
        }

        public final void cancel() {
        }

        public final s4.a d() {
            return s4.a.LOCAL;
        }

        public final void e(j jVar, d.a<? super Data> aVar) {
            try {
                ByteArrayInputStream a10 = ((c.a) this.f17454b).a(this.f17453a);
                this.f17455c = a10;
                aVar.f(a10);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }
    }

    /* compiled from: DataUrlLoader */
    public static final class c<Model> implements o<Model, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final a f17456a = new a();

        /* compiled from: DataUrlLoader */
        public class a implements a<InputStream> {
            public final ByteArrayInputStream a(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        public final n<Model, InputStream> a(r rVar) {
            return new d(this.f17456a);
        }

        public final void b() {
        }
    }

    public d(c.a aVar) {
        this.f17452a = aVar;
    }

    public final boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }

    public final n.a<Data> b(Model model, int i10, int i11, h hVar) {
        return new n.a<>(new n5.d(model), new b(model.toString(), this.f17452a));
    }
}
