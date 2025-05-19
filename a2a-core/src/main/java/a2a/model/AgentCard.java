package a2a.model;

import lombok.Data;
import lombok.ToString;

/**
 * An AgentCard conveys key information about an A2A Server:
 * - Overall identity and descriptive details.
 * - Service endpoint URL.
 * - Supported A2A protocol capabilities (streaming, push notifications).
 * - Authentication requirements.
 * - Default input/output content model (MIME model).
 * - A list of specific skills the agent offers.
 */
@Data
@ToString
public class AgentCard {
    /**
     * Human-readable name of the agent (e.g., "Recipe Advisor Agent").
     */
    private String name;
    /**
     * A human-readable description of the agent and its general purpose.
     * [CommonMark](https://commonmark.org/) MAY be used for rich text formatting.
     * (e.g., "This agent helps users find recipes, plan meals, and get cooking instructions.")
     */
    private String description;
    /**
     * The base URL endpoint for the agent's A2A service (where JSON-RPC requests are sent).
     * Must be an absolute HTTPS URL for production (e.g., `https://agent.example.com/a2a/api`).
     * HTTP MAY be used for local development/testing only.
     */
    private String url;
    /**
     * Information about the organization or entity providing the agent.
     */
    private AgentProvider provider;
    /**
     * Version string for the agent or its A2A implementation
     * (format is defined by the provider, e.g., "1.0.0", "2023-10-26-beta").
     */
    private String version;
    /**
     * URL pointing to human-readable documentation for the agent (e.g., API usage, detailed skill descriptions).
     */
    private String documentationUrl;
    /**
     * Specifies optional A2A protocol features supported by this agent.
     */
    private AgentCapabilities capabilities;
    /**
     * Authentication schemes required to interact with the agent's `url` endpoint.
     * If `null`, omitted, or an empty `schemes` array, no A2A-level authentication is explicitly advertised
     * (NOT recommended for production; other security like network ACLs might still apply).
     */
    private AgentAuthentication authentication;
    /**
     * Array of [MIME model](https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types)
     * the agent generally accepts as input across all skills, unless overridden by a specific skill.
     * Default if omitted: `["text/plain"]`. Example: `["text/plain", "image/png"]`
     */
    private String[] defaultInputModes;
    /**
     * Array of MIME model the agent generally produces as output across all skills, unless overridden by a specific skill.
     * Default if omitted: `["text/plain"]`. Example: `["text/plain", "application/json"]`.
     */
    private String[] defaultOutputModes;
    /**
     * An array of specific skills or capabilities the agent offers.
     * Must contain at least one skill if the agent is expected to perform actions beyond simple presence.
     */
    private AgentSkill[] skills;

//    public AgentCard(
//            String name,
//            String url,
//            String version,
//            AgentCapabilities capabilities,
//            AgentSkill[] skills) {
//        this.name = Objects.requireNonNull(name);
//        this.url = Objects.requireNonNull(url);
//        this.version = Objects.requireNonNull(version);
//        this.capabilities = Objects.requireNonNull(capabilities);
//        this.skills = Objects.requireNonNull(skills);
//    }
}
