package group.krill.artifact.models;

public class TokenModel {

    private String token;
    private Boolean success;
    private String error;

    public TokenModel(String token, Boolean success, String error) {
        this.token = token;
        this.success = success;
        this.error = error;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public Boolean getSuccess() {
        return success;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
