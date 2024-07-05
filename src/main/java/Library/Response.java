package Library;

public class Response {
    @Override
    public String toString() {
        return payload;
    }

    private String payload;

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }
}