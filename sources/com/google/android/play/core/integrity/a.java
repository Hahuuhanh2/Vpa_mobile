package com.google.android.play.core.integrity;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class a extends ap {

    /* renamed from: a  reason: collision with root package name */
    private String f7185a;

    /* renamed from: b  reason: collision with root package name */
    private y f7186b;

    public final ap a(y yVar) {
        this.f7186b = yVar;
        return this;
    }

    public final ap b(String str) {
        this.f7185a = str;
        return this;
    }

    public final aq c() {
        y yVar;
        String str = this.f7185a;
        if (str != null && (yVar = this.f7186b) != null) {
            return new aq(str, yVar);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f7185a == null) {
            sb2.append(" token");
        }
        if (this.f7186b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
