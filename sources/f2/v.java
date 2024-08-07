package f2;

import java.io.File;
import java.util.LinkedHashSet;
import rk.a;
import sk.j;
import sk.k;

/* compiled from: SingleProcessDataStore.kt */
public final class v extends k implements a<File> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p<Object> f9877a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(p<Object> pVar) {
        super(0);
        this.f9877a = pVar;
    }

    public final Object invoke() {
        File invoke = this.f9877a.f9809a.invoke();
        String absolutePath = invoke.getAbsolutePath();
        synchronized (p.f9808l) {
            LinkedHashSet linkedHashSet = p.f9807k;
            if (!linkedHashSet.contains(absolutePath)) {
                j.e(absolutePath, "it");
                linkedHashSet.add(absolutePath);
            } else {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + invoke + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
        }
        return invoke;
    }
}
