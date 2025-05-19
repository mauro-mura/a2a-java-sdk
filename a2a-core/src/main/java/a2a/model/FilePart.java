package a2a.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

public class FilePart extends Part {
    /**
     * Contains the file details and data/reference.
     */
    @Getter
    private FileContent file;
    @Setter
    private Map<String, Object> metadata;

    @Override
    public String getType() {
        return "file";
    }

    @Override
    public Map<String, Object> getMetadata() {
        return this.metadata;
    }

//    public FilePart(FileContent file) {
//        this.file = file;
//        this.metadata = new HashMap<>();
//    }
}
