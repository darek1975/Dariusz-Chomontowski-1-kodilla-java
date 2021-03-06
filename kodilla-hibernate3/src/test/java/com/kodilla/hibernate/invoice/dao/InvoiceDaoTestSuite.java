package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Item item1 = new Item(new BigDecimal("5.9"), 10);
        Item item2 = new Item(new BigDecimal("7.9"), 15);
        Item item3 = new Item(new BigDecimal("18.9"), 8);

        Product product1 = new Product("Product1");
        Product product2 = new Product("Product2");
        product1.getItems().add(item1);
        product1.getItems().add(item2);
        product2.getItems().add(item3);
        item1.setProduct(product1);
        item2.setProduct(product1);
        item3.setProduct(product2);

        Invoice invoice = new Invoice("1/2019");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        int itemsSize = invoice.getItems().size();

        //Then
        Assert.assertNotEquals(0, invoiceId);
        Assert.assertEquals(3, itemsSize);
        Assert.assertEquals(1, invoiceDao.count());

        //CleanUp
        invoiceDao.deleteById(invoiceId);
    }
}
