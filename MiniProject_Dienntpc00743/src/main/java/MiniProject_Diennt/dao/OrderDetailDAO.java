package MiniProject_Diennt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import MiniProject_Diennt.entity.OrderDetail;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, String>{}
