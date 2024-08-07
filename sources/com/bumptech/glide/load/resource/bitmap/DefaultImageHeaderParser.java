package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f4999a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f5000b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a();

        short b();

        int c(int i10, byte[] bArr);

        long skip(long j10);
    }

    public static final class a implements Reader {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f5001a;

        public a(ByteBuffer byteBuffer) {
            this.f5001a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final int a() {
            return (b() << 8) | b();
        }

        public final short b() {
            if (this.f5001a.remaining() >= 1) {
                return (short) (this.f5001a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        public final int c(int i10, byte[] bArr) {
            int min = Math.min(i10, this.f5001a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f5001a.get(bArr, 0, min);
            return min;
        }

        public final long skip(long j10) {
            int min = (int) Math.min((long) this.f5001a.remaining(), j10);
            ByteBuffer byteBuffer = this.f5001a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f5002a;

        public b(byte[] bArr, int i10) {
            this.f5002a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        public final short a(int i10) {
            boolean z10;
            if (this.f5002a.remaining() - i10 >= 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return this.f5002a.getShort(i10);
            }
            return -1;
        }
    }

    public static final class c implements Reader {

        /* renamed from: a  reason: collision with root package name */
        public final InputStream f5003a;

        public c(InputStream inputStream) {
            this.f5003a = inputStream;
        }

        public final int a() {
            return (b() << 8) | b();
        }

        public final short b() {
            int read = this.f5003a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        public final int c(int i10, byte[] bArr) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f5003a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 != 0 || i12 != -1) {
                return i11;
            }
            throw new Reader.EndOfFileException();
        }

        public final long skip(long j10) {
            if (j10 < 0) {
                return 0;
            }
            long j11 = j10;
            while (j11 > 0) {
                long skip = this.f5003a.skip(j11);
                if (skip <= 0) {
                    if (this.f5003a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j11 -= skip;
            }
            return j10 - j11;
        }
    }

    public static int e(Reader reader, v4.b bVar) {
        boolean z10;
        int i10;
        byte[] bArr;
        try {
            int a10 = reader.a();
            if ((a10 & 65496) == 65496 || a10 == 19789 || a10 == 18761) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            while (true) {
                if (reader.b() == 255) {
                    short b10 = reader.b();
                    if (b10 != 218) {
                        if (b10 != 217) {
                            i10 = reader.a() - 2;
                            if (b10 == 225) {
                                break;
                            }
                            long j10 = (long) i10;
                            if (reader.skip(j10) != j10) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                                break;
                            }
                        } else {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                    break;
                }
            }
            i10 = -1;
            if (i10 == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            bArr = (byte[]) bVar.c(i10, byte[].class);
            int g2 = g(reader, bArr, i10);
            bVar.put(bArr);
            return g2;
        } catch (Reader.EndOfFileException unused) {
            return -1;
        } catch (Throwable th2) {
            bVar.put(bArr);
            throw th2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bumptech.glide.load.ImageHeaderParser.ImageType f(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader r7) {
        /*
            int r0 = r7.a()     // Catch:{ EndOfFileException -> 0x00fa }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r7.b()     // Catch:{ EndOfFileException -> 0x00fa }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r7.b()     // Catch:{ EndOfFileException -> 0x00fa }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r7.skip(r0)     // Catch:{ EndOfFileException -> 0x00fa }
            short r7 = r7.b()     // Catch:{ EndOfFileException -> 0x0039 }
            r0 = 3
            if (r7 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ EndOfFileException -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ EndOfFileException -> 0x0039 }
        L_0x0038:
            return r7
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            r2 = 4
            if (r0 == r1) goto L_0x0099
            int r1 = r7.a()     // Catch:{ EndOfFileException -> 0x00fa }
            int r1 = r1 << 16
            int r4 = r7.a()     // Catch:{ EndOfFileException -> 0x00fa }
            r1 = r1 | r4
            r4 = 0
            r5 = 1718909296(0x66747970, float:2.8862439E23)
            if (r1 == r5) goto L_0x0055
            goto L_0x0091
        L_0x0055:
            int r1 = r7.a()     // Catch:{ EndOfFileException -> 0x00fa }
            int r1 = r1 << 16
            int r5 = r7.a()     // Catch:{ EndOfFileException -> 0x00fa }
            r1 = r1 | r5
            r5 = 1635150182(0x61766966, float:2.8409336E20)
            if (r1 == r5) goto L_0x0090
            r6 = 1635150195(0x61766973, float:2.8409359E20)
            if (r1 != r6) goto L_0x006b
            goto L_0x0090
        L_0x006b:
            r7.skip(r2)     // Catch:{ EndOfFileException -> 0x00fa }
            int r0 = r0 + -16
            int r1 = r0 % 4
            if (r1 == 0) goto L_0x0075
            goto L_0x0091
        L_0x0075:
            r1 = r4
        L_0x0076:
            r2 = 5
            if (r1 >= r2) goto L_0x0091
            if (r0 <= 0) goto L_0x0091
            int r2 = r7.a()     // Catch:{ EndOfFileException -> 0x00fa }
            int r2 = r2 << 16
            int r3 = r7.a()     // Catch:{ EndOfFileException -> 0x00fa }
            r2 = r2 | r3
            if (r2 == r5) goto L_0x0090
            if (r2 != r6) goto L_0x008b
            goto L_0x0090
        L_0x008b:
            int r1 = r1 + 1
            int r0 = r0 + -4
            goto L_0x0076
        L_0x0090:
            r4 = 1
        L_0x0091:
            if (r4 == 0) goto L_0x0096
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.AVIF     // Catch:{ EndOfFileException -> 0x00fa }
            goto L_0x0098
        L_0x0096:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ EndOfFileException -> 0x00fa }
        L_0x0098:
            return r7
        L_0x0099:
            r7.skip(r2)     // Catch:{ EndOfFileException -> 0x00fa }
            int r0 = r7.a()     // Catch:{ EndOfFileException -> 0x00fa }
            int r0 = r0 << 16
            int r1 = r7.a()     // Catch:{ EndOfFileException -> 0x00fa }
            r0 = r0 | r1
            r1 = 1464156752(0x57454250, float:2.16888601E14)
            if (r0 == r1) goto L_0x00af
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x00af:
            int r0 = r7.a()     // Catch:{ EndOfFileException -> 0x00fa }
            int r0 = r0 << 16
            int r1 = r7.a()     // Catch:{ EndOfFileException -> 0x00fa }
            r0 = r0 | r1
            r1 = r0 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r1 == r4) goto L_0x00c4
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x00c4:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 88
            if (r0 != r1) goto L_0x00e2
            r7.skip(r2)     // Catch:{ EndOfFileException -> 0x00fa }
            short r7 = r7.b()     // Catch:{ EndOfFileException -> 0x00fa }
            r0 = r7 & 2
            if (r0 == 0) goto L_0x00d8
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.ANIMATED_WEBP     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x00d8:
            r7 = r7 & 16
            if (r7 == 0) goto L_0x00df
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x00df:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x00e2:
            r1 = 76
            if (r0 != r1) goto L_0x00f7
            r7.skip(r2)     // Catch:{ EndOfFileException -> 0x00fa }
            short r7 = r7.b()     // Catch:{ EndOfFileException -> 0x00fa }
            r7 = r7 & 8
            if (r7 == 0) goto L_0x00f4
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ EndOfFileException -> 0x00fa }
            goto L_0x00f6
        L_0x00f4:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00fa }
        L_0x00f6:
            return r7
        L_0x00f7:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x00fa:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.f(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    public static int g(Reader reader, byte[] bArr, int i10) {
        boolean z10;
        ByteOrder byteOrder;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        if (reader.c(i10, bArr) != i10) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        if (bArr == null || i10 <= f4999a.length) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            int i13 = 0;
            while (true) {
                byte[] bArr2 = f4999a;
                if (i13 >= bArr2.length) {
                    break;
                } else if (bArr[i13] != bArr2[i13]) {
                    z10 = false;
                    break;
                } else {
                    i13++;
                }
            }
        }
        if (z10) {
            b bVar = new b(bArr, i10);
            short a10 = bVar.a(6);
            if (a10 == 18761) {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            } else if (a10 != 19789) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.BIG_ENDIAN;
            }
            bVar.f5002a.order(byteOrder);
            if (bVar.f5002a.remaining() - 10 >= 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i11 = bVar.f5002a.getInt(10);
            } else {
                i11 = -1;
            }
            int i14 = i11 + 6;
            short a11 = bVar.a(i14);
            for (int i15 = 0; i15 < a11; i15++) {
                int i16 = (i15 * 12) + i14 + 2;
                if (bVar.a(i16) == 274) {
                    short a12 = bVar.a(i16 + 2);
                    if (a12 < 1 || a12 > 12) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        int i17 = i16 + 4;
                        if (bVar.f5002a.remaining() - i17 >= 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            i12 = bVar.f5002a.getInt(i17);
                        } else {
                            i12 = -1;
                        }
                        if (i12 < 0) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        } else {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                            int i18 = i12 + f5000b[a12];
                            if (i18 > 4) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            } else {
                                int i19 = i16 + 8;
                                if (i19 < 0 || i19 > bVar.f5002a.remaining()) {
                                    Log.isLoggable("DfltImageHeaderParser", 3);
                                } else if (i18 >= 0 && i18 + i19 <= bVar.f5002a.remaining()) {
                                    return bVar.a(i19);
                                } else {
                                    Log.isLoggable("DfltImageHeaderParser", 3);
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
    }

    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        j7.a.r(byteBuffer);
        return f(new a(byteBuffer));
    }

    public final int b(ByteBuffer byteBuffer, v4.b bVar) {
        j7.a.r(byteBuffer);
        a aVar = new a(byteBuffer);
        j7.a.r(bVar);
        return e(aVar, bVar);
    }

    public final int c(InputStream inputStream, v4.b bVar) {
        j7.a.r(inputStream);
        c cVar = new c(inputStream);
        j7.a.r(bVar);
        return e(cVar, bVar);
    }

    public final ImageHeaderParser.ImageType d(InputStream inputStream) {
        j7.a.r(inputStream);
        return f(new c(inputStream));
    }
}
