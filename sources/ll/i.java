package ll;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: BufferedSource.kt */
public interface i extends c0, ReadableByteChannel {
    boolean A();

    String F(long j10);

    long G(f fVar);

    void G0(long j10);

    long M0();

    InputStream O0();

    long T(j jVar);

    String V(Charset charset);

    void Z(f fVar, long j10);

    f a();

    boolean i0(long j10);

    j n(long j10);

    String p0();

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j10);

    int u0(s sVar);
}
