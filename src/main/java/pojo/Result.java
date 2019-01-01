package pojo;

import java.util.List;

public class Result {
    private List<?> lists;
    private int pageNo;
    private int pageSize;

    private String pageView;  //每页的条数
    private int maxPage;     //最大页数
    private int countSize;    //总的条数
    private String url;

    public void setUrl(String url, String params) {
        System.out.println(params);
        this.url = url;
        StringBuilder strb = new StringBuilder();
        if (pageNo == 1) {
            strb.append("<li class='page'><a href='javascript:void(0)" + params + "' >首页</a></li>");
            strb.append("<li class='page'><a href='javascript:void(0)" + params + "' >上一页</a></li>");
        } else {
            strb.append("<li class='page'><a href='" + url + "?pageNo=1" + params + "' >首页</a></li>");
            strb.append("<li class='page'><a href='" + url + "?pageNo=" + (pageNo - 1) + "" + params + "'>上一页</a></li>");
        }


        int min = pageNo - 2;

        if (min <= 0) {
            min = 1;
            int max = min + 4;
            if (max > maxPage) {
                max = maxPage;
            }
            for (int i = min; i <= max; i++) {
                if (i == pageNo) {
                    strb.append("<li><a href='javascript:void(0)" + params + "' >" + i + "</a></li>");
                } else {
                    strb.append("<li><a href='" + url + "?pageNo=" + i + "" + params + "'>" + i + "</a></li>");
                }
            }
        } else {
            int max = min + 4;
            if (max > maxPage) {
                max = maxPage;
                min = max - 4;
                if (min <= 0) {
                    min = 1;
                }
            }
            for (int i = min; i <= max; i++) {
                if (i == pageNo) {
                    strb.append("<li><a href='javascript:void(0)" + params + "' >" + i + "</a></li>");
                } else {
                    strb.append("<li><a href='" + url + "?pageNo=" + i + "" + params + "'>" + i + "</a></li>");
                }
            }
        }






    /*public void setUrl(String url){
        this.url = url;
        StringBuilder str = new StringBuilder();
        if (pageNo ==1){
            str.append(" <li class='page'><a href='javascript:void(0)'>首页</a></li> ");
            str.append(" <li class='page'><a href='javascript:void(0)'>上一页</a></li> ");
        }else {
            str.append(" <li class='page'><a href='"+url+"?pageNo=1'>首页</a></li> ");
            str.append(" <li class='page'><a href='"+url+"?pageNo="+(pageNo-1)+"'>上一页</a></li> ");
        }

        for (int i =1;i <= maxPage; i ++){
            if (i==pageNo){
                str.append(" <li class='page'><a href='javascript:void(0)'>"+i+"</a></li> ");
            }
            else {
                str.append(" <li class='page'><a href='"+url+"?pageNo="+i+"'>"+i+"</a></li> ");
            }
        }*/


        if(pageNo==maxPage){
            strb.append("<li class='page'><a href='javascript:void(0)"+params+"'>下一页</a></li>");
            strb.append("<li class='page'><a href='javascript:void(0)"+params+"'>尾页</a></li>");
        }else{
            strb.append("<li class='page'><a href='"+url+"?pageNo="+(pageNo+1)+""+params+"'>下一页</a></li>");
            strb.append("<li class='page'><a href='"+url+"?pageNo="+(maxPage)+""+params+"'>尾页</a></li>");
        }
        this.pageView=strb.toString();
    }



    public String getPageView(){
             return pageView;
        }


    public Result(int pageNo, int pageSize, int countSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.countSize = countSize;
        this.maxPage=countSize/pageSize==0?countSize/pageSize:countSize/pageSize+1;
    }

    public List<?> getLists() {
        return lists;
    }

    public void setLists(List<?> lists) {
        this.lists = lists;
    }
}
