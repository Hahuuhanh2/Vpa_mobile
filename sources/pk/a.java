package pk;

import java.io.ByteArrayOutputStream;
import sk.j;

/* compiled from: FileReadWrite.kt */
public final class a extends ByteArrayOutputStream {
    public a() {
        super(8193);
    }

    public final byte[] d() {
        byte[] bArr = this.buf;
        j.e(bArr, "buf");
        return bArr;
    }
}
