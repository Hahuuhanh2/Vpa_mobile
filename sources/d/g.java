package d;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import e.b;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f8431a;

    public /* synthetic */ g(ComponentActivity componentActivity) {
        this.f8431a = componentActivity;
    }

    public final void a() {
        ComponentActivity componentActivity = this.f8431a;
        Bundle a10 = componentActivity.f271e.f89b.a("android:support:activity-result");
        if (a10 != null) {
            ComponentActivity.a aVar = componentActivity.f278s;
            aVar.getClass();
            ArrayList<Integer> integerArrayList = a10.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                aVar.f9506d = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                aVar.f9509g.putAll(a10.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                    String str = stringArrayList.get(i10);
                    if (aVar.f9504b.containsKey(str)) {
                        Integer num = (Integer) aVar.f9504b.remove(str);
                        if (!aVar.f9509g.containsKey(str)) {
                            aVar.f9503a.remove(num);
                        }
                    }
                    int intValue = integerArrayList.get(i10).intValue();
                    String str2 = stringArrayList.get(i10);
                    aVar.f9503a.put(Integer.valueOf(intValue), str2);
                    aVar.f9504b.put(str2, Integer.valueOf(intValue));
                }
            }
        }
    }
}
