package com.c360.hbase.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.hadoop.hbase.HbaseTemplate;
import org.springframework.stereotype.Service;

import com.c360.hbase.model.Quote;

@Service
public class HBasePymt {

	@Autowired
	private HbaseTemplate hbaseTemplate;
	
//	@PostConstruct
//    public void test(){
//        Quote quote = new Quote();
//        quote.setName("anurag");
//    }

    public void saveQuote() {
    	hbaseTemplate.put("c360.sample", "2", "s", "name", "anurag".getBytes());

}
}