package kis.jwt.models;

import java.util.List;

public class JwtPayload {
    private String dm;
    private int cId;
    private List<Integer> sgIds;
    private int lm;
    private int uId;
    private int rId;
    private UserData ud;
    private List<Object> rls;
    private String pl;
    private String gt;
    private String appV;
    private Object sId;
    private int iat;
    private int exp;

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public List<Integer> getSgIds() {
        return sgIds;
    }

    public void setSgIds(List<Integer> sgIds) {
        this.sgIds = sgIds;
    }

    public int getLm() {
        return lm;
    }

    public void setLm(int lm) {
        this.lm = lm;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public UserData getUd() {
        return ud;
    }

    public void setUd(UserData ud) {
        this.ud = ud;
    }

    public List<Object> getRls() {
        return rls;
    }

    public void setRls(List<Object> rls) {
        this.rls = rls;
    }

    public String getPl() {
        return pl;
    }

    public void setPl(String pl) {
        this.pl = pl;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public String getAppV() {
        return appV;
    }

    public void setAppV(String appV) {
        this.appV = appV;
    }

    public Object getsId() {
        return sId;
    }

    public void setsId(Object sId) {
        this.sId = sId;
    }

    public int getIat() {
        return iat;
    }

    public void setIat(int iat) {
        this.iat = iat;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
