package a2a.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

public class TextPart extends Part {
    @Getter
    private String text;
    @Setter
    private Map<String, Object> metadata;

    @Override
    public String getType() {
        return "text";
    }
    @Override
    public Map<String, Object> getMetadata() {
        return this.metadata;
    }

//    public TextPart(String text) {
//        this.text = Objects.requireNonNull(text);
//        this.metadata = new HashMap<>();
//    }
}
