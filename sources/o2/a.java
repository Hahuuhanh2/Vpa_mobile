package o2;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.system.OsConstants;
import android.util.Log;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import o2.b;
import v.v;

/* compiled from: ExifInterface */
public final class a {
    public static final byte[] A = {73, 72, 68, 82};
    public static final byte[] B = {73, 69, 78, 68};
    public static final byte[] C = {82, 73, 70, 70};
    public static final byte[] D = {87, 69, 66, 80};
    public static final byte[] E = {69, 88, 73, 70};
    public static final String[] F = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] G = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] H = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final d I = new d("StripOffsets", 273, 3);
    public static final d[][] J;
    public static final d[] K = {new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
    public static final HashMap<Integer, d>[] L = new HashMap[10];
    public static final HashMap<String, d>[] M = new HashMap[10];
    public static final HashSet<String> N = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    public static final HashMap<Integer, Integer> O = new HashMap<>();
    public static final Charset P;
    public static final byte[] Q;
    public static final byte[] R;
    public static final Pattern S = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern T = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern U = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: n  reason: collision with root package name */
    public static final boolean f13619n = Log.isLoggable("ExifInterface", 3);

    /* renamed from: o  reason: collision with root package name */
    public static final List<Integer> f13620o = Arrays.asList(new Integer[]{1, 6, 3, 8});

    /* renamed from: p  reason: collision with root package name */
    public static final List<Integer> f13621p = Arrays.asList(new Integer[]{2, 7, 4, 5});

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f13622q = {8, 8, 8};

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f13623r = {8};

    /* renamed from: s  reason: collision with root package name */
    public static final byte[] f13624s = {-1, -40, -1};

    /* renamed from: t  reason: collision with root package name */
    public static final byte[] f13625t = {102, 116, 121, 112};

    /* renamed from: u  reason: collision with root package name */
    public static final byte[] f13626u = {109, 105, 102, 49};

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f13627v = {104, 101, 105, 99};

    /* renamed from: w  reason: collision with root package name */
    public static final byte[] f13628w = {79, 76, 89, 77, 80, 0};

    /* renamed from: x  reason: collision with root package name */
    public static final byte[] f13629x = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: y  reason: collision with root package name */
    public static final byte[] f13630y = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: z  reason: collision with root package name */
    public static final byte[] f13631z = {101, 88, 73, 102};

    /* renamed from: a  reason: collision with root package name */
    public String f13632a;

    /* renamed from: b  reason: collision with root package name */
    public FileDescriptor f13633b;

    /* renamed from: c  reason: collision with root package name */
    public AssetManager.AssetInputStream f13634c;

    /* renamed from: d  reason: collision with root package name */
    public int f13635d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, c>[] f13636e;

    /* renamed from: f  reason: collision with root package name */
    public HashSet f13637f;

    /* renamed from: g  reason: collision with root package name */
    public ByteOrder f13638g = ByteOrder.BIG_ENDIAN;

    /* renamed from: h  reason: collision with root package name */
    public boolean f13639h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f13640i;

    /* renamed from: j  reason: collision with root package name */
    public int f13641j;

    /* renamed from: k  reason: collision with root package name */
    public int f13642k;

    /* renamed from: l  reason: collision with root package name */
    public int f13643l;

    /* renamed from: m  reason: collision with root package name */
    public int f13644m;

    /* renamed from: o2.a$a  reason: collision with other inner class name */
    /* compiled from: ExifInterface */
    public class C0167a extends MediaDataSource {

        /* renamed from: a  reason: collision with root package name */
        public long f13645a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f13646b;

        public C0167a(f fVar) {
            this.f13646b = fVar;
        }

        public final void close() {
        }

        public final long getSize() {
            return -1;
        }

        public final int readAt(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f13645a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + ((long) this.f13646b.available())) {
                        return -1;
                    }
                    this.f13646b.h(j10);
                    this.f13645a = j10;
                }
                if (i11 > this.f13646b.available()) {
                    i11 = this.f13646b.available();
                }
                int read = this.f13646b.read(bArr, i10, i11);
                if (read >= 0) {
                    this.f13645a += (long) read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f13645a = -1;
            return -1;
        }
    }

    /* compiled from: ExifInterface */
    public static class b extends InputStream implements DataInput {

        /* renamed from: e  reason: collision with root package name */
        public static final ByteOrder f13647e = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: f  reason: collision with root package name */
        public static final ByteOrder f13648f = ByteOrder.BIG_ENDIAN;

        /* renamed from: a  reason: collision with root package name */
        public final DataInputStream f13649a;

        /* renamed from: b  reason: collision with root package name */
        public ByteOrder f13650b;

        /* renamed from: c  reason: collision with root package name */
        public int f13651c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f13652d;

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        public final int available() {
            return this.f13649a.available();
        }

        public final void d(int i10) {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int skip = (int) this.f13649a.skip((long) i12);
                if (skip <= 0) {
                    if (this.f13652d == null) {
                        this.f13652d = new byte[8192];
                    }
                    skip = this.f13649a.read(this.f13652d, 0, Math.min(8192, i12));
                    if (skip == -1) {
                        throw new EOFException(v.d("Reached EOF while skipping ", i10, " bytes."));
                    }
                }
                i11 += skip;
            }
            this.f13651c += i11;
        }

        public final void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public final int read() {
            this.f13651c++;
            return this.f13649a.read();
        }

        public final boolean readBoolean() {
            this.f13651c++;
            return this.f13649a.readBoolean();
        }

        public final byte readByte() {
            this.f13651c++;
            int read = this.f13649a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        public final char readChar() {
            this.f13651c += 2;
            return this.f13649a.readChar();
        }

        public final double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        public final float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        public final void readFully(byte[] bArr, int i10, int i11) {
            this.f13651c += i11;
            this.f13649a.readFully(bArr, i10, i11);
        }

        public final int readInt() {
            this.f13651c += 4;
            int read = this.f13649a.read();
            int read2 = this.f13649a.read();
            int read3 = this.f13649a.read();
            int read4 = this.f13649a.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f13650b;
                if (byteOrder == f13647e) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f13648f) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                StringBuilder q10 = android.support.v4.media.a.q("Invalid byte order: ");
                q10.append(this.f13650b);
                throw new IOException(q10.toString());
            }
            throw new EOFException();
        }

        public final String readLine() {
            return null;
        }

        public final long readLong() {
            this.f13651c += 8;
            int read = this.f13649a.read();
            int read2 = this.f13649a.read();
            int read3 = this.f13649a.read();
            int read4 = this.f13649a.read();
            int read5 = this.f13649a.read();
            int read6 = this.f13649a.read();
            int read7 = this.f13649a.read();
            int read8 = this.f13649a.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f13650b;
                if (byteOrder == f13647e) {
                    return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                }
                if (byteOrder == f13648f) {
                    return (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                }
                StringBuilder q10 = android.support.v4.media.a.q("Invalid byte order: ");
                q10.append(this.f13650b);
                throw new IOException(q10.toString());
            }
            throw new EOFException();
        }

        public final short readShort() {
            this.f13651c += 2;
            int read = this.f13649a.read();
            int read2 = this.f13649a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f13650b;
                if (byteOrder == f13647e) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f13648f) {
                    return (short) ((read << 8) + read2);
                }
                StringBuilder q10 = android.support.v4.media.a.q("Invalid byte order: ");
                q10.append(this.f13650b);
                throw new IOException(q10.toString());
            }
            throw new EOFException();
        }

        public final String readUTF() {
            this.f13651c += 2;
            return this.f13649a.readUTF();
        }

        public final int readUnsignedByte() {
            this.f13651c++;
            return this.f13649a.readUnsignedByte();
        }

        public final int readUnsignedShort() {
            this.f13651c += 2;
            int read = this.f13649a.read();
            int read2 = this.f13649a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f13650b;
                if (byteOrder == f13647e) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f13648f) {
                    return (read << 8) + read2;
                }
                StringBuilder q10 = android.support.v4.media.a.q("Invalid byte order: ");
                q10.append(this.f13650b);
                throw new IOException(q10.toString());
            }
            throw new EOFException();
        }

        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        public final int skipBytes(int i10) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) {
            this.f13650b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f13649a = dataInputStream;
            dataInputStream.mark(0);
            this.f13651c = 0;
            this.f13650b = byteOrder;
        }

        public final int read(byte[] bArr, int i10, int i11) {
            int read = this.f13649a.read(bArr, i10, i11);
            this.f13651c += read;
            return read;
        }

        public final void readFully(byte[] bArr) {
            this.f13651c += bArr.length;
            this.f13649a.readFully(bArr);
        }
    }

    /* compiled from: ExifInterface */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f13653a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13654b;

        /* renamed from: c  reason: collision with root package name */
        public final long f13655c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f13656d;

        public c(byte[] bArr, int i10, int i11) {
            this(-1, bArr, i10, i11);
        }

        public static c a(String str) {
            byte[] bytes = (str + 0).getBytes(a.P);
            return new c(bytes, 2, bytes.length);
        }

        public static c b(long j10, ByteOrder byteOrder) {
            return c(new long[]{j10}, byteOrder);
        }

        public static c c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.G[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j10 : jArr) {
                wrap.putInt((int) j10);
            }
            return new c(wrap.array(), 4, jArr.length);
        }

        public static c d(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.G[5] * eVarArr.length)]);
            wrap.order(byteOrder);
            for (e eVar : eVarArr) {
                wrap.putInt((int) eVar.f13661a);
                wrap.putInt((int) eVar.f13662b);
            }
            return new c(wrap.array(), 5, eVarArr.length);
        }

        public static c e(int i10, ByteOrder byteOrder) {
            return f(new int[]{i10}, byteOrder);
        }

        public static c f(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.G[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putShort((short) i10);
            }
            return new c(wrap.array(), 3, iArr.length);
        }

        public final double g(ByteOrder byteOrder) {
            Serializable j10 = j(byteOrder);
            if (j10 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (j10 instanceof String) {
                return Double.parseDouble((String) j10);
            } else {
                if (j10 instanceof long[]) {
                    long[] jArr = (long[]) j10;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (j10 instanceof int[]) {
                    int[] iArr = (int[]) j10;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (j10 instanceof double[]) {
                    double[] dArr = (double[]) j10;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (j10 instanceof e[]) {
                    e[] eVarArr = (e[]) j10;
                    if (eVarArr.length == 1) {
                        e eVar = eVarArr[0];
                        return ((double) eVar.f13661a) / ((double) eVar.f13662b);
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public final int h(ByteOrder byteOrder) {
            Serializable j10 = j(byteOrder);
            if (j10 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (j10 instanceof String) {
                return Integer.parseInt((String) j10);
            } else {
                if (j10 instanceof long[]) {
                    long[] jArr = (long[]) j10;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (j10 instanceof int[]) {
                    int[] iArr = (int[]) j10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public final String i(ByteOrder byteOrder) {
            Serializable j10 = j(byteOrder);
            if (j10 == null) {
                return null;
            }
            if (j10 instanceof String) {
                return (String) j10;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (j10 instanceof long[]) {
                long[] jArr = (long[]) j10;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (j10 instanceof int[]) {
                int[] iArr = (int[]) j10;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (j10 instanceof double[]) {
                double[] dArr = (double[]) j10;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (!(j10 instanceof e[])) {
                return null;
            } else {
                e[] eVarArr = (e[]) j10;
                while (i10 < eVarArr.length) {
                    sb2.append(eVarArr[i10].f13661a);
                    sb2.append('/');
                    sb2.append(eVarArr[i10].f13662b);
                    i10++;
                    if (i10 != eVarArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
        }

        /* JADX WARNING: type inference failed for: r11v14, types: [int[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r11v16, types: [long[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r11v18, types: [o2.a$e[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r11v20, types: [int[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r11v22, types: [int[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r11v24, types: [o2.a$e[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r11v26, types: [double[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r11v28, types: [double[], java.io.Serializable] */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x0151 A[SYNTHETIC, Splitter:B:139:0x0151] */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x0158 A[SYNTHETIC, Splitter:B:147:0x0158] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.io.Serializable j(java.nio.ByteOrder r11) {
            /*
                r10 = this;
                r0 = 0
                o2.a$b r1 = new o2.a$b     // Catch:{ IOException -> 0x0155, all -> 0x014e }
                byte[] r2 = r10.f13656d     // Catch:{ IOException -> 0x0155, all -> 0x014e }
                r1.<init>((byte[]) r2)     // Catch:{ IOException -> 0x0155, all -> 0x014e }
                r1.f13650b = r11     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                int r11 = r10.f13653a     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                r2 = 0
                r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
                r5 = 1
                switch(r11) {
                    case 1: goto L_0x0121;
                    case 2: goto L_0x00db;
                    case 3: goto L_0x00c6;
                    case 4: goto L_0x00af;
                    case 5: goto L_0x008d;
                    case 6: goto L_0x0121;
                    case 7: goto L_0x00db;
                    case 8: goto L_0x0078;
                    case 9: goto L_0x0063;
                    case 10: goto L_0x0043;
                    case 11: goto L_0x002d;
                    case 12: goto L_0x0018;
                    default: goto L_0x0016;
                }     // Catch:{ IOException -> 0x0156, all -> 0x014b }
            L_0x0016:
                goto L_0x0147
            L_0x0018:
                int r11 = r10.f13654b     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0156, all -> 0x014b }
            L_0x001c:
                int r3 = r10.f13654b     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                if (r2 >= r3) goto L_0x0029
                double r3 = r1.readDouble()     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                r11[r2] = r3     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                int r2 = r2 + 1
                goto L_0x001c
            L_0x0029:
                r1.close()     // Catch:{ IOException -> 0x002c }
            L_0x002c:
                return r11
            L_0x002d:
                int r11 = r10.f13654b     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0156, all -> 0x014b }
            L_0x0031:
                int r3 = r10.f13654b     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                if (r2 >= r3) goto L_0x003f
                float r3 = r1.readFloat()     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                double r3 = (double) r3     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                r11[r2] = r3     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                int r2 = r2 + 1
                goto L_0x0031
            L_0x003f:
                r1.close()     // Catch:{ IOException -> 0x0042 }
            L_0x0042:
                return r11
            L_0x0043:
                int r11 = r10.f13654b     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                o2.a$e[] r11 = new o2.a.e[r11]     // Catch:{ IOException -> 0x0156, all -> 0x014b }
            L_0x0047:
                int r3 = r10.f13654b     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                if (r2 >= r3) goto L_0x005f
                int r3 = r1.readInt()     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                long r3 = (long) r3     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                int r5 = r1.readInt()     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                long r5 = (long) r5     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                o2.a$e r7 = new o2.a$e     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                r7.<init>(r3, r5)     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                r11[r2] = r7     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                int r2 = r2 + 1
                goto L_0x0047
            L_0x005f:
                r1.close()     // Catch:{ IOException -> 0x0062 }
            L_0x0062:
                return r11
            L_0x0063:
                int r11 = r10.f13654b     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0156, all -> 0x014b }
            L_0x0067:
                int r3 = r10.f13654b     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                if (r2 >= r3) goto L_0x0074
                int r3 = r1.readInt()     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                r11[r2] = r3     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                int r2 = r2 + 1
                goto L_0x0067
            L_0x0074:
                r1.close()     // Catch:{ IOException -> 0x0077 }
            L_0x0077:
                return r11
            L_0x0078:
                int r11 = r10.f13654b     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0156, all -> 0x014b }
            L_0x007c:
                int r3 = r10.f13654b     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                if (r2 >= r3) goto L_0x0089
                short r3 = r1.readShort()     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                r11[r2] = r3     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                int r2 = r2 + 1
                goto L_0x007c
            L_0x0089:
                r1.close()     // Catch:{ IOException -> 0x008c }
            L_0x008c:
                return r11
            L_0x008d:
                int r11 = r10.f13654b     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                o2.a$e[] r11 = new o2.a.e[r11]     // Catch:{ IOException -> 0x0156, all -> 0x014b }
            L_0x0091:
                int r5 = r10.f13654b     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                if (r2 >= r5) goto L_0x00ab
                int r5 = r1.readInt()     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                long r5 = (long) r5     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                long r5 = r5 & r3
                int r7 = r1.readInt()     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                long r7 = (long) r7     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                long r7 = r7 & r3
                o2.a$e r9 = new o2.a$e     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                r9.<init>(r5, r7)     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                r11[r2] = r9     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                int r2 = r2 + 1
                goto L_0x0091
            L_0x00ab:
                r1.close()     // Catch:{ IOException -> 0x00ae }
            L_0x00ae:
                return r11
            L_0x00af:
                int r11 = r10.f13654b     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                long[] r11 = new long[r11]     // Catch:{ IOException -> 0x0156, all -> 0x014b }
            L_0x00b3:
                int r5 = r10.f13654b     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                if (r2 >= r5) goto L_0x00c2
                int r5 = r1.readInt()     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                long r5 = (long) r5     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                long r5 = r5 & r3
                r11[r2] = r5     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                int r2 = r2 + 1
                goto L_0x00b3
            L_0x00c2:
                r1.close()     // Catch:{ IOException -> 0x00c5 }
            L_0x00c5:
                return r11
            L_0x00c6:
                int r11 = r10.f13654b     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0156, all -> 0x014b }
            L_0x00ca:
                int r3 = r10.f13654b     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                if (r2 >= r3) goto L_0x00d7
                int r3 = r1.readUnsignedShort()     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                r11[r2] = r3     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                int r2 = r2 + 1
                goto L_0x00ca
            L_0x00d7:
                r1.close()     // Catch:{ IOException -> 0x00da }
            L_0x00da:
                return r11
            L_0x00db:
                int r11 = r10.f13654b     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                byte[] r3 = o2.a.H     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                int r3 = r3.length     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                if (r11 < r3) goto L_0x00f8
                r11 = r2
            L_0x00e3:
                byte[] r3 = o2.a.H     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                int r4 = r3.length     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                if (r11 >= r4) goto L_0x00f5
                byte[] r4 = r10.f13656d     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                byte r4 = r4[r11]     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                byte r6 = r3[r11]     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                if (r4 == r6) goto L_0x00f2
                r5 = r2
                goto L_0x00f5
            L_0x00f2:
                int r11 = r11 + 1
                goto L_0x00e3
            L_0x00f5:
                if (r5 == 0) goto L_0x00f8
                int r2 = r3.length     // Catch:{ IOException -> 0x0156, all -> 0x014b }
            L_0x00f8:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                r11.<init>()     // Catch:{ IOException -> 0x0156, all -> 0x014b }
            L_0x00fd:
                int r3 = r10.f13654b     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                if (r2 >= r3) goto L_0x0119
                byte[] r3 = r10.f13656d     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                byte r3 = r3[r2]     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                if (r3 != 0) goto L_0x0108
                goto L_0x0119
            L_0x0108:
                r4 = 32
                if (r3 < r4) goto L_0x0111
                char r3 = (char) r3     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                r11.append(r3)     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                goto L_0x0116
            L_0x0111:
                r3 = 63
                r11.append(r3)     // Catch:{ IOException -> 0x0156, all -> 0x014b }
            L_0x0116:
                int r2 = r2 + 1
                goto L_0x00fd
            L_0x0119:
                java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                r1.close()     // Catch:{ IOException -> 0x0120 }
            L_0x0120:
                return r11
            L_0x0121:
                byte[] r11 = r10.f13656d     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                int r3 = r11.length     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                if (r3 != r5) goto L_0x013c
                byte r3 = r11[r2]     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                if (r3 < 0) goto L_0x013c
                if (r3 > r5) goto L_0x013c
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                char[] r4 = new char[r5]     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                int r3 = r3 + 48
                char r3 = (char) r3     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                r4[r2] = r3     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                r11.<init>(r4)     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                r1.close()     // Catch:{ IOException -> 0x013b }
            L_0x013b:
                return r11
            L_0x013c:
                java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                java.nio.charset.Charset r3 = o2.a.P     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                r2.<init>(r11, r3)     // Catch:{ IOException -> 0x0156, all -> 0x014b }
                r1.close()     // Catch:{ IOException -> 0x0146 }
            L_0x0146:
                return r2
            L_0x0147:
                r1.close()     // Catch:{ IOException -> 0x014a }
            L_0x014a:
                return r0
            L_0x014b:
                r11 = move-exception
                r0 = r1
                goto L_0x014f
            L_0x014e:
                r11 = move-exception
            L_0x014f:
                if (r0 == 0) goto L_0x0154
                r0.close()     // Catch:{ IOException -> 0x0154 }
            L_0x0154:
                throw r11
            L_0x0155:
                r1 = r0
            L_0x0156:
                if (r1 == 0) goto L_0x015b
                r1.close()     // Catch:{ IOException -> 0x015b }
            L_0x015b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o2.a.c.j(java.nio.ByteOrder):java.io.Serializable");
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("(");
            q10.append(a.F[this.f13653a]);
            q10.append(", data length:");
            return v.e(q10, this.f13656d.length, ")");
        }

        public c(long j10, byte[] bArr, int i10, int i11) {
            this.f13653a = i10;
            this.f13654b = i11;
            this.f13655c = j10;
            this.f13656d = bArr;
        }
    }

    /* compiled from: ExifInterface */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final long f13661a;

        /* renamed from: b  reason: collision with root package name */
        public final long f13662b;

        public e(double d10) {
            this((long) (d10 * 10000.0d), 10000);
        }

        public final String toString() {
            return this.f13661a + "/" + this.f13662b;
        }

        public e(long j10, long j11) {
            if (j11 == 0) {
                this.f13661a = 0;
                this.f13662b = 1;
                return;
            }
            this.f13661a = j10;
            this.f13662b = j11;
        }
    }

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, 4, "ImageWidth"), new d(257, 3, 4, "ImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        J = new d[][]{dVarArr, new d[]{new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d(40962, 3, 4, "PixelXDimension"), new d(40963, 3, 4, "PixelYDimension"), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")}, new d[]{new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d(2, 5, 10, "GPSLatitude"), new d("GPSLongitudeRef", 3, 2), new d(4, 5, 10, "GPSLongitude"), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)}, new d[]{new d("InteroperabilityIndex", 1, 2)}, new d[]{new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, 4, "ThumbnailImageWidth"), new d(257, 3, 4, "ThumbnailImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Xmp", 700, 1), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")}, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        Charset forName = Charset.forName("US-ASCII");
        P = forName;
        Q = "Exif\u0000\u0000".getBytes(forName);
        R = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr2 = J;
            if (i10 < dVarArr2.length) {
                L[i10] = new HashMap<>();
                M[i10] = new HashMap<>();
                for (d dVar : dVarArr2[i10]) {
                    L[i10].put(Integer.valueOf(dVar.f13657a), dVar);
                    M[i10].put(dVar.f13658b, dVar);
                }
                i10++;
            } else {
                HashMap<Integer, Integer> hashMap = O;
                d[] dVarArr3 = K;
                hashMap.put(Integer.valueOf(dVarArr3[0].f13657a), 5);
                hashMap.put(Integer.valueOf(dVarArr3[1].f13657a), 1);
                hashMap.put(Integer.valueOf(dVarArr3[2].f13657a), 2);
                hashMap.put(Integer.valueOf(dVarArr3[3].f13657a), 3);
                hashMap.put(Integer.valueOf(dVarArr3[4].f13657a), 7);
                hashMap.put(Integer.valueOf(dVarArr3[5].f13657a), 8);
                Pattern.compile(".*[1-9].*");
                return;
            }
        }
    }

    public a(String str) {
        boolean z10;
        d[][] dVarArr = J;
        this.f13636e = new HashMap[dVarArr.length];
        this.f13637f = new HashSet(dVarArr.length);
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.f13634c = null;
            this.f13632a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    try {
                        b.a.c(fileInputStream2.getFD(), 0, OsConstants.SEEK_CUR);
                        z10 = true;
                    } catch (Exception unused) {
                        z10 = false;
                    }
                    if (z10) {
                        this.f13633b = fileInputStream2.getFD();
                    } else {
                        this.f13633b = null;
                    }
                    r(fileInputStream2);
                    b.b(fileInputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    b.b(fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                b.b(fileInputStream);
                throw th;
            }
        } else {
            throw new NullPointerException("filename cannot be null");
        }
    }

    public static double b(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            String[] split4 = split[2].split("/", -1);
            double parseDouble2 = ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d) + ((Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim())) / 60.0d) + parseDouble;
            if (!str2.equals("S")) {
                if (!str2.equals("W")) {
                    if (!str2.equals("N")) {
                        if (!str2.equals("E")) {
                            throw new IllegalArgumentException();
                        }
                    }
                    return parseDouble2;
                }
            }
            return -parseDouble2;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:68|69|70) */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        java.lang.Double.parseDouble(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015c, code lost:
        return new android.util.Pair<>(12, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0162, code lost:
        return new android.util.Pair<>(2, -1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x014e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> o(java.lang.String r12) {
        /*
            java.lang.String r0 = ","
            boolean r1 = r12.contains(r0)
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r1 == 0) goto L_0x00a6
            java.lang.String[] r12 = r12.split(r0, r6)
            r0 = r12[r2]
            android.util.Pair r0 = o(r0)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x0029
            return r0
        L_0x0029:
            int r1 = r12.length
            if (r3 >= r1) goto L_0x00a5
            r1 = r12[r3]
            android.util.Pair r1 = o(r1)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x004d
            java.lang.Object r2 = r1.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r2 = r6
            goto L_0x0055
        L_0x004d:
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
        L_0x0055:
            java.lang.Object r4 = r0.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 == r6) goto L_0x0080
            java.lang.Object r4 = r1.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r8 = r0.second
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x0077
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r4 = r0.second
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0080
        L_0x0077:
            java.lang.Object r1 = r0.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0081
        L_0x0080:
            r1 = r6
        L_0x0081:
            if (r2 != r6) goto L_0x008b
            if (r1 != r6) goto L_0x008b
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        L_0x008b:
            if (r2 != r6) goto L_0x0097
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r7)
            goto L_0x00a2
        L_0x0097:
            if (r1 != r6) goto L_0x00a2
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r7)
        L_0x00a2:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x00a5:
            return r0
        L_0x00a6:
            java.lang.String r0 = "/"
            boolean r1 = r12.contains(r0)
            r8 = 0
            if (r1 == 0) goto L_0x0105
            java.lang.String[] r12 = r12.split(r0, r6)
            int r0 = r12.length
            if (r0 != r4) goto L_0x00ff
            r0 = r12[r2]     // Catch:{ NumberFormatException -> 0x00ff }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x00ff }
            r12 = r12[r3]     // Catch:{ NumberFormatException -> 0x00ff }
            double r2 = java.lang.Double.parseDouble(r12)     // Catch:{ NumberFormatException -> 0x00ff }
            long r2 = (long) r2     // Catch:{ NumberFormatException -> 0x00ff }
            int r12 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r4 = 10
            if (r12 < 0) goto L_0x00f5
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 >= 0) goto L_0x00d0
            goto L_0x00f5
        L_0x00d0:
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r12 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r0 = 5
            if (r12 > 0) goto L_0x00eb
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x00dd
            goto L_0x00eb
        L_0x00dd:
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            r12.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x00ff }
            return r12
        L_0x00eb:
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r12
        L_0x00f5:
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r12
        L_0x00ff:
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        L_0x0105:
            long r0 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x014e }
            long r1 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            r2 = 4
            if (r1 < 0) goto L_0x0130
            long r3 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            r10 = 65535(0xffff, double:3.23786E-319)
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 > 0) goto L_0x0130
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r2)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x0130:
            long r0 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0144
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x0144:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x014e:
            java.lang.Double.parseDouble(r12)     // Catch:{ NumberFormatException -> 0x015d }
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x015d }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x015d }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x015d }
            return r12
        L_0x015d:
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.a.o(java.lang.String):android.util.Pair");
    }

    public static ByteOrder u(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        StringBuilder q10 = android.support.v4.media.a.q("Invalid byte order: ");
        q10.append(Integer.toHexString(readShort));
        throw new IOException(q10.toString());
    }

    public final void A(int i10, int i11) {
        if (!this.f13636e[i10].isEmpty() && !this.f13636e[i11].isEmpty()) {
            c cVar = this.f13636e[i10].get("ImageLength");
            c cVar2 = this.f13636e[i10].get("ImageWidth");
            c cVar3 = this.f13636e[i11].get("ImageLength");
            c cVar4 = this.f13636e[i11].get("ImageWidth");
            if (cVar != null && cVar2 != null && cVar3 != null && cVar4 != null) {
                int h10 = cVar.h(this.f13638g);
                int h11 = cVar2.h(this.f13638g);
                int h12 = cVar3.h(this.f13638g);
                int h13 = cVar4.h(this.f13638g);
                if (h10 < h12 && h11 < h13) {
                    HashMap<String, c>[] hashMapArr = this.f13636e;
                    HashMap<String, c> hashMap = hashMapArr[i10];
                    hashMapArr[i10] = hashMapArr[i11];
                    hashMapArr[i11] = hashMap;
                }
            }
        }
    }

    public final void B(f fVar, int i10) {
        c cVar;
        c cVar2;
        c cVar3 = this.f13636e[i10].get("DefaultCropSize");
        c cVar4 = this.f13636e[i10].get("SensorTopBorder");
        c cVar5 = this.f13636e[i10].get("SensorLeftBorder");
        c cVar6 = this.f13636e[i10].get("SensorBottomBorder");
        c cVar7 = this.f13636e[i10].get("SensorRightBorder");
        if (cVar3 != null) {
            if (cVar3.f13653a == 5) {
                e[] eVarArr = (e[]) cVar3.j(this.f13638g);
                if (eVarArr == null || eVarArr.length != 2) {
                    Arrays.toString(eVarArr);
                    return;
                }
                e eVar = eVarArr[0];
                e[] eVarArr2 = {eVar};
                cVar2 = c.d(eVarArr2, this.f13638g);
                e eVar2 = eVarArr[1];
                e[] eVarArr3 = {eVar2};
                cVar = c.d(eVarArr3, this.f13638g);
            } else {
                int[] iArr = (int[]) cVar3.j(this.f13638g);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    cVar2 = c.e(iArr[0], this.f13638g);
                    cVar = c.e(iArr[1], this.f13638g);
                }
            }
            this.f13636e[i10].put("ImageWidth", cVar2);
            this.f13636e[i10].put("ImageLength", cVar);
        } else if (cVar4 == null || cVar5 == null || cVar6 == null || cVar7 == null) {
            c cVar8 = this.f13636e[i10].get("ImageLength");
            c cVar9 = this.f13636e[i10].get("ImageWidth");
            if (cVar8 == null || cVar9 == null) {
                c cVar10 = this.f13636e[i10].get("JPEGInterchangeFormat");
                c cVar11 = this.f13636e[i10].get("JPEGInterchangeFormatLength");
                if (cVar10 != null && cVar11 != null) {
                    int h10 = cVar10.h(this.f13638g);
                    int h11 = cVar10.h(this.f13638g);
                    fVar.h((long) h10);
                    byte[] bArr = new byte[h11];
                    fVar.read(bArr);
                    g(new b(bArr), h10, i10);
                }
            }
        } else {
            int h12 = cVar4.h(this.f13638g);
            int h13 = cVar6.h(this.f13638g);
            int h14 = cVar7.h(this.f13638g);
            int h15 = cVar5.h(this.f13638g);
            if (h13 > h12 && h14 > h15) {
                c e10 = c.e(h13 - h12, this.f13638g);
                c e11 = c.e(h14 - h15, this.f13638g);
                this.f13636e[i10].put("ImageLength", e10);
                this.f13636e[i10].put("ImageWidth", e11);
            }
        }
    }

    public final void C() {
        A(0, 5);
        A(0, 4);
        A(5, 4);
        c cVar = this.f13636e[1].get("PixelXDimension");
        c cVar2 = this.f13636e[1].get("PixelYDimension");
        if (!(cVar == null || cVar2 == null)) {
            this.f13636e[0].put("ImageWidth", cVar);
            this.f13636e[0].put("ImageLength", cVar2);
        }
        if (this.f13636e[4].isEmpty() && q(this.f13636e[5])) {
            HashMap<String, c>[] hashMapArr = this.f13636e;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        q(this.f13636e[4]);
        x("ThumbnailOrientation", 0, "Orientation");
        x("ThumbnailImageLength", 0, "ImageLength");
        x("ThumbnailImageWidth", 0, "ImageWidth");
        x("ThumbnailOrientation", 5, "Orientation");
        x("ThumbnailImageLength", 5, "ImageLength");
        x("ThumbnailImageWidth", 5, "ImageWidth");
        x("Orientation", 4, "ThumbnailOrientation");
        x("ImageLength", 4, "ThumbnailImageLength");
        x("ImageWidth", 4, "ThumbnailImageWidth");
    }

    public final void a() {
        String c10 = c("DateTimeOriginal");
        if (c10 != null && c("DateTime") == null) {
            this.f13636e[0].put("DateTime", c.a(c10));
        }
        if (c("ImageWidth") == null) {
            this.f13636e[0].put("ImageWidth", c.b(0, this.f13638g));
        }
        if (c("ImageLength") == null) {
            this.f13636e[0].put("ImageLength", c.b(0, this.f13638g));
        }
        if (c("Orientation") == null) {
            this.f13636e[0].put("Orientation", c.b(0, this.f13638g));
        }
        if (c("LightSource") == null) {
            this.f13636e[1].put("LightSource", c.b(0, this.f13638g));
        }
    }

    public final String c(String str) {
        if (str != null) {
            c e10 = e(str);
            if (e10 != null) {
                if (!N.contains(str)) {
                    return e10.i(this.f13638g);
                }
                if (str.equals("GPSTimeStamp")) {
                    int i10 = e10.f13653a;
                    if (i10 != 5 && i10 != 10) {
                        return null;
                    }
                    e[] eVarArr = (e[]) e10.j(this.f13638g);
                    if (eVarArr == null || eVarArr.length != 3) {
                        Arrays.toString(eVarArr);
                        return null;
                    }
                    e eVar = eVarArr[0];
                    e eVar2 = eVarArr[1];
                    e eVar3 = eVarArr[2];
                    return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) eVar.f13661a) / ((float) eVar.f13662b))), Integer.valueOf((int) (((float) eVar2.f13661a) / ((float) eVar2.f13662b))), Integer.valueOf((int) (((float) eVar3.f13661a) / ((float) eVar3.f13662b)))});
                }
                try {
                    return Double.toString(e10.g(this.f13638g));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public final int d(int i10, String str) {
        c e10 = e(str);
        if (e10 == null) {
            return i10;
        }
        try {
            return e10.h(this.f13638g);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public final c e(String str) {
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                str = "PhotographicSensitivity";
            }
            for (int i10 = 0; i10 < J.length; i10++) {
                c cVar = this.f13636e[i10].get(str);
                if (cVar != null) {
                    return cVar;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010e, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0117, code lost:
        throw new java.lang.UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0118, code lost:
        r1.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011b, code lost:
        throw r11;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0110 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(o2.a.f r11) {
        /*
            r10 = this;
            java.lang.String r0 = "yes"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x011c
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever
            r1.<init>()
            o2.a$a r2 = new o2.a$a     // Catch:{ RuntimeException -> 0x0110 }
            r2.<init>(r11)     // Catch:{ RuntimeException -> 0x0110 }
            o2.b.C0168b.a(r1, r2)     // Catch:{ RuntimeException -> 0x0110 }
            r2 = 33
            java.lang.String r2 = r1.extractMetadata(r2)     // Catch:{ RuntimeException -> 0x0110 }
            r3 = 34
            java.lang.String r3 = r1.extractMetadata(r3)     // Catch:{ RuntimeException -> 0x0110 }
            r4 = 26
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0110 }
            r5 = 17
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0110 }
            boolean r4 = r0.equals(r4)     // Catch:{ RuntimeException -> 0x0110 }
            r6 = 0
            if (r4 == 0) goto L_0x0047
            r0 = 29
            java.lang.String r6 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0110 }
            r0 = 30
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0110 }
            r4 = 31
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0110 }
            goto L_0x0062
        L_0x0047:
            boolean r0 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x0110 }
            if (r0 == 0) goto L_0x0060
            r0 = 18
            java.lang.String r6 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0110 }
            r0 = 19
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0110 }
            r4 = 24
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0110 }
            goto L_0x0062
        L_0x0060:
            r0 = r6
            r4 = r0
        L_0x0062:
            r5 = 0
            if (r6 == 0) goto L_0x0078
            java.util.HashMap<java.lang.String, o2.a$c>[] r7 = r10.f13636e     // Catch:{ RuntimeException -> 0x0110 }
            r7 = r7[r5]     // Catch:{ RuntimeException -> 0x0110 }
            java.lang.String r8 = "ImageWidth"
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ RuntimeException -> 0x0110 }
            java.nio.ByteOrder r9 = r10.f13638g     // Catch:{ RuntimeException -> 0x0110 }
            o2.a$c r6 = o2.a.c.e(r6, r9)     // Catch:{ RuntimeException -> 0x0110 }
            r7.put(r8, r6)     // Catch:{ RuntimeException -> 0x0110 }
        L_0x0078:
            if (r0 == 0) goto L_0x008d
            java.util.HashMap<java.lang.String, o2.a$c>[] r6 = r10.f13636e     // Catch:{ RuntimeException -> 0x0110 }
            r6 = r6[r5]     // Catch:{ RuntimeException -> 0x0110 }
            java.lang.String r7 = "ImageLength"
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ RuntimeException -> 0x0110 }
            java.nio.ByteOrder r8 = r10.f13638g     // Catch:{ RuntimeException -> 0x0110 }
            o2.a$c r0 = o2.a.c.e(r0, r8)     // Catch:{ RuntimeException -> 0x0110 }
            r6.put(r7, r0)     // Catch:{ RuntimeException -> 0x0110 }
        L_0x008d:
            r0 = 6
            if (r4 == 0) goto L_0x00b7
            r6 = 1
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ RuntimeException -> 0x0110 }
            r7 = 90
            if (r4 == r7) goto L_0x00a7
            r7 = 180(0xb4, float:2.52E-43)
            if (r4 == r7) goto L_0x00a5
            r7 = 270(0x10e, float:3.78E-43)
            if (r4 == r7) goto L_0x00a2
            goto L_0x00a8
        L_0x00a2:
            r6 = 8
            goto L_0x00a8
        L_0x00a5:
            r6 = 3
            goto L_0x00a8
        L_0x00a7:
            r6 = r0
        L_0x00a8:
            java.util.HashMap<java.lang.String, o2.a$c>[] r4 = r10.f13636e     // Catch:{ RuntimeException -> 0x0110 }
            r4 = r4[r5]     // Catch:{ RuntimeException -> 0x0110 }
            java.lang.String r7 = "Orientation"
            java.nio.ByteOrder r8 = r10.f13638g     // Catch:{ RuntimeException -> 0x0110 }
            o2.a$c r6 = o2.a.c.e(r6, r8)     // Catch:{ RuntimeException -> 0x0110 }
            r4.put(r7, r6)     // Catch:{ RuntimeException -> 0x0110 }
        L_0x00b7:
            if (r2 == 0) goto L_0x010a
            if (r3 == 0) goto L_0x010a
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ RuntimeException -> 0x0110 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ RuntimeException -> 0x0110 }
            if (r3 <= r0) goto L_0x0102
            long r6 = (long) r2     // Catch:{ RuntimeException -> 0x0110 }
            r11.h(r6)     // Catch:{ RuntimeException -> 0x0110 }
            byte[] r4 = new byte[r0]     // Catch:{ RuntimeException -> 0x0110 }
            int r6 = r11.read(r4)     // Catch:{ RuntimeException -> 0x0110 }
            if (r6 != r0) goto L_0x00fa
            int r2 = r2 + r0
            int r3 = r3 + -6
            byte[] r0 = Q     // Catch:{ RuntimeException -> 0x0110 }
            boolean r0 = java.util.Arrays.equals(r4, r0)     // Catch:{ RuntimeException -> 0x0110 }
            if (r0 == 0) goto L_0x00f2
            byte[] r0 = new byte[r3]     // Catch:{ RuntimeException -> 0x0110 }
            int r11 = r11.read(r0)     // Catch:{ RuntimeException -> 0x0110 }
            if (r11 != r3) goto L_0x00ea
            r10.f13641j = r2     // Catch:{ RuntimeException -> 0x0110 }
            r10.v(r5, r0)     // Catch:{ RuntimeException -> 0x0110 }
            goto L_0x010a
        L_0x00ea:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0110 }
            java.lang.String r0 = "Can't read exif"
            r11.<init>(r0)     // Catch:{ RuntimeException -> 0x0110 }
            throw r11     // Catch:{ RuntimeException -> 0x0110 }
        L_0x00f2:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0110 }
            java.lang.String r0 = "Invalid identifier"
            r11.<init>(r0)     // Catch:{ RuntimeException -> 0x0110 }
            throw r11     // Catch:{ RuntimeException -> 0x0110 }
        L_0x00fa:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0110 }
            java.lang.String r0 = "Can't read identifier"
            r11.<init>(r0)     // Catch:{ RuntimeException -> 0x0110 }
            throw r11     // Catch:{ RuntimeException -> 0x0110 }
        L_0x0102:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0110 }
            java.lang.String r0 = "Invalid exif length"
            r11.<init>(r0)     // Catch:{ RuntimeException -> 0x0110 }
            throw r11     // Catch:{ RuntimeException -> 0x0110 }
        L_0x010a:
            r1.release()
            return
        L_0x010e:
            r11 = move-exception
            goto L_0x0118
        L_0x0110:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
            r11.<init>(r0)     // Catch:{ all -> 0x010e }
            throw r11     // Catch:{ all -> 0x010e }
        L_0x0118:
            r1.release()
            throw r11
        L_0x011c:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Reading EXIF from HEIF files is supported from SDK 28 and above"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.a.f(o2.a$f):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0147 A[LOOP:0: B:8:0x0024->B:78:0x0147, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x014f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(o2.a.b r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            boolean r3 = f13619n
            if (r3 == 0) goto L_0x000d
            java.util.Objects.toString(r17)
        L_0x000d:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            r1.f13650b = r3
            byte r3 = r17.readByte()
            java.lang.String r4 = "Invalid marker: "
            r5 = -1
            if (r3 != r5) goto L_0x0190
            byte r6 = r17.readByte()
            r7 = -40
            if (r6 != r7) goto L_0x0179
            r3 = 2
            r4 = r3
        L_0x0024:
            byte r6 = r17.readByte()
            if (r6 != r5) goto L_0x0160
            r5 = 1
            int r3 = r3 + r5
            byte r6 = r17.readByte()
            boolean r7 = f13619n
            if (r7 == 0) goto L_0x0039
            r8 = r6 & 255(0xff, float:3.57E-43)
            java.lang.Integer.toHexString(r8)
        L_0x0039:
            int r3 = r3 + r5
            r8 = -39
            if (r6 == r8) goto L_0x015b
            r8 = -38
            if (r6 != r8) goto L_0x0044
            goto L_0x015b
        L_0x0044:
            int r8 = r17.readUnsignedShort()
            int r8 = r8 - r4
            int r3 = r3 + r4
            if (r7 == 0) goto L_0x0051
            r4 = r6 & 255(0xff, float:3.57E-43)
            java.lang.Integer.toHexString(r4)
        L_0x0051:
            java.lang.String r4 = "Invalid length"
            if (r8 < 0) goto L_0x0155
            r7 = -31
            r9 = 0
            if (r6 == r7) goto L_0x00d1
            r7 = -2
            if (r6 == r7) goto L_0x00a5
            switch(r6) {
                case -64: goto L_0x006b;
                case -63: goto L_0x006b;
                case -62: goto L_0x006b;
                case -61: goto L_0x006b;
                default: goto L_0x0060;
            }
        L_0x0060:
            switch(r6) {
                case -59: goto L_0x006b;
                case -58: goto L_0x006b;
                case -57: goto L_0x006b;
                default: goto L_0x0063;
            }
        L_0x0063:
            switch(r6) {
                case -55: goto L_0x006b;
                case -54: goto L_0x006b;
                case -53: goto L_0x006b;
                default: goto L_0x0066;
            }
        L_0x0066:
            switch(r6) {
                case -51: goto L_0x006b;
                case -50: goto L_0x006b;
                case -49: goto L_0x006b;
                default: goto L_0x0069;
            }
        L_0x0069:
            goto L_0x0145
        L_0x006b:
            r1.d(r5)
            java.util.HashMap<java.lang.String, o2.a$c>[] r5 = r0.f13636e
            r5 = r5[r2]
            r6 = 4
            if (r2 == r6) goto L_0x0078
            java.lang.String r7 = "ImageLength"
            goto L_0x007a
        L_0x0078:
            java.lang.String r7 = "ThumbnailImageLength"
        L_0x007a:
            int r9 = r17.readUnsignedShort()
            long r9 = (long) r9
            java.nio.ByteOrder r11 = r0.f13638g
            o2.a$c r9 = o2.a.c.b(r9, r11)
            r5.put(r7, r9)
            java.util.HashMap<java.lang.String, o2.a$c>[] r5 = r0.f13636e
            r5 = r5[r2]
            if (r2 == r6) goto L_0x0091
            java.lang.String r6 = "ImageWidth"
            goto L_0x0093
        L_0x0091:
            java.lang.String r6 = "ThumbnailImageWidth"
        L_0x0093:
            int r7 = r17.readUnsignedShort()
            long r9 = (long) r7
            java.nio.ByteOrder r7 = r0.f13638g
            o2.a$c r7 = o2.a.c.b(r9, r7)
            r5.put(r6, r7)
            int r8 = r8 + -5
            goto L_0x0145
        L_0x00a5:
            byte[] r6 = new byte[r8]
            int r7 = r1.read(r6)
            if (r7 != r8) goto L_0x00c9
            java.lang.String r7 = "UserComment"
            java.lang.String r8 = r0.c(r7)
            if (r8 != 0) goto L_0x0144
            java.util.HashMap<java.lang.String, o2.a$c>[] r8 = r0.f13636e
            r5 = r8[r5]
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r10 = P
            r8.<init>(r6, r10)
            o2.a$c r6 = o2.a.c.a(r8)
            r5.put(r7, r6)
            goto L_0x0144
        L_0x00c9:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid exif"
            r1.<init>(r2)
            throw r1
        L_0x00d1:
            byte[] r6 = new byte[r8]
            r1.readFully(r6)
            int r7 = r3 + r8
            byte[] r10 = Q
            if (r10 != 0) goto L_0x00dd
            goto L_0x00eb
        L_0x00dd:
            int r11 = r10.length
            if (r8 >= r11) goto L_0x00e1
            goto L_0x00eb
        L_0x00e1:
            r11 = r9
        L_0x00e2:
            int r12 = r10.length
            if (r11 >= r12) goto L_0x00f0
            byte r12 = r6[r11]
            byte r13 = r10[r11]
            if (r12 == r13) goto L_0x00ed
        L_0x00eb:
            r11 = r9
            goto L_0x00f1
        L_0x00ed:
            int r11 = r11 + 1
            goto L_0x00e2
        L_0x00f0:
            r11 = r5
        L_0x00f1:
            if (r11 == 0) goto L_0x010a
            int r5 = r10.length
            byte[] r5 = java.util.Arrays.copyOfRange(r6, r5, r8)
            int r3 = r18 + r3
            int r6 = r10.length
            int r3 = r3 + r6
            r0.f13641j = r3
            r0.v(r2, r5)
            o2.a$b r3 = new o2.a$b
            r3.<init>((byte[]) r5)
            r0.z(r3)
            goto L_0x0143
        L_0x010a:
            byte[] r10 = R
            if (r10 != 0) goto L_0x010f
            goto L_0x011d
        L_0x010f:
            int r11 = r10.length
            if (r8 >= r11) goto L_0x0113
            goto L_0x011d
        L_0x0113:
            r11 = r9
        L_0x0114:
            int r12 = r10.length
            if (r11 >= r12) goto L_0x0122
            byte r12 = r6[r11]
            byte r13 = r10[r11]
            if (r12 == r13) goto L_0x011f
        L_0x011d:
            r5 = r9
            goto L_0x0122
        L_0x011f:
            int r11 = r11 + 1
            goto L_0x0114
        L_0x0122:
            if (r5 == 0) goto L_0x0143
            int r5 = r10.length
            int r3 = r3 + r5
            int r5 = r10.length
            byte[] r13 = java.util.Arrays.copyOfRange(r6, r5, r8)
            java.lang.String r5 = "Xmp"
            java.lang.String r6 = r0.c(r5)
            if (r6 != 0) goto L_0x0143
            java.util.HashMap<java.lang.String, o2.a$c>[] r6 = r0.f13636e
            r6 = r6[r9]
            o2.a$c r8 = new o2.a$c
            r14 = 1
            int r15 = r13.length
            long r11 = (long) r3
            r10 = r8
            r10.<init>(r11, r13, r14, r15)
            r6.put(r5, r8)
        L_0x0143:
            r3 = r7
        L_0x0144:
            r8 = r9
        L_0x0145:
            if (r8 < 0) goto L_0x014f
            r1.d(r8)
            int r3 = r3 + r8
            r4 = 2
            r5 = -1
            goto L_0x0024
        L_0x014f:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r4)
            throw r1
        L_0x0155:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r4)
            throw r1
        L_0x015b:
            java.nio.ByteOrder r2 = r0.f13638g
            r1.f13650b = r2
            return
        L_0x0160:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid marker:"
            java.lang.StringBuilder r2 = android.support.v4.media.a.q(r2)
            r3 = r6 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0179:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = android.support.v4.media.a.q(r4)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0190:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = android.support.v4.media.a.q(r4)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.a.g(o2.a$b, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00c4, code lost:
        if (r6 != null) goto L_0x00c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0110 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0112 A[SYNTHETIC, Splitter:B:106:0x0112] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0142 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int h(java.io.BufferedInputStream r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = 5000(0x1388, float:7.006E-42)
            r0.mark(r2)
            byte[] r3 = new byte[r2]
            r0.read(r3)
            r18.reset()
            r4 = 0
        L_0x0012:
            byte[] r5 = f13624s
            int r6 = r5.length
            r7 = 1
            if (r4 >= r6) goto L_0x0023
            byte r6 = r3[r4]
            byte r5 = r5[r4]
            if (r6 == r5) goto L_0x0020
            r4 = 0
            goto L_0x0024
        L_0x0020:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0023:
            r4 = r7
        L_0x0024:
            r5 = 4
            if (r4 == 0) goto L_0x0028
            return r5
        L_0x0028:
            java.nio.charset.Charset r4 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r6 = "FUJIFILMCCD-RAW"
            byte[] r4 = r6.getBytes(r4)
            r6 = 0
        L_0x0033:
            int r8 = r4.length
            if (r6 >= r8) goto L_0x0041
            byte r8 = r3[r6]
            byte r9 = r4[r6]
            if (r8 == r9) goto L_0x003e
            r4 = 0
            goto L_0x0042
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0033
        L_0x0041:
            r4 = r7
        L_0x0042:
            if (r4 == 0) goto L_0x0047
            r0 = 9
            return r0
        L_0x0047:
            r4 = 0
            o2.a$b r6 = new o2.a$b     // Catch:{ Exception -> 0x00c3, all -> 0x00bc }
            r6.<init>((byte[]) r3)     // Catch:{ Exception -> 0x00c3, all -> 0x00bc }
            int r8 = r6.readInt()     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            long r8 = (long) r8     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            byte[] r10 = new byte[r5]     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            r6.read(r10)     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            byte[] r11 = f13625t     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            boolean r10 = java.util.Arrays.equals(r10, r11)     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            if (r10 != 0) goto L_0x0061
            goto L_0x00c6
        L_0x0061:
            r10 = 1
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r13 = 16
            r15 = 8
            if (r12 != 0) goto L_0x0074
            long r8 = r6.readLong()     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            int r12 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r12 >= 0) goto L_0x0075
            goto L_0x00c6
        L_0x0074:
            r13 = r15
        L_0x0075:
            long r0 = (long) r2     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x007b
            r8 = r0
        L_0x007b:
            long r8 = r8 - r13
            int r0 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0081
            goto L_0x00c6
        L_0x0081:
            byte[] r0 = new byte[r5]     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            r1 = 0
            r12 = 0
            r13 = 0
        L_0x0087:
            r14 = 4
            long r14 = r8 / r14
            int r14 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r14 >= 0) goto L_0x00c6
            int r14 = r6.read(r0)     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            if (r14 == r5) goto L_0x0096
            goto L_0x00c6
        L_0x0096:
            int r14 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r14 != 0) goto L_0x009b
            goto L_0x00b7
        L_0x009b:
            byte[] r14 = f13626u     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            boolean r14 = java.util.Arrays.equals(r0, r14)     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            if (r14 == 0) goto L_0x00a5
            r12 = r7
            goto L_0x00ae
        L_0x00a5:
            byte[] r14 = f13627v     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            boolean r14 = java.util.Arrays.equals(r0, r14)     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            if (r14 == 0) goto L_0x00ae
            r13 = r7
        L_0x00ae:
            if (r12 == 0) goto L_0x00b7
            if (r13 == 0) goto L_0x00b7
            r6.close()
            r0 = r7
            goto L_0x00ca
        L_0x00b7:
            long r1 = r1 + r10
            goto L_0x0087
        L_0x00b9:
            r0 = move-exception
            r4 = r6
            goto L_0x00bd
        L_0x00bc:
            r0 = move-exception
        L_0x00bd:
            if (r4 == 0) goto L_0x00c2
            r4.close()
        L_0x00c2:
            throw r0
        L_0x00c3:
            r6 = r4
        L_0x00c4:
            if (r6 == 0) goto L_0x00c9
        L_0x00c6:
            r6.close()
        L_0x00c9:
            r0 = 0
        L_0x00ca:
            if (r0 == 0) goto L_0x00cf
            r0 = 12
            return r0
        L_0x00cf:
            o2.a$b r1 = new o2.a$b     // Catch:{ Exception -> 0x0105, all -> 0x00fc }
            r1.<init>((byte[]) r3)     // Catch:{ Exception -> 0x0105, all -> 0x00fc }
            java.nio.ByteOrder r0 = u(r1)     // Catch:{ Exception -> 0x00f9, all -> 0x00f4 }
            r2 = r17
            r2.f13638g = r0     // Catch:{ Exception -> 0x0108, all -> 0x00f2 }
            r1.f13650b = r0     // Catch:{ Exception -> 0x0108, all -> 0x00f2 }
            short r0 = r1.readShort()     // Catch:{ Exception -> 0x0108, all -> 0x00f2 }
            r6 = 20306(0x4f52, float:2.8455E-41)
            if (r0 == r6) goto L_0x00ed
            r6 = 21330(0x5352, float:2.989E-41)
            if (r0 != r6) goto L_0x00eb
            goto L_0x00ed
        L_0x00eb:
            r0 = 0
            goto L_0x00ee
        L_0x00ed:
            r0 = r7
        L_0x00ee:
            r1.close()
            goto L_0x010e
        L_0x00f2:
            r0 = move-exception
            goto L_0x00f7
        L_0x00f4:
            r0 = move-exception
            r2 = r17
        L_0x00f7:
            r4 = r1
            goto L_0x00ff
        L_0x00f9:
            r2 = r17
            goto L_0x0108
        L_0x00fc:
            r0 = move-exception
            r2 = r17
        L_0x00ff:
            if (r4 == 0) goto L_0x0104
            r4.close()
        L_0x0104:
            throw r0
        L_0x0105:
            r2 = r17
            r1 = r4
        L_0x0108:
            if (r1 == 0) goto L_0x010d
            r1.close()
        L_0x010d:
            r0 = 0
        L_0x010e:
            if (r0 == 0) goto L_0x0112
            r0 = 7
            return r0
        L_0x0112:
            o2.a$b r1 = new o2.a$b     // Catch:{ Exception -> 0x013a, all -> 0x0133 }
            r1.<init>((byte[]) r3)     // Catch:{ Exception -> 0x013a, all -> 0x0133 }
            java.nio.ByteOrder r0 = u(r1)     // Catch:{ Exception -> 0x0131, all -> 0x012e }
            r2.f13638g = r0     // Catch:{ Exception -> 0x0131, all -> 0x012e }
            r1.f13650b = r0     // Catch:{ Exception -> 0x0131, all -> 0x012e }
            short r0 = r1.readShort()     // Catch:{ Exception -> 0x0131, all -> 0x012e }
            r4 = 85
            if (r0 != r4) goto L_0x0129
            r0 = r7
            goto L_0x012a
        L_0x0129:
            r0 = 0
        L_0x012a:
            r1.close()
            goto L_0x0140
        L_0x012e:
            r0 = move-exception
            r4 = r1
            goto L_0x0134
        L_0x0131:
            r4 = r1
            goto L_0x013a
        L_0x0133:
            r0 = move-exception
        L_0x0134:
            if (r4 == 0) goto L_0x0139
            r4.close()
        L_0x0139:
            throw r0
        L_0x013a:
            if (r4 == 0) goto L_0x013f
            r4.close()
        L_0x013f:
            r0 = 0
        L_0x0140:
            if (r0 == 0) goto L_0x0145
            r0 = 10
            return r0
        L_0x0145:
            r0 = 0
        L_0x0146:
            byte[] r1 = f13630y
            int r4 = r1.length
            if (r0 >= r4) goto L_0x0156
            byte r4 = r3[r0]
            byte r1 = r1[r0]
            if (r4 == r1) goto L_0x0153
            r0 = 0
            goto L_0x0157
        L_0x0153:
            int r0 = r0 + 1
            goto L_0x0146
        L_0x0156:
            r0 = r7
        L_0x0157:
            if (r0 == 0) goto L_0x015c
            r0 = 13
            return r0
        L_0x015c:
            r0 = 0
        L_0x015d:
            byte[] r1 = C
            int r4 = r1.length
            if (r0 >= r4) goto L_0x016c
            byte r4 = r3[r0]
            byte r1 = r1[r0]
            if (r4 == r1) goto L_0x0169
            goto L_0x017d
        L_0x0169:
            int r0 = r0 + 1
            goto L_0x015d
        L_0x016c:
            r0 = 0
        L_0x016d:
            byte[] r1 = D
            int r4 = r1.length
            if (r0 >= r4) goto L_0x0182
            byte[] r4 = C
            int r4 = r4.length
            int r4 = r4 + r0
            int r4 = r4 + r5
            byte r4 = r3[r4]
            byte r1 = r1[r0]
            if (r4 == r1) goto L_0x017f
        L_0x017d:
            r7 = 0
            goto L_0x0182
        L_0x017f:
            int r0 = r0 + 1
            goto L_0x016d
        L_0x0182:
            if (r7 == 0) goto L_0x0187
            r0 = 14
            return r0
        L_0x0187:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.a.h(java.io.BufferedInputStream):int");
    }

    public final void i(f fVar) {
        int i10;
        int i11;
        l(fVar);
        c cVar = this.f13636e[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f13656d);
            fVar2.f13650b = this.f13638g;
            byte[] bArr = f13628w;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.h(0);
            byte[] bArr3 = f13629x;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.h(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.h(12);
            }
            w(fVar2, 6);
            c cVar2 = this.f13636e[7].get("PreviewImageStart");
            c cVar3 = this.f13636e[7].get("PreviewImageLength");
            if (!(cVar2 == null || cVar3 == null)) {
                this.f13636e[5].put("JPEGInterchangeFormat", cVar2);
                this.f13636e[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = this.f13636e[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.j(this.f13638g);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 > i13 && (i10 = iArr[3]) > (i11 = iArr[1])) {
                    int i14 = (i12 - i13) + 1;
                    int i15 = (i10 - i11) + 1;
                    if (i14 < i15) {
                        int i16 = i14 + i15;
                        i15 = i16 - i15;
                        i14 = i16 - i15;
                    }
                    c e10 = c.e(i14, this.f13638g);
                    c e11 = c.e(i15, this.f13638g);
                    this.f13636e[0].put("ImageWidth", e10);
                    this.f13636e[0].put("ImageLength", e11);
                }
            }
        }
    }

    public final void j(b bVar) {
        if (f13619n) {
            Objects.toString(bVar);
        }
        bVar.f13650b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f13630y;
        bVar.d(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i10 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i11 = i10 + 4;
                    if (i11 == 16) {
                        if (!Arrays.equals(bArr2, A)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, B)) {
                        if (Arrays.equals(bArr2, f13631z)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f13641j = i11;
                                    v(0, bArr3);
                                    C();
                                    z(new b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + b.a(bArr2));
                        }
                        int i12 = readInt + 4;
                        bVar.d(i12);
                        length = i11 + i12;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void k(b bVar) {
        if (f13619n) {
            Objects.toString(bVar);
        }
        bVar.d(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.d(i10 - bVar.f13651c);
        bVar.read(bArr4);
        g(new b(bArr4), i10, 5);
        bVar.d(i12 - bVar.f13651c);
        bVar.f13650b = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        for (int i13 = 0; i13 < readInt; i13++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == I.f13657a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c e10 = c.e(readShort, this.f13638g);
                c e11 = c.e(readShort2, this.f13638g);
                this.f13636e[0].put("ImageLength", e10);
                this.f13636e[0].put("ImageWidth", e11);
                return;
            }
            bVar.d(readUnsignedShort2);
        }
    }

    public final void l(f fVar) {
        c cVar;
        s(fVar);
        w(fVar, 0);
        B(fVar, 0);
        B(fVar, 5);
        B(fVar, 4);
        C();
        if (this.f13635d == 8 && (cVar = this.f13636e[1].get("MakerNote")) != null) {
            f fVar2 = new f(cVar.f13656d);
            fVar2.f13650b = this.f13638g;
            fVar2.d(6);
            w(fVar2, 9);
            c cVar2 = this.f13636e[9].get("ColorSpace");
            if (cVar2 != null) {
                this.f13636e[1].put("ColorSpace", cVar2);
            }
        }
    }

    public final void m(f fVar) {
        if (f13619n) {
            Objects.toString(fVar);
        }
        l(fVar);
        c cVar = this.f13636e[0].get("JpgFromRaw");
        if (cVar != null) {
            g(new b(cVar.f13656d), (int) cVar.f13655c, 5);
        }
        c cVar2 = this.f13636e[0].get("ISO");
        c cVar3 = this.f13636e[1].get("PhotographicSensitivity");
        if (cVar2 != null && cVar3 == null) {
            this.f13636e[1].put("PhotographicSensitivity", cVar2);
        }
    }

    public final void n(b bVar) {
        if (f13619n) {
            Objects.toString(bVar);
        }
        bVar.f13650b = ByteOrder.LITTLE_ENDIAN;
        bVar.d(C.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = D;
        bVar.d(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int readInt2 = bVar.readInt();
                    int i10 = length + 4 + 4;
                    if (Arrays.equals(E, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (bVar.read(bArr3) == readInt2) {
                            this.f13641j = i10;
                            v(0, bArr3);
                            z(new b(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b.a(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i10 + readInt2;
                    if (length != readInt) {
                        if (length <= readInt) {
                            bVar.d(readInt2);
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void p(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int h10 = cVar.h(this.f13638g);
            int h11 = cVar2.h(this.f13638g);
            if (this.f13635d == 7) {
                h10 += this.f13642k;
            }
            if (h10 > 0 && h11 > 0) {
                this.f13639h = true;
                if (this.f13632a == null && this.f13634c == null && this.f13633b == null) {
                    bVar.skip((long) h10);
                    bVar.read(new byte[h11]);
                }
            }
        }
    }

    public final boolean q(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        int h10 = cVar.h(this.f13638g);
        int h11 = cVar2.h(this.f13638g);
        if (h10 > 512 || h11 > 512) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:38|39|40|(1:52)) */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0088, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r7 = f13619n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008c, code lost:
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008f, code lost:
        if (r7 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0095, code lost:
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009a, code lost:
        if (f13619n != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009c, code lost:
        t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009f, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x008a */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037 A[Catch:{ IOException | UnsupportedOperationException -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062 A[Catch:{ IOException | UnsupportedOperationException -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(java.io.InputStream r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x00a0
            r0 = 0
            r1 = r0
        L_0x0004:
            o2.a$d[][] r2 = J     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            int r2 = r2.length     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            if (r1 >= r2) goto L_0x0015
            java.util.HashMap<java.lang.String, o2.a$c>[] r2 = r6.f13636e     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            r3.<init>()     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            r2[r1] = r3     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0015:
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r7, r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            int r7 = r6.h(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            r6.f13635d = r7     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            r2 = 14
            r3 = 13
            r4 = 9
            r5 = 4
            if (r7 == r5) goto L_0x0034
            if (r7 == r4) goto L_0x0034
            if (r7 == r3) goto L_0x0034
            if (r7 != r2) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r7 = 1
            goto L_0x0035
        L_0x0034:
            r7 = r0
        L_0x0035:
            if (r7 == 0) goto L_0x0062
            o2.a$f r7 = new o2.a$f     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            r7.<init>((java.io.InputStream) r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            int r0 = r6.f13635d     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            r1 = 12
            if (r0 != r1) goto L_0x0046
            r6.f(r7)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            goto L_0x0058
        L_0x0046:
            r1 = 7
            if (r0 != r1) goto L_0x004d
            r6.i(r7)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            goto L_0x0058
        L_0x004d:
            r1 = 10
            if (r0 != r1) goto L_0x0055
            r6.m(r7)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            goto L_0x0058
        L_0x0055:
            r6.l(r7)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
        L_0x0058:
            int r0 = r6.f13641j     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            long r0 = (long) r0     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            r7.h(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            r6.z(r7)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            goto L_0x0080
        L_0x0062:
            o2.a$b r7 = new o2.a$b     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            r7.<init>((java.io.InputStream) r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            int r1 = r6.f13635d     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            if (r1 != r5) goto L_0x006f
            r6.g(r7, r0, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            goto L_0x0080
        L_0x006f:
            if (r1 != r3) goto L_0x0075
            r6.j(r7)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            goto L_0x0080
        L_0x0075:
            if (r1 != r4) goto L_0x007b
            r6.k(r7)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            goto L_0x0080
        L_0x007b:
            if (r1 != r2) goto L_0x0080
            r6.n(r7)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
        L_0x0080:
            r6.a()
            boolean r7 = f13619n
            if (r7 == 0) goto L_0x0094
            goto L_0x0091
        L_0x0088:
            r7 = move-exception
            goto L_0x0095
        L_0x008a:
            boolean r7 = f13619n     // Catch:{ all -> 0x0088 }
            r6.a()
            if (r7 == 0) goto L_0x0094
        L_0x0091:
            r6.t()
        L_0x0094:
            return
        L_0x0095:
            r6.a()
            boolean r0 = f13619n
            if (r0 == 0) goto L_0x009f
            r6.t()
        L_0x009f:
            throw r7
        L_0x00a0:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "inputstream shouldn't be null"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.a.r(java.io.InputStream):void");
    }

    public final void s(b bVar) {
        ByteOrder u10 = u(bVar);
        this.f13638g = u10;
        bVar.f13650b = u10;
        int readUnsignedShort = bVar.readUnsignedShort();
        int i10 = this.f13635d;
        if (i10 == 7 || i10 == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt >= 8) {
                int i11 = readInt - 8;
                if (i11 > 0) {
                    bVar.d(i11);
                    return;
                }
                return;
            }
            throw new IOException(android.support.v4.media.a.m("Invalid first Ifd offset: ", readInt));
        }
        StringBuilder q10 = android.support.v4.media.a.q("Invalid start code: ");
        q10.append(Integer.toHexString(readUnsignedShort));
        throw new IOException(q10.toString());
    }

    public final void t() {
        for (int i10 = 0; i10 < this.f13636e.length; i10++) {
            this.f13636e[i10].size();
            for (Map.Entry next : this.f13636e[i10].entrySet()) {
                c cVar = (c) next.getValue();
                String str = (String) next.getKey();
                cVar.toString();
                cVar.i(this.f13638g);
            }
        }
    }

    public final void v(int i10, byte[] bArr) {
        f fVar = new f(bArr);
        s(fVar);
        w(fVar, i10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0190  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(o2.a.f r25, int r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            java.util.HashSet r3 = r0.f13637f
            int r4 = r1.f13651c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            short r3 = r25.readShort()
            if (r3 > 0) goto L_0x0018
            return
        L_0x0018:
            r4 = 0
            r5 = r4
        L_0x001a:
            r6 = 5
            r10 = 1
            if (r5 >= r3) goto L_0x0244
            int r11 = r25.readUnsignedShort()
            int r12 = r25.readUnsignedShort()
            int r14 = r25.readInt()
            int r13 = r1.f13651c
            long r7 = (long) r13
            r17 = 4
            long r7 = r7 + r17
            java.util.HashMap<java.lang.Integer, o2.a$d>[] r13 = L
            r13 = r13[r2]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            java.lang.Object r13 = r13.get(r15)
            o2.a$d r13 = (o2.a.d) r13
            boolean r21 = f13619n
            r15 = 2
            r9 = 3
            if (r21 == 0) goto L_0x006e
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r26)
            r6[r4] = r16
            java.lang.Integer r16 = java.lang.Integer.valueOf(r11)
            r6[r10] = r16
            if (r13 == 0) goto L_0x0058
            java.lang.String r10 = r13.f13658b
            goto L_0x0059
        L_0x0058:
            r10 = 0
        L_0x0059:
            r6[r15] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r6[r9] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)
            r16 = 4
            r6[r16] = r10
            java.lang.String r10 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String.format(r10, r6)
        L_0x006e:
            r15 = 7
            if (r13 != 0) goto L_0x0076
        L_0x0071:
            r23 = r3
            r9 = 2
            goto L_0x00d2
        L_0x0076:
            if (r12 <= 0) goto L_0x0071
            int[] r4 = G
            int r10 = r4.length
            if (r12 < r10) goto L_0x007e
            goto L_0x0071
        L_0x007e:
            int r10 = r13.f13659c
            if (r10 == r15) goto L_0x00ac
            if (r12 != r15) goto L_0x0085
            goto L_0x00ac
        L_0x0085:
            if (r10 == r12) goto L_0x00ac
            int r15 = r13.f13660d
            if (r15 != r12) goto L_0x008c
            goto L_0x00ac
        L_0x008c:
            r6 = 4
            if (r10 == r6) goto L_0x0091
            if (r15 != r6) goto L_0x0094
        L_0x0091:
            if (r12 != r9) goto L_0x0094
            goto L_0x00ac
        L_0x0094:
            r6 = 9
            if (r10 == r6) goto L_0x009a
            if (r15 != r6) goto L_0x009f
        L_0x009a:
            r6 = 8
            if (r12 != r6) goto L_0x009f
            goto L_0x00ac
        L_0x009f:
            r6 = 12
            if (r10 == r6) goto L_0x00a5
            if (r15 != r6) goto L_0x00aa
        L_0x00a5:
            r6 = 11
            if (r12 != r6) goto L_0x00aa
            goto L_0x00ac
        L_0x00aa:
            r6 = 0
            goto L_0x00ad
        L_0x00ac:
            r6 = 1
        L_0x00ad:
            if (r6 != 0) goto L_0x00b6
            if (r21 == 0) goto L_0x0071
            java.lang.String[] r4 = F
            r4 = r4[r12]
            goto L_0x0071
        L_0x00b6:
            r6 = 7
            if (r12 != r6) goto L_0x00ba
            r12 = r10
        L_0x00ba:
            long r9 = (long) r14
            r4 = r4[r12]
            r23 = r3
            long r3 = (long) r4
            long r3 = r3 * r9
            r9 = 0
            int r6 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            r9 = 2
            if (r6 < 0) goto L_0x00d4
            r19 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d0
            goto L_0x00d4
        L_0x00d0:
            r6 = 1
            goto L_0x00d5
        L_0x00d2:
            r3 = 0
        L_0x00d4:
            r6 = 0
        L_0x00d5:
            if (r6 != 0) goto L_0x00de
            r1.h(r7)
            r22 = r5
            goto L_0x023a
        L_0x00de:
            int r6 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            java.lang.String r10 = "Compression"
            if (r6 <= 0) goto L_0x014c
            int r6 = r25.readInt()
            int r15 = r0.f13635d
            r9 = 7
            if (r15 != r9) goto L_0x0143
            java.lang.String r9 = r13.f13658b
            java.lang.String r15 = "MakerNote"
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L_0x00fa
            r0.f13642k = r6
            goto L_0x0143
        L_0x00fa:
            r9 = 6
            if (r2 != r9) goto L_0x0143
            java.lang.String r15 = r13.f13658b
            java.lang.String r9 = "ThumbnailImage"
            boolean r9 = r9.equals(r15)
            if (r9 == 0) goto L_0x0143
            r0.f13643l = r6
            r0.f13644m = r14
            java.nio.ByteOrder r9 = r0.f13638g
            r15 = 6
            o2.a$c r9 = o2.a.c.e(r15, r9)
            int r15 = r0.f13643l
            r17 = r14
            long r14 = (long) r15
            r22 = r5
            java.nio.ByteOrder r5 = r0.f13638g
            o2.a$c r5 = o2.a.c.b(r14, r5)
            int r14 = r0.f13644m
            long r14 = (long) r14
            java.nio.ByteOrder r2 = r0.f13638g
            o2.a$c r2 = o2.a.c.b(r14, r2)
            java.util.HashMap<java.lang.String, o2.a$c>[] r14 = r0.f13636e
            r15 = 4
            r14 = r14[r15]
            r14.put(r10, r9)
            java.util.HashMap<java.lang.String, o2.a$c>[] r9 = r0.f13636e
            r9 = r9[r15]
            java.lang.String r14 = "JPEGInterchangeFormat"
            r9.put(r14, r5)
            java.util.HashMap<java.lang.String, o2.a$c>[] r5 = r0.f13636e
            r5 = r5[r15]
            java.lang.String r9 = "JPEGInterchangeFormatLength"
            r5.put(r9, r2)
            goto L_0x0147
        L_0x0143:
            r22 = r5
            r17 = r14
        L_0x0147:
            long r5 = (long) r6
            r1.h(r5)
            goto L_0x0150
        L_0x014c:
            r22 = r5
            r17 = r14
        L_0x0150:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = O
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            java.lang.Object r2 = r2.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x01c6
            r3 = -1
            r5 = 3
            if (r12 == r5) goto L_0x0189
            r5 = 4
            if (r12 == r5) goto L_0x017d
            r5 = 8
            if (r12 == r5) goto L_0x0178
            r5 = 9
            if (r12 == r5) goto L_0x0173
            r5 = 13
            if (r12 == r5) goto L_0x0173
            goto L_0x018e
        L_0x0173:
            int r3 = r25.readInt()
            goto L_0x018d
        L_0x0178:
            short r3 = r25.readShort()
            goto L_0x018d
        L_0x017d:
            int r3 = r25.readInt()
            long r3 = (long) r3
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            goto L_0x018e
        L_0x0189:
            int r3 = r25.readUnsignedShort()
        L_0x018d:
            long r3 = (long) r3
        L_0x018e:
            if (r21 == 0) goto L_0x01a4
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            r9 = 0
            r5[r9] = r6
            java.lang.String r6 = r13.f13658b
            r9 = 1
            r5[r9] = r6
            java.lang.String r6 = "Offset: %d, tagName: %s"
            java.lang.String.format(r6, r5)
        L_0x01a4:
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x01c1
            java.util.HashSet r5 = r0.f13637f
            int r6 = (int) r3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x01c1
            r1.h(r3)
            int r2 = r2.intValue()
            r0.w(r1, r2)
        L_0x01c1:
            r1.h(r7)
            goto L_0x023a
        L_0x01c6:
            int r2 = r1.f13651c
            int r5 = r0.f13641j
            int r2 = r2 + r5
            int r3 = (int) r3
            byte[] r3 = new byte[r3]
            r1.readFully(r3)
            o2.a$c r4 = new o2.a$c
            long r14 = (long) r2
            r2 = r13
            r13 = r4
            r5 = r17
            r16 = r3
            r17 = r12
            r18 = r5
            r13.<init>(r14, r16, r17, r18)
            java.util.HashMap<java.lang.String, o2.a$c>[] r3 = r0.f13636e
            r3 = r3[r26]
            java.lang.String r5 = r2.f13658b
            r3.put(r5, r4)
            java.lang.String r3 = r2.f13658b
            java.lang.String r5 = "DNGVersion"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x01f7
            r3 = 3
            r0.f13635d = r3
        L_0x01f7:
            java.lang.String r3 = r2.f13658b
            java.lang.String r5 = "Make"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x020b
            java.lang.String r3 = r2.f13658b
            java.lang.String r5 = "Model"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0219
        L_0x020b:
            java.nio.ByteOrder r3 = r0.f13638g
            java.lang.String r3 = r4.i(r3)
            java.lang.String r5 = "PENTAX"
            boolean r3 = r3.contains(r5)
            if (r3 != 0) goto L_0x022c
        L_0x0219:
            java.lang.String r2 = r2.f13658b
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x0230
            java.nio.ByteOrder r2 = r0.f13638g
            int r2 = r4.h(r2)
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r3) goto L_0x0230
        L_0x022c:
            r2 = 8
            r0.f13635d = r2
        L_0x0230:
            int r2 = r1.f13651c
            long r2 = (long) r2
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x023a
            r1.h(r7)
        L_0x023a:
            int r5 = r22 + 1
            short r5 = (short) r5
            r2 = r26
            r3 = r23
            r4 = 0
            goto L_0x001a
        L_0x0244:
            int r2 = r25.readInt()
            boolean r3 = f13619n
            if (r3 == 0) goto L_0x025b
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "nextIfdOffset: %d"
            java.lang.String.format(r4, r3)
        L_0x025b:
            long r3 = (long) r2
            r7 = 0
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x028d
            java.util.HashSet r5 = r0.f13637f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r5.contains(r2)
            if (r2 != 0) goto L_0x028d
            r1.h(r3)
            java.util.HashMap<java.lang.String, o2.a$c>[] r2 = r0.f13636e
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0280
            r0.w(r1, r3)
            goto L_0x028d
        L_0x0280:
            java.util.HashMap<java.lang.String, o2.a$c>[] r2 = r0.f13636e
            r2 = r2[r6]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x028d
            r0.w(r1, r6)
        L_0x028d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.a.w(o2.a$f, int):void");
    }

    public final void x(String str, int i10, String str2) {
        if (!this.f13636e[i10].isEmpty() && this.f13636e[i10].get(str) != null) {
            HashMap<String, c> hashMap = this.f13636e[i10];
            hashMap.put(str2, hashMap.get(str));
            this.f13636e[i10].remove(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02f4, code lost:
        r4 = 0;
        r5 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y(java.lang.String r18, java.lang.String r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "DateTime"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x001e
            java.lang.String r3 = "DateTimeOriginal"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x001e
            java.lang.String r3 = "DateTimeDigitized"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x004d
        L_0x001e:
            if (r2 == 0) goto L_0x004d
            java.util.regex.Pattern r3 = T
            java.util.regex.Matcher r3 = r3.matcher(r2)
            boolean r3 = r3.find()
            java.util.regex.Pattern r4 = U
            java.util.regex.Matcher r4 = r4.matcher(r2)
            boolean r4 = r4.find()
            int r5 = r19.length()
            r6 = 19
            if (r5 != r6) goto L_0x004c
            if (r3 != 0) goto L_0x0041
            if (r4 != 0) goto L_0x0041
            goto L_0x004c
        L_0x0041:
            if (r4 == 0) goto L_0x004d
            java.lang.String r3 = "-"
            java.lang.String r4 = ":"
            java.lang.String r2 = r2.replaceAll(r3, r4)
            goto L_0x004d
        L_0x004c:
            return
        L_0x004d:
            java.lang.String r3 = "ISOSpeedRatings"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0057
            java.lang.String r1 = "PhotographicSensitivity"
        L_0x0057:
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x00c0
            java.util.HashSet<java.lang.String> r5 = N
            boolean r5 = r5.contains(r1)
            if (r5 == 0) goto L_0x00c0
            java.lang.String r5 = "GPSTimeStamp"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x00b1
            java.util.regex.Pattern r5 = S
            java.util.regex.Matcher r2 = r5.matcher(r2)
            boolean r5 = r2.find()
            if (r5 != 0) goto L_0x0078
            return
        L_0x0078:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r2.group(r4)
            int r6 = java.lang.Integer.parseInt(r6)
            r5.append(r6)
            java.lang.String r6 = "/1,"
            r5.append(r6)
            java.lang.String r7 = r2.group(r3)
            int r7 = java.lang.Integer.parseInt(r7)
            r5.append(r7)
            r5.append(r6)
            r6 = 3
            java.lang.String r2 = r2.group(r6)
            int r2 = java.lang.Integer.parseInt(r2)
            r5.append(r2)
            java.lang.String r2 = "/1"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            goto L_0x00c0
        L_0x00b1:
            double r5 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x00bf }
            o2.a$e r2 = new o2.a$e     // Catch:{ NumberFormatException -> 0x00bf }
            r2.<init>(r5)     // Catch:{ NumberFormatException -> 0x00bf }
            java.lang.String r2 = r2.toString()     // Catch:{ NumberFormatException -> 0x00bf }
            goto L_0x00c0
        L_0x00bf:
            return
        L_0x00c0:
            r5 = 0
            r6 = r5
        L_0x00c2:
            o2.a$d[][] r7 = J
            int r7 = r7.length
            if (r6 >= r7) goto L_0x0347
            r7 = 4
            if (r6 != r7) goto L_0x00d0
            boolean r7 = r0.f13639h
            if (r7 != 0) goto L_0x00d0
            goto L_0x0336
        L_0x00d0:
            java.util.HashMap<java.lang.String, o2.a$d>[] r7 = M
            r7 = r7[r6]
            java.lang.Object r7 = r7.get(r1)
            o2.a$d r7 = (o2.a.d) r7
            if (r7 == 0) goto L_0x0336
            if (r2 != 0) goto L_0x00e7
            java.util.HashMap<java.lang.String, o2.a$c>[] r7 = r0.f13636e
            r7 = r7[r6]
            r7.remove(r1)
            goto L_0x0336
        L_0x00e7:
            android.util.Pair r8 = o(r2)
            int r9 = r7.f13659c
            java.lang.Object r10 = r8.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r11 = -1
            if (r9 == r10) goto L_0x015f
            int r9 = r7.f13659c
            java.lang.Object r10 = r8.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r9 != r10) goto L_0x0105
            goto L_0x015f
        L_0x0105:
            int r9 = r7.f13660d
            if (r9 == r11) goto L_0x0122
            java.lang.Object r10 = r8.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r9 == r10) goto L_0x011f
            int r9 = r7.f13660d
            java.lang.Object r10 = r8.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r9 != r10) goto L_0x0122
        L_0x011f:
            int r7 = r7.f13660d
            goto L_0x0161
        L_0x0122:
            int r9 = r7.f13659c
            if (r9 == r4) goto L_0x015d
            r10 = 7
            if (r9 == r10) goto L_0x015d
            if (r9 != r3) goto L_0x012c
            goto L_0x015d
        L_0x012c:
            boolean r10 = f13619n
            if (r10 == 0) goto L_0x0336
            java.lang.String[] r10 = F
            r9 = r10[r9]
            int r7 = r7.f13660d
            if (r7 != r11) goto L_0x0139
            goto L_0x013b
        L_0x0139:
            r7 = r10[r7]
        L_0x013b:
            java.lang.Object r7 = r8.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r7 = r10[r7]
            java.lang.Object r7 = r8.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != r11) goto L_0x0151
            goto L_0x0336
        L_0x0151:
            java.lang.Object r7 = r8.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r7 = r10[r7]
            goto L_0x0336
        L_0x015d:
            r7 = r9
            goto L_0x0161
        L_0x015f:
            int r7 = r7.f13659c
        L_0x0161:
            java.lang.String r8 = "/"
            java.lang.String r9 = ","
            switch(r7) {
                case 1: goto L_0x02f7;
                case 2: goto L_0x02e7;
                case 3: goto L_0x02c1;
                case 4: goto L_0x029b;
                case 5: goto L_0x0260;
                case 6: goto L_0x0168;
                case 7: goto L_0x02e7;
                case 8: goto L_0x0168;
                case 9: goto L_0x0219;
                case 10: goto L_0x01af;
                case 11: goto L_0x0168;
                case 12: goto L_0x016a;
                default: goto L_0x0168;
            }
        L_0x0168:
            goto L_0x0336
        L_0x016a:
            java.lang.String[] r7 = r2.split(r9, r11)
            int r8 = r7.length
            double[] r9 = new double[r8]
            r10 = r5
        L_0x0172:
            int r11 = r7.length
            if (r10 >= r11) goto L_0x0180
            r11 = r7[r10]
            double r11 = java.lang.Double.parseDouble(r11)
            r9[r10] = r11
            int r10 = r10 + 1
            goto L_0x0172
        L_0x0180:
            java.util.HashMap<java.lang.String, o2.a$c>[] r7 = r0.f13636e
            r7 = r7[r6]
            java.nio.ByteOrder r10 = r0.f13638g
            int[] r11 = G
            r12 = 12
            r11 = r11[r12]
            int r11 = r11 * r8
            byte[] r11 = new byte[r11]
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.wrap(r11)
            r11.order(r10)
            r10 = r5
        L_0x0197:
            if (r10 >= r8) goto L_0x01a1
            r13 = r9[r10]
            r11.putDouble(r13)
            int r10 = r10 + 1
            goto L_0x0197
        L_0x01a1:
            o2.a$c r9 = new o2.a$c
            byte[] r10 = r11.array()
            r9.<init>(r10, r12, r8)
            r7.put(r1, r9)
            goto L_0x0336
        L_0x01af:
            java.lang.String[] r7 = r2.split(r9, r11)
            int r9 = r7.length
            o2.a$e[] r10 = new o2.a.e[r9]
            r12 = r5
        L_0x01b7:
            int r13 = r7.length
            if (r12 >= r13) goto L_0x01df
            r13 = r7[r12]
            java.lang.String[] r13 = r13.split(r8, r11)
            o2.a$e r14 = new o2.a$e
            r15 = r13[r5]
            r19 = r6
            double r5 = java.lang.Double.parseDouble(r15)
            long r5 = (long) r5
            r13 = r13[r4]
            double r3 = java.lang.Double.parseDouble(r13)
            long r3 = (long) r3
            r14.<init>(r5, r3)
            r10[r12] = r14
            int r12 = r12 + 1
            r6 = r19
            r3 = 2
            r4 = 1
            r5 = 0
            goto L_0x01b7
        L_0x01df:
            r19 = r6
            java.util.HashMap<java.lang.String, o2.a$c>[] r3 = r0.f13636e
            r3 = r3[r19]
            java.nio.ByteOrder r4 = r0.f13638g
            int[] r5 = G
            r6 = 10
            r5 = r5[r6]
            int r5 = r5 * r9
            byte[] r5 = new byte[r5]
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r5.order(r4)
            r4 = 0
        L_0x01f8:
            if (r4 >= r9) goto L_0x020b
            r7 = r10[r4]
            long r11 = r7.f13661a
            int r8 = (int) r11
            r5.putInt(r8)
            long r7 = r7.f13662b
            int r7 = (int) r7
            r5.putInt(r7)
            int r4 = r4 + 1
            goto L_0x01f8
        L_0x020b:
            o2.a$c r4 = new o2.a$c
            byte[] r5 = r5.array()
            r4.<init>(r5, r6, r9)
            r3.put(r1, r4)
            goto L_0x02f4
        L_0x0219:
            r19 = r6
            java.lang.String[] r3 = r2.split(r9, r11)
            int r4 = r3.length
            int[] r5 = new int[r4]
            r6 = 0
        L_0x0223:
            int r7 = r3.length
            if (r6 >= r7) goto L_0x0231
            r7 = r3[r6]
            int r7 = java.lang.Integer.parseInt(r7)
            r5[r6] = r7
            int r6 = r6 + 1
            goto L_0x0223
        L_0x0231:
            java.util.HashMap<java.lang.String, o2.a$c>[] r3 = r0.f13636e
            r3 = r3[r19]
            java.nio.ByteOrder r6 = r0.f13638g
            int[] r7 = G
            r8 = 9
            r7 = r7[r8]
            int r7 = r7 * r4
            byte[] r7 = new byte[r7]
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r7)
            r7.order(r6)
            r6 = 0
        L_0x0248:
            if (r6 >= r4) goto L_0x0252
            r9 = r5[r6]
            r7.putInt(r9)
            int r6 = r6 + 1
            goto L_0x0248
        L_0x0252:
            o2.a$c r5 = new o2.a$c
            byte[] r6 = r7.array()
            r5.<init>(r6, r8, r4)
            r3.put(r1, r5)
            goto L_0x02f4
        L_0x0260:
            r19 = r6
            java.lang.String[] r3 = r2.split(r9, r11)
            int r4 = r3.length
            o2.a$e[] r4 = new o2.a.e[r4]
            r5 = 0
        L_0x026a:
            int r6 = r3.length
            if (r5 >= r6) goto L_0x028d
            r6 = r3[r5]
            java.lang.String[] r6 = r6.split(r8, r11)
            o2.a$e r7 = new o2.a$e
            r9 = 0
            r10 = r6[r9]
            double r9 = java.lang.Double.parseDouble(r10)
            long r9 = (long) r9
            r12 = 1
            r6 = r6[r12]
            double r12 = java.lang.Double.parseDouble(r6)
            long r12 = (long) r12
            r7.<init>(r9, r12)
            r4[r5] = r7
            int r5 = r5 + 1
            goto L_0x026a
        L_0x028d:
            java.util.HashMap<java.lang.String, o2.a$c>[] r3 = r0.f13636e
            r3 = r3[r19]
            java.nio.ByteOrder r5 = r0.f13638g
            o2.a$c r4 = o2.a.c.d(r4, r5)
            r3.put(r1, r4)
            goto L_0x02f4
        L_0x029b:
            r19 = r6
            java.lang.String[] r3 = r2.split(r9, r11)
            int r4 = r3.length
            long[] r4 = new long[r4]
            r9 = 0
        L_0x02a5:
            int r5 = r3.length
            if (r9 >= r5) goto L_0x02b3
            r5 = r3[r9]
            long r5 = java.lang.Long.parseLong(r5)
            r4[r9] = r5
            int r9 = r9 + 1
            goto L_0x02a5
        L_0x02b3:
            java.util.HashMap<java.lang.String, o2.a$c>[] r3 = r0.f13636e
            r3 = r3[r19]
            java.nio.ByteOrder r5 = r0.f13638g
            o2.a$c r4 = o2.a.c.c(r4, r5)
            r3.put(r1, r4)
            goto L_0x02f4
        L_0x02c1:
            r19 = r6
            java.lang.String[] r3 = r2.split(r9, r11)
            int r4 = r3.length
            int[] r4 = new int[r4]
            r9 = 0
        L_0x02cb:
            int r5 = r3.length
            if (r9 >= r5) goto L_0x02d9
            r5 = r3[r9]
            int r5 = java.lang.Integer.parseInt(r5)
            r4[r9] = r5
            int r9 = r9 + 1
            goto L_0x02cb
        L_0x02d9:
            java.util.HashMap<java.lang.String, o2.a$c>[] r3 = r0.f13636e
            r3 = r3[r19]
            java.nio.ByteOrder r5 = r0.f13638g
            o2.a$c r4 = o2.a.c.f(r4, r5)
            r3.put(r1, r4)
            goto L_0x02f4
        L_0x02e7:
            r19 = r6
            java.util.HashMap<java.lang.String, o2.a$c>[] r3 = r0.f13636e
            r3 = r3[r19]
            o2.a$c r4 = o2.a.c.a(r2)
            r3.put(r1, r4)
        L_0x02f4:
            r4 = 0
            r5 = 1
            goto L_0x033d
        L_0x02f7:
            r19 = r6
            java.util.HashMap<java.lang.String, o2.a$c>[] r3 = r0.f13636e
            r3 = r3[r19]
            int r4 = r2.length()
            r5 = 1
            if (r4 != r5) goto L_0x0325
            r4 = 0
            char r6 = r2.charAt(r4)
            r7 = 48
            if (r6 < r7) goto L_0x0326
            char r6 = r2.charAt(r4)
            r8 = 49
            if (r6 > r8) goto L_0x0326
            byte[] r6 = new byte[r5]
            char r8 = r2.charAt(r4)
            int r8 = r8 - r7
            byte r7 = (byte) r8
            r6[r4] = r7
            o2.a$c r7 = new o2.a$c
            r7.<init>(r6, r5, r5)
            goto L_0x0332
        L_0x0325:
            r4 = 0
        L_0x0326:
            java.nio.charset.Charset r6 = P
            byte[] r6 = r2.getBytes(r6)
            o2.a$c r7 = new o2.a$c
            int r8 = r6.length
            r7.<init>(r6, r5, r8)
        L_0x0332:
            r3.put(r1, r7)
            goto L_0x033d
        L_0x0336:
            r19 = r6
            r16 = r5
            r5 = r4
            r4 = r16
        L_0x033d:
            int r6 = r19 + 1
            r3 = 2
            r16 = r5
            r5 = r4
            r4 = r16
            goto L_0x00c2
        L_0x0347:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.a.y(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z(o2.a.b r15) {
        /*
            r14 = this;
            java.util.HashMap<java.lang.String, o2.a$c>[] r0 = r14.f13636e
            r1 = 4
            r0 = r0[r1]
            java.lang.String r1 = "Compression"
            java.lang.Object r1 = r0.get(r1)
            o2.a$c r1 = (o2.a.c) r1
            if (r1 == 0) goto L_0x00ff
            java.nio.ByteOrder r2 = r14.f13638g
            int r1 = r1.h(r2)
            r2 = 1
            r3 = 6
            if (r1 == r2) goto L_0x0025
            if (r1 == r3) goto L_0x0020
            r4 = 7
            if (r1 == r4) goto L_0x0025
            goto L_0x0102
        L_0x0020:
            r14.p(r15, r0)
            goto L_0x0102
        L_0x0025:
            java.lang.String r1 = "BitsPerSample"
            java.lang.Object r1 = r0.get(r1)
            o2.a$c r1 = (o2.a.c) r1
            r4 = 0
            if (r1 == 0) goto L_0x006a
            java.nio.ByteOrder r5 = r14.f13638g
            java.io.Serializable r1 = r1.j(r5)
            int[] r1 = (int[]) r1
            int[] r5 = f13622q
            boolean r6 = java.util.Arrays.equals(r5, r1)
            if (r6 == 0) goto L_0x0041
            goto L_0x0068
        L_0x0041:
            int r6 = r14.f13635d
            r7 = 3
            if (r6 != r7) goto L_0x006a
            java.lang.String r6 = "PhotometricInterpretation"
            java.lang.Object r6 = r0.get(r6)
            o2.a$c r6 = (o2.a.c) r6
            if (r6 == 0) goto L_0x006a
            java.nio.ByteOrder r7 = r14.f13638g
            int r6 = r6.h(r7)
            if (r6 != r2) goto L_0x0060
            int[] r7 = f13623r
            boolean r7 = java.util.Arrays.equals(r1, r7)
            if (r7 != 0) goto L_0x0068
        L_0x0060:
            if (r6 != r3) goto L_0x006a
            boolean r1 = java.util.Arrays.equals(r1, r5)
            if (r1 == 0) goto L_0x006a
        L_0x0068:
            r1 = r2
            goto L_0x006b
        L_0x006a:
            r1 = r4
        L_0x006b:
            if (r1 == 0) goto L_0x0102
            java.lang.String r1 = "StripOffsets"
            java.lang.Object r1 = r0.get(r1)
            o2.a$c r1 = (o2.a.c) r1
            java.lang.String r3 = "StripByteCounts"
            java.lang.Object r0 = r0.get(r3)
            o2.a$c r0 = (o2.a.c) r0
            if (r1 == 0) goto L_0x0102
            if (r0 == 0) goto L_0x0102
            java.nio.ByteOrder r3 = r14.f13638g
            java.io.Serializable r1 = r1.j(r3)
            long[] r1 = o2.b.c(r1)
            java.nio.ByteOrder r3 = r14.f13638g
            java.io.Serializable r0 = r0.j(r3)
            long[] r0 = o2.b.c(r0)
            if (r1 == 0) goto L_0x0102
            int r3 = r1.length
            if (r3 != 0) goto L_0x009c
            goto L_0x0102
        L_0x009c:
            if (r0 == 0) goto L_0x0102
            int r3 = r0.length
            if (r3 != 0) goto L_0x00a3
            goto L_0x0102
        L_0x00a3:
            int r3 = r1.length
            int r5 = r0.length
            if (r3 == r5) goto L_0x00a8
            goto L_0x0102
        L_0x00a8:
            r5 = 0
            int r3 = r0.length
            r7 = r4
        L_0x00ac:
            if (r7 >= r3) goto L_0x00b4
            r8 = r0[r7]
            long r5 = r5 + r8
            int r7 = r7 + 1
            goto L_0x00ac
        L_0x00b4:
            int r3 = (int) r5
            byte[] r3 = new byte[r3]
            r14.f13640i = r2
            r14.f13639h = r2
            r5 = r4
            r6 = r5
            r7 = r6
        L_0x00be:
            int r8 = r1.length
            if (r5 >= r8) goto L_0x00f8
            r8 = r1[r5]
            int r8 = (int) r8
            r9 = r0[r5]
            int r9 = (int) r9
            int r10 = r1.length
            int r10 = r10 - r2
            if (r5 >= r10) goto L_0x00d8
            int r10 = r8 + r9
            long r10 = (long) r10
            int r12 = r5 + 1
            r12 = r1[r12]
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x00d8
            r14.f13640i = r4
        L_0x00d8:
            int r8 = r8 - r6
            if (r8 >= 0) goto L_0x00dc
            goto L_0x0102
        L_0x00dc:
            long r10 = (long) r8
            long r12 = r15.skip(r10)
            int r10 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r10 == 0) goto L_0x00e6
            goto L_0x0102
        L_0x00e6:
            int r6 = r6 + r8
            byte[] r8 = new byte[r9]
            int r10 = r15.read(r8)
            if (r10 == r9) goto L_0x00f0
            goto L_0x0102
        L_0x00f0:
            int r6 = r6 + r9
            java.lang.System.arraycopy(r8, r4, r3, r7, r9)
            int r7 = r7 + r9
            int r5 = r5 + 1
            goto L_0x00be
        L_0x00f8:
            boolean r15 = r14.f13640i
            if (r15 == 0) goto L_0x0102
            r0 = r1[r4]
            goto L_0x0102
        L_0x00ff:
            r14.p(r15, r0)
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.a.z(o2.a$b):void");
    }

    /* compiled from: ExifInterface */
    public static class f extends b {
        public f(byte[] bArr) {
            super(bArr);
            this.f13649a.mark(Integer.MAX_VALUE);
        }

        public final void h(long j10) {
            int i10 = this.f13651c;
            if (((long) i10) > j10) {
                this.f13651c = 0;
                this.f13649a.reset();
            } else {
                j10 -= (long) i10;
            }
            d((int) j10);
        }

        public f(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f13649a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* compiled from: ExifInterface */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f13657a;

        /* renamed from: b  reason: collision with root package name */
        public final String f13658b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13659c;

        /* renamed from: d  reason: collision with root package name */
        public final int f13660d;

        public d(String str, int i10, int i11) {
            this.f13658b = str;
            this.f13657a = i10;
            this.f13659c = i11;
            this.f13660d = -1;
        }

        public d(int i10, int i11, int i12, String str) {
            this.f13658b = str;
            this.f13657a = i10;
            this.f13659c = i11;
            this.f13660d = i12;
        }
    }

    public a(InputStream inputStream) {
        boolean z10;
        d[][] dVarArr = J;
        this.f13636e = new HashMap[dVarArr.length];
        this.f13637f = new HashSet(dVarArr.length);
        if (inputStream != null) {
            this.f13632a = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f13634c = (AssetManager.AssetInputStream) inputStream;
                this.f13633b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    try {
                        b.a.c(fileInputStream.getFD(), 0, OsConstants.SEEK_CUR);
                        z10 = true;
                    } catch (Exception unused) {
                        z10 = false;
                    }
                    if (z10) {
                        this.f13634c = null;
                        this.f13633b = fileInputStream.getFD();
                    }
                }
                this.f13634c = null;
                this.f13633b = null;
            }
            r(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
