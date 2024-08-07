package k3;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.Method;
import v0.b;

/* compiled from: VersionedParcelParcel */
public final class a extends VersionedParcel {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f11953d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f11954e;

    /* renamed from: f  reason: collision with root package name */
    public final int f11955f;

    /* renamed from: g  reason: collision with root package name */
    public final int f11956g;

    /* renamed from: h  reason: collision with root package name */
    public final String f11957h;

    /* renamed from: i  reason: collision with root package name */
    public int f11958i;

    /* renamed from: j  reason: collision with root package name */
    public int f11959j;

    /* renamed from: k  reason: collision with root package name */
    public int f11960k;

    public a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new b(), new b(), new b());
    }

    public final a a() {
        Parcel parcel = this.f11954e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f11959j;
        if (i10 == this.f11955f) {
            i10 = this.f11956g;
        }
        return new a(parcel, dataPosition, i10, android.support.v4.media.a.o(new StringBuilder(), this.f11957h, "  "), this.f3517a, this.f3518b, this.f3519c);
    }

    public final boolean e() {
        if (this.f11954e.readInt() != 0) {
            return true;
        }
        return false;
    }

    public final byte[] f() {
        int readInt = this.f11954e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f11954e.readByteArray(bArr);
        return bArr;
    }

    public final CharSequence g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f11954e);
    }

    public final boolean h(int i10) {
        while (this.f11959j < this.f11956g) {
            int i11 = this.f11960k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f11954e.setDataPosition(this.f11959j);
            int readInt = this.f11954e.readInt();
            this.f11960k = this.f11954e.readInt();
            this.f11959j += readInt;
        }
        if (this.f11960k == i10) {
            return true;
        }
        return false;
    }

    public final int i() {
        return this.f11954e.readInt();
    }

    public final <T extends Parcelable> T k() {
        return this.f11954e.readParcelable(a.class.getClassLoader());
    }

    public final String l() {
        return this.f11954e.readString();
    }

    public final void n(int i10) {
        w();
        this.f11958i = i10;
        this.f11953d.put(i10, this.f11954e.dataPosition());
        r(0);
        r(i10);
    }

    public final void o(boolean z10) {
        this.f11954e.writeInt(z10 ? 1 : 0);
    }

    public final void p(byte[] bArr) {
        if (bArr != null) {
            this.f11954e.writeInt(bArr.length);
            this.f11954e.writeByteArray(bArr);
            return;
        }
        this.f11954e.writeInt(-1);
    }

    public final void q(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f11954e, 0);
    }

    public final void r(int i10) {
        this.f11954e.writeInt(i10);
    }

    public final void t(Parcelable parcelable) {
        this.f11954e.writeParcelable(parcelable, 0);
    }

    public final void u(String str) {
        this.f11954e.writeString(str);
    }

    public final void w() {
        int i10 = this.f11958i;
        if (i10 >= 0) {
            int i11 = this.f11953d.get(i10);
            int dataPosition = this.f11954e.dataPosition();
            this.f11954e.setDataPosition(i11);
            this.f11954e.writeInt(dataPosition - i11);
            this.f11954e.setDataPosition(dataPosition);
        }
    }

    public a(Parcel parcel, int i10, int i11, String str, b<String, Method> bVar, b<String, Method> bVar2, b<String, Class> bVar3) {
        super(bVar, bVar2, bVar3);
        this.f11953d = new SparseIntArray();
        this.f11958i = -1;
        this.f11960k = -1;
        this.f11954e = parcel;
        this.f11955f = i10;
        this.f11956g = i11;
        this.f11959j = i10;
        this.f11957h = str;
    }
}
