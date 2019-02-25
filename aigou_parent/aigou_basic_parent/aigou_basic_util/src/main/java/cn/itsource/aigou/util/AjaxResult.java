package cn.itsource.aigou.util;
//修改相关代码来达到链试编程
public class AjaxResult {
    private boolean success=true;//默认操作是成功
    private String msg="操作成功";//返回的文本字符串信息
    private Object object;//对象值:供我们在返回前台的时候，可以返回一个对象

    /*
    以前的：
    失败返回的AjaxResult
    public AjaxResult(String msg) {
        this.success=false;
        this.msg = msg;
    }
    成功返回的AjaxResult
    public AjaxResult() {
    }*/

    public static AjaxResult me() {
        return new AjaxResult();
    }

    public boolean isSuccess() {
        return success;
    }


    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }

    public static void main(String[] args) {
        //链式编程
        AjaxResult ajaxResult = AjaxResult.me().setSuccess(true).setMsg("测试").setObject("对象");
        System.out.println(ajaxResult);
    }
}
