package f5;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import s4.j;
import u4.u;
import v4.b;

/* compiled from: StreamGifDecoder */
public final class h implements j<InputStream, c> {

    /* renamed from: a  reason: collision with root package name */
    public final List<ImageHeaderParser> f9961a;

    /* renamed from: b  reason: collision with root package name */
    public final j<ByteBuffer, c> f9962b;

    /* renamed from: c  reason: collision with root package name */
    public final b f9963c;

    public h(List list, a aVar, b bVar) {
        this.f9961a = list;
        this.f9962b = aVar;
        this.f9963c = bVar;
    }

    public final u a(Object obj, int i10, int i11, s4.h hVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            Log.isLoggable("StreamGifDecoder", 5);
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f9962b.a(ByteBuffer.wrap(bArr), i10, i11, hVar);
    }

    public final boolean b(Object obj, s4.h hVar) {
        InputStream inputStream = (InputStream) obj;
        if (!((Boolean) hVar.c(g.f9960b)).booleanValue()) {
            if (a.c(this.f9963c, inputStream, this.f9961a) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }
}
