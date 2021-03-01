package chouchou.httpclient.demo;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class MyHttpClient {
    @Test
    public void test1() throws IOException {
        //用来存放我们的结果
        String result;
        HttpGet get=new HttpGet("http://www.baidu.com");
        //用来执行get方法
        HttpClient client=new DefaultHttpClient();
        HttpResponse response=client.execute(get);
        result=EntityUtils.toString(response.getEntity(),"UTF-8");
        System.out.println(result);
    }
}
