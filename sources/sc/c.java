package sc;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.Build;
import com.google.mlkit.common.MlKitException;
import java.nio.ByteBuffer;
import rc.a;
import y6.j;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
public final class c {
    public static ByteBuffer a(a aVar) {
        boolean z10;
        a aVar2 = aVar;
        int i10 = aVar2.f14569f;
        int i11 = 0;
        if (i10 == -1) {
            Bitmap bitmap = aVar2.f14564a;
            j.f(bitmap);
            if (Build.VERSION.SDK_INT >= 26 && bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
            }
            Bitmap bitmap2 = bitmap;
            int width = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            int i12 = width * height;
            int[] iArr = new int[i12];
            bitmap2.getPixels(iArr, 0, width, 0, 0, width, height);
            int ceil = (int) Math.ceil(((double) height) / 2.0d);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((ceil + ceil) * ((int) Math.ceil(((double) width) / 2.0d))) + i12);
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i13 < height) {
                int i16 = i11;
                while (i16 < width) {
                    int i17 = iArr[i15];
                    int i18 = i17 >> 16;
                    int i19 = i17 >> 8;
                    int i20 = i17 & 255;
                    int i21 = i14 + 1;
                    int i22 = i18 & 255;
                    int i23 = i19 & 255;
                    allocateDirect.put(i14, (byte) Math.min(255, ((((i20 * 25) + ((i23 * 129) + (i22 * 66))) + 128) >> 8) + 16));
                    if (i13 % 2 == 0 && i15 % 2 == 0) {
                        int i24 = i12 + 1;
                        allocateDirect.put(i12, (byte) Math.min(255, (((((i22 * 112) - (i23 * 94)) - (i20 * 18)) + 128) >> 8) + 128));
                        i12 = i24 + 1;
                        allocateDirect.put(i24, (byte) Math.min(255, (((((i22 * -38) - (i23 * 74)) + (i20 * 112)) + 128) >> 8) + 128));
                    }
                    i15++;
                    i16++;
                    i14 = i21;
                }
                i13++;
                i11 = 0;
            }
            return allocateDirect;
        } else if (i10 == 17) {
            j.f((Object) null);
            throw null;
        } else if (i10 == 35) {
            Image.Plane[] a10 = aVar.a();
            j.f(a10);
            int i25 = aVar2.f14566c;
            int i26 = aVar2.f14567d;
            int i27 = i25 * i26;
            int i28 = i27 / 4;
            byte[] bArr = new byte[(i28 + i28 + i27)];
            ByteBuffer buffer = a10[1].getBuffer();
            ByteBuffer buffer2 = a10[2].getBuffer();
            int position = buffer2.position();
            int limit = buffer.limit();
            buffer2.position(position + 1);
            buffer.limit(limit - 1);
            int i29 = (i27 + i27) / 4;
            if (buffer2.remaining() == i29 - 2 && buffer2.compareTo(buffer) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            buffer2.position(position);
            buffer.limit(limit);
            if (z10) {
                a10[0].getBuffer().get(bArr, 0, i27);
                ByteBuffer buffer3 = a10[1].getBuffer();
                a10[2].getBuffer().get(bArr, i27, 1);
                buffer3.get(bArr, i27 + 1, i29 - 1);
            } else {
                int i30 = i25;
                int i31 = i26;
                byte[] bArr2 = bArr;
                b(a10[0], i30, i31, bArr2, 0, 1);
                b(a10[1], i30, i31, bArr2, i27 + 1, 2);
                b(a10[2], i30, i31, bArr2, i27, 2);
            }
            return ByteBuffer.wrap(bArr);
        } else if (i10 != 842094169) {
            throw new MlKitException("Unsupported image format", 13);
        } else {
            j.f((Object) null);
            throw null;
        }
    }

    public static final void b(Image.Plane plane, int i10, int i11, byte[] bArr, int i12, int i13) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride != 0) {
            int i14 = i10 / (i11 / rowStride);
            int i15 = 0;
            for (int i16 = 0; i16 < rowStride; i16++) {
                int i17 = i15;
                for (int i18 = 0; i18 < i14; i18++) {
                    bArr[i12] = buffer.get(i17);
                    i12 += i13;
                    i17 += plane.getPixelStride();
                }
                i15 += plane.getRowStride();
            }
        }
    }
}
