package okhttp3.internal.io;

/* compiled from: FileSystem.kt */
public interface FileSystem {

    /* compiled from: FileSystem.kt */
    public static final class Companion {

        /* compiled from: FileSystem.kt */
        public static final class SystemFileSystem implements FileSystem {
            public final String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        static {
            new Companion();
        }

        private Companion() {
        }
    }
}
