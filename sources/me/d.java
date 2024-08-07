package me;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.g;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$style;
import je.e;
import qe.c;

/* compiled from: PhotoItemSelectedDialog */
public class d extends g implements View.OnClickListener {

    /* renamed from: u0  reason: collision with root package name */
    public c f13284u0;

    /* renamed from: v0  reason: collision with root package name */
    public a f13285v0;

    /* compiled from: PhotoItemSelectedDialog */
    public interface a {
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Dialog dialog = this.f2630p0;
        if (dialog != null) {
            dialog.requestWindowFeature(1);
            if (this.f2630p0.getWindow() != null) {
                this.f2630p0.getWindow().setBackgroundDrawableResource(17170445);
            }
        }
        return layoutInflater.inflate(R$layout.ps_dialog_camera_selected, viewGroup);
    }

    public final void U() {
        Window window;
        super.U();
        Dialog dialog = this.f2630p0;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(xe.c.e(r()), -2);
            window.setGravity(80);
            window.setWindowAnimations(R$style.PictureThemeDialogFragmentAnim);
        }
    }

    public final void W(View view, Bundle bundle) {
        ((TextView) view.findViewById(R$id.ps_tv_video)).setOnClickListener(this);
        ((TextView) view.findViewById(R$id.ps_tv_photo)).setOnClickListener(this);
        ((TextView) view.findViewById(R$id.ps_tv_cancel)).setOnClickListener(this);
    }

    public final void n0(FragmentManager fragmentManager, String str) {
        fragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        aVar.g(0, this, "PhotoItemSelectedDialog", 1);
        aVar.d();
    }

    public final void onClick(View view) {
        int id2 = view.getId();
        c cVar = this.f13284u0;
        if (cVar != null) {
            if (id2 == R$id.ps_tv_photo) {
                ((je.d) cVar).c(0);
            } else if (id2 == R$id.ps_tv_video) {
                ((je.d) cVar).c(1);
            }
        }
        i0();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        a aVar = this.f13285v0;
        if (aVar != null) {
            ((e) aVar).f11869a.f11878i0.getClass();
        }
    }
}
