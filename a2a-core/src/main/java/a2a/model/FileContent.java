package a2a.model;

import lombok.Data;
import lombok.ToString;

/**
 * Represents the data or reference for a file, used within a {@link FilePart}
 *
 * Constraint: If file content is being transmitted, exactly one of `bytes` or `uri` MUST be non-null.
 * Both MAY be `null` or absent if the `FilePart` is merely representing a file reference
 * without transmitting its content in the current message (e.g., referring to a previously uploaded file).
 */
@Data
@ToString
public class FileContent {
    /**
     * The original filename, if known (e.g., "document.pdf", "avatar.png").
     */
    private String name;
    /**
     * The [MIME type](https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types)
     * of the file (e.g., "application/pdf", "image/png"). Strongly recommended for proper handling.
     */
    private String mimeType;
    /**
     * Base64 encoded string of the raw file content.
     * Use this for embedding small to medium-sized files directly.
     */
    private String bytes;
    /**
     * A URI (absolute URL is STRONGLY recommended) pointing to the file content.
     * Accessibility of this URI depends on the context (e.g., public URL, pre-signed URL, internal URL).
     * The client and server must have a way to resolve and access this URI if used.
     */
    private String uri;
}
