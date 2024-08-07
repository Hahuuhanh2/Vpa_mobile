package b5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.j;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import o5.a;

/* compiled from: ImageReader */
public interface r {

    /* compiled from: ImageReader */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f4059a;

        /* renamed from: b  reason: collision with root package name */
        public final List<ImageHeaderParser> f4060b;

        /* renamed from: c  reason: collision with root package name */
        public final v4.b f4061c;

        public a(v4.b bVar, ByteBuffer byteBuffer, List list) {
            this.f4059a = byteBuffer;
            this.f4060b = list;
            this.f4061c = bVar;
        }

        public final int a() {
            List<ImageHeaderParser> list = this.f4060b;
            ByteBuffer byteBuffer = this.f4059a;
            AtomicReference<byte[]> atomicReference = o5.a.f13728a;
            ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(0);
            v4.b bVar = this.f4061c;
            if (byteBuffer2 == null) {
                return -1;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                int b10 = list.get(i10).b(byteBuffer2, bVar);
                if (b10 != -1) {
                    return b10;
                }
            }
            return -1;
        }

        public final Bitmap b(BitmapFactory.Options options) {
            ByteBuffer byteBuffer = this.f4059a;
            AtomicReference<byte[]> atomicReference = o5.a.f13728a;
            return BitmapFactory.decodeStream(new a.C0170a((ByteBuffer) byteBuffer.position(0)), (Rect) null, options);
        }

        public final void c() {
        }

        public final ImageHeaderParser.ImageType d() {
            List<ImageHeaderParser> list = this.f4060b;
            ByteBuffer byteBuffer = this.f4059a;
            AtomicReference<byte[]> atomicReference = o5.a.f13728a;
            return com.bumptech.glide.load.a.b(list, (ByteBuffer) byteBuffer.position(0));
        }
    }

    /* compiled from: ImageReader */
    public static final class b implements r {

        /* renamed from: a  reason: collision with root package name */
        public final j f4062a;

        /* renamed from: b  reason: collision with root package name */
        public final v4.b f4063b;

        /* renamed from: c  reason: collision with root package name */
        public final List<ImageHeaderParser> f4064c;

        public b(v4.b bVar, o5.j jVar, List list) {
            j7.a.r(bVar);
            this.f4063b = bVar;
            j7.a.r(list);
            this.f4064c = list;
            this.f4062a = new j(jVar, bVar);
        }

        public final int a() {
            List<ImageHeaderParser> list = this.f4064c;
            j jVar = this.f4062a;
            jVar.f4985a.reset();
            return com.bumptech.glide.load.a.a(this.f4063b, jVar.f4985a, list);
        }

        public final Bitmap b(BitmapFactory.Options options) {
            j jVar = this.f4062a;
            jVar.f4985a.reset();
            return BitmapFactory.decodeStream(jVar.f4985a, (Rect) null, options);
        }

        public final void c() {
            v vVar = this.f4062a.f4985a;
            synchronized (vVar) {
                vVar.f4075c = vVar.f4073a.length;
            }
        }

        public final ImageHeaderParser.ImageType d() {
            List<ImageHeaderParser> list = this.f4064c;
            j jVar = this.f4062a;
            jVar.f4985a.reset();
            return com.bumptech.glide.load.a.c(this.f4063b, jVar.f4985a, list);
        }
    }

    /* compiled from: ImageReader */
    public static final class c implements r {

        /* renamed from: a  reason: collision with root package name */
        public final v4.b f4065a;

        /* renamed from: b  reason: collision with root package name */
        public final List<ImageHeaderParser> f4066b;

        /* renamed from: c  reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f4067c;

        public c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, v4.b bVar) {
            j7.a.r(bVar);
            this.f4065a = bVar;
            j7.a.r(list);
            this.f4066b = list;
            this.f4067c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x003d A[SYNTHETIC, Splitter:B:19:0x003d] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int a() {
            /*
                r10 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r10.f4066b
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r1 = r10.f4067c
                v4.b r2 = r10.f4065a
                int r3 = r0.size()
                r4 = 0
            L_0x000b:
                r5 = -1
                if (r4 >= r3) goto L_0x0044
                java.lang.Object r6 = r0.get(r4)
                com.bumptech.glide.load.ImageHeaderParser r6 = (com.bumptech.glide.load.ImageHeaderParser) r6
                b5.v r7 = new b5.v     // Catch:{ all -> 0x0039 }
                java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ all -> 0x0039 }
                android.os.ParcelFileDescriptor r9 = r1.a()     // Catch:{ all -> 0x0039 }
                java.io.FileDescriptor r9 = r9.getFileDescriptor()     // Catch:{ all -> 0x0039 }
                r8.<init>(r9)     // Catch:{ all -> 0x0039 }
                r7.<init>(r8, r2)     // Catch:{ all -> 0x0039 }
                int r6 = r6.c(r7, r2)     // Catch:{ all -> 0x0037 }
                r7.close()     // Catch:{ IOException -> 0x002d }
            L_0x002d:
                r1.a()
                if (r6 == r5) goto L_0x0034
                r5 = r6
                goto L_0x0044
            L_0x0034:
                int r4 = r4 + 1
                goto L_0x000b
            L_0x0037:
                r0 = move-exception
                goto L_0x003b
            L_0x0039:
                r0 = move-exception
                r7 = 0
            L_0x003b:
                if (r7 == 0) goto L_0x0040
                r7.close()     // Catch:{ IOException -> 0x0040 }
            L_0x0040:
                r1.a()
                throw r0
            L_0x0044:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: b5.r.c.a():int");
        }

        public final Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f4067c.a().getFileDescriptor(), (Rect) null, options);
        }

        public final void c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x003d A[SYNTHETIC, Splitter:B:17:0x003d] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bumptech.glide.load.ImageHeaderParser.ImageType d() {
            /*
                r9 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r9.f4066b
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r1 = r9.f4067c
                v4.b r2 = r9.f4065a
                int r3 = r0.size()
                r4 = 0
            L_0x000b:
                if (r4 >= r3) goto L_0x0044
                java.lang.Object r5 = r0.get(r4)
                com.bumptech.glide.load.ImageHeaderParser r5 = (com.bumptech.glide.load.ImageHeaderParser) r5
                b5.v r6 = new b5.v     // Catch:{ all -> 0x0039 }
                java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ all -> 0x0039 }
                android.os.ParcelFileDescriptor r8 = r1.a()     // Catch:{ all -> 0x0039 }
                java.io.FileDescriptor r8 = r8.getFileDescriptor()     // Catch:{ all -> 0x0039 }
                r7.<init>(r8)     // Catch:{ all -> 0x0039 }
                r6.<init>(r7, r2)     // Catch:{ all -> 0x0039 }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.d(r6)     // Catch:{ all -> 0x0037 }
                r6.close()     // Catch:{ IOException -> 0x002c }
            L_0x002c:
                r1.a()
                com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
                if (r5 == r6) goto L_0x0034
                goto L_0x0046
            L_0x0034:
                int r4 = r4 + 1
                goto L_0x000b
            L_0x0037:
                r0 = move-exception
                goto L_0x003b
            L_0x0039:
                r0 = move-exception
                r6 = 0
            L_0x003b:
                if (r6 == 0) goto L_0x0040
                r6.close()     // Catch:{ IOException -> 0x0040 }
            L_0x0040:
                r1.a()
                throw r0
            L_0x0044:
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            L_0x0046:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: b5.r.c.d():com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }
    }

    int a();

    Bitmap b(BitmapFactory.Options options);

    void c();

    ImageHeaderParser.ImageType d();
}
