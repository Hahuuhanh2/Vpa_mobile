package u4;

import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p5.a;
import s4.h;
import u4.j;
import v1.d;

/* compiled from: LoadPath */
public final class s<Data, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final d<List<Throwable>> f15243a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends k<Data, ResourceType, Transcode>> f15244b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15245c;

    public s(Class cls, Class cls2, Class cls3, List list, a.c cVar) {
        this.f15243a = cVar;
        if (!list.isEmpty()) {
            this.f15244b = list;
            StringBuilder q10 = android.support.v4.media.a.q("Failed LoadPath{");
            q10.append(cls.getSimpleName());
            q10.append("->");
            q10.append(cls2.getSimpleName());
            q10.append("->");
            q10.append(cls3.getSimpleName());
            q10.append("}");
            this.f15245c = q10.toString();
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final u a(int i10, int i11, h hVar, e eVar, j.b bVar) {
        u uVar;
        List<Throwable> b10 = this.f15243a.b();
        j7.a.r(b10);
        List list = b10;
        try {
            int size = this.f15244b.size();
            uVar = null;
            for (int i12 = 0; i12 < size; i12++) {
                uVar = ((k) this.f15244b.get(i12)).a(i10, i11, hVar, eVar, bVar);
                if (uVar != null) {
                    break;
                }
            }
        } catch (GlideException e10) {
            list.add(e10);
        } catch (Throwable th2) {
            this.f15243a.a(list);
            throw th2;
        }
        if (uVar != null) {
            this.f15243a.a(list);
            return uVar;
        }
        throw new GlideException(this.f15245c, new ArrayList(list));
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("LoadPath{decodePaths=");
        q10.append(Arrays.toString(this.f15244b.toArray()));
        q10.append('}');
        return q10.toString();
    }
}
