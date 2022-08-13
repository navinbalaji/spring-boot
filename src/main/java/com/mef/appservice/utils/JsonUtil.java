package com.mef.appservice.utils;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mef.appservice.controller.AdminController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static java.util.Objects.nonNull;

public class JsonUtil {

    private static final Logger logger = LogManager.getLogger(JsonUtil.class);

    ObjectMapper mapper = new ObjectMapper();
    public static String convertObjToJson(Object object) {

        ObjectMapper mapper = new ObjectMapper();
        String jsonInString = "";
        try {
            jsonInString = mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            logger.error("Error converting to JSON", e);
        }
        return jsonInString;
    }



    public static String populateObjectToJson(Object object) {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = null;
        try {
            jsonString = mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonString;
    }

}
