package a2a.model;

import lombok.Data;

import java.util.Map;

/**
 * Represents a single communication turn or a piece of contextual information within a {@link Task}.
 * Messages are used for instructions, prompts, replies, and status updates.
 */
@Data
public class Message {
    /**
     * Indicates the sender of the message:
     * "user" for messages originating from the A2A Client (acting on behalf of an end-user or system).
     * "agent" for messages originating from the A2A Server (the remote agent).
     */
    private String role;
    /**
     * An array containing the content of the message, broken down into one or more parts.
     * A message MUST contain at least one part.
     * Using multiple parts allows for rich, multi-modal content (e.g., text accompanying an image).
     */
    private Part[] parts;
    /**
     * Arbitrary key-value metadata associated with the message.
     * Keys SHOULD be strings; values can be any valid JSON type.
     * Useful for timestamps, source identifiers, language codes, etc.
     */
    private Map<String, Object> metadata;
}
