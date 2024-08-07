package sl;

import java.io.DataInputStream;
import java.io.Externalizable;
import nl.k;

/* compiled from: Ser */
public final class a implements Externalizable {
    public static long a(DataInputStream dataInputStream) {
        byte readByte = dataInputStream.readByte() & 255;
        if (readByte == 255) {
            return dataInputStream.readLong();
        }
        return (((long) (((readByte << 16) + ((dataInputStream.readByte() & 255) << 8)) + (dataInputStream.readByte() & 255))) * 900) - 4575744000L;
    }

    public static k b(DataInputStream dataInputStream) {
        byte readByte = dataInputStream.readByte();
        if (readByte == Byte.MAX_VALUE) {
            return k.w(dataInputStream.readInt());
        }
        return k.w(readByte * 900);
    }
}
