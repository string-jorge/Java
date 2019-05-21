package com.jorge.xml.jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * XPath:即为XML路径语言,它是一种用来确定XML(标准通用标记语言的子集)文档中某部分位置的语言
 *      使用Jsoup的XPath需要额外导入jar包
 *      查询w3cshllo参考手册,使用XPath的语法完成查询
 */

public class Jsoup_XPath {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {

        String path = Jsoup_DocumentObject.class.getClassLoader().getResource("student.xml").getPath();

        Document document = Jsoup.parse(new File(path), "utf-8");

        //根据document对象,创建JXDocument对象
        JXDocument jxDocument = new JXDocument(document);

        //结合XPath的语法查询
        //查询所有的student标签
        List<JXNode> jxNodes = jxDocument.selN("//student");
        for (JXNode jxNode : jxNodes) {
            System.out.println(jxNode);
        }

        System.out.println("------------");
        //查询student标签下的name标签
        List<JXNode> jxNodes2 = jxDocument.selN("//student/name");
        for (JXNode jxNode : jxNodes2) {
            System.out.println(jxNode);
        }

        System.out.println("------------");
        //查询student标签下带有id属性的name标签
        List<JXNode> jxNodes3 = jxDocument.selN("//student/name[@id]");
        for (JXNode jxNode : jxNodes3) {
            System.out.println(jxNode);
        }

        System.out.println("------------");

        //查询student标签下带有id属性的name标签,并且id属性值为jorge

        List<JXNode> jxNodes4 = jxDocument.selN("//student/name[@id='jorge']");
        for (JXNode jxNode : jxNodes4) {
            System.out.println(jxNode);
        }
    }
}
