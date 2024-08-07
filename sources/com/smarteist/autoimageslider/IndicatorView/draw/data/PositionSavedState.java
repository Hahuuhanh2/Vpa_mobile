package com.smarteist.autoimageslider.IndicatorView.draw.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public class PositionSavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<PositionSavedState> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f19276a;

    /* renamed from: b  reason: collision with root package name */
    public int f19277b;

    /* renamed from: c  reason: collision with root package name */
    public int f19278c;

    public class a implements Parcelable.Creator<PositionSavedState> {
        public final Object createFromParcel(Parcel parcel) {
            return new PositionSavedState(parcel);
        }

        public final Object[] newArray(int i10) {
            return new PositionSavedState[i10];
        }
    }

    public PositionSavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f19276a);
        parcel.writeInt(this.f19277b);
        parcel.writeInt(this.f19278c);
    }

    public PositionSavedState(Parcel parcel) {
        super(parcel);
        this.f19276a = parcel.readInt();
        this.f19277b = parcel.readInt();
        this.f19278c = parcel.readInt();
    }
}
