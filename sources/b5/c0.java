package b5;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* compiled from: VideoDecoder */
public final class c0 extends MediaDataSource {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f4017a;

    public c0(ByteBuffer byteBuffer) {
        this.f4017a = byteBuffer;
    }

    public final void close() {
    }

    public final long getSize() {
        return (long) this.f4017a.limit();
    }

    public final int readAt(long j10, byte[] bArr, int i10, int i11) {
        if (j10 >= ((long) this.f4017a.limit())) {
            return -1;
        }
        this.f4017a.position((int) j10);
        int min = Math.min(i11, this.f4017a.remaining());
        this.f4017a.get(bArr, i10, min);
        return min;
    }
}
