package com.bitcamp.web.serviceImpl;

import java.util.List;

import com.bitcamp.web.common.util.PageProxy;
import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.service.CustomerService;

import org.springframework.stereotype.Service;

/**
 * CustomerServiceImpl
 */
@Service
public class CustomerServiceImpl implements CustomerService{


    @Override
    public void addCustomer(CustomerDTO customer) {
       
    }

    @Override
    public List<CustomerDTO> findCustomers(PageProxy pxy) {
        return null;
    }

    @Override
    public List<CustomerDTO> findCustomersByOption(CustomerDTO option) {
        return null;
    }

    @Override
    public CustomerDTO findCustomerByCustomerId(String customerId) {
        return null;
    }

    @Override
    public int updateCustomer(CustomerDTO customer) {
        
        int res = 0;
        if(res == 1){
            System.out.println("서비스 수정성공");
        }else{
            System.out.println("서비스 수정실패");
        }
        return res;
    }

    @Override
    public void deleteCustomer(CustomerDTO customer) {
       
    }

    @Override
    public int countAll() {
        return 0;
    }

    @Override
    public CustomerDTO login(CustomerDTO customer) {
        System.out.println("컨트롤러에서 넘어온 ID: "+customer.getCustomerId());
        System.out.println("컨트롤러에서 넘어온 PASS: "+customer.getPassword());
        return null;
    }
}