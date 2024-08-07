package fe;

import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.entity.LocalMedia;
import ge.b;
import java.util.LinkedHashMap;
import java.util.List;
import ke.a;

/* compiled from: PicturePreviewAdapter */
public final class e extends RecyclerView.e<b> {

    /* renamed from: d  reason: collision with root package name */
    public List<LocalMedia> f10207d;

    /* renamed from: e  reason: collision with root package name */
    public b.a f10208e;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashMap<Integer, b> f10209f = new LinkedHashMap<>();

    public e(a aVar) {
    }

    public final int c() {
        List<LocalMedia> list = this.f10207d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final int e(int i10) {
        if (j7.a.Z(this.f10207d.get(i10).f8086v)) {
            return 2;
        }
        if (j7.a.U(this.f10207d.get(i10).f8086v)) {
            return 3;
        }
        return 1;
    }

    public final void i(RecyclerView.a0 a0Var, int i10) {
        LocalMedia localMedia;
        b bVar = (b) a0Var;
        bVar.A = this.f10208e;
        if (i10 > this.f10207d.size()) {
            localMedia = null;
        } else {
            localMedia = this.f10207d.get(i10);
        }
        this.f10209f.put(Integer.valueOf(i10), bVar);
        bVar.r(localMedia, i10);
    }

    public final RecyclerView.a0 k(RecyclerView recyclerView, int i10) {
        if (i10 == 2) {
            recyclerView.getContext();
            return b.t(recyclerView, i10, R$layout.ps_preview_video);
        } else if (i10 == 3) {
            recyclerView.getContext();
            return b.t(recyclerView, i10, R$layout.ps_preview_audio);
        } else {
            recyclerView.getContext();
            return b.t(recyclerView, i10, R$layout.ps_preview_image);
        }
    }

    public final void n(RecyclerView.a0 a0Var) {
        ((b) a0Var).y();
    }

    public final void o(RecyclerView.a0 a0Var) {
        ((b) a0Var).z();
    }

    public final void t() {
        for (Integer num : this.f10209f.keySet()) {
            b bVar = this.f10209f.get(num);
            if (bVar != null) {
                bVar.A();
            }
        }
    }

    public final b u(int i10) {
        return this.f10209f.get(Integer.valueOf(i10));
    }
}
