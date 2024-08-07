package b5;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import n0.l;
import s4.g;
import s4.j;
import u4.u;

/* compiled from: VideoDecoder */
public final class b0<T> implements j<T, Bitmap> {

    /* renamed from: d  reason: collision with root package name */
    public static final s4.g<Long> f4008d = new s4.g<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e  reason: collision with root package name */
    public static final s4.g<Integer> f4009e = new s4.g<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f  reason: collision with root package name */
    public static final e f4010f = new e();

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f4011a;

    /* renamed from: b  reason: collision with root package name */
    public final v4.c f4012b;

    /* renamed from: c  reason: collision with root package name */
    public final e f4013c;

    /* compiled from: VideoDecoder */
    public class a implements g.b<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f4014a = ByteBuffer.allocate(8);

        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
            Long l10 = (Long) obj;
            messageDigest.update(bArr);
            synchronized (this.f4014a) {
                this.f4014a.position(0);
                messageDigest.update(this.f4014a.putLong(l10.longValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder */
    public class b implements g.b<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f4015a = ByteBuffer.allocate(4);

        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
            Integer num = (Integer) obj;
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f4015a) {
                    this.f4015a.position(0);
                    messageDigest.update(this.f4015a.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* compiled from: VideoDecoder */
    public static final class c implements f<AssetFileDescriptor> {
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* compiled from: VideoDecoder */
    public static final class d implements f<ByteBuffer> {
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(new c0((ByteBuffer) obj));
        }
    }

    /* compiled from: VideoDecoder */
    public static class e {
    }

    /* compiled from: VideoDecoder */
    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t10);
    }

    /* compiled from: VideoDecoder */
    public static final class g implements f<ParcelFileDescriptor> {
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        }
    }

    /* compiled from: VideoDecoder */
    public static final class h extends RuntimeException {
        public h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public b0(v4.c cVar, f<T> fVar) {
        e eVar = f4010f;
        this.f4012b = cVar;
        this.f4011a = fVar;
        this.f4013c = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap c(android.media.MediaMetadataRetriever r9, long r10, int r12, int r13, int r14, b5.k r15) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L_0x0057
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L_0x0057
            if (r14 == r0) goto L_0x0057
            b5.k$f r0 = b5.k.f4028d
            if (r15 == r0) goto L_0x0057
            r0 = 18
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch:{ all -> 0x0051 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0051 }
            r1 = 19
            java.lang.String r1 = r9.extractMetadata(r1)     // Catch:{ all -> 0x0051 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0051 }
            r2 = 24
            java.lang.String r2 = r9.extractMetadata(r2)     // Catch:{ all -> 0x0051 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x0051 }
            r3 = 90
            if (r2 == r3) goto L_0x0036
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L_0x0039
        L_0x0036:
            r8 = r1
            r1 = r0
            r0 = r8
        L_0x0039:
            float r13 = r15.b(r0, r1, r13, r14)     // Catch:{ all -> 0x0051 }
            float r14 = (float) r0     // Catch:{ all -> 0x0051 }
            float r14 = r14 * r13
            int r6 = java.lang.Math.round(r14)     // Catch:{ all -> 0x0051 }
            float r14 = (float) r1     // Catch:{ all -> 0x0051 }
            float r13 = r13 * r14
            int r7 = java.lang.Math.round(r13)     // Catch:{ all -> 0x0051 }
            r2 = r9
            r3 = r10
            r5 = r12
            android.graphics.Bitmap r13 = r2.getScaledFrameAtTime(r3, r5, r6, r7)     // Catch:{ all -> 0x0051 }
            goto L_0x0058
        L_0x0051:
            r13 = 3
            java.lang.String r14 = "VideoDecoder"
            android.util.Log.isLoggable(r14, r13)
        L_0x0057:
            r13 = 0
        L_0x0058:
            if (r13 != 0) goto L_0x005e
            android.graphics.Bitmap r13 = r9.getFrameAtTime(r10, r12)
        L_0x005e:
            if (r13 == 0) goto L_0x0061
            return r13
        L_0x0061:
            b5.b0$h r9 = new b5.b0$h
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.b0.c(android.media.MediaMetadataRetriever, long, int, int, int, b5.k):android.graphics.Bitmap");
    }

    public final u<Bitmap> a(T t10, int i10, int i11, s4.h hVar) {
        int i12;
        long longValue = ((Long) hVar.c(f4008d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) hVar.c(f4009e);
            if (num == null) {
                num = 2;
            }
            k kVar = (k) hVar.c(k.f4030f);
            if (kVar == null) {
                kVar = k.f4029e;
            }
            k kVar2 = kVar;
            this.f4013c.getClass();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                this.f4011a.a(mediaMetadataRetriever, t10);
                Bitmap c10 = c(mediaMetadataRetriever, longValue, num.intValue(), i10, i11, kVar2);
                if (i12 < 29) {
                    mediaMetadataRetriever.release();
                }
                return d.d(c10, this.f4012b);
            } finally {
                if (Build.VERSION.SDK_INT >= 29) {
                    mediaMetadataRetriever.close();
                } else {
                    mediaMetadataRetriever.release();
                }
            }
        } else {
            throw new IllegalArgumentException(l.i("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
    }

    public final boolean b(T t10, s4.h hVar) {
        return true;
    }
}
