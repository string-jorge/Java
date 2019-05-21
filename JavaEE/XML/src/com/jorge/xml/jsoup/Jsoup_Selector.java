package com.jorge.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * selector选择器查询
 *      使用的方法:Elements select(String cssQuery)
 *          * 语法:参考Selector类中定义的语法
 */

public class Jsoup_Selector {

    public static void main(String[] args) throws IOException {
        String path = Jsoup_DocumentObject.class.getClassLoader().getResource("student.xml").getPath();

        Document document = Jsoup.parse(new File(path), "utf-8");

        //查询name标签
        Elements elements = document.select("name");
        System.out.println(elements);

        System.out.println("------------");

        //查询id值为jorge的元素
        Elements elements1 = document.select("#jorge");
        System.out.println(elements1);

        System.out.println("------------");

        //获取student标签number的属性值为s001的age的子标签
        Elements elements2 = document.select("student[number=\"s001\"] > age");
        System.out.println(elements2);
    }
}
