package ll;

import android.support.v4.media.a;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: JvmOkio.kt */
public final class b0 extends c {

    /* renamed from: m  reason: collision with root package name */
    public final Socket f20860m;

    public b0(Socket socket) {
        this.f20860m = socket;
    }

    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    public final void k() {
        try {
            this.f20860m.close();
        } catch (Exception e10) {
            Logger logger = r.f20900a;
            Level level = Level.WARNING;
            StringBuilder q10 = a.q("Failed to close timed out socket ");
            q10.append(this.f20860m);
            logger.log(level, q10.toString(), e10);
        } catch (AssertionError e11) {
            if (j7.a.Q(e11)) {
                Logger logger2 = r.f20900a;
                Level level2 = Level.WARNING;
                StringBuilder q11 = a.q("Failed to close timed out socket ");
                q11.append(this.f20860m);
                logger2.log(level2, q11.toString(), e11);
                return;
            }
            throw e11;
        }
    }
}
