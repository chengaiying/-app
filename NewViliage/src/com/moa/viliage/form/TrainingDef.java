package com.moa.viliage.form;


public class TrainingDef {
	public String trainingId;
	public String trainingTime;
	public String trainingName;
	public String trainingStatus;
	public String regionId;
	public String userId;
	
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public TrainingDef(){
		
		
	}
	
	public String getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(String trainingId) {
		this.trainingId = trainingId;
	}

	public String getTrainingTime() {
		return trainingTime;
	}

	public void setTrainingTime(String trainingTime) {
		this.trainingTime = trainingTime;
	}

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	public String getTrainingStatus() {
		return trainingStatus;
	}

	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}

	public TrainingDef(String trainingId,String trainingTime,String trainingName,String trainingStatus){
		
		this.trainingId=trainingId;
		this.trainingTime=trainingTime;
		this.trainingName=trainingName;
		this.trainingStatus=trainingStatus;
		
	}
	
	public String toString(){
		String str="trainingId="+trainingId+",trainingTime="+trainingTime+",trainingName="+trainingName+",trainingStatus="+trainingStatus;
		return str;
	}

}
