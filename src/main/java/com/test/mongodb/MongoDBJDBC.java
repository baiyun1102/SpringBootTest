package com.test.mongodb;

/**
 * ClassName ： TestController
 * @author xdcui
 * 创建于 2018年5月3日 下午5:40:45
 * 说明：
 */
public class MongoDBJDBC{
	public static void main( String args[] ){/*
		   MongoClient mongoClient = null;
	      try{   
	       // 连接到 mongodb 服务
	         mongoClient = new MongoClient( "localhost" , 27017 );
	       
	         // 连接到数据库
	         MongoDatabase mongoDatabase = mongoClient.getDatabase("test");  
	       System.out.println("Connect to database successfully");
	       
	       MongoCollection<Document> collection = mongoDatabase.getCollection("runoob");
	       System.out.println("集合 runoob 选择成功");
	       
	       //检索所有文档  
	         *//** 
	         * 1. 获取迭代器FindIterable<Document> 
	         * 2. 获取游标MongoCursor<Document> 
	         * 3. 通过游标遍历检索出的文档集合 
	         * *//*
	         FindIterable<Document> findIterable = collection.find();  
	         MongoCursor<Document> mongoCursor = findIterable.iterator();  
	         while(mongoCursor.hasNext()){  
	            System.out.println(mongoCursor.next());  
	         }  
	         
	         
	        
	      }catch(Exception e){
	        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	     }finally {
			if(mongoClient!=null) {
				mongoClient.close();
			}
		}
	   */}
	}