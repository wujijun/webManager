package pojo;

import lombok.Data;

@Data
public class User {
    private int Uid;
    private String Uname;
    private  String Upassword;
    private  String Uemail;
    private  String img;

    public User() {
    }

    public User(int uid, String uname, String upassword, String uemail, String img) {
        Uid = uid;
        Uname = uname;
        Upassword = upassword;
        Uemail = uemail;
        this.img = img;
    }
}
