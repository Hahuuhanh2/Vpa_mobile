package i2;

import fk.h;
import h2.b;
import java.io.File;
import rk.a;
import sk.j;
import sk.k;

/* compiled from: PreferenceDataStoreFactory.kt */
public final class d extends k implements a<File> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a<File> f11023a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(b bVar) {
        super(0);
        this.f11023a = bVar;
    }

    public final Object invoke() {
        File invoke = this.f11023a.invoke();
        if (j.a(h.s0(invoke), "preferences_pb")) {
            return invoke;
        }
        throw new IllegalStateException(("File extension for file: " + invoke + " does not match required extension for Preferences file: " + "preferences_pb").toString());
    }
}
