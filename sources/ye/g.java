package ye;

import android.widget.CompoundButton;
import gf.b;
import java.util.Iterator;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f17732a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f17733b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17734c;

    public /* synthetic */ g(b bVar, h hVar, int i10) {
        this.f17732a = bVar;
        this.f17733b = hVar;
        this.f17734c = i10;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        Integer num;
        b bVar = this.f17732a;
        h hVar = this.f17733b;
        int i10 = this.f17734c;
        j.f(bVar, "$model");
        j.f(hVar, "this$0");
        bVar.f10499c = z10;
        if (!hVar.f17737r) {
            if (!z10) {
                num = null;
            } else {
                Integer num2 = hVar.f17736q;
                if (num2 != null) {
                    num2.intValue();
                    Iterator<Model> it = hVar.f9444f.iterator();
                    int i11 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i11 = -1;
                            break;
                        } else if (j.a(bVar.b(), ((b) it.next()).b())) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    if (i11 != -1) {
                        ((b) hVar.f9444f.get(i11)).f10499c = false;
                        hVar.g(i11);
                    }
                }
                num = Integer.valueOf(i10);
            }
            hVar.f17736q = num;
        }
        hVar.f17735p.invoke(bVar);
    }
}
