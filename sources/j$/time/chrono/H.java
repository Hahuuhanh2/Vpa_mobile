package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.k;
import j$.time.temporal.a;
import j$.time.temporal.n;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

final class H implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* renamed from: a  reason: collision with root package name */
    private byte f18057a;

    /* renamed from: b  reason: collision with root package name */
    private Object f18058b;

    public H() {
    }

    H(byte b10, Object obj) {
        this.f18057a = b10;
        this.f18058b = obj;
    }

    private Object readResolve() {
        return this.f18058b;
    }

    public final void readExternal(ObjectInput objectInput) {
        Object obj;
        byte readByte = objectInput.readByte();
        this.f18057a = readByte;
        switch (readByte) {
            case 1:
                int i10 = C0337d.f18066c;
                obj = C0337d.t(objectInput.readUTF());
                break;
            case 2:
                obj = ((ChronoLocalDate) objectInput.readObject()).J((k) objectInput.readObject());
                break;
            case 3:
                obj = ((C0341h) objectInput.readObject()).F((ZoneOffset) objectInput.readObject()).D((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = A.f18043d;
                int readInt = objectInput.readInt();
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                y.f18103d.getClass();
                obj = new A(LocalDate.f0(readInt, readByte2, readByte3));
                break;
            case 5:
                B b10 = B.f18047d;
                obj = B.r(objectInput.readByte());
                break;
            case 6:
                r rVar = (r) objectInput.readObject();
                int readInt2 = objectInput.readInt();
                byte readByte4 = objectInput.readByte();
                byte readByte5 = objectInput.readByte();
                rVar.getClass();
                obj = t.a0(rVar, readInt2, readByte4, readByte5);
                break;
            case 7:
                int readInt3 = objectInput.readInt();
                byte readByte6 = objectInput.readByte();
                byte readByte7 = objectInput.readByte();
                D.f18053d.getClass();
                obj = new F(LocalDate.f0(readInt3 + 1911, readByte6, readByte7));
                break;
            case 8:
                int readInt4 = objectInput.readInt();
                byte readByte8 = objectInput.readByte();
                byte readByte9 = objectInput.readByte();
                J.f18060d.getClass();
                obj = new L(LocalDate.f0(readInt4 - 543, readByte8, readByte9));
                break;
            case 9:
                int i11 = C0344k.f18071e;
                obj = new C0344k(C0337d.t(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f18058b = obj;
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        byte b10 = this.f18057a;
        Object obj = this.f18058b;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                objectOutput.writeUTF(((C0337d) obj).l());
                return;
            case 2:
                ((C0343j) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((n) obj).writeExternal(objectOutput);
                return;
            case 4:
                A a10 = (A) obj;
                a10.getClass();
                objectOutput.writeInt(n.a(a10, a.YEAR));
                objectOutput.writeByte(n.a(a10, a.MONTH_OF_YEAR));
                objectOutput.writeByte(n.a(a10, a.DAY_OF_MONTH));
                return;
            case 5:
                ((B) obj).A(objectOutput);
                return;
            case 6:
                ((t) obj).writeExternal(objectOutput);
                return;
            case 7:
                F f10 = (F) obj;
                f10.getClass();
                objectOutput.writeInt(n.a(f10, a.YEAR));
                objectOutput.writeByte(n.a(f10, a.MONTH_OF_YEAR));
                objectOutput.writeByte(n.a(f10, a.DAY_OF_MONTH));
                return;
            case 8:
                L l10 = (L) obj;
                l10.getClass();
                objectOutput.writeInt(n.a(l10, a.YEAR));
                objectOutput.writeByte(n.a(l10, a.MONTH_OF_YEAR));
                objectOutput.writeByte(n.a(l10, a.DAY_OF_MONTH));
                return;
            case 9:
                ((C0344k) obj).a(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }
}
