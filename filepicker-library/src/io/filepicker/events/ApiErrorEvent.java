package io.filepicker.events;

/**
 * Created by maciejwitowski on 10/28/14.
 */
public final class ApiErrorEvent {

    public final ErrorType error;

    public ApiErrorEvent (ErrorType error) {
        this.error = error;
    }

    public enum ErrorType { UNAUTHORIZED, NETWORK, WRONG_RESPONSE };
}
