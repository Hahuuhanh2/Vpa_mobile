package q9;

import android.os.Bundle;
import java.util.Arrays;
import m9.b;
import u8.c;
import u8.d;
import u8.f;
import u8.j;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final f<String> f14374a = f.s("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b  reason: collision with root package name */
    public static final j f14375b;

    /* renamed from: c  reason: collision with root package name */
    public static final j f14376c;

    /* renamed from: d  reason: collision with root package name */
    public static final j f14377d;

    /* renamed from: e  reason: collision with root package name */
    public static final j f14378e;

    /* renamed from: f  reason: collision with root package name */
    public static final j f14379f;

    static {
        d.a aVar = d.f15312b;
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        b.i(7, objArr);
        f14375b = d.o(7, objArr);
        Object[] objArr2 = {"auto", "app", "am"};
        b.i(3, objArr2);
        f14376c = d.o(3, objArr2);
        Object[] objArr3 = {"_r", "_dbg"};
        b.i(2, objArr3);
        f14377d = d.o(2, objArr3);
        j7.a.q(4, "initialCapacity");
        String[] strArr = j7.a.f11715w;
        b.i(16, strArr);
        Object[] copyOf = Arrays.copyOf(new Object[4], c.a.a(4, 16));
        System.arraycopy(strArr, 0, copyOf, 0, 16);
        String[] strArr2 = j7.a.f11716x;
        b.i(16, strArr2);
        if (copyOf.length < 32) {
            copyOf = Arrays.copyOf(copyOf, c.a.a(copyOf.length, 32));
        }
        System.arraycopy(strArr2, 0, copyOf, 16, 16);
        f14378e = d.o(32, copyOf);
        Object[] objArr4 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        b.i(2, objArr4);
        f14379f = d.o(2, objArr4);
    }

    public static boolean a(Bundle bundle, String str) {
        if (f14375b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        j jVar = f14377d;
        int i10 = jVar.f15376d;
        int i11 = 0;
        while (i11 < i10) {
            Object obj = jVar.get(i11);
            i11++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals("fcm") || str.equals("frc")) {
                return true;
            }
            return false;
        } else if ("_ln".equals(str2)) {
            if (str.equals("fcm") || str.equals("fiam")) {
                return true;
            }
            return false;
        } else if (f14378e.contains(str2)) {
            return false;
        } else {
            j jVar = f14379f;
            int i10 = jVar.f15376d;
            int i11 = 0;
            while (i11 < i10) {
                Object obj = jVar.get(i11);
                i11++;
                if (str2.matches((String) obj)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean c(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!d(str) || bundle == null) {
            return false;
        }
        j jVar = f14377d;
        int i10 = jVar.f15376d;
        int i11 = 0;
        while (i11 < i10) {
            Object obj = jVar.get(i11);
            i11++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        char c10 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    c10 = 2;
                }
            } else if (str.equals("fdl")) {
                c10 = 1;
            }
        } else if (str.equals("fcm")) {
            c10 = 0;
        }
        if (c10 == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        } else if (c10 == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        } else if (c10 != 2) {
            return false;
        } else {
            bundle.putString("_cis", "fiam_integration");
            return true;
        }
    }

    public static boolean d(String str) {
        if (!f14376c.contains(str)) {
            return true;
        }
        return false;
    }
}
