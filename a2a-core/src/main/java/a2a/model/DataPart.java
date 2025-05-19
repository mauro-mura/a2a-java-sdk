package a2a.model;

import lombok.Setter;

import java.util.Map;

/**
 * For conveying structured JSON data. Useful for forms, parameters, or any machine-readable
 * information.
 */
public class DataPart extends Part{
    /**
     *  The structured JSON data payload. This can be any valid JSON object or array.
     *  The schema of this data is application-defined and may be implicitly understood
     *  by the interacting agents or explicitly described (e.g., via a JSON Schema reference
     *  in the `metadata` or associated `AgentSkill`).
     */
    private Map<String, Object> data;
    @Setter
    private Map<String, Object> metadata;

    @Override
    public String getType() {
        return "data";
    }

    @Override
    public Map<String, Object> getMetadata() {
        return this.metadata;
    }

//    public DataPart(Map<String, Object> data) {
//        this.data = Objects.requireNonNull(data);
//        this.metadata = new HashMap<>();
//    }
}
