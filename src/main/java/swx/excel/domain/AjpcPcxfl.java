package swx.excel.domain;

import java.math.BigDecimal;

public class AjpcPcxfl {
    private String pcxflbm;

    private String pcxflmc;

    private String pcxflfbm;

    private String pcmbbm;

    private String pcjlbm;

    private BigDecimal xh;

    private String sftj;

    private String sm;

    private String mrz;

    public String getPcxflbm() {
        return pcxflbm;
    }

    public void setPcxflbm(String pcxflbm) {
        this.pcxflbm = pcxflbm == null ? null : pcxflbm.trim();
    }

    public String getPcxflmc() {
        return pcxflmc;
    }

    public void setPcxflmc(String pcxflmc) {
        this.pcxflmc = pcxflmc == null ? null : pcxflmc.trim();
    }

    public String getPcxflfbm() {
        return pcxflfbm;
    }

    public void setPcxflfbm(String pcxflfbm) {
        this.pcxflfbm = pcxflfbm == null ? null : pcxflfbm.trim();
    }

    public String getPcmbbm() {
        return pcmbbm;
    }

    public void setPcmbbm(String pcmbbm) {
        this.pcmbbm = pcmbbm == null ? null : pcmbbm.trim();
    }

    public String getPcjlbm() {
        return pcjlbm;
    }

    public void setPcjlbm(String pcjlbm) {
        this.pcjlbm = pcjlbm == null ? null : pcjlbm.trim();
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

    public String getSm() {
        return sm;
    }

    public void setSm(String sm) {
        this.sm = sm == null ? null : sm.trim();
    }

    public String getMrz() {
        return mrz;
    }

    public void setMrz(String mrz) {
        this.mrz = mrz == null ? null : mrz.trim();
    }
}