package mg;

import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.material.button.MaterialButton;
import d2.l;
import h1.a;

/* compiled from: ActivityAuctionReportBinding */
public abstract class k extends l {
    public final a A;

    /* renamed from: w  reason: collision with root package name */
    public final MaterialButton f21138w;

    /* renamed from: x  reason: collision with root package name */
    public final CheckBox f21139x;

    /* renamed from: y  reason: collision with root package name */
    public final RelativeLayout f21140y;

    /* renamed from: z  reason: collision with root package name */
    public final PDFView f21141z;

    public k(Object obj, View view, MaterialButton materialButton, CheckBox checkBox, RelativeLayout relativeLayout, PDFView pDFView, a aVar) {
        super(0, view, obj);
        this.f21138w = materialButton;
        this.f21139x = checkBox;
        this.f21140y = relativeLayout;
        this.f21141z = pDFView;
        this.A = aVar;
    }
}
