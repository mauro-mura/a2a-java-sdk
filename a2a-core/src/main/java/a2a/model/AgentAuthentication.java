package a2a.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude = "credentials")
public class AgentAuthentication {
    /**
     * Array of authentication scheme names supported/required by the agent's endpoint
     * (e.g., "Bearer", "Basic", "OAuth2", "ApiKey").
     * Standard names (e.g., from OpenAPI specification, IANA registry) SHOULD be used where applicable.
     * An empty array means no specific A2A-level schemes are advertised.
     */
    private String[] schemes;
    /**
     * Optional field, MAY contain non-secret, scheme-specific information.
     * Examples: For "OAuth2", this could be a JSON string with `tokenUrl`, `authorizationUrl`, `scopes`.
     * For "ApiKey", it could specify the header name (`in: "header"`, `name: "X-Custom-API-Key"`).
     * **CRITICAL**: This field MUST NOT contain plaintext secrets (e.g., actual API key values, passwords).
     * If the Agent Card itself needs to be protected due to this field containing sensitive URLs
     * or configuration, the endpoint serving the Agent Card MUST be secured.
     */
    private String credentials;

//    public AgentAuthentication(String[] schemes) {
//        this.schemes = Objects.requireNonNull(schemes);
//    }
}
