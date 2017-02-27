package my.web.tag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

/**
 * Created by free on 17-2-27.
 */
public class Viewip extends TagSupport {

    private String iptest;

    public void setIptest(String iptest) {
        this.iptest = iptest;
    }

    @Override
    public int doStartTag() throws JspException {
        HttpServletRequest request= (HttpServletRequest) this.pageContext.getRequest();
        JspWriter out=this.pageContext.getOut();
        try {
            out.write(request.getRemoteAddr());
        } catch (IOException e) {
            e.printStackTrace();
            throw new JspException("parse error !!!");
        }
        return super.doStartTag();
    }


}
