package swx.excel.pojo;

/**
 * @author caomin
 * @date 2018/5/7
 * @说明 word返回字段
 */
public class WordDto {
    private String columnName;
    private String columnType;
    private String columnLength;
    /**
     * 是否为空
     */
    private String sfwk;

    /**
     * 默认值
     */
    private String defaultValue;

    /**
     * 注释
     */
    private String bz;

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public String getColumnLength() {
        return columnLength;
    }

    public void setColumnLength(String columnLength) {
        this.columnLength = columnLength;
    }

    public String getSfwk() {
        return sfwk;
    }

    public void setSfwk(String sfwk) {
        this.sfwk = sfwk;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }
}

