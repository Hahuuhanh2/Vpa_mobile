package io.reactivex.rxjava3.exceptions;

public final class ProtocolViolationException extends IllegalStateException {
    public ProtocolViolationException() {
        super("Disposable already set!");
    }
}
