package io.github.g00fy2.quickie.content;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import sk.j;

/* compiled from: ParcelableContent.kt */
public final class ContactInfoParcelable implements Parcelable {
    public static final Parcelable.Creator<ContactInfoParcelable> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<AddressParcelable> f20745a;

    /* renamed from: b  reason: collision with root package name */
    public final List<EmailParcelable> f20746b;

    /* renamed from: c  reason: collision with root package name */
    public final PersonNameParcelable f20747c;

    /* renamed from: d  reason: collision with root package name */
    public final String f20748d;

    /* renamed from: e  reason: collision with root package name */
    public final List<PhoneParcelable> f20749e;

    /* renamed from: f  reason: collision with root package name */
    public final String f20750f;

    /* renamed from: n  reason: collision with root package name */
    public final List<String> f20751n;

    /* compiled from: ParcelableContent.kt */
    public static final class a implements Parcelable.Creator<ContactInfoParcelable> {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(AddressParcelable.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i11 = 0; i11 != readInt2; i11++) {
                arrayList2.add(EmailParcelable.CREATOR.createFromParcel(parcel));
            }
            PersonNameParcelable createFromParcel = PersonNameParcelable.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            for (int i12 = 0; i12 != readInt3; i12++) {
                arrayList3.add(PhoneParcelable.CREATOR.createFromParcel(parcel));
            }
            return new ContactInfoParcelable(arrayList, arrayList2, createFromParcel, readString, arrayList3, parcel.readString(), parcel.createStringArrayList());
        }

        public final Object[] newArray(int i10) {
            return new ContactInfoParcelable[i10];
        }
    }

    public ContactInfoParcelable(List<AddressParcelable> list, List<EmailParcelable> list2, PersonNameParcelable personNameParcelable, String str, List<PhoneParcelable> list3, String str2, List<String> list4) {
        j.f(personNameParcelable, "nameParcelable");
        j.f(str, "organization");
        j.f(str2, "title");
        j.f(list4, "urls");
        this.f20745a = list;
        this.f20746b = list2;
        this.f20747c = personNameParcelable;
        this.f20748d = str;
        this.f20749e = list3;
        this.f20750f = str2;
        this.f20751n = list4;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        j.f(parcel, "out");
        List<AddressParcelable> list = this.f20745a;
        parcel.writeInt(list.size());
        for (AddressParcelable writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i10);
        }
        List<EmailParcelable> list2 = this.f20746b;
        parcel.writeInt(list2.size());
        for (EmailParcelable writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i10);
        }
        this.f20747c.writeToParcel(parcel, i10);
        parcel.writeString(this.f20748d);
        List<PhoneParcelable> list3 = this.f20749e;
        parcel.writeInt(list3.size());
        for (PhoneParcelable writeToParcel3 : list3) {
            writeToParcel3.writeToParcel(parcel, i10);
        }
        parcel.writeString(this.f20750f);
        parcel.writeStringList(this.f20751n);
    }
}
