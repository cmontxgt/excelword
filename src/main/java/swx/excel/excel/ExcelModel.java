package swx.excel.excel;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @caomin
 * @create 2017-12-25 14:07
 **/
@Document(collection = "excelModel")
public class ExcelModel {

    /*
    序号
     */
    @Field(value = "序号")
    private String xh;
    /*
    评查类别
     */
    @Field(value = "评查类别")
    private String pclb;
    /*
    评查内容
     */
    @Field(value = "评查内容")
    private String pcnr;
    /*
   质量标准
     */
    @Field(value = "质量标准")
    private String zlbz;
    /*
    评查标准
     */
    @Field(value = "评查标准")
    private String pcbz;
    /*
    扣分值
     */
    @Field(value = "扣分值")
    private String kfz;
    /*
     法律依据
     */
    @Field(value = "法律依据")
    private String flyj;
    /*
    错误等级
     */
    @Field(value = "错误等级")
    private String cwdj;
    /*
        系统是否可以实现
     */
    @Field(value = "系统是否可以实现")
    private String xtsfkysx;
    /*
    详细说明
     */
    @Field(value = "详细说明")
    private String xxsm;
    /*
    评查依据
     */
    @Field(value = "评查依据")
    private String pcyj;
    /*
   文书模板
     */
    @Field(value = "文书模板")
    private String wsbm;
    /*
    存储过程
     */
    @Field(value = "存储过程")
    private String ccgc;
    /*
    存储过程名称
     */
    @Field(value = "存储过程名称")
    private String ccgcmc;

    @Override
    public String toString() {
        return "ExcelModel{" +
                "xh='" + xh + '\'' +
                ", pclb='" + pclb + '\'' +
                ", pcnr='" + pcnr + '\'' +
                ", zlbz='" + zlbz + '\'' +
                ", pcbz='" + pcbz + '\'' +
                ", kfz='" + kfz + '\'' +
                ", flyj='" + flyj + '\'' +
                ", cwdj='" + cwdj + '\'' +
                ", xtsfkysx='" + xtsfkysx + '\'' +
                ", xxsm='" + xxsm + '\'' +
                ", pcyj='" + pcyj + '\'' +
                ", wsbm='" + wsbm + '\'' +
                ", ccgc='" + ccgc + '\'' +
                ", ccgcmc='" + ccgcmc + '\'' +
                '}';
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public String getPclb() {
        return pclb;
    }

    public void setPclb(String pclb) {
        this.pclb = pclb;
    }

    public String getPcnr() {
        return pcnr;
    }

    public void setPcnr(String pcnr) {
        this.pcnr = pcnr;
    }

    public String getZlbz() {
        return zlbz;
    }

    public void setZlbz(String zlbz) {
        this.zlbz = zlbz;
    }

    public String getPcbz() {
        return pcbz;
    }

    public void setPcbz(String pcbz) {
        this.pcbz = pcbz;
    }

    public String getKfz() {
        return kfz;
    }

    public void setKfz(String kfz) {
        this.kfz = kfz;
    }

    public String getFlyj() {
        return flyj;
    }

    public void setFlyj(String flyj) {
        this.flyj = flyj;
    }

    public String getCwdj() {
        return cwdj;
    }

    public void setCwdj(String cwdj) {
        this.cwdj = cwdj;
    }

    public String getXtsfkysx() {
        return xtsfkysx;
    }

    public void setXtsfkysx(String xtsfkysx) {
        this.xtsfkysx = xtsfkysx;
    }

    public String getXxsm() {
        return xxsm;
    }

    public void setXxsm(String xxsm) {
        this.xxsm = xxsm;
    }

    public String getPcyj() {
        return pcyj;
    }

    public void setPcyj(String pcyj) {
        this.pcyj = pcyj;
    }

    public String getWsbm() {
        return wsbm;
    }

    public void setWsbm(String wsbm) {
        this.wsbm = wsbm;
    }

    public String getCcgc() {
        return ccgc;
    }

    public void setCcgc(String ccgc) {
        this.ccgc = ccgc;
    }

    public String getCcgcmc() {
        return ccgcmc;
    }

    public void setCcgcmc(String ccgcmc) {
        this.ccgcmc = ccgcmc;
    }
}
