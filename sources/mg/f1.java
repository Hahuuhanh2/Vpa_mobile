package mg;

import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.material.button.MaterialButton;
import d2.l;
import h1.a;

/* compiled from: ActivityRegulationBinding */
public abstract class f1 extends l {
    public final a A;

    /* renamed from: w  reason: collision with root package name */
    public final MaterialButton f21055w;

    /* renamed from: x  reason: collision with root package name */
    public final CheckBox f21056x;

    /* renamed from: y  reason: collision with root package name */
    public final RelativeLayout f21057y;

    /* renamed from: z  reason: collision with root package name */
    public final PDFView f21058z;

    public f1(Object obj, View view, MaterialButton materialButton, CheckBox checkBox, RelativeLayout relativeLayout, PDFView pDFView, a aVar) {
        super(0, view, obj);
        this.f21055w = materialButton;
        this.f21056x = checkBox;
        this.f21057y = relativeLayout;
        this.f21058z = pDFView;
        this.A = aVar;
    }
}
