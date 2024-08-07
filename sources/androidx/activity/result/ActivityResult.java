package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f303a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f304b;

    public class a implements Parcelable.Creator<ActivityResult> {
        public final Object createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        public final Object[] newArray(int i10) {
            return new ActivityResult[i10];
        }
    }

    public ActivityResult(Intent intent, int i10) {
        this.f303a = i10;
        this.f304b = intent;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder q10 = android.support.v4.media.a.q("ActivityResult{resultCode=");
        int i10 = this.f303a;
        if (i10 == -1) {
            str = "RESULT_OK";
        } else if (i10 != 0) {
            str = String.valueOf(i10);
        } else {
            str = "RESULT_CANCELED";
        }
        q10.append(str);
        q10.append(", data=");
        q10.append(this.f304b);
        q10.append('}');
        return q10.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeInt(this.f303a);
        if (this.f304b == null) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        parcel.writeInt(i11);
        Intent intent = this.f304b;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }

    public ActivityResult(Parcel parcel) {
        this.f303a = parcel.readInt();
        this.f304b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
