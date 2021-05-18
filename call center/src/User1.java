/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class User1 {
private String cid,pid,ptype,pdate,status;

    public User1(String cid, String pid, String ptype, String pdate, String status) {
        this.cid = cid;
        this.pid = pid;
        this.ptype = ptype;
        this.pdate = pdate;
        this.status = status;
    }

    public String getCid() {
        return cid;
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
