package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.OutputStream;
import v4.b;

/* compiled from: BufferedOutputStream */
public final class c extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final OutputStream f4969a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f4970b;

    /* renamed from: c  reason: collision with root package name */
    public b f4971c;

    /* renamed from: d  reason: collision with root package name */
    public int f4972d;

    public c(FileOutputStream fileOutputStream, b bVar) {
        this.f4969a = fileOutputStream;
        this.f4971c = bVar;
        this.f4970b = (byte[]) bVar.c(65536, byte[].class);
    }

    /* JADX INFO: finally extract failed */
    public final void close() {
        try {
            flush();
            this.f4969a.close();
            byte[] bArr = this.f4970b;
            if (bArr != null) {
                this.f4971c.put(bArr);
                this.f4970b = null;
            }
        } catch (Throwable th2) {
            this.f4969a.close();
            throw th2;
        }
    }

    public final void flush() {
        int i10 = this.f4972d;
        if (i10 > 0) {
            this.f4969a.write(this.f4970b, 0, i10);
            this.f4972d = 0;
        }
        this.f4969a.flush();
    }

    public final void write(int i10) {
        byte[] bArr = this.f4970b;
        int i11 = this.f4972d;
        int i12 = i11 + 1;
        this.f4972d = i12;
        bArr[i11] = (byte) i10;
        if (i12 == bArr.length && i12 > 0) {
            this.f4969a.write(bArr, 0, i12);
            this.f4972d = 0;
        }
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f4972d;
            if (i15 != 0 || i13 < this.f4970b.length) {
                int min = Math.min(i13, this.f4970b.length - i15);
                System.arraycopy(bArr, i14, this.f4970b, this.f4972d, min);
                int i16 = this.f4972d + min;
                this.f4972d = i16;
                i12 += min;
                byte[] bArr2 = this.f4970b;
                if (i16 == bArr2.length && i16 > 0) {
                    this.f4969a.write(bArr2, 0, i16);
                    this.f4972d = 0;
                    continue;
                }
            } else {
                this.f4969a.write(bArr, i14, i13);
                return;
            }
        } while (i12 < i11);
    }
}
