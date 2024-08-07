package oa;

import v.g0;

/* compiled from: DataTransportCrashlyticsReportSender */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final la.a f13764b = new la.a();

    /* renamed from: c  reason: collision with root package name */
    public static final String f13765c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d  reason: collision with root package name */
    public static final String f13766d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e  reason: collision with root package name */
    public static final g0 f13767e = new g0(24);

    /* renamed from: a  reason: collision with root package name */
    public final d f13768a;

    public a(d dVar) {
        this.f13768a = dVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }
}
