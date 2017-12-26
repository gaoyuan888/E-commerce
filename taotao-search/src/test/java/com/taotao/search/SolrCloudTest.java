package com.taotao.search;

import org.apache.solr.client.solrj.impl.CloudSolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

public class SolrCloudTest {

	@Test
	public void testAddDocument()throws Exception{
		//创建一个链接
		//参数就是zookeeper的地址列表，使用，分割
		String zkHost="192.168.80.131:2181,192.168.80.131:2182,192.168.80.131:2183";
		CloudSolrServer solrServer=new CloudSolrServer(zkHost);
		//设置默认的collection
		solrServer.setDefaultCollection("collection2");
		//创建一个文档对象
		SolrInputDocument document=new SolrInputDocument();
		//像文档中添加域
		document.addField("id", "test_001");
		document.addField("item_title", "测试商品");
//		把文档添加到索引库
		solrServer.add(document);
//		提交
		solrServer.commit();
	}
	
	@Test
	public void testDelDocument()throws Exception{
		//创建一个链接
		//参数就是zookeeper的地址列表，使用，分割
		String zkHost="192.168.80.131:2181,192.168.80.131:2182,192.168.80.131:2183";
		CloudSolrServer solrServer=new CloudSolrServer(zkHost);
		//设置默认的collection
		solrServer.setDefaultCollection("collection2");
		//创建一个文档对象
		solrServer.deleteByQuery("*:*");
//		提交
		solrServer.commit();
	}
}
