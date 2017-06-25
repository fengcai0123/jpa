package com.core.controller;

import com.alibaba.fastjson.JSONObject;
import com.core.entity.*;
import com.core.service.*;
import com.core.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by yonghuo.chen on 17/6/1.
 */
@Controller
@RequestMapping("/data")
public class DataController {

   // @Autowired
   // private BigDataService dataIndexService;
    @Autowired
    private GoodService goodService;
    @Autowired
    private BsrService bsrservice;
    @Autowired
    private CommentService commentservice;
    @Autowired
    private InventoryService inventoryService;
    @Autowired
    private PriceService priceservice;
    @Autowired
    private SellService sellService;

  /*  @RequestMapping(value = "index", method = RequestMethod.GET)
    public String getIndexData(Model model){
        String url="https://www.amazon.com/mn/search/ajax/ref=sr_pg_2?fst=p90x:1&rh=i:aps,k:capacitor&page=2&keywords=capacitor&ie=UTF8";
        List<Product> dataList=dataIndexService.resultData(url);
        model.addAttribute("dataList",dataList);
       // System.out.println("dataHtml=============="+dataHtm);
        sellService.getAll();
        goodService.getAll();
        return "dataIndex";
    }*/

    @RequestMapping("goodList")
    public String list(Model model){
        List<Good>goodList=goodService.getAll();
        model.addAttribute("goodList",goodList);
        return "goodList";
    }

    //*根据asin查询商品是否存在*//*
    @RequestMapping("findAsin")
    @ResponseBody
    public String findGoodAsin(@RequestParam String asin){
        String  goodId=goodService.findGoodIdByAsin(asin);
        return goodId;
    }

    @RequestMapping("updateAsin")
    @ResponseBody
    public  String findAsinListByAsinStatus(@RequestParam("status") String status){
        System.out.println("status=="+status);
        List<String> asinList=goodService.findAsinByAsinStatus(Integer.parseInt(status));
        if(asinList.size()>0){
            asinList.toString();
            System.out.println("asinList.toString()"+asinList.toString());
            return  asinList.toString();
        }else {
            return "0";
        }
    }

/*
    //*根据返回商品asin判断不存在则添加商品,存在则更新商品*//*
    @RequestMapping("updateGood")
    public String UpdateByAsin(@RequestParam String asin){
        int goodId=goodService.findGoodIdByAsin(asin);
        return "";
    }*/



    @RequestMapping(value = "addJson", method = RequestMethod.POST)
    public String addGoodByJson(@RequestBody String result) {

        Date time= new java.sql.Date(new java.util.Date().getTime());
        System.out.println("dataController 取得的前台ajax提交的json字符串格式数据="+result);
        Good good=new Good();
        Bsr bsr =new Bsr();
        Comment comment=new Comment();
        Inventory inventory=new Inventory();
        Price price=new Price();
        Sell sell=new Sell();

        JSONObject job=new JSONObject();
        // 页面传过来的是json对象,用次方式解析
        Map<String,Object> map= (Map<String, Object>) job.parse(result);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = sdf.parse(String.valueOf(map.get("saleTime")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        good.setSaleTime(date);
        good.setUpdateTime(time);
        good.setAsin(String.valueOf(map.get("asin")));
        good.setBrank(String.valueOf(map.get("brank")));
        good.setDisPatching(String.valueOf(map.get("disPatching")));
        good.setImgUrl(String.valueOf(map.get("imgUrl")));

        good.setName(String.valueOf(map.get("name")));
        good.setRankNum(Integer.parseInt(String.valueOf(map.get("rankNum"))));
        good.setSellerName(String.valueOf(map.get("sellerName")));
        good.setSize(String.valueOf(map.get("size")));
        good.setStandard(String.valueOf(map.get("standard")));
        good.setColor(String.valueOf(map.get("color")));
        good.setAnswerNum(Integer.parseInt(String.valueOf(map.get("answerNum"))));

        good.setTotalSellNum(Integer.parseInt(String.valueOf(map.get("totalSellNum"))));
        good.setWeight(Float.parseFloat(String.valueOf(map.get("weight"))));
        good.setTransportWeight(Float.parseFloat(String.valueOf(map.get("transportWeight"))));

        System.out.println("map.get(\"asin\"): " + String.valueOf(map.get("asin")));

        /*设置asinStatus状态为1,表示该商品刚刚添加*/
        good.setAsinStatus(1);

        goodService.insert(good);

        bsr.setBsrNum(Integer.parseInt(String.valueOf(map.get("bsrNum"))));
        bsr.setDate(time);
        bsr.setGood(good);
        bsrservice.insert(bsr);

        comment.setDate(time);
        comment.setCommentScore(Float.parseFloat(String.valueOf(map.get("commentScore"))));
        comment.setFiveStar(String.valueOf(map.get("fourStar")));
        comment.setFourStar(String.valueOf(map.get("fourStar")));
        comment.setThreeStar(String.valueOf(map.get("threeStar")));
        comment.setTwoStar(String.valueOf(map.get("twoStar")));
        comment.setOneStar(String.valueOf(map.get("oneStar")));
        comment.setTotalCommentNum(Integer.parseInt(String.valueOf(map.get("totalCommentNum"))));
        comment.setGood(good);
        commentservice.insert(comment);

        inventory.setInventoryNum(Integer.parseInt(String.valueOf(map.get("inventoryNum"))));
        inventory.setDate(time);
        inventory.setGood(good);
        inventoryService.insert(inventory);

        price.setDate(time);
        price.setSellPrice(Float.parseFloat(String.valueOf(map.get("sellPrice"))));
        price.setShopPrice(Float.parseFloat(String.valueOf(map.get("shopPrice"))));
        price.setGood(good);
        priceservice.insert(price);

        sell.setDate(time);
        sell.setSellNum(Integer.parseInt(String.valueOf(map.get("sellNum"))));
        sell.setGood(good);
        sellService.insert(sell);

        return "redirect:/data/goodList";
    }

@RequestMapping(value = "addJsonList", method = RequestMethod.POST)
    public String addGoodByJsonList(@RequestBody String result) {

        System.out.println("dataController 取得的前台ajax提交的json字符串格式数据="+result);
        Good goodResult=new Good();
        Bsr bsrResult =new Bsr();
        Comment commentResult=new Comment();
        Inventory inventoryResult=new Inventory();
        Price priceResult=new Price();
        Sell sellResult=new Sell();

        Date time= new java.sql.Date(new java.util.Date().getTime());
      //  goodResult.setAddTime(time);


        System.out.println("goodResult_.getAsin(): " + goodResult.getAsin());
        System.out.println("bsrResult.getBsrNum(): " + bsrResult.getBsrNum());
        System.out.println("commentResult.getCommentScore(): " + commentResult.getCommentScore());
        System.out.println("inventoryResult.getInventoryNum(): " + inventoryResult.getInventoryNum());
        System.out.println("priceResult.getSellPrice(): " + priceResult.getSellPrice());
        System.out.println("sellResult.getSellNum(): " + sellResult.getSellNum());


        //goodService.insert(goodResult);
        bsrResult.setDate(time);
        bsrResult.setGood(goodResult);

        commentResult.setDate(time);
        commentResult.setGood(goodResult);

        inventoryResult.setDate(time);
        inventoryResult.setGood(goodResult);

        priceResult.setDate(time);
        priceResult.setGood(goodResult);

        sellResult.setDate(time);
        sellResult.setGood(goodResult);

        /*bsrservice.insert(bsrResult);
        commentservice.insert(commentResult);
        inventoryService.insert(inventoryResult);
        priceservice.insert(priceResult);
        sellService.insert(sellResult);*/

        return "redirect:/data/goodList";
    }

    @RequestMapping(value = "addByForm", method = RequestMethod.POST)
    public String addGoodByForm(@RequestParam(value = "asin",required = true)String asin,
                        @RequestParam(value = "brank",required = true) String brank,
                        @RequestParam(value = "disPatching",required = true)String disPatching,
                        @RequestParam(value = "imgUrl",required = true)String imgUrl,
                        @RequestParam(value = "name",required = true) String name,
                        @RequestParam(value = "rankNum",required = true)String rankNum,
                        @RequestParam(value = "sellerName",required = true) String sellerName,
                        @RequestParam(value = "size",required = true)String size,
                        @RequestParam(value = "totalSellNum",required = true)String totalSellNum,
                        @RequestParam(value = "weight",required = true) String weight,
                          @RequestParam(value = "transportWeight",required = true) String transportWeight,

                          @RequestParam(value = "bsrNum",required = true)String bsrNum,
                          @RequestParam(value = "commentScore",required = true) String commentScore,
                          @RequestParam(value = "totalCommentNum",required = true)String totalCommentNum,
                          @RequestParam(value = "fiveStar",required = true)String fiveStar,
                          @RequestParam(value = "fourStar",required = true) String fourStar,
                          @RequestParam(value = "threeStar",required = true)String threeStar,
                          @RequestParam(value = "twoStar",required = true) String twoStar,
                          @RequestParam(value = "oneStar",required = true)String oneStar,

                          @RequestParam(value = "inventoryNum",required = true) String inventoryNum,
                          @RequestParam(value = "sellPrice",required = true)String sellPrice,
                          @RequestParam(value = "shopPrice",required = true)String shopPrice,
                          @RequestParam(value = "sellNum",required = true) String sellNum ) {
        Good good=new Good();
        Bsr bsr =new Bsr();
        Comment comment=new Comment();
        Inventory inventory=new Inventory();
        Price price=new Price();
        Sell sell=new Sell();

        Date time= new java.sql.Date(new java.util.Date().getTime());
     //   good.setAddTime(time);
        good.setAsin(asin);
        good.setBrank(brank);
        good.setDisPatching(disPatching);
        good.setImgUrl(imgUrl);

        good.setName(name);
        good.setRankNum(Integer.parseInt(rankNum));
        good.setSellerName(sellerName);
        good.setSize(size);

        good.setTotalSellNum(Integer.parseInt(totalSellNum));
        good.setWeight(Float.parseFloat(weight));
        good.setTransportWeight(Float.parseFloat(transportWeight));

        System.out.println("asin: " + asin);


        goodService.insert(good);

        bsr.setBsrNum(Integer.parseInt(bsrNum));
        bsr.setDate(time);
        bsr.setGood(good);
        bsrservice.insert(bsr);

        comment.setDate(time);
        comment.setCommentScore(Float.parseFloat(commentScore));
        comment.setFiveStar(fiveStar);
        comment.setFourStar(fourStar);
        comment.setThreeStar(threeStar);
        comment.setTwoStar(twoStar);
        comment.setOneStar(oneStar);
        comment.setTotalCommentNum(Integer.parseInt(totalCommentNum));
        comment.setGood(good);
        commentservice.insert(comment);

        inventory.setInventoryNum(Integer.parseInt(inventoryNum));
        inventory.setDate(time);
        inventory.setGood(good);
        inventoryService.insert(inventory);

        price.setDate(time);
        price.setSellPrice(Float.parseFloat(sellPrice));
        price.setShopPrice(Float.parseFloat(shopPrice));
        price.setGood(good);
        priceservice.insert(price);

        sell.setDate(time);
        sell.setSellNum(Integer.parseInt(sellNum));
        sell.setGood(good);
        sellService.insert(sell);
        return "redirect:/data/goodList";
    }

    /*更新商品自然排名,总销量*/
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String updateGood(@RequestParam(value = "asin",required = true)String asin,
                        @RequestParam(value = "rankNum",required = true)String rankNum,
                        @RequestParam(value = "totalSellNum",required = true)String totalSellNum,

                          @RequestParam(value = "bsrNum",required = true)String bsrNum,
                          @RequestParam(value = "commentScore",required = true) String commentScore,
                          @RequestParam(value = "totalCommentNum",required = true)String totalCommentNum,
                          @RequestParam(value = "fiveStar",required = true)String fiveStar,
                          @RequestParam(value = "fourStar",required = true) String fourStar,
                          @RequestParam(value = "threeStar",required = true)String threeStar,
                          @RequestParam(value = "twoStar",required = true) String twoStar,
                          @RequestParam(value = "oneStar",required = true)String oneStar,

                          @RequestParam(value = "inventoryNum",required = true) String inventoryNum,
                          @RequestParam(value = "sellPrice",required = true)String sellPrice,
                          @RequestParam(value = "shopPrice",required = true)String shopPrice,
                          @RequestParam(value = "sellNum",required = true) String sellNum ) {
        Good good=new Good();
        Bsr bsr =new Bsr();
        Comment comment=new Comment();
        Inventory inventory=new Inventory();
        Price price=new Price();
        Sell sell=new Sell();

        Date time= new java.sql.Date(new java.util.Date().getTime());
        int goodId=Integer.parseInt(goodService.findGoodIdByAsin(asin));
        good.setRankNum(Integer.parseInt(rankNum));
        good.setTotalSellNum(Integer.parseInt(totalSellNum));
        good.setGoodId(goodId);
        goodService.update(good);

        bsr.setBsrNum(Integer.parseInt(bsrNum));
        bsr.setDate(time);
        bsr.setGood(good);
        bsrservice.insert(bsr);

        comment.setDate(time);
        comment.setCommentScore(Float.parseFloat(commentScore));
        comment.setFiveStar(fiveStar);
        comment.setFourStar(fourStar);
        comment.setThreeStar(threeStar);
        comment.setTwoStar(twoStar);
        comment.setOneStar(oneStar);
        comment.setTotalCommentNum(Integer.parseInt(totalCommentNum));
        comment.setGood(good);
        commentservice.insert(comment);

        inventory.setInventoryNum(Integer.parseInt(inventoryNum));
        inventory.setDate(time);
        inventory.setGood(good);
        inventoryService.insert(inventory);

        price.setDate(time);
        price.setSellPrice(Float.parseFloat(sellPrice));
        price.setShopPrice(Float.parseFloat(shopPrice));
        price.setGood(good);
        priceservice.insert(price);

        sell.setDate(time);
        sell.setSellNum(Integer.parseInt(sellNum));
        sell.setGood(good);
        sellService.insert(sell);
        return "redirect:/data/goodList";
    }

    @RequestMapping("competitor")
    public String competitor(Model model){
        List<Good>goodList=goodService.getAll();
        model.addAttribute("goodList",goodList);
        return "competitor";
    }

    @RequestMapping("competitorList")
    public String competitorList(Model model){
        List<Good>goodList=goodService.getAll();
        model.addAttribute("goodList",goodList);
        return "competitorList";
    }

    @RequestMapping("competitorDetail")
    public String competitorDetail(@RequestParam String asin,Model model){
        Good good =goodService.findGoodByAsin(asin);
        model.addAttribute("good",good);

        List<Price> priceList=priceservice.findPriceByGoodId(good.getGoodId());
        Price price =priceList.get(priceList.size()-1);
        model.addAttribute("priceList",priceList);
        model.addAttribute("price",price);

        List<Sell> sellList=sellService.findSellByGoodId(good.getGoodId());
        Sell sell =sellList.get(sellList.size()-1);
        model.addAttribute("sellList",sellList);
        model.addAttribute("sell",sell);

        List<Bsr> bsrList=bsrservice.findBsrByGoodId(good.getGoodId());
        Bsr bsr =bsrList.get(bsrList.size()-1);
        model.addAttribute("bsrList",bsrList);
        model.addAttribute("bsr",bsr);

        List<Comment> commentList=commentservice.findCommentByGoodId(good.getGoodId());
        Comment comment =commentList.get(commentList.size()-1);
        model.addAttribute("commentList",commentList);
        model.addAttribute("comment",comment);

        List<Inventory> inventoryList=inventoryService.findInventoryByGoodId(good.getGoodId());
        Inventory inventory =inventoryList.get(inventoryList.size()-1);
        model.addAttribute("inventoryList",inventoryList);
        model.addAttribute("inventory",inventory);
        return "competitorDetail";
    }
}
