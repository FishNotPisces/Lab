

public class Padlock {
    
    Padlock () {
        this.isOpen = true;
        this.password = "0000";
    }

    Padlock (String password) {
        this.isOpen = true;
        this.password = password;
    }

    void close () {
        if (isOpen) isOpen = false;
    }

    void open (String passwd) {
        if (!isOpen && this.password.equals(passwd)) {
            isOpen = true;
        }
    }

    void setPasswd (String oldPasswd, String newPasswd) {
        if (this.password.equals(oldPasswd)) {
            this.password = newPasswd;
        }
    }

    public String toString() {
        String lockState;
        
        if (isOpen) {
            lockState = "Open";
        }
        else {
            lockState = "Close";
        }

        return "LockState: " + lockState;
    }

    private boolean isOpen;
    private String password;
}
