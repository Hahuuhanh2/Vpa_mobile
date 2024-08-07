package v4;

/* compiled from: ByteArrayAdapter */
public final class e implements a<byte[]> {
    public final String a() {
        return "ByteArrayPool";
    }

    public final int b() {
        return 1;
    }

    public final int c(Object obj) {
        return ((byte[]) obj).length;
    }

    public final Object newArray(int i10) {
        return new byte[i10];
    }
}
