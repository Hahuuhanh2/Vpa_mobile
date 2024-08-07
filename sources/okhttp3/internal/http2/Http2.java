package okhttp3.internal.http2;

import android.support.v4.media.a;
import ll.j;
import okhttp3.internal.Util;
import yk.h;

/* compiled from: Http2.kt */
public final class Http2 {

    /* renamed from: a  reason: collision with root package name */
    public static final Http2 f22399a = new Http2();

    /* renamed from: b  reason: collision with root package name */
    public static final j f22400b = j.a.b("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f22401c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f22402d = new String[64];

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f22403e;

    static {
        j jVar = j.f20882d;
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            sk.j.e(binaryString, "toBinaryString(it)");
            String replace = Util.h("%8s", binaryString).replace(' ', '0');
            sk.j.e(replace, "this as java.lang.String…replace(oldChar, newChar)");
            strArr[i10] = replace;
        }
        f22403e = strArr;
        String[] strArr2 = f22402d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i11 = 0; i11 < 1; i11++) {
            int i12 = iArr[i11];
            String[] strArr3 = f22402d;
            strArr3[i12 | 8] = a.o(new StringBuilder(), strArr3[i12], "|PADDED");
        }
        String[] strArr4 = f22402d;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = iArr2[i13];
            for (int i15 = 0; i15 < 1; i15++) {
                int i16 = iArr[i15];
                String[] strArr5 = f22402d;
                int i17 = i16 | i14;
                strArr5[i17] = strArr5[i16] + '|' + strArr5[i14];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strArr5[i16]);
                sb2.append('|');
                strArr5[i17 | 8] = a.o(sb2, strArr5[i14], "|PADDED");
            }
        }
        int length = f22402d.length;
        for (int i18 = 0; i18 < length; i18++) {
            String[] strArr6 = f22402d;
            if (strArr6[i18] == null) {
                strArr6[i18] = f22403e[i18];
            }
        }
    }

    private Http2() {
    }

    public static String a(int i10, int i11, int i12, int i13, boolean z10) {
        String str;
        String str2;
        String str3;
        String str4;
        String[] strArr = f22401c;
        if (i12 < strArr.length) {
            str = strArr[i12];
        } else {
            str = Util.h("0x%02x", Integer.valueOf(i12));
        }
        if (i13 == 0) {
            str2 = "";
        } else {
            if (!(i12 == 2 || i12 == 3)) {
                if (i12 == 4 || i12 == 6) {
                    if (i13 == 1) {
                        str2 = "ACK";
                    } else {
                        str2 = f22403e[i13];
                    }
                } else if (!(i12 == 7 || i12 == 8)) {
                    String[] strArr2 = f22402d;
                    if (i13 < strArr2.length) {
                        str4 = strArr2[i13];
                        sk.j.c(str4);
                    } else {
                        str4 = f22403e[i13];
                    }
                    if (i12 == 5 && (i13 & 4) != 0) {
                        str2 = h.J0(str4, "HEADERS", "PUSH_PROMISE");
                    } else if (i12 != 0 || (i13 & 32) == 0) {
                        str2 = str4;
                    } else {
                        str2 = h.J0(str4, "PRIORITY", "COMPRESSED");
                    }
                }
            }
            str2 = f22403e[i13];
        }
        if (z10) {
            str3 = "<<";
        } else {
            str3 = ">>";
        }
        return Util.h("%s 0x%08x %5d %-13s %s", str3, Integer.valueOf(i10), Integer.valueOf(i11), str, str2);
    }
}
