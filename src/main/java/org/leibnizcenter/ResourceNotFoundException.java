package org.leibnizcenter;

import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * Thrown when we can't find a resource
 * <p>
 * Created by maarten on 9-12-15.
 */
public class ResourceNotFoundException extends IOException {
    public ResourceNotFoundException(Request request, Response response) {
        super("HTTP request not OK: " + response.code() + "\nURL: " + request.url());
    }

    public ResourceNotFoundException() {

    }

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceNotFoundException(Throwable cause) {
        super(cause);
    }
}
