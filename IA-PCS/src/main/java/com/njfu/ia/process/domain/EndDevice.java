package com.njfu.ia.process.domain;

/**
 * 设备终端
 */
public class EndDevice {

    /**
     * 终端编号
     */
    private Integer id;

    /**
     * 终端型号
     */
    private String model;

    /**
     * 终端mac地址
     */
    private String mac;

    /**
     * 所属区块编号
     */
    private Integer sectionId;

    /**
     * 终端使用状态：0，未使用；1，使用中；2：故障中
     */
    private Integer useStatus;

    public EndDevice() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public Integer getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(Integer useStatus) {
        this.useStatus = useStatus;
    }

    @Override
    public String toString() {
        return "EndDevice{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", mac='" + mac + '\'' +
                ", sectionId=" + sectionId +
                ", useStatus=" + useStatus +
                '}';
    }
}