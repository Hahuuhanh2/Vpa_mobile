package mj;

import sk.j;

/* compiled from: QRResult.kt */
public abstract class e {

    /* compiled from: QRResult.kt */
    public static final class a extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Exception f21557a;

        public a(Exception exc) {
            this.f21557a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && j.a(this.f21557a, ((a) obj).f21557a);
        }

        public final int hashCode() {
            return this.f21557a.hashCode();
        }

        public final String toString() {
            Exception exc = this.f21557a;
            return "QRError(exception=" + exc + ")";
        }
    }

    /* compiled from: QRResult.kt */
    public static final class b extends e {

        /* renamed from: a  reason: collision with root package name */
        public static final b f21558a = new b();
    }

    /* compiled from: QRResult.kt */
    public static final class c extends e {

        /* renamed from: a  reason: collision with root package name */
        public final oj.a f21559a;

        public c(oj.a aVar) {
            this.f21559a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && j.a(this.f21559a, ((c) obj).f21559a);
        }

        public final int hashCode() {
            return this.f21559a.hashCode();
        }

        public final String toString() {
            oj.a aVar = this.f21559a;
            return "QRSuccess(content=" + aVar + ")";
        }
    }

    /* compiled from: QRResult.kt */
    public static final class d extends e {

        /* renamed from: a  reason: collision with root package name */
        public static final d f21560a = new d();
    }
}
