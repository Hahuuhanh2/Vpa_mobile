package j$.time;

import j$.time.temporal.o;

public abstract /* synthetic */ class b {
    public static String a(String str, o oVar) {
        return str + oVar;
    }

    public static StringBuilder b(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static /* synthetic */ String c(int i10) {
        return i10 == 1 ? "UTC" : i10 == 2 ? "WALL" : i10 == 3 ? "STANDARD" : "null";
    }

    public static /* synthetic */ String d(int i10) {
        return i10 == 1 ? "REFERENCE" : i10 == 2 ? "INT_VALUE" : i10 == 3 ? "LONG_VALUE" : i10 == 4 ? "DOUBLE_VALUE" : "null";
    }
}
