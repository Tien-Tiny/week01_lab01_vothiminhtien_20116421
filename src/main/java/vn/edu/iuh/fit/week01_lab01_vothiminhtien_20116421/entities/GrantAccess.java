package vn.edu.iuh.fit.week01_lab01_vothiminhtien_20116421.entities;

public class GrantAccess {
    private String role_id;
    private String account_id;
    private Grant grant;
    private String note;

    public GrantAccess() {
        super();
    }

    public GrantAccess(String role_id, String account_id, Grant grant, String note) {
        this.role_id = role_id;
        this.account_id = account_id;
        this.grant = grant;
        this.note = note;
    }

    @Override
    public String toString() {
        return "GrantAccess{" +
                "role_id=" + role_id +
                ", account_id=" + account_id +
                ", grant=" + grant +
                ", note='" + note + '\'' +
                '}';
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole(String role_id) {
        this.role_id = role_id;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public Grant getGrant() {
        return grant;
    }

    public void setGrant(Grant grant) {
        this.grant = grant;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}