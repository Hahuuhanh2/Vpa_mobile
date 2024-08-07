package com.airbnb.lottie;

import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import n4.c;
import n4.g;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements e0 {
    public final void onResult(Object obj) {
        boolean z10;
        Throwable th2 = (Throwable) obj;
        g gVar = LottieAnimationView.f4737y;
        g.a aVar = n4.g.f13513a;
        if ((th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c.c("Unable to load composition.", th2);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th2);
    }
}
