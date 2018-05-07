package swx.excel.domain;

import java.math.BigDecimal;

public class XT_PC_PCXFL_MB {
    private String pcxflBm;

    private String pcxflMc;

    private String pcxflFbm;

    private BigDecimal fz;

    private String pclbBm;

    private BigDecimal sx;

    private String sftj;

    private String pcxflBz;

    public String getPcxflBm() {
        return pcxflBm;
    }

    public void setPcxflBm(String pcxflBm) {
        this.pcxflBm = pcxflBm == null ? null : pcxflBm.trim();
    }

    public String getPcxflMc() {
        return pcxflMc;
    }

    public void setPcxflMc(String pcxflMc) {
        this.pcxflMc = pcxflMc == null ? null : pcxflMc.trim();
    }

    public String getPcxflFbm() {
        return pcxflFbm;
    }

    public void setPcxflFbm(String pcxflFbm) {
        this.pcxflFbm = pcxflFbm == null ? null : pcxflFbm.trim();
    }

    public BigDecimal getFz() {
        return fz;
    }

    public void setFz(BigDecimal fz) {
        this.fz = fz;
    }

    public String getPclbBm() {
        return pclbBm;
    }

    public void setPclbBm(String pclbBm) {
        this.pclbBm = pclbBm == null ? null : pclbBm.trim();
    }

    public BigDecimal getSx() {
        return sx;
    }

    public void setSx(BigDecimal sx) {
        this.sx = sx;
    }

    public String getSftj() {
        return sftj;
    }

    public void setSftj(String sftj) {
        this.sftj = sftj == null ? null : sftj.trim();
    }

    public String getPcxflBz() {
        return pcxflBz;
    }

    public void setPcxflBz(String pcxflBz) {
        this.pcxflBz = pcxflBz == null ? null : pcxflBz.trim();
    }
}