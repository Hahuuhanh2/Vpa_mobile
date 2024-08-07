package mg;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.kizitonwose.calendar.view.CalendarView;
import d2.l;
import z.j;

/* compiled from: TimePickerBinding */
public abstract class r7 extends l {
    public static final /* synthetic */ int D = 0;
    public final ImageView A;
    public final j B;
    public final TextView C;

    /* renamed from: w  reason: collision with root package name */
    public final MaterialButton f21333w;

    /* renamed from: x  reason: collision with root package name */
    public final CalendarView f21334x;

    /* renamed from: y  reason: collision with root package name */
    public final ImageView f21335y;

    /* renamed from: z  reason: collision with root package name */
    public final ImageView f21336z;

    public r7(Object obj, View view, MaterialButton materialButton, CalendarView calendarView, ImageView imageView, ImageView imageView2, ImageView imageView3, j jVar, TextView textView) {
        super(0, view, obj);
        this.f21333w = materialButton;
        this.f21334x = calendarView;
        this.f21335y = imageView;
        this.f21336z = imageView2;
        this.A = imageView3;
        this.B = jVar;
        this.C = textView;
    }
}
