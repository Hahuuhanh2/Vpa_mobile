package p002if;

import android.widget.CompoundButton;
import gf.b;
import sk.j;

/* renamed from: if.d  reason: invalid package */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f11441a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f11442b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f11443c;

    public /* synthetic */ d(b bVar, e eVar, int i10) {
        this.f11441a = bVar;
        this.f11442b = eVar;
        this.f11443c = i10;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        Integer num;
        b bVar = this.f11441a;
        e eVar = this.f11442b;
        int i10 = this.f11443c;
        j.f(bVar, "$model");
        j.f(eVar, "this$0");
        bVar.f10499c = z10;
        if (!eVar.f11446r) {
            if (!z10) {
                num = null;
            } else {
                Integer num2 = eVar.f11445q;
                if (num2 != null) {
                    int intValue = num2.intValue();
                    ((b) eVar.f9444f.get(intValue)).f10499c = false;
                    eVar.g(intValue);
                }
                num = Integer.valueOf(i10);
            }
            eVar.f11445q = num;
        }
        eVar.f11444p.invoke(bVar);
    }
}
