package ll;

import java.nio.channels.WritableByteChannel;

/* compiled from: BufferedSink.kt */
public interface h extends a0, WritableByteChannel {
    long E0(c0 c0Var);

    h K0(long j10);

    h O(String str);

    h Y(j jVar);

    f a();

    h b0(long j10);

    void flush();

    h write(byte[] bArr);

    h write(byte[] bArr, int i10, int i11);

    h writeByte(int i10);

    h writeInt(int i10);

    h writeShort(int i10);
}
