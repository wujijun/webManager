package main.java.pojo;

public class User {
    private int Uid;
    private String Uname;
    private  String Upassword;
    private  String Uemail;

    public User(int uid, String uname, String upassword, String uemail) {
        Uid = uid;
        Uname = uname;
        Upassword = upassword;
        Uemail = uemail;
    }

    public int getUid() {
        return Uid;
    }

    public void setUid(int uid) {
        Uid = uid;
    }

    public String getUname() {
        return Uname;
    }

    public void setUname(String uname) {
        Uname = uname;
    }

    public String getUpassword() {
        return Upassword;
    }

    public void setUpassword(String upassword) {
        Upassword = upassword;
    }

    public String getUemail() {
        return Uemail;
    }

    public void setUemail(String uemail) {
        Uemail = uemail;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "Uid=" + Uid +
                ", Uname='" + Uname + '\'' +
                ", Upassword='" + Upassword + '\'' +
                ", Uemail='" + Uemail + '\'' +
                '}';
    }
}
