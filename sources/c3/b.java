package c3;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

/* compiled from: SupportSQLiteDatabase.kt */
public interface b extends Closeable {
    Cursor H0(e eVar, CancellationSignal cancellationSignal);

    void I();

    void J();

    void X();

    boolean isOpen();

    Cursor j(e eVar);

    void k();

    void o(String str);

    boolean q0();

    f u(String str);

    boolean y0();
}
