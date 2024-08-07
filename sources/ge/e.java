package ge;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.entity.LocalMedia;
import ke.a;

/* compiled from: ImageViewHolder */
public final class e extends c {
    public final ImageView E;
    public final TextView F;

    public e(View view, a aVar) {
        super(view, aVar);
        this.F = (TextView) view.findViewById(R$id.tv_media_tag);
        this.E = (ImageView) view.findViewById(R$id.ivEditor);
        this.f10464y.U.b().getClass();
    }

    public final void r(LocalMedia localMedia, int i10) {
        boolean z10;
        super.r(localMedia, i10);
        boolean z11 = false;
        if (!localMedia.e() || !localMedia.d()) {
            this.E.setVisibility(8);
        } else {
            this.E.setVisibility(0);
        }
        this.F.setVisibility(0);
        if (j7.a.W(localMedia.f8086v)) {
            this.F.setText(this.f10463x.getString(R$string.ps_gif_tag));
            return;
        }
        String str = localMedia.f8086v;
        if (str == null || !str.equalsIgnoreCase("image/webp")) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.F.setText(this.f10463x.getString(R$string.ps_webp_tag));
            return;
        }
        int i11 = localMedia.f8090z;
        int i12 = localMedia.A;
        if (i11 > 0 && i12 > 0 && i12 > i11 * 3) {
            z11 = true;
        }
        if (z11) {
            this.F.setText(this.f10463x.getString(R$string.ps_long_chart));
        } else {
            this.F.setVisibility(8);
        }
    }
}
