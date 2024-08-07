package v;

import f0.r0;
import f0.s0;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class v {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f15900a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static /* synthetic */ boolean a(int i10, int i11) {
        if (i10 != 0) {
            return i10 == i11;
        }
        throw null;
    }

    public static r0 b(int i10, s0.a aVar, r0 r0Var, int i11, s0.a aVar2, int i12, s0.a aVar3, ArrayList arrayList, r0 r0Var2) {
        r0Var.a(s0.a(i10, aVar));
        r0Var.a(s0.a(i11, aVar2));
        r0Var.a(s0.a(i12, aVar3));
        arrayList.add(r0Var2);
        return new r0();
    }

    public static r0 c(int i10, s0.a aVar, r0 r0Var, int i11, s0.a aVar2, ArrayList arrayList, r0 r0Var2) {
        r0Var.a(s0.a(i10, aVar));
        r0Var.a(s0.a(i11, aVar2));
        arrayList.add(r0Var2);
        return new r0();
    }

    public static String d(String str, int i10, String str2) {
        return str + i10 + str2;
    }

    public static String e(StringBuilder sb2, int i10, String str) {
        sb2.append(i10);
        sb2.append(str);
        return sb2.toString();
    }

    public static /* synthetic */ String f(int i10) {
        if (i10 == 1) {
            return "INITIALIZED";
        }
        if (i10 == 2) {
            return "PENDING_OPEN";
        }
        if (i10 == 3) {
            return "OPENING";
        }
        if (i10 == 4) {
            return "OPENED";
        }
        if (i10 == 5) {
            return "CONFIGURED";
        }
        if (i10 == 6) {
            return "CLOSING";
        }
        if (i10 == 7) {
            return "REOPENING";
        }
        if (i10 == 8) {
            return "RELEASING";
        }
        if (i10 == 9) {
            return "RELEASED";
        }
        throw null;
    }

    public static /* synthetic */ int g(int i10) {
        if (i10 != 0) {
            return i10 - 1;
        }
        throw null;
    }

    public static /* synthetic */ String h(int i10) {
        return i10 == 1 ? "INITIALIZED" : i10 == 2 ? "PENDING_OPEN" : i10 == 3 ? "OPENING" : i10 == 4 ? "OPENED" : i10 == 5 ? "CONFIGURED" : i10 == 6 ? "CLOSING" : i10 == 7 ? "REOPENING" : i10 == 8 ? "RELEASING" : i10 == 9 ? "RELEASED" : "null";
    }

    public static /* synthetic */ String i(int i10) {
        return i10 == 1 ? "UNINITIALIZED" : i10 == 2 ? "INITIALIZED" : i10 == 3 ? "GET_SURFACE" : i10 == 4 ? "OPENING" : i10 == 5 ? "OPENED" : i10 == 6 ? "CLOSED" : i10 == 7 ? "RELEASING" : i10 == 8 ? "RELEASED" : "null";
    }

    public static /* synthetic */ String j(int i10) {
        return i10 == 1 ? "UNINITIALIZED" : i10 == 2 ? "SESSION_INITIALIZED" : i10 == 3 ? "ON_CAPTURE_SESSION_STARTED" : i10 == 4 ? "ON_CAPTURE_SESSION_ENDED" : i10 == 5 ? "DE_INITIALIZED" : "null";
    }

    public static /* synthetic */ int[] k(int i10) {
        int[] iArr = new int[i10];
        System.arraycopy(f15900a, 0, iArr, 0, i10);
        return iArr;
    }
}
