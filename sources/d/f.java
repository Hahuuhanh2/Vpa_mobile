package d;

import a3.c;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.v;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8429a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f8430b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f8429a = i10;
        this.f8430b = obj;
    }

    public final Bundle a() {
        switch (this.f8429a) {
            case 0:
                ComponentActivity componentActivity = (ComponentActivity) this.f8430b;
                int i10 = ComponentActivity.A;
                componentActivity.getClass();
                Bundle bundle = new Bundle();
                ComponentActivity.a aVar = componentActivity.f278s;
                aVar.getClass();
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(aVar.f9504b.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(aVar.f9504b.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(aVar.f9506d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) aVar.f9509g.clone());
                return bundle;
            default:
                return v.a((v) this.f8430b);
        }
    }
}
