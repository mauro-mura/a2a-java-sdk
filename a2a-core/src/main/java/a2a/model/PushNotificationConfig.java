package a2a.model;

import lombok.Data;

/**
 * Configuration provided by the client to the server for sending
 * asynchronous push notifications about task updates.
 */
@Data
public class PushNotificationConfig {
    /**
     * The absolute HTTPS webhook URL where the A2A Server should POST task updates.
     * This URL MUST be HTTPS for security.
     */
    private String url;
    /**
     * An optional, client-generated opaque token (e.g., a secret, a task-specific identifier, or a nonce).
     * The A2A Server SHOULD include this token in the notification request it sends to the `url`
     * (e.g., in a custom HTTP header like `X-A2A-Notification-Token` or similar).
     * This allows the client's webhook receiver to validate the relevance and authenticity of the notification.
     */
    private String token;
    /**
     * Authentication details the A2A Server needs to use when calling the client's `url`.
     * The client's webhook endpoint defines these requirements. This tells the A2A Server how to authenticate *itself* to the client's webhook.
     */
    private AuthenticationInfo authentication;

//    public PushNotificationConfig(String url) {
//        this.url = Objects.requireNonNull(url);
//    }
}
