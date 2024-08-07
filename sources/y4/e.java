package y4;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import s4.h;
import y4.n;

/* compiled from: FileLoader */
public final class e<Data> implements n<File, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final d<Data> f17457a;

    /* compiled from: FileLoader */
    public static class a<Data> implements o<File, Data> {

        /* renamed from: a  reason: collision with root package name */
        public final d<Data> f17458a;

        public a(d<Data> dVar) {
            this.f17458a = dVar;
        }

        public final n<File, Data> a(r rVar) {
            return new e(this.f17458a);
        }

        public final void b() {
        }
    }

    /* compiled from: FileLoader */
    public static class b extends a<ParcelFileDescriptor> {

        /* compiled from: FileLoader */
        public class a implements d<ParcelFileDescriptor> {
            public final Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            public final Object b(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            public final void c(Object obj) {
                ((ParcelFileDescriptor) obj).close();
            }
        }

        public b() {
            super(new a());
        }
    }

    /* compiled from: FileLoader */
    public static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final File f17459a;

        /* renamed from: b  reason: collision with root package name */
        public final d<Data> f17460b;

        /* renamed from: c  reason: collision with root package name */
        public Data f17461c;

        public c(File file, d<Data> dVar) {
            this.f17459a = file;
            this.f17460b = dVar;
        }

        public final Class<Data> a() {
            return this.f17460b.a();
        }

        public final void b() {
            Data data = this.f17461c;
            if (data != null) {
                try {
                    this.f17460b.c(data);
                } catch (IOException unused) {
                }
            }
        }

        public final void cancel() {
        }

        public final s4.a d() {
            return s4.a.LOCAL;
        }

        public final void e(j jVar, d.a<? super Data> aVar) {
            try {
                Data b10 = this.f17460b.b(this.f17459a);
                this.f17461c = b10;
                aVar.f(b10);
            } catch (FileNotFoundException e10) {
                Log.isLoggable("FileLoader", 3);
                aVar.c(e10);
            }
        }
    }

    /* compiled from: FileLoader */
    public interface d<Data> {
        Class<Data> a();

        Data b(File file);

        void c(Data data);
    }

    /* renamed from: y4.e$e  reason: collision with other inner class name */
    /* compiled from: FileLoader */
    public static class C0232e extends a<InputStream> {

        /* renamed from: y4.e$e$a */
        /* compiled from: FileLoader */
        public class a implements d<InputStream> {
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            public final Object b(File file) {
                return new FileInputStream(file);
            }

            public final void c(Object obj) {
                ((InputStream) obj).close();
            }
        }

        public C0232e() {
            super(new a());
        }
    }

    public e(d<Data> dVar) {
        this.f17457a = dVar;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        File file = (File) obj;
        return true;
    }

    public final n.a b(Object obj, int i10, int i11, h hVar) {
        File file = (File) obj;
        return new n.a(new n5.d(file), new c(file, this.f17457a));
    }
}
