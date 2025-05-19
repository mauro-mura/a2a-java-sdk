package a2a.model;

import lombok.Data;

/**
 * Represents the current state and associated context (e.g., a message from the agent) of a {@link Task}
 */
@Data
public class TaskStatus {
    /**
     * The current lifecycle state of the task.
     */
    private TaskState state;
    /**
     * An optional message associated with the current status.
     * This could be a progress update from the agent, a prompt for more input,
     * a summary of the final result, or an error message.
     */
    private Message message;
    /**
     * The date and time (UTC is STRONGLY recommended) when this status was recorded by the server.
     * Format: ISO 8601 `date-time` string (e.g., "2023-10-27T10:00:00Z").
     */
    private String timestamp;

//    public TaskStatus(TaskState state) {
//        this.state = Objects.requireNonNull(state);
//    }
}
