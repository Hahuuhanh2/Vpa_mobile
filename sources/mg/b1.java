package mg;

import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import com.google.android.material.button.MaterialButton;
import com.ots.core.utils.customview.textview.AppTextView;
import d2.l;

/* compiled from: ActivityRegisterAccountBinding */
public abstract class b1 extends l {
    public final RadioButton A;
    public final AppTextView B;

    /* renamed from: w  reason: collision with root package name */
    public final ImageButton f20968w;

    /* renamed from: x  reason: collision with root package name */
    public final MaterialButton f20969x;

    /* renamed from: y  reason: collision with root package name */
    public final RelativeLayout f20970y;

    /* renamed from: z  reason: collision with root package name */
    public final RadioButton f20971z;

    public b1(Object obj, View view, ImageButton imageButton, MaterialButton materialButton, RelativeLayout relativeLayout, RadioButton radioButton, RadioButton radioButton2, AppTextView appTextView) {
        super(0, view, obj);
        this.f20968w = imageButton;
        this.f20969x = materialButton;
        this.f20970y = relativeLayout;
        this.f20971z = radioButton;
        this.A = radioButton2;
        this.B = appTextView;
    }
}
