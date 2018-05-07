package swx.excel.domain;

import java.math.BigDecimal;

public class Pcx {
    private String pcxbm;

    private String pcxmc;

    private String pcxflbm;

    private String pcmbbm;

    private BigDecimal pcxlx;

    private String pcfs;

    private String pcjlbm;

    private BigDecimal fzGd;

    private BigDecimal fzQsz;

    private BigDecimal fzJsz;

    private String zdpccx;

    private BigDecimal xh;

    private String sftj;

    private String bz;

    private String mrz;

    public String getPcxbm() {
        return pcxbm;
    }

    public void setPcxbm(String pcxbm) {
        this.pcxbm = pcxbm == null ? null : pcxbm.trim();
    }

    public String getPcxmc() {
        return pcxmc;
    }

    public void setPcxmc(String pcxmc) {
        this.pcxmc = pcxmc == null ? null : pcxmc.trim();
    }

    public String getPcxflbm() {
        return pcxflbm;
    }

    public void setPcxflbm(String pcxflbm) {
        this.pcxflbm = pcxflbm == null ? null : pcxflbm.trim();
    }

    public String getPcmbbm() {
        return pcmbbm;
    }

    public void setPcmbbm(String pcmbbm) {
        this.pcmbbm = pcmbbm == null ? null : pcmbbm.trim();
    }

    public BigDecimal getPcxlx() {
        return pcxlx;
    }

    public void setPcxlx(BigDecimal pcxlx) {
        this.pcxlx = pcxlx;
    }

    public String getPcfs() {
        return pcfs;
    }

    public void setPcfs(String pcfs) {
        this.pcfs = pcfs == null ? null : pcfs.trim();
    }

    public String getPcjlbm() {
        return pcjlbm;
    }

    public void setPcjlbm(String pcjlbm) {
        this.pcjlbm = pcjlbm == null ? null : pcjlbm.trim();
    }

    public BigDecimal getFzGd() {
        return fzGd;
    }

    public void setFzGd(BigDecimal fzGd) {
        this.fzGd = fzGd;
    }

    public BigDecimal getFzQsz() {
        return fzQsz;
    }

    public void setFzQsz(BigDecimal fzQsz) {
        this.fzQsz = fzQsz;
    }

    public BigDecimal getFzJsz() {
        return fzJsz;
    }

    public void setFzJsz(BigDecimal fzJsz) {
        this.fzJsz = fzJsz;
    }

    public String getZdpccx() {
        return zdpccx;
    }

    public void setZdpccx(String zdpccx) {
        this.zdpccx = zdpccx == null ? null : zdpccx.trim();
    }

    public BigDecimal getXh() {
        return xh;
    }

    public void setXh(BigDecimal xh) {
        this.xh = xh;
    }

    public String getSftj() {
        return sftj;
    }

    public void setSftj(String sftj) {
        this.sftj = sftj == null ? null : sftj.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public String getMrz() {
        return mrz;
    }

    public void setMrz(String mrz) {
        this.mrz = mrz == null ? null : mrz.trim();
    }
}