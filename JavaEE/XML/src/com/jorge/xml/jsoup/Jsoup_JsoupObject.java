package com.jorge.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;

/**
 * Jsoup:工具类对象功能
 */

public class Jsoup_JsoupObject {

    public static void main(String[] args) throws IOException {
        //2.1获取student.xml的path
        //1.parse (File in,String charseName):解析xml或者html文件
        String path = Jsoup_JsoupObject.class.getClassLoader().getResource("student.xml").getPath();
        //2.2解析xml文档,加载文档进内存,获取DOM树--->Document
        /*Document document = Jsoup.parse(new File(path), "utf-8");
        System.out.println(document);*/

        //2.parse (String html):解析xml或者html字符串
        /*String str = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<students>\n" +
                "\t<student number=\"s001\">\n" +
                "\t\t<name>张三</name>\n" +
                "\t\t<age>23</age>\n" +
                "\t\t<sex>男</sex>\n" +
                "\t</student>\n" +
                "\n" +
                "\t<student number=\"s002\">\n" +
                "\t\t<name>张三</name>\n" +
                "\t\t<age>23</age>\n" +
                "\t\t<sex>女</sex>\n" +
                "\t</student>\n" +
                "\n" +
                "</students>";
        Document document = Jsoup.parse(str);
        System.out.println(document);*/


        //3.parse(URL url,int timeoutMillis):通过网络路径获取指定的html或者xml的文档对象
        URL url = new URL("https://www.baidu.com");//代表网络中的一个资源路径
        Document document = Jsoup.parse(url,10000);
        System.out.println(document);
    }
}
