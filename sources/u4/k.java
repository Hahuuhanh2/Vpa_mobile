package u4;

import android.util.Log;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.engine.GlideException;
import g5.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p5.a;
import s4.h;
import s4.j;
import v1.d;

/* compiled from: DecodePath */
public final class k<DataType, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<DataType> f15167a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends j<DataType, ResourceType>> f15168b;

    /* renamed from: c  reason: collision with root package name */
    public final b<ResourceType, Transcode> f15169c;

    /* renamed from: d  reason: collision with root package name */
    public final d<List<Throwable>> f15170d;

    /* renamed from: e  reason: collision with root package name */
    public final String f15171e;

    public k(Class cls, Class cls2, Class cls3, List list, b bVar, a.c cVar) {
        this.f15167a = cls;
        this.f15168b = list;
        this.f15169c = bVar;
        this.f15170d = cVar;
        StringBuilder q10 = android.support.v4.media.a.q("Failed DecodePath{");
        q10.append(cls.getSimpleName());
        q10.append("->");
        q10.append(cls2.getSimpleName());
        q10.append("->");
        q10.append(cls3.getSimpleName());
        q10.append("}");
        this.f15171e = q10.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: u4.u<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: u4.u<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: u4.t<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: u4.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: u4.u<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: u4.u<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: u4.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: u4.w} */
    /* JADX WARNING: type inference failed for: r0v9, types: [s4.e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final u4.u a(int r18, int r19, s4.h r20, com.bumptech.glide.load.data.e r21, u4.j.b r22) {
        /*
            r17 = this;
            r7 = r17
            r0 = r22
            v1.d<java.util.List<java.lang.Throwable>> r1 = r7.f15170d
            java.lang.Object r1 = r1.b()
            j7.a.r(r1)
            r8 = r1
            java.util.List r8 = (java.util.List) r8
            r1 = r17
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r8
            u4.u r1 = r1.b(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0134 }
            v1.d<java.util.List<java.lang.Throwable>> r2 = r7.f15170d
            r2.a(r8)
            u4.j r2 = u4.j.this
            s4.a r0 = r0.f15152a
            r2.getClass()
            java.lang.Object r3 = r1.get()
            java.lang.Class r15 = r3.getClass()
            s4.a r3 = s4.a.RESOURCE_DISK_CACHE
            r4 = 0
            if (r0 == r3) goto L_0x004a
            u4.i<R> r3 = r2.f15133a
            s4.l r3 = r3.f(r15)
            com.bumptech.glide.h r5 = r2.f15140o
            int r6 = r2.f15144s
            int r8 = r2.f15145t
            u4.u r5 = r3.b(r5, r1, r6, r8)
            r14 = r3
            goto L_0x004c
        L_0x004a:
            r5 = r1
            r14 = r4
        L_0x004c:
            boolean r3 = r1.equals(r5)
            if (r3 != 0) goto L_0x0055
            r1.b()
        L_0x0055:
            u4.i<R> r1 = r2.f15133a
            com.bumptech.glide.h r1 = r1.f15117c
            com.bumptech.glide.Registry r1 = r1.f4926b
            j5.d r1 = r1.f4907d
            java.lang.Class r3 = r5.c()
            s4.k r1 = r1.a(r3)
            r3 = 0
            r6 = 1
            if (r1 == 0) goto L_0x006b
            r1 = r6
            goto L_0x006c
        L_0x006b:
            r1 = r3
        L_0x006c:
            if (r1 == 0) goto L_0x0091
            u4.i<R> r1 = r2.f15133a
            com.bumptech.glide.h r1 = r1.f15117c
            com.bumptech.glide.Registry r1 = r1.f4926b
            j5.d r1 = r1.f4907d
            java.lang.Class r4 = r5.c()
            s4.k r4 = r1.a(r4)
            if (r4 == 0) goto L_0x0087
            s4.h r1 = r2.f15147v
            s4.c r1 = r4.d(r1)
            goto L_0x0093
        L_0x0087:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r0 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Class r1 = r5.c()
            r0.<init>(r1)
            throw r0
        L_0x0091:
            s4.c r1 = s4.c.NONE
        L_0x0093:
            u4.i<R> r8 = r2.f15133a
            s4.e r9 = r2.D
            java.util.ArrayList r8 = r8.b()
            int r10 = r8.size()
            r11 = r3
        L_0x00a0:
            if (r11 >= r10) goto L_0x00b5
            java.lang.Object r12 = r8.get(r11)
            y4.n$a r12 = (y4.n.a) r12
            s4.e r12 = r12.f17485a
            boolean r12 = r12.equals(r9)
            if (r12 == 0) goto L_0x00b2
            r8 = r6
            goto L_0x00b6
        L_0x00b2:
            int r11 = r11 + 1
            goto L_0x00a0
        L_0x00b5:
            r8 = r3
        L_0x00b6:
            r8 = r8 ^ r6
            u4.l r9 = r2.f15146u
            boolean r0 = r9.d(r8, r0, r1)
            if (r0 == 0) goto L_0x012b
            if (r4 == 0) goto L_0x011d
            int r0 = r1.ordinal()
            if (r0 == 0) goto L_0x00f9
            if (r0 != r6) goto L_0x00e2
            u4.w r0 = new u4.w
            u4.i<R> r1 = r2.f15133a
            com.bumptech.glide.h r1 = r1.f15117c
            v4.b r9 = r1.f4925a
            s4.e r10 = r2.D
            s4.e r11 = r2.f15141p
            int r12 = r2.f15144s
            int r13 = r2.f15145t
            s4.h r1 = r2.f15147v
            r8 = r0
            r16 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0102
        L_0x00e2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown strategy: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x00f9:
            u4.f r0 = new u4.f
            s4.e r1 = r2.D
            s4.e r8 = r2.f15141p
            r0.<init>(r1, r8)
        L_0x0102:
            p5.a$c r1 = u4.t.f15246e
            java.lang.Object r1 = r1.b()
            u4.t r1 = (u4.t) r1
            j7.a.r(r1)
            r1.f15250d = r3
            r1.f15249c = r6
            r1.f15248b = r5
            u4.j$c<?> r2 = r2.f15138f
            r2.f15154a = r0
            r2.f15155b = r4
            r2.f15156c = r1
            r5 = r1
            goto L_0x012b
        L_0x011d:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r0 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Object r1 = r5.get()
            java.lang.Class r1 = r1.getClass()
            r0.<init>(r1)
            throw r0
        L_0x012b:
            g5.b<ResourceType, Transcode> r0 = r7.f15169c
            r1 = r20
            u4.u r0 = r0.f(r5, r1)
            return r0
        L_0x0134:
            r0 = move-exception
            r1 = r0
            v1.d<java.util.List<java.lang.Throwable>> r0 = r7.f15170d
            r0.a(r8)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.k.a(int, int, s4.h, com.bumptech.glide.load.data.e, u4.j$b):u4.u");
    }

    public final u<ResourceType> b(e<DataType> eVar, int i10, int i11, h hVar, List<Throwable> list) {
        int size = this.f15168b.size();
        u<ResourceType> uVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            j jVar = (j) this.f15168b.get(i12);
            try {
                if (jVar.b(eVar.a(), hVar)) {
                    uVar = jVar.a(eVar.a(), i10, i11, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(jVar);
                }
                list.add(e10);
            }
            if (uVar != null) {
                break;
            }
        }
        if (uVar != null) {
            return uVar;
        }
        throw new GlideException(this.f15171e, new ArrayList(list));
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("DecodePath{ dataClass=");
        q10.append(this.f15167a);
        q10.append(", decoders=");
        q10.append(this.f15168b);
        q10.append(", transcoder=");
        q10.append(this.f15169c);
        q10.append('}');
        return q10.toString();
    }
}
