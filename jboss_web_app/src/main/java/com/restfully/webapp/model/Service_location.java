package com.restfully.webapp.model;

/**
 *
 * @author 2015 Andrey Kolchev mailto: andreykolchev@gmail.com
 */
public class Service_location {

    public int id;
    public int language_id;
    public int city_id;
    public String name;

    public Service_location(int id, int language_id, int city_id, String name) {
        this.id = id;
        this.language_id = language_id;
        this.city_id = city_id;
        this.name = name;
    }

    public String toJsonString() {
        String JsonString;
        JsonString = "";
        if (id != 0)
        {JsonString = JsonString + "\"id\":" + id;}
        if (language_id != 0)
            {if (!(JsonString.equals("")))
            {JsonString = JsonString + ",";}
            JsonString = JsonString + "\"language_id\":" + language_id;}
        if (city_id != 0)
            {if (!(JsonString.equals("")))
            {JsonString = JsonString + ",";}
            JsonString = JsonString + "\"city_id\":" + city_id;}
        if (!(JsonString.equals("")))
            {JsonString = JsonString + ",";}
        JsonString = JsonString + "\"name\":\"" + name + "\"";
        return ("{"+JsonString+"}");
    }

}