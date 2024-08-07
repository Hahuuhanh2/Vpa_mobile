package v4;

/* compiled from: IntegerArrayAdapter */
public final class g implements a<int[]> {
    public final String a() {
        return "IntegerArrayPool";
    }

    public final int b() {
        return 4;
    }

    public final int c(Object obj) {
        return ((int[]) obj).length;
    }

    public final Object newArray(int i10) {
        return new int[i10];
    }
}
