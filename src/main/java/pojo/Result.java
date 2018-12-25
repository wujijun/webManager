package main.java.pojo;

import java.util.List;

public class Result {
    private List<?> lists;
    private int pageNo;
    private int pageSize;
    private String pageView;  //每页的条数
    private int maxPage;     //最大页数
    private int countSize;    //总的条数
    private String url;

    public void setUrl(String url){
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
        }

        if (pageNo ==maxPage){
            str.append(" <li class='page'><a href='javascript:void(0)'>下一页</a></li> ");
            str.append(" <li class='page'><a href='javascript:void(0)'>尾页</a></li> ");
        }else {
            str.append(" <li class='page'><a href='"+url+"?pageNo="+(pageNo+1)+"'>下一页</a></li> ");
            str.append(" <li class='page'><a href='"+url+"?pageNo="+maxPage+"'>尾页</a></li> ");

        }
        this.pageView = str.toString();
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
