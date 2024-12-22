package com.learning.open_closed.wrongImpl;

import com.learning.single_responsibility.correctImpl.Invoice;

public class InvoiceDao {
    Invoice invoice;
//this follows single responsibility principle.
//    it has one reason to change. that is saving invoice to db/ file.
    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB(){
        //save into  to db
    }

    // i want to save in file as well >> requirement
    // but the above code already tested and live . so if i add method here in this class.
//   then it violates open closed prinnciple >> this says open for extension closed for modification

    public void saveToFile(String fileName){
        //save invoice in file.
    }
//    this is wrong impl
 // bcs it promos to bugs bcs we're adding method saveToFIle inside already tested class InvoiceDao
}
