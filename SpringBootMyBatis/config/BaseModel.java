package top.huhuiyu.springboot.projects.model;

import java.io.Serializable;

import top.huhuiyu.springboot.projects.util.PageBean;

public abstract class BaseModel implements Serializable {
  private static final long serialVersionUID = -137055849508844216L;
  private PageBean page = new PageBean();

  public PageBean getPage() {
    return page;
  }

  public void setPage(PageBean page) {
    this.page = page;
  }

  @Override
  public String toString() {
    return "BaseModel [page=" + page + "]";
  }

}
