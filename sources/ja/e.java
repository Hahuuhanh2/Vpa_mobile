package ja;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.logging.Logger;
import v.v;

/* compiled from: QueueFile */
public final class e implements Closeable {

    /* renamed from: n  reason: collision with root package name */
    public static final Logger f11806n = Logger.getLogger(e.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final RandomAccessFile f11807a;

    /* renamed from: b  reason: collision with root package name */
    public int f11808b;

    /* renamed from: c  reason: collision with root package name */
    public int f11809c;

    /* renamed from: d  reason: collision with root package name */
    public a f11810d;

    /* renamed from: e  reason: collision with root package name */
    public a f11811e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f11812f;

    /* compiled from: QueueFile */
    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f11813c = new a(0, 0);

        /* renamed from: a  reason: collision with root package name */
        public final int f11814a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11815b;

        public a(int i10, int i11) {
            this.f11814a = i10;
            this.f11815b = i11;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.class.getSimpleName());
            sb2.append("[position = ");
            sb2.append(this.f11814a);
            sb2.append(", length = ");
            return v.e(sb2, this.f11815b, "]");
        }
    }

    /* JADX INFO: finally extract failed */
    public e(File file) {
        byte[] bArr = new byte[16];
        this.f11812f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096);
                randomAccessFile.seek(0);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 4; i10 < i12; i12 = 4) {
                    int i13 = iArr[i10];
                    bArr2[i11] = (byte) (i13 >> 24);
                    bArr2[i11 + 1] = (byte) (i13 >> 16);
                    bArr2[i11 + 2] = (byte) (i13 >> 8);
                    bArr2[i11 + 3] = (byte) i13;
                    i11 += 4;
                    i10++;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFile.close();
                throw th2;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f11807a = randomAccessFile2;
        randomAccessFile2.seek(0);
        randomAccessFile2.readFully(bArr);
        int q10 = q(0, bArr);
        this.f11808b = q10;
        if (((long) q10) <= randomAccessFile2.length()) {
            this.f11809c = q(4, bArr);
            int q11 = q(8, bArr);
            int q12 = q(12, bArr);
            this.f11810d = i(q11);
            this.f11811e = i(q12);
            return;
        }
        StringBuilder q13 = android.support.v4.media.a.q("File is truncated. Expected length: ");
        q13.append(this.f11808b);
        q13.append(", Actual length: ");
        q13.append(randomAccessFile2.length());
        throw new IOException(q13.toString());
    }

    public static int q(int i10, byte[] bArr) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    public final int B(int i10) {
        int i11 = this.f11808b;
        if (i10 < i11) {
            return i10;
        }
        return (i10 + 16) - i11;
    }

    public final void E(int i10, int i11, int i12, int i13) {
        byte[] bArr = this.f11812f;
        int[] iArr = {i10, i11, i12, i13};
        int i14 = 0;
        for (int i15 = 0; i15 < 4; i15++) {
            int i16 = iArr[i15];
            bArr[i14] = (byte) (i16 >> 24);
            bArr[i14 + 1] = (byte) (i16 >> 16);
            bArr[i14 + 2] = (byte) (i16 >> 8);
            bArr[i14 + 3] = (byte) i16;
            i14 += 4;
        }
        this.f11807a.seek(0);
        this.f11807a.write(this.f11812f);
    }

    public final synchronized void close() {
        this.f11807a.close();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void d(byte[] r10) {
        /*
            r9 = this;
            int r0 = r10.length
            monitor-enter(r9)
            r1 = r0 | 0
            if (r1 < 0) goto L_0x006d
            int r1 = r10.length     // Catch:{ all -> 0x0073 }
            r2 = 0
            int r1 = r1 - r2
            if (r0 > r1) goto L_0x006d
            r9.h(r0)     // Catch:{ all -> 0x0073 }
            monitor-enter(r9)     // Catch:{ all -> 0x0073 }
            int r1 = r9.f11809c     // Catch:{ all -> 0x006a }
            r3 = 1
            if (r1 != 0) goto L_0x0016
            r1 = r3
            goto L_0x0017
        L_0x0016:
            r1 = r2
        L_0x0017:
            monitor-exit(r9)     // Catch:{ all -> 0x0073 }
            r4 = 4
            if (r1 == 0) goto L_0x001e
            r5 = 16
            goto L_0x002a
        L_0x001e:
            ja.e$a r5 = r9.f11811e     // Catch:{ all -> 0x0073 }
            int r6 = r5.f11814a     // Catch:{ all -> 0x0073 }
            int r6 = r6 + r4
            int r5 = r5.f11815b     // Catch:{ all -> 0x0073 }
            int r6 = r6 + r5
            int r5 = r9.B(r6)     // Catch:{ all -> 0x0073 }
        L_0x002a:
            ja.e$a r6 = new ja.e$a     // Catch:{ all -> 0x0073 }
            r6.<init>(r5, r0)     // Catch:{ all -> 0x0073 }
            byte[] r7 = r9.f11812f     // Catch:{ all -> 0x0073 }
            int r8 = r0 >> 24
            byte r8 = (byte) r8     // Catch:{ all -> 0x0073 }
            r7[r2] = r8     // Catch:{ all -> 0x0073 }
            int r2 = r0 >> 16
            byte r2 = (byte) r2     // Catch:{ all -> 0x0073 }
            r7[r3] = r2     // Catch:{ all -> 0x0073 }
            r2 = 2
            int r8 = r0 >> 8
            byte r8 = (byte) r8     // Catch:{ all -> 0x0073 }
            r7[r2] = r8     // Catch:{ all -> 0x0073 }
            r2 = 3
            byte r8 = (byte) r0     // Catch:{ all -> 0x0073 }
            r7[r2] = r8     // Catch:{ all -> 0x0073 }
            r9.x(r5, r7, r4)     // Catch:{ all -> 0x0073 }
            int r2 = r5 + 4
            r9.x(r2, r10, r0)     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0051
            r10 = r5
            goto L_0x0055
        L_0x0051:
            ja.e$a r10 = r9.f11810d     // Catch:{ all -> 0x0073 }
            int r10 = r10.f11814a     // Catch:{ all -> 0x0073 }
        L_0x0055:
            int r0 = r9.f11808b     // Catch:{ all -> 0x0073 }
            int r2 = r9.f11809c     // Catch:{ all -> 0x0073 }
            int r2 = r2 + r3
            r9.E(r0, r2, r10, r5)     // Catch:{ all -> 0x0073 }
            r9.f11811e = r6     // Catch:{ all -> 0x0073 }
            int r10 = r9.f11809c     // Catch:{ all -> 0x0073 }
            int r10 = r10 + r3
            r9.f11809c = r10     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0068
            r9.f11810d = r6     // Catch:{ all -> 0x0073 }
        L_0x0068:
            monitor-exit(r9)
            return
        L_0x006a:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0073 }
            throw r10     // Catch:{ all -> 0x0073 }
        L_0x006d:
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException     // Catch:{ all -> 0x0073 }
            r10.<init>()     // Catch:{ all -> 0x0073 }
            throw r10     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.e.d(byte[]):void");
    }

    public final void h(int i10) {
        int i11 = i10 + 4;
        int z10 = this.f11808b - z();
        if (z10 < i11) {
            int i12 = this.f11808b;
            do {
                z10 += i12;
                i12 <<= 1;
            } while (z10 < i11);
            this.f11807a.setLength((long) i12);
            this.f11807a.getChannel().force(true);
            a aVar = this.f11811e;
            int B = B(aVar.f11814a + 4 + aVar.f11815b);
            if (B < this.f11810d.f11814a) {
                FileChannel channel = this.f11807a.getChannel();
                channel.position((long) this.f11808b);
                long j10 = (long) (B - 4);
                if (channel.transferTo(16, j10, channel) != j10) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i13 = this.f11811e.f11814a;
            int i14 = this.f11810d.f11814a;
            if (i13 < i14) {
                int i15 = (this.f11808b + i13) - 16;
                E(i12, this.f11809c, i14, i15);
                this.f11811e = new a(i15, this.f11811e.f11815b);
            } else {
                E(i12, this.f11809c, i14, i13);
            }
            this.f11808b = i12;
        }
    }

    public final a i(int i10) {
        if (i10 == 0) {
            return a.f11813c;
        }
        this.f11807a.seek((long) i10);
        return new a(i10, this.f11807a.readInt());
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void s() {
        /*
            r6 = this;
            monitor-enter(r6)
            monitor-enter(r6)     // Catch:{ all -> 0x0070 }
            int r0 = r6.f11809c     // Catch:{ all -> 0x0072 }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000a
            r3 = r2
            goto L_0x000b
        L_0x000a:
            r3 = r1
        L_0x000b:
            monitor-exit(r6)     // Catch:{ all -> 0x0070 }
            if (r3 != 0) goto L_0x006a
            if (r0 != r2) goto L_0x0038
            monitor-enter(r6)     // Catch:{ all -> 0x0070 }
            r0 = 4096(0x1000, float:5.74E-42)
            r6.E(r0, r1, r1, r1)     // Catch:{ all -> 0x0035 }
            r6.f11809c = r1     // Catch:{ all -> 0x0035 }
            ja.e$a r1 = ja.e.a.f11813c     // Catch:{ all -> 0x0035 }
            r6.f11810d = r1     // Catch:{ all -> 0x0035 }
            r6.f11811e = r1     // Catch:{ all -> 0x0035 }
            int r1 = r6.f11808b     // Catch:{ all -> 0x0035 }
            if (r1 <= r0) goto L_0x0031
            java.io.RandomAccessFile r1 = r6.f11807a     // Catch:{ all -> 0x0035 }
            long r3 = (long) r0     // Catch:{ all -> 0x0035 }
            r1.setLength(r3)     // Catch:{ all -> 0x0035 }
            java.io.RandomAccessFile r1 = r6.f11807a     // Catch:{ all -> 0x0035 }
            java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch:{ all -> 0x0035 }
            r1.force(r2)     // Catch:{ all -> 0x0035 }
        L_0x0031:
            r6.f11808b = r0     // Catch:{ all -> 0x0035 }
            monitor-exit(r6)     // Catch:{ all -> 0x0070 }
            goto L_0x0068
        L_0x0035:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0070 }
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x0038:
            ja.e$a r0 = r6.f11810d     // Catch:{ all -> 0x0070 }
            int r3 = r0.f11814a     // Catch:{ all -> 0x0070 }
            r4 = 4
            int r3 = r3 + r4
            int r0 = r0.f11815b     // Catch:{ all -> 0x0070 }
            int r3 = r3 + r0
            int r0 = r6.B(r3)     // Catch:{ all -> 0x0070 }
            byte[] r3 = r6.f11812f     // Catch:{ all -> 0x0070 }
            r6.v(r0, r3, r1, r4)     // Catch:{ all -> 0x0070 }
            byte[] r3 = r6.f11812f     // Catch:{ all -> 0x0070 }
            int r1 = q(r1, r3)     // Catch:{ all -> 0x0070 }
            int r3 = r6.f11808b     // Catch:{ all -> 0x0070 }
            int r4 = r6.f11809c     // Catch:{ all -> 0x0070 }
            int r4 = r4 - r2
            ja.e$a r5 = r6.f11811e     // Catch:{ all -> 0x0070 }
            int r5 = r5.f11814a     // Catch:{ all -> 0x0070 }
            r6.E(r3, r4, r0, r5)     // Catch:{ all -> 0x0070 }
            int r3 = r6.f11809c     // Catch:{ all -> 0x0070 }
            int r3 = r3 - r2
            r6.f11809c = r3     // Catch:{ all -> 0x0070 }
            ja.e$a r2 = new ja.e$a     // Catch:{ all -> 0x0070 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0070 }
            r6.f11810d = r2     // Catch:{ all -> 0x0070 }
        L_0x0068:
            monitor-exit(r6)
            return
        L_0x006a:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0070 }
            r0.<init>()     // Catch:{ all -> 0x0070 }
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            goto L_0x0075
        L_0x0072:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0070 }
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x0075:
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.e.s():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0076, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
        f11806n.log(java.util.logging.Level.WARNING, "read error", r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<ja.e> r1 = ja.e.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = "fileLength="
            r0.append(r1)
            int r1 = r7.f11808b
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            int r1 = r7.f11809c
            r0.append(r1)
            java.lang.String r1 = ", first="
            r0.append(r1)
            ja.e$a r1 = r7.f11810d
            r0.append(r1)
            java.lang.String r1 = ", last="
            r0.append(r1)
            ja.e$a r1 = r7.f11811e
            r0.append(r1)
            java.lang.String r1 = ", element lengths=["
            r0.append(r1)
            monitor-enter(r7)     // Catch:{ IOException -> 0x0076 }
            ja.e$a r1 = r7.f11810d     // Catch:{ all -> 0x0073 }
            int r1 = r1.f11814a     // Catch:{ all -> 0x0073 }
            r2 = 0
            r3 = 1
            r4 = r2
        L_0x0048:
            int r5 = r7.f11809c     // Catch:{ all -> 0x0073 }
            if (r4 >= r5) goto L_0x0071
            ja.e$a r1 = r7.i(r1)     // Catch:{ all -> 0x0073 }
            ja.e$b r5 = new ja.e$b     // Catch:{ all -> 0x0073 }
            r5.<init>(r1)     // Catch:{ all -> 0x0073 }
            int r5 = r1.f11815b     // Catch:{ all -> 0x0073 }
            if (r3 == 0) goto L_0x005b
            r3 = r2
            goto L_0x0060
        L_0x005b:
            java.lang.String r6 = ", "
            r0.append(r6)     // Catch:{ all -> 0x0073 }
        L_0x0060:
            r0.append(r5)     // Catch:{ all -> 0x0073 }
            int r5 = r1.f11814a     // Catch:{ all -> 0x0073 }
            int r5 = r5 + 4
            int r1 = r1.f11815b     // Catch:{ all -> 0x0073 }
            int r5 = r5 + r1
            int r1 = r7.B(r5)     // Catch:{ all -> 0x0073 }
            int r4 = r4 + 1
            goto L_0x0048
        L_0x0071:
            monitor-exit(r7)     // Catch:{ IOException -> 0x0076 }
            goto L_0x0080
        L_0x0073:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ IOException -> 0x0076 }
            throw r1     // Catch:{ IOException -> 0x0076 }
        L_0x0076:
            r1 = move-exception
            java.util.logging.Logger r2 = f11806n
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r4 = "read error"
            r2.log(r3, r4, r1)
        L_0x0080:
            java.lang.String r1 = "]]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.e.toString():java.lang.String");
    }

    public final void v(int i10, byte[] bArr, int i11, int i12) {
        int B = B(i10);
        int i13 = B + i12;
        int i14 = this.f11808b;
        if (i13 <= i14) {
            this.f11807a.seek((long) B);
            this.f11807a.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - B;
        this.f11807a.seek((long) B);
        this.f11807a.readFully(bArr, i11, i15);
        this.f11807a.seek(16);
        this.f11807a.readFully(bArr, i11 + i15, i12 - i15);
    }

    public final void x(int i10, byte[] bArr, int i11) {
        int B = B(i10);
        int i12 = B + i11;
        int i13 = this.f11808b;
        if (i12 <= i13) {
            this.f11807a.seek((long) B);
            this.f11807a.write(bArr, 0, i11);
            return;
        }
        int i14 = i13 - B;
        this.f11807a.seek((long) B);
        this.f11807a.write(bArr, 0, i14);
        this.f11807a.seek(16);
        this.f11807a.write(bArr, 0 + i14, i11 - i14);
    }

    public final int z() {
        if (this.f11809c == 0) {
            return 16;
        }
        a aVar = this.f11811e;
        int i10 = aVar.f11814a;
        int i11 = this.f11810d.f11814a;
        if (i10 >= i11) {
            return (i10 - i11) + 4 + aVar.f11815b + 16;
        }
        return (((i10 + 4) + aVar.f11815b) + this.f11808b) - i11;
    }

    /* compiled from: QueueFile */
    public final class b extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        public int f11816a;

        /* renamed from: b  reason: collision with root package name */
        public int f11817b;

        public b(a aVar) {
            this.f11816a = e.this.B(aVar.f11814a + 4);
            this.f11817b = aVar.f11815b;
        }

        public final int read(byte[] bArr, int i10, int i11) {
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                int i12 = this.f11817b;
                if (i12 <= 0) {
                    return -1;
                }
                if (i11 > i12) {
                    i11 = i12;
                }
                e.this.v(this.f11816a, bArr, i10, i11);
                this.f11816a = e.this.B(this.f11816a + i11);
                this.f11817b -= i11;
                return i11;
            }
        }

        public final int read() {
            if (this.f11817b == 0) {
                return -1;
            }
            e.this.f11807a.seek((long) this.f11816a);
            int read = e.this.f11807a.read();
            this.f11816a = e.this.B(this.f11816a + 1);
            this.f11817b--;
            return read;
        }
    }
}
