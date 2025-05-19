package a2a.model;

import lombok.Data;

/**
 * Used as the params object for the tasks/pushNotification/set method and
 * as the result object for the tasks/pushNotification/get method.
 */
@Data
public class TaskPushNotificationConfig {
    /**
     * The ID of the task for which push notification settings are being configured or retrieved.
     */
    private String id;
    /**
     * The push notification configuration details.
     * When used as params for `set`, this provides the configuration to apply.
     * When used as result for `get`, this reflects the currently active configuration (server MAY omit secrets).
     * If `null` when setting, it might indicate clearing existing configuration (server-dependent).
     */
    private PushNotificationConfig pushNotificationConfig;

//    public TaskPushNotificationConfig(String id, PushNotificationConfig pushNotificationConfig) {
//        this.id = Objects.requireNonNull(id);
//        this.pushNotificationConfig = Objects.requireNonNull(pushNotificationConfig);
//    }
}
