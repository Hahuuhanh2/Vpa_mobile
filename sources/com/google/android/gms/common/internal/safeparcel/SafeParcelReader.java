package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import f0.b0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class SafeParcelReader {

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    public static class ParseException extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ParseException(java.lang.String r3, android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static BigDecimal a(int i10, Parcel parcel) {
        int r10 = r(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (r10 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + r10);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static Bundle b(int i10, Parcel parcel) {
        int r10 = r(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (r10 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + r10);
        return readBundle;
    }

    public static byte[] c(int i10, Parcel parcel) {
        int r10 = r(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (r10 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + r10);
        return createByteArray;
    }

    public static int[] d(int i10, Parcel parcel) {
        int r10 = r(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (r10 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + r10);
        return createIntArray;
    }

    public static <T extends Parcelable> T e(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int r10 = r(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (r10 == 0) {
            return null;
        }
        T t10 = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + r10);
        return t10;
    }

    public static String f(int i10, Parcel parcel) {
        int r10 = r(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (r10 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + r10);
        return readString;
    }

    public static String[] g(int i10, Parcel parcel) {
        int r10 = r(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (r10 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + r10);
        return createStringArray;
    }

    public static ArrayList h(int i10, Parcel parcel) {
        int r10 = r(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (r10 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + r10);
        return createStringArrayList;
    }

    public static <T> T[] i(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int r10 = r(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (r10 == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + r10);
        return createTypedArray;
    }

    public static <T> ArrayList<T> j(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int r10 = r(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (r10 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + r10);
        return createTypedArrayList;
    }

    public static void k(int i10, Parcel parcel) {
        if (parcel.dataPosition() != i10) {
            throw new ParseException(a.m("Overread allowed size end=", i10), parcel);
        }
    }

    public static boolean l(int i10, Parcel parcel) {
        v(parcel, i10, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static double m(int i10, Parcel parcel) {
        v(parcel, i10, 8);
        return parcel.readDouble();
    }

    public static IBinder n(int i10, Parcel parcel) {
        int r10 = r(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (r10 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + r10);
        return readStrongBinder;
    }

    public static int o(int i10, Parcel parcel) {
        v(parcel, i10, 4);
        return parcel.readInt();
    }

    public static long p(int i10, Parcel parcel) {
        v(parcel, i10, 8);
        return parcel.readLong();
    }

    public static Long q(int i10, Parcel parcel) {
        int r10 = r(i10, parcel);
        if (r10 == 0) {
            return null;
        }
        u(parcel, r10, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int r(int i10, Parcel parcel) {
        if ((i10 & -65536) != -65536) {
            return (char) (i10 >> 16);
        }
        return parcel.readInt();
    }

    public static void s(int i10, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + r(i10, parcel));
    }

    public static int t(Parcel parcel) {
        int readInt = parcel.readInt();
        int r10 = r(readInt, parcel);
        char c10 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c10 == 20293) {
            int i10 = r10 + dataPosition;
            if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
                return i10;
            }
            throw new ParseException(b0.p("Size read is invalid start=", dataPosition, " end=", i10), parcel);
        }
        throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    public static void u(Parcel parcel, int i10, int i11) {
        if (i10 != i11) {
            throw new ParseException(a.o(b0.u("Expected size ", i11, " got ", i10, " (0x"), Integer.toHexString(i10), ")"), parcel);
        }
    }

    public static void v(Parcel parcel, int i10, int i11) {
        int r10 = r(i10, parcel);
        if (r10 != i11) {
            throw new ParseException(a.o(b0.u("Expected size ", i11, " got ", r10, " (0x"), Integer.toHexString(r10), ")"), parcel);
        }
    }
}
