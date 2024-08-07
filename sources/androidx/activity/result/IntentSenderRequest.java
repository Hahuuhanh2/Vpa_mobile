package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import sk.j;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: IntentSenderRequest.kt */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final IntentSender f305a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f306b;

    /* renamed from: c  reason: collision with root package name */
    public final int f307c;

    /* renamed from: d  reason: collision with root package name */
    public final int f308d;

    /* compiled from: IntentSenderRequest.kt */
    public static final class a implements Parcelable.Creator<IntentSenderRequest> {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "inParcel");
            Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
            j.c(readParcelable);
            return new IntentSenderRequest((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }

        public final Object[] newArray(int i10) {
            return new IntentSenderRequest[i10];
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i10, int i11) {
        j.f(intentSender, "intentSender");
        this.f305a = intentSender;
        this.f306b = intent;
        this.f307c = i10;
        this.f308d = i11;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        j.f(parcel, "dest");
        parcel.writeParcelable(this.f305a, i10);
        parcel.writeParcelable(this.f306b, i10);
        parcel.writeInt(this.f307c);
        parcel.writeInt(this.f308d);
    }
}
