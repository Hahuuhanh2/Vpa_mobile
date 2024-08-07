package d4;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import n4.g;

/* compiled from: CompoundTrimPathContent */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final List f8618a;

    public /* synthetic */ b() {
        this.f8618a = new ArrayList();
    }

    public /* synthetic */ b(List list) {
        this.f8618a = list;
    }

    public final void a(Path path) {
        int size = this.f8618a.size();
        while (true) {
            size--;
            if (size >= 0) {
                u uVar = (u) this.f8618a.get(size);
                g.a aVar = g.f13513a;
                if (uVar != null && !uVar.f8736a) {
                    g.a(path, uVar.f8739d.l() / 100.0f, uVar.f8740e.l() / 100.0f, uVar.f8741f.l() / 360.0f);
                }
            } else {
                return;
            }
        }
    }
}
