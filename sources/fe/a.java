package fe;

import android.view.View;
import com.luck.picture.lib.entity.LocalMediaFolder;
import ee.c;
import ee.f;
import ee.k;

/* compiled from: PictureAlbumAdapter */
public final class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LocalMediaFolder f10194a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f10195b;

    public a(b bVar, int i10, LocalMediaFolder localMediaFolder) {
        this.f10195b = bVar;
        this.f10194a = localMediaFolder;
    }

    public final void onClick(View view) {
        boolean z10;
        qe.a aVar = this.f10195b.f10198f;
        if (aVar != null) {
            LocalMediaFolder localMediaFolder = this.f10194a;
            f fVar = (f) aVar;
            c cVar = fVar.f9391a;
            String str = c.C0;
            if (!cVar.f11878i0.f12532o || localMediaFolder.f8091a != -1) {
                z10 = false;
            } else {
                z10 = true;
            }
            cVar.f9382z0 = z10;
            cVar.A0.f10203d = z10;
            cVar.f9373q0.setTitle(localMediaFolder.d());
            c cVar2 = fVar.f9391a;
            ke.a aVar2 = cVar2.f11878i0;
            LocalMediaFolder localMediaFolder2 = aVar2.W;
            long j10 = localMediaFolder2.f8091a;
            if (aVar2.I) {
                if (localMediaFolder.f8091a != j10) {
                    localMediaFolder2.f8097n = cVar2.A0.f10204e;
                    localMediaFolder2.f8098o = cVar2.f11876g0;
                    localMediaFolder2.f8099p = cVar2.f9371o0.T0;
                    if (localMediaFolder.a().size() <= 0 || localMediaFolder.f8099p) {
                        c cVar3 = fVar.f9391a;
                        cVar3.f11876g0 = 1;
                        cVar3.f11878i0.getClass();
                        c cVar4 = fVar.f9391a;
                        cVar4.f11877h0.e(localMediaFolder.f8091a, cVar4.f11876g0, cVar4.f11878i0.H, new k(fVar));
                    } else {
                        fVar.f9391a.U0(localMediaFolder.a());
                        c cVar5 = fVar.f9391a;
                        cVar5.f11876g0 = localMediaFolder.f8098o;
                        cVar5.f9371o0.setEnabledLoadMore(localMediaFolder.f8099p);
                        fVar.f9391a.f9371o0.n0(0);
                    }
                }
            } else if (localMediaFolder.f8091a != j10) {
                cVar2.U0(localMediaFolder.a());
                fVar.f9391a.f9371o0.n0(0);
            }
            c cVar6 = fVar.f9391a;
            cVar6.f11878i0.W = localMediaFolder;
            cVar6.B0.dismiss();
            fVar.f9391a.getClass();
        }
    }
}
