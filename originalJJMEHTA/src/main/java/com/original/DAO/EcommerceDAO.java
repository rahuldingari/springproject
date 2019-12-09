package com.original.DAO;

import java.util.List;

import com.original.pojo.SubData;










public interface EcommerceDAO {


	public List<SubData> listProducts(int prod_id);

	public List<SubData> listDesign(String prod_list);


}
