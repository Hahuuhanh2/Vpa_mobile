package kotlin.io;

import java.io.File;

/* compiled from: Exceptions.kt */
public final class NoSuchFileException extends FileSystemException {
    public NoSuchFileException(File file) {
        super(file, (File) null, "The source file doesn't exist.");
    }
}
