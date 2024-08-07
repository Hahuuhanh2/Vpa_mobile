package jj;

import al.d0;
import android.content.Context;
import ik.d;
import java.io.File;
import kk.e;
import kk.i;
import rk.l;
import rk.p;
import sk.j;

@e(c = "id.zelory.compressor.Compressor$compress$3", f = "Compressor.kt", l = {}, m = "invokeSuspend")
/* compiled from: Compressor.kt */
public final class a extends i implements p<d0, d<? super File>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public d0 f20788a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f20789b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f20790c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ File f20791d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(l lVar, Context context, File file, d dVar) {
        super(2, dVar);
        this.f20789b = lVar;
        this.f20790c = context;
        this.f20791d = file;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        j.g(dVar, "completion");
        a aVar = new a(this.f20789b, this.f20790c, this.f20791d, dVar);
        aVar.f20788a = (d0) obj;
        return aVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a) create(obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cc, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        p3.l0.u(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d0, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d4, code lost:
        p3.l0.u(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d7, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            jk.a r0 = jk.a.COROUTINE_SUSPENDED
            p3.l0.Q0(r7)
            kj.a r7 = new kj.a
            r7.<init>()
            rk.l r0 = r6.f20789b
            r0.invoke(r7)
            android.content.Context r0 = r6.f20790c
            java.io.File r1 = r6.f20791d
            java.lang.String r2 = jj.c.f20793a
            java.lang.String r2 = "context"
            sk.j.g(r0, r2)
            java.lang.String r2 = "imageFile"
            sk.j.g(r1, r2)
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.io.File r0 = r0.getCacheDir()
            java.lang.String r5 = "context.cacheDir"
            sk.j.b(r0, r5)
            java.lang.String r0 = r0.getPath()
            r4.append(r0)
            java.lang.String r0 = jj.c.f20793a
            r4.append(r0)
            java.lang.String r5 = "compressor"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.append(r0)
            java.lang.String r0 = r1.getName()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x00d8
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0078
            boolean r0 = r2.delete()
            if (r0 == 0) goto L_0x0070
            goto L_0x0078
        L_0x0070:
            kotlin.io.FileAlreadyExistsException r7 = new kotlin.io.FileAlreadyExistsException
            java.lang.String r0 = "Tried to overwrite the destination, but failed to delete it."
            r7.<init>(r1, r2, r0)
            throw r7
        L_0x0078:
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto L_0x008d
            boolean r0 = r2.mkdirs()
            if (r0 == 0) goto L_0x0085
            goto L_0x00ac
        L_0x0085:
            kotlin.io.FileSystemException r7 = new kotlin.io.FileSystemException
            java.lang.String r0 = "Failed to create target directory."
            r7.<init>(r1, r2, r0)
            throw r7
        L_0x008d:
            java.io.File r0 = r2.getParentFile()
            if (r0 == 0) goto L_0x0096
            r0.mkdirs()
        L_0x0096:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x00d1 }
            r1.<init>(r2)     // Catch:{ all -> 0x00d1 }
            r3 = 8192(0x2000, float:1.14794E-41)
            p3.l0.z(r0, r1, r3)     // Catch:{ all -> 0x00ca }
            r3 = 0
            p3.l0.u(r1, r3)     // Catch:{ all -> 0x00d1 }
            p3.l0.u(r0, r3)
        L_0x00ac:
            java.util.ArrayList r7 = r7.f20831a
            java.util.Iterator r7 = r7.iterator()
        L_0x00b2:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r0 = r7.next()
            kj.b r0 = (kj.b) r0
        L_0x00be:
            boolean r1 = r0.b(r2)
            if (r1 != 0) goto L_0x00b2
            java.io.File r2 = r0.a(r2)
            goto L_0x00be
        L_0x00c9:
            return r2
        L_0x00ca:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r2 = move-exception
            p3.l0.u(r1, r7)     // Catch:{ all -> 0x00d1 }
            throw r2     // Catch:{ all -> 0x00d1 }
        L_0x00d1:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r1 = move-exception
            p3.l0.u(r0, r7)
            throw r1
        L_0x00d8:
            kotlin.io.NoSuchFileException r7 = new kotlin.io.NoSuchFileException
            r7.<init>(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jj.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
