package org.katheer.bean;

public class Student {
    private String sid;
    private String sname;
    private String sadd;

    public Student() {

    }

    public Student(String sid, String sname, String sadd) {
        this.sid = sid;
        this.sname = sname;
        this.sadd = sadd;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSadd() {
        return sadd;
    }

    public void setSadd(String sadd) {
        this.sadd = sadd;
    }
}
