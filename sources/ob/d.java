package ob;

import android.os.Build;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: InstrHttpsURLConnection */
public final class d extends HttpsURLConnection {

    /* renamed from: a  reason: collision with root package name */
    public final e f13801a;

    /* renamed from: b  reason: collision with root package name */
    public final HttpsURLConnection f13802b;

    public d(HttpsURLConnection httpsURLConnection, Timer timer, mb.d dVar) {
        super(httpsURLConnection.getURL());
        this.f13802b = httpsURLConnection;
        this.f13801a = new e(httpsURLConnection, timer, dVar);
    }

    public final void addRequestProperty(String str, String str2) {
        this.f13801a.f13804a.addRequestProperty(str, str2);
    }

    public final void connect() {
        this.f13801a.a();
    }

    public final void disconnect() {
        e eVar = this.f13801a;
        eVar.f13805b.m(eVar.f13808e.a());
        eVar.f13805b.e();
        eVar.f13804a.disconnect();
    }

    public final boolean equals(Object obj) {
        return this.f13801a.equals(obj);
    }

    public final boolean getAllowUserInteraction() {
        return this.f13801a.f13804a.getAllowUserInteraction();
    }

    public final String getCipherSuite() {
        return this.f13802b.getCipherSuite();
    }

    public final int getConnectTimeout() {
        return this.f13801a.f13804a.getConnectTimeout();
    }

    public final Object getContent() {
        return this.f13801a.b();
    }

    public final String getContentEncoding() {
        e eVar = this.f13801a;
        eVar.i();
        return eVar.f13804a.getContentEncoding();
    }

    public final int getContentLength() {
        e eVar = this.f13801a;
        eVar.i();
        return eVar.f13804a.getContentLength();
    }

    public final long getContentLengthLong() {
        e eVar = this.f13801a;
        eVar.i();
        if (Build.VERSION.SDK_INT >= 24) {
            return eVar.f13804a.getContentLengthLong();
        }
        return 0;
    }

    public final String getContentType() {
        e eVar = this.f13801a;
        eVar.i();
        return eVar.f13804a.getContentType();
    }

    public final long getDate() {
        e eVar = this.f13801a;
        eVar.i();
        return eVar.f13804a.getDate();
    }

    public final boolean getDefaultUseCaches() {
        return this.f13801a.f13804a.getDefaultUseCaches();
    }

    public final boolean getDoInput() {
        return this.f13801a.f13804a.getDoInput();
    }

    public final boolean getDoOutput() {
        return this.f13801a.f13804a.getDoOutput();
    }

    public final InputStream getErrorStream() {
        return this.f13801a.d();
    }

    public final long getExpiration() {
        e eVar = this.f13801a;
        eVar.i();
        return eVar.f13804a.getExpiration();
    }

    public final String getHeaderField(int i10) {
        e eVar = this.f13801a;
        eVar.i();
        return eVar.f13804a.getHeaderField(i10);
    }

    public final long getHeaderFieldDate(String str, long j10) {
        e eVar = this.f13801a;
        eVar.i();
        return eVar.f13804a.getHeaderFieldDate(str, j10);
    }

    public final int getHeaderFieldInt(String str, int i10) {
        e eVar = this.f13801a;
        eVar.i();
        return eVar.f13804a.getHeaderFieldInt(str, i10);
    }

    public final String getHeaderFieldKey(int i10) {
        e eVar = this.f13801a;
        eVar.i();
        return eVar.f13804a.getHeaderFieldKey(i10);
    }

    public final long getHeaderFieldLong(String str, long j10) {
        e eVar = this.f13801a;
        eVar.i();
        if (Build.VERSION.SDK_INT >= 24) {
            return eVar.f13804a.getHeaderFieldLong(str, j10);
        }
        return 0;
    }

    public final Map<String, List<String>> getHeaderFields() {
        e eVar = this.f13801a;
        eVar.i();
        return eVar.f13804a.getHeaderFields();
    }

    public final HostnameVerifier getHostnameVerifier() {
        return this.f13802b.getHostnameVerifier();
    }

    public final long getIfModifiedSince() {
        return this.f13801a.f13804a.getIfModifiedSince();
    }

    public final InputStream getInputStream() {
        return this.f13801a.e();
    }

    public final boolean getInstanceFollowRedirects() {
        return this.f13801a.f13804a.getInstanceFollowRedirects();
    }

    public final long getLastModified() {
        e eVar = this.f13801a;
        eVar.i();
        return eVar.f13804a.getLastModified();
    }

    public final Certificate[] getLocalCertificates() {
        return this.f13802b.getLocalCertificates();
    }

    public final Principal getLocalPrincipal() {
        return this.f13802b.getLocalPrincipal();
    }

    public final OutputStream getOutputStream() {
        return this.f13801a.f();
    }

    public final Principal getPeerPrincipal() {
        return this.f13802b.getPeerPrincipal();
    }

    public final Permission getPermission() {
        e eVar = this.f13801a;
        eVar.getClass();
        try {
            return eVar.f13804a.getPermission();
        } catch (IOException e10) {
            eVar.f13805b.m(eVar.f13808e.a());
            h.c(eVar.f13805b);
            throw e10;
        }
    }

    public final int getReadTimeout() {
        return this.f13801a.f13804a.getReadTimeout();
    }

    public final String getRequestMethod() {
        return this.f13801a.f13804a.getRequestMethod();
    }

    public final Map<String, List<String>> getRequestProperties() {
        return this.f13801a.f13804a.getRequestProperties();
    }

    public final String getRequestProperty(String str) {
        return this.f13801a.f13804a.getRequestProperty(str);
    }

    public final int getResponseCode() {
        return this.f13801a.g();
    }

    public final String getResponseMessage() {
        return this.f13801a.h();
    }

    public final SSLSocketFactory getSSLSocketFactory() {
        return this.f13802b.getSSLSocketFactory();
    }

    public final Certificate[] getServerCertificates() {
        return this.f13802b.getServerCertificates();
    }

    public final URL getURL() {
        return this.f13801a.f13804a.getURL();
    }

    public final boolean getUseCaches() {
        return this.f13801a.f13804a.getUseCaches();
    }

    public final int hashCode() {
        return this.f13801a.hashCode();
    }

    public final void setAllowUserInteraction(boolean z10) {
        this.f13801a.f13804a.setAllowUserInteraction(z10);
    }

    public final void setChunkedStreamingMode(int i10) {
        this.f13801a.f13804a.setChunkedStreamingMode(i10);
    }

    public final void setConnectTimeout(int i10) {
        this.f13801a.f13804a.setConnectTimeout(i10);
    }

    public final void setDefaultUseCaches(boolean z10) {
        this.f13801a.f13804a.setDefaultUseCaches(z10);
    }

    public final void setDoInput(boolean z10) {
        this.f13801a.f13804a.setDoInput(z10);
    }

    public final void setDoOutput(boolean z10) {
        this.f13801a.f13804a.setDoOutput(z10);
    }

    public final void setFixedLengthStreamingMode(int i10) {
        this.f13801a.f13804a.setFixedLengthStreamingMode(i10);
    }

    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f13802b.setHostnameVerifier(hostnameVerifier);
    }

    public final void setIfModifiedSince(long j10) {
        this.f13801a.f13804a.setIfModifiedSince(j10);
    }

    public final void setInstanceFollowRedirects(boolean z10) {
        this.f13801a.f13804a.setInstanceFollowRedirects(z10);
    }

    public final void setReadTimeout(int i10) {
        this.f13801a.f13804a.setReadTimeout(i10);
    }

    public final void setRequestMethod(String str) {
        this.f13801a.f13804a.setRequestMethod(str);
    }

    public final void setRequestProperty(String str, String str2) {
        e eVar = this.f13801a;
        eVar.getClass();
        if ("User-Agent".equalsIgnoreCase(str)) {
            eVar.f13805b.f13255q = str2;
        }
        eVar.f13804a.setRequestProperty(str, str2);
    }

    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f13802b.setSSLSocketFactory(sSLSocketFactory);
    }

    public final void setUseCaches(boolean z10) {
        this.f13801a.f13804a.setUseCaches(z10);
    }

    public final String toString() {
        return this.f13801a.toString();
    }

    public final boolean usingProxy() {
        return this.f13801a.f13804a.usingProxy();
    }

    public final Object getContent(Class[] clsArr) {
        return this.f13801a.c(clsArr);
    }

    public final String getHeaderField(String str) {
        e eVar = this.f13801a;
        eVar.i();
        return eVar.f13804a.getHeaderField(str);
    }

    public final void setFixedLengthStreamingMode(long j10) {
        this.f13801a.f13804a.setFixedLengthStreamingMode(j10);
    }
}
