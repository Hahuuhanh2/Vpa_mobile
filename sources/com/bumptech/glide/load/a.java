package com.bumptech.glide.load;

import b5.v;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import v4.b;

/* compiled from: ImageHeaderParserUtils */
public final class a {
    public static int a(b bVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new v(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            try {
                int c10 = ((ImageHeaderParser) list.get(i10)).c(inputStream, bVar);
                if (c10 != -1) {
                    return c10;
                }
                i10++;
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType b(List<ImageHeaderParser> list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType a10 = list.get(i10).a(byteBuffer);
            if (a10 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a10;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* JADX INFO: finally extract failed */
    public static ImageHeaderParser.ImageType c(b bVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new v(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            try {
                ImageHeaderParser.ImageType d10 = ((ImageHeaderParser) list.get(i10)).d(inputStream);
                inputStream.reset();
                if (d10 != ImageHeaderParser.ImageType.UNKNOWN) {
                    return d10;
                }
                i10++;
            } catch (Throwable th2) {
                inputStream.reset();
                throw th2;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
