package com.jhon.rain.dao.dto;

public class HdActionPredefDTO
{
    private String name;

    private Integer type;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getType()
    {
        return type;
    }

    public void setType(Integer type)
    {
        this.type = type;
    }

    public HdActionPredefDTO()
    {}

    public HdActionPredefDTO(String name, Integer type)
    {
        super();
        this.name = name;
        this.type = type;
    }

}
