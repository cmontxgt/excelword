package swx.excel.domain;

import java.math.BigDecimal;
import java.util.Date;

public class AjXtPcMb {
    private String pcmbbm;

    private String pcmbmc;

    private String dwbm;

    private String pcflbm;

    private String sfqy;

    private Date cjsj;

    private BigDecimal xh;

    private String sm;

    private String pcmblx;

    private byte[] pcmbnr;

    public String getPcmbbm() {
        return pcmbbm;
    }

    public void setPcmbbm(String pcmbbm) {
        this.pcmbbm = pcmbbm == null ? null : pcmbbm.trim();
    }

    public String getPcmbmc() {
        return pcmbmc;
    }

    public void setPcmbmc(String pcmbmc) {
        this.pcmbmc = pcmbmc == null ? null : pcmbmc.trim();
    }

    public String getDwbm() {
        return dwbm;
    }

    public void setDwbm(String dwbm) {
        this.dwbm = dwbm == null ? null : dwbm.trim();
    }

    public String getPcflbm() {
        return pcflbm;
    }

    public void setPcflbm(String pcflbm) {
        this.pcflbm = pcflbm == null ? null : pcflbm.trim();
    }

    public String getSfqy() {
        return sfqy;
    }

    public void setSfqy(String sfqy) {
        this.sfqy = sfqy == null ? null : sfqy.trim();
    }

    public Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }

    public BigDecimal getXh() {
        return xh;
    }

    public void setXh(BigDecimal xh) {
        this.xh = xh;
    }

    public String getSm() {
        return sm;
    }

    public void setSm(String sm) {
        this.sm = sm == null ? null : sm.trim();
    }

    public String getPcmblx() {
        return pcmblx;
    }

    public void setPcmblx(String pcmblx) {
        this.pcmblx = pcmblx == null ? null : pcmblx.trim();
    }

    public byte[] getPcmbnr() {
        return pcmbnr;
    }

    public void setPcmbnr(byte[] pcmbnr) {
        this.pcmbnr = pcmbnr;
    }
}