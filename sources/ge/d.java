package ge;

import android.view.View;
import android.widget.TextView;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$string;
import ke.a;
import ke.b;
import p3.l0;

/* compiled from: CameraViewHolder */
public final class d extends c {
    public d(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R$id.tvCamera);
        a b10 = b.a().b();
        this.f10464y = b10;
        b10.U.b().getClass();
        if (l0.s()) {
            textView.setText((CharSequence) null);
        } else if (this.f10464y.f12517a == 3) {
            textView.setText(view.getContext().getString(R$string.ps_tape));
        }
    }
}
