package com.google.android.play.core.integrity;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class b extends bq {

    /* renamed from: a  reason: collision with root package name */
    private String f7238a;

    /* renamed from: b  reason: collision with root package name */
    private y f7239b;

    public final bq a(y yVar) {
        this.f7239b = yVar;
        return this;
    }

    public final bq b(String str) {
        if (str != null) {
            this.f7238a = str;
            return this;
        }
        throw new NullPointerException("Null token");
    }

    public final br c() {
        y yVar;
        String str = this.f7238a;
        if (str != null && (yVar = this.f7239b) != null) {
            return new br(str, yVar);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f7238a == null) {
            sb2.append(" token");
        }
        if (this.f7239b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
