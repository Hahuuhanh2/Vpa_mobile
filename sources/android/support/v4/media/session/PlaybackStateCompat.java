package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f242a;

    /* renamed from: b  reason: collision with root package name */
    public final long f243b;

    /* renamed from: c  reason: collision with root package name */
    public final long f244c;

    /* renamed from: d  reason: collision with root package name */
    public final float f245d;

    /* renamed from: e  reason: collision with root package name */
    public final long f246e;

    /* renamed from: f  reason: collision with root package name */
    public final int f247f;

    /* renamed from: n  reason: collision with root package name */
    public final CharSequence f248n;

    /* renamed from: o  reason: collision with root package name */
    public final long f249o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f250p;

    /* renamed from: q  reason: collision with root package name */
    public final long f251q;

    /* renamed from: r  reason: collision with root package name */
    public final Bundle f252r;

    public static class a implements Parcelable.Creator<PlaybackStateCompat> {
        public final Object createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public final Object[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    public PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, CharSequence charSequence, long j13, ArrayList arrayList, long j14, Bundle bundle) {
        this.f242a = i10;
        this.f243b = j10;
        this.f244c = j11;
        this.f245d = f10;
        this.f246e = j12;
        this.f247f = 0;
        this.f248n = charSequence;
        this.f249o = j13;
        this.f250p = new ArrayList(arrayList);
        this.f251q = j14;
        this.f252r = bundle;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {" + "state=" + this.f242a + ", position=" + this.f243b + ", buffered position=" + this.f244c + ", speed=" + this.f245d + ", updated=" + this.f249o + ", actions=" + this.f246e + ", error code=" + this.f247f + ", error message=" + this.f248n + ", custom actions=" + this.f250p + ", active item id=" + this.f251q + "}";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f242a);
        parcel.writeLong(this.f243b);
        parcel.writeFloat(this.f245d);
        parcel.writeLong(this.f249o);
        parcel.writeLong(this.f244c);
        parcel.writeLong(this.f246e);
        TextUtils.writeToParcel(this.f248n, parcel, i10);
        parcel.writeTypedList(this.f250p);
        parcel.writeLong(this.f251q);
        parcel.writeBundle(this.f252r);
        parcel.writeInt(this.f247f);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final String f253a;

        /* renamed from: b  reason: collision with root package name */
        public final CharSequence f254b;

        /* renamed from: c  reason: collision with root package name */
        public final int f255c;

        /* renamed from: d  reason: collision with root package name */
        public final Bundle f256d;

        /* renamed from: e  reason: collision with root package name */
        public Object f257e;

        public static class a implements Parcelable.Creator<CustomAction> {
            public final Object createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public final Object[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.f253a = str;
            this.f254b = charSequence;
            this.f255c = i10;
            this.f256d = bundle;
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("Action:mName='");
            q10.append(this.f254b);
            q10.append(", mIcon=");
            q10.append(this.f255c);
            q10.append(", mExtras=");
            q10.append(this.f256d);
            return q10.toString();
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f253a);
            TextUtils.writeToParcel(this.f254b, parcel, i10);
            parcel.writeInt(this.f255c);
            parcel.writeBundle(this.f256d);
        }

        public CustomAction(Parcel parcel) {
            this.f253a = parcel.readString();
            this.f254b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f255c = parcel.readInt();
            this.f256d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f242a = parcel.readInt();
        this.f243b = parcel.readLong();
        this.f245d = parcel.readFloat();
        this.f249o = parcel.readLong();
        this.f244c = parcel.readLong();
        this.f246e = parcel.readLong();
        this.f248n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f250p = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f251q = parcel.readLong();
        this.f252r = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f247f = parcel.readInt();
    }
}
