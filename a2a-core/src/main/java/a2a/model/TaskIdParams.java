package a2a.model;

import java.util.Map;

public class TaskIdParams {
    /**
     * The ID of the task to which the operation applies (e.g., cancel, get push notification config).
     */
    private String id;
    /**
     * Arbitrary metadata for this specific request.
     */
    private Map<String, String> metadata;
}
