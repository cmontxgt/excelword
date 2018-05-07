package swx.excel.domain;

import java.math.BigDecimal;
import java.util.Date;

public class LBPZB_MB {
    private String pclbBm;

    private String pclbZmc;

    private String pclbCmc;

    private String sfqy;

    private Date cjsj;

    private String pclbBz;

    private BigDecimal sx;

    private String dwbm;

    private String pcFlbm;

    private byte[] pclbmb;

    public String getPclbBm() {
        return pclbBm;
    }

    public void setPclbBm(String pclbBm) {
        this.pclbBm = pclbBm == null ? null : pclbBm.trim();
    }

    public String getPclbZmc() {
        return pclbZmc;
    }

    public void setPclbZmc(String pclbZmc) {
        this.pclbZmc = pclbZmc == null ? null : pclbZmc.trim();
    }

    public String getPclbCmc() {
        return pclbCmc;
    }

    public void setPclbCmc(String pclbCmc) {
        this.pclbCmc = pclbCmc == null ? null : pclbCmc.trim();
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

    public String getPclbBz() {
        return pclbBz;
    }

    public void setPclbBz(String pclbBz) {
        this.pclbBz = pclbBz == null ? null : pclbBz.trim();
    }

    public BigDecimal getSx() {
        return sx;
    }

    public void setSx(BigDecimal sx) {
        this.sx = sx;
    }

    public String getDwbm() {
        return dwbm;
    }

    public void setDwbm(String dwbm) {
        this.dwbm = dwbm == null ? null : dwbm.trim();
    }

    public String getPcFlbm() {
        return pcFlbm;
    }

    public void setPcFlbm(String pcFlbm) {
        this.pcFlbm = pcFlbm == null ? null : pcFlbm.trim();
    }

    public byte[] getPclbmb() {
        return pclbmb;
    }

    public void setPclbmb(byte[] pclbmb) {
        this.pclbmb = pclbmb;
    }
}