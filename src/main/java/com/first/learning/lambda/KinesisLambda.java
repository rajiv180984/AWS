package com.first.learning.lambda;

import java.util.HashMap;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.api.PutItemApi;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.KinesisEvent;
import com.amazonaws.services.lambda.runtime.events.KinesisEvent.KinesisEventRecord;
import com.first.learning.AWS.Machine;
import com.google.gson.Gson;

public class KinesisLambda implements RequestHandler<KinesisEvent, String> {
  private String tableName ="ZeroxMachine";
  Gson gson = new Gson();
	public String handleRequest(KinesisEvent event, Context context) {
		try {
			
	     final DynamoDB clientDynamo = new DynamoDB(AmazonDynamoDBClientBuilder.defaultClient());
	     Table dTable = clientDynamo.getTable(tableName);
	     String data = null;
	     Machine machine = null;
	     HashMap<String,AttributeValue> item_values =
	    		    new HashMap<String,AttributeValue>();
		for (KinesisEventRecord rec : event.getRecords()) {
			data = new String(rec.getKinesis().getData().array());
			System.out.println(data);
			machine = gson.fromJson(data, Machine.class);
			
			Item item = new Item().withPrimaryKey("id", machine.getId())
                    .withString("machineName", machine.getName());
                    
			dTable.putItem(item);
			System.out.println("========= SAVED ===============");
			
		}
		}catch (Exception e) {
			
				e.printStackTrace();
				
		}
		return "SUCCESS";
	}

}
