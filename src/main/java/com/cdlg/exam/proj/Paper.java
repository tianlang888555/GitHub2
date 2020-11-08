package com.cdlg.exam.proj;
/*试题类*/
public class Paper {
    private Integer paperId;
    private String title;
    private String ra;
    private String rb;
    private String rc;
    private String rd;
    private String right;

    public Paper() {
    }

    public Paper(Integer paperId, String title, String ra, String rb, String rc, String rd, String right) {
        this.paperId = paperId;
        this.title = title;
        this.ra = ra;
        this.rb = rb;
        this.rc = rc;
        this.rd = rd;
        this.right = right;
    }
    public Integer getPaperId() {
        return paperId;
    }
    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getRa() {
        return ra;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }
    public String getRb() {
        return rb;
    }
    public void setRb(String rb) {
        this.rb = rb;
    }
    public String getRc() {
        return rc;
    }
    public void setRc(String rc) {
        this.rc = rc;
    }
    public String getRd() {
        return rd;
    }
    public void setRd(String rd) {
        this.rd = rd;
    }
    public String getRight() {
        return right;
    }
    public void setRight(String right) {
        this.right = right;
    }
}
