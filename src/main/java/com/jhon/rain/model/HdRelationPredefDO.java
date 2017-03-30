package com.jhon.rain.model;

public class HdRelationPredefDO {
    private Long id;

    private Long interactionScenarioId;

    private String name;

    private String actionPredefList;

    private String thresholdConditionPredefList;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInteractionScenarioId() {
        return interactionScenarioId;
    }

    public void setInteractionScenarioId(Long interactionScenarioId) {
        this.interactionScenarioId = interactionScenarioId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActionPredefList() {
        return actionPredefList;
    }

    public void setActionPredefList(String actionPredefList) {
        this.actionPredefList = actionPredefList;
    }

    public String getThresholdConditionPredefList() {
        return thresholdConditionPredefList;
    }

    public void setThresholdConditionPredefList(String thresholdConditionPredefList) {
        this.thresholdConditionPredefList = thresholdConditionPredefList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}