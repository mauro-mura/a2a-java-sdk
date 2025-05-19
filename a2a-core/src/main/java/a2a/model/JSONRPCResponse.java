package a2a.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class JSONRPCResponse {
    /**
     * A String specifying the version of the JSON-RPC protocol. MUST be exactly "2.0"
     */
    private final String jsonrpc = "2.0";
    /**
     * This member is REQUIRED. It MUST be the same as the value of the id member in the Request Object.
     * If there was an error in detecting the id in the Request object
     * (e.g. Parse error/Invalid Request), it MUST be null.
     */
    private Object id;
    /**
     * This member is REQUIRED on success. This member MUST NOT exist if there was an error invoking the method.
     * The value of this member is determined by the method invoked on the Server.
     */
    private Result result;
    /**
     * This member is REQUIRED on failure.
     * This member MUST NOT exist if there was no error triggered during invocation.
     */
    private JSONRPCError error;
}
