package j$.time;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

final class s implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* renamed from: a  reason: collision with root package name */
    private byte f18239a;

    /* renamed from: b  reason: collision with root package name */
    private Object f18240b;

    public s() {
    }

    s(byte b10, Object obj) {
        this.f18239a = b10;
        this.f18240b = obj;
    }

    static Serializable a(ObjectInput objectInput) {
        return b(objectInput.readByte(), objectInput);
    }

    private static Serializable b(byte b10, ObjectInput objectInput) {
        switch (b10) {
            case 1:
                Duration duration = Duration.f18010c;
                return Duration.R(objectInput.readLong(), (long) objectInput.readInt());
            case 2:
                Instant instant = Instant.f18013c;
                return Instant.Z(objectInput.readLong(), (long) objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.f18016d;
                return LocalDate.f0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return k.j0(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.f18021c;
                LocalDate localDate2 = LocalDate.f18016d;
                return LocalDateTime.c0(LocalDate.f0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.j0(objectInput));
            case 6:
                return ZonedDateTime.X(objectInput);
            case 7:
                int i10 = w.f18292d;
                return ZoneId.V(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.g0(objectInput);
            case 9:
                return q.V(objectInput);
            case 10:
                return OffsetDateTime.W(objectInput);
            case 11:
                int i11 = u.f18288b;
                return u.R(objectInput.readInt());
            case 12:
                int i12 = YearMonth.f18029c;
                return YearMonth.U(objectInput.readInt(), objectInput.readByte());
            case 13:
                return n.R(objectInput);
            case 14:
                return r.d(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f18240b;
    }

    public final void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.f18239a = readByte;
        this.f18240b = b(readByte, objectInput);
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        byte b10 = this.f18239a;
        Object obj = this.f18240b;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                ((Duration) obj).U(objectOutput);
                return;
            case 2:
                ((Instant) obj).d0(objectOutput);
                return;
            case 3:
                ((LocalDate) obj).r0(objectOutput);
                return;
            case 4:
                ((k) obj).o0(objectOutput);
                return;
            case 5:
                ((LocalDateTime) obj).l0(objectOutput);
                return;
            case 6:
                ((ZonedDateTime) obj).c0(objectOutput);
                return;
            case 7:
                ((w) obj).a0(objectOutput);
                return;
            case 8:
                ((ZoneOffset) obj).h0(objectOutput);
                return;
            case 9:
                ((q) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((OffsetDateTime) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((u) obj).X(objectOutput);
                return;
            case 12:
                ((YearMonth) obj).Z(objectOutput);
                return;
            case 13:
                ((n) obj).U(objectOutput);
                return;
            case 14:
                ((r) obj).f(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }
}
