package fb;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.media.a;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import fb.d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.Future;

/* compiled from: ImageDownload */
public final class o implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final URL f10155a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Future<?> f10156b;

    /* renamed from: c  reason: collision with root package name */
    public Task<Bitmap> f10157c;

    public o(URL url) {
        this.f10155a = url;
    }

    public final void close() {
        this.f10156b.cancel(true);
    }

    public final Bitmap d() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Objects.toString(this.f10155a);
        }
        URLConnection openConnection = this.f10155a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] b10 = d.b(new d.a(inputStream));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    int length = b10.length;
                    Objects.toString(this.f10155a);
                }
                if (b10.length <= 1048576) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(b10, 0, b10.length);
                    if (decodeByteArray != null) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Objects.toString(this.f10155a);
                        }
                        return decodeByteArray;
                    }
                    StringBuilder q10 = a.q("Failed to decode image: ");
                    q10.append(this.f10155a);
                    throw new IOException(q10.toString());
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }
}
