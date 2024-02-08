package com.fall23.ui.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //класс Properties предназначен для доступа к файлу с расширением properties,
    //где хранятся данные в виде ключ и значение
    private static Properties properties;
    private ConfigReader(){
        //Singleton --> паттерн
        //Singleton-класс одиночка, указали конструктор private,чтобы не создавать объект
        // данного класса
    }
    //Из-за того, что не создаем экземпляр класса т.е. объект не можем создать, все методы
    //в этом классе должны быть статичными, чтобы могли вызвать их через названия класса.

    static {
        try{//Copy Path путь к файлу application.properties--> path from content root
            String path = "src/main/resources/application.properties";
            //считывает файл application.properties
            FileInputStream inputStream =new FileInputStream(path);
            // создали объект данного класса, проинициализировали
            properties = new Properties();
           //загружаем все,что содержит этот файл
            properties.load(inputStream);
            //закрываем поток или файл
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException("File not found");
        }
    }

    public static String getValue(String key){
        //по названию ключа будем получать значение из файла application.properties
        return properties.getProperty(key).trim();
    }

    public static void main(String[] args) {
        System.out.println(getValue("browser"));
    }
}
