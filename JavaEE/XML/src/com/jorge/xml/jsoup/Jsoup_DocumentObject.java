package com.jorge.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * Document对象
 *      获取Element对象
 *          * getElementById​(String id)：根据id属性值获取唯一的element对象
 *          * getElementsByTag​(String tagName)：根据标签名称获取元素对象集合
 *          * getElementsByAttribute​(String key)：根据属性名称获取元素对象集合
 *          * getElementsByAttributeValue​(String key, String value)：根据对应的属性名和属性值获取元素对象集合
 */

public class Jsoup_DocumentObject {
    public static void main(String[] args) throws IOException {

        String path = Jsoup_DocumentObject.class.getClassLoader().getResource("student.xml").getPath();

        Document document = Jsoup.parse(new File(path), "utf-8");

        //3.1获取所有student对象
        Elements elements = document.getElementsByTag("student");
        System.out.println(elements);

        System.out.println("---------------");

        //3.2获取属性名为id的元素们
        Elements elements1 = document.getElementsByAttribute("id");
        System.out.println(elements1);

        System.out.println("---------------");

        //3.3获取number属性值为s001的元素对象
        Elements elements2 = document.getElementsByAttributeValue("number", "s001");
        System.out.println(elements2);

        System.out.println("---------------");

        //3.4获取id属性值的元素对象
        Element element = document.getElementById("jorge");
        System.out.println(element);
    }
}
