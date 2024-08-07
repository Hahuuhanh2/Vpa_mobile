package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* renamed from: a  reason: collision with root package name */
    private byte f18296a;

    /* renamed from: b  reason: collision with root package name */
    private Object f18297b;

    public a() {
    }

    a(byte b10, Object obj) {
        this.f18296a = b10;
        this.f18297b = obj;
    }

    static long a(DataInput dataInput) {
        byte readByte = dataInput.readByte() & 255;
        if (readByte == 255) {
            return dataInput.readLong();
        }
        return (((long) (((readByte << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255))) * 900) - 4575744000L;
    }

    static ZoneOffset b(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? ZoneOffset.e0(dataInput.readInt()) : ZoneOffset.e0(readByte * 900);
    }

    static void c(long j10, DataOutput dataOutput) {
        if (j10 < -4575744000L || j10 >= 10413792000L || j10 % 900 != 0) {
            dataOutput.writeByte(255);
            dataOutput.writeLong(j10);
            return;
        }
        int i10 = (int) ((j10 + 4575744000L) / 900);
        dataOutput.writeByte((i10 >>> 16) & 255);
        dataOutput.writeByte((i10 >>> 8) & 255);
        dataOutput.writeByte(i10 & 255);
    }

    static void d(ZoneOffset zoneOffset, DataOutput dataOutput) {
        int b02 = zoneOffset.b0();
        int i10 = b02 % 900 == 0 ? b02 / 900 : 127;
        dataOutput.writeByte(i10);
        if (i10 == 127) {
            dataOutput.writeInt(b02);
        }
    }

    private Object readResolve() {
        return this.f18297b;
    }

    public final void readExternal(ObjectInput objectInput) {
        Object obj;
        byte readByte = objectInput.readByte();
        this.f18296a = readByte;
        if (readByte == 1) {
            obj = e.l(objectInput);
        } else if (readByte == 2) {
            long a10 = a(objectInput);
            ZoneOffset b10 = b(objectInput);
            ZoneOffset b11 = b(objectInput);
            if (!b10.equals(b11)) {
                obj = new b(a10, b10, b11);
            } else {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
        } else if (readByte == 3) {
            obj = d.b(objectInput);
        } else if (readByte == 100) {
            obj = new e(TimeZone.getTimeZone(objectInput.readUTF()));
        } else {
            throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f18297b = obj;
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        byte b10 = this.f18296a;
        Object obj = this.f18297b;
        objectOutput.writeByte(b10);
        if (b10 == 1) {
            ((e) obj).m(objectOutput);
        } else if (b10 == 2) {
            ((b) obj).V(objectOutput);
        } else if (b10 == 3) {
            ((d) obj).c(objectOutput);
        } else if (b10 == 100) {
            ((e) obj).n(objectOutput);
        } else {
            throw new InvalidClassException("Unknown serialized type");
        }
    }
}
