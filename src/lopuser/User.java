package lopuser;

/**
 *
 * @author TGDD
 */
public class User {
    private String username,password;
    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    
    public String getUserName()
    {
        return username;
    }
    public String getPassWord()
    {
        return password;
    }
}
