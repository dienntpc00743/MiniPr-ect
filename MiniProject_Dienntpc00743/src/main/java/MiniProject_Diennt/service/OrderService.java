package MiniProject_Diennt.service;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

import MiniProject_Diennt.entity.Order;
import MiniProject_Diennt.entity.Product;

public interface OrderService {

	Order create(JsonNode orderData);

	Order findById(Long id);

	List<Order> findByUsername(String username);

}
