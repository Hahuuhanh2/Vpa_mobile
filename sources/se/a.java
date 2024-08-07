package se;

import com.luck.picture.lib.magical.ViewParams;
import java.util.ArrayList;

/* compiled from: BuildRecycleItemViewParams */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList f14748a = new ArrayList();

    public static ViewParams a(int i10) {
        ArrayList arrayList = f14748a;
        if (arrayList.size() > i10) {
            return (ViewParams) arrayList.get(i10);
        }
        return null;
    }
}
