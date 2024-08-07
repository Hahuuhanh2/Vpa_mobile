package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import ob.c;
import ob.h;
import rb.d;
import z.j;

public class FirebasePerfUrlConnection {
    public FirebasePerfUrlConnection() {
        throw null;
    }

    @Keep
    public static Object getContent(URL url) {
        j jVar = new j(url, 14);
        d dVar = d.f14546z;
        Timer timer = new Timer();
        timer.e();
        long j10 = timer.f7662a;
        mb.d dVar2 = new mb.d(dVar);
        try {
            URLConnection openConnection = ((URL) jVar.f17753b).openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new ob.d((HttpsURLConnection) openConnection, timer, dVar2).getContent();
            }
            if (openConnection instanceof HttpURLConnection) {
                return new c((HttpURLConnection) openConnection, timer, dVar2).getContent();
            }
            return openConnection.getContent();
        } catch (IOException e10) {
            dVar2.j(j10);
            dVar2.m(timer.a());
            dVar2.n(jVar.toString());
            h.c(dVar2);
            throw e10;
        }
    }

    @Keep
    public static Object instrument(Object obj) {
        if (obj instanceof HttpsURLConnection) {
            return new ob.d((HttpsURLConnection) obj, new Timer(), new mb.d(d.f14546z));
        }
        if (obj instanceof HttpURLConnection) {
            return new c((HttpURLConnection) obj, new Timer(), new mb.d(d.f14546z));
        }
        return obj;
    }

    @Keep
    public static InputStream openStream(URL url) {
        j jVar = new j(url, 14);
        d dVar = d.f14546z;
        Timer timer = new Timer();
        timer.e();
        long j10 = timer.f7662a;
        mb.d dVar2 = new mb.d(dVar);
        try {
            URLConnection openConnection = ((URL) jVar.f17753b).openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new ob.d((HttpsURLConnection) openConnection, timer, dVar2).getInputStream();
            }
            if (openConnection instanceof HttpURLConnection) {
                return new c((HttpURLConnection) openConnection, timer, dVar2).getInputStream();
            }
            return openConnection.getInputStream();
        } catch (IOException e10) {
            dVar2.j(j10);
            dVar2.m(timer.a());
            dVar2.n(jVar.toString());
            h.c(dVar2);
            throw e10;
        }
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) {
        j jVar = new j(url, 14);
        d dVar = d.f14546z;
        Timer timer = new Timer();
        timer.e();
        long j10 = timer.f7662a;
        mb.d dVar2 = new mb.d(dVar);
        try {
            URLConnection openConnection = ((URL) jVar.f17753b).openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new ob.d((HttpsURLConnection) openConnection, timer, dVar2).getContent(clsArr);
            }
            if (openConnection instanceof HttpURLConnection) {
                return new c((HttpURLConnection) openConnection, timer, dVar2).getContent(clsArr);
            }
            return openConnection.getContent(clsArr);
        } catch (IOException e10) {
            dVar2.j(j10);
            dVar2.m(timer.a());
            dVar2.n(jVar.toString());
            h.c(dVar2);
            throw e10;
        }
    }
}
