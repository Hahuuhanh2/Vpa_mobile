package ah;

import af.d;
import android.view.View;
import android.widget.TextView;
import m9.b;
import sk.j;
import zd.a;

/* compiled from: DialogTimePicker.kt */
public final class g extends b {
    public a K;
    public final TextView L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(d dVar, View view) {
        super(view);
        j.f(dVar, "this$0");
        this.L = (TextView) view;
        view.setOnClickListener(new d(1, this, dVar));
    }
}
