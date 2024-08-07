package androidx.camera.core.internal.utils;

import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import android.support.v4.media.a;
import androidx.camera.core.d;
import g0.g;
import g0.h;
import g0.i;
import g0.j;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public final class ImageUtil {

    public static final class CodecFailedException extends Exception {
        public CodecFailedException() {
            super("YuvImage failed to encode jpeg.");
        }
    }

    public static byte[] a(d dVar, Rect rect, int i10, int i11) {
        Rect rect2;
        if (dVar.getFormat() == 35) {
            d.a aVar = dVar.l()[0];
            d.a aVar2 = dVar.l()[1];
            d.a aVar3 = dVar.l()[2];
            ByteBuffer a10 = aVar.a();
            ByteBuffer a11 = aVar2.a();
            ByteBuffer a12 = aVar3.a();
            a10.rewind();
            a11.rewind();
            a12.rewind();
            int remaining = a10.remaining();
            byte[] bArr = new byte[(((dVar.b() * dVar.c()) / 2) + remaining)];
            int i12 = 0;
            for (int i13 = 0; i13 < dVar.b(); i13++) {
                a10.get(bArr, i12, dVar.c());
                i12 += dVar.c();
                a10.position(Math.min(remaining, aVar.b() + (a10.position() - dVar.c())));
            }
            int b10 = dVar.b() / 2;
            int c10 = dVar.c() / 2;
            int b11 = aVar3.b();
            int b12 = aVar2.b();
            int c11 = aVar3.c();
            int c12 = aVar2.c();
            byte[] bArr2 = new byte[b11];
            byte[] bArr3 = new byte[b12];
            for (int i14 = 0; i14 < b10; i14++) {
                a12.get(bArr2, 0, Math.min(b11, a12.remaining()));
                a11.get(bArr3, 0, Math.min(b12, a11.remaining()));
                int i15 = 0;
                int i16 = 0;
                for (int i17 = 0; i17 < c10; i17++) {
                    int i18 = i12 + 1;
                    bArr[i12] = bArr2[i15];
                    i12 = i18 + 1;
                    bArr[i18] = bArr3[i16];
                    i15 += c11;
                    i16 += c12;
                }
            }
            YuvImage yuvImage = new YuvImage(bArr, 17, dVar.c(), dVar.b(), (int[]) null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            j[] jVarArr = g.f10235c;
            g.a aVar4 = new g.a(ByteOrder.BIG_ENDIAN);
            aVar4.c("Orientation", String.valueOf(1), aVar4.f10244a);
            aVar4.c("XResolution", "72/1", aVar4.f10244a);
            aVar4.c("YResolution", "72/1", aVar4.f10244a);
            aVar4.c("ResolutionUnit", String.valueOf(2), aVar4.f10244a);
            aVar4.c("YCbCrPositioning", String.valueOf(1), aVar4.f10244a);
            aVar4.c("Make", Build.MANUFACTURER, aVar4.f10244a);
            aVar4.c("Model", Build.MODEL, aVar4.f10244a);
            if (dVar.f0() != null) {
                dVar.f0().b(aVar4);
            }
            aVar4.d(i11);
            aVar4.c("ImageWidth", String.valueOf(dVar.c()), aVar4.f10244a);
            aVar4.c("ImageLength", String.valueOf(dVar.b()), aVar4.f10244a);
            ArrayList list = Collections.list(new h(aVar4));
            if (!((Map) list.get(1)).isEmpty()) {
                aVar4.b("ExposureProgram", String.valueOf(0), list);
                aVar4.b("ExifVersion", "0230", list);
                aVar4.b("ComponentsConfiguration", "1,2,3,0", list);
                aVar4.b("MeteringMode", String.valueOf(0), list);
                aVar4.b("LightSource", String.valueOf(0), list);
                aVar4.b("FlashpixVersion", "0100", list);
                aVar4.b("FocalPlaneResolutionUnit", String.valueOf(2), list);
                aVar4.b("FileSource", String.valueOf(3), list);
                aVar4.b("SceneType", String.valueOf(1), list);
                aVar4.b("CustomRendered", String.valueOf(0), list);
                aVar4.b("SceneCaptureType", String.valueOf(0), list);
                aVar4.b("Contrast", String.valueOf(0), list);
                aVar4.b("Saturation", String.valueOf(0), list);
                aVar4.b("Sharpness", String.valueOf(0), list);
            }
            if (!((Map) list.get(2)).isEmpty()) {
                aVar4.b("GPSVersionID", "2300", list);
                aVar4.b("GPSSpeedRef", "K", list);
                aVar4.b("GPSTrackRef", "T", list);
                aVar4.b("GPSImgDirectionRef", "T", list);
                aVar4.b("GPSDestBearingRef", "T", list);
                aVar4.b("GPSDestDistanceRef", "K", list);
            }
            i iVar = new i(byteArrayOutputStream, new g(aVar4.f10245b, list));
            if (rect == null) {
                rect2 = new Rect(0, 0, dVar.c(), dVar.b());
            } else {
                rect2 = rect;
            }
            if (yuvImage.compressToJpeg(rect2, i10, iVar)) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new CodecFailedException();
        }
        StringBuilder q10 = a.q("Incorrect image format of the input image proxy: ");
        q10.append(dVar.getFormat());
        throw new IllegalArgumentException(q10.toString());
    }
}
