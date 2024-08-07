package fe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.entity.LocalMedia;
import ge.c;
import ge.e;
import ge.i;
import java.util.ArrayList;

/* compiled from: PictureImageGridAdapter */
public final class d extends RecyclerView.e<c> {

    /* renamed from: d  reason: collision with root package name */
    public boolean f10203d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<LocalMedia> f10204e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public final ke.a f10205f;

    /* renamed from: n  reason: collision with root package name */
    public a f10206n;

    /* compiled from: PictureImageGridAdapter */
    public interface a {
    }

    public d(Context context, ke.a aVar) {
        this.f10205f = aVar;
    }

    public final int c() {
        if (this.f10203d) {
            return this.f10204e.size() + 1;
        }
        return this.f10204e.size();
    }

    public final int e(int i10) {
        boolean z10 = this.f10203d;
        if (z10 && i10 == 0) {
            return 1;
        }
        if (z10) {
            i10--;
        }
        String str = this.f10204e.get(i10).f8086v;
        if (j7.a.Z(str)) {
            return 3;
        }
        if (j7.a.U(str)) {
            return 4;
        }
        return 2;
    }

    public final void i(RecyclerView.a0 a0Var, int i10) {
        c cVar = (c) a0Var;
        if (e(i10) == 1) {
            cVar.f3013a.setOnClickListener(new c(this));
            return;
        }
        if (this.f10203d) {
            i10--;
        }
        cVar.r(this.f10204e.get(i10), i10);
        cVar.C = this.f10206n;
    }

    public final RecyclerView.a0 k(RecyclerView recyclerView, int i10) {
        int i11;
        if (i10 == 1) {
            i11 = R$layout.ps_item_grid_camera;
        } else if (i10 == 3) {
            i11 = R$layout.ps_item_grid_video;
        } else if (i10 != 4) {
            i11 = R$layout.ps_item_grid_image;
        } else {
            i11 = R$layout.ps_item_grid_audio;
        }
        ke.a aVar = this.f10205f;
        int i12 = c.D;
        View inflate = LayoutInflater.from(recyclerView.getContext()).inflate(i11, recyclerView, false);
        if (i10 == 1) {
            return new ge.d(inflate);
        }
        if (i10 == 3) {
            return new i(inflate, aVar);
        }
        if (i10 != 4) {
            return new e(inflate, aVar);
        }
        return new ge.a(inflate, aVar);
    }
}
