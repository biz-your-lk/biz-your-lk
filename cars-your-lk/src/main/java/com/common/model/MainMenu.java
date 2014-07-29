package com.common.model;

/**
 * Created by IntelliJ IDEA.
 * User: asankah
 * Date: 7/20/14
 * Time: 10:16 AM
 * To change this template use File | Settings | File Templates.
 */
public enum MainMenu {

    HOME("home"),
    BUY("buy"),
    SELL("sell"),
    REPAIR("repair");

    private String name;

    private MainMenu(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
