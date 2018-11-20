package com.summer.left.sakila.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

@RestController
@RequestMapping("generate")
public class DataGenerationController {

    @RequestMapping(value = {"/customer"}, produces = "application/json;charset=utf-8", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public HashMap register() throws IOException {
        int generateCount = 2;

        try {
            File file = new File("customer.txt");
            FileWriter fileWriter =new FileWriter(file);
            if(file.exists()){
                fileWriter.write("");
            }else {
                file.createNewFile();
            }
            for (int i = 0; i < generateCount; i++) {
                fileWriter.write(String.valueOf(i));
            }
            fileWriter.flush();
            fileWriter.close();
        }catch (IOException e){
            throw e;
        }

        HashMap resultMap = new  HashMap<String,Integer>();
        resultMap.put("result",1);
        return resultMap;

    }

}
