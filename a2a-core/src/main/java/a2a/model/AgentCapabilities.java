package a2a.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AgentCapabilities {
    /**
     * If `true`, the agent supports `tasks/sendSubscribe` and `tasks/resubscribe` for real-time
     * updates via Server-Sent Events (SSE). Default: `false`.
     */
    private boolean streaming;
    /**
     * If `true`, the agent supports `tasks/pushNotification/set` and `tasks/pushNotification/get`
     * for asynchronous task updates via webhooks. Default: `false`.
     */
    private boolean pushNotifications;
    /**
     * If `true`, the agent may include a detailed history of status changes
     * within the `Task` object (future enhancement; specific mechanism TBD). Default: `false`.
     */
    private boolean stateTransitionHistory;
}
