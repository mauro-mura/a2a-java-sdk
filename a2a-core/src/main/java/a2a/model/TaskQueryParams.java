package a2a.model;

import java.util.Map;

public class TaskQueryParams {
    /**
     * The ID of the task to retrieve.
     */
    private String id;
    /**
     * Optional: If a positive integer `N` is provided, the server SHOULD include the last `N` messages
     * (chronologically) of the task's history in the `Task.history` field of the response.
     * If `0`, `null`, or omitted, no history is explicitly requested.
     */
    private Integer historyLength;
    /**
     * Arbitrary metadata for this specific `tasks/get` request.
     */
    private Map<String, Object> metadata;
}
