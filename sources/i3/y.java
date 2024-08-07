package i3;

import android.view.View;
import androidx.fragment.app.o;

/* compiled from: VisibilityPropagation */
public abstract class y extends o {

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f11071b = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    public static int J(p pVar, int i10) {
        int[] iArr;
        if (pVar == null || (iArr = (int[]) pVar.f11062a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i10];
    }

    public void c(p pVar) {
        View view = pVar.f11063b;
        Integer num = (Integer) pVar.f11062a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        pVar.f11062a.put("android:visibilityPropagation:visibility", num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int round = Math.round(view.getTranslationX()) + iArr[0];
        iArr[0] = round;
        iArr[0] = (view.getWidth() / 2) + round;
        int round2 = Math.round(view.getTranslationY()) + iArr[1];
        iArr[1] = round2;
        iArr[1] = (view.getHeight() / 2) + round2;
        pVar.f11062a.put("android:visibilityPropagation:center", iArr);
    }

    public void p() {
    }
}
