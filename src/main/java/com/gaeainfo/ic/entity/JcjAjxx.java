package com.gaeainfo.ic.entity;

import java.io.Serializable;

/**
 * 接处警检查信息
 */
public class JcjAjxx implements Serializable {
    //记录ID
    private String id;
    //记录状态（0：可用  1：已删除）
    private String jlzt;
    //传输状态（0：已传输 1：已更新 2：新添加 ）
    private String cszt;
    //时间戳
    private String sjc;
    //案件编号
    private String ajbh;
    //接警记录ID
    private String jjjlId;
    //保留案件编号
    private String blajbh;
    //立案接警序号
    private String lajjxh;
    //主管机构编号
    private String zgjgbh;
    //烟雾情况代码
    private String ywqkdm;
    //行政区域编号
    private String xzqybh;
    //建筑结构类型代码
    private String jzjglxdm;
    //立案方式代码
    private String lafsdm;
    //立案时间
    private String lasj;
    //案发地址
    private String afdz;
    //案件类型代码
    private String ajlxdm;
    //GIS_X
    private String gisX;
    //GIS_Y
    private String gisY;
    //案件等级代码
    private String ajdjdm;
    //处置对象代码
    private String czdxdm;
    //补充信息
    private String bcxx;
    //注意事项
    private String zysx;
    //气象信息描述
    private String qxxxms;
    //楼房层数
    private String lfcs;
    //接收命令时间
    private String jsmlsj;
    //出动时间
    private String cdsj;
    //到达现场时间
    private String ddxcsj;
    //战斗展开时间
    private String zdzksj;
    //到场出水时间
    private String dccssj;
    //火势控制时间
    private String hskzsj;
    //基本扑灭时间
    private String jbpmsj;
    //归队时间
    private String gdsj;
    //燃烧楼层
    private String rslc;
    //战斗员人数
    private String zdyrs;
    //出车总数
    private String ccrs;
    //疏散人数
    private String ssrs;
    //救出人数
    private String jcrs;
    //群众死亡人数
    private String qzswrs;
    //部队死亡人数
    private String bdswrs;
    //灾害原因
    private String zhyy;
    //受伤人数
    private String sshrs;
    //部队受伤人数
    private String bdssrs;
    //燃烧面积
    private String rsmj;
    //保护面积
    private String bhmj;
    //财产损失
    private String ccss;
    //作战编号
    private String zzbh;
    //备注
    private String bz;
    //案件状态代码
    private String ajztdm;
    //案件性质
    private String ajxz;
    //合并状态
    private String hbzt;
    //重点单位ID
    private String zddwid;
    //人员被困数
    private String rybgs;
    //接警员姓名
    private String jjyxm;
    //灾害场所
    private String zhcs;
    //回执时间
    private String hzsj;
    //下达时间
    private String xdsj;
    //结束时间
    private String jssj;
    //报送消防机构代码
    private String bsxfjgdm;
    //灾情领域消防机构代码
    private String zqlyxfjgdm;
    //水源信息
    private String syxx;
    //接警提示
    private String jjts;
    //
    private String pptz;
    //支队名称
    private String zdmc;


    public JcjAjxx() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJlzt() {
        return jlzt;
    }

    public void setJlzt(String jlzt) {
        this.jlzt = jlzt;
    }

    public String getCszt() {
        return cszt;
    }

    public void setCszt(String cszt) {
        this.cszt = cszt;
    }

    public String getSjc() {
        return sjc;
    }

    public void setSjc(String sjc) {
        this.sjc = sjc;
    }

    public String getAjbh() {
        return ajbh;
    }

    public void setAjbh(String ajbh) {
        this.ajbh = ajbh;
    }

    public String getJjjlId() {
        return jjjlId;
    }

    public void setJjjlId(String jjjlId) {
        this.jjjlId = jjjlId;
    }

    public String getBlajbh() {
        return blajbh;
    }

    public void setBlajbh(String blajbh) {
        this.blajbh = blajbh;
    }

    public String getLajjxh() {
        return lajjxh;
    }

    public void setLajjxh(String lajjxh) {
        this.lajjxh = lajjxh;
    }

    public String getZgjgbh() {
        return zgjgbh;
    }

    public void setZgjgbh(String zgjgbh) {
        this.zgjgbh = zgjgbh;
    }

    public String getYwqkdm() {
        return ywqkdm;
    }

    public void setYwqkdm(String ywqkdm) {
        this.ywqkdm = ywqkdm;
    }

    public String getXzqybh() {
        return xzqybh;
    }

    public void setXzqybh(String xzqybh) {
        this.xzqybh = xzqybh;
    }

    public String getJzjglxdm() {
        return jzjglxdm;
    }

    public void setJzjglxdm(String jzjglxdm) {
        this.jzjglxdm = jzjglxdm;
    }

    public String getLafsdm() {
        return lafsdm;
    }

    public void setLafsdm(String lafsdm) {
        this.lafsdm = lafsdm;
    }

    public String getLasj() {
        return lasj;
    }

    public void setLasj(String lasj) {
        this.lasj = lasj;
    }

    public String getAfdz() {
        return afdz;
    }

    public void setAfdz(String afdz) {
        this.afdz = afdz;
    }

    public String getAjlxdm() {
        return ajlxdm;
    }

    public void setAjlxdm(String ajlxdm) {
        this.ajlxdm = ajlxdm;
    }

    public String getGisX() {
        return gisX;
    }

    public void setGisX(String gisX) {
        this.gisX = gisX;
    }

    public String getGisY() {
        return gisY;
    }

    public void setGisY(String gisY) {
        this.gisY = gisY;
    }

    public String getAjdjdm() {
        return ajdjdm;
    }

    public void setAjdjdm(String ajdjdm) {
        this.ajdjdm = ajdjdm;
    }

    public String getCzdxdm() {
        return czdxdm;
    }

    public void setCzdxdm(String czdxdm) {
        this.czdxdm = czdxdm;
    }

    public String getBcxx() {
        return bcxx;
    }

    public void setBcxx(String bcxx) {
        this.bcxx = bcxx;
    }

    public String getZysx() {
        return zysx;
    }

    public void setZysx(String zysx) {
        this.zysx = zysx;
    }

    public String getQxxxms() {
        return qxxxms;
    }

    public void setQxxxms(String qxxxms) {
        this.qxxxms = qxxxms;
    }

    public String getLfcs() {
        return lfcs;
    }

    public void setLfcs(String lfcs) {
        this.lfcs = lfcs;
    }

    public String getJsmlsj() {
        return jsmlsj;
    }

    public void setJsmlsj(String jsmlsj) {
        this.jsmlsj = jsmlsj;
    }

    public String getCdsj() {
        return cdsj;
    }

    public void setCdsj(String cdsj) {
        this.cdsj = cdsj;
    }

    public String getDdxcsj() {
        return ddxcsj;
    }

    public void setDdxcsj(String ddxcsj) {
        this.ddxcsj = ddxcsj;
    }

    public String getZdzksj() {
        return zdzksj;
    }

    public void setZdzksj(String zdzksj) {
        this.zdzksj = zdzksj;
    }

    public String getDccssj() {
        return dccssj;
    }

    public void setDccssj(String dccssj) {
        this.dccssj = dccssj;
    }

    public String getHskzsj() {
        return hskzsj;
    }

    public void setHskzsj(String hskzsj) {
        this.hskzsj = hskzsj;
    }

    public String getJbpmsj() {
        return jbpmsj;
    }

    public void setJbpmsj(String jbpmsj) {
        this.jbpmsj = jbpmsj;
    }

    public String getGdsj() {
        return gdsj;
    }

    public void setGdsj(String gdsj) {
        this.gdsj = gdsj;
    }

    public String getRslc() {
        return rslc;
    }

    public void setRslc(String rslc) {
        this.rslc = rslc;
    }

    public String getZdyrs() {
        return zdyrs;
    }

    public void setZdyrs(String zdyrs) {
        this.zdyrs = zdyrs;
    }

    public String getCcrs() {
        return ccrs;
    }

    public void setCcrs(String ccrs) {
        this.ccrs = ccrs;
    }

    public String getSsrs() {
        return ssrs;
    }

    public void setSsrs(String ssrs) {
        this.ssrs = ssrs;
    }

    public String getJcrs() {
        return jcrs;
    }

    public void setJcrs(String jcrs) {
        this.jcrs = jcrs;
    }

    public String getQzswrs() {
        return qzswrs;
    }

    public void setQzswrs(String qzswrs) {
        this.qzswrs = qzswrs;
    }

    public String getBdswrs() {
        return bdswrs;
    }

    public void setBdswrs(String bdswrs) {
        this.bdswrs = bdswrs;
    }

    public String getZhyy() {
        return zhyy;
    }

    public void setZhyy(String zhyy) {
        this.zhyy = zhyy;
    }

    public String getSshrs() {
        return sshrs;
    }

    public void setSshrs(String sshrs) {
        this.sshrs = sshrs;
    }

    public String getBdssrs() {
        return bdssrs;
    }

    public void setBdssrs(String bdssrs) {
        this.bdssrs = bdssrs;
    }

    public String getRsmj() {
        return rsmj;
    }

    public void setRsmj(String rsmj) {
        this.rsmj = rsmj;
    }

    public String getBhmj() {
        return bhmj;
    }

    public void setBhmj(String bhmj) {
        this.bhmj = bhmj;
    }

    public String getCcss() {
        return ccss;
    }

    public void setCcss(String ccss) {
        this.ccss = ccss;
    }

    public String getZzbh() {
        return zzbh;
    }

    public void setZzbh(String zzbh) {
        this.zzbh = zzbh;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getAjztdm() {
        return ajztdm;
    }

    public void setAjztdm(String ajztdm) {
        this.ajztdm = ajztdm;
    }

    public String getAjxz() {
        return ajxz;
    }

    public void setAjxz(String ajxz) {
        this.ajxz = ajxz;
    }

    public String getHbzt() {
        return hbzt;
    }

    public void setHbzt(String hbzt) {
        this.hbzt = hbzt;
    }

    public String getZddwid() {
        return zddwid;
    }

    public void setZddwid(String zddwid) {
        this.zddwid = zddwid;
    }

    public String getRybgs() {
        return rybgs;
    }

    public void setRybgs(String rybgs) {
        this.rybgs = rybgs;
    }

    public String getJjyxm() {
        return jjyxm;
    }

    public void setJjyxm(String jjyxm) {
        this.jjyxm = jjyxm;
    }

    public String getZhcs() {
        return zhcs;
    }

    public void setZhcs(String zhcs) {
        this.zhcs = zhcs;
    }

    public String getHzsj() {
        return hzsj;
    }

    public void setHzsj(String hzsj) {
        this.hzsj = hzsj;
    }

    public String getXdsj() {
        return xdsj;
    }

    public void setXdsj(String xdsj) {
        this.xdsj = xdsj;
    }

    public String getJssj() {
        return jssj;
    }

    public void setJssj(String jssj) {
        this.jssj = jssj;
    }

    public String getBsxfjgdm() {
        return bsxfjgdm;
    }

    public void setBsxfjgdm(String bsxfjgdm) {
        this.bsxfjgdm = bsxfjgdm;
    }

    public String getZqlyxfjgdm() {
        return zqlyxfjgdm;
    }

    public void setZqlyxfjgdm(String zqlyxfjgdm) {
        this.zqlyxfjgdm = zqlyxfjgdm;
    }

    public String getSyxx() {
        return syxx;
    }

    public void setSyxx(String syxx) {
        this.syxx = syxx;
    }

    public String getJjts() {
        return jjts;
    }

    public void setJjts(String jjts) {
        this.jjts = jjts;
    }

    public String getPptz() {
        return pptz;
    }

    public void setPptz(String pptz) {
        this.pptz = pptz;
    }

    public String getZdmc() {
        return zdmc;
    }

    public void setZdmc(String zdmc) {
        this.zdmc = zdmc;
    }
}
