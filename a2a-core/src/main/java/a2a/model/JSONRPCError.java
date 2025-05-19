package a2a.model;

import lombok.Data;
import lombok.ToString;

/**
 * When a JSON-RPC call encounters an error, the Response Object will contain an error member
 * with a value of this structure.
 */
@Data
@ToString
public class JSONRPCError {
    /**
     * A Number that indicates the error type that occurred.
     */
    private final Integer code;
    /**
     * A String providing a short description of the error.
     * The message SHOULD be limited to a concise single sentence.
     */
    private final String message;
    /**
     * A Primitive or Structured value that contains additional information about the error.
     * This may be omitted. The value of this member is defined by the Server (e.g. detailed error codes,
     * debugging information).
     */
    private Object data;

//    public JSONRPCError(Integer code, String message) {
//        this.code = Objects.requireNonNull(code);
//        this.message = Objects.requireNonNull(message);
//    }
}
