package yk;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import rk.p;
import sk.j;
import vk.h;
import xk.e;

/* compiled from: Strings.kt */
public final class b implements e<h> {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f23585a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23586b;

    /* renamed from: c  reason: collision with root package name */
    public final int f23587c;

    /* renamed from: d  reason: collision with root package name */
    public final p<CharSequence, Integer, ek.e<Integer, Integer>> f23588d;

    /* compiled from: Strings.kt */
    public static final class a implements Iterator<h>, j$.util.Iterator {

        /* renamed from: a  reason: collision with root package name */
        public int f23589a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f23590b;

        /* renamed from: c  reason: collision with root package name */
        public int f23591c;

        /* renamed from: d  reason: collision with root package name */
        public h f23592d;

        /* renamed from: e  reason: collision with root package name */
        public int f23593e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ b f23594f;

        public a(b bVar) {
            this.f23594f = bVar;
            int i10 = bVar.f23586b;
            int length = bVar.f23585a.length();
            if (length >= 0) {
                if (i10 < 0) {
                    i10 = 0;
                } else if (i10 > length) {
                    i10 = length;
                }
                this.f23590b = i10;
                this.f23591c = i10;
                return;
            }
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum " + 0 + '.');
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if (r6 < r3) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r7 = this;
                int r0 = r7.f23591c
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r7.f23589a = r1
                r0 = 0
                r7.f23592d = r0
                goto L_0x0082
            L_0x000c:
                yk.b r2 = r7.f23594f
                int r3 = r2.f23587c
                r4 = -1
                r5 = 1
                if (r3 <= 0) goto L_0x001b
                int r6 = r7.f23593e
                int r6 = r6 + r5
                r7.f23593e = r6
                if (r6 >= r3) goto L_0x0023
            L_0x001b:
                java.lang.CharSequence r2 = r2.f23585a
                int r2 = r2.length()
                if (r0 <= r2) goto L_0x0037
            L_0x0023:
                vk.h r0 = new vk.h
                int r1 = r7.f23590b
                yk.b r2 = r7.f23594f
                java.lang.CharSequence r2 = r2.f23585a
                int r2 = yk.l.O0(r2)
                r0.<init>(r1, r2)
                r7.f23592d = r0
                r7.f23591c = r4
                goto L_0x0080
            L_0x0037:
                yk.b r0 = r7.f23594f
                rk.p<java.lang.CharSequence, java.lang.Integer, ek.e<java.lang.Integer, java.lang.Integer>> r2 = r0.f23588d
                java.lang.CharSequence r0 = r0.f23585a
                int r3 = r7.f23591c
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r0 = r2.invoke(r0, r3)
                ek.e r0 = (ek.e) r0
                if (r0 != 0) goto L_0x005f
                vk.h r0 = new vk.h
                int r1 = r7.f23590b
                yk.b r2 = r7.f23594f
                java.lang.CharSequence r2 = r2.f23585a
                int r2 = yk.l.O0(r2)
                r0.<init>(r1, r2)
                r7.f23592d = r0
                r7.f23591c = r4
                goto L_0x0080
            L_0x005f:
                A r2 = r0.f20102a
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.f20103b
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.f23590b
                vk.h r3 = p3.l0.U0(r3, r2)
                r7.f23592d = r3
                int r2 = r2 + r0
                r7.f23590b = r2
                if (r0 != 0) goto L_0x007d
                r1 = r5
            L_0x007d:
                int r2 = r2 + r1
                r7.f23591c = r2
            L_0x0080:
                r7.f23589a = r5
            L_0x0082:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yk.b.a.a():void");
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            if (this.f23589a == -1) {
                a();
            }
            if (this.f23589a == 1) {
                return true;
            }
            return false;
        }

        public final Object next() {
            if (this.f23589a == -1) {
                a();
            }
            if (this.f23589a != 0) {
                h hVar = this.f23592d;
                j.d(hVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f23592d = null;
                this.f23589a = -1;
                return hVar;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(CharSequence charSequence, int i10, int i11, p<? super CharSequence, ? super Integer, ek.e<Integer, Integer>> pVar) {
        j.f(charSequence, "input");
        this.f23585a = charSequence;
        this.f23586b = i10;
        this.f23587c = i11;
        this.f23588d = pVar;
    }

    public final java.util.Iterator<h> iterator() {
        return new a(this);
    }
}
