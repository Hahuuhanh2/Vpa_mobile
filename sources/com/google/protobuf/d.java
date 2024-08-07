package com.google.protobuf;

/* compiled from: CodedInputStream */
public abstract class d {

    /* compiled from: CodedInputStream */
    public static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        public int f7888a;

        /* renamed from: b  reason: collision with root package name */
        public int f7889b;

        /* renamed from: c  reason: collision with root package name */
        public int f7890c;

        /* renamed from: d  reason: collision with root package name */
        public int f7891d;

        /* renamed from: e  reason: collision with root package name */
        public int f7892e = Integer.MAX_VALUE;

        public a(byte[] bArr, int i10, int i11, boolean z10) {
            this.f7888a = i11 + i10;
            this.f7890c = i10;
            this.f7891d = i10;
        }

        public final int a(int i10) {
            if (i10 >= 0) {
                int i11 = this.f7890c;
                int i12 = this.f7891d;
                int i13 = (i11 - i12) + i10;
                if (i13 >= 0) {
                    int i14 = this.f7892e;
                    if (i13 <= i14) {
                        this.f7892e = i13;
                        int i15 = this.f7888a + this.f7889b;
                        this.f7888a = i15;
                        int i16 = i15 - i12;
                        if (i16 > i13) {
                            int i17 = i16 - i13;
                            this.f7889b = i17;
                            this.f7888a = i15 - i17;
                        } else {
                            this.f7889b = 0;
                        }
                        return i14;
                    }
                    throw InvalidProtocolBufferException.a();
                }
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }
}
