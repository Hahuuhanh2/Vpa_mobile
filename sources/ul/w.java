package ul;

import f0.b0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Pattern;
import ll.h;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import sk.j;

/* compiled from: RequestBuilder */
public final class w {

    /* renamed from: l  reason: collision with root package name */
    public static final char[] f23195l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f23196m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a  reason: collision with root package name */
    public final String f23197a;

    /* renamed from: b  reason: collision with root package name */
    public final HttpUrl f23198b;

    /* renamed from: c  reason: collision with root package name */
    public String f23199c;

    /* renamed from: d  reason: collision with root package name */
    public HttpUrl.Builder f23200d;

    /* renamed from: e  reason: collision with root package name */
    public final Request.Builder f23201e = new Request.Builder();

    /* renamed from: f  reason: collision with root package name */
    public final Headers.Builder f23202f;

    /* renamed from: g  reason: collision with root package name */
    public MediaType f23203g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f23204h;

    /* renamed from: i  reason: collision with root package name */
    public MultipartBody.Builder f23205i;

    /* renamed from: j  reason: collision with root package name */
    public FormBody.Builder f23206j;

    /* renamed from: k  reason: collision with root package name */
    public RequestBody f23207k;

    /* compiled from: RequestBuilder */
    public static class a extends RequestBody {

        /* renamed from: b  reason: collision with root package name */
        public final RequestBody f23208b;

        /* renamed from: c  reason: collision with root package name */
        public final MediaType f23209c;

        public a(RequestBody requestBody, MediaType mediaType) {
            this.f23208b = requestBody;
            this.f23209c = mediaType;
        }

        public final long a() {
            return this.f23208b.a();
        }

        public final MediaType b() {
            return this.f23209c;
        }

        public final void c(h hVar) {
            this.f23208b.c(hVar);
        }
    }

    public w(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z10, boolean z11, boolean z12) {
        this.f23197a = str;
        this.f23198b = httpUrl;
        this.f23199c = str2;
        this.f23203g = mediaType;
        this.f23204h = z10;
        if (headers != null) {
            this.f23202f = headers.l();
        } else {
            this.f23202f = new Headers.Builder();
        }
        if (z11) {
            this.f23206j = new FormBody.Builder();
        } else if (z12) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.f23205i = builder;
            MediaType mediaType2 = MultipartBody.f22035h;
            j.f(mediaType2, "type");
            if (j.a(mediaType2.f22030b, "multipart")) {
                builder.f22044b = mediaType2;
                return;
            }
            throw new IllegalArgumentException(("multipart != " + mediaType2).toString());
        }
    }

    public final void a(String str, String str2, boolean z10) {
        String str3 = str;
        if (z10) {
            FormBody.Builder builder = this.f23206j;
            builder.getClass();
            j.f(str3, "name");
            ArrayList arrayList = builder.f21993b;
            HttpUrl.Companion companion = HttpUrl.f22005k;
            arrayList.add(HttpUrl.Companion.a(companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, builder.f21992a, 83));
            builder.f21994c.add(HttpUrl.Companion.a(companion, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, builder.f21992a, 83));
            return;
        }
        FormBody.Builder builder2 = this.f23206j;
        builder2.getClass();
        j.f(str3, "name");
        ArrayList arrayList2 = builder2.f21993b;
        HttpUrl.Companion companion2 = HttpUrl.f22005k;
        arrayList2.add(HttpUrl.Companion.a(companion2, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, builder2.f21992a, 91));
        builder2.f21994c.add(HttpUrl.Companion.a(companion2, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, builder2.f21992a, 91));
    }

    public final void b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                MediaType.f22026e.getClass();
                this.f23203g = MediaType.Companion.a(str2);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException(b0.r("Malformed content type: ", str2), e10);
            }
        } else {
            this.f23202f.a(str, str2);
        }
    }

    public final void c(String str, String str2, boolean z10) {
        HttpUrl.Builder builder;
        String str3 = str;
        String str4 = this.f23199c;
        String str5 = null;
        if (str4 != null) {
            HttpUrl httpUrl = this.f23198b;
            httpUrl.getClass();
            try {
                builder = new HttpUrl.Builder();
                builder.c(httpUrl, str4);
            } catch (IllegalArgumentException unused) {
                builder = null;
            }
            this.f23200d = builder;
            if (builder != null) {
                this.f23199c = null;
            } else {
                StringBuilder q10 = android.support.v4.media.a.q("Malformed URL. Base: ");
                q10.append(this.f23198b);
                q10.append(", Relative: ");
                q10.append(this.f23199c);
                throw new IllegalArgumentException(q10.toString());
            }
        }
        if (z10) {
            HttpUrl.Builder builder2 = this.f23200d;
            builder2.getClass();
            j.f(str3, "encodedName");
            if (builder2.f22024g == null) {
                builder2.f22024g = new ArrayList();
            }
            ArrayList arrayList = builder2.f22024g;
            j.c(arrayList);
            HttpUrl.Companion companion = HttpUrl.f22005k;
            arrayList.add(HttpUrl.Companion.a(companion, str, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211));
            ArrayList arrayList2 = builder2.f22024g;
            j.c(arrayList2);
            if (str2 != null) {
                str5 = HttpUrl.Companion.a(companion, str2, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211);
            }
            arrayList2.add(str5);
            return;
        }
        HttpUrl.Builder builder3 = this.f23200d;
        builder3.getClass();
        j.f(str3, "name");
        if (builder3.f22024g == null) {
            builder3.f22024g = new ArrayList();
        }
        ArrayList arrayList3 = builder3.f22024g;
        j.c(arrayList3);
        HttpUrl.Companion companion2 = HttpUrl.f22005k;
        arrayList3.add(HttpUrl.Companion.a(companion2, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219));
        ArrayList arrayList4 = builder3.f22024g;
        j.c(arrayList4);
        if (str2 != null) {
            str5 = HttpUrl.Companion.a(companion2, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219);
        }
        arrayList4.add(str5);
    }
}
