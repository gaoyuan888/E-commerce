//package com.taotao.httpclient;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.http.HttpEntity;
//import org.apache.http.NameValuePair;
//import org.apache.http.client.entity.UrlEncodedFormEntity;
//import org.apache.http.client.methods.CloseableHttpResponse;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.client.utils.URIBuilder;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.message.BasicNameValuePair;
//import org.apache.http.util.EntityUtils;
//import org.junit.Test;
//
//public class HttpclientTest {
//	@Test
//	public void doGet() throws Exception{
//		CloseableHttpClient httpclient = HttpClients.createDefault();
//		HttpGet httpGet = new HttpGet("http://www.sogou.com");
////		HttpGet httpGet = new HttpGet("http://localhost:8081/rest/content/list/89");
//		CloseableHttpResponse response1 = httpclient.execute(httpGet);
//		//响应状态码
//		System.out.println(response1.getStatusLine().getStatusCode());
//		try {
//		    System.out.println(response1.getStatusLine());
//		    HttpEntity entity1 = response1.getEntity();
////		    EntityUtils.consume(entity1);
//		    String result=EntityUtils.toString(entity1,"utf-8");
//		    System.out.println(result);
//		} finally {
//		    response1.close();
//		    httpclient.close();
//		}
//	}
//	
//	@Test
//	public void doGetWithParam() throws Exception{
//		CloseableHttpClient httpclient = HttpClients.createDefault();
//		URIBuilder uriBuilder=new URIBuilder("http://www.sogou.com/web");
//		uriBuilder.addParameter("query", "花千骨");
//		HttpGet httpGet = new HttpGet(uriBuilder.build());
//		CloseableHttpResponse response1 = httpclient.execute(httpGet);
//		//响应状态码
//		System.out.println(response1.getStatusLine().getStatusCode());
//		try {
//		    System.out.println(response1.getStatusLine());
//		    HttpEntity entity1 = response1.getEntity();
////		    EntityUtils.consume(entity1);
//		    String result=EntityUtils.toString(entity1,"utf-8");
//		    System.out.println(result);
//		} finally {
//		    response1.close();
//		    httpclient.close();
//		}
//		
//	}
//	
//	@Test
//	public void doPost() throws Exception{
//		CloseableHttpClient httpclient = HttpClients.createDefault();
//		HttpPost httpPost = new HttpPost("http://localhost:8082/httpclient/post.action");
//		CloseableHttpResponse response2 = httpclient.execute(httpPost);
//		String string = EntityUtils.toString(response2.getEntity());
//	    System.out.println(string);
//	    response2.close();
//	    httpclient.close();  
//	}
//     
//	@Test
//	public void doPostWithParam() throws Exception{
//		CloseableHttpClient httpclient = HttpClients.createDefault();
//		HttpPost httpPost = new HttpPost("http://localhost:8082/httpclient/post.action");
//		List <NameValuePair> nvps = new ArrayList <NameValuePair>();
//		nvps.add(new BasicNameValuePair("username", "张三"));
//		nvps.add(new BasicNameValuePair("password", "secret"));
//		httpPost.setEntity(new UrlEncodedFormEntity(nvps,"utf-8"));
//		CloseableHttpResponse response2 = httpclient.execute(httpPost);
//		try {
//		    System.out.println(response2.getStatusLine());
//		    HttpEntity entity2 = response2.getEntity();
//		    System.out.println(EntityUtils.toString(entity2));
//		    // do something useful with the response body
//		    // and ensure it is fully consumed
//		    EntityUtils.consume(entity2);
//		} finally {
//		    response2.close();
//		}
//	}
//}
