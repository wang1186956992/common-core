package common.page;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Created by xuejike on 2015/11/12.
 */
public class Page<T> {

    private List<T> list;
    private int pageCurrent = 1;
    private int pageSize = 30;
    private Long total = 0L;
    private int pageCount = 0;
    private Float avgScore = 0.0F;

    @JSONField(name = "rows")
    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }


    public int getPageCurrent() {
        return pageCurrent;
    }

    public void setPageCurrent(int pageCurrent) {
        this.pageCurrent = pageCurrent;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Float getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(Float avgScore) {
        this.avgScore = avgScore;
    }

    public int getPageCount() {
        if (this.total != null && this.pageSize != 0) {
            if ((long) this.pageSize >= this.total) {
                this.pageCount = 1;
                return this.pageCount;
            } else {
                if (this.pageCount == 0 && this.total > 0L && this.pageSize > 0) {
                    this.pageCount = (int) (this.total / (long) this.pageSize);
                    if (this.total % (long) this.pageSize != 0L) {
                        ++this.pageCount;
                    }
                }

                return this.pageCount;
            }
        } else {
            return 0;
        }
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
