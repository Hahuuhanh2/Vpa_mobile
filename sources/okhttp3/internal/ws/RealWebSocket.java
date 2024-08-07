package okhttp3.internal.ws;

import j7.a;
import java.io.Closeable;
import java.util.List;
import okhttp3.Protocol;
import okhttp3.WebSocket;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.ws.WebSocketReader;

/* compiled from: RealWebSocket.kt */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public static final List<Protocol> f22613a = a.c0(Protocol.HTTP_1_1);

    /* compiled from: RealWebSocket.kt */
    public static final class Close {
        public Close() {
            throw null;
        }
    }

    /* compiled from: RealWebSocket.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    /* compiled from: RealWebSocket.kt */
    public static final class Message {
    }

    /* compiled from: RealWebSocket.kt */
    public static abstract class Streams implements Closeable {
    }

    /* compiled from: RealWebSocket.kt */
    public final class WriterTask extends Task {
        public WriterTask() {
            throw null;
        }

        public final long a() {
            throw null;
        }
    }

    static {
        new Companion(0);
    }
}
