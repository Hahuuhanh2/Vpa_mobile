package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;
import p3.l0;
import y6.i;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f5376a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f5377b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5378c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5379d;

    public WebImage(int i10, Uri uri, int i11, int i12) {
        this.f5376a = i10;
        this.f5377b = uri;
        this.f5378c = i11;
        this.f5379d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (i.a(this.f5377b, webImage.f5377b) && this.f5378c == webImage.f5378c && this.f5379d == webImage.f5379d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5377b, Integer.valueOf(this.f5378c), Integer.valueOf(this.f5379d)});
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.f5378c), Integer.valueOf(this.f5379d), this.f5377b.toString()});
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5376a);
        l0.e1(parcel, 2, this.f5377b, i10);
        l0.b1(parcel, 3, this.f5378c);
        l0.b1(parcel, 4, this.f5379d);
        l0.o1(n12, parcel);
    }
}
