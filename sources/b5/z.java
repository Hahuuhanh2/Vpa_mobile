package b5;

import android.graphics.Bitmap;
import o5.l;
import s4.h;
import s4.j;
import u4.u;

/* compiled from: UnitBitmapDecoder */
public final class z implements j<Bitmap, Bitmap> {

    /* compiled from: UnitBitmapDecoder */
    public static final class a implements u<Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f4089a;

        public a(Bitmap bitmap) {
            this.f4089a = bitmap;
        }

        public final void b() {
        }

        public final Class<Bitmap> c() {
            return Bitmap.class;
        }

        public final int g() {
            return l.c(this.f4089a);
        }

        public final Object get() {
            return this.f4089a;
        }
    }

    public final u a(Object obj, int i10, int i11, h hVar) {
        return new a((Bitmap) obj);
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj, h hVar) {
        Bitmap bitmap = (Bitmap) obj;
        return true;
    }
}
