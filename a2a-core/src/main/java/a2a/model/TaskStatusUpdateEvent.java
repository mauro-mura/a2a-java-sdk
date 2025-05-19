package a2a.model;

import java.util.Map;

/**
 * Carries information about a change in the task's status during streaming.
 * This is one of the possible result types in a {@link SendTaskStreamingResponse}.
 */
public class TaskStatusUpdateEvent {
    /**
     * The ID of the task being updated. This MUST match the `TaskSendParams.id`
     * from the `tasks/sendSubscribe` request that initiated this stream.
     */
    private String id;
    /**
     * The new status object for the task.
     */
    private TaskStatus status;
    /**
     * If `true`, this `TaskStatusUpdateEvent` signifies the terminal status update for the current
     * `tasks/sendSubscribe` interaction cycle. This means the task has reached a state like
     * `completed`, `failed`, `canceled`, or `input-required`, and the server does not expect to send
     * more updates for *this specific* `sendSubscribe` request. The server typically closes the SSE
     * connection after sending an event with `final: true`.
     * Default: `false` if omitted.
     */
    private boolean finalValue;
    /**
     * Arbitrary metadata for this specific status update event.
     */
    private Map<String, Object> metadata;
}
