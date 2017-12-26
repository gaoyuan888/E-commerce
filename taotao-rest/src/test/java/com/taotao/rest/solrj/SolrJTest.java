//package com.taotao.rest.solrj;
//
//import org.apache.solr.client.solrj.SolrQuery;
//import org.apache.solr.client.solrj.SolrServer;
//import org.apache.solr.client.solrj.impl.HttpSolrServer;
//import org.apache.solr.client.solrj.response.QueryResponse;
//import org.apache.solr.common.SolrDocument;
//import org.apache.solr.common.SolrDocumentList;
//import org.apache.solr.common.SolrInputDocument;
//import org.junit.Test;
//
//public class SolrJTest {
//	@Test
//	public void addDocument() throws Exception{
//		SolrServer solrServer = new HttpSolrServer("http://192.168.226.136:8080/solr");
//		SolrInputDocument document=new SolrInputDocument();
//		document.addField("id", "test001");
//		document.addField("item_title", "测试商品1");
//		document.addField("item_price", 12345);
//		solrServer.add(document);
//	}
//	 
//	@Test
//	public void deleteById() throws Exception{
//		SolrServer solrServer = new HttpSolrServer("http://192.168.226.136:8080/solr");
////		solrServer.deleteById("test001");
////		solrServer.deleteById(ids)
//		solrServer.deleteByQuery("*:*");
//		solrServer.commit();
//	}
//	
//	@Test
//	public void queryDocument()throws Exception{
//		SolrServer solrServer = new HttpSolrServer("http://192.168.226.136:8080/solr");
//		SolrQuery query=new SolrQuery();
//		query.setQuery("*:*");
//		query.setStart(20);
//		query.setStart(40);
//		QueryResponse response=solrServer.query(query);
//		SolrDocumentList results = response.getResults();
//		System.out.println("共有记录："+results.getNumFound());
//		for (SolrDocument solrDocument : results) {
//			System.out.println(solrDocument.get("id"));
//			System.out.println(solrDocument.get("item_title"));
//			System.out.println(solrDocument.get("item_price"));
//			System.out.println(solrDocument.get("item_image"));
//		}
//	}
//}
