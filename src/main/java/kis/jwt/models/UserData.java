package kis.jwt.models;

import java.util.List;

public class UserData {
    private List<String> accountNumbers;
    private String type;
    private String username;
    private String masDrTokenId;
    private String masEquityTokenId;

    public List<String> getAccountNumbers() {
        return accountNumbers;
    }

    public void setAccountNumbers(List<String> accountNumbers) {
        this.accountNumbers = accountNumbers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMasDrTokenId() {
        return masDrTokenId;
    }

    public void setMasDrTokenId(String masDrTokenId) {
        this.masDrTokenId = masDrTokenId;
    }

    public String getMasEquityTokenId() {
        return masEquityTokenId;
    }

    public void setMasEquityTokenId(String masEquityTokenId) {
        this.masEquityTokenId = masEquityTokenId;
    }
}