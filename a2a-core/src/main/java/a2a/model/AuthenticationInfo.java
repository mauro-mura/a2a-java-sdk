package a2a.model;

import lombok.Data;

/**
 * A generic structure for specifying authentication requirements, typically used
 * within {@link PushNotificationConfig} to describe how the A2A Server should
 * authenticate to the client's webhook.
 */
@Data
public class AuthenticationInfo {
    /**
     * Array of authentication scheme names the caller (i.e., the A2A Server, in the context of push notifications)
     * must use when sending the request to the webhook URL (e.g., "Bearer" for an OAuth token, "ApiKey" for a pre-shared key, "Basic").
     * Standard names SHOULD be used.
     */
    private final String[] schemes;
    /**
     * Optional field for providing static credentials or scheme-specific information
     * that the A2A Server needs to use.
     * Examples:
     * - For "ApiKey": A JSON string like `{"in": "header", "name": "X-Client-Webhook-Key", "value": "actual_api_key_value"}`.
     * - For "Bearer": If the A2A Server is expected to use a specific pre-issued token, it could be provided here. More commonly, the server would obtain its own token using OAuth client credentials flow if this field specifies an OAuth scheme.
     * **CRITICAL**: Use with extreme caution if this field contains secrets. This configuration is sent from client to server.
     * Prefer mechanisms where the server fetches its own credentials dynamically (e.g., OAuth client credentials flow with a pre-configured client ID/secret on the server side for the webhook's audience)
     * rather than having the client provide secrets to the server.
     * If this field *must* carry a secret, the A2A communication channel itself must be exceptionally secure, and both client and server must handle this data with care.
     */
    private String credentials; // E.g., A JSON string parsable by the server.

//    public AuthenticationInfo(String[] schemes) {
//        this.schemes = Objects.requireNonNull(schemes);
//    }
}
