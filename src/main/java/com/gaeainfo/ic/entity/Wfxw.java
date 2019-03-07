package com.gaeainfo.ic.entity;

/**
 * 责令改正通知书_违法行为【火灾隐患原始数据来源表】
 */
public class Wfxw {
    // 主键
    private String id;
    // 大队简称
    private String wh1;
    // 批文简称
    private String wh2;
    // 年份
    private String wh3;
    // 流水号
    private String wh4;
    // 文号
    private String wh;
    // 责令 ID
    private String zlid;
    // "关 联 项 目编号"
    private String relationitembh;
    // "复 查 项 目编号"
    private String fcitembh;
    // 单位 ID
    private String dwid;
    // "法 律 文 书ID"
    private String flwsid;
    // "法 律 文 书类别"
    private String flwslb;
    // "违 法 行 为主编号"
    private String wfxwmainid;
    // "违 法 行 为子编号"DM_XFJD_WFXW_ZLXQGZ_V2
    private String wfxwsubid;
    // 违法行为
    private String wfxx;
    // 类型X限期整改L立即整改H火灾隐患Z重大火灾整改
    private String type;
    // 状态
    private String state;
    // 检查日期
    private String jcdate;
    // 告知日期
    private String gzdate;
    // 整改情况
    private String zgqk;
    // "整 改 人 姓名"
    private String zgjcyname;
    // "整 改 人 账户"
    private String zgllyacc;
    // "整 改 人 姓名"
    private String zgllyname;
    // 整改时间
    private String zgintime;
    // 创建者帐号
    private String acc;
    // 创建者姓名
    private String accname;
    // 录入时间
    private String intime;
    // 录入人Ip
    private String inip;
    // 修改人帐号
    private String chgacc;
    // 修改人姓名
    private String chgaccname;
    // 修改时间
    private String chgtime;
    // 主管单位ID
    private String zgdwid;
    // 修改人IP
    private String ip;
    // 检查模式
    private String jcmode;
    //
    private String yhsort;
    // 区域编号
    private String qybh;
    // 删除标记
    private String deleted;
    // "备 用 字 段1"
    private String sparefiled1;
    // "备 用 字 段2"
    private String sparefiled2;
    // "备 用 字 段3"
    private String sparefiled3;
    // "备 用 字 段4"
    private String sparefiled4;
    // "备 用 字 段5"
    private String sparefiled5;
    // "备 用 字 段6"
    private String sparefiled6;
    // "备 用 字 段7"
    private String sparefiled7;
    // 总队机构ID
    private String zong;
    // 支队机构ID
    private String zhi;
    // 是否派出所数据
    private String ispcs;
    // 排列版本
    private String rowVersion;
    // 字典名称
    private String zdmc;

    public Wfxw() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWh1() {
        return wh1;
    }

    public void setWh1(String wh1) {
        this.wh1 = wh1;
    }

    public String getWh2() {
        return wh2;
    }

    public void setWh2(String wh2) {
        this.wh2 = wh2;
    }

    public String getWh3() {
        return wh3;
    }

    public void setWh3(String wh3) {
        this.wh3 = wh3;
    }

    public String getWh4() {
        return wh4;
    }

    public void setWh4(String wh4) {
        this.wh4 = wh4;
    }

    public String getWh() {
        return wh;
    }

    public void setWh(String wh) {
        this.wh = wh;
    }

    public String getZlid() {
        return zlid;
    }

    public void setZlid(String zlid) {
        this.zlid = zlid;
    }

    public String getRelationitembh() {
        return relationitembh;
    }

    public void setRelationitembh(String relationitembh) {
        this.relationitembh = relationitembh;
    }

    public String getFcitembh() {
        return fcitembh;
    }

    public void setFcitembh(String fcitembh) {
        this.fcitembh = fcitembh;
    }

    public String getDwid() {
        return dwid;
    }

    public void setDwid(String dwid) {
        this.dwid = dwid;
    }

    public String getFlwsid() {
        return flwsid;
    }

    public void setFlwsid(String flwsid) {
        this.flwsid = flwsid;
    }

    public String getFlwslb() {
        return flwslb;
    }

    public void setFlwslb(String flwslb) {
        this.flwslb = flwslb;
    }

    public String getWfxwmainid() {
        return wfxwmainid;
    }

    public void setWfxwmainid(String wfxwmainid) {
        this.wfxwmainid = wfxwmainid;
    }

    public String getWfxwsubid() {
        return wfxwsubid;
    }

    public void setWfxwsubid(String wfxwsubid) {
        this.wfxwsubid = wfxwsubid;
    }

    public String getWfxx() {
        return wfxx;
    }

    public void setWfxx(String wfxx) {
        this.wfxx = wfxx;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getJcdate() {
        return jcdate;
    }

    public void setJcdate(String jcdate) {
        this.jcdate = jcdate;
    }

    public String getGzdate() {
        return gzdate;
    }

    public void setGzdate(String gzdate) {
        this.gzdate = gzdate;
    }

    public String getZgqk() {
        return zgqk;
    }

    public void setZgqk(String zgqk) {
        this.zgqk = zgqk;
    }

    public String getZgjcyname() {
        return zgjcyname;
    }

    public void setZgjcyname(String zgjcyname) {
        this.zgjcyname = zgjcyname;
    }

    public String getZgllyacc() {
        return zgllyacc;
    }

    public void setZgllyacc(String zgllyacc) {
        this.zgllyacc = zgllyacc;
    }

    public String getZgllyname() {
        return zgllyname;
    }

    public void setZgllyname(String zgllyname) {
        this.zgllyname = zgllyname;
    }

    public String getZgintime() {
        return zgintime;
    }

    public void setZgintime(String zgintime) {
        this.zgintime = zgintime;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public String getAccname() {
        return accname;
    }

    public void setAccname(String accname) {
        this.accname = accname;
    }

    public String getIntime() {
        return intime;
    }

    public void setIntime(String intime) {
        this.intime = intime;
    }

    public String getInip() {
        return inip;
    }

    public void setInip(String inip) {
        this.inip = inip;
    }

    public String getChgacc() {
        return chgacc;
    }

    public void setChgacc(String chgacc) {
        this.chgacc = chgacc;
    }

    public String getChgaccname() {
        return chgaccname;
    }

    public void setChgaccname(String chgaccname) {
        this.chgaccname = chgaccname;
    }

    public String getChgtime() {
        return chgtime;
    }

    public void setChgtime(String chgtime) {
        this.chgtime = chgtime;
    }

    public String getZgdwid() {
        return zgdwid;
    }

    public void setZgdwid(String zgdwid) {
        this.zgdwid = zgdwid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getJcmode() {
        return jcmode;
    }

    public void setJcmode(String jcmode) {
        this.jcmode = jcmode;
    }

    public String getYhsort() {
        return yhsort;
    }

    public void setYhsort(String yhsort) {
        this.yhsort = yhsort;
    }

    public String getQybh() {
        return qybh;
    }

    public void setQybh(String qybh) {
        this.qybh = qybh;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getSparefiled1() {
        return sparefiled1;
    }

    public void setSparefiled1(String sparefiled1) {
        this.sparefiled1 = sparefiled1;
    }

    public String getSparefiled2() {
        return sparefiled2;
    }

    public void setSparefiled2(String sparefiled2) {
        this.sparefiled2 = sparefiled2;
    }

    public String getSparefiled3() {
        return sparefiled3;
    }

    public void setSparefiled3(String sparefiled3) {
        this.sparefiled3 = sparefiled3;
    }

    public String getSparefiled4() {
        return sparefiled4;
    }

    public void setSparefiled4(String sparefiled4) {
        this.sparefiled4 = sparefiled4;
    }

    public String getSparefiled5() {
        return sparefiled5;
    }

    public void setSparefiled5(String sparefiled5) {
        this.sparefiled5 = sparefiled5;
    }

    public String getSparefiled6() {
        return sparefiled6;
    }

    public void setSparefiled6(String sparefiled6) {
        this.sparefiled6 = sparefiled6;
    }

    public String getSparefiled7() {
        return sparefiled7;
    }

    public void setSparefiled7(String sparefiled7) {
        this.sparefiled7 = sparefiled7;
    }

    public String getZong() {
        return zong;
    }

    public void setZong(String zong) {
        this.zong = zong;
    }

    public String getZhi() {
        return zhi;
    }

    public void setZhi(String zhi) {
        this.zhi = zhi;
    }

    public String getIspcs() {
        return ispcs;
    }

    public void setIspcs(String ispcs) {
        this.ispcs = ispcs;
    }

    public String getRowVersion() {
        return rowVersion;
    }

    public void setRowVersion(String rowVersion) {
        this.rowVersion = rowVersion;
    }

    public String getZdmc() {
        return zdmc;
    }

    public void setZdmc(String zdmc) {
        this.zdmc = zdmc;
    }
}
