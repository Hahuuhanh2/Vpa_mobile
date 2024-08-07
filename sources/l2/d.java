package l2;

import androidx.emoji2.text.h;
import java.nio.ByteBuffer;
import m2.a;
import m2.b;

/* compiled from: EmojiMetadata */
public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal<a> f12634d = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final int f12635a;

    /* renamed from: b  reason: collision with root package name */
    public final h f12636b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f12637c = 0;

    public d(h hVar, int i10) {
        this.f12636b = hVar;
        this.f12635a = i10;
    }

    public final int a(int i10) {
        a c10 = c();
        int a10 = c10.a(16);
        if (a10 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = c10.f13087b;
        int i11 = a10 + c10.f13086a;
        return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
    }

    public final int b() {
        a c10 = c();
        int a10 = c10.a(16);
        if (a10 == 0) {
            return 0;
        }
        int i10 = a10 + c10.f13086a;
        return c10.f13087b.getInt(c10.f13087b.getInt(i10) + i10);
    }

    public final a c() {
        ThreadLocal<a> threadLocal = f12634d;
        a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new a();
            threadLocal.set(aVar);
        }
        b bVar = this.f12636b.f2417a;
        int i10 = this.f12635a;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i11 = a10 + bVar.f13086a;
            int i12 = (i10 * 4) + bVar.f13087b.getInt(i11) + i11 + 4;
            aVar.b(bVar.f13087b.getInt(i12) + i12, bVar.f13087b);
        }
        return aVar;
    }

    public final String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        a c10 = c();
        int a10 = c10.a(4);
        if (a10 != 0) {
            i10 = c10.f13087b.getInt(a10 + c10.f13086a);
        } else {
            i10 = 0;
        }
        sb2.append(Integer.toHexString(i10));
        sb2.append(", codepoints:");
        int b10 = b();
        for (int i11 = 0; i11 < b10; i11++) {
            sb2.append(Integer.toHexString(a(i11)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
