package t7;

import android.util.Property;
import android.view.ViewGroup;
import com.google.android.material.R$id;

/* compiled from: ChildrenAlphaProperty */
public final class d extends Property<ViewGroup, Float> {

    /* renamed from: a  reason: collision with root package name */
    public static final d f14891a = new d();

    public d() {
        super(Float.class, "childrenAlpha");
    }

    public final Object get(Object obj) {
        Float f10 = (Float) ((ViewGroup) obj).getTag(R$id.mtrl_internal_children_alpha_tag);
        if (f10 != null) {
            return f10;
        }
        return Float.valueOf(1.0f);
    }

    public final void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        float floatValue = ((Float) obj2).floatValue();
        viewGroup.setTag(R$id.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            viewGroup.getChildAt(i10).setAlpha(floatValue);
        }
    }
}
