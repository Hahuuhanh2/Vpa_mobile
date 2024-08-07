package com.google.android.gms.internal.mlkit_common;

import f0.b0;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final class zzag {
    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e10) {
                    String s10 = b0.s(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(s10), e10);
                    str2 = "<" + s10 + " threw " + e10.getClass().getName() + ">";
                }
            }
            objArr[i11] = str2;
            i11++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (indexOf = str.indexOf("%s", i12)) == -1) {
                sb2.append(str, i12, str.length());
            } else {
                sb2.append(str, i12, indexOf);
                sb2.append(objArr[i10]);
                i12 = indexOf + 2;
                i10++;
            }
        }
        sb2.append(str, i12, str.length());
        if (i10 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static String zzb(String str) {
        int i10 = zzae.zza;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static boolean zzc(String str) {
        int i10 = zzae.zza;
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }
}
