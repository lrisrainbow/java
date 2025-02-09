package a1;

public class tb_user {
    private int stuid;
    private String name;
    private String sec;
    private String email;

    public tb_user() {
    }

    public tb_user(int stuid, String name, String sec, String email) {
        this.stuid = stuid;
        this.name = name;
        this.sec = sec;
        this.email = email;
    }

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
