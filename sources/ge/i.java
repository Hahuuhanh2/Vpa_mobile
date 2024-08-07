package ge;

import android.view.View;
import android.widget.TextView;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.entity.LocalMedia;
import ke.a;
import xe.b;

/* compiled from: VideoViewHolder */
public final class i extends c {
    public final TextView E;

    public i(View view, a aVar) {
        super(view, aVar);
        this.E = (TextView) view.findViewById(R$id.tv_duration);
        this.f10464y.U.b().getClass();
    }

    public final void r(LocalMedia localMedia, int i10) {
        super.r(localMedia, i10);
        this.E.setText(b.b(localMedia.f8081q));
    }
}
