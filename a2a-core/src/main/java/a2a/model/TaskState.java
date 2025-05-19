package a2a.model;

public enum TaskState {
    SUBMITTED("submitted"),
    WORKING("working"),
    INPUT_REQUIRED("input-required"),
    COMPLETED("completed"),
    CANCELED("canceled"),
    FAILED("failed"),
    UNKNOWN("unknown");

    private final String value;

    TaskState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

     public static TaskState forValue(String value) {
        for (TaskState state : values()) {
            if (state.value.equalsIgnoreCase(value)) { // Case-insensitive comparison
                return state;
            }
        }
        return UNKNOWN;
    }
}