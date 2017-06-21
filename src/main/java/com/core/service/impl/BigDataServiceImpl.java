package com.core.service.impl;


import com.core.entity.Product;
import com.core.service.BigDataService;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/14.
 */
@Service
public class BigDataServiceImpl implements BigDataService {

   @Override
    public List<Product> resultData(String str) {
        String html=getData(str);
      //  String data=analysisData(html);
        List<Product> data=analysisData(html);
        return data;
    }

    @Override
    public String getData(String url) {
        CloseableHttpClient httpClient= HttpClients.createDefault();
        HttpGet httpGet=new HttpGet(url);
        httpGet.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; rv:6.0.2) Gecko/20100101 Firefox/6.0.2");
        try {
            CloseableHttpResponse response=httpClient.execute(httpGet);
            try {
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    return EntityUtils.toString(entity);
                }
            }finally {
                response.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public List<Product> analyData(String html) {
        List<Product> productList=new ArrayList<Product>();
        Product product=new Product();
        int beginIndex=0;
        int beginIndexSecond=0;
        int beginIndexThree=0;
        int endIndexSecond=0;
        int endIndexTree=0;
        int endIndex=0;
        int i=0;
        int adNum=0;
        int bestNum=0;

        String asin=null;
        String titleStr=null;
        String sellerName="";
        String price="";
        String customerReviews="";

        List<String > asinList=new ArrayList<String>();
        String contentStr=null;
        Document doc= Jsoup.parse(html);
        String mainContentStr=doc.toString();
        beginIndex=mainContentStr.indexOf("result_");
       // System.out.println("=========== mainContentStr========="+i+" = "+mainContentStr);
       while (beginIndex!=-1){
           beginIndexSecond=mainContentStr.indexOf("result_",beginIndex+2);
          // System.out.println("===========test beginIndex========= "+i+" = "+beginIndex);
          // System.out.println("===========test beginIndexSecond========="+i+" = "+beginIndexSecond);
           if(beginIndexSecond>0){
               contentStr=mainContentStr.substring(beginIndex,beginIndexSecond);
           }else {
               contentStr=mainContentStr.substring(beginIndex);
           }
           //System.out.println("===========test contentStr 是否有li========="+contentStr);
           endIndexSecond=contentStr.indexOf("</div></li>");
           //System.out.println("===========test endIndexSecond========="+endIndexSecond);
           contentStr=contentStr.substring(0,endIndexSecond);
          // System.out.println("=========== contentStr========="+contentStr);

           //*取得Asin*//*
           beginIndexSecond= contentStr.indexOf("data-asin=");
           beginIndexSecond=contentStr.indexOf(";",beginIndexSecond);
           //System.out.println("===========test data-asin beginIndexSecond========="+i+" = "+beginIndexSecond);
            endIndexSecond=contentStr.indexOf("\\",beginIndexSecond);
           //System.out.println("===========test  endIndexSecond========="+i+" = "+endIndexSecond);
            asin=contentStr.substring(beginIndexSecond+1,endIndexSecond);
        System.out.println("===========test asin========="+i+" = "+asin);

           //*判断是否广告,是则广告数adNum+1*//*

           if(contentStr.indexOf(">Sponsored<",endIndexSecond)>-1){
               adNum++;
           }

           //*判断是否best seller ,是则bestNum+1*//*
           if(contentStr.indexOf(">best Seller<",endIndexSecond)>-1){
               bestNum++;
           }

           /*找标题title里面可能有特殊广告，并没有详细我们要的参数，所以先给个判断;
           如果有，我们再找一里面的店名,价格,评论数等详细参数，如果没有就进行循环的下一次*/
           beginIndexSecond=contentStr.indexOf("title=",endIndexSecond);
           beginIndexSecond=contentStr.indexOf(";",beginIndexSecond);
           if(beginIndexSecond!=-1){
                endIndexSecond=contentStr.indexOf("\\",beginIndexSecond+5);
                titleStr=contentStr.substring(beginIndexSecond+1,endIndexSecond).replace("\"","");


               //*取店家名称*//*
               beginIndexSecond=contentStr.indexOf(">by",endIndexSecond);
               if(beginIndexSecond>-1){
                   beginIndexSecond=contentStr.indexOf("<span",beginIndexSecond);
                   beginIndexSecond=contentStr.indexOf(">",beginIndexSecond);
                   endIndexSecond=contentStr.indexOf("<",beginIndexSecond);
                   sellerName=contentStr.substring(beginIndexSecond+1,endIndexSecond);
               }else {
                   sellerName="";
               }

               //*取得价格*//*
               beginIndexSecond=contentStr.indexOf("span aria",endIndexSecond);
               if(beginIndexSecond>-1){//正常出现的形式<span aria-label="\&quot;$19.99\&quot;"
                   beginIndexSecond=contentStr.indexOf(";",beginIndexSecond);
                   endIndexSecond=contentStr.indexOf("\\",beginIndexSecond);
                   price=contentStr.substring(beginIndexSecond+1,endIndexSecond);
               }else {//特殊情况处理
                   beginIndexThree=contentStr.indexOf("\\"+"\">$");
                   if(beginIndexThree>-1){
                       beginIndexThree=contentStr.indexOf(">",beginIndexThree-3);
                       System.out.println("===========beginIndexThree = "+beginIndexThree);

                       endIndexTree=contentStr.indexOf("<",beginIndexThree);
                       System.out.println("=========== endIndexTree"+endIndexTree);
                       price=contentStr.substring(beginIndexThree+1,endIndexTree);
                   }else {
                       price="";
                   }
               }

               //*取得评论数*//*
               beginIndexSecond=contentStr.indexOf("customerReviews",endIndexSecond);
               if(beginIndexSecond>-1){
                   beginIndexSecond=contentStr.indexOf(">",beginIndexSecond);
                   endIndexSecond=contentStr.indexOf("<",beginIndexSecond);
                   customerReviews=contentStr.substring(beginIndexSecond+1,endIndexSecond);
               }else {
                   customerReviews="";
               }
            }
           System.out.println("===========test titleStr ========="+i+" = "+titleStr);
           System.out.println("===========adNum= "+adNum+" bestNum= "+bestNum);
           System.out.println("===========sellerName= "+sellerName+" price= "+price+" customerReviews= "+customerReviews);
           product=new Product();
           product.setAdNum(adNum);
           product.setBestNum(bestNum);
           product.setAsin(asin);
           product.setTitleStr(titleStr);
           product.setSellerName(sellerName);
           product.setPrice(price);
           product.setCustomerReviews(customerReviews);
           productList.add(product);

          asinList.add(contentStr);
            beginIndex=mainContentStr.indexOf("result_",beginIndex+10);
           //System.out.println("===========test beginIndex end========="+i+" = "+beginIndex);
           i++;
        }
       // System.out.println("===========test ========="+asinList.toString());

        return productList;
    }
    @Override
    public List<Product> analysisData(String html) {
        System.out.println("===========开始执行analysis方法=========");
        List<Product> productList=new ArrayList<Product>();
        Product product=new Product();
        int beginIndex=0;
        int beginIndexSecond=0;
        int beginIndexThree=0;
        int endIndexSecond=0;
        int endIndexTree=0;
        int endIndex=0;
        int i=0;
        int adNum=0;
        int bestNum=0;

        int second=0;
        int secondNext=0;
        int secondEnd=0;
        int secondEndNext=0;

        String asin=null;
        String titleStr=null;
        String sellerName="";
        String price="";
        String customerReviews="";

        List<String > asinList=new ArrayList<String>();
        String contentStr=null;
        Document doc=Jsoup.parse(html);
        String mainContentStr=doc.toString();
        mainContentStr=mainContentStr.substring(0,mainContentStr.indexOf("<!--"+"\\n"));
        beginIndex=mainContentStr.indexOf("result_");
        // System.out.println("=========== mainContentStr========="+i+" = "+mainContentStr);
        while (beginIndex!=-1){
            beginIndexSecond=mainContentStr.indexOf("result_",beginIndex+2);
            // System.out.println("===========test beginIndex========= "+i+" = "+beginIndex);
            // System.out.println("===========test beginIndexSecond========="+i+" = "+beginIndexSecond);
            if(beginIndexSecond>0){
                contentStr=mainContentStr.substring(beginIndex,beginIndexSecond);
            }else {
                contentStr=mainContentStr.substring(beginIndex);
            }
            //System.out.println("===========test contentStr 是否有li========="+contentStr);
            endIndexSecond=contentStr.indexOf("</div></li>");
            //System.out.println("===========test endIndexSecond========="+endIndexSecond);
            contentStr=contentStr.substring(0,endIndexSecond);
           // System.out.println("=========== contentStr========="+contentStr);

           //*取得Asin*//*
            beginIndexSecond= contentStr.indexOf("data-asin=");
            beginIndexSecond=contentStr.indexOf(";",beginIndexSecond);
            //System.out.println("===========test data-asin beginIndexSecond========="+i+" = "+beginIndexSecond);
            endIndexSecond=contentStr.indexOf("\\",beginIndexSecond);
            //System.out.println("===========test  endIndexSecond========="+i+" = "+endIndexSecond);
            asin=contentStr.substring(beginIndexSecond+1,endIndexSecond);
            System.out.println("===========test asin========="+i+" = "+asin);

           //*判断是否广告,是则广告数adNum+1*//*

            if(contentStr.indexOf(">Sponsored<",endIndexSecond)>-1){
                adNum++;
            }

           //*判断是否best seller ,是则bestNum+1*//*
            if(contentStr.indexOf(">best Seller<",endIndexSecond)>-1){
                bestNum++;
            }

           /*找标题title里面可能有特殊广告，并没有详细我们要的参数，所以先给个判断;
           如果有，我们再找一里面的店名,价格,评论数等详细参数，如果没有就进行循环的下一次*/
            beginIndexSecond=contentStr.indexOf("title=",endIndexSecond);
            beginIndexSecond=contentStr.indexOf(";",beginIndexSecond);
            if(beginIndexSecond!=-1){
                endIndexSecond=contentStr.indexOf("\\",beginIndexSecond+5);
                titleStr=contentStr.substring(beginIndexSecond+1,endIndexSecond).replace("\"","");


               //*取店家名称*//*
                beginIndexSecond=contentStr.indexOf(">by",endIndexSecond);
                if(beginIndexSecond>-1){
                    beginIndexSecond=contentStr.indexOf("<span",beginIndexSecond);
                    beginIndexSecond=contentStr.indexOf(">",beginIndexSecond);
                    endIndexSecond=contentStr.indexOf("<",beginIndexSecond);
                    sellerName=contentStr.substring(beginIndexSecond+1,endIndexSecond);
                }else {
                    sellerName="";
                }

               //*取得价格*//*
                beginIndexSecond=contentStr.indexOf("span aria",endIndexSecond);
                if(beginIndexSecond>-1){//正常出现的形式<span aria-label="\&quot;$19.99\&quot;"
                    beginIndexSecond=contentStr.indexOf(";",beginIndexSecond);
                    endIndexSecond=contentStr.indexOf("\\",beginIndexSecond);
                    price=contentStr.substring(beginIndexSecond+1,endIndexSecond);
                }else {//特殊情况处理
                    beginIndexThree=contentStr.indexOf("\\"+"\">$");
                    if(beginIndexThree>-1){
                        beginIndexThree=contentStr.indexOf(">",beginIndexThree-3);
                        System.out.println("===========beginIndexThree = "+beginIndexThree);

                        endIndexTree=contentStr.indexOf("<",beginIndexThree);
                        System.out.println("=========== endIndexTree"+endIndexTree);
                        price=contentStr.substring(beginIndexThree+1,endIndexTree);
                    }else {
                        price="";
                    }
                }

               //*取得评论数*//*
                beginIndexSecond=contentStr.indexOf("customerReviews",endIndexSecond);
                if(beginIndexSecond>-1){
                    beginIndexSecond=contentStr.indexOf(">",beginIndexSecond);
                    endIndexSecond=contentStr.indexOf("<",beginIndexSecond);
                    customerReviews=contentStr.substring(beginIndexSecond+1,endIndexSecond);
                }else {
                    customerReviews="";
                }
            }
            System.out.println("===========test titleStr ========="+i+" = "+titleStr);
            System.out.println("===========adNum= "+adNum+" bestNum= "+bestNum);
            System.out.println("===========sellerName= "+sellerName+" price= "+price+" customerReviews= "+customerReviews);
            product=new Product();
            product.setAdNum(adNum);
            product.setBestNum(bestNum);
            product.setAsin(asin);
            product.setTitleStr(titleStr);
            product.setSellerName(sellerName);
            product.setPrice(price);
            product.setCustomerReviews(customerReviews);
            productList.add(product);

            asinList.add(contentStr);
            beginIndex=mainContentStr.indexOf("result_",beginIndex+10);
            System.out.println("===========test beginIndex end========="+i+" = "+beginIndex);
            i++;
        }


        //*后面的隐藏部分的html格式不同,单独解析*//*
        //取得包含result_部分html

        second=doc.toString().indexOf("<!--"+"\\n");
      int mainEnd=doc.toString().indexOf("-->"+"\\n",second);
        System.out.println("=========== secondsecond========="+second);
        System.out.println("=========== mainEndmainEnd========="+mainEnd);
        mainContentStr=doc.toString().substring(second,mainEnd);
        second=mainContentStr.indexOf("result_");
        while (second>-1){
            secondEnd=mainContentStr.indexOf("result_",second+2);
            if(secondEnd>-1){
                contentStr=mainContentStr.substring(second,secondEnd);
            }else {
                contentStr=mainContentStr.substring(second);
            }
           // System.out.println("=========== contentStr========="+contentStr);

           //*取得Asin*//*
            secondNext= contentStr.indexOf("data-asin=");
            secondNext=contentStr.indexOf("\"",secondNext);
            secondEnd=contentStr.indexOf("\\",secondNext);
            asin=contentStr.substring(secondNext+1,secondEnd);
            System.out.println("===========second asin========="+i+" = "+asin);

           //*判断是否广告,是则广告数adNum+1*//*

            if(contentStr.indexOf(">Sponsored<",secondEnd)>-1){
                adNum++;
            }

           //*判断是否best seller ,是则bestNum+1*//*
            if(contentStr.indexOf(">best Seller<",secondEnd)>-1){
                bestNum++;
            }

           /*找标题title里面可能有特殊广告，并没有详细我们要的参数，所以先给个判断;
           如果有，我们再找一里面的店名,价格,评论数等详细参数，如果没有就进行循环的下一次*/
            secondNext=contentStr.indexOf("title=",secondNext);
            secondNext=contentStr.indexOf("\"",secondNext);
            if(secondNext>-1){
                secondEnd=contentStr.indexOf("\\",secondNext+5);
                titleStr=contentStr.substring(secondNext+1,secondEnd);


               //*取店家名称*//*
                secondNext=contentStr.indexOf(">by",secondEnd);
                if(secondNext>-1){
                    secondNext=contentStr.indexOf("<span",secondNext);
                    secondNext=contentStr.indexOf(">",secondNext);
                    secondEnd=contentStr.indexOf("<",secondNext);
                    sellerName=contentStr.substring(secondNext+1,secondEnd);
                }else {
                    sellerName="";
                }

               //*取得价格*//*
                secondNext=contentStr.indexOf("span aria",secondEnd);
                if(secondNext>-1){//正常出现的形式<span aria-label="\&quot;$19.99\&quot;"
                    secondNext=contentStr.indexOf("\"",secondNext);
                    secondEnd=contentStr.indexOf("\\",secondNext);
                    price=contentStr.substring(secondNext+1,secondEnd);
                }else {//特殊情况处理
                    secondNext=contentStr.indexOf("\\"+"\">$");
                    if(secondNext>-1){
                        secondNext=contentStr.indexOf(">",secondNext-3);
                        System.out.println("===========secondNext = "+secondNext);

                        secondEndNext=contentStr.indexOf("<",secondNext);
                        System.out.println("=========== secondEndNext"+secondEndNext);
                        price=contentStr.substring(secondNext+1,secondEndNext);
                    }else {
                        price="";
                    }
                }

               //*取得评论数*//*
                secondNext=contentStr.indexOf("customerReviews",secondNext);
                if(secondNext>-1){
                    secondNext=contentStr.indexOf(">",secondNext);
                    secondEnd=contentStr.indexOf("<",secondNext);
                    customerReviews=contentStr.substring(secondNext+1,secondEnd);
                }else {
                    customerReviews="";
                }
            }
            System.out.println("===========test titleStr ========="+i+" = "+titleStr);
            System.out.println("===========adNum= "+adNum+" bestNum= "+bestNum);
            System.out.println("===========sellerName= "+sellerName+" price= "+price+" customerReviews= "+customerReviews);
            product=new Product();
            product.setAdNum(adNum);
            product.setBestNum(bestNum);
            product.setAsin(asin);
            product.setTitleStr(titleStr);
            product.setSellerName(sellerName);
            product.setPrice(price);
            product.setCustomerReviews(customerReviews);
            productList.add(product);


            second=mainContentStr.indexOf("result_",second+10);
            //System.out.println("===========test beginIndex end========="+i+" = "+beginIndex);
            i++;
            //*second=mainContentStr.indexOf("<!--\\n");
            if(second>-1){
                beginIndex=-1;
            }//*
        }
        // System.out.println("===========test ========="+asinList.toString());

        return productList;
    }
}
