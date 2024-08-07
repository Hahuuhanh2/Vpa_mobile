package e3;

import android.annotation.SuppressLint;
import f0.b0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: ProcessLock.kt */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap f9089e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9090a;

    /* renamed from: b  reason: collision with root package name */
    public final File f9091b;
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: c  reason: collision with root package name */
    public final Lock f9092c;

    /* renamed from: d  reason: collision with root package name */
    public FileChannel f9093d;

    public a(String str, File file, boolean z10) {
        File file2;
        Lock lock;
        this.f9090a = z10;
        if (file != null) {
            file2 = new File(file, b0.r(str, ".lck"));
        } else {
            file2 = null;
        }
        this.f9091b = file2;
        HashMap hashMap = f9089e;
        synchronized (hashMap) {
            Object obj = hashMap.get(str);
            if (obj == null) {
                obj = new ReentrantLock();
                hashMap.put(str, obj);
            }
            lock = (Lock) obj;
        }
        this.f9092c = lock;
    }

    public final void a(boolean z10) {
        this.f9092c.lock();
        if (z10) {
            try {
                File file = this.f9091b;
                if (file != null) {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileChannel channel = new FileOutputStream(this.f9091b).getChannel();
                    channel.lock();
                    this.f9093d = channel;
                    return;
                }
                throw new IOException("No lock directory was provided.");
            } catch (IOException unused) {
                this.f9093d = null;
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f9093d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f9092c.unlock();
    }
}
