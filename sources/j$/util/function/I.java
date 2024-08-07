package j$.util.function;

public final /* synthetic */ class I implements L {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ L f18494a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ L f18495b;

    public /* synthetic */ I(L l10, L l11) {
        this.f18494a = l10;
        this.f18495b = l11;
    }

    public final void accept(int i10) {
        L l10 = this.f18494a;
        L l11 = this.f18495b;
        l10.accept(i10);
        l11.accept(i10);
    }

    public final L n(L l10) {
        l10.getClass();
        return new I(this, l10);
    }
}
