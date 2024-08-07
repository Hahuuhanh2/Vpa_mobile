package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;
import java.nio.charset.Charset;

public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2120a = versionedParcel.j(iconCompat.f2120a, 1);
        byte[] bArr = iconCompat.f2122c;
        if (versionedParcel.h(2)) {
            bArr = versionedParcel.f();
        }
        iconCompat.f2122c = bArr;
        Parcelable parcelable = iconCompat.f2123d;
        if (versionedParcel.h(3)) {
            parcelable = versionedParcel.k();
        }
        iconCompat.f2123d = parcelable;
        iconCompat.f2124e = versionedParcel.j(iconCompat.f2124e, 4);
        iconCompat.f2125f = versionedParcel.j(iconCompat.f2125f, 5);
        Object obj = iconCompat.f2126g;
        if (versionedParcel.h(6)) {
            obj = versionedParcel.k();
        }
        iconCompat.f2126g = (ColorStateList) obj;
        String str = iconCompat.f2128i;
        if (versionedParcel.h(7)) {
            str = versionedParcel.l();
        }
        iconCompat.f2128i = str;
        String str2 = iconCompat.f2129j;
        if (versionedParcel.h(8)) {
            str2 = versionedParcel.l();
        }
        iconCompat.f2129j = str2;
        iconCompat.f2127h = PorterDuff.Mode.valueOf(iconCompat.f2128i);
        switch (iconCompat.f2120a) {
            case -1:
                Parcelable parcelable2 = iconCompat.f2123d;
                if (parcelable2 != null) {
                    iconCompat.f2121b = parcelable2;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case 5:
                Parcelable parcelable3 = iconCompat.f2123d;
                if (parcelable3 == null) {
                    byte[] bArr2 = iconCompat.f2122c;
                    iconCompat.f2121b = bArr2;
                    iconCompat.f2120a = 3;
                    iconCompat.f2124e = 0;
                    iconCompat.f2125f = bArr2.length;
                    break;
                } else {
                    iconCompat.f2121b = parcelable3;
                    break;
                }
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f2122c, Charset.forName("UTF-16"));
                iconCompat.f2121b = str3;
                if (iconCompat.f2120a == 2 && iconCompat.f2129j == null) {
                    iconCompat.f2129j = str3.split(":", -1)[0];
                    break;
                }
            case 3:
                iconCompat.f2121b = iconCompat.f2122c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        iconCompat.f2128i = iconCompat.f2127h.name();
        switch (iconCompat.f2120a) {
            case -1:
                iconCompat.f2123d = (Parcelable) iconCompat.f2121b;
                break;
            case 1:
            case 5:
                iconCompat.f2123d = (Parcelable) iconCompat.f2121b;
                break;
            case 2:
                iconCompat.f2122c = ((String) iconCompat.f2121b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f2122c = (byte[]) iconCompat.f2121b;
                break;
            case 4:
            case 6:
                iconCompat.f2122c = iconCompat.f2121b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f2120a;
        if (-1 != i10) {
            versionedParcel.s(i10, 1);
        }
        byte[] bArr = iconCompat.f2122c;
        if (bArr != null) {
            versionedParcel.n(2);
            versionedParcel.p(bArr);
        }
        Parcelable parcelable = iconCompat.f2123d;
        if (parcelable != null) {
            versionedParcel.n(3);
            versionedParcel.t(parcelable);
        }
        int i11 = iconCompat.f2124e;
        if (i11 != 0) {
            versionedParcel.s(i11, 4);
        }
        int i12 = iconCompat.f2125f;
        if (i12 != 0) {
            versionedParcel.s(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f2126g;
        if (colorStateList != null) {
            versionedParcel.n(6);
            versionedParcel.t(colorStateList);
        }
        String str = iconCompat.f2128i;
        if (str != null) {
            versionedParcel.n(7);
            versionedParcel.u(str);
        }
        String str2 = iconCompat.f2129j;
        if (str2 != null) {
            versionedParcel.n(8);
            versionedParcel.u(str2);
        }
    }
}
