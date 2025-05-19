package a2a.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class JSONRPCRequest {
    /**
     * A String specifying the version of the JSON-RPC protocol. MUST be exactly "2.0"
     */
    private final String jsonrpc = "2.0";
    /**
     * A String containing the name of the method to be invoked (e.g., "tasks/send", "tasks/get")
     */
    private String method;
    /**
     * A Structured value that holds the parameter values to be used during the invocation
     * of the method. This member MAY be omitted if the method expects no parameters.
     * A2A methods typically use an object for params.
     */
    private Object params;
    /**
     *  An identifier established by the Client that MUST contain a String, Number, or NULL value
     *  if included. If it is not included it is assumed to be a notification. The value SHOULD NOT
     *  be NULL for requests expecting a response, and Numbers SHOULD NOT contain fractional parts.
     *  The Server MUST reply with the same value in the Response object if included.
     *  This member is used to correlate the context between the two objects. A2A methods typically
     *  expect a response or stream, so id will usually be present and non-null.
     */
    private Object id;
}
