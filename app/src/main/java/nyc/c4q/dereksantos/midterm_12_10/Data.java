package nyc.c4q.dereksantos.midterm_12_10;

import java.util.List;

/**
 * Created by SACC on 12/10/16.
 */

public class Data
{
    private String nextPage;

    private String count;

    private String backAnchor;

    private String anchorStr;

    private List<Record> records;

    private Object previousPage;

    private String size;

    private String anchor;

    public String getNextPage ()
    {
        return nextPage;
    }

    public void setNextPage (String nextPage)
    {
        this.nextPage = nextPage;
    }

    public String getCount ()
    {
        return count;
    }

    public void setCount (String count)
    {
        this.count = count;
    }

    public String getBackAnchor ()
    {
        return backAnchor;
    }

    public void setBackAnchor (String backAnchor)
    {
        this.backAnchor = backAnchor;
    }

    public String getAnchorStr ()
    {
        return anchorStr;
    }

    public void setAnchorStr (String anchorStr)
    {
        this.anchorStr = anchorStr;
    }

    public List<Record> getRecords ()
    {
        return records;
    }

    public void setRecords (List<Record> records)
    {
        this.records = records;
    }

    public Object getPreviousPage ()
{
    return previousPage;
}

    public void setPreviousPage (Object previousPage)
    {
        this.previousPage = previousPage;
    }

    public String getSize ()
    {
        return size;
    }

    public void setSize (String size)
    {
        this.size = size;
    }

    public String getAnchor ()
    {
        return anchor;
    }

    public void setAnchor (String anchor)
    {
        this.anchor = anchor;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [nextPage = "+nextPage+", count = "+count+", backAnchor = "+backAnchor+", anchorStr = "+anchorStr+", records = "+records+", previousPage = "+previousPage+", size = "+size+", anchor = "+anchor+"]";
    }
}
