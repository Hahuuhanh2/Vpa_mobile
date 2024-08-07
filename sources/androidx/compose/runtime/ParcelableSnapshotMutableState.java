package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import sk.j;
import v.v;
import w0.b;
import w0.g;
import w0.h;
import w0.i;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: ParcelableSnapshotMutableState.kt */
public final class ParcelableSnapshotMutableState<T> extends g<T> implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new a();

    public ParcelableSnapshotMutableState(T t10, h<T> hVar) {
        super(t10, hVar);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        j.f(parcel, "parcel");
        parcel.writeValue(((g.a) y0.g.d(this.f16276b, this)).f16277b);
        h<T> hVar = this.f16275a;
        if (j.a(hVar, w0.a.f16265a)) {
            i11 = 0;
        } else if (j.a(hVar, i.f16278a)) {
            i11 = 1;
        } else if (j.a(hVar, b.f16266a)) {
            i11 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i11);
    }

    /* compiled from: ParcelableSnapshotMutableState.kt */
    public static final class a implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
        public static ParcelableSnapshotMutableState a(Parcel parcel, ClassLoader classLoader) {
            h hVar;
            j.f(parcel, "parcel");
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object readValue = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            if (readInt == 0) {
                hVar = w0.a.f16265a;
            } else if (readInt == 1) {
                hVar = i.f16278a;
            } else if (readInt == 2) {
                hVar = b.f16266a;
            } else {
                throw new IllegalStateException(v.d("Unsupported MutableState policy ", readInt, " was restored"));
            }
            return new ParcelableSnapshotMutableState(readValue, hVar);
        }

        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return a(parcel, (ClassLoader) null);
        }

        public final Object[] newArray(int i10) {
            return new ParcelableSnapshotMutableState[i10];
        }

        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return a(parcel, classLoader);
        }
    }
}
