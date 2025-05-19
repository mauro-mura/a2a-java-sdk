package a2a.model;

import lombok.Data;
import lombok.ToString;

/**
 * This is the structure of the JSON object found in the data field of each Server-Sent Event sent by the server for a
 * tasks/sendSubscribe or tasks/resubscribe stream. It's a JSONRPCResponse where the result is one of the event types.
 */
@Data
@ToString
public class SendTaskStreamingResponse extends JSONRPCResponse {
    /**
     * The `id` MUST match the `id` from the originating `tasks/sendSubscribe` (or `tasks/resubscribe`)
     * JSON-RPC request that established this SSE stream.
     */
    private String id; // Overrides JSONRPCResponse 'id' type for clarity and to emphasize it matches the original request.
    /**
     * The `result` field contains the actual event payload for this streaming update.
     * It will be either a TaskStatusUpdateEvent or a TaskArtifactUpdateEvent.
     */
    private Object result;
    /**
     * For streaming events, `error` is typically `null` or absent.
     * If a fatal error occurs that terminates the stream, the server MAY send a final
     * SSE event with this `error` field populated before closing the connection.
     */
    private JSONRPCError error;
}
