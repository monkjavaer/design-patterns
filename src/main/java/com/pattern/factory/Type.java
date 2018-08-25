package com.pattern.factory;

/**
 *
 * @author tangquanbin
 * @date 2018/08/25 21:41
 */
public enum Type {
    /**
     * 芝士
     */
    cheese("cheese","芝士"),

    /**
     *捞蛤
     */
    clam("clam","捞蛤");

    public String name;
    public String description;

    Type(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
