package xb;

import ua.g;

/* compiled from: SessionEvent.kt */
public enum h implements g {
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f17213a;

    /* access modifiers changed from: public */
    h(int i10) {
        this.f17213a = i10;
    }

    public final int a() {
        return this.f17213a;
    }
}
