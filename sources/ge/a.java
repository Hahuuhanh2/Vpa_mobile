package ge;

import android.view.View;
import android.widget.TextView;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.entity.LocalMedia;
import xe.b;

/* compiled from: AudioViewHolder */
public final class a extends c {
    public final TextView E;

    public a(View view, ke.a aVar) {
        super(view, aVar);
        this.E = (TextView) view.findViewById(R$id.tv_duration);
        this.f10464y.U.b().getClass();
    }

    public final void r(LocalMedia localMedia, int i10) {
        super.r(localMedia, i10);
        this.E.setText(b.b(localMedia.f8081q));
    }

    public final void t(String str) {
        this.f10460u.setImageResource(R$drawable.ps_audio_placeholder);
    }
}
