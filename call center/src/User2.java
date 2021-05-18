/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class User2 {
    private String pid,ptype,pdate,status;

    public User2(String pid, String ptype, String pdate, String status) {
        this.pid = pid;
        this.ptype = ptype;
        this.pdate = pdate;
        this.status = status;
    }

    User2(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPid() {
        return pid;
    }

    public String getPtype() {
        return ptype;
    }

    public String getPdate() {
        return pdate;
    }

    public String getStatus() {
        return status;
    }
    

}
