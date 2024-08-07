package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

public final class MediaSessionCompat {

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public ResultReceiver f234a;

        public static class a implements Parcelable.Creator<ResultReceiverWrapper> {
            public final Object createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            public final Object[] newArray(int i10) {
                return new ResultReceiverWrapper[i10];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f234a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            this.f234a.writeToParcel(parcel, i10);
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final Object f235a;

        /* renamed from: b  reason: collision with root package name */
        public b f236b;

        public static class a implements Parcelable.Creator<Token> {
            public final Object createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable((ClassLoader) null), (b) null);
            }

            public final Object[] newArray(int i10) {
                return new Token[i10];
            }
        }

        public Token(Parcelable parcelable, b bVar) {
            this.f235a = parcelable;
            this.f236b = bVar;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f235a;
            if (obj2 != null) {
                Object obj3 = token.f235a;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            } else if (token.f235a == null) {
                return true;
            } else {
                return false;
            }
        }

        public final int hashCode() {
            Object obj = this.f235a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable((Parcelable) this.f235a, i10);
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final MediaDescriptionCompat f231a;

        /* renamed from: b  reason: collision with root package name */
        public final long f232b;

        /* renamed from: c  reason: collision with root package name */
        public Object f233c;

        public static class a implements Parcelable.Creator<QueueItem> {
            public final Object createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            public final Object[] newArray(int i10) {
                return new QueueItem[i10];
            }
        }

        public QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j10 != -1) {
                this.f231a = mediaDescriptionCompat;
                this.f232b = j10;
                this.f233c = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("MediaSession.QueueItem {Description=");
            q10.append(this.f231a);
            q10.append(", Id=");
            q10.append(this.f232b);
            q10.append(" }");
            return q10.toString();
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            this.f231a.writeToParcel(parcel, i10);
            parcel.writeLong(this.f232b);
        }

        public QueueItem(Parcel parcel) {
            this.f231a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f232b = parcel.readLong();
        }
    }
}
