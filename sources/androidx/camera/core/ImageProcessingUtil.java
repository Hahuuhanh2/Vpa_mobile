package androidx.camera.core;

import al.g0;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.Surface;
import c0.l0;
import c0.p0;
import c0.w0;
import java.nio.ByteBuffer;
import java.util.Locale;

public final class ImageProcessingUtil {

    /* renamed from: a  reason: collision with root package name */
    public static int f1277a;

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static void a(d dVar) {
        if (!f(dVar)) {
            p0.b("ImageProcessingUtil");
            return;
        }
        int c10 = dVar.c();
        int b10 = dVar.b();
        int b11 = dVar.l()[0].b();
        int b12 = dVar.l()[1].b();
        char c11 = 2;
        int b13 = dVar.l()[2].b();
        int c12 = dVar.l()[0].c();
        int c13 = dVar.l()[1].c();
        if (nativeShiftPixel(dVar.l()[0].a(), b11, dVar.l()[1].a(), b12, dVar.l()[2].a(), b13, c12, c13, c10, b10, c12, c13, c13) != 0) {
            c11 = 3;
        }
        if (c11 == 3) {
            p0.b("ImageProcessingUtil");
        }
    }

    public static d b(f fVar, byte[] bArr) {
        boolean z10;
        if (fVar.e() == 256) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0.z(z10);
        bArr.getClass();
        Surface surface = fVar.getSurface();
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            p0.b("ImageProcessingUtil");
            return null;
        }
        d d10 = fVar.d();
        if (d10 == null) {
            p0.b("ImageProcessingUtil");
        }
        return d10;
    }

    public static w0 c(d dVar, f fVar, ByteBuffer byteBuffer, int i10, boolean z10) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        char c10;
        int i14 = i10;
        if (!f(dVar)) {
            p0.b("ImageProcessingUtil");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (i14 == 0 || i14 == 90 || i14 == 180 || i14 == 270) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            p0.b("ImageProcessingUtil");
            return null;
        }
        Surface surface = fVar.getSurface();
        int c11 = dVar.c();
        int b10 = dVar.b();
        int b11 = dVar.l()[0].b();
        int b12 = dVar.l()[1].b();
        int b13 = dVar.l()[2].b();
        int c12 = dVar.l()[0].c();
        int c13 = dVar.l()[1].c();
        if (z10) {
            i11 = c12;
        } else {
            i11 = 0;
        }
        if (z10) {
            i12 = c13;
        } else {
            i12 = 0;
        }
        if (z10) {
            i13 = c13;
        } else {
            i13 = 0;
        }
        if (nativeConvertAndroid420ToABGR(dVar.l()[0].a(), b11, dVar.l()[1].a(), b12, dVar.l()[2].a(), b13, c12, c13, surface, byteBuffer, c11, b10, i11, i12, i13, i10) != 0) {
            c10 = 3;
        } else {
            c10 = 2;
        }
        if (c10 == 3) {
            p0.b("ImageProcessingUtil");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(f1277a)});
            p0.a("ImageProcessingUtil");
            f1277a++;
        }
        d d10 = fVar.d();
        if (d10 == null) {
            p0.b("ImageProcessingUtil");
            return null;
        }
        w0 w0Var = new w0(d10);
        w0Var.d(new l0(d10, dVar));
        return w0Var;
    }

    public static void d(Bitmap bitmap, ByteBuffer byteBuffer, int i10) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i10, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void e(Bitmap bitmap, ByteBuffer byteBuffer, int i10) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i10, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean f(d dVar) {
        if (dVar.getFormat() == 35 && dVar.l().length == 3) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static c0.w0 g(androidx.camera.core.d r26, androidx.camera.core.f r27, android.media.ImageWriter r28, java.nio.ByteBuffer r29, java.nio.ByteBuffer r30, java.nio.ByteBuffer r31, int r32) {
        /*
            r6 = r32
            boolean r0 = f(r26)
            r22 = 0
            java.lang.String r23 = "ImageProcessingUtil"
            if (r0 != 0) goto L_0x0010
            c0.p0.b(r23)
            return r22
        L_0x0010:
            r1 = 0
            r3 = 1
            if (r6 == 0) goto L_0x0023
            r0 = 90
            if (r6 == r0) goto L_0x0023
            r0 = 180(0xb4, float:2.52E-43)
            if (r6 == r0) goto L_0x0023
            r0 = 270(0x10e, float:3.78E-43)
            if (r6 != r0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r0 = r1
            goto L_0x0024
        L_0x0023:
            r0 = r3
        L_0x0024:
            if (r0 != 0) goto L_0x002a
            c0.p0.b(r23)
            return r22
        L_0x002a:
            r5 = 3
            r24 = 2
            if (r6 <= 0) goto L_0x0105
            int r19 = r26.c()
            int r20 = r26.b()
            androidx.camera.core.d$a[] r0 = r26.l()
            r0 = r0[r1]
            int r16 = r0.b()
            androidx.camera.core.d$a[] r0 = r26.l()
            r0 = r0[r3]
            int r17 = r0.b()
            androidx.camera.core.d$a[] r0 = r26.l()
            r0 = r0[r24]
            int r18 = r0.b()
            androidx.camera.core.d$a[] r0 = r26.l()
            r0 = r0[r3]
            int r21 = r0.c()
            android.media.Image r15 = r28.dequeueInputImage()
            if (r15 != 0) goto L_0x0067
            goto L_0x0105
        L_0x0067:
            androidx.camera.core.d$a[] r0 = r26.l()
            r0 = r0[r1]
            java.nio.ByteBuffer r0 = r0.a()
            androidx.camera.core.d$a[] r2 = r26.l()
            r2 = r2[r3]
            java.nio.ByteBuffer r2 = r2.a()
            androidx.camera.core.d$a[] r4 = r26.l()
            r4 = r4[r24]
            java.nio.ByteBuffer r4 = r4.a()
            android.media.Image$Plane[] r7 = r15.getPlanes()
            r7 = r7[r1]
            java.nio.ByteBuffer r7 = r7.getBuffer()
            android.media.Image$Plane[] r8 = r15.getPlanes()
            r8 = r8[r1]
            int r8 = r8.getRowStride()
            android.media.Image$Plane[] r9 = r15.getPlanes()
            r1 = r9[r1]
            int r9 = r1.getPixelStride()
            android.media.Image$Plane[] r1 = r15.getPlanes()
            r1 = r1[r3]
            java.nio.ByteBuffer r10 = r1.getBuffer()
            android.media.Image$Plane[] r1 = r15.getPlanes()
            r1 = r1[r3]
            int r11 = r1.getRowStride()
            android.media.Image$Plane[] r1 = r15.getPlanes()
            r1 = r1[r3]
            int r12 = r1.getPixelStride()
            android.media.Image$Plane[] r1 = r15.getPlanes()
            r1 = r1[r24]
            java.nio.ByteBuffer r13 = r1.getBuffer()
            android.media.Image$Plane[] r1 = r15.getPlanes()
            r1 = r1[r24]
            int r14 = r1.getRowStride()
            android.media.Image$Plane[] r1 = r15.getPlanes()
            r1 = r1[r24]
            int r1 = r1.getPixelStride()
            r3 = r15
            r15 = r1
            r1 = r16
            r25 = r3
            r3 = r17
            r5 = r18
            r6 = r21
            r16 = r29
            r17 = r30
            r18 = r31
            r21 = r32
            int r0 = nativeRotateYUV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x00fa
            goto L_0x0105
        L_0x00fa:
            r0 = r28
            r1 = r25
            r0.queueInputImage(r1)
            r5 = r24
            r0 = 3
            goto L_0x0107
        L_0x0105:
            r0 = 3
            r5 = 3
        L_0x0107:
            if (r5 != r0) goto L_0x010d
            c0.p0.b(r23)
            return r22
        L_0x010d:
            androidx.camera.core.d r0 = r27.d()
            if (r0 != 0) goto L_0x0117
            c0.p0.b(r23)
            return r22
        L_0x0117:
            c0.w0 r1 = new c0.w0
            r1.<init>(r0)
            c0.m0 r2 = new c0.m0
            r3 = r26
            r2.<init>(r0, r3)
            r1.d(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageProcessingUtil.g(androidx.camera.core.d, androidx.camera.core.f, android.media.ImageWriter, java.nio.ByteBuffer, java.nio.ByteBuffer, java.nio.ByteBuffer, int):c0.w0");
    }

    public static void h(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            p0.b("ImageProcessingUtil");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, Surface surface, ByteBuffer byteBuffer4, int i15, int i16, int i17, int i18, int i19, int i20);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i10, int i11, int i12, int i13, boolean z10);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, ByteBuffer byteBuffer4, int i14, int i15, ByteBuffer byteBuffer5, int i16, int i17, ByteBuffer byteBuffer6, int i18, int i19, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i20, int i21, int i22);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
