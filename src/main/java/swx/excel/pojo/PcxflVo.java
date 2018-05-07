package swx.excel.pojo;

import org.springframework.data.mongodb.core.mapping.Field;

/**
 * 评查项分类vo
 *
 * @caomin
 * @create 2018-01-12 10:28
 **/
public class PcxflVo {
    @Field(value = "id")

    private String id;
    @Field(value = "pcxflmc")
    private String pcxflmc;
    @Field(value = "parent")
    private String parent;
    @Field(value = "pcxmc")
    private String pcxmc;
    @Field(value = "xh")
    private String xh;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public String getPcxflmc() {
        return pcxflmc;
    }

    public void setPcxflmc(String pcxflmc) {
        this.pcxflmc = pcxflmc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPcxmc() {
        return pcxmc;
    }

    public void setPcxmc(String pcxmc) {
        this.pcxmc = pcxmc;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }







}
