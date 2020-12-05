package com.kangaroo.firstspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Air {

  private long id;
  private long districtId;
  private java.sql.Date monitorTime;
  private long pm10;
  private long pm25;
  private String monitoringStation;
  private java.sql.Date lastNodifyTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getDistrictId() {
    return districtId;
  }

  public void setDistrictId(long districtId) {
    this.districtId = districtId;
  }


  public java.sql.Date getMonitorTime() {
    return monitorTime;
  }

  public void setMonitorTime(java.sql.Date monitorTime) {
    this.monitorTime = monitorTime;
  }


  public long getPm10() {
    return pm10;
  }

  public void setPm10(long pm10) {
    this.pm10 = pm10;
  }


  public long getPm25() {
    return pm25;
  }

  public void setPm25(long pm25) {
    this.pm25 = pm25;
  }


  public String getMonitoringStation() {
    return monitoringStation;
  }

  public void setMonitoringStation(String monitoringStation) {
    this.monitoringStation = monitoringStation;
  }


  public java.sql.Date getLastNodifyTime() {
    return lastNodifyTime;
  }

  public void setLastNodifyTime(java.sql.Date lastNodifyTime) {
    this.lastNodifyTime = lastNodifyTime;
  }


}
