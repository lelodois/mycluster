package com.mycluster.sales;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.List;
import org.apache.hc.client5.http.fluent.Request;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
class CustomerSource {

    public List<Customer> findAll() throws IOException {
        String customerUrl = "http://localhost:8080/customers";
        String response = Request.get(customerUrl)
                .execute()
                .returnContent()
                .asString();
        return new Gson().fromJson(
                response,
                new TypeToken<List<Customer>>() {
                }.getType());
    }
}