package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import v0.h;

public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final h<String, Bundle> f6866c;

    public class a implements Parcelable.ClassLoaderCreator<ExtendableSavedState> {
        public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader);
        }

        public final Object[] newArray(int i10) {
            return new ExtendableSavedState[i10];
        }

        public final Object createFromParcel(Parcel parcel) {
            return new ExtendableSavedState(parcel, (ClassLoader) null);
        }
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f6866c = new h<>();
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("ExtendableSavedState{");
        q10.append(Integer.toHexString(System.identityHashCode(this)));
        q10.append(" states=");
        q10.append(this.f6866c);
        q10.append("}");
        return q10.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f2188a, i10);
        int i11 = this.f6866c.f16007c;
        parcel.writeInt(i11);
        String[] strArr = new String[i11];
        Bundle[] bundleArr = new Bundle[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            strArr[i12] = this.f6866c.i(i12);
            bundleArr[i12] = this.f6866c.m(i12);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f6866c = new h<>(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f6866c.put(strArr[i10], bundleArr[i10]);
        }
    }
}
