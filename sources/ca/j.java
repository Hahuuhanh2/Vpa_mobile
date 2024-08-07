package ca;

import com.google.firebase.components.ComponentRegistrar;
import m9.d;
import za.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4629a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4630b;

    public /* synthetic */ j(Object obj, int i10) {
        this.f4629a = i10;
        this.f4630b = obj;
    }

    public final Object get() {
        switch (this.f4629a) {
            case 0:
                return (ComponentRegistrar) this.f4630b;
            default:
                Object obj = ab.b.f143m;
                return new cb.b((d) this.f4630b);
        }
    }
}
