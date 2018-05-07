package swx.excel.domain;

public class ZdpccxKey {
    private String zdpcCxbm;

    private String dwbm;

    public String getZdpcCxbm() {
        return zdpcCxbm;
    }

    public void setZdpcCxbm(String zdpcCxbm) {
        this.zdpcCxbm = zdpcCxbm == null ? null : zdpcCxbm.trim();
    }

    public String getDwbm() {
        return dwbm;
    }

    public void setDwbm(String dwbm) {
        this.dwbm = dwbm == null ? null : dwbm.trim();
    }
}