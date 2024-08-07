package j$.time.format;

public enum TextStyle {
    FULL(0),
    FULL_STANDALONE(0),
    SHORT(1),
    SHORT_STANDALONE(1),
    NARROW(1),
    NARROW_STANDALONE(1);
    

    /* renamed from: a  reason: collision with root package name */
    private final int f18141a;

    private TextStyle(int i10) {
        this.f18141a = i10;
    }

    /* access modifiers changed from: package-private */
    public final int m() {
        return this.f18141a;
    }
}
