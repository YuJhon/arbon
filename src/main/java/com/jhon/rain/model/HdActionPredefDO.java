package com.jhon.rain.model;

public class HdActionPredefDO {
    private Long id;

    private String name;

    private Integer type;

    private String rulePredefList;

    private String ruleConditionPredefList;

    private String actionSettingsPredefList;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getRulePredefList() {
        return rulePredefList;
    }

    public void setRulePredefList(String rulePredefList) {
        this.rulePredefList = rulePredefList;
    }

    public String getRuleConditionPredefList() {
        return ruleConditionPredefList;
    }

    public void setRuleConditionPredefList(String ruleConditionPredefList) {
        this.ruleConditionPredefList = ruleConditionPredefList;
    }

    public String getActionSettingsPredefList() {
        return actionSettingsPredefList;
    }

    public void setActionSettingsPredefList(String actionSettingsPredefList) {
        this.actionSettingsPredefList = actionSettingsPredefList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}