package a2a.model;

import lombok.Data;
import lombok.ToString;

import java.util.Map;

@Data
@ToString
public class TaskSendParams {
    /**
     * The ID for the task.
     * - If this is the first message for a new task, the client generates this ID.
     * - If this message continues an existing task (e.g., providing more input after an `input-required` state),
     *   this ID MUST match the ID of the existing task.
     */
    private String id;
    /**
     * Optional client-generated session ID to group this task with others.
     */
    private String sessionId;
    /**
     * The message to send to the agent. The `role` within this message is typically "user".
     */
    private Message message;
    /**
     * Optional: If initiating a new task, the client MAY include push notification configuration.
     * If provided for an existing task, server behavior (e.g., update config, ignore) is server-dependent.
     * Requires `AgentCard.capabilities.pushNotifications: true`.
     */
    private PushNotificationConfig pushNotification;
    /**
     * Optional: If a positive integer `N` is provided, the server SHOULD include the last `N` messages
     * (chronologically) of the task's history in the `Task.history` field of the response.
     * If `0`, `null`, or omitted, no history is explicitly requested (server MAY still include some by default).
     */
    private int historyLength;
    /**
     * Arbitrary metadata for this specific `tasks/send` request.
     */
    private Map<String, Object> metadata;
}
