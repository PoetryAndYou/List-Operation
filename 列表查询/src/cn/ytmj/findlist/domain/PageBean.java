package cn.ytmj.findlist.domain;

import java.util.List;

/**
 * @author rui
 * @create 2019-08-17 23:34
 * 分页对象
 */
public class PageBean<T> {
    private int totalCount;  //总记录数
    private int  totalPage; // 总页数
    private List<T> list;   //每页的数据list集合
    private int currentPage; //当前页码
    private int rows; //每页显示的条数
    public PageBean(){}

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "totalCount=" + totalCount +
                ", totalPage=" + totalPage +
                ", list=" + list +
                ", currentPage=" + currentPage +
                ", rows=" + rows +
                '}';
    }
}
