package com.gaeainfo.ic.entity;

import java.util.Date;

/**
 * 消防监督检查记录表
 */
public class Jdjcjl {
    //信息主键编号
    private String id;
    //项目编号
    private String itembh;
    //检查描述
    private String jcms;
    /**
     * 检查形式类别0消防监督抽查,1公众聚集场所投入使用、营业前消防安全检查,2对举报投诉的核查,
     * 3大型群众性活动举办前的检查,4建设工程施工现场检查,
     * 5复查,6申请恢复施工、使用、生产、经营的检查,7申请解除临时查封的检查,
     * 8公安派出所日常消防监督检查,9其他检查,A其他检查
     */
    private String jcxslb;
    //检查形式名称
    private String jcxsmc;
    //文号1
    private String wh1;
    //文号2
    private String wh2;
    //文号3
    private String wh3;
    //文号4
    private String wh4;
    //文号
    private String wh;
    //公安局
    private String gaj;
    //被查单位编号
    private String bcdw;
    //单位名称
    private String dwmc;
    //单位地址
    private String dwdz;
    //消防安全责任人
    private String sfaqzrr;
    //责任人联系电话
    private String zrrlxdh;
    //消防安全管理人
    private String xfaqglr;
    //管理人联系电话
    private String glrdh;
    //联系人
    private String lxr;
    //联系人电话
    private String lxrdh;
    //单位性质编号0消防安全重点单位,1非消防安全重点单位
    private String dwxzbh;
    //单位性质名称
    private String dwxzmc;
    //消防监督检查员
    private String xfjdjcy;
    //检查起始时间
    private Date jcqstime;
    //检查结束时间
    private Date jcjstime;
    //被检查单位随同检查人员
    private String stjcry;
    //被检查单位主管人员
    private String zgry;
    //建筑面积
    private Integer jzmj;
    //建筑层数
    private String jzcs;
    //建筑高度
    private String jzgd;
    //违法行为
    private String wfxw;
    //处理情况
    private String clqk;
    //检查是否通过0否1是（1通过）
    private String pass;
    //"后 续 文 书 是否出过"
    private String isflws;
    //是否复查
    private String isfc;
    //备注
    private String remark;
    //审批人编号
    private String spacc;
    //审批人姓名
    private String spname;
    //审批时间
    private Date sptime;
    //主管单位
    private String zgdwid;
    //录入人账号
    private String acc;
    //录入人姓名
    private String accname;
    //录入时间
    private Date intime;
    //录入人Ip
    private String inip;
    //修改人账号
    private String chgacc;
    //修改人姓名
    private String chgaccname;
    //修改时间
    private Date chgtime;
    //修改人Ip
    private String chgip;
    //版本号
    private String versionnumber;
    //0默认，1已删除
    private String deleted;
    //备用字段1
    private String sparefiled1;
    //备用字段2
    private String sparefiled2;
    //备用字段3
    private String sparefiled3;
    //备用字段4
    private String sparefiled4;
    //备用字段5
    private Date sparefiled5;
    //
    private Date yxmjzrq;
    //
    private Date ytxjzrq;
    //排列版本
    private String rowVersion;
    //法人代表
    private String frdb;
    //
    private String lawid;
    //字典名称
    private String zdmc;

    public Jdjcjl() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItembh() {
        return itembh;
    }

    public void setItembh(String itembh) {
        this.itembh = itembh;
    }

    public String getJcms() {
        return jcms;
    }

    public void setJcms(String jcms) {
        this.jcms = jcms;
    }

    public String getJcxslb() {
        return jcxslb;
    }

    public void setJcxslb(String jcxslb) {
        this.jcxslb = jcxslb;
    }

    public String getJcxsmc() {
        return jcxsmc;
    }

    public void setJcxsmc(String jcxsmc) {
        this.jcxsmc = jcxsmc;
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

    public String getGaj() {
        return gaj;
    }

    public void setGaj(String gaj) {
        this.gaj = gaj;
    }

    public String getBcdw() {
        return bcdw;
    }

    public void setBcdw(String bcdw) {
        this.bcdw = bcdw;
    }

    public String getDwmc() {
        return dwmc;
    }

    public void setDwmc(String dwmc) {
        this.dwmc = dwmc;
    }

    public String getDwdz() {
        return dwdz;
    }

    public void setDwdz(String dwdz) {
        this.dwdz = dwdz;
    }

    public String getSfaqzrr() {
        return sfaqzrr;
    }

    public void setSfaqzrr(String sfaqzrr) {
        this.sfaqzrr = sfaqzrr;
    }

    public String getZrrlxdh() {
        return zrrlxdh;
    }

    public void setZrrlxdh(String zrrlxdh) {
        this.zrrlxdh = zrrlxdh;
    }

    public String getXfaqglr() {
        return xfaqglr;
    }

    public void setXfaqglr(String xfaqglr) {
        this.xfaqglr = xfaqglr;
    }

    public String getGlrdh() {
        return glrdh;
    }

    public void setGlrdh(String glrdh) {
        this.glrdh = glrdh;
    }

    public String getLxr() {
        return lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr;
    }

    public String getLxrdh() {
        return lxrdh;
    }

    public void setLxrdh(String lxrdh) {
        this.lxrdh = lxrdh;
    }

    public String getDwxzbh() {
        return dwxzbh;
    }

    public void setDwxzbh(String dwxzbh) {
        this.dwxzbh = dwxzbh;
    }

    public String getDwxzmc() {
        return dwxzmc;
    }

    public void setDwxzmc(String dwxzmc) {
        this.dwxzmc = dwxzmc;
    }

    public String getXfjdjcy() {
        return xfjdjcy;
    }

    public void setXfjdjcy(String xfjdjcy) {
        this.xfjdjcy = xfjdjcy;
    }

    public Date getJcqstime() {
        return jcqstime;
    }

    public void setJcqstime(Date jcqstime) {
        this.jcqstime = jcqstime;
    }

    public Date getJcjstime() {
        return jcjstime;
    }

    public void setJcjstime(Date jcjstime) {
        this.jcjstime = jcjstime;
    }

    public String getStjcry() {
        return stjcry;
    }

    public void setStjcry(String stjcry) {
        this.stjcry = stjcry;
    }

    public String getZgry() {
        return zgry;
    }

    public void setZgry(String zgry) {
        this.zgry = zgry;
    }

    public Integer getJzmj() {
        return jzmj;
    }

    public void setJzmj(Integer jzmj) {
        this.jzmj = jzmj;
    }

    public String getJzcs() {
        return jzcs;
    }

    public void setJzcs(String jzcs) {
        this.jzcs = jzcs;
    }

    public String getJzgd() {
        return jzgd;
    }

    public void setJzgd(String jzgd) {
        this.jzgd = jzgd;
    }

    public String getWfxw() {
        return wfxw;
    }

    public void setWfxw(String wfxw) {
        this.wfxw = wfxw;
    }

    public String getClqk() {
        return clqk;
    }

    public void setClqk(String clqk) {
        this.clqk = clqk;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getIsflws() {
        return isflws;
    }

    public void setIsflws(String isflws) {
        this.isflws = isflws;
    }

    public String getIsfc() {
        return isfc;
    }

    public void setIsfc(String isfc) {
        this.isfc = isfc;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSpacc() {
        return spacc;
    }

    public void setSpacc(String spacc) {
        this.spacc = spacc;
    }

    public String getSpname() {
        return spname;
    }

    public void setSpname(String spname) {
        this.spname = spname;
    }

    public Date getSptime() {
        return sptime;
    }

    public void setSptime(Date sptime) {
        this.sptime = sptime;
    }

    public String getZgdwid() {
        return zgdwid;
    }

    public void setZgdwid(String zgdwid) {
        this.zgdwid = zgdwid;
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

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
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

    public Date getChgtime() {
        return chgtime;
    }

    public void setChgtime(Date chgtime) {
        this.chgtime = chgtime;
    }

    public String getChgip() {
        return chgip;
    }

    public void setChgip(String chgip) {
        this.chgip = chgip;
    }

    public String getVersionnumber() {
        return versionnumber;
    }

    public void setVersionnumber(String versionnumber) {
        this.versionnumber = versionnumber;
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

    public Date getSparefiled5() {
        return sparefiled5;
    }

    public void setSparefiled5(Date sparefiled5) {
        this.sparefiled5 = sparefiled5;
    }

    public Date getYxmjzrq() {
        return yxmjzrq;
    }

    public void setYxmjzrq(Date yxmjzrq) {
        this.yxmjzrq = yxmjzrq;
    }

    public Date getYtxjzrq() {
        return ytxjzrq;
    }

    public void setYtxjzrq(Date ytxjzrq) {
        this.ytxjzrq = ytxjzrq;
    }

    public String getRowVersion() {
        return rowVersion;
    }

    public void setRowVersion(String rowVersion) {
        this.rowVersion = rowVersion;
    }

    public String getFrdb() {
        return frdb;
    }

    public void setFrdb(String frdb) {
        this.frdb = frdb;
    }

    public String getLawid() {
        return lawid;
    }

    public void setLawid(String lawid) {
        this.lawid = lawid;
    }

    public String getZdmc() {
        return zdmc;
    }

    public void setZdmc(String zdmc) {
        this.zdmc = zdmc;
    }
}
