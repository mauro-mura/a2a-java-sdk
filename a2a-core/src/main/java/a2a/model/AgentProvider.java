package a2a.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AgentProvider {
    /**
     * Name of the organization or entity.
     */
    private String organization;
    /**
     * URL for the provider's organization website or relevant contact page.
     */
    private String url;

//    public AgentProvider(String organization) {
//        this.organization = Objects.requireNonNull(organization);
//    }
}
