package my.web.tag.el;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.jstl.core.LoopTagStatus;
import javax.servlet.jsp.tagext.TagSupport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by free on 17-2-28.
 */
public class TestIndex extends TagSupport  {

    private String indexStatus;

    private int index;

    private LoopTagStatus loopTagStatus;

    private Collection collection;
    private Iterator iterator;

    private String var;

    private Object item;

    private int size=0;

    public TestIndex(){
        System.out.println(" init ................... ");
        collection=new ArrayList(0);
        index=0;
    }

    public void setVarOperation(String indexStatus){
        this.indexStatus=indexStatus;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public void setCollection(Object o){
        if (o instanceof  Collection){
            collection= (Collection) o;
        }
    }


    @Override
    public int doStartTag() throws JspException {
        loopTagStatus=new Operation();
        index=size;
        iterator = collection.iterator();


        if (!hasNext()){
            return SKIP_BODY;
        }
        item=next();
        return EVAL_BODY_INCLUDE;
    }



    @Override
    public int doAfterBody() throws JspException {

        if(hasNext()){

            this.pageContext.setAttribute(var,item);
            this.pageContext.setAttribute(indexStatus,loopTagStatus);
            index++;
            item=next();
            return EVAL_BODY_AGAIN;
        }
        return SKIP_BODY;
    }

    private boolean hasNext() {
        return iterator.hasNext();
    }

    private Object next(){
        return iterator.next();
    }


    private class Operation implements LoopTagStatus {

        @Override
        public Object getCurrent() {
            return null;
        }

        @Override
        public int getIndex() {
            System.out.println(index);
            return index;
        }

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public boolean isFirst() {
            return false;
        }

        @Override
        public boolean isLast() {
            return false;
        }

        @Override
        public Integer getBegin() {
            return null;
        }

        @Override
        public Integer getEnd() {
            return null;
        }

        @Override
        public Integer getStep() {
            return null;
        }
    }
}
