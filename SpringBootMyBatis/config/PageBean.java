package top.huhuiyu.springboot.projects.util;

import java.io.Serializable;

import com.github.pagehelper.Page;

public class PageBean implements Serializable {

  private static final long serialVersionUID = -2047703337735760044L;
  private int total;
  private int pageNumber;
  private int pageSize = 5;
  private int pageCount;

  public PageBean() {
  }

  public PageBean setPageInfo(Page<?> page) {
    total = (int) page.getTotal();
    pageCount = page.getPages();
    pageNumber = page.getPageNum();
    pageSize = page.getPageSize();
    return this;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  public int getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(int pageNumber) {
    this.pageNumber = pageNumber;
  }

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public int getPageCount() {
    return pageCount;
  }

  public void setPageCount(int pageCount) {
    this.pageCount = pageCount;
  }

  @Override
  public String toString() {
    return "PageBean [total=" + total + ", pageNumber=" + pageNumber + ", pageSize=" + pageSize + ", pageCount="
        + pageCount + "]";
  }

}
