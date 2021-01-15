package com.jjpp.student.logstudent;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.context.WebApplicationContext;

import java.net.URI;

@AutoConfigureMockMvc
@SpringBootTest
class LogstudentApplicationTests {
    @Autowired
    private MockMvc mockMvc;

    private MockHttpSession session;

    @BeforeEach
    public void setMockMvc(){
//        session = new MockHttpSession();
    }


    @Test
    @Order(1)
    void contextLoads() throws Exception {
        OkHttpClient client = new OkHttpClient();
        Request req = new Request.Builder().url("http://localhost:8080/bless").get().build();
        Response response = client.newCall(req).execute();
        System.out.println(response.code());
        System.out.println(response.body());

//        MvcResult mvcResult = (MvcResult) mockMvc.perform(MockMvcRequestBuilders.get("/bless")
//                        .accept(MediaType.ALL)
//                        .session(session)
                        //这里要特别注意和content传参数的不同，具体看你接口接受的是哪种
//                        .param("userName",info.getUserName()).param("password",info.getPassword())
                //传json参数,最后传的形式是 Body = {"password":"admin","userName":"admin"}
                //.content(JSON.toJSON(info).toString().getBytes())
//        )
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andDo(MockMvcResultHandlers.print())
//                .andReturn();

        //得到返回代码
//        int status = mvcResult.getResponse().getStatus();
        //得到返回结果
//        String content = mvcResult.getResponse().getContentAsString();
//        System.out.println(status);
//        System.out.println(content);
    }

}
