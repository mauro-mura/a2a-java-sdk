package a2a.model;

import lombok.Data;
import lombok.ToString;

/**
 * Describes a specific capability, function, or area of expertise the agent can perform or address.
 */
@Data
@ToString
public class AgentSkill {
    /**
     * A unique identifier for this skill within the context of this agent
     * (e.g., "currency-converter", "generate-image-from-prompt", "summarize-text-v2").
     * Clients MAY use this ID to request a specific skill if the agent supports such dispatch.
     */
    private String id;
    /**
     * Human-readable name of the skill (e.g., "Currency Conversion Service", "Image Generation AI").
     */
    private String name;
    /**
     * Detailed description of what the skill does, its purpose, and any important considerations.
     * [CommonMark](https://commonmark.org/) MAY be used for rich text formatting.
     */
    private String description;
    /**
     * Array of keywords or categories for discoverability and categorization
     * (e.g., ["finance", "conversion"], ["media", "generative ai", "image"]).
     */
    private String[] tags;
    /**
     * Array of example prompts, inputs, or use cases illustrating how to use this skill
     * (e.g., ["convert 100 USD to EUR", "generate a photorealistic image of a cat wearing a wizard hat"]).
     * These help clients (and potentially end-users or other agents) understand how to formulate requests for this skill.
     */
    private String[] examples;
    /**
     * Overrides `agentCard.defaultInputModes` specifically for this skill.
     * If `null` or omitted, the agent's `defaultInputModes` apply.
     */
    private String[] inputModes;
    /**
     * Overrides `agentCard.defaultOutputModes` specifically for this skill.
     * If `null` or omitted, the agent's `defaultOutputModes` apply.
     */
    private String[] outputModes;

//    public AgentSkill(String id, String name) {
//        this.id = Objects.requireNonNull(id);
//        this.name = Objects.requireNonNull(name);
//    }
}
